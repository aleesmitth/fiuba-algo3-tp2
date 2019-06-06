package fiuba.algo3.tp2;

public abstract class Herramienta {

    protected AtributosHerramienta atributos;



    public int fuerza(){

        return this.atributos.fuerza();
    }

    public int durabilidad() {

        return this.atributos.durabilidad();
    }

    public Material hechoDe() {

        return this.atributos.hechoDe();
    }

    public abstract Herramienta armar(Madera madera);
    public abstract Herramienta armar(Piedra piedra);
    public abstract Herramienta armar(Metal metal);

    public abstract void usarContra(Material material);

    protected abstract void desgastar();
}
