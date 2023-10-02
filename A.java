public class A
{
public void m1()
{
System.out.println("M1--A");

}
public void m2()
{
System.out.println("M2--B");
}
public void m3()
{
System.out.println("M3--C");
}
public void m4()
{
System.out.println("M4--D");
}

public static void main(String args[])
{

System.out.println("main start");
A d = new A();
d.m1();
d.m2();
d.m3();
d.m4();
System.out.println("main end");

}


}