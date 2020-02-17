import java.util.ArrayList;
public class ArrayListapp{
  public static void main(String[] args){
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(64);
    arr.add(28);
    arr.add(61);
    arr.add(32);

    System.out.println("ArrayList : arr = " +arr);
    arr.add(3, 28);
    System.out.println("After add(3, 28)  :  "  + arr);

  }
}