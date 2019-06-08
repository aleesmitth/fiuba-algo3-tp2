package fiuba.algo3.tp2;

public class Piedra implements Material {

    int durabilidad;

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
    public void golpeadoPor(Hacha hacha, Material material) {}

    @Override
    public void golpeadoPor(Pico pico, Material material) {
        this.durabilidad -= pico.fuerza();
        pico.usarLaHerramienta();
    }

    @Override
    public void golpeadoPor(Pico pico, Material material, Material materialSecundario) { }

    @Override
    public boolean hechoDePiedra(){return true;}

    @Override
    public boolean hechoDeMetal(){return false;}

    @Override
    public boolean hechoDeMadera(){return false;}

}
