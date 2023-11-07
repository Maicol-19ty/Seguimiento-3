package Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Exercise_2 {

    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("hola", "mundo", "programación", "funcional");

        Function<String, Integer> longitud = s -> s.length();

        List<Integer> longitudesPalabras = palabras.stream()
                .map(longitud)
                .collect(Collectors.toList());

        System.out.println("Longitudes de las palabras: " + longitudesPalabras);
    }

}
