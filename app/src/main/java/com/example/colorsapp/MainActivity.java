package com.example.colorsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    //iniciando los tipos con null
    private SeekBar sbrGreen = null;
    private SeekBar sbrBlue = null;
    private SeekBar sbrAlpha = null;
    private SeekBar sbrRed = null;
    private View vieColors  = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //llamar los id en unas variables


        sbrRed = findViewById(R.id.sbrRed);
        sbrGreen    = findViewById(R.id.sbrGreen);
        sbrBlue = findViewById(R.id.sbrBlue);
        sbrAlpha = findViewById(R.id.sbrAlpha);
        vieColors = findViewById(R.id.vieColors);

        //avilitar para en componente vie, cuando se precione y salga menu contextual
        registerForContextMenu(vieColors);
        //en funcionalida en seekbar

        //obtener el progreso de los seekba => value


        sbrRed.setOnSeekBarChangeListener(this);
        sbrGreen.setOnSeekBarChangeListener(this);
        sbrBlue.setOnSeekBarChangeListener(this);
        sbrAlpha.setOnSeekBarChangeListener(this);
        //para crear todos los metodos click en thos main



    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
      int r = sbrRed.getProgress();
      int g = sbrGreen.getProgress();
      int b = sbrBlue.getProgress();
      int a = sbrAlpha.getProgress();

      int colorHex = Color.argb(a,r,g,b);
      vieColors.setBackgroundColor(colorHex);

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
