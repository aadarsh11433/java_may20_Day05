package com.aadarsh;

public class Notes {

	public static void main(String[] args) {

		String message = "Welcome to "+"456";
		String s = new String("Welcome");
		System.out.println(message+"  "+s);
		
		String s1 = "Welcome";
		String s2 = "Welcome";
		if(s1 == s2)
		System.out.println("same"); // same gets printed as the both s1 and s2 points to Welcome in the 
		//                             stringpool area; == is for address check
		else
		System.out.println("not same"); 

		
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		if(s3 == s4)
		System.out.println("same");
		else
		System.out.println("not same");
		//not same printed as both s3 and s4 points to a different location
		//even if the content of string is the same

		
		byte[] bytes = {(byte)165,65,102};
		String str =new String(bytes);
		
		System.out.println(str);
		
		System.out.println("=========");
		
		
		char chars[] ={'@', 'a', ' ', '5', 'i'};
		System.out.println(chars.clone());
		String s5 = new String(chars);
		
		System.out.println(s5);
		
		
		
		StringBuffer sbuffer = new StringBuffer("asfa");
		String s6 = new String(sbuffer.append("55")); 
		
		System.out.println(s6);
		
		System.out.println(sbuffer.append("daaaaaa"));
		
		System.out.println(sbuffer);
		
		StringBuilder sbuilder = new StringBuilder("affa+454f");
		String s7 = new String(sbuilder);
		System.out.println(sbuilder);
		System.out.println(s7);
		
		String name = "Java g";
		System.out.println("Student Name is : " + name);
		
		System.out.println("Hello" + 10 + 20 + "Welcome");
		
		String me = "Welcome";
		me.concat(" user");
		System.out.println(me);
		
		String me2 = "asdf";
		System.out.println(me2.concat(" user"+"45123333"));
		System.out.println(me2);
		
		System.out.println("=========");
		
		String strng = "example";
		System.out.println(strng.length());
		System.out.println(strng.charAt(4));
		
		System.out.println(strng.substring(4));
		System.out.println(strng.substring(2,5));

		System.out.println(strng.concat("of concat"));

		System.out.println(strng.indexOf("le"));
		
		String ss ="aabrakadabra";
		
		System.out.println(ss.lastIndexOf("b"));

		System.out.println(strng.equals("example"));
		System.out.println(strng.equals("EXAMple"));
		System.out.println(strng.equalsIgnoreCase("exAmpLe"));
	}

}
