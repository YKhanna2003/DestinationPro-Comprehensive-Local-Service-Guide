package com.example.goatourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class TouristAttractions extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    public TextView t5,t6,t7,t8,t9,t10;
    public double distance2;
    public int scoordinates, ycoordinates;
    public long phone;
    public ImageView img1;

    public String name,distancestring,phonenumber,rating;
    public Spinner spinner9;
    public int x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_attractions);
        Intent intent=getIntent();
        int x=intent.getIntExtra("x",0);
        int y=intent.getIntExtra("y",0);
        spinner9=findViewById(R.id.spinnertourist);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.tourist, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9.setAdapter(adapter);
        spinner9.setOnItemSelectedListener(this);
        t5=(TextView) findViewById(R.id.distancetourist);
        t6=(TextView) findViewById(R.id.timingstourist);
        t7=(TextView) findViewById(R.id.ratingtourist);
        t8=(TextView) findViewById(R.id.addresstourist);
        t10=(TextView) findViewById(R.id.touristrating);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        String text=parent.getItemAtPosition(position).toString();
        name=text;
        if(name.equals("Mangeshi Temple"))
        {
            StringBuffer timetourist=new StringBuffer("");
            StringBuffer touristrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer touristaddress=new StringBuffer("");
            StringBuffer touristcapacity=new StringBuffer("");
            touristrating.delete(0,touristrating.length());
            rating.append("4.6 Stars");
            timetourist.delete(0,timetourist.length());
            touristaddress.delete(0,touristaddress.length());
            touristaddress.append("Mardol, Goa 403115");
            timetourist.append("6:00AM - 10:00PM");
            distancestring= "35.3 KM";
            touristrating.append("https://cinngoa.com/temples/shri-mangeshi-temple/");
            touristcapacity.append("No Delivery");
            t5.setText(distancestring);
            t6.setText(timetourist);
            t7.setText(touristrating);
            t8.setText(touristaddress);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.touristimage);
            img1.setImageResource(R.drawable.mangeshitemple);
        }
        else if(name.equals("Fontainhas"))
        {
            StringBuffer timetourist=new StringBuffer("");
            StringBuffer touristrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer touristaddress=new StringBuffer("");
            StringBuffer touristcapacity=new StringBuffer("");
            touristrating.delete(0,touristrating.length());
            rating.append("4.5 Stars");
            timetourist.delete(0,timetourist.length());
            touristaddress.delete(0,touristaddress.length());
            touristaddress.append("Rua de Natal, Fontainhas (quarter), Mala, Panaji, Goa 403001");
            timetourist.append("Open 24 Hours");
            distancestring= "28.9 KM";
            touristrating.append("https://fontainhas.in/");
            touristcapacity.append("No Delivery");
            t5.setText(distancestring);
            t6.setText(timetourist);
            t7.setText(touristrating);
            t8.setText(touristaddress);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.touristimage);
            img1.setImageResource(R.drawable.fountainhas);
        }
        else if(name.equals("Reis Magos Fort"))
        {
            StringBuffer timetourist=new StringBuffer("");
            StringBuffer touristrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer touristaddress=new StringBuffer("");
            StringBuffer touristcapacity=new StringBuffer("");
            touristrating.delete(0,touristrating.length());
            rating.append("4.5 Stars");
            timetourist.delete(0,timetourist.length());
            touristaddress.delete(0,touristaddress.length());
            touristaddress.append("Reis Margos Rd, beside three kings church, Bardez, Verem, Goa 403114");
            timetourist.append("9:30AM – 5PM");
            distancestring= "32.8 KM";
            touristrating.append("http://www.goatourism.gov.in/destinations/forts/154-reis-magos-fort");
            touristcapacity.append("No Delivery");
            t5.setText(distancestring);
            t6.setText(timetourist);
            t7.setText(touristrating);
            t8.setText(touristaddress);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.touristimage);
            img1.setImageResource(R.drawable.reismagosfort);
        }
        else if(name.equals("The Saturday Night Market"))
        {
            StringBuffer timetourist=new StringBuffer("");
            StringBuffer touristrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer touristaddress=new StringBuffer("");
            StringBuffer touristcapacity=new StringBuffer("");
            touristrating.delete(0,touristrating.length());
            rating.append("4.0 Stars");
            timetourist.delete(0,timetourist.length());
            touristaddress.delete(0,touristaddress.length());
            touristaddress.append("H. No. 392 Casa Babu, Aguada - Siolim Rd, Arpora, Goa 403516");
            timetourist.append("12AM - 12:30PM\n 5PM - 3:30AM");
            distancestring= "42.5 KM";
            touristrating.append("https://www.saturdaynightmarket.com/");
            touristcapacity.append("No Delivery");
            t5.setText(distancestring);
            t6.setText(timetourist);
            t7.setText(touristrating);
            t8.setText(touristaddress);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.touristimage);
            img1.setImageResource(R.drawable.saturday);
        }
        else if(name.equals("Baga Beach"))
        {
            StringBuffer timetourist=new StringBuffer("");
            StringBuffer touristrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer touristaddress=new StringBuffer("");
            StringBuffer touristcapacity=new StringBuffer("");
            touristrating.delete(0,touristrating.length());
            rating.append("4.0 Stars");
            timetourist.delete(0,timetourist.length());
            touristaddress.delete(0,touristaddress.length());
            touristaddress.append("Baga Beach, Goa 403519");
            timetourist.append("All Day");
            distancestring= "42.9 KM";
            touristrating.append("No Website");
            touristcapacity.append("No Delivery");
            t5.setText(distancestring);
            t6.setText(timetourist);
            t7.setText(touristrating);
            t8.setText(touristaddress);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.touristimage);
            img1.setImageResource(R.drawable.bagabeach);
        }
        else if(name.equals("Calangute Beach"))
        {
            StringBuffer timetourist=new StringBuffer("");
            StringBuffer touristrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer touristaddress=new StringBuffer("");
            StringBuffer touristcapacity=new StringBuffer("");
            touristrating.delete(0,touristrating.length());
            rating.append("4.0 Stars");
            timetourist.delete(0,timetourist.length());
            touristaddress.delete(0,touristaddress.length());
            touristaddress.append("Calangute Beach, Goa 403519");
            timetourist.append("All Day");
            distancestring= "41.0 KM";
            touristrating.append("No Website");
            touristcapacity.append("No Delivery");
            t5.setText(distancestring);
            t6.setText(timetourist);
            t7.setText(touristrating);
            t8.setText(touristaddress);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.touristimage);
            img1.setImageResource(R.drawable.calangutebeack);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}