package prototype.ejercicio2;

public class Televisor implements ITelevisor{
    private String sistemaOperativo;
    private String versionSistemaOperativo;
    private int pulgadas;
    private int resolucion;
    private boolean puertoHdmi;
    private int puertosUsb;
    private boolean controlRemoto;
    private boolean bluetooth;
    private String serial;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getVersionSistemaOperativo() {
        return versionSistemaOperativo;
    }

    public void setVersionSistemaOperativo(String versionSistemaOperativo) {
        this.versionSistemaOperativo = versionSistemaOperativo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHdmi() {
        return puertoHdmi;
    }

    public void setPuertoHdmi(boolean puertoHdmi) {
        this.puertoHdmi = puertoHdmi;
    }

    public int getPuertosUsb() {
        return puertosUsb;
    }

    public void setPuertosUsb(int puertosUsb) {
        this.puertosUsb = puertosUsb;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
    public void showTelevisor(){
        System.out.println("****************TELEVISOR*****************");
        System.out.println("Sistema operativo: "+getSistemaOperativo());
        System.out.println("Version Sistema Operativo: "+getVersionSistemaOperativo());
        System.out.println("Pulagas: "+getPulgadas());
        System.out.println("Resolución: "+getResolucion());
        System.out.println("HDMI: "+isPuertoHdmi());
        System.out.println("Número de puertos USB: "+getPuertosUsb());
        System.out.println("Bluetooth: "+isBluetooth());
        System.out.println("Control remoto: "+isControlRemoto());
        System.out.println("Serial: "+getSerial());
    }

    @Override
    public Televisor clone() {
        Televisor clon = new Televisor();
        clon.setSistemaOperativo(this.sistemaOperativo);
        clon.setVersionSistemaOperativo(this.versionSistemaOperativo);
        clon.setPulgadas(this.pulgadas);
        clon.setResolucion(this.resolucion);
        clon.setPuertoHdmi(this.puertoHdmi);
        clon.setPuertosUsb(this.puertosUsb);
        clon.setBluetooth(this.bluetooth);
        clon.setControlRemoto(this.controlRemoto);
        setSerial(this.serial);
        return clon;
    }
}
