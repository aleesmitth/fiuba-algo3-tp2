package fiuba.algo3.tp2.Entidad.Materiales;

import fiuba.algo3.tp2.Entidad.Herramienta.*;

public class Piedra extends Material {

    public Piedra() {
        this.durabilidad =30;
    }

    @Override
    public AtributosHerramienta crear(Hacha hacha) {
        AtributosHerramienta atributosHerramienta=new UsoLineal(5,200,this,1);
        return atributosHerramienta;
    }

    @Override
    public AtributosHerramienta crear(Pico pico) {
        AtributosHerramienta atributosHerramienta=new UsoLineal(4,200,this,1.5);
        return atributosHerramienta;
    }

    @Override
    public AtributosHerramienta crear(Pico pico, Material material) {
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
