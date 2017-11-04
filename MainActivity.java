package com.example.ashwin.layoutid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView t;
    //boolean x = true;
    int x=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            t = (TextView) findViewById(R.id.txtv);


            t.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                  //  Toast.makeText(getApplicationContext(), "XXXXXXX", Toast.LENGTH_SHORT).show();

                        if (x == 1) {
                            t.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            x++;
                        } else if (x == 2) {
                            t.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                            x++;
                        }else if (x == 3) {
                            t.setBackgroundColor(getResources().getColor(R.color.colorChartreuse));
                            x=1;
                        }


                for (int i=0;i<=3;i++){
                     Toast.makeText(getApplicationContext(), "XXXXXXX", Toast.LENGTH_SHORT).show();
                     Toast.makeText(getApplicationContext(), "ZZZZZZZ", Toast.LENGTH_SHORT).show();
                 }

                }


            });

        }




    }

