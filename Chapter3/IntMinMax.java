public class IntMinMax{
  public static int min(int[] a){
    int min = a[0];
    for(int i=1; i<a.length ; i++){
      if(min > a[i]) min = a[i];
    }
    return min;
  }
  public static int max(int[] a){
    int max = a[0];
    for(int i=1; i<a.length ; i++){
      if(max < a[i]) max = a[i];
    }
    return max;
  }

  public static void main(String[] args){
    int[] a = {28, 32, 64, 1, 3};
    for(int i=0; i<a.length ; i++){
      System.out.print("a[" + i + "] = " + a[i] + "  ");
      System.out.println("\nmin = " + min(a)+ "   max = " + max(a));
    }
  } 

}
