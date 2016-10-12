/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test2;

/**
 *
 * @author usci
 */
public class ArrayList implements List {
    private Object[] data;
    private int size;
    public ArrayList(){
        data=new Object[5];
        size=0;
    }
    public void add(Object o){
        if (o==null);
        capacity(size+1);
        data[size++]=o;
        
            
    }
    
    public void add(int i,Object o)
    {
        for(int j = size ; j>i;j--)
        {
            data[j] = data[j-1];
        }
        data[i] = o;
        size++;
    }
    private void capacity(int a){
        if(a>data.length){
            Object[] arr=new Object[2*data.length];
            for(int i=0;i<size;i++)
                arr[i]=data[i];
            data=arr;
        }}
     private int indexOf(Object e){
         for(int i=0;i<size;i++){
             if(data[i].equals(e)) return i;
         }
         return -1;
         }
        
     public boolean contains(Object o){
    if(indexOf(o)!=-1)
    return true;
    return false;
    
    
}
