import logic.BubbleSort;
import logic.JavaSort;
import logic.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println(sort.sort(Arrays.asList(args)));
    }
}
