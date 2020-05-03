package JavaAvancado.aula2;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStrParaIntCalcDobro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornaNomeAoContrario.apply("João"));
        System.out.println(converterStrParaIntCalcDobro.apply("20"));
    }
}
