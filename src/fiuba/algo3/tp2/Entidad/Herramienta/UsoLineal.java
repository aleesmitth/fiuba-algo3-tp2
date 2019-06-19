package fiuba.algo3.tp2.Entidad.Herramienta;

import fiuba.algo3.tp2.Entidad.Materiales.Material;
import fiuba.algo3.tp2.Excepciones.UsarHerramientaRotaException;

public class UsoLineal extends AtributosHerramienta {

    public UsoLineal(int fuerzaInicial, int durabilidad, Material material, double desgasteInicial){
        this.fuerza=fuerzaInicial;
        this.durabilidad=durabilidad;
        this.materialPrimario=material;
        this.desgaste = this.fuerza/desgasteInicial;
    }

    @Override
    public void usar(){
        try {
            if(this.durabilidad()>0) {
                this.durabilidad -= this.desgaste;
            }
            else throw new UsarHerramientaRotaException("Se intento usar una herramienta rota");
        }catch(UsarHerramientaRotaException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
    }
}
