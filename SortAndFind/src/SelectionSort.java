import com.google.common.collect.Lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public static <T extends Comparable> List<T> sort(List<T> list) {
        for(int i=0;i<list.size();i++) {
            int minIndex=i;
            T minElement = list.get(i);
            for(int j=i+1;j<list.size();j++) {
                if (list.get(j).compareTo(minElement) < 0) {
                    minElement = list.get(j);
                    minIndex=j;
                }
            }
            if (i != minIndex) {
                T temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList arrayList = Lists.newArrayList(1, 7, 9, 7, 2, 4, 6, 0, 5);
        System.out.println(SelectionSort.sort(arrayList));
    }
}
