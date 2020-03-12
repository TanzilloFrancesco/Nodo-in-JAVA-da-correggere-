public class Nodo {
    public int val;
    public Nodo next = null;
          
    public Nodo(int val, Nodo nodo){
        this.val = val;
        this.next = nodo.next;
    }
    
    public Nodo(Nodo nodo){
        this.val = nodo.getVal();
        this.next = nodo.getNext();
    }
    
    public int getVal(){
        return this.val;
    }
    
    public Nodo getNext(){
        return this.next;
    }
    
    public int setVal(int val){
        return this.val = val;
    }
    
    public void setNext(Nodo next){
        this.next = next;
    }
    public void setNodo(Nodo nodo){
        this.val = nodo.getVal();
        this.next = nodo.getNext();
    }
}