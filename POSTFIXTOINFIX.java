import java.util.Scanner;
import java.util.Stack;

public class postfixtoinfix {
	public static String positoinfi(String s) {
		Stack<String> stack=new Stack<>();
		//String re = null;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				stack.push(Character.toString(c));}
			else {
			String t1=stack.pop();
			String t2=stack.pop();
			String re="("+t2+c+t1+")";
			stack.push(re);
			}
				
			}
		return stack.toString();
		}
	
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		String s1=n.nextLine();
		System.out.println("postfix to infix");
		String s=positoinfi(s1);
		System.out.print(s);
	}

}
