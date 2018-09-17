package com.example.phj_1.s305068s315303mappe1;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
