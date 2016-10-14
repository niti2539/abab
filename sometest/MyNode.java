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
public class MyNode {
    private Object data;
    private MyNode next;
    public MyNode( Object obj,MyNode n){
        data=obj;
        next=n;
        
    }
    public void setNext(MyNode n){
        next=n;
    }
    public void setData(Object d){
     data=d;   
    }
    public MyNode getNext(){
        return next;
    }
    public Object getData(){
        return data;
    }
    
}
