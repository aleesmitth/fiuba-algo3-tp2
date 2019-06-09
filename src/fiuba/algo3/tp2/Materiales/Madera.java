package fiuba.algo3.tp2.Materiales;

import fiuba.algo3.tp2.Herramienta.AtributosHerramienta;
import fiuba.algo3.tp2.Herramienta.Hacha;
import fiuba.algo3.tp2.Herramienta.Pico;
import fiuba.algo3.tp2.Herramienta.UsoLineal;

public class Madera implements Material {

    int durabilidad;

    public Madera() {
        this.durabilidad = 10;
    }



    @Override
    public AtributosHerramienta creable(Hacha hacha) {
        AtributosHerramienta atributosHerramienta = new UsoLineal(2, 100, this, 1);
        return atributosHerramienta;
    }

    @Override
    public AtributosHerramienta creable(Pico pico) {
        AtributosHerramienta atributosHerramienta = new UsoLineal(2, 100, this, 1);
        return atributosHerramienta;
    }

    @Override
    public boolean hechoDePiedra(){return false;}

    @Override
    public boolean hechoDeMetal(){return false;}

    @Override
    public boolean hechoDeMadera(){return true;}

    @Override
    public AtributosHerramienta creable(Pico pico, Material material) {
        return null;
    }

    @Override
    public void golpeadoPor(Hacha hacha, Material material) {
        hacha.usarLaHerramienta();
        this.durabilidad -= hacha.fuerza();
    }

    @Override
    public void golpeadoPor(Pico pico, Material material) { }

    @Override
    public void golpeadoPor(Pico pico, Material material, Material materialSecundario) { }

}

