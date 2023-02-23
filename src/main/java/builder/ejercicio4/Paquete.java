package builder.ejercicio4;

public class Paquete {
    private String pipocas;
    private String gaseosas;
    private String chocolate;

    public String getPipocas() {
        return pipocas;
    }

    public Paquete setPipocas(String pipocas) {
        this.pipocas = pipocas;
        return this;
    }

    public String getGaseosas() {
        return gaseosas;
    }

    public Paquete setGaseosas(String gaseosas) {
        this.gaseosas = gaseosas;
        return this;
    }

    public String getChocolate() {
        return chocolate;
    }

    public Paquete setChocolate(String chocolate) {
        this.chocolate = chocolate;
        return this;
    }
    public void showPaquete(){
        System.out.println("Pipocas: "+getPipocas());
        System.out.println("Gaseosas: "+getGaseosas());
        System.out.println("Chocolates: "+getChocolate());
    }
}
