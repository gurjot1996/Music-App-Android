package com.example.android.musicalappstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class dance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance);
        //setting onclicklistener for song 5
        TextView obj5=(TextView)findViewById(R.id.song5);
        obj5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent o1=new Intent(dance.this,NowPlayingActivity.class);
                startActivity(o1);
            }
        });
        //setting onclicklistener for song 6
        TextView obj6=(TextView)findViewById(R.id.song6);
        obj6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent o1=new Intent(dance.this,NowPlayingActivity.class);
                startActivity(o1);
            }
        });
    }
}
