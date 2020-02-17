  public class IntSum_for{
    public static int intsum_for(int[] a){
      int sum = 0;
      // for(int i=0; i<a.length ; i++){
      //   sum += a[i];
      // }
      for(int i : a) sum+= i;
      return sum;
      
    }
    public static void main(String[] args){
      int[] a={ 1,2,3,4,5,6,7,8,9,10 };
      System.out.println("sum = " + intsum_for( a ));
    }
    
  }