public class PicoFino extends Herramienta{
    public PicoFino(int str, int dur){
        this.durabilidad= dur;
        this.fuerza = str;
    }
    public PicoFino(){}

    public PicoFino armar(Madera madera){
        return new PicoFino(2,100); // aca tiene que tirar excepcion
    }
    public PicoFino armar(Piedra piedra){
        return new PicoFino(20,1000);

    }
    public PicoFino armar(Metal metal){
        return new PicoFino(20,1000);
    }
}
