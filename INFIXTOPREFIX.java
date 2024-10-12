import java.util.*;
import java.util.Stack;

public class infixtoprefix {
	public static int precedence(char op) {
		switch(op) {
		case'+':
		case'-':
			return 1;
		case'*':
		case'/':
			return 2;
		case'^':
			return 3;
		}
		return -1;
	}
	public static boolean check(char op1,char op2) {
		return precedence(op1)>=precedence(op2);
	}
	public static String infitoposi(String s) {
		StringBuilder sb=new StringBuilder();
		Stack<Character> stack=new Stack<>();
		char c;
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				sb.append(c);
			}
			else if(c=='('){
				stack.push(c);
				}
			else if(c==')') {
				while(!stack.isEmpty()&&stack.peek()!='(') {
					sb.append(stack.pop());
				}
				stack.pop();
			}
			else{
				while(!stack.isEmpty()&&stack.peek()!='('&&check(stack.peek(),c)) {
					sb.append(stack.pop());
				}
				stack.push(c);
			}}
			while(!stack.isEmpty()) {
				sb.append(stack.pop());
			}
			return sb.toString();
	}
		
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the infix");
		StringBuilder s=new StringBuilder();
		String s11=n.nextLine();
	for(int i=s11.length()-1;i>=0;i--) {
		char c=s11.charAt(i);
		if(c==')')
			c='(';
		else if(c=='(')
			c=')';
		
			s.append(c);
		}
		
		System.out.println("infix to prefix");
		String j=infitoposi(s.toString());
		s.setLength(0);
		s.append(j);
		s.reverse();
		System.out.println(s.toString());
		
	}

}
