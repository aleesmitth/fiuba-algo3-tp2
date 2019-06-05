package fiuba.algo3.tp2;

public class Piedra extends Material{

    public Piedra(){
        this.durabilidad = 30;
    }

    @Override
    public Herramienta armar(Herramienta herramienta){
        return herramienta.armar(this);
    }

    @Override
    public void golpeadoPor(Hacha hacha) {

    }

    @Override
    public void golpeadoPor(Pico pico) {
        this.durabilidad-=pico.fuerza();
    }

    @Override
    public void golpeadoPor(PicoFino picoFino) {
        this.durabilidad-=picoFino.fuerza();
    }
}
