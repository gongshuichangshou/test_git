package cn;

import java.util.Arrays;

public class sortArray {
	public static void main(String[] args) {
		int[] arr = { 1, 56, 45, 21, 65, 78, 6 };
		// compare1(arr);
		// compare2(arr);
		int index;
		int value = 21;
		int binary = binary(arr, 21);
		System.out.println(binary);
		System.out.println(binary2(arr, value));

		int a = 1;
		int b = 2;
		int c = (a > b) ? a : b;

	}

	private static int binary(int[] arr, int value) {
		int min, max, mid;
		min = 0;
		max = arr.length - 1;
		mid = (min + max) / 2;
		while (arr[mid] != value) {
			if (arr[mid] > value)
				max = mid - 1;
			else if (arr[mid] < value)
				min = mid + 1;
			if (min > max) {
				return -1;
			}
			mid = (min + max) / 2;
		}

		return mid;

	}

	private static int binary2(int[] arr, int value) {
		int min, max, mid;
		min = 0;
		max = arr.length - 1;
		mid = (min + max) / 2;
		while (true) {
			if (arr[mid] == value)
				return mid;
			max = arr[mid] > value ? (mid - 1) : max;
			min = arr[mid] < value ? (mid + 1) : min;
			if (min > max)
				return -1;
			mid = (min + max) / 2;
		}

	}

	private static void compare1(int[] arr) {
		int temp = 0;
		for (int x = 0; x < arr.length - 1; x++) {

			for (int y = x + 1; y < arr.length; y++) {
				if (arr[x] < arr[y]) {
					temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(arr));
	}

	// 比较法,相邻两个元素的比较
	private static void compare2(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {// 外循环决定了哪个角标的元素进行比较
			for (int j = 0; j < arr.length - 1 - i; j++) {// 内循环决定了那个元素需要比较的次数
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
