package com.example.piechart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;


import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   private PieChart chart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chart=findViewById(R.id.chart);
        add();


    }


private void add(){
        chart.addPieSlice(new PieModel("Interger 1",10,Color.parseColor("#AEAEAE")));
    chart.addPieSlice(new PieModel("Interger 1",30,Color.parseColor("#FF414D")));
    chart.addPieSlice(new PieModel("Interger 1",60,Color.parseColor("#9463F9")));
    chart.addPieSlice(new PieModel("Interger 1",70,Color.parseColor("#579EFF")));
    chart.startAnimation();
}
}