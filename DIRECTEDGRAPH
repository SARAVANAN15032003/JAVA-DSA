package java_placement_exercises;
import java.util.*;
public class undirectedgraph {
ArrayList<ArrayList<Integer>> list=new ArrayList<>();
undirectedgraph(int size){
	for(int i=0;i<size;i++) {
		list.add(new ArrayList<Integer>(i));
	}
}
public void insert(int v,int a){
	list.get(v).add(a);
	}
public void dfs(int v) {
	int size=list.size();
	boolean visited[]=new boolean[size];
	dfs1(v,visited);
}
public void dfs1(int v,boolean[] visited) {
	System.out.print(v+" ");
visited[v]=true;
for(int i=0;i<list.get(v).size();i++) {
	int k=list.get(v).get(i);
	if(!visited[k]) {
		dfs1(k,visited);
	}
}
}
public void bfs(int g) {
	HashSet<Integer> set=new HashSet<>();
	System.out.println("BFS");
for(int i=0;i<list.get(i).size();i++) {
	for(int j=0;j<list.get(i).size();j++) {
	set.add(list.get(i).get(j));
	}
}
System.out.print(set);
}

public void display() {
	for(int i=0;i<list.size();i++) {
		System.out.print(i+":");
		for(int j=0;j<list.get(i).size();j++) {
			System.out.print(list.get(i).get(j)+" ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the number vertices:");
		int size=n.nextInt();
		undirectedgraph ug=new undirectedgraph(size);
int y=0;
for(int i=0;i<size;i++) {
	int v=n.nextInt();
	int a=n.nextInt();
	if(y==0)
		y=v;
ug.insert(v,a);
}
ug.display();
ug.dfs(y);
ug.bfs(y);
n.close();}

}
