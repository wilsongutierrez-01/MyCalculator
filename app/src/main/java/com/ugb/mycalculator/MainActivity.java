package com.ugb.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcular (View view){
        TextView tempVal = (TextView)findViewById(R.id.txtnum1);
        double num1 = Double.parseDouble(tempVal.getText().toString());

        tempVal = (TextView)findViewById(R.id.txtnum2);
        double num2 = Double.parseDouble(tempVal.getText().toString());

        double respuesta = 1;

        Spinner cbOperacionesBasicas = findViewById(R.id.cbOperacionesBasicas);
        switch (cbOperacionesBasicas.getSelectedItemPosition()){
            case 0:
                respuesta = num1+num2;
            case 1:
                respuesta = num1-num2;
            case 2:
                respuesta = num1*num2;
            case 3:
                respuesta = num1/num2;
            case 4:
                for(int i=2; i<=num1; i++){
                    respuesta *=i;
                }
            case 5:
               respuesta = Math.pow(num1 , num2);
            case 6:
                respuesta = Math.sqrt(num1);
            case 7:
                respuesta = Math.cbrt(num1);


        }
        tempVal = findViewById(R.id.lblrespuesta);
        tempVal.setText("Respuesta =" + respuesta);

    }
}