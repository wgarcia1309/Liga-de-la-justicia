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
public class Superheroe extends Personaje{
private ArrayList<Superheroe> compañeros;
private ArrayList<Villano> villanos;

    public Superheroe(String nombre) {
        super(nombre);
        compañeros= new ArrayList<Superheroe>();
        villanos= new ArrayList<Villano>();
    }
    public void addC(Superheroe s){
        compañeros.add(s);
    }
    public void addV(Villano s){
        villanos.add(s);
    }

    public ArrayList<Superheroe> getCompañeros() {
        return compañeros;
    }

}
