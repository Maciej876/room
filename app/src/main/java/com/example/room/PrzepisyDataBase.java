package com.example.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Wypieki.class}, version = 1)
public abstract class PrzepisyDataBase extends RoomDatabase {

        public abstract WypiekiDao zwrocWypiekiDao();

        private static PrzepisyDataBase instancje;

        public static PrzepisyDataBase zwrocInstancjeBazyDanych(Context context){
            if (instancje == null) {
                instancje = Room.databaseBuilder(
                                context,
                                PrzepisyDataBase.class,
                                    "przepisy_db"
                            )
                        .allowMainThreadQueries()
                        .fallbackToDestructiveMigration()
                        .build();
            }
            return instancje;

    }
}
