package fiuba.algo3.tp2;

public class Constructor {

    public Hacha construirHacha(Material material) {
        Hacha hacha = new Hacha(material);
        return hacha;
    }

    public Pico construirPico(Material material) {
        Pico pico = new Pico(material);
        return pico;
    }

    public Pico construirPico(Material materialPrimario,Material materialSecundario) {
        Pico pico = new Pico(materialPrimario,materialSecundario);
        return pico;
    }




}
