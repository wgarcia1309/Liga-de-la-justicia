package ligajusticia;

import java.util.ArrayList;
import ligajusticia.models.Encuentro;
import ligajusticia.models.Superheroe;
import ligajusticia.models.Vehiculo;
import ligajusticia.models.Villano;

public class LigaJusticia {
    private static  ArrayList<Superheroe> heroes;
    private static ArrayList<Villano> villanos;
    private static ArrayList<Encuentro> encuentros;

    public LigaJusticia() {
        heroes=new ArrayList<Superheroe>();
        villanos=new ArrayList<Villano>();
        encuentros=new ArrayList<Encuentro>();
    }
    public void adde(Encuentro e){
        encuentros.add(e);
    }
    public void addh(String nombre){
        heroes.add(new Superheroe(nombre));
    }
    public int nh(){
        return heroes.size();
    }
    public void addv(String nombre){
        villanos.add(new Villano(nombre));
    }
    public int nv(){
        return villanos.size();
    }
    public Superheroe getSuperheroe(String nombre){
        int i=heroes.indexOf(new Superheroe(nombre));
        if(i==-1)return null;
        else return heroes.get(i);
    }
    public Villano getVillano(String nombre){
        int i=villanos.indexOf(new Superheroe(nombre));
        if(i==-1)return null;
        else return villanos.get(i);
    }
    public ArrayList<Encuentro> getEncuentros() {
        return encuentros;
    }
    
    public static void main(String[] args) {
        LigaJusticia lj= new LigaJusticia();
        ArrayList<Superheroe> listaS=new ArrayList<Superheroe>();
        ArrayList<Villano> listaV= new ArrayList<Villano>();
        Encuentro etemp;
        Vehiculo vtemp;
        
        lj.addh("Superman");
        lj.addh("Batman");
        lj.addh("Robin");
        
        lj.addv("Joker");
        lj.addv("Pinguino");
        Superheroe s = lj.getSuperheroe("Batman");
        if(s != null) s.addC(lj.getSuperheroe("Robin"));
        else System.out.println("No existe");
                
        lj.getSuperheroe("Batman").addv("Batimovil");
        lj.getSuperheroe("Batman").addv("Baticoptero");

        lj.getVillano("Pinguino").addv("Patomovil");
        
        //Batalla 1
        listaS.add(lj.getSuperheroe("Batman"));
        listaS.add(lj.getSuperheroe("Superman"));
        
        listaV.add(lj.getVillano("Pinguino"));
        
        lj.adde(new Encuentro("Batalla1","Metropolis","Enero 1",listaS, listaV));
        
        etemp = lj.getEncuentros().get(lj.getEncuentros().size()-1);
        vtemp = lj.getSuperheroe("Batman").getsv("Batimovil");
        if(vtemp==null){
            System.out.println("Carro no existe");
        }else{
            etemp.addsv(vtemp);
            vtemp.adde(etemp);     
        }
        //Batalla 2
        listaS.clear();
        listaS.add(lj.getSuperheroe("Batman"));
        
        listaV.clear();
        listaV.add(lj.getVillano("Joker"));
        
        lj.adde(new Encuentro("Batalla2","Ciudad Gotica","Enero 2",listaS, listaV));
        
        
        etemp = lj.getEncuentros().get(lj.getEncuentros().size()-1);
        vtemp = lj.getSuperheroe("Batman").getsv("Batimovil");
        etemp.addsv(vtemp);
        vtemp.adde(etemp);
        
        vtemp = lj.getSuperheroe("Batman").getsv("Baticoptero");
        etemp.addsv(vtemp);
        vtemp.adde(etemp);
         //Batalla 3
        listaS.clear();
        listaS.add(lj.getSuperheroe("Robin"));
        listaS.add(lj.getSuperheroe("Superman"));
        
        listaV.clear();
        listaV.add(lj.getVillano("Pinguino"));
        
        lj.adde(new Encuentro("Batalla3","Ciudad Central","Enero 3",listaS, listaV));
        
        
        etemp = lj.getEncuentros().get(lj.getEncuentros().size()-1);
        vtemp = lj.getSuperheroe("Batman").getsv("Batimovil");
        etemp.addsv(vtemp);
        vtemp.adde(etemp);
        
        vtemp = lj.getVillano("Pinguino").getsv("Patomovil");
        etemp.addsv(vtemp);
        vtemp.adde(etemp);
        
        System.out.println(lj.getSuperheroe("Batman").getsvmas());//Cuantas veces se ha usado 2 bats, 1 robin
    }
}
