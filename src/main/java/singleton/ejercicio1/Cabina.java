package singleton.ejercicio1;

public class Cabina {
    public int monto;
    private static Cabina instance = null;
    private Cabina(){
        monto = 0;
        System.out.println("El monto inicial es: "+monto);
    }
    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new Cabina();
        }
    }
    public static Cabina getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }
    public synchronized void registro(String placa, String modelo, String color){
        System.out.println("******************REGISTRO DE VEHICULO****************");
        System.out.println("El auto de placa: "+placa+" , modelo "+modelo+" y color "+color+" fue exitosamente registrado.");
    }
    public synchronized void dineroRecaudado(int dinero){
        System.out.println("**************PAGO****************");
        monto = monto+dinero;
        System.out.println("Pago exitoso, dinero recaudado actual: "+monto);
    }
}
