package fiuba.algo3.tp2;

public class AtributosHerramienta {
    protected int durabilidad;
    protected int fuerza;
    protected int desgaste;
    protected boolean estaRota;
    private Material materialPrimario;


    public int fuerza(){

        return this.fuerza;
    }

    public int durabilidad(){

        return this.durabilidad;
    }

    public Material hechoDe(){

        return this.materialPrimario;
    }

    public boolean estaRota() {

        return this.estaRota;
    }

    public void actualizarDesgaste() {

        this.desgaste = (int)(this.durabilidad*0.1);
    }

    /**
     * Constructor aplica polimorfismo,creacion de Herramienta.
     */


    public AtributosHerramienta(int fuerzaRecibida, int durabilidadInicial, Madera madera, Hacha hacha){
        this.fuerza=fuerzaRecibida;
        this.durabilidad=durabilidadInicial;
        this.materialPrimario=madera;
        this.desgaste = this.fuerza;
        this.estaRota = false;
    }
    public AtributosHerramienta(int fuerzaRecibida, int durabilidadInicial, Piedra piedra, Hacha hacha){
        this.fuerza=fuerzaRecibida;
        this.durabilidad=durabilidadInicial;
        this.materialPrimario=piedra;
        this.desgaste = this.fuerza;
        this.estaRota = false;
    }
    public AtributosHerramienta(int fuerzaRecibida, int durabilidadInicial, Metal metal, Hacha hacha){
        this.fuerza=fuerzaRecibida;
        this.durabilidad=durabilidadInicial;
        this.materialPrimario=metal;
        this.desgaste = this.fuerza/2;
        this.estaRota = false;
    }
    public AtributosHerramienta(int fuerzaRecibida, int durabilidadInicial, Madera madera, Pico pico){
        this.fuerza=fuerzaRecibida;
        this.durabilidad=durabilidadInicial;
        this.materialPrimario=madera;
        this.desgaste = this.fuerza;
        this.estaRota = false;
    }
    public AtributosHerramienta(int fuerzaRecibida, int durabilidadInicial, Piedra piedra, Pico pico){
        this.fuerza=fuerzaRecibida;
        this.durabilidad=durabilidadInicial;
        this.materialPrimario=piedra;
        this.desgaste = (int)(this.fuerza/1.5);
        this.estaRota = false;
    }
    public AtributosHerramienta(int fuerzaRecibida, int durabilidadInicial, Metal metal, Pico pico){
        this.fuerza=fuerzaRecibida;
        this.durabilidad=durabilidadInicial;
        this.materialPrimario=metal;
        this.desgaste = 0;
        this.estaRota = false;
    }
    public AtributosHerramienta(int fuerzaRecibida, int durabilidadInicial, Piedra piedra, PicoFino picoFino){
        this.fuerza=fuerzaRecibida;
        this.durabilidad=durabilidadInicial;
        this.materialPrimario=piedra;
        this.desgaste = (int)(this.durabilidad*0.1);
        this.estaRota = false;
    }
    public AtributosHerramienta(int fuerzaRecibida, int durabilidadInicial, Metal metal, PicoFino picoFino){
        this.fuerza=fuerzaRecibida;
        this.durabilidad=durabilidadInicial;
        this.materialPrimario=metal;
        this.desgaste = (int)(this.durabilidad*0.1);
        this.estaRota = false;
    }

}
