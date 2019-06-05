package fiuba.algo3.tp2;

public class AtributosHerramienta {
    protected int durabilidad;
    protected int fuerza;
    protected int desgaste;
    private Material materialPrimario;


    public AtributosHerramienta(int str, int dur, Madera madera, Hacha hacha){
        this.fuerza=str;
        this.durabilidad=dur;
        this.materialPrimario=madera;
        this.desgaste = this.fuerza;
    }
    public AtributosHerramienta(int str, int dur, Piedra piedra, Hacha hacha){
        this.fuerza=str;
        this.durabilidad=dur;
        this.materialPrimario=piedra;
        this.desgaste = this.fuerza;
    }
    public AtributosHerramienta(int str, int dur, Metal metal, Hacha hacha){
        this.fuerza=str;
        this.durabilidad=dur;
        this.materialPrimario=metal;
        this.desgaste = this.fuerza/2;
    }
    public AtributosHerramienta(int str, int dur, Madera madera, Pico pico){
        this.fuerza=str;
        this.durabilidad=dur;
        this.materialPrimario=madera;
        this.desgaste = this.fuerza;
    }
    public AtributosHerramienta(int str, int dur, Piedra piedra, Pico pico){
        this.fuerza=str;
        this.durabilidad=dur;
        this.materialPrimario=piedra;
        this.desgaste = (int)(this.fuerza/1.5);
    }
    public AtributosHerramienta(int str, int dur, Metal metal, Pico pico){
        this.fuerza=str;
        this.durabilidad=dur;
        this.materialPrimario=metal;
        this.desgaste = 0;
    }
    public AtributosHerramienta(int str, int dur, Piedra piedra, PicoFino picoFino){
        this.fuerza=str;
        this.durabilidad=dur;
        this.materialPrimario=piedra;
        this.desgaste = (int)(this.durabilidad*0.1);
    }
    public AtributosHerramienta(int str, int dur, Metal metal, PicoFino picoFino){
        this.fuerza=str;
        this.durabilidad=dur;
        this.materialPrimario=metal;
        this.desgaste = (int)(this.durabilidad*0.1);
    }


    public int fuerza(){
        return this.fuerza;
    }
    public int durabilidad(){
        return this.durabilidad;
    }
    public Material hechoDe(){
        return this.materialPrimario;
    }


    public void actualizarDesgaste() {
        this.desgaste = (int)(this.durabilidad*0.1);
    }
}
