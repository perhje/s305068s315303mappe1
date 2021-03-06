package com.example.phj_1.s305068s315303mappe1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DialogFragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;



public class Game extends Activity implements FinishDialog.DialogClickListener, QuitDialog.DialogClickListener {
    TextView textView;
    EditText editText;
    ImageButton knapp1;
    ImageButton knapp2;
    ImageButton knapp3;
    ImageButton knapp4;
    ImageButton knapp5;
    ImageButton knapp6;
    ImageButton knapp7;
    ImageButton knapp8;
    ImageButton knapp9;
    ImageButton knapp0;
    ImageButton submit;
    ImageButton avbryt;
    ImageButton slett;
    ImageButton startspill;



    String[] game;
    int[] answer;

    String count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);

        SharedPreferences prefcount = PreferenceManager.getDefaultSharedPreferences(this);
        count = prefcount.getString("count", "5");


        game = getResources().getStringArray(R.array.game);
        answer = getResources().getIntArray(R.array.answer);

        startspill=findViewById(R.id.start);
        editText = findViewById(R.id.editText);
        knapp1 = findViewById(R.id.one);
        knapp2 = findViewById(R.id.two);
        knapp3 = findViewById(R.id.three);
        knapp4 = findViewById(R.id.four);
        knapp5 = findViewById(R.id.five);
        knapp6 = findViewById(R.id.six);
        knapp7 = findViewById(R.id.seven);
        knapp8 = findViewById(R.id.eight);
        knapp9 = findViewById(R.id.nine);
        knapp0 = findViewById(R.id.zero);
        submit = findViewById(R.id.confirm);
        avbryt = findViewById(R.id.quit);
        slett = findViewById(R.id.slett);
        textView = findViewById(R.id.input3);


        knapp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "1"));
            }
        });
        knapp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "2"));
            }
        });
        knapp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "3"));
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
                editText.setText(editText.getText().insert(editText.getText().length(), "5"));
            }
        });
        knapp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "6"));
            }
        });
        knapp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "7"));
            }
        });
        knapp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "8"));
            }
        });
        knapp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "9"));
            }
        });
        knapp0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "0"));
            }
        });
        slett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().length() != 0)
                editText.setText(editText.getText().delete(editText.getText().length() - 1, editText.getText().length()));
            }
        });
        avbryt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quitquiz(null);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        startspill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 StartGame(Integer.parseInt(count));
            }
        });

    }


    private int svar;
    public static int riktig, feil;

    //genererer liste over random tall med k som lengde

    private static int tilfeldigTall(int min, int max) {
        Random random = new Random();

        return random.nextInt((max - min) + 1) + min;
    }

    //lage liste over tall som ikke går igjen for å generere tilfeldig oppgave
    private static ArrayList<Integer> RandomInt(int size, int min, int max) {
        ArrayList<Integer> tall = new ArrayList<>();

        while (tall.size() < size) {
            int nyTall = tilfeldigTall(min, max);
            //sørger for at tall ikke går igjen.
            if (!tall.contains(nyTall)) {
                tall.add(nyTall);
            }
        }

        return tall;
    }

    ArrayList<Integer> list;
    int l = 0;
    String test;
    private void StartGame(int k) {
        list = RandomInt(k, 0, 24);
        editText.setText("");
        feil = 0;
        riktig = 0;
        l = 0;
        textView.setText(game[list.get(l)] + "=?");
        confirmclick();

    }

    private void confirmclick(){
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().length() !=0)
                sammenligne();
            }
        });
    }

    private void sammenligne(){
        svar = Integer.parseInt(editText.getText().toString());
        if (svar == answer[list.get(l)]) {
            riktig++;
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.right), Toast.LENGTH_SHORT).show();
        }
        if (svar != answer[list.get(l)]) {
            feil++;
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.wrong), Toast.LENGTH_SHORT).show();
        }
        l++;
        if(l < list.size()){
            textView.setText(game[list.get(l)] + "=?");
            editText.setText("");
            confirmclick();
        }else{
            finishquiz(null);
        }

    }



    public void onconfirm(){
        finish();
    }

    public void ondeny(){
        return;
    }

    public void newgame(){
        StartGame(Integer.parseInt(count));
    }

    public void quitquiz(View v){
        DialogFragment dialog = new QuitDialog();
        dialog.show(getFragmentManager(),"Avslutt");
    }

    private void finishquiz(View v){
        Statistics.feil = Statistics.feil + feil;
        Statistics.riktig = Statistics.riktig + riktig;
        DialogFragment dialog = new FinishDialog();
        dialog.show(getFragmentManager(),"Ferdig");
    }
}



