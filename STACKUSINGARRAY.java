import java.util.*;
class main{
  static int stack[]=new int[1001];
  static int top=-1;
  
  public static int push(int val){
    if(top>1000)
      return -1;
stack[++top]=val;
return 1;
  }
  public static int pop(){
    if(top==-1)
       return -1;
    return stack[top--];
  }
  public static int peek(){
    if(top==-1)
    return -1;
    
return stack[top];
  }
  public static boolean isEmpty(){
    return top==-1;
  }
  public static int cur(){
    return top+1;
  }
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int ch,re,i;
    while(true){
    ch=n.nextInt();
    if(ch==-1)
    break;
    
   switch(ch){
     case 1:
       i=n.nextInt();
       re=push(i);
       if(re==-1)
       System.out.println("Stack Full");
       break;
     case 2:
       re=pop();
       if(re==-1)
       System.out.println("Empty Stack");
       else
       System.out.println(re);
       break;
     case 3:
       re=peek();
       if(re==-1)
       System.out.println("Empty Stack");
       else
       System.out.println(re);
       break;
      case 4:
        if(isEmpty())
        System.out.println("Empty Stack");
        else
        System.out.println("Non Empty Stack");
        break;
      case 5:
        re=cur();
        System.out.println("Number elements stored inside stack : "+re);
        break;
   } 
   } 
  }
}
