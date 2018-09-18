package com.example.phj_1.s305068s315303mappe1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends Activity{

    public String input = "0";
    Button knapp1;
    Button knapp2;
    Button knapp3;
    Button knapp4;
    Button knapp5;
    Button knapp6;
    Button knapp7;
    Button knapp8;
    Button knapp9;
    Button knapp0;
    Button submit;
    Button avbryt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void showOne(){
        input = "1";
    }

/*
    String inputText  = getString(R.string.inputText, input);
*/
    public void nextQuestion(){ //når man trykker confirm

    }


}
