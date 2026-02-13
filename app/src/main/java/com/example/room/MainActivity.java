package com.example.room;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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
    };
    }