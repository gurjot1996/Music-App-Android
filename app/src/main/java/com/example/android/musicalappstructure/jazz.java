package com.example.android.musicalappstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class jazz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz);
        //setting onclicklistener for song 3
        TextView obj3=(TextView)findViewById(R.id.song3);
        obj3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent o1=new Intent(jazz.this,NowPlayingActivity.class);
                startActivity(o1);
            }
        });

        //setting onclicklistener for song 4
        TextView obj4=(TextView)findViewById(R.id.song4);
        obj4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent o1=new Intent(jazz.this,NowPlayingActivity.class);
                startActivity(o1);
            }
        });
    }
}
