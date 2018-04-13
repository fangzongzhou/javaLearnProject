import com.google.common.collect.Lists;

import java.awt.*;
import java.util.List;

public class MergeSort {

    public static <T extends Comparable> java.util.List<T> sort(List<T> list){
        if (list.size() <= 1) {
            return list;
        }
        int mid=list.size()/2;
        List resList = mergeList(list.subList(0, mid), list.subList(mid, list.size()));
        return resList;
    }

    private static <T extends Comparable> List<T> mergeList(List<T> lista, List<T> listb) {
        int indexa=0;
        int indexb=0;
        lista.addAll(listb);
        lista.sort(Comparable::compareTo);
        return lista;
    }

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1, 5, 4, 8, 3, 6, 4, 8, 10);
        System.out.println(MergeSort.sort(list));
    }
}
