package fiuba.algo3.tp2.Materiales;

import fiuba.algo3.tp2.Herramienta.*;

public class Piedra extends Material {

    public Piedra() {
        this.durabilidad =30;
    }

    @Override
    public AtributosHerramienta creable(Hacha hacha) {
        AtributosHerramienta atributosHerramienta=new UsoLineal(5,200,this,1);
        return atributosHerramienta;
    }

    @Override
    public AtributosHerramienta creable(Pico pico) {
        AtributosHerramienta atributosHerramienta=new UsoLineal(4,200,this,1.5);
        return atributosHerramienta;
    }

    @Override
    public AtributosHerramienta creable(Pico pico, Material material) {
        AtributosHerramienta atributosHerramienta=new UsoMinimo(20,1000,this,10,material);
        return atributosHerramienta;
    }

    @Override
    public void golpeadoPor(Pico pico, Material material) {
        this.durabilidad -= pico.fuerza();
        pico.usarLaHerramienta();
    }

    @Override
    public boolean hechoDePiedra(){return true;}

}