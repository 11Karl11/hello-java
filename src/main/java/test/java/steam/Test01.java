package test.java.steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {
	public static void main(String[] args) {
		String[] strs = {"java8", "is", "easy", "to", "use"};
		List<String[]> distinctStrs1 = Arrays.stream(strs)
		                                .map(str -> str.split(""))  // 映射成为Stream<String[]>
		                                .distinct()
		                                .collect(Collectors.toList());
		System.out.println(distinctStrs1);
		 
	
		 
		List<String> distinctStrs2 = Arrays.stream(strs)
		                                .map(str -> str.split(""))  // 映射成为Stream<String[]>
		                                .flatMap(Arrays::stream)  // 扁平化为Stream<String>
		                                .distinct()
		                                .collect(Collectors.toList());
		System.out.println(distinctStrs2);
		
		
	}
	
}
