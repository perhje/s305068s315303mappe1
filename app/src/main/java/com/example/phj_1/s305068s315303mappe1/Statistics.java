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
        inputstat = findViewById(R.id.inputstat);
        inputstat.setText(getResources().getString(R.string.riktigtekst) + ": " + riktig + "\n"
                + getResources().getString(R.string.feiltekst)+ ": " + feil);

    }

    @Override
    protected void onRestart(){
        super.onRestart();
        recreate();
    }

    public void delStat(){
        feil = 0;
        riktig = 0;
    }
}
