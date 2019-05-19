package com.example.todo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        /* Récupération du bundle de la première activité */
        Bundle b = this.getIntent().getExtras();
        String s = b.getString("message");

        TextView tv = (TextView) findViewById(R.id.tvInfo);
        tv.setText(s);

        SharedPreferences preferencesAppli = PreferenceManager.getDefaultSharedPreferences(this);
        String sPref = preferencesAppli.getString("cle","rien");
        TextView tvPref = (TextView) findViewById(R.id.tvPref);
        tvPref.setText(sPref);


    }
}
