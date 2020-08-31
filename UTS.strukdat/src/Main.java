public class Main {

    public static void main(String[] args) {
      linkedList ll = new linkedList();
      ll.add("10");
      ll.add("10");
      ll.add("10");
      

      System.out.println(ll.txt());
      ll.remove("10");
      System.out.println(ll.txt());
      System.out.println(ll.contains("200"));

    }
}