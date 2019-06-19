package fiuba.algo3.tp2.Entidad.Materiales;

import fiuba.algo3.tp2.Excepciones.CrearHerramientaDeDiamanteException;
import fiuba.algo3.tp2.Entidad.Herramienta.AtributosHerramienta;
import fiuba.algo3.tp2.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.Entidad.Herramienta.Pico;

public class Diamante extends Material{


    public Diamante(){
        this.durabilidad=100;
    }

    @Override
    public AtributosHerramienta crear(Hacha hacha) {
        try {
            throw new CrearHerramientaDeDiamanteException("Se intento crear un hacha de diamante");
        }catch(CrearHerramientaDeDiamanteException exception){
            System.out.println(exception.getMessage());
        }
        return null;
    }

    @Override
    public AtributosHerramienta crear(Pico pico) {
        try {
            throw new CrearHerramientaDeDiamanteException("Se intento crear un pico de diamante");
        }catch(CrearHerramientaDeDiamanteException exception){
            System.out.println(exception.getMessage());
        }
        return null;
    }

    @Override
    public AtributosHerramienta crear(Pico pico, Material material) {
        try {
            throw new CrearHerramientaDeDiamanteException("Se intento crear un pico fino de diamante");
        }catch(CrearHerramientaDeDiamanteException exception){
            System.out.println(exception.getMessage());
        }
        return null;
    }

    @Override
    public void golpeadoPor(Pico pico, Material material, Material materialSecundario) {
        this.durabilidad -= pico.fuerza();
        pico.usarLaHerramienta();
    }

    @Override
    public void golpeadoPor(Hacha hacha, Material material) {

    }

    public String obtenerCodigoMaterial(){
        return "D";
    }
}
