package alpha.graphs;

import java.util.ArrayList;
import java.util.List;

import alpha.graphs.DepthFirstSearch.Edge;

public class HasPath {
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
		int v = 7;
		List<Edge>[] graph = new ArrayList[v];
		createGraph(graph);
	}

	private static void createGraph(List<Edge>[] graph) {
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
		graph[5].add(new Edge(5, 4, 1));
		graph[5].add(new Edge(5, 3, 1));
		graph[5].add(new Edge(5, 6, 1));
		graph[6].add(new Edge(6, 5, 1));
		boolean[] isVisited = new boolean[graph.length];
		System.out.println(hasPath(graph, 2, 1, isVisited));
	}

	private static boolean hasPath(List<Edge>[] graph, int src, int dest, boolean[] isVisited) {
		if(src == dest) {
			return true;
		}
		isVisited[src] = true;
		System.out.print(src +" - ");
		for(Edge e : graph[src]) {
			int dst = e.dest;
			if(!isVisited[dst]) {
				return hasPath(graph, dst, dest, isVisited);
			}
		}
		return false;		
	}
}
