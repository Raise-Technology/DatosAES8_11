package com.raise_technology.datos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtNombre, txtSigno, txtNacimiento, txtDatos;
    Button btnAgregar;
    //Se declaran las variables
    //Tipo de variable seguido del nombre
    String nombre, signo, datos="";
    int nacimiento, edad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlazamos elementos
        txtNombre = findViewById(R.id.txtNombre);
        txtSigno = findViewById(R.id.txtSigno);
        txtNacimiento = findViewById(R.id.txtNacimiento);
        txtDatos = findViewById(R.id.txtDatos);
        btnAgregar = findViewById(R.id.btnAgregar);





        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Obtenemos los datos de las cajas de texto
                //Dame el texto del elemento txtNombre y guardalo en la variable nombre
                nombre = txtNombre.getText().toString();
                signo = txtSigno.getText().toString();

                nacimiento = Integer.parseInt(txtNacimiento.getText().toString());
                edad = 2018 - nacimiento;
                datos = datos + nombre + " / " + signo + " - " + edad+"\n";
                txtDatos.setText(datos);
            }
        });

    }
}//Class
