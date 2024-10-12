package java_placement_exercises;
import java.util.*;
public class sll {
	    Node head;
	    
	    class Node{
	        int data;
	        Node next;
	        
	        Node(int val){
	            data = val;
	            next = null;
	        }
	    }
	    sll(){
	        head = null;
	    }
	    public void insertend(int val){
	        Node newnode = new Node(val);
	        
	        if (head ==null){
	            head = newnode;
	        }
	        else{
	            Node temp = head;
	            while(temp.next != null){
	                temp= temp.next;
	            }
	            temp.next = newnode;
	        }
	    }
	    public void insertbegin(int k) {
	    	Node newnode=new Node(k);
	    	if(head==null) {
	    		head=newnode;
	    	}else {
	    		newnode.next=head;
	    		head=newnode;
	    	}
	    }
	    public void insertposition(int pos,int d) {
	    	Node newnode=new Node(d);
	    	Node temp=head;
	    	for(int i=1;i<pos;i++) {
	    		temp=temp.next;
	    	}
	    	newnode.next=temp.next;
	    	temp.next=newnode;
	    }
	    public void deletebegin() {
	    	head=head.next;
	    }
	    public void deleteposition(int h) {
	    	Node temp=head;
	    	Node prev=null;
	    	for(int i=1;i<h;i++) {
	    		prev=temp;
	    		temp=temp.next;
	    	}
	    	prev.next=temp.next;
	    }
	    public void deleteend() {
	    	Node temp=head;
	    	Node  prev=null;
	    	while(temp.next!=null) {
	    		prev=temp;
	    		temp=temp.next;
	    	}
	    	prev.next=null;
	    }
	    public void rev() {
	    	Node prev=null;
	    	Node current=head;
	    	//Node nex=null;
	    	while(current!=null) {
	    		Node nex=current.next;
	    		current.next=prev;
	    		prev=current;
	    		current=nex;
	    	}
	    	head=prev;
	    }
	    public void max() {
	    	Node temp=head;
	    	int b=0;
	    	while(temp!=null) {
	    		if(b<temp.data) 
	    			b=temp.data;
	    	temp=temp.next;}System.out.println("Greater node is -->"+b);
	    }
	    public void min() {
	    	Node temp=head;
	    	int m=99;
	    	while(temp!=null) {
	    		if(m>temp.data) 
	    			m=temp.data;
	    	temp=temp.next;}System.out.println("Smaller node is -->"+m);
	    }
	    public void search(int u) {
	    	Node temp=head;
	    	int j=0;
	    	while(temp!=null) {
	    		if(temp.data==u) {
	    			j=1;
	    		break;}
	    			
	    	temp=temp.next;}
	    	if(j==0)
	    	System.out.print("Not found");
	    	else
	    		System.out.println("element found");
	    }
	    public void sort() {
	    	Node cur,in;
	    	int temp;
	    	for(cur=head;cur.next!=null;cur=cur.next) {
	    		for(in=cur.next;in!=null;in=in.next) {
	    			if(cur.data>in.data) {
	    				temp=cur.data;
	    				cur.data=in.data;
	    				in.data=temp;
	    			}
	    				
	    		}
	    	}
	    }
	    public void redup() {
	    	Node cur=head;
	    	while(cur!=null&&cur.next!=null) {
	    		if(cur.data==cur.next.data) {
	    			cur.next=cur.next.next;
	    		}else {
	    			cur=cur.next;
	    		}
	    	}
	    }
	    public void display(){
	        Node temp = head;
	        
	        while(temp!= null){
	            System.out.print(temp.data + "-->");
	            temp = temp.next;
	        }
	        System.out.println("Null");
	    }
	    public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        sll list = new sll();
	        int k;
	        do {
	        	System.out.print("1.creation\n2.deletion\n3.insertion\n4.sort\n5.min\n6.max\n7.search\n8.reverse\n9.remove duplicates\n10.display");
	        k=sc.nextInt();
	        switch(k) {
	        case 1:
	        	int n = sc.nextInt(); 
		        for(int i =0;i<n;i++){
		            int val = sc.nextInt();
		            list.insertend(val);
		        }break;
	        case 2:
	        	System.out.print("1.delbegin\n2.delend\n3.delpos");
	        	int u=sc.nextInt();
	        	switch(u) {
	        	case 1:
	        		list.deletebegin();break;
	        	case 2:list.deleteend();break;
	        	case 3:int j=sc.nextInt();list.deleteposition(j);break;
	        	}
	        	break;
	        case 3:
	        	System.out.print("1.insbegin\n2.insend\n3.inspos");
	        	int ru=sc.nextInt();
	        	switch(ru) {
	        	case 1:int p=sc.nextInt();list.insertbegin(p);break;
	        	case 2:int p1=sc.nextInt();list.insertend(p1);break;
	        	case 3:int p3=sc.nextInt(); int p2=sc.nextInt();list.insertposition(p3,p2);break;
	        	}
	        	break;
	        case 4:list.sort();break;
	        case 5:list.min();break;
	        case 6:list.max();break;
	        case 7:int s=sc.nextInt();list.search(s);break;
	        case 8:list.rev();break;
	        case 9:list.sort();list.redup();break;
	        case 10:list.display();break;
	        }
	        }while(k!=-1);
	        
	    }	}
