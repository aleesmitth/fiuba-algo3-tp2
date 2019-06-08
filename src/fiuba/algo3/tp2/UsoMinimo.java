package fiuba.algo3.tp2;

public class UsoMinimo extends AtributosHerramienta {

    public UsoMinimo(int fuerzaInicial, int durabilidad, Material primerMaterial,double desgasteInicial,Material segundoMaterial){
        this.fuerza=fuerzaInicial;
        this.durabilidad=durabilidad;
        this.materialPrimario=primerMaterial;
        this.materialSecundario=segundoMaterial;
        this.desgaste = desgasteInicial;
    }

    @Override
    public void usar() {
        this.durabilidad-=this.durabilidad/10;
    }

}
