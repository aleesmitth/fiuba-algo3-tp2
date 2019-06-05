package fiuba.algo3.tp2;

public abstract class Herramienta {
    protected int fuerza;
    protected int durabilidad;

    public int fuerza(){
        return this.fuerza;
    }
    public int durabilidad(){
        return this.durabilidad;
    }
    public abstract Herramienta armar(Madera madera);
    public abstract Herramienta armar(Piedra piedra);
    public abstract Herramienta armar(Metal metal);
}
