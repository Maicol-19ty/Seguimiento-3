package BiFuction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Exercise_1 {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 2, 3);
        List<String> lista2 = Arrays.asList("a", "b");

        BiFunction<List<Integer>, List<String>, List<String>> productoCartesiano = (l1, l2) -> {
            List<String> resultado = new ArrayList<>();
            for (Integer i : l1) {
                for (String s : l2) {
                    resultado.add(i + s);
                }
            }
            return resultado;
        };

        List<String> producto = productoCartesiano.apply(lista1, lista2);

        System.out.println("Producto cartesiano: " + producto);
    }
}

