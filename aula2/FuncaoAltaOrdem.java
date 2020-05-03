package JavaAvancado.aula2;

import jdk.nashorn.internal.codegen.SpillObjectCreator;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = ( a, b ) -> a + b;
        Calculo mult = ( a, b ) -> a * b;
        Calculo div = ( a, b ) -> a / b;
        Calculo sub = ( a, b ) -> a - b;
        System.out.println(executarOperacao(soma,1,3));
        System.out.println(executarOperacao(mult,1,3));
        System.out.println(executarOperacao(div,2,1));
        System.out.println(executarOperacao(sub,2,1));
        System.out.println("Agora cabo né");
    }
    public static int executarOperacao(Calculo calculo, int a, int b) {
        return calculo.calcular(a, b);
    }
}

interface Calculo {
    public int calcular( int a, int b);
}
