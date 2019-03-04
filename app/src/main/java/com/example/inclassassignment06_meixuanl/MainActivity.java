package com.example.inclassassignment06_meixuanl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mName;
    EditText mType;
    CheckBox mEvolve;
    EditText mGeneration;
    String name;
    String type;
    boolean evolve;
    int generation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText) findViewById(R.id.pokemon_name);
        mType = (EditText) findViewById(R.id.pokemon_type);
        mEvolve = (CheckBox) findViewById(R.id.evolve);
        mGeneration = (EditText) findViewById(R.id.generation);

    }


    public void submit(View view){
        Intent i = new Intent(this,Main2Activity.class);
        Pokemon p = new Pokemon(name,type,evolve,generation);

        p.setName(mName.getText().toString());
        p.setType(mType.getText().toString());
        p.setEvolve(mEvolve.isChecked());
        String value = mGeneration.getText().toString();
        generation = Integer.parseInt(value);
        p.setGeneration(generation);

        i.putExtra(Keys.POKEMON,p);
        startActivity(i);


    }





}
