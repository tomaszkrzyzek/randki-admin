package me.krzyzek.tomaszkrzyzek.randkiadmin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static String imie;
    static String nazwisko;
    static String miasto;
    static String wiek;
    static String plec;
    static String wzrost;
    static String orientacja;
    static String zawod;
    static String wyznanie;
    static String budowaCiala;
    static String poCo;
    static String stanCywilny;
    static String preferencje;
    static String alkohol;

    static ArrayList<Osoba> detailsArray = new ArrayList<Osoba>();
    static ArrayList<String> peopleArray = new ArrayList<String>();
    static ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        update();
        adapter.notifyDataSetChanged();
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {

            }

        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        update();
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        update();
        adapter.notifyDataSetChanged();
    }

    void update() {
        GetFromDatabase getFromDatabase = new GetFromDatabase();
        getFromDatabase.execute();

        ListView listView = (ListView) findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, peopleArray);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    public void refreshClick(View v) {
        update();
        adapter.notifyDataSetChanged();
    }

    public void addClick(View v) {
        Intent i = new Intent(this, AddActivity.class);
        startActivity(i);
        update();
        adapter.notifyDataSetChanged();
    }
}
