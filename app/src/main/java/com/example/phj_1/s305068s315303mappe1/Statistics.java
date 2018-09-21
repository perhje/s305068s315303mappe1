package com.example.phj_1.s305068s315303mappe1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Statistics extends Activity {
    public TextView inputstat;
    public static int feil, riktig = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        inputstat = findViewById(R.id.stats);
        inputstat.setText("feil: " + feil + "riktig" + riktig);

    }

    public void delStat(){
        feil = 0;
        riktig = 0;
    }
}
