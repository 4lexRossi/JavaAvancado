package JavaAvancado.FuncaoLambdaEAnonima;

public class FuncaoComLambda {
    public static void main(String[] Args) {
        //exemplo expressão Lambda
        //         |
        //        \/
        //interfaceFuncional nomeVariavel = parametro -> logica
        Funcao colocarPrefixoSrNaString = valor -> "Sr. "+ valor;
        System.out.println(colocarPrefixoSrNaString.gerar("João"));
    }
}
