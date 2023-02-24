package interpreter.ejercicio5;

public class LaunchOperacion {
    public static void main(String[] args) {
        String operacion = "2 * 3 + 5 + 5 + 5";
        Evaluador evaluador = new Evaluador("*"+operacion);
        System.out.println("Resultado final: "+evaluador.evaluarFormula());
    }
}
