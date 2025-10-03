package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {

    public static void main(String[] args) {

        double[] testScores = {88, 92, 75, 100, 64, 81, 56, 90, 78, 85};

        double average = findAverage(testScores);
        double highScore = findHighScore(testScores);
        double lowScore = findLowScore(testScores);

        System.out.printf("""
                Given the array %d[],
                Average: %d
                High Score: %d
                Low Score: %d
                """, Arrays.toString(testScores), average, highScore, lowScore);

    }

    public static double findAverage(double[] scores) {

        int i;
        double sum = 0;
        for (double score: scores) {
            sum += scores;
        }

        return sum / scores.length;

    }

    public static double findHighScore(double[] scores) {

        double[] scoresOrdered = new double[scores.length];
        System.arraycopy(scores, 0, scoresOrdered, 0, scores.length);
        Arrays.sort(scoresOrdered);

        return scoresOrdered[scoresOrdered.length - 1];

    }

    public static double findLowScore(double[] scores) {

        double[] scoresOrdered = new double[scores.length];
        System.arraycopy(scores, 0, scoresOrdered, 0, scores.length);
        Arrays.sort(scoresOrdered);

        return scoresOrdered[0];

    }

}
