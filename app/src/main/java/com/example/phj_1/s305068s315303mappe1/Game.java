package com.example.phj_1.s305068s315303mappe1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends Activity{

    public String input = "0";

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
