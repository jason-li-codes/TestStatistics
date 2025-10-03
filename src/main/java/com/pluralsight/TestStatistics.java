package com.pluralsight;

public class TestStatistics {

    public static void main(String[] args) {

        double[] testScores = {88, 92, 75, 100, 64, 81, 56, 90, 78, 85};

        double average = findAverage(testScores);
        double findHighScore(testScores);
        double findLowScore(testScores);

    }

    public static double findAverage(double[] scores) {

        int i;
        double sum = 0;
        for (double score: scores) {
            sum += scores;
        }

        return sum / scores.length;

    }

}
