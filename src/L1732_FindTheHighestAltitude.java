public class L1732_FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        for(int i = 0; i < gain.length; i ++) {
            altitude[i + 1] = altitude[i] + gain[i];
        }
        int max = 0;
        for(int j = 0; j < altitude.length; j ++) {
            max = Math.max(max, altitude[j]);
        }
        return max;
    }
}
