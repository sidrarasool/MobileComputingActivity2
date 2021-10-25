package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        EditText mass= (EditText) findViewById(R.id.mass);
        EditText height= (EditText) findViewById(R.id.height);
        String mass1= mass.getText().toString();
        String height1=height.getText().toString();

        Double mass2=Double.parseDouble(mass1);
        Double height2=Double.parseDouble(height1);

        Double BMI= mass2/(height2*height2);

        TextView result = (TextView) findViewById(R.id.output);

        result.setText(BMI.toString());


    }
}