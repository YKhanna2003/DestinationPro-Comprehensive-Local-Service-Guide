package com.example.goatourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Showfacilities extends AppCompatActivity
{
    public int x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showfacilities);
        Intent intent=getIntent();
        x=intent.getIntExtra("x",0);
        y=intent.getIntExtra("y",0);
    }
    public void gotoattractions(View v)
    {
        Intent intent2=new Intent(this,Attractions.class);
        intent2.putExtra("x",x);
        intent2.putExtra("y",y);
        startActivity(intent2);
    }
    public void gotoamneties(View v)
    {
        Intent intent3=new Intent(this,Amneties.class);
        intent3.putExtra("x",x);
        intent3.putExtra("y",y);
        startActivity(intent3);
    }
}