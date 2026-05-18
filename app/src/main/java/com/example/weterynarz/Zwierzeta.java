package com.example.weterynarz;

public class Zwierzeta {
    String zwierze;
    int maksLat;

    public Zwierzeta(String zwierze, int maksLat) {
        this.zwierze = zwierze;
        this.maksLat = maksLat;
    }

    @Override
    public String toString() {
        return  zwierze ;
    }
}
