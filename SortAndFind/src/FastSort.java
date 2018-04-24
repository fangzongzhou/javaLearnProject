import com.google.common.collect.Lists;

import java.util.List;

public class FastSort {

    public static <T extends Comparable> List<T> sort(List<T> list) {
        fastSort(list, 0, list.size() );

        return list;
    }

    private static void fastSort(List list, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int midIndex = getLocationList(list.subList(startIndex, endIndex));
        midIndex+=startIndex;
        fastSort(list, midIndex + 1, endIndex);

        fastSort(list, startIndex, midIndex - 1);


    }


    private static <T extends Comparable> int getLocationList(List<T> list) {


        int lastIndex = list.size() - 1;
        T lastItem = list.get(lastIndex);
        int locationOfReferenceElement = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(lastItem) < 0) {

                swap(list, i, locationOfReferenceElement);
                locationOfReferenceElement += 1;

            }

        }
        swap(list, lastIndex, locationOfReferenceElement);


        return locationOfReferenceElement;
    }





    private static <T> List<T> swap(List<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1, 6, 8, 4, 7, 3, 5, 10, 6);

        System.out.println(FastSort.sort(list.subList(0,list.size() )));
    }


}
