package fiuba.algo3.tp2;

public class Metal extends Material{

    @Override
    public Herramienta armar(Herramienta herramienta){
        return herramienta.armar(this);
    }
}
