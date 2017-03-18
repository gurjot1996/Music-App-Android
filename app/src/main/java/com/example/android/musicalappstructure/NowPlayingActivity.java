package com.example.android.musicalappstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        //setting onclicklistener for imagebuttons
        final ImageView obj2=(ImageView)findViewById(R.id.play);
        obj2.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View view)
            {

                if(flag==0){
                    obj2.setImageResource(R.drawable.pause);
                    Toast.makeText(NowPlayingActivity.this,"Song Paused",Toast.LENGTH_SHORT).show();
                    flag=1;}
                else{
                    obj2.setImageResource(R.drawable.play);
                    Toast.makeText(NowPlayingActivity.this,"Playing song",Toast.LENGTH_SHORT).show();
                    flag=0;
                }
            }
        });


        //setting onclicklistener for imagebuttons
        ImageView obj3=(ImageView)findViewById(R.id.next);
        obj3.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View view)
            {
                Toast.makeText(NowPlayingActivity.this,"Playing next song",Toast.LENGTH_SHORT).show();
            }
        });
//setting onclicklistener for imagebuttons
        ImageView obj4=(ImageView)findViewById(R.id.prev);
        obj4.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View view)
            {
                Toast.makeText(NowPlayingActivity.this,"Playing prev song",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
