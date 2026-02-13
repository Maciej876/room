package com.example.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface WypiekiDao {

    @Insert
    public void wstawWypiekDoBazy(Wypieki wypiek);

    @Delete
    public void usunZBazy(Wypieki wypiek);

    @Update
    public void zaktualizuj(Wypieki wypiek);

    @Query("Select * from wypieki_tabela")
    List<Wypieki> zwrocWszystkieWypiekiZBazy();
}

@Query("Select nazwa from wypieki_tabela where czas_pieczenia< :czas")
List<String> zwrocNazwyWpiekow(int czas);
