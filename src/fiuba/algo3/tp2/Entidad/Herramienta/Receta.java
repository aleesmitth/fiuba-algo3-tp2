package fiuba.algo3.tp2.Entidad.Herramienta;

import fiuba.algo3.tp2.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.Entidad.Materiales.Material;
import fiuba.algo3.tp2.Entidad.Materiales.Metal;
import fiuba.algo3.tp2.Entidad.Materiales.Piedra;
import fiuba.algo3.tp2.Entidad.MesaDeCrafteo.Constructor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Receta {

    public static HashMap<List<Material>,Herramienta> Recetas = new HashMap<List<Material>,Herramienta>();

    public static void agregarReceta(Herramienta herramienta,Material material1,Material material2,Material material3,Material material4,Material material5,Material material6,Material material7,Material material8,Material material9){
        Material[] formatoDeReceta = new Material[] {material1,material2,material3,material4,material5,material6,material7,material8,material9};
        List<Material> receta = Arrays.asList(formatoDeReceta);

        Recetas.put(receta,herramienta);
    }

    public Receta(){
        this.agregarReceta(new Hacha(new Madera()),new Madera(),new Madera(),null,new Madera(),new Madera(),null,null,new Madera(),null);
        this.agregarReceta(new Hacha(new Piedra()),new Piedra(),new Piedra(),null,new Piedra(),new Madera(),null,null,new Madera(),null);
        this.agregarReceta(new Hacha(new Metal()),new Metal(),new Metal(),null,new Metal(),new Madera(),null,null,new Madera(),null);
        this.agregarReceta(new Pico(new Madera()),new Madera(),new Madera(),new Madera(),null,new Madera(),null,null,new Madera(),null);
        this.agregarReceta(new Pico(new Piedra()),new Piedra(),new Piedra(),new Piedra(),null,new Madera(),null,null,new Madera(),null);
        this.agregarReceta(new Pico(new Metal()),new Metal(),new Metal(),new Metal(),null,new Madera(),null,null,new Madera(),null);
        this.agregarReceta(new Pico(new Metal(),new Piedra()),new Metal(),new Metal(),new Metal(),new Piedra(),new Madera(),null,null,new Madera(),null);
    }

    public static Herramienta construirReceta(Material material1,Material material2,Material material3,Material material4,Material material5,Material material6,Material material7,Material material8,Material material9){
        Material[] vectorMaterialesRecibidos = new Material[] {material1,material2,material3,material4,material5,material6,material7,material8,material9};
        List<Material> listaMaterialesHerramientaNueva = Arrays.asList(vectorMaterialesRecibidos);

        if (Recetas.containsKey(listaMaterialesHerramientaNueva)){
            return Recetas.get(listaMaterialesHerramientaNueva);
        }
        else {
            return null;
        }
    }
}
