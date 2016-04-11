package com.lucgu.tugaskriptografi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DecryptActivity extends AppCompatActivity {

    private Button btDecrypt;
    private TextView tvPlaintext;
    private EditText etKey;
    private EditText etChippertext;

    private int key;
    private String chipperText;
    private ArrayList<String> plaintext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypt);
        assignXML();
        btDecrypt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (etChippertext.length() == 0 || etKey.length() == 0)
                {
                    Toast.makeText(DecryptActivity.this, "Field input is empty", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    decrypt();
                }
            }
        });
    }

    public void assignXML()
    {
        btDecrypt = (Button) findViewById(R.id.bt_decrypt);
        tvPlaintext = (TextView) findViewById(R.id.tv_plaintext);
        etKey = (EditText) findViewById(R.id.et_key);
        etChippertext = (EditText) findViewById(R.id.et_chippertext);
    }

    public void decrypt()
    {
        key = Integer.parseInt(etKey.getText().toString());
        chipperText = etChippertext.getText().toString();
        plaintext  = new ArrayList<>();

        if (key < chipperText.length())
        {
            if (chipperText.length() % key == 0)
            {
                int row = key;
                int coloumn = chipperText.length() / key;

                String[] temp = chipperText.split("");
                int parseHelper = 1;

                String[][] tempMatrix = new String[row][coloumn];
                for (int r = 0; r < tempMatrix.length; r++) {
                    for (int c = 0; c < tempMatrix[r].length; c++) {
                        tempMatrix[r][c] = temp[parseHelper];
                        Log.i("Hasil", " " + r + "," + c + " " + tempMatrix[r][c].toString());
                        parseHelper++;
                    }
                }

                String[][] hasil;
                hasil = transposeMatrix(tempMatrix);

                for (int r = 0; r < hasil.length; r++) {
                    for (int c = 0; c < hasil[r].length; c++) {
                        Log.i("Hasil", " " + r + "," + c + " " + hasil[r][c].toString());
                        plaintext.add(hasil[r][c]);
                    }
                }

                tvPlaintext.setText(plaintext.toString().replace("[", "").replace("]", "").replace(",", ""));
            }
            else
            {
                Toast.makeText(DecryptActivity.this,"Cannot decrypt!", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(DecryptActivity.this,"Cannot decrypt!", Toast.LENGTH_SHORT).show();
        }
    }

    public static String[][] transposeMatrix(String [][] m)
    {
        String[][] temp = new String[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[0].length; j++) {
                temp[j][i] = m[i][j];
            }
        }
        return temp;
    }
}
