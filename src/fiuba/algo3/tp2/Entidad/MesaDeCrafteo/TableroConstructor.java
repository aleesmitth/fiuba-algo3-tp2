package fiuba.algo3.tp2.Entidad.MesaDeCrafteo;

import fiuba.algo3.tp2.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.Entidad.Materiales.*;

import java.util.HashMap;

public class TableroConstructor {
    private static int FILASTABLEROCONSTRUCTOR=3;
    private static int COLUMNASTABLEROCONSTRUCTOR=3;
    Casillero casillero[][];
    HashMap<String, Herramienta> Recetas = new HashMap<>();
    Constructor constructor = new Constructor();
    Material[] materialesEnTableroConstructor;

    public TableroConstructor(int a){
        for(int i=0; i<FILASTABLEROCONSTRUCTOR; i++){
            for(int j=0; j<COLUMNASTABLEROCONSTRUCTOR; j++){
                casillero[i][j] = new Casillero();
            }
        }
    }

    public void agregarMaterialEnCasillero(Material material, int fila, int columna){
        casillero[fila][columna].agregarMaterial(material);
    }



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
        materialesEnTableroConstructor[0] = material1;
        materialesEnTableroConstructor[1] = material2;
        materialesEnTableroConstructor[2] = material3;
        materialesEnTableroConstructor[3] = material4;
        materialesEnTableroConstructor[4] = material5;
        materialesEnTableroConstructor[5] = material6;
        materialesEnTableroConstructor[6] = material7;
        materialesEnTableroConstructor[7] = material8;
        materialesEnTableroConstructor[8] = material9;
    }

    private String obtenerCodigoHerramienta() {
        String codigo = "";
        for (int i = 0; i < this.materialesEnTableroConstructor.length; i++){
            if(materialesEnTableroConstructor[i] != null){
                codigo = codigo + this.materialesEnTableroConstructor[i].obtenerCodigoMaterial();
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
