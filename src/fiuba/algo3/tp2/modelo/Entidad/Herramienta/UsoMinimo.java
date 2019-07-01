package fiuba.algo3.tp2.modelo.Entidad.Herramienta;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Inventario;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Excepciones.UsarHerramientaRotaException;

public class UsoMinimo extends AtributosHerramienta {

    public UsoMinimo(int fuerzaInicial, int durabilidad, Material primerMaterial, double desgasteInicial, Material segundoMaterial){
        this.fuerza=fuerzaInicial;
        this.durabilidad=durabilidad;
        this.materialPrimario=primerMaterial;
        this.materialSecundario=segundoMaterial;
        this.desgaste = desgasteInicial;
    }

    @Override
    public void usar(Inventario inventario) {
        try {
            if(this.durabilidad()>0) {
                this.durabilidad-=this.durabilidad/10;
                if(this.durabilidad() <= 0) inventario.romperHerramienta();
            }
            else throw new UsarHerramientaRotaException("Se intento usar una herramienta rota");
        }catch(UsarHerramientaRotaException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
    }

    @Override
    public boolean esUsoFino(){return true;};

}
