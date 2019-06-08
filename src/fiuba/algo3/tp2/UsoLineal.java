package fiuba.algo3.tp2;

public class UsoLineal extends AtributosHerramienta {

    public UsoLineal(int fuerzaInicial, int durabilidad, Material material,double desgasteInicial){
        this.fuerza=fuerzaInicial;
        this.durabilidad=durabilidad;
        this.materialPrimario=material;
        this.desgaste = this.fuerza/desgasteInicial;
    }
}
