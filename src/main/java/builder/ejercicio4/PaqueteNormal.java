package builder.ejercicio4;

public class PaqueteNormal extends BuilderPaquete{
    @Override
    public void buildPipocas() {
        this.paquete.setPipocas("Envase Normal.");
    }

    @Override
    public void buildGaseosas() {
        this.paquete.setGaseosas("1 refresco.");
    }

    @Override
    public void buildChocolate() {
        this.paquete.setChocolate("No cuenta con chocolate.");
    }
}
