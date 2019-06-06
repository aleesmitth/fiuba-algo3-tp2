package fiuba.algo3.tp2;

public class Hacha extends Herramienta{

    public Hacha(){}


    protected void desgastar(){

        atributos.durabilidad-=atributos.desgaste;
    }


    public Hacha(int fuerzaRecibida, int durabilidadInicial, Madera madera){
        this.atributos = new AtributosHerramienta( fuerzaRecibida, durabilidadInicial,madera,this);
    }


    public Hacha(int fuerzaRecibida, int durabilidadInicial, Piedra piedra){
        this.atributos = new AtributosHerramienta( fuerzaRecibida, durabilidadInicial,piedra,this);
    }


    public Hacha(int fuerzaRecibida, int durabilidadInicial, Metal metal){
        this.atributos = new AtributosHerramienta(fuerzaRecibida, durabilidadInicial,metal,this);
    }


    public Hacha armar(Madera madera){

        return new Hacha(2,100,madera);
    }


    public Hacha armar(Piedra piedra){

        return new Hacha(5,200,piedra);
    }


    public Hacha armar(Metal metal){

        return new Hacha(10,400,metal);
    }


    public void usarContra(Material material){
        try {
            if(this.atributos.durabilidad()<= 0){
                throw new HerramientaRotaException("Se intento usar una herramienta rota-it's not allowed");
            }
        }catch(HerramientaRotaException excepcion){
            System.out.println(excepcion.getMessage());
        }
        this.desgastar();
        material.golpeadoPor(this);
    }

}
