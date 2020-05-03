package JavaAvancado.aula2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes ={"Davi", "Estevão", "Elis", "Alex", "Instrutor", "Java"};
        Integer[] numeros = {1,2,3,4,5};
     //   imprimirNomesFiltrados(nomes);
     //   imprimirTodosNomes(nomes);
     //   imprimirDobroItemLista(numeros);
        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Tester");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes) {
        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("Davi")) {
                nomesParaImprimir += "" + nomes[i];
            }
        }
        System.out.println("Nomes do For :" + nomesParaImprimir);

        String nomesDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Davi"))
                .collect(Collectors.joining());
        System.out.println("Nomes do Stream :" + nomesDaStream);
    }

    public static void imprimirTodosNomes(String... nomes) {
        for (String nome : nomes) {
            System.out.println("Impresso pelo for: " + nome);
        }
        Stream.of(nomes)
                .forEach(nome -> System.out.println("Impresso pelo forEach: " + nome));
    }
    public static void imprimirDobroItemLista(Integer... numeros) {
        for (Integer numero : numeros) {
            System.out.println(numero * 2);
        }
        Stream.of(numeros).map( numero -> numero*2)
                          .forEach(System.out::println);
    }
}
