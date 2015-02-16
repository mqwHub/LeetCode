package reverse_integer_007;

public class Solution {

	public static void main(String[] args) {
		int i = -3;
		int j = 0x7fffffff;
		System.out.println(i&j);
	}

    public static int reverse(int x) {
    	int result = 0;
        while (x != 0) {
        	if ( Math.abs(result) > Integer.MAX_VALUE / 10)
        		return 0;
        	result = result * 10 + x % 10;
        	x = x / 10;
        }
        return result;
    }

}
