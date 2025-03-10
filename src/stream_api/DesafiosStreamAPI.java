package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DesafiosStreamAPI {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    // Desafio 1
    List<Integer> numerosOrdenados = numeros.stream().sorted().toList();

    // Desafio 2
    int somarNumerosPares = numeros.stream()
            .filter(n -> n % 2 == 0)
            .reduce(0, Integer::sum);

    // Desafio 3
    List<Integer> numerosPositivos = numeros.stream()
            .filter(n -> n > 0).toList();

    // Desafio 4
    List<Integer> numerosPares = numeros.stream()
            .filter(n -> n % 2 == 0)
            .sorted()
            .toList();

    // Desafio 5
    double mediaNumerosMaiorQue5 = numeros.stream()
            .filter(n -> n > 5)
            .mapToInt(Integer::intValue)
            .average().orElse(0);

    // Desafio 6
    int numeroMaiorQue10 = numeros.stream()
            .filter(n -> n > 10)
            .reduce(0, Integer::sum);

    // Desafio 7
    Optional<Integer> segundoMaior = numeros.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst();

    // Desafio 8
    int somarDigitos = numeros.stream()
            .mapToInt(num -> {
                String numStr = String.valueOf(Math.abs(num));
                return numStr.chars()
                        .map(c -> Character.getNumericValue(c))
                        .sum();
            })
            .sum();

    // Desafio 9
    List<Integer> numerosDistintoList = numeros.stream()
            .distinct()
            .toList();

    // Desafio 10
    List<Integer> numerosMultiplosDe3e5 = numeros.stream()
            .filter(n -> n % 3 == 0 || n % 5 == 0)
            .sorted()
            .toList();

    public static void main(String[] args) {
        DesafiosStreamAPI desafio = new DesafiosStreamAPI();
        // System.out.println("Desafio 1");
        // System.out.println(desafio.numerosOrdenados);
        // System.out.println("Desafio 2");
        // System.out.println(desafio.somarNumerosPares);
        // System.out.println("Desafio 3");
        // System.out.println(desafio.numerosPositivos);
        // System.out.println("Desafio 4");
        // System.out.println(desafio.numerosPares);
        // System.out.println("Desafio 5");
        // System.out.println(desafio.mediaNumerosMaiorQue5);
        // System.out.println("Desafio 6");
        // System.out.println(desafio.numeroMaiorQue10);
        // System.out.println("Desafio 7");
        // System.out.println(desafio.segundoMaior);
        // System.out.println("Desafio 8");
        // System.out.println(desafio.somarDigitos);
        // System.out.println("Desafio 9");
        // System.out.println(desafio.numerosDistintoList);
        System.out.println("Desafio 10");
        System.out.println(desafio.numerosMultiplosDe3e5);
    }
}
