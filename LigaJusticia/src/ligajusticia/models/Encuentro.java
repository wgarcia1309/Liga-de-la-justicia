package ligajusticia.models;

import java.util.ArrayList;

public class Encuentro {
    private String nombre,ciudad,fecha;
    private ArrayList<Superheroe> listaS;
    private ArrayList<Villano> listaV;
    private ArrayList<Vehiculo> listasv;
    public Encuentro(String nombre, String ciudad, String fecha, ArrayList<Superheroe> listaS, ArrayList<Villano> listaV) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.listaS = listaS;
        heroes();
        this.listaV = listaV;
        villanos();
        listasv=new ArrayList<Vehiculo>();
    }
    public void heroes(){
        for (int i = 0; i < listaS.size(); i++) 
            listaS.get(i).adde(this);
    }
    public void villanos(){
        for (int i = 0; i < listaV.size(); i++) listaV.get(i).adde(this);
    }
    public void addsv(Vehiculo v){
        listasv.add(v);
    }
}
