package com.example.sesion04_actividad5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

class ConversorTemperaturas{

    public double centigradosAFahrenheit(double gradosC){
        return gradosC*1.8+32;
    }
    public double fahrenheitACentigrados(double gradosF){
        return (gradosF-32)/1.8;
    }
    public double fahrenheitAKelvin (double gradosF) {
        return (gradosF+459.67)/1.8;
    }
    public double kelvinAFahrenheit(double gradosK) {
        return ((9/5)*gradosK)-459.67;
    }
    public double fahrenheitARankine(double gradosF) {
        return gradosF+459.67;
    }
    public double rankineAFahrenheit(double gradosR) {
        return gradosR-459.67;
    }
    public double fahrenheitAReamur(double gradosF) {
        return (gradosF-32)/2.25;
    }
    public double reamurAfahrenheit(double gradosRe) {
        return (2.25*gradosRe)+32;
    }
    public double centigradosAKelvin(double gradosC) {
        return gradosC+273.15;
    }
    public double kelvinACentigrados(double gradosK) {
        return gradosK -273.15;
    }
}


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spinnerEntrada,spinnerSalida;
    EditText entrada,salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerEntrada=findViewById(R.id.spinnerEntrada);
        spinnerSalida=findViewById(R.id.spinnerSalida);
        entrada=findViewById(R.id.cajaAConvertir);
        salida=findViewById(R.id.cajaConvertido);

        spinnerEntrada.setOnItemSelectedListener(this);

        String datos[]= {"Selecciona opcion...","Centigrados","Fahrenheit","Kelvin","Rankine","Reamur"};
        ArrayAdapter adaptador=new ArrayAdapter(this,android.R.layout.simple_spinner_item,
                datos);

        spinnerEntrada.setAdapter(adaptador);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String vectorC[]= {"Selecciona opcion...","Fahrenheit","Kelvin"};
        String vectorF[]= {"Selecciona opcion...","Centigrados","Kelvin","Rankine","Reamur"};
        String vectorK[]= {"Selecciona opcion...","Fahrenheit","Centigrados"};
        String vectorR[]= {"Selecciona opcion...","Fahrenheit"};
        String vectorRe[]= {"Selecciona opcion...","Fahrenheit"};

        ArrayAdapter adapter=null;
        if (position==1) {
            adapter= new ArrayAdapter(this, android.R.layout.simple_spinner_item,
                    vectorC);
        }
        if (position==2) {
            adapter= new ArrayAdapter(this, android.R.layout.simple_spinner_item,
                    vectorF);
        }
        if (position==3) {
            adapter= new ArrayAdapter(this, android.R.layout.simple_spinner_item,
                    vectorK);
        }
        if (position==4) {
            adapter= new ArrayAdapter(this, android.R.layout.simple_spinner_item,
                    vectorR);
        }
        if (position==5) {
            adapter= new ArrayAdapter(this, android.R.layout.simple_spinner_item,
                    vectorRe);
        }
        spinnerSalida.setAdapter(adapter);
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent){

    }
}
