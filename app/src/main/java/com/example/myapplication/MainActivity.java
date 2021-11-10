package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cost(View view){
        EditText ed1 = findViewById(R.id.dollar);
        EditText ed2 = findViewById(R.id.dollar2);
        EditText ed3 = findViewById(R.id.meter1);
        EditText ed4 = findViewById(R.id.meter2);
        TextView tv1 = findViewById(R.id.textView3);

        try {
            int d1 = Integer.parseInt(ed1.getText().toString());    //起始金額
            int d2 = Integer.parseInt(ed2.getText().toString());    //距離價錢
            int m1 = Integer.parseInt(ed3.getText().toString());    //距離
            int m2 = Integer.parseInt(ed4.getText().toString());    //行駛距離
            int money;

            if(m2%m1!=0){
                money = d1+((m2/m1)+1)*d2;
            }
            else{
                money = d1+(m2/m1)*d2;
            }
            tv1.setText("費用:"+money+"元");
        }
        catch (Exception e){
            Toast.makeText(this, "請輸入數字", Toast.LENGTH_LONG).show();
        }
    }
}