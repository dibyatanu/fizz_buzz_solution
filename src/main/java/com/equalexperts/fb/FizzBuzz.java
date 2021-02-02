package com.equalexperts.fb;

public class FizzBuzz 
{
     private FizzBuzz() {}
     
	public static String returnFizzBuzz(final int num) 
    {
	   String results="";
		int  lucky=0;
    	int  fizzbuzz=0;
    	int  fizz=0;
    	int  buzz=0;
    	int integer=0;
    	for (int i = 1; i <= num; i++) 
        {
    		if (String.valueOf(i).contains("3"))
    		{
    			 results=results+"lucky"+" ";
    			 lucky++;
    		}
    		else if (i % 15 == 0) 
        	    {
	                results=results+"fizzbuzz"+" ";  
	                fizzbuzz++;
        	    }
	           else if (i % 3 == 0) 
	           {
	        	   results=results+"fizz"+" ";
	        	   fizz++;
	           }
	               
	            else if (i % 5 == 0) 
	            {
	                results=results+"buzz"+" ";
	                buzz++;
	            }
	            else
	            {
	                results=results+i+" ";
	                integer++;
	            }
        }
    	return results.concat("fizz: "+fizz+" buzz: "+buzz+" fizzbuzz: "+fizzbuzz+" lucky: "+lucky+" integer: "+integer).replaceFirst("\\s++$", "");
    
    }
 
   
}


