package com.optivon.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText primerNumero;
    EditText segundoNumero;

    Button botonSumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primerNumero = (EditText)findViewById(R.id.firstNumber);

        segundoNumero = (EditText)findViewById(R.id.secondNumber);

        botonSumar = (Button)findViewById(R.id.sumar);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = Integer.parseInt(primerNumero.getText().toString());
                int numero2 = Integer.parseInt(segundoNumero.getText().toString());

                int total = numero1 + numero2;

//                textView.setText("El total de la suma = "+total);
                Toast.makeText(MainActivity.this, "El total de la suma = "+total, Toast.LENGTH_SHORT).show();
            }
        });

    }
}











