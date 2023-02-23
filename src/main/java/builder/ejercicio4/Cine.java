package builder.ejercicio4;

public class Cine {
    private BuilderPaquete paquete;

    public Paquete getPaquete(){return paquete.getPaquete();}

    public void setTipoPaquete(BuilderPaquete paquete) {this.paquete = paquete;}

    public void buildPaquete(){
        this.paquete.prepararPaquete();
        this.paquete.buildPipocas();
        this.paquete.buildGaseosas();
        this.paquete.buildChocolate();
    }
}
