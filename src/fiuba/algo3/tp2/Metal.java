package fiuba.algo3.tp2;

public class Metal extends Material{

    public Metal(){

        this.durabilidadMaterial = 50;
    }

    @Override
    public Herramienta armar(Herramienta herramienta){

        return herramienta.armar(this);
    }

    @Override
    public void golpeadoPor(Pico pico) {
        if(pico.hechoDe() instanceof Piedra || pico.hechoDe() instanceof Metal){
            this.durabilidadMaterial = this.durabilidadMaterial - pico.fuerza();
        }
    }

    @Override
    public void golpeadoPor(PicoFino picoFino) {

        this.durabilidadMaterial = this.durabilidadMaterial - picoFino.fuerza();
    }
}
