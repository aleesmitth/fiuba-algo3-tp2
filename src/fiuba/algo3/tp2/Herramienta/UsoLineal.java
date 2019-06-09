package fiuba.algo3.tp2.Herramienta;

import fiuba.algo3.tp2.Materiales.Material;

public class UsoLineal extends AtributosHerramienta {

    public UsoLineal(int fuerzaInicial, int durabilidad, Material material, double desgasteInicial){
        this.fuerza=fuerzaInicial;
        this.durabilidad=durabilidad;
        this.materialPrimario=material;
        this.desgaste = this.fuerza/desgasteInicial;
    }
}
