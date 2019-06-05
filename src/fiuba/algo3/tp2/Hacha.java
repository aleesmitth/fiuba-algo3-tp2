package fiuba.algo3.tp2;

public class Hacha implements Herramienta{

    private Material material;
    private Durabilidad durabilidad;
    private Fuerza fuerza;

    public Hacha(Material material){
        this.material = material;
        this.durabilidad = new Durabilidad(material, this);
        this.fuerza = new Fuerza(material, this);
    }

    public int durabilidad(){
        return this.durabilidad.valor();
    }
    public int fuerza(){
        return this.fuerza.valor();
    }
}
