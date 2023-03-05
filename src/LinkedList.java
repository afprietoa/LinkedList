import java.util.NoSuchElementException;

public class LinkedList {
    class Node{
        int key;
        Node next;
        Node(int key){
            this.key = key;
            this.next = null;
        }
    }


    protected Node head;
    protected Node tail;

    public void pushFront(int key){
        Node node = new Node(key);
        node.next = head;
        head = node;
        if(node.next == null)
            tail= node;
    }
    public void popFront(){
        if(head == null){
            System.out.println("empty list");
        }
        head = head.next;
        if(head == null){
            tail = null;
        }

    }
    public void pushBack(int key){
        Node node = new Node(key);
         if(tail == null){
            head = tail = node;
        }else{
            tail.next = node;
            tail = node;
        }

    }
    public void popBack(){
        if(head == null){
            System.out.println("empty list");
        }
        if(head == tail){
            head = tail = null;
        }else{
            Node aux = head;
            while(aux.next.next != null){
                aux = aux.next;
            }
            aux.next = null;
            tail = aux;
        }
    }

    public void add(int position, int key){
        if(position<0){
            throw new IndexOutOfBoundsException();
        } else if (position==0) {
            pushFront(key);
        }else{
            Node node = new Node(key);
            Node aux = head;
            for (int i=0; i<position-1; i++){
                if(aux == null)
                    throw new IndexOutOfBoundsException();
                aux = aux.next;
            }
            if(aux.next == null){
                pushBack(key);
            }else{
                node.next = aux.next;
                aux.next = node;
            }
        }
    }
    public void delete(int position){
        if(position<0){
            throw new IndexOutOfBoundsException();
        }
        if(position == 0){
            popFront();
        }else{
            Node aux = head;
            for (int i=0; i<position-1; i++){
                if(aux == null)
                    throw new IndexOutOfBoundsException();
                aux = aux.next;
            }
            if(aux == tail){
                popBack();
            }else{
                aux.next = aux.next.next;
            }
        }
    }
    public int get(int position){
        if(position<0){
            throw new IndexOutOfBoundsException();
        }
        Node aux= head;
        for(int i=0; i<position-1; i++){
            if(aux == null)
                throw new IndexOutOfBoundsException();
            aux = aux.next;
        }
        return aux.key;
    }

    public void show(){
        Node aux = head;
        while(aux != null){
            System.out.println(aux.key);
            aux = aux.next;
        }
    }

}
