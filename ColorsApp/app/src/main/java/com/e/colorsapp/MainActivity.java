package com.e.colorsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private SeekBar sbRed=null, sbGreen=null, sbBlue=null, sbAlpha=null;
    private View vieColors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbRed=findViewById(R.id.sb_red);
        sbGreen=findViewById(R.id.sb_green);
        sbBlue=findViewById(R.id.sb_blue);
        sbAlpha=findViewById(R.id.sb_alpha);
        vieColors=findViewById(R.id.viewColor);

        registerForContextMenu(vieColors);

        sbRed.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);
        sbBlue.setOnSeekBarChangeListener(this);
        sbAlpha.setOnSeekBarChangeListener(this);







    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean bo) {
        int r=sbRed.getProgress();
        int g=sbGreen.getProgress();
        int b=sbBlue.getProgress();
        int a=sbAlpha.getProgress();

        int colorH = Color.argb(a,r,g,b);

        vieColors.setBackgroundColor(colorH);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
