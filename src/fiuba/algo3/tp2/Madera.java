public class Madera extends Material{

    @Override
    public Herramienta armar(Herramienta herramienta){
        return herramienta.armar(this);
    }
}
