/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.uno;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jlunaque
 */
public class PokemonPool {
    public ArrayList<Pokemon> pokePool = new ArrayList();
    
    public PokemonPool(){
        Pokemon charmander = new Pokemon("Charmander", "Fire", 0, 20); 
        pokePool.add(charmander);
        Pokemon charmeleon = new Pokemon("Charmeleon", "Fire", 1, 40); 
        pokePool.add(charmeleon);
        Pokemon charizard = new Pokemon("Charizard", "Fire", 2, 100); 
        pokePool.add(charizard);
        Pokemon squirtle = new Pokemon("Squirtle", "Water", 3,  20); 
        pokePool.add(squirtle);
        Pokemon wartortle = new Pokemon("Wartortle", "Water", 4, 40); 
        pokePool.add(wartortle);
        Pokemon blastoise = new Pokemon("Blastoise", "Water", 5, 100); 
        pokePool.add(blastoise);
        Pokemon bulbasur = new Pokemon("Bulbasur", "Plant", 6, 20); 
        pokePool.add(bulbasur);
        Pokemon ivysur = new Pokemon("Ivysur", "Plant", 7, 40); 
        pokePool.add(ivysur);
        Pokemon venusur = new Pokemon("Venusur", "Plant", 8, 100); 
        pokePool.add(venusur);
        
    }
    
    public Pokemon randomPokemon(){
        Collections.shuffle(pokePool);
        return pokePool.get(0);
        
    }
    
    
}
