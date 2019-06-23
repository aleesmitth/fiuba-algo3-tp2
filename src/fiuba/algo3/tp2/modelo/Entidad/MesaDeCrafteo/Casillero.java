package fiuba.algo3.tp2.modelo.Entidad.MesaDeCrafteo;

import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Excepciones.PonerMaterialEnCasilleroOcupadoPorOtroTipoDeMaterialException;
import fiuba.algo3.tp2.modelo.Excepciones.SacarMaterialDeCasilleroVacioException;

public class Casillero {

    private Material material;
    private boolean tengoUnMaterial;
    private int cantidad;

    public Casillero(){
        this.tengoUnMaterial = false;
        this.cantidad = 0;
    }

    public void agregarMaterial(Material material) {
        try {
            if (!this.tengoUnMaterial) {
                this.material = material;
                this.tengoUnMaterial = true;
                this.cantidad++;
            }
            else if(this.tengoUnMaterial && this.esDelMismoTipoQueElMio(material)){
                this.cantidad++;
            }
            else throw new PonerMaterialEnCasilleroOcupadoPorOtroTipoDeMaterialException("Se quiso colocar un material en un casillero del tablero ya ocupado por otro material");
        } catch (PonerMaterialEnCasilleroOcupadoPorOtroTipoDeMaterialException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
    }

    private boolean esDelMismoTipoQueElMio(Material material) {
        return material.obtenerCodigoMaterial()==this.material.obtenerCodigoMaterial();
    }

    public void sacarMaterial() {
        try {
            if (this.tengoUnMaterial) {
                this.cantidad--;
                if(this.cantidad == 0){
                    this.tengoUnMaterial = false;
                }
            }
            else throw new SacarMaterialDeCasilleroVacioException("Se quiso sacar un material de un casillero del inventario/mesa de crafteo vacio");
        } catch (SacarMaterialDeCasilleroVacioException exception){
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
