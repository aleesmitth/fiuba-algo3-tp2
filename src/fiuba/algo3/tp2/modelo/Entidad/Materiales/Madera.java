package fiuba.algo3.tp2.modelo.Entidad.Materiales;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.*;
import fiuba.algo3.tp2.modelo.Entidad.Jugador.Inventario;
import fiuba.algo3.tp2.modelo.Excepciones.CrearPicoFinoDeMaderaException;

public class Madera extends Material {

    public String codigo;

    public Madera() {
        this.codigo = "M";
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
            System.exit(1);
        }
        return null;
    }

    @Override
    public boolean hechoDeMadera(){
        return true;
    }

    @Override
    public void golpeadoPor(Hacha hacha, Material material, Inventario inventario) {
        hacha.usarLaHerramienta(inventario);
        this.durabilidad -= hacha.fuerza();
        if(laHerramientaMeRompio()){
            inventario.agregarMaterial(this);
            this.codigo = "-";
        }
    }

    @Override
    public String obtenerCodigoMaterial(){
        return this.codigo;
    }
}

