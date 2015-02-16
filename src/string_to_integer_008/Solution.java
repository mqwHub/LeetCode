package string_to_integer_008;

public class Solution {

	public static void main(String[] args) {
		System.out.println(atoi(""));
	}

    public static int atoi(String str) {
        int result = 0;
        int length = str.length();
        boolean isNegative = false;
        for (int i = 0; i < length; i++) {
        	char c = str.charAt(i);
        	if (c == '-') {
        		isNegative = true;
        	}
        	else if (c - '0' >= 0 && c - '0' <= 9) {
        		result = result * 10 + c - '0';
        	}
        }
        return isNegative == false ? result : -1 * result;
    }
}
