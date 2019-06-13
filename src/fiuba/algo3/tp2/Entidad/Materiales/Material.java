package fiuba.algo3.tp2.Entidad.Materiales;

import fiuba.algo3.tp2.Entidad.Herramienta.AtributosHerramienta;
import fiuba.algo3.tp2.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.Entidad.Herramienta.Pico;

public abstract class Material {

    int durabilidad;

    public abstract AtributosHerramienta crear(Hacha hacha);

    public abstract AtributosHerramienta crear(Pico pico);

    public abstract AtributosHerramienta crear(Pico pico, Material material);

    public void golpeadoPor(Hacha hacha,Material material){}

    public void golpeadoPor(Pico pico,Material material){}

    public void golpeadoPor(Pico pico,Material material,Material materialSecundario){}

    public int durabilidad(){return this.durabilidad;}

    public boolean hechoDePiedra(){ return false; }

    public boolean hechoDeMetal(){ return false; }

    public boolean hechoDeMadera(){ return false; }

}
