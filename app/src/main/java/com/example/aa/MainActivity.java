package com.example.aa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
    implements  AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //paso 1
        final String[] datos =

                new String[]{"Alojamiento",
                        "Alimentacion y Bebidas",
                        "Atractivos Culturales",
                        "Esparcimiento",
                        "Compras"};

 //PASO 2
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos);

        //paso 3
        Spinner cmbOpciones = (Spinner) findViewById(R.id.cbEstudiantes);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbOpciones.setAdapter(adaptador);
        cmbOpciones.setOnItemClickListener(this::onItemSelected);

        //ListView
        //PASO 1 DATA
        final String[] datos2 =

                new String[]{"AAAAA",
                        "BBBBB ",
                        "CCCCC",
                        "DDDDD",
                        "EEEEE"};

        //paso 2
        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, datos2);


        //paso 3

        ListView lstOpciones = (ListView)findViewById(R.id.lstLugares);
        lstOpciones.setAdapter(adaptador2);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView txtItem = (TextView)findViewById(R.id.txtrespuesta);

        txtItem.setText("Categoria: " +
                parent.getItemAtPosition(position));
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
