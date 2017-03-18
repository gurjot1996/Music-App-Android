package com.example.android.musicalappstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class playlist1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist1);

        //setting onclicklistener for song1
        TextView obj1=(TextView)findViewById(R.id.song1);
        obj1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent o1=new Intent(playlist1.this,NowPlayingActivity.class);
                startActivity(o1);
            }
        });

        //setting onclicklistener for song2
        TextView obj2=(TextView)findViewById(R.id.song2);
        obj2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent o1=new Intent(playlist1.this,NowPlayingActivity.class);
                startActivity(o1);
            }
        });
    }
}
