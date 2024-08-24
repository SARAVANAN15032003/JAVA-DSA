import java.util.*;
public class priorqueue {
Node head;
class Node{
	Node next;
	int data;
	int pri;
	Node(int data,int pri){
		this.data=data;
		this.pri=pri;
	}}
	priorqueue(){
		head=null;
}
	public  void enqueue(int k,int p) {
		Node newnode=new Node(k,p);
		if(head==null) {
			head=newnode;
		}
		else {
			if(head.pri>p) {
				newnode.next=head;
				head=newnode;
			}
			else {
				Node temp=head;
				while(temp.next!=null&&temp.next.pri<p) {
					temp=temp.next;
				}
				newnode.next=temp.next;
				temp.next=newnode;
			}
		}
	}
	public void dequeue() {
		head=head.next;
	}
	public void dis() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}System.out.println();
	}
	public static void main(String[] args) {
Scanner n=new Scanner(System.in);
priorqueue pr=new priorqueue();
pr.enqueue(10, 3);
pr.enqueue(6, 4);
pr.enqueue(98, 1);
pr.enqueue(12, 8);
pr.dis();
pr.dequeue();
pr.dis();
	}

}
