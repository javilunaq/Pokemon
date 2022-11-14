/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.uno;

import java.util.ArrayList;

/**
 *
 * @author jlunaque
 */
public class UserPokemon {

    protected ArrayList<Pokemon> pokeTeam = new ArrayList();
    private PokemonPool pool = new PokemonPool();

    public UserPokemon() {    // Constructor
        pokeTeam.add(pool.randomPokemon());
    }
    
    public String showTeam(){
        String text = "Tu equipo Pokemon: \n";
        
        for(Pokemon p: pokeTeam){
            text += p.getName() + " de nivel " + p.getLevel() + ", de fuerza " + p.getForce() + "\n";
        }
        return text;
        
    }

    public void Catch() {     // el usuario captura un pokemon aleatorio nuevo
        pokeTeam.add(pool.randomPokemon());
    }

    public String Train(int index) { //el usuario elige el pokemon que quiere entrenar dentro de su array pokeTeam, y sube de nivel con level up
        String text = "Has subido un nivel";
        pokeTeam.get(index).levelUp(); // index es el parametro que tiene que pasar el usuario
        if (pokeTeam.get(index).canEvolve()) {
            pokeTeam.get(index).evolve();
        }
        return text;

    }

    public void Fight(int index1) {   // la efectividad por el tipo aumenta la fuerza un 30%
        pokeTeam.get(index1);   // el usuario elije el Pokemon con el que va a luchar
        Pokemon wildPokemon = pool.randomPokemon(); // aparece el pokemon salvaje
        System.out.println("Lucharás contra un " + wildPokemon.getName() + " de fuerza " + wildPokemon.getForce() + ".");
        if (wildPokemon.type == pokeTeam.get(index1).type) {
            if (pokeTeam.get(index1).force > wildPokemon.force) {
                System.out.println("Has ganado el combate");
                pokeTeam.get(index1).levelUp();
                pokeTeam.get(index1).levelUp();
                if (pokeTeam.get(index1).canEvolve()) {
                    pokeTeam.get(index1).evolve();
                }
            } else if (pokeTeam.get(index1).force == wildPokemon.force) {
                System.out.println("Empate tecnico");
            } else {
                System.out.println("Has perdido el combate");
            }
        }
        if (pokeTeam.get(index1).type == "Water" && wildPokemon.type == "Plant") {  //planta es el efectivo
            if (pokeTeam.get(index1).force > wildPokemon.force * 1.30) {
                System.out.println("Has ganado el combate");
                pokeTeam.get(index1).levelUp();
                pokeTeam.get(index1).levelUp();
                if (pokeTeam.get(index1).canEvolve()) {
                    pokeTeam.get(index1).evolve();
                }
            } else {
                System.out.println("Has perdido el combate");
            }
        }
        if (pokeTeam.get(index1).type == "Water" && wildPokemon.type == "Fire") {  //water es el efectivo
            if (pokeTeam.get(index1).force * 1.30 > wildPokemon.force) {
                System.out.println("Has ganado el combate");
                pokeTeam.get(index1).levelUp();
                pokeTeam.get(index1).levelUp();
                if (pokeTeam.get(index1).canEvolve()) {
                    pokeTeam.get(index1).evolve();
                }
            } else {
                System.out.println("Has perdido el combate");
            }
        }
        if (pokeTeam.get(index1).type == "Fire" && wildPokemon.type == "Plant") {  //fire es el efectivo
            if (pokeTeam.get(index1).force * 1.30 > wildPokemon.force) {
                System.out.println("Has ganado el combate");
                pokeTeam.get(index1).levelUp();
                pokeTeam.get(index1).levelUp();
                if (pokeTeam.get(index1).canEvolve()) {
                    pokeTeam.get(index1).evolve();
                }
            } else {
                System.out.println("Has perdido el combate");
            }
        }
        if (pokeTeam.get(index1).type == "Fire" && wildPokemon.type == "Water") {  //water es el efectivo
            if (pokeTeam.get(index1).force > wildPokemon.force * 1.30) {
                System.out.println("Has ganado el combate");
                pokeTeam.get(index1).levelUp();
                pokeTeam.get(index1).levelUp();
                if (pokeTeam.get(index1).canEvolve()) {
                    pokeTeam.get(index1).evolve();
                }
            } else {
                System.out.println("Has perdido el combate");
            }
        }
        if (pokeTeam.get(index1).type == "Plant" && wildPokemon.type == "Fire") {  //fire es el efectivo
            if (pokeTeam.get(index1).force > wildPokemon.force * 1.30) {
                System.out.println("Has ganado el combate");
                pokeTeam.get(index1).levelUp();
                pokeTeam.get(index1).levelUp();
                if (pokeTeam.get(index1).canEvolve()) {
                    pokeTeam.get(index1).evolve();
                }
            } else {
                System.out.println("Has perdido el combate");
            }
        }
        if (pokeTeam.get(index1).type == "Plant" && wildPokemon.type == "Water") {  //water es el efectivo
            if (pokeTeam.get(index1).force * 1.30 > wildPokemon.force) {
                System.out.println("Has ganado el combate");
                pokeTeam.get(index1).levelUp();
                pokeTeam.get(index1).levelUp();
                if (pokeTeam.get(index1).canEvolve()) {
                    pokeTeam.get(index1).evolve();
                }
            } else {
                System.out.println("Has perdido el combate");
            }
        }

    }

}
