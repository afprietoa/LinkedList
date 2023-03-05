public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.pushFront(61);
        linkedList.pushBack(30);
        linkedList.add(1,14);
        linkedList.add(2,18);
        linkedList.show();
        linkedList.popFront();
        linkedList.popBack();
        linkedList.show();
        System.out.println(linkedList.get(1));
        linkedList.delete(2);
        linkedList.show();
    }
}