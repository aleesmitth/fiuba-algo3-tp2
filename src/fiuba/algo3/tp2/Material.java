package fiuba.algo3.tp2;

public abstract class Material {
    
    protected AtributosMaterial atributos;

    public int durabilidad(){
        return this.atributos.durabilidad();
    }

    public abstract Herramienta armar(Herramienta herramienta);

    public void golpeadoPor(Hacha hacha){}

    public void golpeadoPor(Pico pico){}

    public void golpeadoPor(PicoFino picoFino){}
}