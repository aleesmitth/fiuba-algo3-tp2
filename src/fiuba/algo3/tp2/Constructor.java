package fiuba.algo3.tp2;

public class Constructor {
    public Herramienta construir(Material material, Herramienta herramienta) {
        return material.armar(herramienta);
    }
}
