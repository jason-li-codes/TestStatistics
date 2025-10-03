package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {

    public static void main(String[] args) {

        double[] testScores = {88, 92, 75, 100, 64, 81, 56, 90, 78, 85};

        double[] testScoresOrdered = new double[testScores.length];
        System.arraycopy(testScores, 0, testScoresOrdered, 0, testScores.length);
        Arrays.sort(testScoresOrdered);

        double average = findAverage(testScores);
        double highScore = findHighScore(testScoresOrdered);
        double lowScore = findLowScore(testScoresOrdered);
        double median = findMedian(testScoresOrdered);

        System.out.printf("""
                Given the test scores %s:
                Ordered lowest to highest: %s
                Average: %.2f
                High Score: %.2f
                Low Score: %.2f
                Median: %.2f
                """, Arrays.toString(testScores),
                Arrays.toString(testScoresOrdered),
                average, highScore, lowScore, median);

    }

    public static double findAverage(double[] scores) {

        double sum = 0;
        for (double score: scores) {
            sum += score;
        }

        return sum / scores.length;

    }

    public static double findHighScore(double[] scores) {

        return scores[scores.length - 1];

    }

    public static double findLowScore(double[] scores) {

        return scores[0];

    }

    public static double findMedian(double[] scores) {

        if (scores.length % 2 == 0) {
            return (scores[scores.length / 2] + scores[(scores.length / 2) - 1]) / 2;
        }
        else {
            return (scores[scores.length / 2]);
        }

    }

}
