package com.example.listviewtest;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] data = {"aj1 Chicago","aj1 black toe","aj1 bred toe","aj1 game royal","aj1 top3","aj1 banned","aj1 shattered backboard"
                                ,"aj1 city of flight","aj1 chameleon","aj1 new love","aj1 royal","aj1 shadow","yeezy blue tint"
                                ,"yeezy cream white","yeezy bred","yeezy semi frozen yellow","yeezy red","yeezy beluga"
                                ,"yeezy oreo"};
    private List<Sneakers> sneakersList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
            actionBar.hide();
        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);*/
        iniSneakers();
        SneakersAdapter sneakersAdapter = new SneakersAdapter(MainActivity.this,R.layout.sneakers_item,sneakersList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(sneakersAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Sneakers sneakers = sneakersList.get(position);
                Toast.makeText(MainActivity.this,sneakers.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void iniSneakers()
    {
        for (int i=0;i<2;i++)
        {
            Sneakers Chicago = new Sneakers("aj1 Chicago",R.drawable.img_chicago);
            sneakersList.add(Chicago);
            Sneakers BlackToe = new Sneakers("aj1 BlackToe",R.drawable.img_blacktoe);
            sneakersList.add(BlackToe);
            Sneakers BredToe = new Sneakers("aj1 BredToe",R.drawable.img_bredtoe);
            sneakersList.add(BredToe);
            Sneakers GameRoyal = new Sneakers("aj1 GameRoyal",R.drawable.img_gameroyal);
            sneakersList.add(GameRoyal);
            Sneakers Top3 = new Sneakers("aj1 TOP3",R.drawable.img_top3);
            sneakersList.add(Top3);
            Sneakers Banned = new Sneakers("aj1 Banned",R.drawable.img_banned);
            sneakersList.add(Banned);
            Sneakers ShatteredBackboard = new Sneakers("aj1 ShatteredBackboard",R.drawable.img_shatteredbackboard);
            sneakersList.add(ShatteredBackboard);
            Sneakers CityofFlight = new Sneakers("aj1 CityofFlight",R.drawable.img_cityofflight);
            sneakersList.add(CityofFlight);
            Sneakers Chameleon = new Sneakers("aj1 Chameleon",R.drawable.img_chameleon);
            sneakersList.add(Chameleon);
            Sneakers NewLove = new Sneakers("aj1 NewLove",R.drawable.img_newlove);
            sneakersList.add(NewLove);
            Sneakers Royal = new Sneakers("aj1 Royal",R.drawable.img_royal);
            sneakersList.add(Royal);
            Sneakers Shadow = new Sneakers("aj1 Shadow",R.drawable.img_shadow);
            sneakersList.add(Shadow);
            Sneakers BlueTint = new Sneakers("yeezy BlueTine",R.drawable.img_bluetint);
            sneakersList.add(BlueTint);
            Sneakers CreamWhite = new Sneakers("yeezy CreamWhite",R.drawable.img_creamwhite);
            sneakersList.add(CreamWhite);
            Sneakers Bred = new Sneakers("yeezy Bred",R.drawable.img_bred);
            sneakersList.add(Bred);
            Sneakers SemiFrozenYellow = new Sneakers("yeezy SemiFrozenYellow",R.drawable.img_semifrozenyellow);
            sneakersList.add(SemiFrozenYellow);
            Sneakers Red = new Sneakers("yeezy Red",R.drawable.img_red);
            sneakersList.add(Red);
            Sneakers Beluga = new Sneakers("yeezy Beluga",R.drawable.img_beluga);
            sneakersList.add(Beluga);
            Sneakers Oreo = new Sneakers("yeezy Oreo",R.drawable.img_oreo);
            sneakersList.add(Oreo);
        }
    }


}
