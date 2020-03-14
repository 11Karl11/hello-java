package test.java.enum01;

public enum EnumTest3 {
    MON("星期一",1),TUE("星期二",2), WED("星期三",3), THU("星期四",4);
    
    
  
    private String name;
    private int value;
 
    private  EnumTest3(String name,int value) {
    	 this.name=name;
        this.value = value;
       
    }
 
    public int getValue() {
        return value;
    }
    public String getName() {
    	return name;
    }
 public static void main(String[] args) {
	EnumTest3 mon2 = EnumTest3.MON;
	int value2 = mon2.getValue();
	System.out.println(value2);
	System.out.println(mon2.getName());
	System.out.println(mon2.toString());
	
}
  
  
}


