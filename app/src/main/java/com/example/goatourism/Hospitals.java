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

public class Hospitals extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    public TextView t5,t6,t7,t8;
    public double distance2;
    public int scoordinates2, ycoordinates2;
    public long phone2;
    public ImageView img1;


    public String hospitalname2,distancestring2,phonenumber2,ratinghospital2;
    public Spinner spinner9;
    public int x2,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);
        Intent intent=getIntent();
        x2=intent.getIntExtra("x",0);
        y2=intent.getIntExtra("y",0);
        spinner9=findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.hospitalnameit, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9.setAdapter(adapter);
        spinner9.setOnItemSelectedListener(this);
        t5=(TextView) findViewById(R.id.distancebus2);
        t6=(TextView) findViewById(R.id.timingsbus2);
        t7=(TextView) findViewById(R.id.ratingbus2);
        t8=(TextView) findViewById(R.id.address3);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        String text=parent.getItemAtPosition(position).toString();
        hospitalname2=text;
        if(hospitalname2.equals("Manipal Hospitals Goa"))
        {
            StringBuffer timehospital=new StringBuffer("");
            StringBuffer hospitalrating=new StringBuffer("");
            StringBuffer hospitaladdress=new StringBuffer("");
            hospitalrating.delete(0,hospitalrating.length());
            timehospital.delete(0,timehospital.length());
            hospitaladdress.delete(0,hospitaladdress.length());
            hospitaladdress.append("Panaji, Dr E Borges Rd, Dona Paula, Goa 403004");
            timehospital.append("24 Hours");
            distancestring2= "403004 and nearby areas";
            hospitalrating.append("1800 102 5555");
            t5.setText(distancestring2);
            t6.setText(timehospital);
            t7.setText(hospitalrating);
            t8.setText(hospitaladdress);
            img1 = (ImageView) findViewById(R.id.busimage2);
            img1.setImageResource(R.drawable.manipalhospital);
        }
        else if(hospitalname2.equals("SMRC V. M. Salgaocar Hospital"))
        {
            StringBuffer timehospital=new StringBuffer("");
            StringBuffer hospitalrating=new StringBuffer("");
            StringBuffer hospitaladdress=new StringBuffer("");
            hospitalrating.delete(0,hospitalrating.length());
            timehospital.delete(0,timehospital.length());
            hospitaladdress.delete(0,hospitaladdress.length());
            hospitaladdress.append("Off, Airport Rd, Chicalim, Goa 403711");
            timehospital.append("24 Hours");
            distancestring2= "403711 and Nearby Areas";
            hospitalrating.append("0832 669 1919");
            t5.setText(distancestring2);
            t6.setText(timehospital);
            t7.setText(hospitalrating);
            t8.setText(hospitaladdress);
            img1 = (ImageView) findViewById(R.id.busimage2);
            img1.setImageResource(R.drawable.smrc);
        }
        else if(hospitalname2.equals("Healthway Hospitals Goa"))
        {
            StringBuffer timehospital=new StringBuffer("");
            StringBuffer hospitalrating=new StringBuffer("");
            StringBuffer hospitaladdress=new StringBuffer("");
            hospitalrating.delete(0,hospitalrating.length());
            timehospital.delete(0,timehospital.length());
            hospitaladdress.delete(0,hospitaladdress.length());
            hospitaladdress.append("Plot No 132/1 (Part), Ella Village, Goa Velha, 403402");
            timehospital.append("24 Hours");
            distancestring2= "403402 and Nearby Areas";
            hospitalrating.append("0832 246 7666");
            t5.setText(distancestring2);
            t6.setText(timehospital);
            t7.setText(hospitalrating);
            t8.setText(hospitaladdress);
            img1 = (ImageView) findViewById(R.id.busimage2);
            img1.setImageResource(R.drawable.healthway);
        }
        else if(hospitalname2.equals("Pai Hospital"))
        {
            StringBuffer timehospital=new StringBuffer("");
            StringBuffer hospitalrating=new StringBuffer("");
            StringBuffer hospitaladdress=new StringBuffer("");
            hospitalrating.delete(0,hospitalrating.length());
            timehospital.delete(0,timehospital.length());
            hospitaladdress.delete(0,hospitaladdress.length());
            hospitaladdress.append("Pai Hospital, Vaddem, Vasco da Gama, Goa 403802");
            timehospital.append("Open 24 hours");
            distancestring2= "403802 and Nearby Areas";
            hospitalrating.append("0832 251 3641");
            t5.setText(distancestring2);
            t6.setText(timehospital);
            t7.setText(hospitalrating);
            t8.setText(hospitaladdress);
            img1 = (ImageView) findViewById(R.id.busimage2);
            img1.setImageResource(R.drawable.pai);
        }
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {

    }
}