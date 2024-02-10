public class Demo03 {
public static void main(String[] args){
new Emp("John",30).printEmp();
        
}}


class Emp{
public String empName;
public int age;
public Emp(String _empName, int _age){
this.empName =_empName;
this.age=_age;
}
public void printEmp() {
System.out.println("Emp Name= "+empName+"\n"+ "Emp Age"+age);
}}
