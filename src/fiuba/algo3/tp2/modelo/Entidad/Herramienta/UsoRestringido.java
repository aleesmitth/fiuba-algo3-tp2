package fiuba.algo3.tp2.modelo.Entidad.Herramienta;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Inventario;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Excepciones.UsarHerramientaRotaException;

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

    public boolean esUsoFino(){
        return false;
    }

    @Override
    public void usar(Inventario inventario){
        try {
            if(this.durabilidad()>0) {
                this.usos++;
                if(this.durabilidad() <= 0) inventario.romperHerramienta();
            }
            else throw new UsarHerramientaRotaException("Se intento usar una herramienta rota");
        }catch(UsarHerramientaRotaException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
    }

    @Override
    public int durabilidad(){
        if(this.usos>=this.limiteDeUsos){
           this.durabilidad = 0;
        }
        return this.durabilidad;
    }

}
