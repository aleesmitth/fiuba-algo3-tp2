package fiuba.algo3.tp2;

public class Madera extends Material{
    public Madera(){
        this.atributos = new AtributosMaterial(10);
    }

    @Override
    public Herramienta armar(Herramienta herramienta){
            return herramienta.armar(this);
    }

    @Override
    public void golpeadoPor(Hacha hacha) {
        this.atributos.durabilidad -= hacha.fuerza();
    }

}
