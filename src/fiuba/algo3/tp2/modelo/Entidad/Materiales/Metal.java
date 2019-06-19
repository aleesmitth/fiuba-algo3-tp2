package fiuba.algo3.tp2.modelo.Entidad.Materiales;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.*;

public class Metal extends Material {

    public Metal(){
        this.durabilidad = 50;
    }


    @Override
    public AtributosHerramienta crear(Pico pico) {
        AtributosHerramienta atributosHerramienta=new UsoRestringido(12,400,this);
        return atributosHerramienta;
    }

    @Override
    public AtributosHerramienta crear(Pico pico, Material material) {
        AtributosHerramienta atributosHerramienta=new UsoMinimo(20,1000,this,10,material);
        return atributosHerramienta;
    }

    @Override
    public AtributosHerramienta crear(Hacha hacha) {
        AtributosHerramienta atributosHerramienta=new UsoLineal(10,400,this,2);
        return atributosHerramienta;
    }

    @Override
    public void golpeadoPor(Pico pico, Material material) {
        if(material.hechoDePiedra()){
            this.durabilidad -= pico.fuerza();
            pico.usarLaHerramienta();
        }
    }

    @Override
    public boolean hechoDeMetal(){ return true; }


}


