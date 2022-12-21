package com.main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Application {

	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            if(balanced(input)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
		}
        sc.close();
		
	}
    public static boolean balanced(String b){
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i=0;i<b.length();i++){
            if (b.charAt(i) == '(') stack.push('(');
            else if (b.charAt(i) == '{') stack.push('{');
            else if (b.charAt(i) == '[') stack.push('[');
            else if (b.charAt(i) == ')') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '(') return false;
            }
            else if (b.charAt(i) == '}') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '{') return false;
            }
            else if (b.charAt(i) == ']') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '[') return false;
            }
            
        }
        return stack.isEmpty();
    }
}	


