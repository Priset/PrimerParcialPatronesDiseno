package builder.ejercicio4;

public class PaqueteMediano extends BuilderPaquete{
    @Override
    public void buildPipocas() {
        this.paquete.setPipocas("Grandes.");
    }

    @Override
    public void buildGaseosas() {
        this.paquete.setGaseosas("2 vasos de refrescos.");
    }

    @Override
    public void buildChocolate() {
        this.paquete.setChocolate("1 chocolate.");
    }
}
