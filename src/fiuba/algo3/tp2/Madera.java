package fiuba.algo3.tp2;

public class Madera extends Material{
    public Madera(){
        this.durabilidad = 10;
    }

    @Override
    public Herramienta armar(Herramienta herramienta){
            return herramienta.armar(this);
    }

    @Override
    public void golpeadoPor(Hacha hacha) {
        this.durabilidad-=hacha.fuerza();
    }

    @Override                          //en estos dos metodos hay que ver si pico y picofino rompen madera o no.
    public void golpeadoPor(Pico pico) {

    }

    @Override
    public void golpeadoPor(PicoFino picoFino) {

    }

}
