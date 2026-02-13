package com.example.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "wypieki_tabela")
public class Wypieki {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nazwa;
    private String skladniki;
    @ColumnInfo(name = "temperatura_pieczenia")
    private int temepraturaPieczywa;
    @ColumnInfo(name = "czas_pieczenia")
    private int czasPieczenia;

    public Wypieki(String nazwa, String skladniki, int temepraturaPieczywa, int czasPieczenia) {
        id = 0;
        this.nazwa = nazwa;
        this.skladniki = skladniki;
        this.temepraturaPieczywa = temepraturaPieczywa;
        this.czasPieczenia = czasPieczenia;
    }

    @Override
    public String toString() {
        return "Wypieki{" +
                "id=" + id +
                ", nazwa='" + nazwa + ",\n" +
                ", skladniki='" + skladniki + ",\n" +
                ", temepraturaPieczywa=" + temepraturaPieczywa +
                ", \n czasPieczenia=" + czasPieczenia +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getSkladniki() {
        return skladniki;
    }

    public void setSkladniki(String skladniki) {
        this.skladniki = skladniki;
    }

    public int getTemepraturaPieczywa() {
        return temepraturaPieczywa;
    }

    public void setTemepraturaPieczywa(int temepraturaPieczywa) {
        this.temepraturaPieczywa = temepraturaPieczywa;
    }

    public int getCzasPieczenia() {
        return czasPieczenia;
    }

    public void setCzasPieczenia(int czasPieczenia) {
        this.czasPieczenia = czasPieczenia;
    }
}
