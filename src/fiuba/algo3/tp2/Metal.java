package fiuba.algo3.tp2;

public class Metal extends Material{

    public Metal(){
        this.durabilidad = 50;
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
        if(pico.hechoDe() instanceof Piedra || pico.hechoDe() instanceof Metal){
            this.durabilidad-=pico.fuerza();
        }
    }

    @Override
    public void golpeadoPor(PicoFino picoFino) {
        this.durabilidad-=picoFino.fuerza();
    }
}
