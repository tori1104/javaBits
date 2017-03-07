class PrimeNumber {
    public static void main (String[] arguments){
         
       int i =0;
       int num =0;
       //Empty String
       String  PrimeNumber = " ";

       for (i = 1; i <= 1224 ; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     PrimeNumber = PrimeNumber + i + ", ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 1224 are :");
       System.out.println(PrimeNumber);
   }
}
    