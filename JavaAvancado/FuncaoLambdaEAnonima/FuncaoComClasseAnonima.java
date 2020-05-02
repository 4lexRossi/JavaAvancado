package JavaAvancado.FuncaoLambdaEAnonima;

public class FuncaoComClasseAnonima {
    public static void main(String[] args) {
        Funcao colocarSrNaString = new Funcao() {
            @Override
            public String gerar(String valor) { return "Sr. "+ valor; }
        };
        System.out.println(colocarSrNaString.gerar("João"));
    }
}
