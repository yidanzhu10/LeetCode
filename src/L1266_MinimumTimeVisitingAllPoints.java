public class L1266_MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        int[] x = new int[points.length];
        int [] y = new int[points.length];

        for(int i = 0; i < points.length; i ++) {
            x[i] = points[i][0];
            y[i] = points[i][1];
        }

        for(int i = 1; i < points.length; i ++) {
            int hor = Math.abs(x[i] - x[i - 1]);
            int ver = Math.abs(y[i] - y[i - 1]);
            time += Math.min(hor, ver) + Math.abs(hor - ver);
        }
        return time;
    }
}
