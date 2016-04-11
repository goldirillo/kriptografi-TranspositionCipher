package com.lucgu.tugaskriptografi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class EncryptActivity extends AppCompatActivity
{

    private EditText etPlaintext;
    private EditText etKey;
    private TextView tvChipperText;
    private Button btEncrypt;

    private int key;
    private String plaintext;
    private ArrayList<String> chipperText;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrypt);
        assignXML();
        btEncrypt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (etPlaintext.length() == 0 || etKey.length() == 0)
                {
                    Toast.makeText(EncryptActivity.this, "Field input is empty", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    encrypt();
                }

            }
        });
    }

    public void assignXML()
    {
        etPlaintext = (EditText) findViewById(R.id.et_plaintext);
        etKey = (EditText) findViewById(R.id.et_key);
        tvChipperText = (TextView) findViewById(R.id.tv_chippertext);
        btEncrypt = (Button) findViewById(R.id.bt_encrypt);
    }

    public void encrypt()
    {
        key = Integer.parseInt(etKey.getText().toString());
        plaintext = etPlaintext.getText().toString().replace(" ","");
        chipperText = new ArrayList<>();

        if (key < plaintext.length())
        {
            if (plaintext.length() % key == 0)
            {
                int row = plaintext.length() / key;
                int coloumn = key;

                String[] temp = plaintext.split("");
                int parseHelper = 1;

                String[][] tempMatrix = new String[row][coloumn];
                for (int r=0; r<tempMatrix.length; r++)
                {
                    for (int c=0; c<tempMatrix[r].length; c++)
                    {
                        tempMatrix[r][c] = temp[parseHelper];
                        Log.i("Hasil", " " + r +"," + c + " " + tempMatrix[r][c].toString());
                        parseHelper++;
                    }
                }

                String[][] hasil;
                hasil = transposeMatrix(tempMatrix);

                for (int r=0; r<hasil.length; r++)
                {
                    for (int c=0; c<hasil[r].length; c++)
                    {
                        Log.i("Hasil", " " + r +"," + c + " " + hasil[r][c].toString());
                        chipperText.add(hasil[r][c]);
                    }
                }
                tvChipperText.setText(chipperText.toString().replace("[","").replace("]","").replace(",",""));
            }
            else
            {
                int insertAdder = key - (plaintext.length() % key);
                for (int i=1 ; i <= insertAdder; i++ )
                {
                    plaintext += "a";
                }
                Log.i("plaintext : ", plaintext);
                int row = plaintext.length() / key;
                int coloumn = key;

                String[] temp = plaintext.split("");
                int parseHelper = 1;

                String[][] tempMatrix = new String[row][coloumn];
                for (int r=0; r<tempMatrix.length; r++)
                {
                    for (int c=0; c<tempMatrix[r].length; c++)
                    {
                        tempMatrix[r][c] = temp[parseHelper];
                        Log.i("Hasil", " " + r +"," + c + " " + tempMatrix[r][c].toString());
                        parseHelper++;
                    }
                }

                String[][] hasil;
                hasil = transposeMatrix(tempMatrix);

                for (int r=0; r<hasil.length; r++)
                {
                    for (int c=0; c<hasil[r].length; c++)
                    {
                        Log.i("Hasil", " " + r +"," + c + " " + hasil[r][c].toString());
                        chipperText.add(hasil[r][c]);
                    }
                }
                tvChipperText.setText(chipperText.toString().replace("[", "").replace("]", "").replace(",", ""));

            }
        }
        else
        {
            Toast.makeText(EncryptActivity.this, "Cannot encrypt!", Toast.LENGTH_SHORT).show();
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
