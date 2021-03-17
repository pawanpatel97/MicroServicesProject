package com.creditcard.validation;

public class CreditcardValidation {

	public static void main(String[] args) {
	    long creditNum=5678353454698740L;
	    checkCreditcardValidation(creditNum);
	   
	}
	
	public static String checkCreditcardValidation(Long number)
	{
		 long num=sumOfDoubleEvenPlace(number)+sumOfOddPlace(number);
			
			if (num%10==0)
			{
				System.out.println("It is valid card");
	            return "It is valid card";
			}
	        else
	        	System.out.println("It is not a valid card");
	            return "It is not a valid card";
	}
	
	public static int sumOfDoubleEvenPlace(long number)
    {
        int sum = 0;
        String num = number + "";
        for (int i = num.length() - 2; i >= 0; i -= 2) 
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
         
        return sum;
    }
 
    // Return this number if it is a single digit, otherwise,
    // return the sum of the two digits
    public static int getDigit(int number)
    {  
        if (number < 9)
            return number;
        return number / 10 + number % 10;
    }
 
    // Return sum of odd-place digits in number
    public static int sumOfOddPlace(long number)
    {
        int sum = 0;
        String num = number + "";
        for (int i = num.length() - 1; i >= 0; i -= 2) 
            sum += Integer.parseInt(num.charAt(i) + "");        
        return sum;
    }
	
	
}
