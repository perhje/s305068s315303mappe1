package com.example.phj_1.s305068s315303mappe1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Statistics extends Activity {
    public TextView inputstat;
    public ImageButton delstat;
    public static int feil, riktig = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        inputstat = findViewById(R.id.inputstat);
        delstat = findViewById(R.id.delstat);
        inputstat.setText(getResources().getString(R.string.riktigtekst) + ": " + riktig + "\n"
                + getResources().getString(R.string.feiltekst)+ ": " + feil);
        delstat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delStat();
            }
        });

    }

    public void delStat(){
        feil = 0;
        riktig = 0;
        recreate();
    }
}
