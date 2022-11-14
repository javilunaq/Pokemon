/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.uno;

/**
 *
 * @author jlunaque
 */
public class Pokemon {
    protected String name;
    protected int level;
    protected String type;
    protected int force;
    protected int id;
    protected int evolutionLevel;
    
    public Pokemon(){
        
    }
    
    public Pokemon(String name, String type, int id, int evolutionLevel){
        this.name = name;
        level = (int)(Math.random()*100);
        this.type = type;
        force = (int)(Math.random()*100);
        this.id = id;
        this.evolutionLevel = evolutionLevel;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getType() {
        return type;
    }
    
    public int getForce() {
        return force;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void setForce(int force) {
        this.force = force;
    }
    
    public void levelUp(){  // El pokemon sube de nivel
        if(level<100){
            level+=1;
        }
            
    }
    
    public void evolve(){
        PokemonPool pokePool = new PokemonPool();
        Pokemon evolution = pokePool.pokePool.get(id +1);
        name = evolution.name;
        force += 50;
        id = id +1;
    }
    
    public boolean canEvolve(){
        if (level >= evolutionLevel){
            return true;
        } else {
            return false;
        }
    }
    
    
}
