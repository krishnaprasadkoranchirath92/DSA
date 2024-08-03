package alpha.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	static class Edge {
		int src;
		int dest;
		int wt;

		public Edge(int src, int dest, int wt) {
			super();
			this.src = src;
			this.dest = dest;
			this.wt = wt;
		}

	}

	public static void main(String[] args) {
		ArrayList<Edge>[] graph = new ArrayList[7];
		createGraph(graph);
		bfs(graph);
	}

	private static void bfs(ArrayList<Edge>[] graph) {
		Queue<Integer> q = new LinkedList<>();
		boolean visited[] = new boolean[graph.length];
		q.add(graph[0].get(0).src);
		while(!q.isEmpty()) {
			int i = q.remove();
			if(!visited[i]) {
				System.out.println(i);
				visited[i] = true;
				graph[i].forEach(e -> q.add(e.dest));
			}
			
		}
	}

	private static void createGraph(ArrayList<Edge>[] graph) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0, 1, 1));
		graph[0].add(new Edge(0, 2, 1));
		graph[1].add(new Edge(1, 0, 1));
		graph[1].add(new Edge(1, 3, 1));
		graph[2].add(new Edge(2, 0, 1));
		graph[2].add(new Edge(2, 4, 1));
		graph[3].add(new Edge(3, 1, 1));
		graph[3].add(new Edge(3, 4, 1));
		graph[3].add(new Edge(3, 5, 1));
		graph[4].add(new Edge(4, 2, 1));
		graph[4].add(new Edge(4, 3, 1));
		graph[4].add(new Edge(4, 5, 1));
		graph[5].add(new Edge(5, 3, 1));
		graph[5].add(new Edge(5, 4, 1));
		graph[5].add(new Edge(5, 6, 1));
		graph[6].add(new Edge(6, 5, 1));
	}

}
