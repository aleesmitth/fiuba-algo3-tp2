package fiuba.algo3.tp2.modelo.Entidad.Materiales;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Inventario;
import fiuba.algo3.tp2.modelo.Excepciones.CrearHerramientaDeDiamanteException;
import fiuba.algo3.tp2.modelo.Entidad.Herramienta.*;

public class Diamante extends Material{

    private String codigo;

    public Diamante(){
        this.durabilidad=100;
        this.codigo = "D";
    }

    @Override
    public AtributosHerramienta crear(Hacha hacha) {
        try {
            throw new CrearHerramientaDeDiamanteException("Se intento crear un hacha de diamante");
        }catch(CrearHerramientaDeDiamanteException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
        return null;
    }

    @Override
    public AtributosHerramienta crear(Pico pico) {
        try {
            throw new CrearHerramientaDeDiamanteException("Se intento crear un pico de diamante");
        }catch(CrearHerramientaDeDiamanteException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
        return null;
    }

    @Override
    public AtributosHerramienta crear(Pico pico, Material material) {
        try {
            throw new CrearHerramientaDeDiamanteException("Se intento crear un pico fino de diamante");
        }catch(CrearHerramientaDeDiamanteException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
        return null;
    }

    @Override
    public void golpeadoPor(Pico pico, Material material, Inventario inventario) {
        if(pico.esPicoFino()) {
            this.durabilidad -= pico.fuerza();
            pico.usarLaHerramienta(inventario);
            if (laHerramientaMeRompio()) {
                inventario.agregarMaterial(this);
                this.codigo = "-";
            }
        }
    }

    @Override
    public String obtenerCodigoMaterial(){
        return this.codigo;
    }
}
