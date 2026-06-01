import java.util.ArrayList;
class MyMathClass<T extends Number> {
    public double standardDeviation(ArrayList<T> list) {
        double sum = 0.0;
        for (T value : list) {
            sum += value.doubleValue();
        }
        double mean = sum / list.size();
        double variance = 0.0;
        for (T value : list) {
            variance += Math.pow(value.doubleValue() - mean, 2);
        }
        variance /= list.size();
        return Math.sqrt(variance);
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        MyMathClass<Integer> math = new MyMathClass<>();
        double sd = math.standardDeviation(numbers);
        System.out.println("Standard Deviation: " + sd);
    }
}
