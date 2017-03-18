package com.example.android.musicalappstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        //setting onclicklistener for playlist
        TextView obj1=(TextView)findViewById(R.id.playlist1);
        obj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj=new Intent(PlaylistsActivity.this,playlist1.class);
                startActivity(obj);
            }
        });

    }
}
