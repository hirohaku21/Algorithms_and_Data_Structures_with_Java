public class StudentApp{
  public static void main(String[] args){
    Student s1 = new Student(1,"C",28);
    Student s2 = new Student(2, "K" ,29);

    System.out.println(
      "no= " +s1.getNo() +"  name= "+s1.getName()+ "   age= " + s1.getAge() 
      );
    System.out.println(
      "no =  " + s2.getNo() + "   name  =  " + s2.getName() + "   age =  " + s2.getAge()
      );

    s1.print();
    s2.print();
  }
}