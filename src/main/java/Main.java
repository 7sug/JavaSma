import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<Integer> data = DataGenerator.randomizer();
        List<Integer> answer = SmaWorker.smaFunc(data);
        System.out.println(answer);
    }
}