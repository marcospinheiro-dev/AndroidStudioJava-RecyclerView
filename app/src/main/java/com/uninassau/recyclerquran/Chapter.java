package com.uninassau.recyclerquran;

import java.util.ArrayList;
import java.util.List;

public class Chapter {

    public Chapter(){}

    public Chapter(int number, List<Versicle> versicles) {
        this.number = number;
        this.versicles = versicles;
    }

    private int number;
    private List<Versicle> versicles = new ArrayList<>();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Versicle> getVersicles() {
        return versicles;
    }

    public void setVersicles(List<Versicle> versicles) {
        this.versicles = versicles;
    }
}
