package com.example.conversortemperaruta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_numero = null;
    TextView text_kelvin = null;
    TextView text_farenheit = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero = findViewById(R.id.edt_temperatura);
        text_kelvin = findViewById(R.id.txt_kelvin);
        text_farenheit = findViewById(R.id.txt_farenheit);

    }

    public void convertir(View view) {
        String textoTemperatura = edt_numero.getText().toString();
        double temperatura = Double.valueOf(textoTemperatura);
        //--------------------------------------------------------
        double kelvin = temperatura + 273.0;
        double farenheit = temperatura *9.0/5.0 +32.0;
        //-------------------------------------------------------
        text_kelvin.setText(String.valueOf(kelvin) + " kelvin");
        text_farenheit.setText(String.valueOf(farenheit) + " farenheit");

    }
}