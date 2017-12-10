//breadth First Search

package Graph;

import java.util.*;
import java.util.LinkedList;

public class Graph {
	private int V;
	public LinkedList<Integer> adj[];
	
	Graph(int v){
		V=v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	
	void BFS(int s,int end){
		boolean[] visited = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(s);
		visited[s] = true;
		while(queue.size()!=0){
			s = queue.poll();
			Iterator<Integer> it = adj[s].listIterator();
			while(it.hasNext()){
				int n = it.next();
				if(!visited[n]){
					visited[n] = true;
					queue.add(n);
				}
				if(n==end){
					Print(queue);
				}
			}
		}
	}
	
	void Print(LinkedList<Integer> queue){
		while(queue!=null){
			System.out.print(queue.peek());
			queue.poll();
		}
	}
	
	public static void main(String[] args){
		Graph g = new Graph(6);
		g.addEdge(1,5);
		g.addEdge(2, 1);
		g.addEdge(2, 3);
		g.addEdge(1, 4);
		g.addEdge(4, 5);
		//g.addEdge(, 3);
		g.BFS(2,5);
	}
	
}
