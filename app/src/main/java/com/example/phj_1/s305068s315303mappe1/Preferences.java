package com.example.phj_1.s305068s315303mappe1;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class Preferences extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);
    }

    int count = 5;

    public void chooseCount5(){
        count = 5;
    }

    public void chooseCount10(){
        count = 10;
    }

    public void chooseCount25(){
        count = 25;
    }

    public void chooseLanguageNO(View v){
        String language = "no";
        Context context = getApplicationContext();
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Resources res = context.getResources();
        Configuration config = new Configuration(res.getConfiguration());
        config.locale = locale;
        res.updateConfiguration(config, res.getDisplayMetrics());
        recreate();
    }

    public void chooseLanguageDE(View v){
        String language = "de";
        Context context = getApplicationContext();
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Resources res = context.getResources();
        Configuration config = new Configuration(res.getConfiguration());
        config.locale = locale;
        res.updateConfiguration(config, res.getDisplayMetrics());
        recreate();
    }
}
