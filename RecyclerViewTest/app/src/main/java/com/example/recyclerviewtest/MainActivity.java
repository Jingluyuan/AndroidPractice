package com.example.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Sneakers> sneakersList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initSneakers();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        SneakersAdapter adapter = new SneakersAdapter(sneakersList);
        recyclerView.setAdapter(adapter);
    }

    private void initSneakers() {
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
