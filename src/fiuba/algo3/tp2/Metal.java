package fiuba.algo3.tp2;

public class Metal extends Material{

    public Metal(){
        this.atributos = new AtributosMaterial(50);
    }

    @Override
    public Herramienta armar(Herramienta herramienta){
        return herramienta.armar(this);
    }

    @Override
    public void golpeadoPor(Pico pico) {
        if(pico.hechoDe() instanceof Piedra || pico.hechoDe() instanceof Metal){
            this.atributos.durabilidad -= pico.fuerza();
        }
    }

    @Override
    public void golpeadoPor(PicoFino picoFino) {
        this.atributos.durabilidad -=picoFino.fuerza();
    }
}
