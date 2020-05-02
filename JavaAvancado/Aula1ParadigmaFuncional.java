package JavaAvancado;

import java.util.function.UnaryOperator;

public class Aula1ParadigmaFuncional {
    public static void main(String[] args) {
        //conceito imperativo
        int valor = 10;
        int resultado = valor * 3;
        System.out.println("Resultado : " + resultado);

        //conceito paradigma funcional
        UnaryOperator<Integer> calcularValorVezesTres = valor1 -> valor1 * 3;
        int valor1 = 10;
        System.out.println("Resultado ::: " + calcularValorVezesTres.apply(10));
    }

  }
