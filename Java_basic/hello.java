public class hello
{
static public void main (String[] args)
{
   Test t1 = new Test();
   t1.a=20;
   t1.b=30;
   System.out.println(t1.a);
   System.out.println(t1.b);
   Test t2=t1;
   t2.a=40;
   System.out.println(t1.a);
   System.out.println(t2.a);

   String roll = "21a";
   char apple []= {'a','b','c'};
   System.out.println(roll);
   System.out.println(apple);
   
}

}
class Test {
    int a;
    int b;
}
