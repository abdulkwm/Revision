import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
//       List<Integer> integerVector = new Vector<>();
        List<Integer> integerVector = new ArrayList<>();
        for (int i = 1; i < 10; i++){
            integerVector.add(i);
        }
        Iterator<Integer> iterator = integerVector.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        Iterator<Integer> listIterator = integerVector.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
        ListIterator<Integer> previousIterator = integerVector.listIterator();
        while (previousIterator.hasPrevious()){
            System.out.print(previousIterator.previous() + " ");
        }
    }
}