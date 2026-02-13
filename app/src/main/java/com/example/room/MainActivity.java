package com.example.room;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    PrzepisyDataBase przepisyDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przepisyDataBase = PrzepisyDataBase.zwrocInstancjeBazyDanych(MainActivity.this);
        przepisyDataBase.zwrocWypiekiDao().wstawWypiekDoBazy(new Wypieki("sernik", "ser, ziemniaki, cukier, jajka", 200, 170));
        przepisyDataBase.zwrocWypiekiDao().wstawWypiekDoBazy(new Wypieki("drożdżówki", "ser, ziemniaki, cukier, jajka", 200, 170));
        przepisyDataBase.zwrocWypiekiDao().wstawWypiekDoBazy(new Wypieki("szarotka", "ser, ziemniaki, cukier, jajka", 200, 170));
        ListView listView = findViewById(R.id.listView);
        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.editTextText);
        EditText editText1 = findViewById(R.id.editTextText2);
        EditText editText2 = findViewById(R.id.editTextText3);
        EditText editText3 = findViewById(R.id.editTextText4);
        List<Wypieki> wszystkieWypiekiList = przepisyDataBase
                .zwrocWypiekiDao()
                .zwrocWszystkieWypiekiZBazy();
        ArrayAdapter<Wypieki> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                wszystkieWypiekiList
        );
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        przepisyDataBase.zwrocWypiekiDao().usunZBazy(wszystkieWypiekiList.get(i));
                        wszystkieWypiekiList.remove(i);
                        arrayAdapter.notifyDataSetChanged();
                    }
                }
        );
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String nazwa = editText.getText().toString();
                        String skladniki = editText1.getText().toString();
                        String temperatura = editText2.getText().toString();
                        String czas = editText3.getText().toString();

                    }
                }
        );
    };
    }