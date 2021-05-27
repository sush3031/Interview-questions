/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order

Example : nums[2,7,11,15] target = 9
output  : [0,1]

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

class TwoSumSolution {
	public static int[] twoSum(int nums[], int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int val = target - nums[i];
			if (map.containsKey(val) && map.get(val) != i) {
				return new int[] { i, map.get(val) };
			}
		}
		return new int[] {};
	}
}

public class TwoSum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of n : ");
		int n = Integer.parseInt(br.readLine());
		int nums[] = new int[n];
		System.out.println("Enter the values of nums : ");
		String line = br.readLine();
		String strs[] = line.trim().split("\\s+");
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}
		System.out.println("Enter the target value : ");
		int target = Integer.parseInt(br.readLine());
		int sol[] = TwoSumSolution.twoSum(nums, target);
		String ansSol = Arrays.toString(sol);
		System.out.println("The output is : " + ansSol);
	}

}
