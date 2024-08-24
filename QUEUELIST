import java.util.*;
public class queuelist {
Node front;
Node rear;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}
public void enqueue(int k) {
	Node newnode=new Node(k);
	if(front==null) {
		front=newnode;
		rear=newnode;
	}
	else {
		rear.next=newnode;
		rear=newnode;
	}
}
public void dequeue() {
	front=front.next;
}
public void dis() {
	Node temp=front;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}System.out.println();
}
queuelist(){
	front=null;
	rear=null;
}
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		queuelist qll=new queuelist();
		int h;
		while(true) {
			h=n.nextInt();
			if(h==-1)
				break;
		qll.enqueue(h);
		}
		qll.dis();
		qll.dequeue();
		qll.dis();
		qll.dequeue();
		qll.dis();

	}

}
