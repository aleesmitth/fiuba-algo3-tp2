package fiuba.algo3.tp2;

public abstract class Material {
    protected int durabilidad;
    public abstract Herramienta armar(Herramienta herramienta);
    public abstract void golpeadoPor(Hacha hacha);
    public abstract void golpeadoPor(Pico pico);
    public abstract void golpeadoPor(PicoFino picoFino);
}
