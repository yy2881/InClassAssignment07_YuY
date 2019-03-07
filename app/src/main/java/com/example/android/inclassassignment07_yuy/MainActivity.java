package com.example.android.inclassassignment07_yuy;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView name_main_view;
    TextView gender_main_view;
    TextView isAlive_main_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name_main_view = findViewById(R.id.name);
        gender_main_view = findViewById(R.id.gender);
        isAlive_main_view = findViewById(R.id.isAlive);

    }



    public void addHero(View view){
        Intent intent = new Intent(MainActivity.this,AddActivity.class);
        startActivityForResult(intent,Keys.ADD_HERO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == Keys.ADD_HERO && resultCode == RESULT_OK){
            MarvelHero hero = (MarvelHero) data.getSerializableExtra(Keys.HERO);
            name_main_view.setText("Name: "+hero.name);
            gender_main_view.setText("Gender: "+hero.gender);
            isAlive_main_view.setText("Is Alive? "+String.valueOf(hero.isAlive));
        }
    }
}
