import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BubbleSort {


    public static <T extends Comparable> List<T> sort(List<T> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = i; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(i)) < 0) {
                    T temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList arrayList = Lists.newArrayList(16, 4, 8, 6, 7, 3, 5, 0);

        System.out.println(BubbleSort.sort(arrayList));
    }
}
