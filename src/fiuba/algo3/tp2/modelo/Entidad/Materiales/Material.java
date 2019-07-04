package fiuba.algo3.tp2.modelo.Entidad.Materiales;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.AtributosHerramienta;
import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Pico;
import fiuba.algo3.tp2.modelo.Entidad.Jugador.Inventario;
import fiuba.algo3.tp2.modelo.Entidad.MesaDeCrafteo.Casillero;


public abstract class Material {

    protected int durabilidad;

    public abstract AtributosHerramienta crear(Hacha hacha);

    public abstract AtributosHerramienta crear(Pico pico);

    public abstract AtributosHerramienta crear(Pico pico, Material material);

    public void golpeadoPor(Hacha hacha, Material material, Inventario inventario){}

    public void golpeadoPor(Pico pico, Material material, Inventario inventario){}

    public void golpeadoPor(Pico pico, Material material, Material materialSecundario, Inventario inventario){}

    public int durabilidad(){return this.durabilidad;}

    public boolean hechoDePiedra(){ return false; }

    public boolean hechoDeMetal(){ return false; }

    public boolean hechoDeMadera(){ return false; }

    public abstract String obtenerCodigoMaterial();

    public boolean laHerramientaMeRompio(){
        if(this.durabilidad <= 0) return true;
        return false;
    }
}
