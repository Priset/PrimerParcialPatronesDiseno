package abstractFactory.ejercicio3;

public class Microondas extends Producto{
    private int precio;
    @Override
    public void precio(int precio) {
        System.out.println("El producto tiene un precio de "+precio);
    }
}
