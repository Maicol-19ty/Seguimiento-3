package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Exercise_1 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Predicate<Integer> esPar = n -> n % 2 == 0;

        List<Integer> pares = numeros.stream()
                .filter(esPar)
                .collect(Collectors.toList());

        System.out.println("Números pares: " + pares);
    }

}
