package com.lucgu.tugaskriptografi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    private Button btChooseEncrypt;
    private Button btChooseDecrypt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btChooseEncrypt = (Button) findViewById(R.id.bt_choose_encrypt);
        btChooseDecrypt = (Button) findViewById(R.id.bt_choose_decrypt);

        btChooseEncrypt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, EncryptActivity.class);
                startActivity(intent);
            }
        });

        btChooseDecrypt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, DecryptActivity.class);
                startActivity(intent);
            }
        });

    }
}
