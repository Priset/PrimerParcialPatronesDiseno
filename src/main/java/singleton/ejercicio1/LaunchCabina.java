package singleton.ejercicio1;

public class LaunchCabina {
    public static void main(String[] args) {
        Vehiculo veh1 = new Vehiculo("8778ADFSD","Sedan","Rojo",8);
        Vehiculo veh2 = new Vehiculo("7894YTY","Camioneta","Azul",9);
        Vehiculo veh3 = new Vehiculo("020302GF","Vagoneta","Cafe",20);
        Vehiculo veh4 = new Vehiculo("05651GF","Mini ban","Plomo",10);
        Vehiculo veh5 = new Vehiculo("65448FGFG","Compacto","Cafe",5);
        Vehiculo veh6 = new Vehiculo("FGG0515","Full Version","Negro",3);

        veh1.registro();
        veh1.pago();

        veh2.registro();
        veh2.pago();

        veh3.registro();
        veh3.pago();

        veh4.registro();
        veh4.pago();

        veh5.registro();
        veh5.pago();

        veh6.registro();
        veh6.pago();
    }
}
