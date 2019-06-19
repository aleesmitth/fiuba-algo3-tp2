package fiuba.algo3.tp2.modelo.Entidad.Materiales;

import fiuba.algo3.tp2.modelo.Excepciones.CrearPicoFinoDeMaderaException;
import fiuba.algo3.tp2.modelo.Entidad.Herramienta.AtributosHerramienta;
import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Pico;
import fiuba.algo3.tp2.modelo.Entidad.Herramienta.UsoLineal;

public class Madera extends Material {

    public Madera() {
        this.durabilidad = 10;
    }


    @Override
    public AtributosHerramienta crear(Hacha hacha) {
        AtributosHerramienta atributosHerramienta = new UsoLineal(2, 100, this, 1);
        return atributosHerramienta;
    }

    @Override
    public AtributosHerramienta crear(Pico pico) {
        AtributosHerramienta atributosHerramienta = new UsoLineal(2, 100, this, 1);
        return atributosHerramienta;
    }
    @Override
    public AtributosHerramienta crear(Pico pico, Material material) {
        try {
            throw new CrearPicoFinoDeMaderaException("Se intento crear un pico fino de madera");
        }catch(CrearPicoFinoDeMaderaException exception){
            System.out.println(exception.getMessage());
        }
        return null;
    }

    @Override
    public boolean hechoDeMadera(){ return true; }

    @Override
    public void golpeadoPor(Hacha hacha, Material material) {
        hacha.usarLaHerramienta();
        this.durabilidad -= hacha.fuerza();
    }

}

