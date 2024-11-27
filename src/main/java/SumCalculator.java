import java.util.List;

public class SumCalculator {

    public int calculateSum(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}

