public class Floodfill {
    public static void main(String[] args) {
        char[][] image = {
            {'B', 'B', 'W'},
            {'W', 'W', 'W'},
            {'W', 'W', 'W'},
            {'B', 'B', 'B'}
        };

        int sr = 2;
        int sc = 2;
        char newColor = 'G';

        floodFill(image, sr, sc, newColor);

        for (char[] row : image) {
            for (char pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }

    public static void floodFill(char[][] image, int sr, int sc, char newColor) {
        char originalColor = image[sr][sc];
        if (originalColor == newColor) return;
        fill(image, sr, sc, originalColor, newColor);
    }

    private static void fill(char[][] image, int r, int c, char originalColor, char newColor) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length) return;
        if (image[r][c] != originalColor) return;
        image[r][c] = newColor;
        fill(image, r - 1, c, originalColor, newColor);
        fill(image, r + 1, c, originalColor, newColor);
        fill(image, r, c - 1, originalColor, newColor);
        fill(image, r, c + 1, originalColor, newColor);
    }
}
