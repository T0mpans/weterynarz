package com.example.weterynarz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int wartosc;
    String wybrane;
    ArrayList<Zwierzeta> arrayList = new ArrayList<>();
    TextView licznik,wypisanie;
    ArrayAdapter<Zwierzeta> arrayAdapter;
    EditText imieINazwisko,cel,czas;
    ListView listView;
    SeekBar seekBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}