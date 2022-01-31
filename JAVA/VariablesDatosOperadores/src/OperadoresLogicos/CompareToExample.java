package OperadoresLogicos;

public class CompareToExample {
	public static void main(String args[]) {
	       String str1 = "HOLA";
	       String str2 = "compareTo method example";
	       String str3 = "hola";

	       int var1 = str1.compareTo( str2 );
	       System.out.println("str1 & str2 comparison: "+var1);

	       int var2 = str1.compareToIgnoreCase( str3 );
	       System.out.println("str1 & str3 comparison: "+var2);

	       int var3 = str2.compareTo("compareTo method example");
	       System.out.println("str2 & string argument comparison: "+var3);
	   }
}
