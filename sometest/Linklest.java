/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linklest;

/**
 *
 * @author usci
 */
public class Linklest {

    
    public static void main(String[] args) {
      
      LinkedCollection l=new LinkedCollection();
      Integer a=new Integer(20);
      Integer b=new Integer(30);
      l.add(a);
      l.add(b);
      l.printlist();
      l.remove(a);
        System.out.println("remove");
      l.printlist();
      l.remove(new Integer(50));
        System.out.println(l.contains(new Integer(30)));
        System.out.println(l.contains(new Integer(50)));
         System.out.println(l.contains(new Integer(20)));
    }
    
}
