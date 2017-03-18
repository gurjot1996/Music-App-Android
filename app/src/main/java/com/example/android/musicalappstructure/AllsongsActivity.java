package com.example.android.musicalappstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static android.os.Build.VERSION_CODES.N;

public class AllsongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allsongs);
        //setting onclicklistener for song 1
        TextView obj1=(TextView)findViewById(R.id.song1);
        obj1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent o1=new Intent(AllsongsActivity.this,NowPlayingActivity.class);
                startActivity(o1);
            }
        });
        //setting onclicklistener for song 2
        TextView obj2=(TextView)findViewById(R.id.song2);
        obj2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent o1=new Intent(AllsongsActivity.this,NowPlayingActivity.class);
                startActivity(o1);
            }
        });
        //setting onclicklistener for song 3
        TextView obj3=(TextView)findViewById(R.id.song3);
        obj3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent o1=new Intent(AllsongsActivity.this,NowPlayingActivity.class);
                startActivity(o1);
            }
        });
        //setting onclicklistener for song 4
        TextView obj4=(TextView)findViewById(R.id.song4);
        obj4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent o1=new Intent(AllsongsActivity.this,NowPlayingActivity.class);
                startActivity(o1);
            }
        });
        //setting onclicklistener for song 5
        TextView obj5=(TextView)findViewById(R.id.song5);
        obj5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent o1=new Intent(AllsongsActivity.this,NowPlayingActivity.class);
                startActivity(o1);
            }
        });
        //setting onclicklistener for song 6
        TextView obj6=(TextView)findViewById(R.id.song6);
        obj6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent o1=new Intent(AllsongsActivity.this,NowPlayingActivity.class);
                startActivity(o1);
            }
        });
    }

}

