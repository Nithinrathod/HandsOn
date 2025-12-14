package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiExample {
	public static void main(String[] args) {
		//7th question
		
		//8th question
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 8, 22, 34, 88, 39);
		int maxVal = l1.stream().max(Integer::compare).get();
		System.out.println("Max Value : "+maxVal);
		
		//9th question
		List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> l3 = Arrays.asList(2, 3, 5, 7, 10, 6);
		
		List<Integer> l4 = Stream.concat(l2.stream(), l3.stream()).distinct().collect(Collectors.toList());
		System.out.println("Merged List : "+l4);
		
		//10th question
		String s1[] = {"a", "abc", "abcd", "ab", "abcde"};
		Arrays.stream(s1).sorted(Comparator.comparingInt(String::length).reversed()).forEach(System.out::println);
		
		//11th question
		List<Integer> l5 = Arrays.asList(1, 2, 3, 4, 5, 6);
		l5.stream().map(x -> x*x).forEach(System.out::println);
		
		//12th question
		List<String> l6 = Arrays.asList("one", "two", "three");
		String s2 = l6.stream().collect(Collectors.joining());
		System.out.println("Joined Strings : "+s2);
		
		//13th question
		List<String> l7 = Arrays.asList("a", "abc", "abcd", "ab", "abcde", "o", "ghj", "abdg"); 
		
		Map<Integer, List<String>> m1 = l7.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("group by string length "+m1);
		
		//14th question
		List<Integer> l8 = Arrays.asList(1, 2, 3, 4, 5, 8, 22, 34, 88, 39);
		int minVal = l8.stream().min(Integer::compare).get();
		System.out.println("Min Value : "+minVal);
		
		//15th question
		List<Integer> l9 = Arrays.asList(1, 2, 3, 4, 5, 8, 22, 34, 88, 39);
		int secondMaxVal = l9.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second Max Value : "+secondMaxVal);
		
		//16th question
		List<String> l10 = Arrays.asList("banana", "apple", "orange");
		Map<Character, Long> m2 = l10.stream().flatMap(s -> s.chars().mapToObj(c -> (char)c)).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println("Frequency of chars : "+m2);
		
		//17th question
		List<String> s3 = Arrays.asList("aba", "sir", "madam");
		Map<Object, Object> m3 = s3.stream().collect(Collectors.toMap(s-> s, s-> IntStream.range(0, s.length()/2).allMatch(i -> s.charAt(i) == s.charAt(s.length()-i-1))));
		System.out.println("Palindrome Check : "+m3);
		//18th question
		List<Integer> l12 = Arrays.asList(1, 2, 3, 4, 5, 8, 22, 34, 88, 39);
		l12.stream().sorted().forEach(System.out::println);
		
		//19th question
		List<Integer> l13 = Arrays.asList(1, 2, 2, 3, 3, 4, 4, 5, 8, 9, 9, 10);
		l13.stream().distinct().forEach(System.out::println);
		
		//20th question
		String s4 = "efenfilwug";
		Set<Character> h1 = new HashSet<>();
		char val = s4.chars().mapToObj(c -> (char)c).filter(c -> !h1.add(c)).findFirst().get();
		System.out.println("First repeated char : "+val);
		
		
		
	}
}
