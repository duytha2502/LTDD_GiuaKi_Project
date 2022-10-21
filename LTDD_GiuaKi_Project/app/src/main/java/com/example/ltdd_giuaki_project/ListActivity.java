package com.example.ltdd_giuaki_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;


public class ListActivity extends AppCompatActivity {
    ListView lvLapTop;
    ArrayList<LapTop> arrayLapTop;
    LapTopAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        AnhXa();

        BottomNavigationView navigationView = findViewById(R.id.bot_nav);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Toast.makeText(ListActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        Intent HomeScreen = new Intent(ListActivity.this, HomeActivity.class);
                        startActivity(HomeScreen);
                        break;
                    case R.id.list:
                        Toast.makeText(ListActivity.this, "List", Toast.LENGTH_SHORT).show();
                        Intent ListScreen = new Intent(ListActivity.this, ListActivity.class);
                        startActivity(ListScreen);
                        break;
                    case R.id.person:
                        Toast.makeText(ListActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                        Intent ProfileScreen = new Intent(ListActivity.this, ProfileActivity.class);
                        startActivity(ProfileScreen);
                        break;
                }
                return true;
            }
        });
        adapter = new LapTopAdapter(this, R.layout.activity_listitem, arrayLapTop);
        lvLapTop.setAdapter(adapter);
    }

    private void AnhXa() {
        lvLapTop = (ListView) findViewById(R.id.listView);
        arrayLapTop = new ArrayList<>();
        arrayLapTop.add(new LapTop("Laptop Gaming MSI Vector GP76 12UGS 610VN", R.drawable.laptop1, "57990000", "48990000"));
        arrayLapTop.add(new LapTop("Laptop Gaming Acer Predator Helios 300 PH315 55 76KG", R.drawable.laptop2, "46990000", "40990000"));
        arrayLapTop.add(new LapTop("Laptop Gaming Asus ROG Flow Z13 GZ301ZC LD110W", R.drawable.laptop3, "49990000", "44990000"));
        arrayLapTop.add(new LapTop("Laptop Gaming Dell Alienware M15 R6 P109F001DBL", R.drawable.laptop4, "61990000", "47990000"));
        arrayLapTop.add(new LapTop("Laptop Gaming Lenovo Legion 5 15ARH7H 82RD003TVN", R.drawable.laptop5, "47990000", "41990000"));


        lvLapTop.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent lt1 = new Intent(ListActivity.this, LapTop1Activity.class);
                    startActivity(lt1);
                }
                if (position == 1) {
                    Intent lt2 = new Intent(ListActivity.this, LapTop2Activity.class);
                    startActivity(lt2);
                }
                if (position == 3) {
                    Intent lt3 = new Intent(ListActivity.this, LapTop3Activity.class);
                    startActivity(lt3);
                }
                if (position == 4) {
                    Intent lt4 = new Intent(ListActivity.this, LapTop4Activity.class);
                    startActivity(lt4);
                }
                if (position == 5) {
                    Intent lt5 = new Intent(ListActivity.this, LapTop5Activity.class);
                    startActivity(lt5);
                }
            }
        });
    }
}

