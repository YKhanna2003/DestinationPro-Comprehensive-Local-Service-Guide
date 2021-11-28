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

public class Hotels extends AppCompatActivity implements AdapterView.OnItemSelectedListener
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
        setContentView(R.layout.activity_hotels);
        Intent intent=getIntent();
        x=intent.getIntExtra("x",0);
        y=intent.getIntExtra("y",0);
        spinner9=findViewById(R.id.spinnerhotel);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.hotelname, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9.setAdapter(adapter);
        spinner9.setOnItemSelectedListener(this);
        t5=(TextView) findViewById(R.id.distancehotel);
        t6=(TextView) findViewById(R.id.timingshotel);
        t7=(TextView) findViewById(R.id.ratinghotel);
        t8=(TextView) findViewById(R.id.addresshotel);
        t9=(TextView) findViewById(R.id.capacityhotels);
        t10=(TextView) findViewById(R.id.hotelrating);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        String text=parent.getItemAtPosition(position).toString();
        name=text;
        if(name.equals("Holiday Inn Resort Goa, an IHG hotel"))
        {
            StringBuffer timehotel=new StringBuffer("");
            StringBuffer hotelrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer hoteladdress=new StringBuffer("");
            StringBuffer hotelcapacity=new StringBuffer("");
            hotelrating.delete(0,hotelrating.length());
            rating.append("4.5 Stars");
            timehotel.delete(0,timehotel.length());
            hoteladdress.delete(0,hoteladdress.length());
            hoteladdress.append("Mobor Beach South Goa, Cavelossim 403731 India");
            timehotel.append("24 Hours");
            distancestring= "36.3 KM";
            hotelrating.append("83228 70000");
            hotelcapacity.append("203 Rooms");
            t5.setText(distancestring);
            t6.setText(timehotel);
            t7.setText(hotelrating);
            t8.setText(hoteladdress);
            t9.setText(hotelcapacity);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.hotelimage);
            img1.setImageResource(R.drawable.holidayinn);
        }
        else if(name.equals("Antares Beach Resort"))
        {
            StringBuffer timehotel=new StringBuffer("");
            StringBuffer hotelrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer hoteladdress=new StringBuffer("");
            StringBuffer hotelcapacity=new StringBuffer("");
            hotelrating.delete(0,hotelrating.length());
            rating.append("4 Stars");
            timehotel.delete(0,timehotel.length());
            hoteladdress.delete(0,hoteladdress.length());
            hoteladdress.append("Small Vagator Beach, Vagator 403509 India");
            timehotel.append("24 Hours");
            distancestring= "47.3 KM";
            hotelrating.append("73500 11528");
            hotelcapacity.append("14 Rooms");
            t5.setText(distancestring);
            t6.setText(timehotel);
            t7.setText(hotelrating);
            t8.setText(hoteladdress);
            t9.setText(hotelcapacity);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.hotelimage);
            img1.setImageResource(R.drawable.antareshotel);
        }
        else if(name.equals("Fairfield by Marriott Goa Anjuna"))
        {
            StringBuffer timehotel=new StringBuffer("");
            StringBuffer hotelrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer hoteladdress=new StringBuffer("");
            StringBuffer hotelcapacity=new StringBuffer("");
            hotelrating.delete(0,hotelrating.length());
            rating.append("4.5 Stars");
            timehotel.delete(0,timehotel.length());
            hoteladdress.delete(0,hoteladdress.length());
            hoteladdress.append("14 Plot B Survey No 11 Goa, Anjuna, Bardez 403509 India");
            timehotel.append("24 Hours");
            distancestring= "26.2 KM";
            hotelrating.append("84463 10595");
            hotelcapacity.append("130 Rooms");
            t5.setText(distancestring);
            t6.setText(timehotel);
            t7.setText(hotelrating);
            t8.setText(hoteladdress);
            t9.setText(hotelcapacity);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.hotelimage);
            img1.setImageResource(R.drawable.fairfielhotel);
        }
        else if(name.equals("BloomSuites, Calangute"))
        {
            StringBuffer timehotel=new StringBuffer("");
            StringBuffer hotelrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer hoteladdress=new StringBuffer("");
            StringBuffer hotelcapacity=new StringBuffer("");
            hotelrating.delete(0,hotelrating.length());
            rating.append("4.5 Stars");
            timehotel.delete(0,timehotel.length());
            hoteladdress.delete(0,hoteladdress.length());
            hoteladdress.append("Calangute - Arpora Rd, Naikawaddo, Saligao, Goa 403516");
            timehotel.append("24 Hours");
            distancestring= "40.3 KM";
            hotelrating.append("84858 00384");
            hotelcapacity.append("125 Rooms");
            t5.setText(distancestring);
            t6.setText(timehotel);
            t7.setText(hotelrating);
            t8.setText(hoteladdress);
            t9.setText(hotelcapacity);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.hotelimage);
            img1.setImageResource(R.drawable.bloomsuites);
        }
        else if(name.equals("Morpho Calangute Goa"))
        {
            StringBuffer timehotel=new StringBuffer("");
            StringBuffer hotelrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer hoteladdress=new StringBuffer("");
            StringBuffer hotelcapacity=new StringBuffer("");
            hotelrating.delete(0,hotelrating.length());
            rating.append("5 Stars");
            timehotel.delete(0,timehotel.length());
            hoteladdress.delete(0,hoteladdress.length());
            hoteladdress.append("Survey No 193/3, Calangute 403516 India");
            timehotel.append("24 Hours");
            distancestring= "41.2 KM";
            hotelrating.append("77956 65070");
            hotelcapacity.append("61 Rooms");
            t5.setText(distancestring);
            t6.setText(timehotel);
            t7.setText(hotelrating);
            t8.setText(hoteladdress);
            t9.setText(hotelcapacity);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.hotelimage);
            img1.setImageResource(R.drawable.morphohotels);
        }
        else if(name.equals("White Woods Resort and Spa"))
        {
            StringBuffer timehotel=new StringBuffer("");
            StringBuffer hotelrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer hoteladdress=new StringBuffer("");
            StringBuffer hotelcapacity=new StringBuffer("");
            hotelrating.delete(0,hotelrating.length());
            rating.append("4.5 Stars");
            timehotel.delete(0,timehotel.length());
            hoteladdress.delete(0,hoteladdress.length());
            hoteladdress.append("New wada ,Morjim, Pernem, Morjim, Goa 403512");
            timehotel.append("24 Hours");
            distancestring= "56.0 KM";
            hotelrating.append("74474 38932");
            hotelcapacity.append("31 Rooms");
            t5.setText(distancestring);
            t6.setText(timehotel);
            t7.setText(hotelrating);
            t8.setText(hoteladdress);
            t9.setText(hotelcapacity);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.hotelimage);
            img1.setImageResource(R.drawable.whitewoods);
        }
        else if(name.equals("The LaLiT Golf and Spa Resort Goa"))
        {
            StringBuffer timehotel=new StringBuffer("");
            StringBuffer hotelrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer hoteladdress=new StringBuffer("");
            StringBuffer hotelcapacity=new StringBuffer("");
            hotelrating.delete(0,hotelrating.length());
            rating.append("4.5 Stars");
            timehotel.delete(0,timehotel.length());
            hoteladdress.delete(0,hoteladdress.length());
            hoteladdress.append("Raj Baga, Canacona 403702 India");
            timehotel.append("24 Hours");
            distancestring= "64.8 KM";
            hotelrating.append("83226 67777");
            hotelcapacity.append("265 Rooms");
            t5.setText(distancestring);
            t6.setText(timehotel);
            t7.setText(hotelrating);
            t8.setText(hoteladdress);
            t9.setText(hotelcapacity);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.hotelimage);
            img1.setImageResource(R.drawable.lalitgolfhotel);
        }
        else if(name.equals("Santana Beach Resort"))
        {
            StringBuffer timehotel=new StringBuffer("");
            StringBuffer hotelrating=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer hoteladdress=new StringBuffer("");
            StringBuffer hotelcapacity=new StringBuffer("");
            hotelrating.delete(0,hotelrating.length());
            rating.append("4.5 Stars");
            timehotel.delete(0,timehotel.length());
            hoteladdress.delete(0,hoteladdress.length());
            hoteladdress.append("Quinta Costa Frias Complex, Shop No. P-1-2, Dando, Candolim, Goa 403515");
            timehotel.append("24 Hours");
            distancestring= "38.0 KM";
            hotelrating.append("98224 84446");
            hotelcapacity.append("50 Rooms");
            t5.setText(distancestring);
            t6.setText(timehotel);
            t7.setText(hotelrating);
            t8.setText(hoteladdress);
            t9.setText(hotelcapacity);
            t10.setText(rating);
            img1 = (ImageView) findViewById(R.id.hotelimage);
            img1.setImageResource(R.drawable.santanahotel);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}