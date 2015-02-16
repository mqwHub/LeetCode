package string_to_integer_008;

public class Solution {

	public static void main(String[] args) {
		System.out.println(atoi(""));
	}

    public static int atoi(String str) { 
    	int result = 0;
        int length = str.length();
        boolean isBegin = false;
        boolean isNegative = false;
        for (int i = 0; i < length; i++) {
        	char c = str.charAt(i);
        	if (!isBegin) {
        		if (c == ' ')
            		continue;
        		if (c == '-' || c=='+' || (c-'0'>=0 && c-'0'<=9)) {
        			isBegin = true;
            		if (c == '-')
            			isNegative = true;
            		if (c-'0'>=0 && c-'0'<=9) 
            			result = result * 10 + c - '0';
        		}
        		else 
        			return 0;
        	}
        	else {
        		if (c-'0'>=0 && c-'0'<=9) {
        			if (isNegative) {
        				if (result < (Integer.MIN_VALUE - '0' + c) / 10)
        					return Integer.MIN_VALUE;
        				result = result * 10 - c + '0';
        			}
        			else {
        				if (result > (Integer.MAX_VALUE + '0' - c) / 10)
            				return Integer.MAX_VALUE;
            			result = result * 10 + c - '0';
        			}
        		}
        		else
        			break;
        	}
        }
        return result;
    }
}
