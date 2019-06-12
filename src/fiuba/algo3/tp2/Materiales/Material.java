package fiuba.algo3.tp2.Materiales;

import fiuba.algo3.tp2.Herramienta.AtributosHerramienta;
import fiuba.algo3.tp2.Herramienta.Hacha;
import fiuba.algo3.tp2.Herramienta.Pico;

public abstract class Material {

    int durabilidad;

    public AtributosHerramienta creable(Hacha hacha){ return null; }

    public AtributosHerramienta creable(Pico pico){ return null; }

    public AtributosHerramienta creable(Pico pico,Material material){ return null; }

    public void golpeadoPor(Hacha hacha,Material material){}

    public void golpeadoPor(Pico pico,Material material){}

    public void golpeadoPor(Pico pico,Material material,Material materialSecundario){}

    public int durabilidad(){return this.durabilidad;}

    public boolean hechoDePiedra(){ return false; }

    public boolean hechoDeMetal(){ return false; }

    public boolean hechoDeMadera(){ return false; }

}
