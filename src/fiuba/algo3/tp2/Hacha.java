package fiuba.algo3.tp2;

public class Hacha extends Herramienta{

    public Hacha(int str, int dur){
        this.durabilidad= dur;
        this.fuerza = str;
    }
    public Hacha(){}

    public Hacha armar(Madera madera){
        return new Hacha(2,100);
    }
    public Hacha armar(Piedra piedra){
        return new Hacha(5,200);

    }
    public Hacha armar(Metal metal){
        return new Hacha(10,400);
    }
}
