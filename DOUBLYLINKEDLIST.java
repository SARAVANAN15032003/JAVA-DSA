import java.util.*;
public class dll {
	Node head;
	Node tail;
	class Node{
		int  data;
		Node next;
		Node prev;
		Node(int val){
			data=val;
			next=null;
			prev=null;
		}
	}
	public void insbeg(int k) {
		Node newnode=new Node(k);
		if(head==null)
			tail=newnode;
		else {
			newnode.next=head;
			head.prev=newnode;
		}
		head=newnode;
	}
	public void insend(int k) {
		Node newnode=new Node(k);
		if(head==null) {
			head=newnode;
			
		}else {
			tail.next=newnode;
			newnode.prev=tail;
			
		}
		tail=newnode;
	}
	public void dis() {
		Node temp=head;
		System.out.println("from head");
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("NULL");
		System.out.print('\n');
		 temp=tail;
		System.out.println("from tail");
		
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.prev;
		}
		System.out.print("NULL");
		System.out.print('\n');
	}
	public void inspos(int k,int u) {
		Node newnode=new Node(k);
		Node temp=head;
		for(int i=1;i<u-1;i++) {
			temp=temp.next;
		}
		newnode.next=temp.next;
		temp.next.prev=newnode;
		temp.next=newnode;
		newnode.prev=temp;
		
	}
	
dll(){
	head=null;tail=null;
}
public void delbeg() {
	head=head.next;
	head.prev=null;}
public void delend() {
	tail=tail.prev;
	tail.next=null;}
public  void delpos(int l) {
	Node temp=head;
	Node prev;
	for(int i=1;i<l;i++) {
		temp=temp.next;
	}
	prev=temp.prev;
	prev.next=temp.next;
	temp.next.prev=prev;
}
public void sort() {
	Node cur,index;
	int temp;
	for(cur=head;cur!=null;cur=cur.next) {
		for(index=cur.next;index!=null;index=index.next) {
			if(cur.data>index.data) {
				temp=cur.data;
				cur.data=index.data;
				index.data=temp;
			}
		}
	}
}
public void remdup() {
	Node temp=head;
	while(temp!=null&&temp.next!=null) {
		if(temp.data==temp.next.data) {
			temp.next=temp.next.next;
		}else {
			temp=temp.next;
		}
			
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		dll list=new  dll();
		 int k;
	        do {
	        	System.out.print("1.creation\n2.deletion\n3.insertion\n4.sort\n5.remove duplicates\n6.display");
	        k=sc.nextInt();
	        switch(k) {
	        case 1:
	        	int n = sc.nextInt(); 
		        for(int i =0;i<n;i++){
		            int val = sc.nextInt();
		            list.insend(val);
		        }break;
	        case 2:
	        	System.out.print("1.delbegin\n2.delend\n3.delpos");
	        	int u=sc.nextInt();
	        	switch(u) {
	        	case 1:
	        		list.delbeg();break;
	        	case 2:list.delend();break;
	        	case 3:int j=sc.nextInt();list.delpos(j);break;
	        	}
	        	break;
	        case 3:
	        	System.out.print("1.insbegin\n2.insend\n3.inspos");
	        	int ru=sc.nextInt();
	        	switch(ru) {
	        	case 1:int p=sc.nextInt();list.insbeg(p);break;
	        	case 2:int p1=sc.nextInt();list.insend(p1);break;
	        	case 3:int p3=sc.nextInt(); int p2=sc.nextInt();list.inspos(p3,p2);break;
	        	}
	        	break;
	        case 4:list.sort();break;
	        case 5:list.sort();list.remdup();break;
	        case 6:list.dis();break;
	        }
	        }while(k!=-1);
	}

}