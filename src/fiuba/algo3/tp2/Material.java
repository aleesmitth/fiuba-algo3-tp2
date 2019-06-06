package fiuba.algo3.tp2;

public abstract class Material {
    protected int durabilidad;
    public int durabilidad(){ return this.durabilidad; }
    public abstract Herramienta armar(Herramienta herramienta);
    public abstract void golpeadoPor(Hacha hacha);
    public abstract void golpeadoPor(Pico pico);
    public abstract void golpeadoPor(PicoFino picoFino);
}
/**
 *  la durabilidad deberia ser un objeto, durabilidadMaterial por ej, por si mas adelante el material tiene mas caracteristicas
 *  aunque ahora solo tenga durabilidad.
 */