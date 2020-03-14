package test.java.enum01;

public class Test01 {
	public static void main(String[] args) {
		 for (Enum01 e : Enum01.values()) {
	            System.out.println(e.toString());
	        }
	         
	        System.out.println("----------------我是分隔线------------------");
	         
	        Enum01 test = Enum01.TUE;
	        switch (test) {
	        case MON:
	            System.out.println("今天是星期一");
	            break;
	        case TUE:
	            System.out.println("今天是星期二");
	            break;
	        // ... ...
	        default:
	            System.out.println(test);
	            break;
	        }
	}

}
