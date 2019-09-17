package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ventanaDos extends AppCompatActivity implements OnClickListener {
    private Button bConvertir;
    private EditText casCel,casFarh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_dos);

        //linkeo con el xml

        casCel=(EditText)findViewById(R.id.casCelsius);
        casFarh=(EditText)findViewById(R.id.casFahren);

        bConvertir=(Button)findViewById(R.id.botonConvertir);


        //linkeo el escuchador
        bConvertir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.getId()==R.id.botonConvertir){
            String c=casCel.getText().toString();
            String f=casFarh.getText().toString();

            if(c.equals("")==true && f.equals("")==false){
                float n=Float.parseFloat(f);
                float x=transFaraCel(n);
                casCel.setText(Float.toString(x));

                mostrarMensaje("conversion Exitosa");
            }
            else{
                if(c.equals("")==false && f.equals("")==true){
                    float x=transCelaFar(Float.parseFloat(c));
                    casFarh.setText(Float.toString(x));
                    mostrarMensaje("Conversion exitosa");
                }
                else
                {
                    mostrarMensaje("Error de Conversion!!");
                }
            }
        }
    }

    public float transCelaFar(float c){
        return (float)(c*1.8 + 32);
    }
    public float transFaraCel(float f){
        return (float)((f-32)/1.8);
    }

    public void mostrarMensaje(String s){
        Toast.makeText(this, s,Toast.LENGTH_LONG).show();
    }
}
