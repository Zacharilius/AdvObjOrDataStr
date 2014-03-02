/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collection;

import java.util.Collection;

/**
 *
 * @author zacharybensley
 */
public class SLList {
    public SLListNode head;
    public SLListNode tail;
    
    public SLList(){
        head = tail = null;
    }
    
    
    public boolean add(Object e){
        SLListNode newNode = new SLListNode(e, null);
        if(head == null){
            head = tail = newNode;
        }
        
        return true;
    }
    public void add(int index, Object e){
    
    }
    public boolean addAll(Collection<? extends SLListNode> c){
    
        return true;
    }
    public void addFirst(Object e){
    
    }
    public void addLast(Object e){
    
    }
    public void contains(Object e){
    
    }
    public void clear(){
    
    }
    public SLListNode get(int index){
        SLListNode node = new SLListNode(2, );                                                                                                                                                                                                                                                                                                                                                                                                             
        return node; 
    }
    public SLListNode getFirst(){
    
        return node;
    }
    public SLListNode getLast(){
        return node;
    }
    /*
        Removes head and returns it
    */
    public SLListNode remove(){
        return node;
    }
    /*
        Removes and returns the paramater object
    */
    public SLListNode remove(Object e){
        return node;
    }
    public int size(){
        return size;
    }
    public Object[] toArray(){
        return oa;
    }
}
