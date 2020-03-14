package test.java.enum01;

public class Test02 {
	public static void main(String[] args) {
		Enum01 test = Enum01.TUE;
         
	        //compareTo(E o)
	        switch (test.compareTo(Enum01.MON)) {
	        case -1:
	            System.out.println("TUE 在 MON 之前");
	            break;
	        case 1:
	            System.out.println("TUE 在 MON 之后");
	            break;
	        default:
	            System.out.println("TUE 与 MON 在同一位置");
	            break;
	        }
	         
	        //getDeclaringClass()
	        System.out.println("getDeclaringClass(): " + test.getDeclaringClass().getName());
	         
	        //name() 和  toString()
	        System.out.println("name(): " + test.name());
	        System.out.println("toString(): " + test.toString());
	         
	        //ordinal()， 返回值是从 0 开始   返回枚举常量的序数（它在枚举声明中的位置，其中初始常量序数为零）。
	        System.out.println("ordinal(): " + test.ordinal());
	}

}
