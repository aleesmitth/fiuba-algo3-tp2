package fiuba.algo3.tp2;

public class Hacha extends Herramienta{

    AtributosHerramienta atributos;

    public Hacha(Material material) {
        this.atributos = material.creable(this);
    }

    public int fuerza(){
        return this.atributos.fuerza();
    }

    public int durabilidad(){
        return this.atributos.durabilidad();
    }

    public void usarLaHerramienta(){this.atributos.usar();}

    @Override
    public void usarContra(Material material) {
        material.golpeadoPor(this,this.atributos.hechoDe());
    }


}
