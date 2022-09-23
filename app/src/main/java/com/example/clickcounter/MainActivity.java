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
                szamlalo.setText(a++);
                if (a>0)
                {
                    szamlalo.setTextColor(Color.green(0));

                }else if (a<0)
                {
                    szamlalo.setTextColor(Color.red(0));

                }
                else {

                    szamlalo.setTextColor(Color.blue(0));
                }

            }
        });
        alsogomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = Integer.parseInt(szamlalo.getText().toString());
                szamlalo.setText(b--);
            }
        });
        szamlalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamlalo.setText("0");
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