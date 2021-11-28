package com.example.goatourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class UserInfo extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    Spinner spinner;
    public String location;
    public int hr,min,sec;
    public int x,y;
    public static final String EXTRA_X="com.example.goatourism.EXTRA.X";
    public static final String EXTRA_Y="com.example.goatourism.EXTRA.Y";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        spinner=findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.places, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text=parent.getItemAtPosition(position).toString();
        location=text;
        if(location.equals("Central Goa")) {
            x=0;y=0;
        }
        else if(location.equals("North Goa")) {
            x=0;y=1;
        }
        else if(location.equals("South Goa")) {
            x=0;y=-1;
        }
        else if(location.equals("East Goa")) {
            x=-1;y=0;
        }
        else
        {
            x=1;y=0;
        }
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {
        //Ignore
    }
    public void gotonext(View v)
    {
        Intent intent=new Intent(this,Showfacilities.class);
        intent.putExtra("x",x);
        intent.putExtra("y",y);
        startActivity(intent);
    }
}