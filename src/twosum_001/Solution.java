package twosum_001;

public class Solution {

    public static int[] twoSum(int[] numbers, int target) {
    	int index1 = 0;
    	int index2 = 0;
    	int length = numbers.length;
    	boolean stop = false;
    	for (int i = 0; i < length && !stop; i++) {
    		for (int j = i + 1; j < length; j++) {
    			if (numbers[i] + numbers[j] == target) {
    				index1 = i;
    				index2 = j;
    				stop = true;
    				break;
    			}
    		}
    	}
    	return new int[] {index1 + 1, index2 + 1};
    }
    
	public static void main(String[] args) {
		
	}

}