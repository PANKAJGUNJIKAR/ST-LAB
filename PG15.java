package Test;
public class FibonacciSeries {
	public static void main(String[] args)
{
		int limit = 50;
		int num1 = 0, num2 = 1;
		System.out.print(num1 + " " + num2 + " ");
	for(int i = 2; i <= limit; i++)
{
			int sum = num1 + num2;
			System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
}
} 	public static int[] generateFibonacciSeries(int n)
{
	int[] series = new int[n];
	series[0] = 0;
	if (n > 1)
{
		series[1] = 1;
	for (int i = 2; i < n; i++)
{

		series[i] = series[i - 1] + series[i - 2];

}
}
	return series;
}

}






package Test;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciSeriesTest {

    @Test
    public void testFibonacciSeriesWithLimit5() {
        int[] expectedOutput = {0, 1, 1, 2, 3};
        int limit = 5;
        int[] actualOutput = FibonacciSeries.generateFibonacciSeries(limit);
        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFibonacciSeriesWithLimit10() {
        int[] expectedOutput = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int limit = 10;
        int[] actualOutput = FibonacciSeries.generateFibonacciSeries(limit);
        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFibonacciSeriesWithLimit1() {
        int[] expectedOutput = {0};
        int limit = 1;
        int[] actualOutput = FibonacciSeries.generateFibonacciSeries(limit);
        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFibonacciSeriesWithNegativeLimit() {
        int limit = -5;
        FibonacciSeries.generateFibonacciSeries(limit); // This should throw an exception
    }
}
