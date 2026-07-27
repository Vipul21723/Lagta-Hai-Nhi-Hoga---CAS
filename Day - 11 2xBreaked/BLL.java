import java.util.LinkedList;

public class BLL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("VIPUL");
        list.addFirst("PATEL");
        System.out.println(list);
        System.out.println(list.size());
        list.addLast("I");
        list.addLast("AM");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(1));
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove("IAM");
        System.out.println(list);
        list.remove("I");
        System.out.println(list);
    }
}
