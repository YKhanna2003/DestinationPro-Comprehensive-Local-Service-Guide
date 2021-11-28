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
import android.widget.Toast;

public class Busstops extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
        public TextView t1,t2,t3,t4;
        public double distance;
        public int scoordinates, ycoordinates;
        public long phone;
        public ImageView img;


        public String busname,distancestring,phonenumber,ratingbus;
        public Spinner spinner;
        public int x,y;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busstops);
        Intent intent=getIntent();
        x=intent.getIntExtra("x",0);
        y=intent.getIntExtra("y",0);
        spinner=findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.busname, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        t1=(TextView) findViewById(R.id.distancebus);
        t2=(TextView) findViewById(R.id.timingsbus);
        t3=(TextView) findViewById(R.id.ratingbus);
        t4=(TextView) findViewById(R.id.address);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        String text=parent.getItemAtPosition(position).toString();
        busname=text;
        if(busname.equals("Kadamba Bus Station"))
        {
            StringBuffer timeopen=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer address=new StringBuffer("");
            rating.delete(0,timeopen.length());
            timeopen.delete(0,timeopen.length());
            address.delete(0,timeopen.length());
            address.append("Swatantra Path, Vaddem, Vasco da Gama, Goa 403802");
            distance=3.4;
            timeopen.append("6 AM to 11 PM");
            distancestring=Double.toString(distance);
            distancestring=distancestring+" KM";
            rating.append("3.1 Stars");
            t1.setText(distancestring);
            t2.setText(timeopen);
            t3.setText(rating);
            t4.setText(address);
            img=(ImageView) findViewById(R.id.busimage);
            img.setImageResource(R.drawable.kadamba);
        }
        else if(busname.equals("Margao Bus Terminal"))
        {
            StringBuffer timeopen=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer address=new StringBuffer("");
            rating.delete(0,timeopen.length());
            timeopen.delete(0,timeopen.length());
            address.delete(0,timeopen.length());
            address.append("Edapally - Panvel Hwy, Fatorda, Goa 403602");
            distance=25.4;
            timeopen.append("5 AM to 11 PM");
            distancestring=Double.toString(distance);
            distancestring=distancestring+" KM";
            rating.append("3.6 Stars");
            t1.setText(distancestring);
            t2.setText(timeopen);
            t3.setText(rating);
            t4.setText(address);
            img=(ImageView) findViewById(R.id.busimage);
            img.setImageResource(R.drawable.margao);
        }
        else if(busname.equals("Sinquerim Bus Stop"))
        {
            StringBuffer timeopen=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer address=new StringBuffer("");
            rating.delete(0,timeopen.length());
            timeopen.delete(0,timeopen.length());
            address.delete(0,timeopen.length());
            address.append("Fort Aguada Rd, Aguada Fort Area, Candolim, Goa 403515");
            distance=38.9;
            timeopen.append("6 AM to 11 PM");
            distancestring=Double.toString(distance);
            distancestring=distancestring+" KM";
            rating.append("4 Stars");
            t1.setText(distancestring);
            t2.setText(timeopen);
            t3.setText(rating);
            t4.setText(address);
            img=(ImageView) findViewById(R.id.busimage);
            img.setImageResource(R.drawable.sinquerim);
        }
        else if(busname.equals("Dhempe College Bus Stop"))
        {
            StringBuffer timeopen=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer address=new StringBuffer("");
            rating.delete(0,timeopen.length());
            timeopen.delete(0,timeopen.length());
            address.delete(0,timeopen.length());
            address.append("Miramar, Panaji, Goa 403001");
            distance=31.4;
            timeopen.append("4 AM to 11 PM");
            distancestring=Double.toString(distance);
            distancestring=distancestring+" KM";
            rating.append("3.8 Stars");
            t1.setText(distancestring);
            t2.setText(timeopen);
            t3.setText(rating);
            t4.setText(address);
            img=(ImageView) findViewById(R.id.busimage);
            img.setImageResource(R.drawable.dhempe);
        }
        else if(busname.equals("Mapusa Bus Stand"))
        {
            StringBuffer timeopen=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer address=new StringBuffer("");
            rating.delete(0,timeopen.length());
            timeopen.delete(0,timeopen.length());
            address.delete(0,timeopen.length());
            address.append("Marod, Mapusa, Goa 403507");
            distance=39.7;
            timeopen.append("5 AM to 12 AM");
            distancestring=Double.toString(distance);
            distancestring=distancestring+" KM";
            rating.append("3.5 Stars");
            t1.setText(distancestring);
            t2.setText(timeopen);
            t3.setText(rating);
            t4.setText(address);
            img=(ImageView) findViewById(R.id.busimage);
            img.setImageResource(R.drawable.mapusa);
        }
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {

    }
}