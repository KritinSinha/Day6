
package sumofdiagonalelements;


public class SumOfdiagonalelements {

    
    public static void main(String[] args) 
    {
        
     float arr[][]={
                     {1.5f,3.0f,0.9f},
                     {9.6f,6.1f,7.3f},
                     {0.0f,6.1f,9.7f}
                   };
     int i,j;
     for(i=0;i<=arr.length-1;i++)
     {
         for(j=0;j<=arr[0].length-1;j++)
         {
            System.out.print(arr[i][j]);  //here it comes as   (^this is 0 index)1.5(^this is first index)3.0(^this is the second index) 0.9-> our cursor reamins here
         }
         System.out.println();// after writing this, pur cursor will shift to the next line and again the loop will run.
         
         
         
             
         
     }
     
System.out.println("Now the sum of the diagonal elements is");
         System.out.print(arr[0][0]+arr[1][1]+arr[2][2]);     
     } 
     
    
    
}
