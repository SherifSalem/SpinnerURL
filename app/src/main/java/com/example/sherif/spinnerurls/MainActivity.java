package com.example.sherif.spinnerurls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.net.URL;

public class MainActivity extends AppCompatActivity {
    URL[] list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spnr;

        spnr = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter adapter = new ArrayAdapter<URL>(this, R.layout.support_simple_spinner_dropdown_item,list);
        spnr.setAdapter(adapter);
        spnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}
