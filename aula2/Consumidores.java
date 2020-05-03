package JavaAvancado.aula2;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        //method reference
        // - apena
        // - utilizar o parametro que ele foi recebido
        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");
        imprimirUmaFrase2.accept("Hello World 2");
    }
}
