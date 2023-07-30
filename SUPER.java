package oop;

public class SUPER extends SUPERR
{
  void meth2()
  {
	  super.meth1();
	  System.out.println("child class metod is called");
  }
  SUPER()
  {
	  super(10);
	  //this.meth2;
	  System.out.println("child class default dconstructer called");
  }

  public static void main(String[] args)
  {
	SUPER obj=new SUPER();
	obj.meth2();
}
}
//SUPER CLASS DEFAULT CONSTRUCTER WILL BE CALLED BECAUSE SUPER() THAT CONSTRUCTER CALL METHOD IS AVAILABLE IN THAT CONSTRUCTERR DEFAULTLY
//super VARIABLE WE CAN CALL PARENT CLASS METHOD SUPER()METHOD WE CAN CALL PARAENAT CLASS CONSTRUCTER
//IT CAN NOT USE IN STATIC AREA OR CONTEXT

