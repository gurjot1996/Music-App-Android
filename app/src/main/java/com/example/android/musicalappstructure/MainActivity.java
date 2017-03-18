package com.example.android.musicalappstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting onclistener for allsongs
        TextView obj1=(TextView)findViewById(R.id.allsongs);
        obj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj=new Intent(MainActivity.this,AllsongsActivity.class);
                startActivity(obj);
            }
        });



        //setting onclistener for playlists
        TextView obj3=(TextView)findViewById(R.id.playlists);
        obj3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent obj=new Intent(MainActivity.this,PlaylistsActivity.class);
                startActivity(obj);
            }
        });

        //setting onclistener for generes
        TextView obj4=(TextView)findViewById(R.id.genres);
        obj4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent obj=new Intent(MainActivity.this,GenresActivity.class);
                startActivity(obj);
            }
        });
    }
}
