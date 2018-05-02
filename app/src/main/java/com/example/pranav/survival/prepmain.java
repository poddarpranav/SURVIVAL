package com.example.pranav.survival;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class prepmain extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prepmain);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(this);


    }

    public void onClicksh(View v) {

        Intent intent = new Intent(this, SHELTER.class);
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.prepmain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.shelter) {
            Intent i = new Intent(this, SHELTER.class);
            this.startActivity(i);
            return true;
        } else if (id == R.id.fire) {
            Intent i = new Intent(this, FIRE.class);
            this.startActivity(i);
            return true;
        } else if (id == R.id.kits) {
            Intent i = new Intent(this, Kits.class);
            this.startActivity(i);
            return true;


        } else if (id == R.id.tools) {
            Intent i = new Intent(this, Tools.class);
            this.startActivity(i);
            return true;


        } else if (id == R.id.FindDirection) {
            Intent i = new Intent(this, Direction.class);
            this.startActivity(i);
            return true;

        } else if (id == R.id.power) {
            Intent i = new Intent(this, Power.class);
            this.startActivity(i);
            return true;
        }


        else if (id == R.id.water) {
            Intent i = new Intent(this, Water.class);
            this.startActivity(i);
            return true;
        }


        else if (id == R.id.food) {
            Intent i = new Intent(this, Food.class);
            this.startActivity(i);
            return true;
        }
        else if (id == R.id.animal) {
            Intent i = new Intent(this, Animals.class);
            this.startActivity(i);
            return true;
        }

        else if (id == R.id.plants) {
            Intent i = new Intent(this, Plants.class);
            this.startActivity(i);
            return true;
        }
        else if (id == R.id.poison) {
            Intent i = new Intent(this, PoisonousPlants.class);
            this.startActivity(i);
            return true;
        }

        else if (id == R.id.medicine) {
            Intent i = new Intent(this, Medicine.class);
            this.startActivity(i);
            return true;
        }

        else if (id == R.id.psychology) {
            Intent i = new Intent(this, Psychology.class);
            this.startActivity(i);
            return true;
        }

        else if (id == R.id.signal) {
            Intent i = new Intent(this, Signaling.class);
            this.startActivity(i);
            return true;
        }


        else if (id == R.id.cross) {
            Intent i = new Intent(this, Watercross.class);
            this.startActivity(i);
            return true;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
