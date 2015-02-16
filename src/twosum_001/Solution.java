package twosum_001;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	/**
	 * Given an array of integers, find two numbers such that they add up to a specific target number.
	 * The function twoSum should return indices of the two numbers such that they add up to the target,
	 * where index1 must be less than index2. 
	 * Please note that your returned answers (both index1 and index2) are not zero-based.
	 * You may assume that each input would have exactly one solution.
	 * Input: numbers={2, 7, 11, 15}, target=9
	 * Output: index1=1, index2=2
	 * @param numbers
	 * @param target
	 * @return
	 */
    public static int[] twoSum(int[] numbers, int target) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < numbers.length; i++) {
    		int another = target - numbers[i];
    		if (map.get(another) == null ) {
    			if (!map.containsKey(numbers[i])) {
    				map.put(numbers[i], i);	
    			}
    		} 
    		else {
    			return new int[] {map.get(another) + 1, i + 1};
    		}
    	}
    	return null;
    }
    
	public static void main(String[] args) {
		
	}

}