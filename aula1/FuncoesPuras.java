package JavaAvancado.aula1;

import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class FuncoesPuras {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> verificarSeMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;
        System.out.println(verificarSeMaior.test(13,12));
        System.out.println(verificarSeMaior.test(13,12));

        //conceito da imutabilidade
        int valor = 20;
        UnaryOperator<Integer> retornarDobro = v -> v * 2;
        System.out.println("Dobro do valor: " + retornarDobro.apply(valor)); // retorna o dobro
        System.out.println("Valor imutável: " + (valor)); // valor imutavel

    }
}

