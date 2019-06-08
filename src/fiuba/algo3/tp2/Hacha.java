package fiuba.algo3.tp2;

public class Hacha extends Herramienta{

    public Hacha(){}

    @Override
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

    @Override
    public Hacha armar(Madera madera){

        return new Hacha(2,100,madera);
    }

    @Override
    public Hacha armar(Piedra piedra){

        return new Hacha(5,200,piedra);
    }

    @Override
    public Hacha armar(Metal metal){

        return new Hacha(10,400,metal);
    }

    @Override
    public void usarContra(Material material){
        try {
            if(this.atributos.durabilidad()<= 0){
                throw new UsarHerramientaRotaException("EXCEPCION LANZADA:Se intento usar una herramienta rota-it's not allowed");
            }
        }catch(UsarHerramientaRotaException excepcion){
            System.out.println(excepcion.getMessage());
        }
        this.desgastar();
        material.golpeadoPor(this);
    }

}
