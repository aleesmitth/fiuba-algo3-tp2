package fiuba.algo3.tp2;

public class Constructor {

    public Herramienta construir(Material material, Herramienta herramienta) {

        Herramienta herramientaArmada = material.armar(herramienta);

        return herramientaArmada;

    }
}
