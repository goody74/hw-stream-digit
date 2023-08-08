import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.*;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        StreamMain.main();

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultList = new ArrayList<>();

        for (int x : intList) {
            if (x > 0 && (x % 2 == 0)) {
                resultList.add(x);
            }
        }
        if (!resultList.isEmpty()) {
            resultList.sort(Comparator.naturalOrder());
            System.out.println(resultList.toString());
        }
    }
}