package fiuba.algo3.tp2.modelo.Entidad.Materiales;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.AtributosHerramienta;
import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Pico;

public class MaterialVacio extends Material {
    @Override
    public AtributosHerramienta crear(Hacha hacha) {
        return null;
    }

    @Override
    public AtributosHerramienta crear(Pico pico) {
        return null;
    }

    @Override
    public AtributosHerramienta crear(Pico pico, Material material) {
        return null;
    }

    @Override
    public String obtenerCodigoMaterial() {
        return "-";
    }
}
