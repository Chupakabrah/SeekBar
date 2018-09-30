package com.example.diak.seekergyak;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar r_seek;
    private SeekBar g_seek;
    private SeekBar b_seek;
    private TextView color_Box;
    private TextView red;
    private TextView green;
    private TextView blue;
    int r;
    int g;
    int b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r_seek = (SeekBar) findViewById(R.id.r_Seeker);
        b_seek = (SeekBar) findViewById(R.id.b_Seeker);
        g_seek = (SeekBar) findViewById(R.id.g_Seeker);
        color_Box = (TextView) findViewById(R.id.Color_Box);
        red = (TextView) findViewById(R.id.Red);
        green = (TextView) findViewById(R.id.Green);
        blue = (TextView) findViewById(R.id.Blue);

        r_seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean x) {
                r = i;
                red.setText("Red : " + i);
                color_Box.setBackgroundColor(Color.rgb(r,g,b));
                color_Box.setText("(" + r + "," + g + "," + b + ")");


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        b_seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean x) {
                b = i;
                blue.setText("Blue : " + i);
                color_Box.setBackgroundColor(Color.rgb(r,g,b));
                color_Box.setText("(" + r + "," + g + "," + b + ")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        g_seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean x) {
                g = i;
                green.setText("Green : " + i);
                color_Box.setBackgroundColor(Color.rgb(r,g,b));
                color_Box.setText("(" + r + "," + g + "," + b + ")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

}
