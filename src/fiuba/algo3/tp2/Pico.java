public class Pico extends Herramienta{
    public Pico(int str, int dur){
        this.durabilidad = dur;
        this.fuerza = str;
    }
    public Pico(){}

    public Pico armar(Madera madera){
        return new Pico(2,100);
    }
    public Pico armar(Piedra piedra){
        return new Pico(4,200);

    }
    public Pico armar(Metal metal){
        return new Pico(12,400);
    }
}
