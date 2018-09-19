package com.example.phj_1.s305068s315303mappe1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends Activity{

    public String input = "0";
    EditText editText;
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
    Button slett;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        editText=(EditText)findViewById(R.id.editText);
        knapp1=(Button)findViewById(R.id.one);
        knapp2=(Button)findViewById(R.id.two);
        knapp3=(Button)findViewById(R.id.three);
        knapp4=(Button)findViewById(R.id.four);
        knapp5=(Button)findViewById(R.id.five);
        knapp6=(Button)findViewById(R.id.six);
        knapp7=(Button)findViewById(R.id.seven);
        knapp8=(Button)findViewById(R.id.eight);
        knapp9=(Button)findViewById(R.id.nine);
        knapp0=(Button)findViewById(R.id.zero);
        submit=(Button)findViewById(R.id.confirm);
        avbryt=(Button)findViewById(R.id.quit);
        slett=(Button)findViewById(R.id.slett);

        knapp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"1"));
            }
        });
        knapp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"2"));
            }
        });
        knapp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"3"));
            }
        });
        knapp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "4"));
            }
        });
        knapp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"5"));
            }
        });
        knapp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"6"));
            }
        });
        knapp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"7"));
            }
        });
        knapp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"8"));
            }
        });
        knapp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"9"));
            }
        });
        knapp0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"0"));
            }
        });
        slett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().delete(editText.getText().length()-1, editText.getText().length()));
            }
        });
        avbryt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
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
