package fiuba.algo3.tp2;

public interface Material {

    public AtributosHerramienta creable(Hacha hacha);

    public AtributosHerramienta creable(Pico pico);

    public AtributosHerramienta creable(Pico pico,Material material);

    public void golpeadoPor(Hacha hacha,Material material);

    public void golpeadoPor(Pico pico,Material material);

    public void golpeadoPor(Pico pico,Material material,Material materialSecundario);

    public boolean hechoDePiedra();

    public boolean hechoDeMetal();

    public boolean hechoDeMadera();

}
