package builder.ejercicio4;

public class MegaPaquete extends BuilderPaquete{
    @Override
    public void buildPipocas() {
        this.paquete.setPipocas("Extra Grandes.");
    }

    @Override
    public void buildGaseosas() {
        this.paquete.setGaseosas("3 vasos de gaseosas extragrandes con recarga ilimitada.");
    }

    @Override
    public void buildChocolate() {
        this.paquete.setChocolate("2 chocolates grandes.");
    }
}
