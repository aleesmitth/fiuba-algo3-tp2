package fiuba.algo3.tp2.Materiales;

import fiuba.algo3.tp2.Herramienta.AtributosHerramienta;
import fiuba.algo3.tp2.Herramienta.Hacha;
import fiuba.algo3.tp2.Herramienta.Pico;

public class Diamante implements Material{

    int durabilidad;


    public Diamante(){
        this.durabilidad=100;
    }

    @Override
    public AtributosHerramienta creable(Pico pico) {
        return null;
    }

    @Override
    public AtributosHerramienta creable(Pico pico, Material material) {
        return null;
    }

    @Override
    public AtributosHerramienta creable(Hacha hacha) {
        return null;
    }

    @Override
    public void golpeadoPor(Hacha hacha, Material material) {}

    @Override
    public void golpeadoPor(Pico pico, Material material) { }

    @Override
    public void golpeadoPor(Pico pico, Material material, Material materialSecundario) { pico.usarLaHerramienta(); }

    @Override
    public boolean hechoDeMadera() { return false; }

    @Override
    public boolean hechoDeMetal() { return false; }

    @Override
    public boolean hechoDePiedra() { return false; }

}
