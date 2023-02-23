package builder.ejercicio4;

public class LaunchPaquete {
    public static void main(String[] args) {
        Cine cine = new Cine();
        MegaPaquete mega = new MegaPaquete();
        PaqueteMediano mediano = new PaqueteMediano();
        PaqueteNormal normal = new PaqueteNormal();

        cine.setTipoPaquete(mega);
        cine.buildPaquete();

        Paquete paquete = cine.getPaquete();
        System.out.println("***************MEGA PAQUETE***************");
        paquete.showPaquete();

        cine.setTipoPaquete(mediano);
        cine.buildPaquete();

        Paquete paquete2 = cine.getPaquete();
        System.out.println("***************PAQUETE MEDIANO***************");
        paquete2.showPaquete();

        cine.setTipoPaquete(normal);
        cine.buildPaquete();

        Paquete paquete3 = cine.getPaquete();
        System.out.println("**************PAQUETE NORMAL***************");
        paquete3.showPaquete();
    }
}
