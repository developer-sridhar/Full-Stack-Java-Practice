package StringMethods;

public class StringMethods {

	public static void main(String[] args) {
//	1.	String Buffer
		
		String s = "Java";
		System.out.println(s.hashCode());
		s = "Hello World !!! Welcome to Nirmaan";

		
		// new 
		StringBuffer sb = new StringBuffer("Java ");
		System.out.println(sb.hashCode()+" : "+sb);
		System.out.println("");
// 2. Append()
		sb.append(s);
		System.out.println("Appended Value with sb and s: "+ sb +"\n"+"String Buffer Value & Hash Code: "+sb.hashCode());	
		System.out.println("");
// 3. CharAt()
		System.out.println("--- This is charAt() String Method ---");
		System.out.println(s.charAt(2));
		System.out.println("");
		
//	4. indexOf()
		System.out.println("--- This is indexOf() String Method ---");
		System.out.println(s.indexOf('a'));
		System.out.println("");
		
//	5. lastIndexOf()
		System.out.println("--- This is LastIndexOf() String Method ---");
		System.out.println(s.lastIndexOf(6));
		System.out.println("");
		
//	6. Contains()
		System.out.println("--- This is contains() String Method ---");
		System.out.println(s.contains("Java"));
		System.out.println(s.contains("Pro"));
		System.out.println("");
		
//	7. Split()
		
		System.out.println("--- This is Split() String Method ---");
		System.out.println(s.split(" "));
		System.out.println("--- This is Split() with for loop String Method ---");
		String str[] = s.split(" ");
		for (String st:str) {
			System.out.println(st);
		}
		System.out.println("");
		
		System.out.println("---- Random String Split ----");
		System.out.println(str[0]+"\n"+str[3]);
		System.out.println("");
		
//	7. toUpperCase()
		System.out.println("--- This is toUpperCase() Method ---");
		System.out.println(s.toUpperCase());
		System.out.println("");
		
//	8. toUpperCase()
		System.out.println("--- This is toLowerCase() Method ---");
		System.out.println(s.toLowerCase());
		System.out.println("");
		
//	9. subString()
		System.out.println("--- This is subString() Method ---");
		System.out.println(s.substring(5));
		System.out.println(s.substring(1,6));
		System.out.println("");
		
//	10. replace()
		System.out.println("--- This is replace() Method ( o --> O )---");
		System.out.println(s.replace('o','O'));
		System.out.println("");

//	11. isEmpty()
		System.out.println("--- This is isEmpty() Method ---");
		String emp = new String(" ");
		String emp1 = new String("");
		System.out.println("With One Space: "+emp.isEmpty()+" | Without Space: "+emp1.isEmpty());
		System.out.println("");

//	12. isBlank()
		System.out.println("--- This is isBlank() Method ---");
		System.out.println("With One Space: "+emp.isBlank()+" | Without Space: "+emp1.isBlank());
		System.out.println("");
			
//	13. startsWith()
		System.out.println("--- This is startsWith() Method ---");
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.startsWith("world"));
		System.out.println("");
		
//	14. endsWith()
		System.out.println("--- This is endsWith() Method ---");
		System.out.println(s.endsWith("Nirmaan"));
		System.out.println(s.endsWith("to"));
		System.out.println("");
		
		// String Comparison
		
//	15. equals()
		System.out.println("--- This is equals() Method ---");
		String s1 = "Hello";
		String s2 = "Hello"; 
		
		String ns = new String("Nirmaan");
		String ns1 = new String("Nirmaan");
		
		System.out.println(s1.equals(s2));
		System.out.println(ns.equals(ns1));
		System.out.println("");
		
		
//	16. "==" Operator
		System.out.println("--- This is \"==\" Operator Method ---");
		System.out.println(s1==s2);
		System.out.println(ns==ns1);
		System.out.println("");

		
//	17. compareTo() Operator
		System.out.println("--- This is compareTo() Operator Method ---");
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(ns1));
		System.out.println("");

		
//  18. ASCII Value
		System.out.println("--- This is ASCII Value Operator Method ---");
		char ch = 'B';
		int n = ch;
		System.out.println(n);
		System.out.println("");
		
//	19. equalsIgnoreCase()
		System.out.println("--- This is equalsIgnoreCase() Operator Method ---");
		String eic1 = new String("Nirmaan");
		String eic2 = new String("nirmaan");
		System.out.println(eic1.equalsIgnoreCase(eic2));
		System.out.println("");

//	20. Literal String
		System.out.println("--- This is Literal String ---");
		String ls = "java";
		String ls1 = "java";
		
		String nls = new String("java");
		String nls1 = new String("java");
		
		System.out.println("Reference Literal String: "+ls.hashCode());
		System.out.println("Reference Literal String: "+ls1.hashCode());
		
		System.out.println("Reference Literal String: "+nls.hashCode());
		System.out.println("Reference Literal String: "+nls1.hashCode());
		System.out.println("");
		
// 21. Immutable String
		System.out.println("--- This is Immutable String ---");
		System.out.println(System.identityHashCode(ls));
		System.out.println(System.identityHashCode(ls1));
		
// 21. Mutable String
		System.out.println("--- This is Mutable String ---");
		System.out.println(System.identityHashCode(nls));
		System.out.println(System.identityHashCode(nls1));
		System.out.println("");
		
		}


}
