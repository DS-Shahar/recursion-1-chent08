
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
	  
	 
	 public static boolean isPrime(int number) {
	        return isPrime(number, 2); // התחלת הבדיקה עם מחלק 2
	    }
	 
	 public static boolean isPrime(int number, int divisor) {
	        // מספרים קטנים מ-2 אינם ראשוניים
	        if (number < 2) {
	            return false;
	        }
	        // אם הגענו לשורש הריבועי של המספר, המספר ראשוני
	        if (divisor > Math.sqrt(number)) {
	            return true;
	        }
	        // אם המספר מתחלק ב-divisor, הוא לא ראשוני
	        if (number % divisor == 0) {
	            return false;
	        }
	        // המשך הבדיקה עם divisor אחד יותר
	        return isPrime(number, divisor + 1);
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
		 
		 
	public static int recursiveSumArray(int[]array, int index) {
		
		if (index == 0) {
			return array[0];
		}
		
		return recursiveSumArray(array, index-1)+ array[index];	
	}
	
	public static int recursivePositiveNums(int[]array, int index) {
		
		if(index == 0) {
			if(array[index] > 0) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
		if(array[index]>0) {
			return recursivePositiveNums(array,index-1) + 1;
		}
		else {
			return recursivePositiveNums(array,index-1);
		}
		
	}
	
	
	public static int indexInArr(int[] array , int num , int index) {
		
		if(index == array.length) {
			return -1;
		}
		
		if(array[index]== num) {
			return index;
		}
		
		return indexInArr(array, num , index+1);
	}
	
	
	
	public static boolean risingArr(int[] array, int index) {
		
		
		if (index == array.length - 1 || array.length == 0) {
            return true;
        }
		
		if(array[index] > array[index+1]) {
			return false;
		}
		
		return risingArr(array, index + 1);
	}
	
	public static boolean noPrimeNums ( int[] array , int index) {
		
		if(index == array.length) {
			return true;
		}
		
		if(isPrime(array[index])) {
			return false;
		}
		
		
		
		return noPrimeNums(array,index+1);
		
	}
		 
		 
		 
		 
	// main loop
	
	public static void main(String []args) {
		System.out.println(factorial(4));
		System.out.println(addFactorial(4));
		System.out.println(positiveDigitCount(123450));
		System.out.println(oddsNum(7));
		System.out.println(divide(10,3));
		System.out.println(remainder(10,3));
		System.out.println(checkMul(4,2));
		System.out.println(isPrime(4));
		System.out.println(allDigitsEvenOrNot(246));
		
		//ex14
		int[] array = {1, 2, 3, 4, 5};
		int[] array2 = {4,6,8,10,29};
        	int i = 3;
        	int num = 4;
        
        	System.out.println(recursiveSumArray(array,I));
        
        	//ex15
		System.out.println(recursivePositiveNums(array,i));
		
		//ex16
		// index always starts with 0 :
		System.out.println(indexInArr(array,num,0));
		
		//ex17
		//index always starts with 0 :
		System.out.println(risingArr(array,0));

		//ex18
		//index always starts with 0 :
		System.out.println(noPrimeNums(array2,0));

		
	}



}
