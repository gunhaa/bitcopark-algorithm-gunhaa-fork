package mynote.sort;

import java.util.ArrayList;
import java.util.List;

public class Sort<T> {

    private List<T> data = new ArrayList<>();

    public Sort(List<T> data) {
        this.data = data;
    }

    public T swap1(T a, T b){
        return a;
    }

    public void selectionSortSwap(T a, T b){
        int aIndex = data.indexOf(a);
        int bIndex = data.indexOf(b);
        T temp = a;
        data.set(aIndex, b);
        data.set(bIndex, temp);
    }

    public List<T> selectionSort(LambdaSort lambda){
        lambda.sort(data);
        return data;
    }

}
