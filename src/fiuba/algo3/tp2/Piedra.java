package fiuba.algo3.tp2;

public class Piedra extends Material{

    public Piedra(){
        this.atributos = new AtributosMaterial(30);
    }

    @Override
    public Herramienta armar(Herramienta herramienta){
        return herramienta.armar(this);
    }

    @Override
    public void golpeadoPor(Pico pico) {
        this.atributos.durabilidad -= pico.fuerza();
    }

    @Override
    public void golpeadoPor(PicoFino picoFino) {
        this.atributos.durabilidad -= picoFino.fuerza();
    }
}
