import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class L1431_KidsWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> out = new ArrayList();
        List<Integer> candyList = new ArrayList(candies.length);
        for(int i : candies) {
            candyList.add(i);
        }
        int max = Collections.max(candyList);
        for (int j = 0; j < candies.length; j ++) {
                out.add(candies[j] + extraCandies >= max);
        }
        return out;
    }
}
