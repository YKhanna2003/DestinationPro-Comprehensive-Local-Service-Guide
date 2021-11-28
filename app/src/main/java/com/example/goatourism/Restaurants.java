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

public class Restaurants extends AppCompatActivity implements AdapterView.OnItemSelectedListener
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
        setContentView(R.layout.activity_restaurants);
        Intent intent=getIntent();
        int x=intent.getIntExtra("x",0);
        int y=intent.getIntExtra("y",0);
        spinner9=findViewById(R.id.spinnerrestaurant);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.restaurant, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9.setAdapter(adapter);
        spinner9.setOnItemSelectedListener(this);
        t5=(TextView) findViewById(R.id.distancerestaurant);
        t6=(TextView) findViewById(R.id.timingsrestaurant);
        t7=(TextView) findViewById(R.id.ratingrestaurant);
        t8=(TextView) findViewById(R.id.addressrestaurant);
        t9=(TextView) findViewById(R.id.deliveryrestaurant);
        t10=(TextView) findViewById(R.id.restaurantrating);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        String text=parent.getItemAtPosition(position).toString();
        name=text;
        if(name.equals("Jack Rabbit Slims"))
        {
            StringBuffer timerestaurant=new StringBuffer("");
            StringBuffer restaurantrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer restaurantaddress=new StringBuffer("");
            StringBuffer restaurantcapacity=new StringBuffer("");
            restaurantrating.delete(0,restaurantrating.length());
            rating.append("5 Stars");
            timerestaurant.delete(0,timerestaurant.length());
            restaurantaddress.delete(0,restaurantaddress.length());
            restaurantaddress.append("Vasvaddo Beach Road Opposite Taj Exotica, Benaulim 403716 India");
            timerestaurant.append("12PM – 1:30AM");
            distancestring= "28.3 KM";
            restaurantrating.append("98496 90077");
            restaurantcapacity.append("No Delivery");
            t5.setText(distancestring);
            t6.setText(timerestaurant);
            t7.setText(restaurantrating);
            t8.setText(restaurantaddress);
            t9.setText(restaurantcapacity);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.restaurantimage);
            img1.setImageResource(R.drawable.jackrabbit);
        }
        else if(name.equals("Barbeque Bay"))
        {
            StringBuffer timerestaurant=new StringBuffer("");
            StringBuffer restaurantrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer restaurantaddress=new StringBuffer("");
            StringBuffer restaurantcapacity=new StringBuffer("");
            restaurantrating.delete(0,restaurantrating.length());
            rating.append("5 Stars");
            timerestaurant.delete(0,timerestaurant.length());
            restaurantaddress.delete(0,restaurantaddress.length());
            restaurantaddress.append("Club Mahindra Emerald Palms, Pedda Uttor Doxi, Varca 403721 India");
            timerestaurant.append("7:30AM – 10:30PM");
            distancestring= "29.5 KM";
            restaurantrating.append("84119 69922");
            restaurantcapacity.append("No Delivery");
            t5.setText(distancestring);
            t6.setText(timerestaurant);
            t7.setText(restaurantrating);
            t8.setText(restaurantaddress);
            t9.setText(restaurantcapacity);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.restaurantimage);
            img1.setImageResource(R.drawable.bbqbay);
        }
        else if(name.equals("Chique Shanti"))
        {
            StringBuffer timerestaurant=new StringBuffer("");
            StringBuffer restaurantrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer restaurantaddress=new StringBuffer("");
            StringBuffer restaurantcapacity=new StringBuffer("");
            restaurantrating.delete(0,restaurantrating.length());
            rating.append("5 Stars");
            timerestaurant.delete(0,timerestaurant.length());
            restaurantaddress.delete(0,restaurantaddress.length());
            restaurantaddress.append("Survey No 272/22 Mandrem Village, Mandrem 403527 India");
            timerestaurant.append("8:30AM – 11:30PM");
            distancestring= "58.4 KM";
            restaurantrating.append("76786 31117");
            restaurantcapacity.append("Delivery");
            t5.setText(distancestring);
            t6.setText(timerestaurant);
            t7.setText(restaurantrating);
            t8.setText(restaurantaddress);
            t9.setText(restaurantcapacity);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.restaurantimage);
            img1.setImageResource(R.drawable.chiqueshanti);
        }
        else if(name.equals("Kava"))
        {
            StringBuffer timerestaurant=new StringBuffer("");
            StringBuffer restaurantrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer restaurantaddress=new StringBuffer("");
            StringBuffer restaurantcapacity=new StringBuffer("");
            restaurantrating.delete(0,restaurantrating.length());
            rating.append("5 Stars");
            timerestaurant.delete(0,timerestaurant.length());
            restaurantaddress.delete(0,restaurantaddress.length());
            restaurantaddress.append("Survey No 11/14, Plot B, C & E Simvaddo, Anjuna, Goa 403509");
            timerestaurant.append("6:30AM – 11:00PM");
            distancestring= "43.5 KM";
            restaurantrating.append("83223 24400");
            restaurantcapacity.append("Delivery");
            t5.setText(distancestring);
            t6.setText(timerestaurant);
            t7.setText(restaurantrating);
            t8.setText(restaurantaddress);
            t9.setText(restaurantcapacity);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.restaurantimage);
            img1.setImageResource(R.drawable.kavarestaurant);
        }
        else if(name.equals("Copperleaf"))
        {
            StringBuffer timerestaurant=new StringBuffer("");
            StringBuffer restaurantrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer restaurantaddress=new StringBuffer("");
            StringBuffer restaurantcapacity=new StringBuffer("");
            restaurantrating.delete(0,restaurantrating.length());
            rating.append("4.5 Stars");
            timerestaurant.delete(0,timerestaurant.length());
            restaurantaddress.delete(0,restaurantaddress.length());
            restaurantaddress.append("Chogm Road, Alto-Porvorim 403521 India");
            timerestaurant.append("6:30AM – 11:00PM");
            distancestring= "33.8 KM";
            restaurantrating.append("75582 98641");
            restaurantcapacity.append("Delivery");
            t5.setText(distancestring);
            t6.setText(timerestaurant);
            t7.setText(restaurantrating);
            t8.setText(restaurantaddress);
            t9.setText(restaurantcapacity);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.restaurantimage);
            img1.setImageResource(R.drawable.copperleaf);
        }
        else if(name.equals("Treetop Tava"))
        {
            StringBuffer timerestaurant=new StringBuffer("");
            StringBuffer restaurantrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer restaurantaddress=new StringBuffer("");
            StringBuffer restaurantcapacity=new StringBuffer("");
            restaurantrating.delete(0,restaurantrating.length());
            rating.append("5 Stars");
            timerestaurant.delete(0,timerestaurant.length());
            restaurantaddress.delete(0,restaurantaddress.length());
            restaurantaddress.append("The Bay Agonda, Near Saleri, Agonda 403702 India");
            timerestaurant.append("6:30AM – 11:00PM");
            distancestring= "59.7 KM";
            restaurantrating.append("86003 13111");
            restaurantcapacity.append("No Delivery");
            t5.setText(distancestring);
            t6.setText(timerestaurant);
            t7.setText(restaurantrating);
            t8.setText(restaurantaddress);
            t9.setText(restaurantcapacity);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.restaurantimage);
            img1.setImageResource(R.drawable.treetoprestaurant);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}