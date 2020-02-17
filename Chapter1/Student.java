public class Student{
  private int no;
  private String name;
  private int age;
  Student(int no, String name, int age){
    this.no = no; this.name=name; this.age = age;
  }


  public int getNo(){ return no;}
  public String getName(){ return name;}
  public int getAge(){ return age; }

  // public void setNo(int no){
  //   this.no = no;
  // }
  // public void setName(String name){
  //   this.name= name;
  // }
  // public void = setAge(int age){
  //   this.age = age;
  // }

  public void print(){
    System.out.println("Student: no= "+no + "  name=  " + name + "  age= " + age);
  }
  public String toString(){
    return getNo()+ " " + getName()+ " " + getAge();
  }
}