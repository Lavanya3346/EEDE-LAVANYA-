public class Problem3{
	    public static void main(String[] args) {
	        int a = 6;
	        int count = (a % 2 == 0) ? a - 1 : a;
	        for (int i = 1; i <= count; i++) {
	            System.out.print((2 * i - 1));
	            if (i < count) {
	                System.out.print(", ");
	            }
	        }
	    }
	}
