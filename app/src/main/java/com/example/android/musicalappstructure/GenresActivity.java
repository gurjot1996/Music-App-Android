package com.example.android.musicalappstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GenresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);
        //setting onclicklistener for pop genere
        TextView obj1=(TextView)findViewById(R.id.pop);
        obj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj=new Intent(GenresActivity.this,pop.class);
                startActivity(obj);
            }
        });
        //setting onclicklistener for jazz
        TextView obj2=(TextView)findViewById(R.id.jazz);
        obj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj=new Intent(GenresActivity.this,pop.class);
                startActivity(obj);
            }
        });
        //setting onclicklistener for dance
        TextView obj3=(TextView)findViewById(R.id.dance);
        obj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj=new Intent(GenresActivity.this,pop.class);
                startActivity(obj);
            }
        });
    }
}
