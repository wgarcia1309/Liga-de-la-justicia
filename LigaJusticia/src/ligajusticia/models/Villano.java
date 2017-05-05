/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligajusticia.models;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Villano extends Personaje{
    private ArrayList<Superheroe> superheroes;
    public Villano(String nombre) {
        super(nombre);
        superheroes= new  ArrayList<Superheroe>();
    }
    public void addH(Superheroe s){
        superheroes.add(s);
    }
}
