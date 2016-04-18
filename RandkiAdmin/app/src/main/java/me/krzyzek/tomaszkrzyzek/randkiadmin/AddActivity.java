package me.krzyzek.tomaszkrzyzek.randkiadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }

    public void acceptDataClick(View v){
        EditText imie = (EditText) findViewById(R.id.imie);
        EditText nazwisko = (EditText) findViewById(R.id.nazwisko);
        EditText miasto = (EditText) findViewById(R.id.miasto);
        EditText wiek = (EditText) findViewById(R.id.wiek);
        EditText plec = (EditText) findViewById(R.id.plec);
        EditText wzrost = (EditText) findViewById(R.id.wzrost);
        EditText orientacja = (EditText) findViewById(R.id.orientacja);
        EditText zawod = (EditText) findViewById(R.id.zawod);
        EditText wyznanie = (EditText) findViewById(R.id.wyznanie);
        EditText budowaCiala = (EditText) findViewById(R.id.budowaCiala);
        EditText poCo = (EditText) findViewById(R.id.poCo);
        EditText stanCywilny = (EditText) findViewById(R.id.stanCywilny);
        EditText preferencje = (EditText) findViewById(R.id.preferencje);
        EditText alkohol = (EditText) findViewById(R.id.alkohol);

        MainActivity.imie = imie.getText().toString();
        MainActivity.nazwisko = nazwisko.getText().toString();
        MainActivity.miasto = miasto.getText().toString();
        MainActivity.wiek = wiek.getText().toString();
        MainActivity.plec = plec.getText().toString();
        MainActivity.wzrost = wzrost.getText().toString();
        MainActivity.orientacja= orientacja.getText().toString();
        MainActivity.zawod = zawod.getText().toString();
        MainActivity.wyznanie = wyznanie.getText().toString();
        MainActivity.budowaCiala = budowaCiala.getText().toString();
        MainActivity.poCo = poCo.getText().toString();
        MainActivity.stanCywilny= stanCywilny.getText().toString();
        MainActivity.preferencje = preferencje.getText().toString();
        MainActivity.alkohol= alkohol.getText().toString();

        AddToDatabase addToDatabase = new AddToDatabase();
        addToDatabase.execute();

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
}
