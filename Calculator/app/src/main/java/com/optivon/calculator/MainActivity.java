package com.optivon.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText primerNumero;
    EditText segundoNumero;

    Button botonSumar;

    TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primerNumero = (EditText)findViewById(R.id.firstNumber);
        segundoNumero = (EditText)findViewById(R.id.secondNumber);

        botonSumar = (Button)findViewById(R.id.sumar);

        label = (TextView) findViewById(R.id.textView);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if (!primerNumero.getText().toString().equals("") && !segundoNumero.getText().toString().equals("") ) {
                int numero1 = Integer.parseInt(primerNumero.getText().toString());
                int numero2 = Integer.parseInt(segundoNumero.getText().toString());

                int total = numero1 + numero2;

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("resultado", total);
                startActivity(intent);


//                label.setText("Total: " + total);
//                Toast.makeText(MainActivity.this, "Total: = " + total, Toast.LENGTH_SHORT).show();
            }else{
                primerNumero.setError("Entre un número");
                segundoNumero.setError("Entre un número");
            }
            }
        });

    }
}











