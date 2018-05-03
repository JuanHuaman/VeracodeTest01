import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class DemoApp2 {
	public static void main(String[] args) {
		String one = new String("abc");
		String two = new String("abc");
		String three = one;
		if (one != two) System.out.println("The two objects are not the same.");
		if (one.equals(two)) System.out.println("But they do contain the same value");
		if (one == three) System.out.println("These two are the same, because they use the same reference.");
		
		String letters = "abc";
		String moreLetters = "abc";
		System.out.println(letters==moreLetters);
		
		String data = new String("123");
		String moreData = new String("123");
		System.out.println(data==moreData);
		
		Integer i = 100;
		Integer p = 100;
		if (i == p)  System.out.println("i and p are the same.");
		if (i != p)   System.out.println("i and p are different.");	
		if(i.equals(p))  System.out.println("i and p contain the same value.");
		
		 int x = 5;
		 x = x++;
		 System.out.println( x );
		 
		 int xi = 3;
		 if (xi==5) {}
		 else if (xi<9)
		 {
		   System.out.println("x is less than 9");
		 }
		 else if (xi<6)
		 {
		   System.out.println("x is less than 6");
		 }
		 else
		 {
		   System.out.println("else");
		 }
		 
	 
		 try {
				ScriptEngineManager manager = new ScriptEngineManager();
				ScriptEngine engine = manager.getEngineByName("JavaScript");
				engine.eval(new java.io.FileReader("resources/" + args[0] + ".js"));
			} catch(Exception e) {
				e.printStackTrace();
				
			}
	}
	private static class IntegerCache 
	 {
	   private IntegerCache(){}
	   
	   static final Integer cache[] = new Integer[-(-128) + 127 + 1];
	 
	   static 
	   {
		   String one = new String("abc");
		   String two = new String("abc");
		   if (one != two) System.out.println("The two objects are not the same.");
	     for(int i = 0; i < cache.length; i++)
	     cache[i] = new Integer(i - 128); 
	   }
	 }
	    
	 public static Integer valueOf(int i) 
	 {
		final int offset = 128;
		if (i >= -128 && i <= 127) // must cache 
	        { 
		    return IntegerCache.cache[i + offset];
		}
	        return new Integer(i);
	 }
}
