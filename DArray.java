/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.d.array;

/**
 *
 * @author KIIT
 */
public class DArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      int arr[][]={{1,2,4},{5,7,9}};
     int i,j;
     for(i=0;i<=arr.length-1;i++)
     {
         for(j=0;j<=arr[0].length-1;j++)
         {
             System.out.print(arr[i][j]);
         }
         System.out.println();
     }
    }
    
}
