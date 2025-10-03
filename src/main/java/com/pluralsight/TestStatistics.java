package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {

    public static void main(String[] args) {

        // array of 10 test scores
        double[] testScores = {88, 92, 75, 100, 64, 81, 56, 90, 78, 85};

        // uses arraycopy to make a new array and sort it with Arrays.sort
        double[] testScoresOrdered = new double[testScores.length];
        System.arraycopy(testScores, 0, testScoresOrdered, 0, testScores.length);
        Arrays.sort(testScoresOrdered);

        // calls methods to find average, highScore, lowScore, and median, using ordered arrays if needed
        double average = findAverage(testScores);
        double highScore = findHighScore(testScoresOrdered);
        double lowScore = findLowScore(testScoresOrdered);
        double median = findMedian(testScoresOrdered);

        // prints results in format
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

        // uses a for loop to add scores to a total and then divide it by the length of the array
        double sum = 0;
        for (double score: scores) {
            sum += score;
        }

        return sum / scores.length;

    }

    public static double findHighScore(double[] scores) {

        // returns the last element in the ordered array
        return scores[scores.length - 1];

    }

    public static double findLowScore(double[] scores) {

        // returns the first item in the ordered array
        return scores[0];

    }

    public static double findMedian(double[] scores) {

        // uses if statement to determine if array has even or odd number of elements
        if (scores.length % 2 == 0) {   // if even, take the average of the middle two elements
            return (scores[scores.length / 2] + scores[(scores.length / 2) - 1]) / 2;
        }
        else {  // otherwise, the array has odd number of elements and the median is at the halfway point
                // Java takes only the integer portion of the index, which would give the middle element
            return (scores[scores.length / 2]);
        }

    }

}
