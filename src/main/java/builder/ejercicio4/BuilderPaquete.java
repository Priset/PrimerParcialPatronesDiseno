package builder.ejercicio4;

public abstract class BuilderPaquete {
    protected Paquete paquete;
    public  Paquete getPaquete(){
        return paquete;
    }
    public void prepararPaquete(){
        paquete = new Paquete();
    }
    public abstract void buildPipocas();
    public abstract void buildGaseosas();
    public abstract void buildChocolate();
}
