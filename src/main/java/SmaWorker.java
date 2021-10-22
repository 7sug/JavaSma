import java.util.ArrayList;
import java.util.List;

public class SmaWorker {
    public static List<Integer> smaFunc(List<Integer> data){
        List<Integer> sma = new ArrayList<Integer>();
        //int[] data = {2, 5, 7, 8, 3, 0, 10, 11, 15};
        //List<Integer> data = DataGenerator.randomizer();
        int arrayLen = data.size();
        int sum = 0;
        int count = 0;
        int count2 = 3;
        for (int i = 3; i < arrayLen; i++)
        {
            for (int j = count; j < count2; j++)
                sum += data.get(j);
            count += 1;
            count2 += 1;
            int mid = sum / 3;
            sum = 0;
            sma.add(mid);
        }
        return sma;
    }
}
