package prototype.ejercicio2;

public class LaunchTelevisor {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.setSistemaOperativo("Android");
        televisor.setVersionSistemaOperativo("11.0");
        televisor.setPulgadas(80);
        televisor.setResolucion(50);
        televisor.setPuertoHdmi(true);
        televisor.setPuertosUsb(4);
        televisor.setControlRemoto(true);
        televisor.setBluetooth(true);
        televisor.setSerial("");

        Televisor tele1 = televisor.clone();
        tele1.setSerial("7415QERTY30");

        Televisor tele2 = televisor.clone();
        tele2.setSerial("02156DFR8T");

        Televisor tele3 = televisor.clone();
        tele3.setSerial("000123SDFG");

        Televisor tele4 = televisor.clone();
        tele4.setSerial("QPOTRK4578");

        Televisor tele5 = televisor.clone();
        tele5.setSerial("963258POIL");

        Televisor tele6 = televisor.clone();
        tele6.setSerial("01234SJDHL");

        tele1.showTelevisor();
        tele2.showTelevisor();
        tele3.showTelevisor();
        tele4.showTelevisor();
        tele5.showTelevisor();
        tele6.showTelevisor();
    }
}
