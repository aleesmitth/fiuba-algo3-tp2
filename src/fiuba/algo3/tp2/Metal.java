public class Metal extends Material{

    @Override
    public Herramienta armar(Herramienta herramienta){
        return herramienta.armar(this);
    }
}
