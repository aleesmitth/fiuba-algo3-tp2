package fiuba.algo3.tp2;

public class Madera extends Material{
    public Madera()
    {
        this.durabilidadMaterial = 10;
    }

    @Override
    public Herramienta armar(Herramienta herramienta){

        return herramienta.armar(this);
    }

    @Override
    public void golpeadoPor(Hacha hacha) {

        this.durabilidadMaterial = this.durabilidadMaterial - hacha.fuerza();
    }

}
