

public class IntegerPrinter {
 
    public void runMe() {
        System.out.println(new Integer(4));
        IntegerPrinter2 ip = new IntegerPrinter2(2,"test");
        System.out.println("id:"+ip.getId()+",name:"+ip.getName());
		System.out.println(IntegerPrinter.class.getClassLoader());
    }
}