package com.dkr.firstDkr.service;

import java.util.Arrays;
import java.util.HashMap;

public class Problems {

	public static int romanToInt(String s) {

		int finalNumber = 0;

		HashMap<String, Integer> mHashMap = new HashMap<>();
		mHashMap.put("I", 1);
		mHashMap.put("V", 5);
		mHashMap.put("X", 10);
		mHashMap.put("L", 50);
		mHashMap.put("C", 100);
		mHashMap.put("D", 500);
		mHashMap.put("M", 1000);

		for (int i = 0; i <= s.length() - 1; i++) {

			if ((i != (s.length() - 1)) && String.valueOf(s.charAt(i)).equalsIgnoreCase("I")) {
				if (String.valueOf(s.charAt(i + 1)).equalsIgnoreCase("X")) {
					finalNumber += 9;
					i = i + 1;
				} else if (String.valueOf(s.charAt(i + 1)).equalsIgnoreCase("V")) {
					finalNumber += 4;
					i = i + 1;
				}else {
					finalNumber += mHashMap.get(String.valueOf(s.charAt(i)));
				}

			} else if ((i != (s.length() - 1)) && String.valueOf(s.charAt(i)).equalsIgnoreCase("X")) {

				if (String.valueOf(s.charAt(i + 1)).equalsIgnoreCase("C")) {
					finalNumber += 90;
					i = i + 1;
				} else if (String.valueOf(s.charAt(i + 1)).equalsIgnoreCase("L")) {
					finalNumber += 40;
					i = i + 1;
				}else {
					finalNumber += mHashMap.get(String.valueOf(s.charAt(i)));
				}

			} else if ((i != (s.length() - 1)) && String.valueOf(s.charAt(i)).equalsIgnoreCase("C")) {
				if (String.valueOf(s.charAt(i + 1)).equalsIgnoreCase("M")) {
					finalNumber += 900;
					i = i + 1;
				} else if (String.valueOf(s.charAt(i + 1)).equalsIgnoreCase("D")) {
					finalNumber += 400;
					i = i + 1;
				}else {
					finalNumber += mHashMap.get(String.valueOf(s.charAt(i)));
				}

			} else {
				finalNumber += mHashMap.get(String.valueOf(s.charAt(i)));
			}

		}
		return finalNumber;

	}

	public static int[] twoSum(int[] nums, int target) {

		int[] newArr = new int[2];
		for (int i = 0; i <= nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					newArr[0] = i;
					newArr[1] = j;
					return newArr;
				}
			}
		}
		return nums;
	}

	public static void main(String[] args) {

		int[] nums = new int[] { 2, 7, 11, 15 };
		System.out.println("Solution => " + Arrays.toString(twoSum(nums, 9)));
		System.out.println("Solution 1 => " + romanToInt("III"));
		System.out.println("Solution 1 => " + romanToInt("LVIII"));
		System.out.println("Solution 2 => " + romanToInt("MCMXCIV"));


	}

}
