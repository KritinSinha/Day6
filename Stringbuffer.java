

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuffer;

/**
 *
 * @author KIIT
 */
public class Stringbuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     StringBuffer str=new StringBuffer("Computer");
     str.insert(0,"The");   // here it goes like (0)C(1)O(2)M(3)P(4)U(5)T(6)E(7)R-> the digits are index-> thus 8 letters has 7 index
     System.out.println(str);
    }
    
}
