package com.example.goatourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Amneties extends AppCompatActivity
{
    public int x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amneties);
        Intent intent=getIntent();
        x=intent.getIntExtra("x",0);
        y=intent.getIntExtra("y",0);
    }
    public void gotobusstops(View v)
    {
        Intent intent2=new Intent(this,Busstops.class);
        intent2.putExtra("x",x);
        intent2.putExtra("y",y);
        startActivity(intent2);
    }
    public void gotohospitals(View v)
    {
        Intent intent2=new Intent(this,Hospitals.class);
        intent2.putExtra("x",x);
        intent2.putExtra("y",y);
        startActivity(intent2);
    }
    public void gotopolice(View v)
    {
        Intent intent2=new Intent(this,Police.class);
        intent2.putExtra("x",x);
        intent2.putExtra("y",y);
        startActivity(intent2);
    }
}