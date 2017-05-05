/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligajusticia.models;

import java.util.ArrayList;

public class Vehiculo {
 private String nombre;
 private ArrayList<Encuentro> encuentros;
    public Vehiculo(String nombre) {
        this.nombre = nombre;
        encuentros= new ArrayList<Encuentro>();
    }
    public String getNombre() {
        return nombre;
    }
    public void adde(Encuentro e){
        encuentros.add(e);
    }

    public int getEncuentros() {
        return encuentros.size();
    }
    
    @Override
    public boolean equals(Object o){
        if(o==null){
            return false;
        }else if(o instanceof Vehiculo){
            Vehiculo p=(Vehiculo)o;
            if(p.getNombre().equalsIgnoreCase(this.getNombre()))return true;
        }
        return false;
    }
}
