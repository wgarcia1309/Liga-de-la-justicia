
package ligajusticia.models;

import java.util.ArrayList;
public abstract class Personaje {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Encuentro> encuentros;
    
    public Personaje(String nombre) {
        this.nombre = nombre;
        vehiculos=new ArrayList<Vehiculo>();
        encuentros=new ArrayList<Encuentro>();
    }
    public void adde(Encuentro e){
        encuentros.add(e);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo getsv(String s) {
        int i=vehiculos.indexOf(new Vehiculo(s));
        if(i==-1)return null;
        else return vehiculos.get(i);
    }
    
    public void addv(String nombre) {
        vehiculos.add(new Vehiculo(nombre));
    }
    public String getsvmas(){
        if(vehiculos.size()>0){
            int index=0;
            for (int i = 1; i < vehiculos.size(); i++) {
                if(vehiculos.get(i).getEncuentros()>vehiculos.get(index).getEncuentros())index=i;
            }
            if(vehiculos.get(index).getNombre()==null)return "no se ha usado ningun vehiculo hasta el momento en la liga de este heroe";
            else return "El vehiculo con mas encuentros en la liga de "+this.getNombre()+" es:\n"+vehiculos.get(index).getNombre()+" con "+vehiculos.get(index).getEncuentros()+" encuentros.";
        }
        return this.getNombre()+" no tiene ni un vehiculo";
    }
    
    @Override
    public boolean equals(Object o){
        if(o==null)return false;
        else if(o instanceof Personaje){
            Personaje p=(Personaje)o;
            if(p.getNombre().equalsIgnoreCase(this.getNombre()))return true;
        }
        return false;
    }
 }
