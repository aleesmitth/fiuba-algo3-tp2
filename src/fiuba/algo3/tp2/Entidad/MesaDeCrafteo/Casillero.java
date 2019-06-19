package fiuba.algo3.tp2.Entidad.MesaDeCrafteo;

import fiuba.algo3.tp2.Entidad.Materiales.Material;
import fiuba.algo3.tp2.Excepciones.PonerMaterialEnCasilleroDeTableroOcupadoException;

public class Casillero {

    private Material material;
    private boolean tengoUnMaterial;

    public Casillero(){
        this.tengoUnMaterial = false;
    }

    public void agregarMaterial(Material material) {
        try {
            if (!this.tengoUnMaterial) {
                this.material = material;
                this.tengoUnMaterial = true;
            }
            else throw new PonerMaterialEnCasilleroDeTableroOcupadoException("Se quiso colocar un material en un casillero del tablero ya ocupado");
        } catch (PonerMaterialEnCasilleroDeTableroOcupadoException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
    }

    public String obtenerCodigoMaterial() {
        if(this.tengoUnMaterial) {
            return material.obtenerCodigoMaterial();
        }
        else return "-";
    }
}
