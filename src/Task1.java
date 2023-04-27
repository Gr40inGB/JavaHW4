import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        //Пусть дан LinkedList с несколькими элементами.
        //Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
        LinkedList<Integer> list = getList(10, 1, 9);
        System.out.println(list);
        System.out.println(getReverseList(list));
    }

    public static LinkedList<Integer> getList(int size, int min, int max) {
        LinkedList<Integer> list = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            list.add(r.nextInt(min, max + 1));
        }
        return list;
    }

    public static List<Integer> getReverseList(LinkedList<Integer> list) {
        LinkedList<Integer> resultList = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            resultList.add(iterator.previous());
        }
        return resultList;
    }
}