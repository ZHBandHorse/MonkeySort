package one;

import java.util.Arrays;
import java.util.Random;

public class MonkeySort {

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		sort(new int[]{7575,27868762,14450,5646547,2165465});
		long end = System.currentTimeMillis();
		System.out.println("用时："+(end-begin)+"ms");
	}
	
	public static void sort(int[] arr) {
		int[] sorted = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sorted);
		int count = 0;
		while (!Arrays.equals(sorted, arr)) {	
			System.out.println("第"+count+++"次排序");
			for (int i = 0; i < arr.length; i++) {
				Random random = new Random();
				int randomNum = random.nextInt(arr.length);
				int temp = arr[i];
				arr[i] = arr[randomNum];
				arr[randomNum] = temp;
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+",");
			}
			System.out.println();
		}
		
	}
}
