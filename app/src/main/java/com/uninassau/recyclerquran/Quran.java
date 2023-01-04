package com.uninassau.recyclerquran;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Quran {

    @SerializedName("quran")
    private ArrayList<Versicle> versicles;

    public Quran(ArrayList<Versicle> versicles) {
        this.versicles = versicles;
    }

    public List<Chapter> getChapters(){
        ArrayList<Chapter> chapters = new ArrayList<>();
        Chapter c = new Chapter();
        c.setNumber(1);

        for (Versicle verse: versicles){
            if (verse.getChapter() != c.getNumber()) {
                chapters.add(new Chapter(c.getNumber(), c.getVersicles()));
                c = new Chapter();
                c.setNumber(verse.getChapter());
                c.getVersicles().add(verse);
            } else {
                c.getVersicles().add(verse);
            }
        }
        return chapters;
    }

}