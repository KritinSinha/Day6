/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printprime1;




/**
 *
 * @author KIIT
 */

public class Printprime1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    //TO PRINT ALL THE NUMBERS
     int n[]={10,20,30,40,50,15,25,19,28};
     int i;
     for(i=0;i<=n.length-1;i++)
     {
         System.out.println(n[i]);
     }
     
     //FOR ALL NOS> DIVISIBLE BY 3
     for(i=0;i<=n.length-1;i++)
     {
         if(n[i]%3==0)
         {
             System.out.println("The number divisible by 3 is \t");
             System.out.println(n[i]);
         }
        
     }
         
         
         //TO FIND THE MAXIMUM NUMBER
         
            int max = n[0]; //  assume first elements as largest number,for the same reason as above.
            for(i=1;i<n.length;i++)  
		{
			if (n[i]>max) 
			{
				max=n[i];
			}
	          		
          
                }
            
              System.out.println("The maximum number in the array is");
            System.out.println(max);
            
         
         
           
            
        
                   
        }
         }
     
    

    
    

