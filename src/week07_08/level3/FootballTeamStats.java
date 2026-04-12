package week07_08.level3;

import java.util.Random;

public class FootballTeamStats {

    public static int sum(int[] heights) {
        int total = 0;
        for (int h : heights) {
            total += h;
        }
        return total;
    }

    public static double mean(int[] heights) {
        return (double) sum(heights) / heights.length;
    }

    public static int shortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    public static int tallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150–250 cm
        }

        System.out.println("Player Heights:");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\n\nShortest Height: " + shortest(heights));
        System.out.println("Tallest Height: " + tallest(heights));
        System.out.println("Mean Height: " + mean(heights));
    }
}