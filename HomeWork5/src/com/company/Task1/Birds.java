package com.company.Task1;

public abstract class Birds {

    private String feather;
    private int layEggs;

    public Birds(String feather, int layEggs) {
        this.feather = feather;
        this.layEggs = layEggs;
    }


    public String getFeather() {
        return feather;
    }

    public void setFeather(String feather) {
        this.feather = feather;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "feather='" + feather + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }

    public abstract void fly();
}

