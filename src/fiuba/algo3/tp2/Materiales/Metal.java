package fiuba.algo3.tp2.Materiales;

import fiuba.algo3.tp2.Herramienta.*;

public class Metal implements Material {

    int durabilidad;


    public Metal(){
        this.durabilidad = 50;
    }


    @Override
    public AtributosHerramienta creable(Pico pico) {
        AtributosHerramienta atributosHerramienta=new UsoRestringido(12,400,this);
        return atributosHerramienta;
    }

    @Override
    public AtributosHerramienta creable(Pico pico, Material material) {
        AtributosHerramienta atributosHerramienta=new UsoMinimo(20,1000,this,10,material);
        return atributosHerramienta;
    }

    @Override
    public AtributosHerramienta creable(Hacha hacha) {
        AtributosHerramienta atributosHerramienta=new UsoLineal(10,400,this,2);
        return atributosHerramienta;
    }

    @Override
    public void golpeadoPor(Hacha hacha, Material material) {}

    @Override
    public void golpeadoPor(Pico pico, Material material) {
        if(material.hechoDePiedra()){
            this.durabilidad -= pico.fuerza();
            pico.usarLaHerramienta();
        }
    }

    @Override
    public void golpeadoPor(Pico pico, Material material, Material materialSecundario) { }

    @Override
    public boolean hechoDePiedra(){return false;}

    @Override
    public boolean hechoDeMetal(){return true;}

    @Override
    public boolean hechoDeMadera(){return false;}

}


