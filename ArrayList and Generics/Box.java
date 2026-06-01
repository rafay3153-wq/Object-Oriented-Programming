import java.util.ArrayList;
class RandomBox<T> {
    private ArrayList<T> items;
    public RandomBox() {
        items = new ArrayList<>();
    }
    public void add(T item) {
        items.add(item);
    }
    public boolean isEmpty() {
        return items.isEmpty();
    }
    public T drawItem() {
        if (isEmpty()) {
            return null;
        }
        int index = (int) (Math.random() * items.size());
        return items.remove(index);
    }
}
public class Box {
    public static void main(String[] args) {
        RandomBox<String> box = new RandomBox<>();
        box.add("Apple");
        box.add("Banana");
        box.add("Cherry");
        System.out.println("Drawing items from the box:"  +box.drawItem());
        RandomBox<Integer> intBox = new RandomBox<>();
        intBox.add(1);
        intBox.add(2);
        intBox.add(3);
        System.out.println("Lottery number:" +intBox.drawItem());
        RandomBox<Double> doubleBox = new RandomBox<>();
        System.out.println("Drawing from empty box: " + doubleBox.drawItem());
        }
    }


