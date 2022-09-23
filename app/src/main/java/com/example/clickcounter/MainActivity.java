package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button felsogomb, alsogomb;
    private TextView szamlalo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        felsogomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(szamlalo.getText().toString());
                a++;
                szamlalo.setText(String.valueOf(a));
                if (a>0)
                {
                    szamlalo.setTextColor(Color.GREEN);

                }else if (a<0)
                {
                    szamlalo.setTextColor(Color.RED);

                }
                else {

                    szamlalo.setTextColor(Color.BLUE);
                }

            }
        });
        alsogomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = Integer.parseInt(szamlalo.getText().toString());
                b--;
                szamlalo.setText(String.valueOf(b));
                if (b>0)
                {
                    szamlalo.setTextColor(Color.GREEN);

                }else if (b<0)
                {
                    szamlalo.setTextColor(Color.RED);

                }
                else {

                    szamlalo.setTextColor(Color.BLUE);
                }
            }
        });
        szamlalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamlalo.setText("0");
                szamlalo.setTextColor(Color.BLUE);
            }
        });



    }
    private void init()
    {
        felsogomb = findViewById(R.id.felsogomb);
        alsogomb = findViewById(R.id.alsogomb);
        szamlalo = findViewById(R.id.szamlalo);

    }


}