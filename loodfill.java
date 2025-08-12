import java.util.LinkedList;
import java.util.Queue;

public class loodfill{
    public static void main(String[] args) {
        char[][] image = {
            {'B', 'B', 'W'},
            {'W', 'W', 'W'},
            {'W', 'W', 'W'},
            {'B', 'B', 'B'}
        };

        int sr = 2, sc = 2;
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

        int rows = image.length;
        int cols = image[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc});

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0], c = cell[1];

            if (r < 0 || r >= rows || c < 0 || c >= cols) continue;
            if (image[r][c] != originalColor) continue;

            image[r][c] = newColor;

            queue.add(new int[]{r - 1, c}); // up
            queue.add(new int[]{r + 1, c}); // down
            queue.add(new int[]{r, c - 1}); // left
            queue.add(new int[]{r, c + 1}); // right
        }
    }
}
