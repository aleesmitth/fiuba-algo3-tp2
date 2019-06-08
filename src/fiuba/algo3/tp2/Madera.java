package fiuba.algo3.tp2;

public class Madera extends Material {

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
    public boolean hechoDeMadera(){ return true; }

    @Override
    public void golpeadoPor(Hacha hacha, Material material) {
        hacha.usarLaHerramienta();
        this.durabilidad -= hacha.fuerza();
    }

}

