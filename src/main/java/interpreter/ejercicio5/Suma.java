package interpreter.ejercicio5;

public class Suma extends OperacionMatematica{
    @Override
    public void interpreter(Context context) {
        if(context.input.startsWith("+")){
            context.multiplicacion=false;
            context.input=context.input.substring(1);
        }
    }
}
