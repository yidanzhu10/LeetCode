public class L0733_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) return image;
        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    private void dfs(int[][] image, int x, int y, int curColor, int newColor){
        if(x < 0 || x >= image.length || y < 0 || y >= image[0].length || image[x][y] == newColor) return;
        if(image[x][y] != curColor) return;

        image[x][y] = newColor;
        dfs(image, x - 1, y, curColor, newColor);
        dfs(image, x + 1, y, curColor, newColor);
        dfs(image, x, y - 1, curColor, newColor);
        dfs(image, x, y + 1, curColor, newColor);

    }
}
