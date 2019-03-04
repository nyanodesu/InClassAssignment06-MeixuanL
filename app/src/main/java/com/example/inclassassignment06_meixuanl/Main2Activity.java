package com.example.inclassassignment06_meixuanl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        Pokemon a = (Pokemon) i.getSerializableExtra(Keys.POKEMON);

        mTextView = (TextView) findViewById(R.id.text);
        mTextView.setText("Pokemon Name: " + a.getName() +"\nPokemon Type: " + a.getType() + "\nAble to evolve? " + a.getEvolve() + "\nGeneration: " + a.getGeneration());

    }


}
