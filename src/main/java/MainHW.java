
public class Main{
	
	public static int factorial(int n) {
		if (n < 0) {
			System.out.println("error");
		}
		if (n == 0) {
		return 1;
		}
		return n*factorial(n-1);

	}
	
	public static int addFactorial(int n) {
		if (n < 0) {
			System.out.println("error");
		}
		if (n == 0) {
		return 1;
		}
		return n+factorial(n-1);

		}
	
	public static int positiveDigitCount(int n) {
		int digit = n%10;
		if (digit<0) {
			System.out.println("error");
			return -1;
		}
		
		if (n==0) {
			return 0;
			
		}
		else {
			return 1+positiveDigitCount(n/10);
		}
		
	}
	

	 public static int divide(int dividend, int divisor) {
	        // טיפול במקרים בהם יש תוצאה שלילית
	        if (dividend < 0 && divisor > 0) {
	            return -divide(-dividend, divisor);
	        } else if (dividend > 0 && divisor < 0) {
	            return -divide(dividend, -divisor);
	        } else if (dividend < 0 && divisor < 0) {
	            return divide(-dividend, -divisor);
	        }
	        
	        // מקרה בסיס - אם המחולק קטן מהמכנה, המנה היא 0
	        if (dividend < divisor) {
	            return 0;
	        }
	        
	        // במקרה הכללי - קריאה רקורסיבית
	        return 1 + divide(dividend - divisor, divisor);
	    }
	 
	 
	 
	 public static int remainder(int dividend, int divisor) {
	        // מקרה בסיס: אם המחולק קטן מהמחלק, זהו ערך השארית
	        if (dividend < divisor) {
	            return dividend;
	        }

	        // חיסור המחלק מהמחולק וקריאה רקורסיבית לפעולה
	        return remainder(dividend - divisor, divisor);
	    }
	 
	 
	 public static boolean checkMul(int x, int y) {
		 // תנאי עצירה, אם המספר מגיע ל0 סימן שהוא מכפלה שלו
		 if(x == 0) {
			 return true;
		 }
		 // אם המחולק קטן מהמחלק סימן שאינו כפולה שלו
		 if(x<y) {
			 return false;
		 }
		 // חילוק המחלק מהמספר
		 return checkMul(x-y , y);
	 }
	 
	
	 public static boolean rishonyNumber(int num) {
		 
		 if (num < 2) {
			 return false;
		 }
		 
		 for (int i = 2; i <= Math.sqrt(num); i++) {
			 if(num % i == 0) {
				 return false;
			 }
		 }
		 
		 return true;
	 }
	 
	 public static boolean allDigitsEvenOrNot(int num) {
		 
		 // תנאי עצירה
		 if(num<10) {
			 return true;
		 }
		 
		 int lastDigit = num % 10;
	     int secondLastDigit = (num / 10) % 10;
	     
	     if((lastDigit % 2) != (secondLastDigit % 2)) {
	    	 return false;
	     }
	     
	     return allDigitsEvenOrNot(num / 10);
	 }
	 
	 
	 

	 public static int oddsNum(int n) {
		 if(n < 0) {
			 return -1;
		 }
		 if(n == 1) {
			 return 1;
		 }
		 if(n % 2 == 0) {
			 return oddsNum(n-1);
		 }
		 	
		 else {
			 return n*oddsNum(n-2);
		 }
	 }

	
	public static void main(String []args) {
		System.out.println(factorial(4));
		System.out.println(addFactorial(4));
		System.out.println(positiveDigitCount(123450));
		System.out.println(oddsNum(7));
		System.out.println(divide(10,3));
		System.out.println(remainder(10,3));
		System.out.println(checkMul(4,2));
		System.out.println(rishonyNumber(4));
		System.out.println(allDigitsEvenOrNot(246));

	}



}
