package aula5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class inferenciaExemplo {
    public static void main(String[] args) throws IOException {
        connectAndPrintURLJavaOracle();
        printarNomeCompleto("joão", "Santos");
        printarSoma( 5, 5,5);
    }

    private static void connectAndPrintURLJavaOracle() throws IOException {
        var url = new URL("https://docs.oracle.com/javase/10/language/");
        var urlConnection= url.openConnection();
        var bufferedReader= new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }

    public static void printarNomeCompleto(String nome, String sobrenome){
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static void printarSoma(int... numeros) {
        int soma;
        if(numeros.length > 0){
            soma=0;
            for (var numero : numeros){
                soma += numero;
            }
            System.out.println("A soma é :::"+ soma);
        }
    }
}
// var não pode ser utilizada em nível de classe;
// var não pode ser utilizada como parametro;
// var não pode ser utilizadas em variaveis locais não inicializadas;