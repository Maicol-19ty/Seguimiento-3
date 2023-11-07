package Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Exercise_1 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> doble = n -> n * 2;

        List<Integer> numerosDobles = numeros.stream()
                .map(doble)
                .collect(Collectors.toList());

        System.out.println("Números dobles: " + numerosDobles);
    }


}
