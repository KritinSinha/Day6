/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continuevsbreak;

/**
 *
 * @author KIIT
 */
public class ContinueVSbreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        for(i=0;i<=10;i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println("This shows how break works");
            System.out.println(i);
        }
        
        System.out.println("now we will check for continue");
        
        for(i=0;i<=10;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println("This shows how continue works");
            System.out.println(i);
        }
    }
    
}
