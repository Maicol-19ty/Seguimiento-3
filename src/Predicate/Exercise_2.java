package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Exercise_2 {

    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("hola", "mundo", "programación", "funcional");

        Predicate<String> empiezaConH = s -> s.startsWith("h");

        List<String> palabrasFiltradas = palabras.stream()
                .filter(empiezaConH)
                .collect(Collectors.toList());

        System.out.println("Palabras que empiezan con 'h': " + palabrasFiltradas);
    }


}
