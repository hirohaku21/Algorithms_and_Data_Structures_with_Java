public class TwoDimArray{
  public static void main(String[] args){
    int[][] a = {{33, 71},{-16,45},{99,27}};

    int nrow = a.length;
    int ncol = a[0].length;
    for(int i=0; i<nrow ; i++){
      for(int j=0; j<ncol ; j++){
        System.out.printf("a[%d][%d] = %3d    ",i,j,a[i][j]);
        System.out.println();
      }
    }
    System.out.println("nrow= " + nrow + "   ncol = " +ncol);
  }
}