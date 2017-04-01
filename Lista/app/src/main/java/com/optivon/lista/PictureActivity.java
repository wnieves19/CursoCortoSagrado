package com.optivon.lista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class PictureActivity extends AppCompatActivity {

    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        imagen = (ImageView) findViewById(R.id.image_view);

        String nombreFruta = getIntent().getStringExtra("fruit_name");

        if (nombreFruta.equals("apple")){
            imagen.setImageResource(R.drawable.apple);
        }

        if(nombreFruta.equals("mango")){
            imagen.setImageResource(R.drawable.mango);
        }

        if(nombreFruta.equals("strawberry")){
            imagen.setImageResource(R.drawable.strawberry);
        }

        if(nombreFruta.equals("peach")){
            imagen.setImageResource(R.drawable.peach);
        }

        if(nombreFruta.equals("pinneaple")){
            imagen.setImageResource(R.drawable.pineapple);
        }


    }
}
