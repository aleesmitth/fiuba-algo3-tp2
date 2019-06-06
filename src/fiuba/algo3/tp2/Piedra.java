package fiuba.algo3.tp2;

public class Piedra extends Material{

    public Piedra(){

        this.durabilidadMaterial = 30;
    }

    @Override
    public Herramienta armar(Herramienta herramienta){

        return herramienta.armar(this);
    }

    @Override
    public void golpeadoPor(Pico pico) {

        this.durabilidadMaterial -= pico.fuerza();
    }

    @Override
    public void golpeadoPor(PicoFino picoFino) {

        this.durabilidadMaterial = this.durabilidadMaterial - picoFino.fuerza();
    }
}
