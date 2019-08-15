package com.company.part1;

public abstract class Bird {
    private int laidEggs;
    private String feathers;
    public abstract void fly();

    public Bird(int layedEggs, String feathers){
        this.laidEggs = layedEggs;
        this.feathers = feathers;

    }

    public int getLaidEggs() {
        return laidEggs;
    }

    public void setLaidEggs(int laidEggs) {
        this.laidEggs = laidEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "laidEggs=" + laidEggs +
                ", feathers='" + feathers + '\'' +
                '}';
    }
}
