import java.util.*;

public class Main {
    public static void main(String[] args) {
        SetImitation setImitation = new SetImitation();
        System.out.println(setImitation.add(11));
        System.out.println(setImitation.add(11));
        System.out.println(setImitation.add(19));
        System.out.println(setImitation.size());
        System.out.println(setImitation.add(10));
        Iterator<Integer> iterator = setImitation.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(setImitation.getByIndex(1));
        System.out.println(setImitation.contains(13));
        System.out.println(setImitation.isEmpty());
        System.out.println(setImitation.size());
        setImitation.delete(11);
        setImitation.delete(19);
        setImitation.delete(10);
        System.out.println(setImitation.isEmpty());
        HashSet<Integer> integers = new HashSet<>();
        integers.add(9);
        System.out.println(integers);
        System.out.println(setImitation.delete(11));

    }
}

class SetImitation<E> {
    private HashMap<E, Object> set = new HashMap<>();
    private final Object OBJ = new Object();

    public Boolean add(E number) {
        return set.put(number, OBJ) == null;
    }

    public Boolean delete(E number) {
        return set.remove(number, OBJ);
    }

    public int size() {
        return set.size();
    }

    public Boolean isEmpty() {
        return set.isEmpty();
    }

    public Boolean contains(E object) {
        return set.containsKey(object);
    }

    public Iterator<E> iterator() {
        return set.keySet().iterator();
    }
    public E getByIndex(int num){
        return (E) set.keySet().toArray()[num];
    }
}
