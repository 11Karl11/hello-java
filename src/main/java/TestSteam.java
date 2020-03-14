import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestSteam {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("a","b","c","d");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered); 
		                     
	}

}
