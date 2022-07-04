package com.example.lab_8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar mtb = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mtb);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer, mtb, R.string.open, R.string.close);
        drawer.addDrawerListener(toggle);

        toggle.syncState();

        NavigationView nv = findViewById(R.id.NavView);
        nv.setNavigationItemSelectedListener(this);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


        Intent intent = new Intent(this, dad_jokes.class);
        String msg = (String) getText(R.string.joke);
        intent.putExtra("Thejoke",msg);
        switch(item.getItemId())
        {
            case R.id.hme:

                break;
            case R.id.dj:
                startActivity(intent);
                break;
            case R.id.ex:
                finishAffinity();
                break;
        }

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);

        
        return false;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String message = null;
        //Look at your menu XML file. Put a case for every id in that file:
        switch (item.getItemId()) {
            //what to do when the menu item is selected:
            case R.id.item1:
                message = "You clicked on item1";
                break;
            case R.id.item2:
                message = "You clicked on item2";
                break;


        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        return true;
    }














}