package abstractFactory.ejercicio3;

public class Batidora extends Producto{
    private int precio;
    @Override
    public void precio(int precio) {
        System.out.println("El producto tiene un precio de "+precio);
    }
}
