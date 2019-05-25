package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    private double sum1 = 0;

    public double sumArray(double[] array)
    {
        array1=array;
        for (double element : array1) {
            sum1 += element;
        }
    }

    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        sum1 = 0;
	double average1;

        sumArray(array1);
        average1 = sum1 / array1.length;

        double sum2 = 0;
        double average2;

        for (double element : array2) {
            sum2 += element;
        }
        average2 = sum2 / array2.length;

        return Math.abs(average1 - average2);
    }

    public double calculateSampleVariance(double[] elements)
    {
        sum1 = 0;
        double average1;

        sumArray(elements);

        average1 = sum1 / elements.length;
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average1, 2);
        }
        return temp / (elements.length - 1);

    }
}