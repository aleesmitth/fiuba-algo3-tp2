package fiuba.algo3.tp2;

public class Hacha extends Herramienta{
    protected void desgastar(){
        atributos.durabilidad-=atributos.desgaste;
    }
    public Hacha(int str, int dur, Madera madera){
        this.atributos = new AtributosHerramienta(str,dur,madera,this);
    }
    public Hacha(int str, int dur, Piedra piedra){
        this.atributos = new AtributosHerramienta(str,dur,piedra,this);
    }
    public Hacha(int str, int dur, Metal metal){
        this.atributos = new AtributosHerramienta(str,dur,metal,this);
    }
    public Hacha(){}
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
        this.desgastar();
        material.golpeadoPor(this);
    }

}
