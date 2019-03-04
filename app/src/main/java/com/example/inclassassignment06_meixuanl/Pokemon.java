package com.example.inclassassignment06_meixuanl;

import java.io.Serializable;

public class Pokemon implements Serializable {

    private String name;
    private String type;
    private boolean evolve;
    private int generation;

    public Pokemon (String name, String type, boolean evolve, int generation){
        this.name = name;
        this.type = type;
        this.evolve = evolve;
        this.generation = generation;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean getEvolve() {
        return evolve;
    }

    public int getGeneration() {
        return generation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEvolve(boolean evolve) {
        this.evolve = evolve;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }
}
