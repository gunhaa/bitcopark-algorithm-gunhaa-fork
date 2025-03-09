package mynote.sort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>();

        data.add(5);
        data.add(4);
        data.add(3);
        data.add(2);
        data.add(1);

        Sort<Integer> sortData = new Sort<>(data);
        sortData.selectionSort((list)->{

            for (int i = 0; i < list.size()-1; i++) {

                int minIndex = i;

                for (int j = i+1; j < list.size(); j++){

                    if((int) list.get(i) > (int) list.get(j)) {
                        minIndex = j;
                    }

                }

                if(minIndex == i ){
                    continue;
                } else {
                    sortData.selectionSortSwap(data.get(i), data.get(minIndex));
                }

            }

        });

        System.out.println("sort fin : " + data);

    }

}
