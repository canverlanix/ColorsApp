package com.example.colorsapp;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    //iniciando los tipos con null
    //Inicializar componentes -> Null
    private SeekBar sbrRed = null;
    private SeekBar sbrGreen = null;
    private SeekBar sbrBlue = null;
    private SeekBar sbrAlpha = null;
    private View viewColors = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get components id's
        sbrRed = findViewById(R.id.sbrRed);
        sbrGreen = findViewById(R.id.sbrGreen);
        sbrBlue = findViewById(R.id.sbrBlue);
        sbrAlpha = findViewById(R.id.sbrAlpha);
        viewColors = findViewById(R.id.viewColors);

        //Habilitar el View component como menu contextual
        registerForContextMenu(viewColors);

        //Obtener el valor del seekBar
        sbrRed.setOnSeekBarChangeListener(this);
        sbrGreen.setOnSeekBarChangeListener(this);
        sbrBlue.setOnSeekBarChangeListener(this);
        sbrAlpha.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean bo) {
        //Cambiar colores
        int r = sbrRed.getProgress();
        int g = sbrGreen.getProgress();
        int b = sbrBlue.getProgress();
        int a = sbrAlpha.getProgress();

        int colorHexa = Color.argb(a,r,g,b);

        viewColors.setBackgroundColor(colorHexa);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    //mostrar menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        //validaciones para colores
        int id = item.getItemId();
        if(id == R.id.item1){
            sbrRed.setProgress(250);
            sbrGreen.setProgress(100);
            sbrBlue.setProgress(240);
            sbrAlpha.setProgress(170);

        }else if(id == R.id.item2){
            sbrRed.setProgress(112);
            sbrGreen.setProgress(55);
            sbrBlue.setProgress(40);
            sbrAlpha.setProgress(200);

        }else if(id == R.id.item3){
            sbrRed.setProgress(0);
            sbrGreen.setProgress(220);
            sbrBlue.setProgress(255);
            sbrAlpha.setProgress(150);
        }else if(id == R.id.item4){
            sbrRed.setProgress(10);
            sbrGreen.setProgress(10);
            sbrBlue.setProgress(10);
            sbrAlpha.setProgress(180);
        }else if(id == R.id.item5){
            sbrRed.setProgress(255);
            sbrGreen.setProgress(255);
            sbrBlue.setProgress(255);
            sbrAlpha.setProgress(180);

        }else if(id == R.id.item6){
            sbrRed.setProgress(255);
            sbrGreen.setProgress(255);
            sbrBlue.setProgress(50);
            sbrAlpha.setProgress(130);

        }else if(id == R.id.item8){
            sbrRed.setProgress(255);
            sbrGreen.setProgress(20);
            sbrBlue.setProgress(90);
            sbrAlpha.setProgress(200);
        }

        return super.onOptionsItemSelected(item);
    }
}
