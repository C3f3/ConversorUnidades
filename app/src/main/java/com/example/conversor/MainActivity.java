package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    private Button celsiusAF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celsiusAF=(Button)findViewById(R.id.CelsiusFahr);

        celsiusAF.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.CelsiusFahr:
                Intent v2=new Intent(this,ventanaDos.class);
                startActivity(v2);
                break;
            default:
                break;
        }

    }

}

