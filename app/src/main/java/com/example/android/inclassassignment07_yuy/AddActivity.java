package com.example.android.inclassassignment07_yuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class AddActivity extends AppCompatActivity {

    EditText name_view;
    Spinner spinner_gender;
    CheckBox isAlive_check_box;
    Button submit_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        name_view = findViewById(R.id.name_view);
        spinner_gender = findViewById(R.id.spinner);
        isAlive_check_box = findViewById(R.id.checkbox);
        submit_button = findViewById(R.id.button);


        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = name_view.getText().toString();
                String gender = spinner_gender.getSelectedItem().toString();
                boolean isAlive = isAlive_check_box.isSelected();
                MarvelHero newHero = new MarvelHero(name,gender,isAlive);
                Intent data = new Intent(AddActivity.this,MainActivity.class);
                data.putExtra(Keys.HERO,newHero);
                setResult(RESULT_OK, data);
                finish();
            }
        });

    }
}
