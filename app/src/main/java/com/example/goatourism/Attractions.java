package com.example.goatourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Attractions extends AppCompatActivity {

    public int x,y;
    TextView text1,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);
        Intent intent=getIntent();
        int x=intent.getIntExtra("x",0);
        int y=intent.getIntExtra("y",0);
    }
    public void gotohotels(View v)
    {
        Intent intent2=new Intent(this,Hotels.class);
        intent2.putExtra("x",x);
        intent2.putExtra("y",y);
        startActivity(intent2);
    }
    public void gotorestaurants(View v)
    {
        Intent intent2=new Intent(this,Restaurants.class);
        intent2.putExtra("x",x);
        intent2.putExtra("y",y);
        startActivity(intent2);
    }
    public void gototourist(View v)
    {
        Intent intent2=new Intent(this,TouristAttractions.class);
        intent2.putExtra("x",x);
        intent2.putExtra("y",y);
        startActivity(intent2);
    }
    public void gotomalls(View v)
    {
        Intent intent2=new Intent(this,Malls.class);
        intent2.putExtra("x",x);
        intent2.putExtra("y",y);
        startActivity(intent2);
    }
}