package com.example.phj_1.s305068s315303mappe1;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences preflang = PreferenceManager.getDefaultSharedPreferences(this);
        String language = preflang.getString("language", "");
        Context context = getApplicationContext();
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Resources res = context.getResources();
        Configuration config = new Configuration(res.getConfiguration());
        config.locale = locale;
        res.updateConfiguration(config, res.getDisplayMetrics());
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        recreate();
    }

    public void showGame(View v){
        Intent intent=new Intent(this,Game.class);
        startActivity(intent);
    }

    public void showStatistics(View v){
        Intent intent=new Intent(this,Statistics.class);
        startActivity(intent);
    }

    public void showPreferences(View v){
        Intent intent=new Intent(this,Preferences.class);
        startActivity(intent);
    }
}
