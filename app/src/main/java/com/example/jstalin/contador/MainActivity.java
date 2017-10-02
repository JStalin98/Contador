package com.example.jstalin.contador;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private double contador = 1;
    private TextView texto;

    protected  void onCreate(Bundle estado){
        super.onCreate(estado);
        setContentView(R.layout.activity_main);
        texto = (TextView) findViewById(R.id.text);

        texto.setText(String.valueOf(contador));

    }

    // duplica el valor del contador y la guarda en la etiqueta texto
    public void duplica (View view){

        contador = contador * 2;
        texto.setText(String.valueOf(contador));

    }

    // guardar el estado de la variable contador
    @Override
    protected void onSaveInstanceState(Bundle estado) {
        super.onSaveInstanceState(estado);
        estado.putDouble ("posicion", contador);
    }

    // 1ª forma de recuperar el estado
    @Override
    protected void onRestoreInstanceState(Bundle estado) {
        super.onRestoreInstanceState (estado);
        contador = estado.getDouble("posicion");
        texto.setText (String.valueOf (contador));
    }

}
