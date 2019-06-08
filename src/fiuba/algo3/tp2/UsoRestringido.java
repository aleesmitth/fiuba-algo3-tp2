package fiuba.algo3.tp2;

public class UsoRestringido extends AtributosHerramienta{

    int usos;
    int limiteDeUsos;



    public UsoRestringido(int fuerzaInicial, int durabilidad, Material material){
        this.fuerza=fuerzaInicial;
        this.durabilidad=durabilidad;
        this.materialPrimario=material;
        this.desgaste = 0;
        this.usos =0;
        this.limiteDeUsos = 10;
    }

    @Override
    public void usar(){this.usos++;}

    @Override
    public int durabilidad(){
        if(this.usos==this.limiteDeUsos){
           this.durabilidad = 0;
        }
        return this.durabilidad;
    }

}
