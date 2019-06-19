package fiuba.algo3.tp2.modelo.Entidad.MesaDeCrafteo;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.MaterialVacio;
import fiuba.algo3.tp2.modelo.Entidad.MesaDeCrafteo.Constructor;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.*;

import java.util.HashMap;

public class TableroConstructor {

    HashMap<String, Herramienta> Recetas = new HashMap<String,Herramienta>();
    Constructor constructor = new Constructor();
    Material[] mesaDeCrafteo = {new MaterialVacio(),new MaterialVacio(),new MaterialVacio(),new MaterialVacio(),new MaterialVacio(),new MaterialVacio(),new MaterialVacio(),new MaterialVacio(),new MaterialVacio()};

    public TableroConstructor(){

        Recetas.put("MMM-M--M-",constructor.construirPico(new Madera()));
        Recetas.put("MM-MM--M-",constructor.construirHacha(new Madera()));
        Recetas.put("PPP-M--M-",constructor.construirPico(new Piedra()));
        Recetas.put("PP-PM--M-",constructor.construirHacha(new Piedra()));
        Recetas.put("AAA-M--M-",constructor.construirPico(new Metal()));
        Recetas.put("AA-AM--M-",constructor.construirHacha(new Metal()));
        Recetas.put("AAAPM--M-",constructor.construirPico(new Metal(),new Piedra()));

    }

    public void distribuirMateriales(Material material1,Material material2,Material material3,Material material4,Material material5,Material material6,Material material7,Material material8,Material material9){
        mesaDeCrafteo[0] = material1;
        mesaDeCrafteo[1] = material2;
        mesaDeCrafteo[2] = material3;
        mesaDeCrafteo[3] = material4;
        mesaDeCrafteo[4] = material5;
        mesaDeCrafteo[5] = material6;
        mesaDeCrafteo[6] = material7;
        mesaDeCrafteo[7] = material8;
        mesaDeCrafteo[8] = material9;
    }

    private String obtenerCodigoHerramienta() {
        String codigo = "";
        for (int i = 0; i < this.mesaDeCrafteo.length; i++){
            if(mesaDeCrafteo[i] != null){
                codigo = codigo + this.mesaDeCrafteo[i].obtenerCodigoMaterial();
            }
            else {
                codigo = codigo + "-";
            }
        }
        return codigo;
    }

    public Herramienta construirHerramienta(){
        return Recetas.get(this.obtenerCodigoHerramienta());
    }

}
