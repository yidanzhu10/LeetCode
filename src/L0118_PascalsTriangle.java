import java.util.ArrayList;
import java.util.List;

public class L0118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList();
        res.add(new ArrayList<>());
        res.get(0).add(1);
        int row = 1;
        while(row < numRows) {
            List<Integer> curRow = new ArrayList<>();
            List<Integer> preRow = res.get(row - 1);

            curRow.add(1);

            for(int i = 1; i < row; i ++) {
                curRow.add(preRow.get(i - 1) + preRow.get(i));
            }
            curRow.add(1);
            res.add(curRow);
            row ++;
        }
        return res;
    }
}
