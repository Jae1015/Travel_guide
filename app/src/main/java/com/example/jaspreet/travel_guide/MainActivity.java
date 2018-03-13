package com.example.jaspreet.travel_guide;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("ALERTTILESTRING")
                .setMessage("alertNameString")
                .setCancelable(false)
                .setNegativeButton("Close",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        CardView el1=findViewById(R.id.el1);
        CardView el2=findViewById(R.id.el2);
        CardView el3=findViewById(R.id.el3);
        CardView el4=findViewById(R.id.el4);
        final AlertDialog alert1= builder.create();
        final AlertDialog alert2 = builder.create();
        final AlertDialog alert3 = builder.create();
        final AlertDialog alert4 = builder.create();

        el1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
     //           Toast.makeText(MainActivity.this,"clicked on el1",Toast.LENGTH_SHORT).show();
                alert1.setTitle("SEVEN SISTER FALLS");
                alert1.setMessage("The seven sisters fall is a kind of waterfall which symbolizes the seven states in northeast namely Assam, Arunachal Pradesh, Manipur, Nagaland, Tripura, Mizoram and Meghalaya. The fall is separated with seven parts over the cliff of the hills.  The view is spectacular and completely engross one individual with the view.");
                alert1.show();

            }
        });
        el2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //           Toast.makeText(MainActivity.this,"clicked on el1",Toast.LENGTH_SHORT).show();

                alert2.setTitle("CRUSIE");
                alert2.setMessage("Brahmaputra cruises\n" +
                        "\n" +
                        "Brahmaputra cruises feature visits and attractions such as wildlife viewing (both by jeep and on elephant back), village walks, visits to tea gardens, exploring country towns in cycle rickshaws, barbecues on deserted river islands, dance performances, and visits to craft workshops.\n" +
                        "\n" +
                        "\u200B\n" +
                        "\n" +
                        "Between October and April, we offer a series of 8-day, 11-day and 5-day cruises, named after the Assam Despatch service, the daily mail and passenger service that once plied from Kolkata up the Brahmaputra to Dibrugarh. Cruises can be combined to create itineraries up to 15 days.");
                alert2.show();
            }
        });
        el3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //           Toast.makeText(MainActivity.this,"clicked on el1",Toast.LENGTH_SHORT).show();

                alert3.setTitle("ELEPHANT FALLS");
                alert3.setMessage("Placed at a distance of around 12 km from Shillong, Elephant waterfalls are just a few minutes’ drive away from the Shillong Peak. One of the most popular tourist attractions of Shillong, this waterfall is called ‘Ka Kshaid Lai Pateng Khohsiew’ by the Khasi locals. Do not miss visiting the Elephant waterfalls during your tour to Shillong. It is a 2-tiered rugged waterfall that lies right amidst thick greenery, finally reaching a small lake. The two successive falls, stream down from mountains on rocky steps, creating a foam effect. The clear water and the lush greenery form an amazing sight making the place all the more worth-visiting.");
                alert3.show();
            }
        });

        el4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //           Toast.makeText(MainActivity.this,"clicked on el1",Toast.LENGTH_SHORT).show();

                alert4.setTitle("Alert");
                alert4.setMessage("Dawki-Tamabil is one of the few road border crossings between India and Bangladesh in Jaintia Hills of India, the corresponding post in Bangladesh is Tambil post. Dawki ICP foundation stone was laid in January 2017 and will become operation in 2-18.[3] It is used mainly for coal transportation to Bangladesh. Some 500 trucks cross the border every day in peak season.Dawki Bridge, is a suspension bridge over the Umngot River. It was constructed in 1932 by the British");
                alert4.show();
            }
        });

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
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
