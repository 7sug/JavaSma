import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator{
    public static List<Integer> randomizer() {
        ArrayList<Integer> NumbersList = new ArrayList<Integer>();
        Random rn = new Random();
        for (int i = 0; i < 9; ++i)
            NumbersList.add(rn.nextInt(10) + 1);
        return NumbersList;
    }
}
