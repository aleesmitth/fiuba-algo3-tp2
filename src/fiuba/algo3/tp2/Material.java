package fiuba.algo3.tp2;

public abstract class Material {

    int durabilidad;

    public AtributosHerramienta creable(Hacha hacha){ return null; }

    public AtributosHerramienta creable(Pico pico){ return null; }

    public AtributosHerramienta creable(Pico pico,Material material){ return null; }

    public void golpeadoPor(Hacha hacha,Material material){}

    public void golpeadoPor(Pico pico,Material material){}

    public void golpeadoPor(Pico pico,Material material,Material materialSecundario){}

    public boolean hechoDePiedra(){ return false; }

    public boolean hechoDeMetal(){ return false; }

    public boolean hechoDeMadera(){ return false; }

}
