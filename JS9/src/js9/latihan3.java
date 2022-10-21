/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js9;

/**
 *
 * @author PC i8
 */
public class latihan3 {
    public static void main(String[] args) {
        String str1,str2;
        str1 = "Free the bound periodicals.";
        str2=str1;
        
        System.out.println("String 1 : " +str1);
        System.out.println("String 2 : " +str2);
        System.out.println("Same object? "+(str1==str2));
        
        str2 = new String(str1);
        System.out.println("String 1 : "+str1);
        System.out.println("String 2 : "+str2);
        System.out.println("Same object ? "+(str1==str2));
        
        System.out.println("Same valu ? "+str1.equals(str2));
    }
}
