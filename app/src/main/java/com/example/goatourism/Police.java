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

public class Police extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    public int x,y;
    public TextView t1,t2,t3,t4;
    public double distance;
    public int xcoordinates, ycoordinates;
    public long phone;
    public ImageView img;


    public String policename,distancestring,phonenumber,ratingpolice;
    public Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);
        Intent intent=getIntent();
        int x=intent.getIntExtra("x",0);
        int y=intent.getIntExtra("y",0);
        spinner=findViewById(R.id.policespinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.policename, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        t1=(TextView) findViewById(R.id.policearea);
        t2=(TextView) findViewById(R.id.timingpolice);
        t3=(TextView) findViewById(R.id.policephone);
        t4=(TextView) findViewById(R.id.policeaddress);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        String text=parent.getItemAtPosition(position).toString();
        policename=text;
        if(policename.equals("Porvorim Police Station"))
        {
            StringBuffer timeopen=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer address=new StringBuffer("");
            rating.delete(0,timeopen.length());
            timeopen.delete(0,timeopen.length());
            address.delete(0,timeopen.length());
            address.append("Pundalik Nagar, Alto Porvorim");//Address
            distance=31.3;
            timeopen.append("24 Hours");//Time Open
            distancestring=Double.toString(distance);
            distancestring=distancestring+" KM";
            rating.append("0832 241 7704");//Phone
            t1.setText(distancestring);
            t2.setText(timeopen);
            t3.setText(rating);
            t4.setText(address);
            img=(ImageView) findViewById(R.id.policeimage);
            img.setImageResource(R.drawable.porvorimpolice);
        }
        else if(policename.equals("Verna Police Station"))
        {
            StringBuffer timeopen=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer address=new StringBuffer("");
            rating.delete(0,timeopen.length());
            timeopen.delete(0,timeopen.length());
            address.delete(0,timeopen.length());
            address.append("NH 17 Bypass, Verna, Goa 403722");//Address
            distance=17;
            timeopen.append("24 Hours");//Time Open
            distancestring=Double.toString(distance);
            distancestring=distancestring+" KM";
            rating.append("0832 278 2325");//Phone
            t1.setText(distancestring);
            t2.setText(timeopen);
            t3.setText(rating);
            t4.setText(address);
            img=(ImageView) findViewById(R.id.policeimage);
            img.setImageResource(R.drawable.vernapolice);
        }
        else if(policename.equals("Vasco Police Station"))
        {
            StringBuffer timeopen=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer address=new StringBuffer("");
            rating.delete(0,timeopen.length());
            timeopen.delete(0,timeopen.length());
            address.delete(0,timeopen.length());
            address.append("Vasco, opposite Indian oil Corporation, Vasco da Gama, Goa 403802");//Address
            distance=5.4;
            timeopen.append("24 Hours");//Time Open
            distancestring=Double.toString(distance);
            distancestring=distancestring+" KM";
            rating.append("0832 251 2488");//Phone
            t1.setText(distancestring);
            t2.setText(timeopen);
            t3.setText(rating);
            t4.setText(address);
            img=(ImageView) findViewById(R.id.policeimage);
            img.setImageResource(R.drawable.vascopolice);
        }
        else if(policename.equals("Old Goa Police Station"))
        {
            StringBuffer timeopen=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer address=new StringBuffer("");
            rating.delete(0,timeopen.length());
            timeopen.delete(0,timeopen.length());
            address.delete(0,timeopen.length());
            address.append("GW27+8VM, Goa Velha, Goa 403402");//Address
            distance=26.6;
            timeopen.append("24 Hours");//Time Open
            distancestring=Double.toString(distance);
            distancestring=distancestring+" KM";
            rating.append("0832 228 5301");//Phone
            t1.setText(distancestring);
            t2.setText(timeopen);
            t3.setText(rating);
            t4.setText(address);
            img=(ImageView) findViewById(R.id.policeimage);
            img.setImageResource(R.drawable.oldgoapolice);
        }
        else if(policename.equals("Margao Town Police Station"))
        {
            StringBuffer timeopen=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            StringBuffer address=new StringBuffer("");
            rating.delete(0,timeopen.length());
            timeopen.delete(0,timeopen.length());
            address.delete(0,timeopen.length());
            address.append("Comba, Margao, Goa 403601");//Address
            distance=27.7;
            timeopen.append("24 Hours");//Time Open
            distancestring=Double.toString(distance);
            distancestring=distancestring+" KM";
            rating.append("0832 270 5095");//Phone
            t1.setText(distancestring);
            t2.setText(timeopen);
            t3.setText(rating);
            t4.setText(address);
            img=(ImageView) findViewById(R.id.policeimage);
            img.setImageResource(R.drawable.margaopolice);
        }
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {

    }
}