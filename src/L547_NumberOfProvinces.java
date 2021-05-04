public class L547_NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] visited = new int[n];
        int num = 0;
        for(int i = 0; i < n; i ++) {
            if(visited[i] == 0) {
                dfs(isConnected, visited, i);
                num ++;
            }
        }
        return num;
    }

    private void dfs(int[][] isConnected, int[] visited, int cur) {
        for(int i = 0; i < isConnected.length; i ++) {
            if(isConnected[cur][i] == 1 && visited[i] == 0) {
                visited[i] = 1;
                dfs(isConnected, visited, i);
            }
        }
    }
}
