package com.company;

public class Aine {

    private String name;
    private String id;
    private int eap;

    public Aine(String name, String id, int eap) {
        this.name = name;
        this.id = id;
        this.eap = eap;
    }

    public Aine() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEap() {
        return eap;
    }

    public void setEap(int eap) {
        this.eap = eap;
    }

    public int nrOfClasses() {
        return this.eap * 8;
    }

    @Override
    public String toString() {
        return "Aine{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", eap=" + eap +
                '}';
    }
}
