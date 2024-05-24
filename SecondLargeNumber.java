package demo3;
import java.util.Scanner;
public class SecondLargeNumber
{
public static void main(String[] args) 
{
	int[] numbers = {13, 67, 18, 9, 58};
	try
	{
		int secondLargest = findSecondLargest(numbers);
		System.out.println("The second largest number is: " + secondLargest);
	}
	catch (IllegalArgumentException e)
	{
		System.out.println(e.getMessage());
	}
	}
public static int findSecondLargest(int[] array)
{
	int largest = Integer.MIN_VALUE;
	int secondLargest = Integer.MIN_VALUE;
	for (int num : array)
	{
		if (num > largest)
		{
			secondLargest = largest;
			largest = num;
		}
		else if (num > secondLargest && num != largest)
		{
			secondLargest = num;
		}
	}
	if (secondLargest == Integer.MIN_VALUE)
	{
		throw new IllegalArgumentException("No second largest element found.");
	}
	return secondLargest;
}
}
