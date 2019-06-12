package fiuba.algo3.tp2.Mapa;

import fiuba.algo3.tp2.Herramienta.Hacha;
import fiuba.algo3.tp2.Herramienta.Pico;
import fiuba.algo3.tp2.Materiales.Material;

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
