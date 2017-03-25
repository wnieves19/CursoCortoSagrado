package com.optivon.lista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.list_view);

        final String[] fruits = {"apples", "guava", "mango", "pinneaple", "strawberry", "peach"};

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.layout_lista, fruits);

        lista.setAdapter(itemsAdapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, fruits[i] , Toast.LENGTH_SHORT).show();


            }
        });

    }
}
