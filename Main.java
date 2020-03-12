
public class Main
{
	public static void main(String[] args) {
        Nodo head = new Nodo(null, null);
        
        stampa(head);/*stampa della lista vuota: head-->NULL*/
        
        Nodo n1 = new Nodo(10,null);
        head.setNext(n1);
        
        stampa(head);/*stampa della lista: head-->n1-->NULL*/
        
        Nodo n2 = new Nodo(15,null);
        
        n1.setNext(n2);
        
        Nodo n3 = new Nodo(1, null);
        
        n3.setNext(n1.getNext());
        n1.setNext(n2.getNext());
        n2.setNext(null);
        head.setNext(n3.getNext());
        
        stampa(head);/*stampa della lista mettendo n3 in testa: head-->n3-->n1-->n2-->NULL*/
    }
    public static void stampa(Nodo head){
        Nodo temp = new Nodo(head);
        while (temp.next != null){
            System.out.printf("%d---->", temp.getVal());
                    temp.setNodo(temp.next); 
        }
    }
}

