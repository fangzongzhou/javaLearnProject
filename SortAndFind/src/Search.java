import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Search {

    public static<T> int lineSearch(List<T> objList, T toFind) {
        for (int i = 0; i < objList.size(); i++) {
            if (objList.get(i).equals(toFind)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T extends Comparable> int binarySearch(List<T> objList, T toFind) {
        if (objList.size() == 1 && !objList.get(0).equals(toFind)) {
            return -1;
        }
        int listSize=objList.size();
        int midNum=listSize/2;
        int resIndex=0;
        if (objList.get(midNum).equals(toFind)) {
            return midNum;
        }else if(objList.get(midNum).compareTo(toFind)>0){
            resIndex = binarySearch(objList.subList(0, midNum), toFind);

        }else {
            resIndex = binarySearch(objList.subList(midNum, listSize), toFind);

        }
        return resIndex>-1?objList.indexOf(objList.get(resIndex)):-1;
    }


    public static void main(String[] args) {
        ArrayList<Integer> integerLists=Lists.newArrayList(1, 3, 5, 7, 9, 10, 24);
        System.out.println(Search.binarySearch(integerLists,15));
        System.out.println(Search.binarySearch(integerLists,7));

    }
}
