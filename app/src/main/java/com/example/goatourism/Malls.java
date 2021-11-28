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

public class Malls extends AppCompatActivity implements AdapterView.OnItemSelectedListener
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
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malls);
        Intent intent=getIntent();
        int x=intent.getIntExtra("x",0);
        int y=intent.getIntExtra("y",0);
        spinner9=findViewById(R.id.spinnermall);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.malls, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9.setAdapter(adapter);
        spinner9.setOnItemSelectedListener(this);
        t5=(TextView) findViewById(R.id.distancemall);
        t6=(TextView) findViewById(R.id.timingsmall);
        t7=(TextView) findViewById(R.id.ratingmall);
        t8=(TextView) findViewById(R.id.addressmall);
        t10=(TextView) findViewById(R.id.foodzonemall);
        t9=(TextView) findViewById(R.id.playzonemall);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        String text=parent.getItemAtPosition(position).toString();
        name=text;
        if(name.equals("Mall De Goa"))
        {
            StringBuffer address=new StringBuffer("");
            StringBuffer timings=new StringBuffer("");
            StringBuffer playzone=new StringBuffer("");
            StringBuffer foodzone=new StringBuffer("");
            StringBuffer distance=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            address.delete(0,address.length());
            timings.delete(0,timings.length());
            playzone.delete(0,playzone.length());
            foodzone.delete(0,foodzone.length());
            distance.delete(0,distance.length());
            rating.delete(0,rating.length());
            address.append("NH 66, Alto Porvorim, Pilerne, Goa 403521");
            timings.append("10AM – 10PM");
            playzone.append("Yes");
            foodzone.append("Yes");
            distance.append("32.8 KM");
            rating.append("4.2 Stars");
            t5.setText(distance.toString());
            t6.setText(timings.toString());
            t7.setText(rating.toString());
            t8.setText(address.toString());
            t10.setText(foodzone.toString());
            t9.setText(playzone.toString());
            img1 = (ImageView) findViewById(R.id.shoppingimage);
            img1.setImageResource(R.drawable.malldegoa);
        }
        else if(name.equals("Habitat (CIE)"))
        {
            StringBuffer address=new StringBuffer("");
            StringBuffer timings=new StringBuffer("");
            StringBuffer playzone=new StringBuffer("");
            StringBuffer foodzone=new StringBuffer("");
            StringBuffer distance=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            address.delete(0,address.length());
            timings.delete(0,timings.length());
            playzone.delete(0,playzone.length());
            foodzone.delete(0,foodzone.length());
            distance.delete(0,distance.length());
            rating.delete(0,rating.length());
            address.append("Navelkar Estate, H. NO.47/A/1, BAINGUINIM-SE, Old Goa, Goa Velha, Goa 403110");
            timings.append("9AM – 7PM");
            playzone.append("No");
            foodzone.append("No");
            distance.append("26.5 KM");
            rating.append("4.5 Stars");
            t5.setText(distance.toString());
            t6.setText(timings.toString());
            t7.setText(rating.toString());
            t8.setText(address.toString());
            t10.setText(foodzone.toString());
            t9.setText(playzone.toString());
            img1 = (ImageView) findViewById(R.id.shoppingimage);
            img1.setImageResource(R.drawable.habitatmall);
        }
        else if(name.equals("Ella High Street Mall"))
        {
            StringBuffer address=new StringBuffer("");
            StringBuffer timings=new StringBuffer("");
            StringBuffer playzone=new StringBuffer("");
            StringBuffer foodzone=new StringBuffer("");
            StringBuffer distance=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            address.delete(0,address.length());
            timings.delete(0,timings.length());
            playzone.delete(0,playzone.length());
            foodzone.delete(0,foodzone.length());
            distance.delete(0,distance.length());
            rating.delete(0,rating.length());
            address.append("Ella Cidade, NH 4A highway, Old Goa by-pass road, Kadamba Plateau, Goa Velha, 403110");
            timings.append("9:30AM – 6PM");
            playzone.append("No");
            foodzone.append("No");
            distance.append("26.6 KM");
            rating.append("3.0 Stars");
            t5.setText(distance.toString());
            t6.setText(timings.toString());
            t7.setText(rating.toString());
            t8.setText(address.toString());
            t10.setText(foodzone.toString());
            t9.setText(playzone.toString());
            img1 = (ImageView) findViewById(R.id.shoppingimage);
            img1.setImageResource(R.drawable.ella);
        }
        else if(name.equals("Valanka Shopping Mall"))
        {
            StringBuffer address=new StringBuffer("");
            StringBuffer timings=new StringBuffer("");
            StringBuffer playzone=new StringBuffer("");
            StringBuffer foodzone=new StringBuffer("");
            StringBuffer distance=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            address.delete(0,address.length());
            timings.delete(0,timings.length());
            playzone.delete(0,playzone.length());
            foodzone.delete(0,foodzone.length());
            distance.delete(0,distance.length());
            rating.delete(0,rating.length());
            address.append("Naika Vaddo, near St. Anthony Chapel, Calangute, Goa 403516");
            timings.append("Open 24 Hours");
            playzone.append("No");
            foodzone.append("Yes");
            distance.append("40.0 KM");
            rating.append("4.2 Stars");
            t5.setText(distance.toString());
            t6.setText(timings.toString());
            t7.setText(rating.toString());
            t8.setText(address.toString());
            t10.setText(foodzone.toString());
            t9.setText(playzone.toString());
            img1 = (ImageView) findViewById(R.id.shoppingimage);
            img1.setImageResource(R.drawable.valanka);
        }
        else if(name.equals("Caculo Mall"))
        {
            StringBuffer address=new StringBuffer("");
            StringBuffer timings=new StringBuffer("");
            StringBuffer playzone=new StringBuffer("");
            StringBuffer foodzone=new StringBuffer("");
            StringBuffer distance=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            address.delete(0,address.length());
            timings.delete(0,timings.length());
            playzone.delete(0,playzone.length());
            foodzone.delete(0,foodzone.length());
            distance.delete(0,distance.length());
            rating.delete(0,rating.length());
            address.append("16 Shanta, St. Inez Road, Panaji, Goa ");
            timings.append("10:00 AM - 9:00 PM");
            playzone.append("Yes");
            foodzone.append("Yes");
            distance.append("31.8 KM");
            rating.append("3.8 Stars");
            t5.setText(distance.toString());
            t6.setText(timings.toString());
            t7.setText(rating.toString());
            t8.setText(address.toString());
            t10.setText(foodzone.toString());
            t9.setText(playzone.toString());
            img1 = (ImageView) findViewById(R.id.shoppingimage);
            img1.setImageResource(R.drawable.caculomall);
        }
        else if(name.equals("1930 Vasco"))
        {
            StringBuffer address=new StringBuffer("");
            StringBuffer timings=new StringBuffer("");
            StringBuffer playzone=new StringBuffer("");
            StringBuffer foodzone=new StringBuffer("");
            StringBuffer distance=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            address.delete(0,address.length());
            timings.delete(0,timings.length());
            playzone.delete(0,playzone.length());
            foodzone.delete(0,foodzone.length());
            distance.delete(0,distance.length());
            rating.delete(0,rating.length());
            address.append("Swatantra Path, Opposite The HQ, Vaddem, New Vaddem, Vasco de Gama");
            timings.append("10:30 AM - 9:00 PM");
            playzone.append("No");
            foodzone.append("No");
            distance.append("4.7 KM");
            rating.append("4.1 Stars");
            t5.setText(distance.toString());
            t6.setText(timings.toString());
            t7.setText(rating.toString());
            t8.setText(address.toString());
            t10.setText(foodzone.toString());
            t9.setText(playzone.toString());
            img1 = (ImageView) findViewById(R.id.shoppingimage);
            img1.setImageResource(R.drawable.vascomall);
        }
        else if(name.equals("Big G"))
        {
            StringBuffer address=new StringBuffer("");
            StringBuffer timings=new StringBuffer("");
            StringBuffer playzone=new StringBuffer("");
            StringBuffer foodzone=new StringBuffer("");
            StringBuffer distance=new StringBuffer("");
            StringBuffer rating=new StringBuffer("");
            address.delete(0,address.length());
            timings.delete(0,timings.length());
            playzone.delete(0,playzone.length());
            foodzone.delete(0,foodzone.length());
            distance.delete(0,distance.length());
            rating.delete(0,rating.length());
            address.append("Isidorio Baptista Road, Pagifond, Margao, Goa");
            timings.append("10:30 AM - 10:00 PM");
            playzone.append("No");
            foodzone.append("No");
            distance.append("27.8 KM");
            rating.append("3.2 Stars");
            t5.setText(distance.toString());
            t6.setText(timings.toString());
            t7.setText(rating.toString());
            t8.setText(address.toString());
            t10.setText(foodzone.toString());
            t9.setText(playzone.toString());
            img1 = (ImageView) findViewById(R.id.shoppingimage);
            img1.setImageResource(R.drawable.bigg);
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {

    }
}