package alpha.graphs;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {

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
		dfs(graph, graph[0].get(0).src, isVisited);
	}

	private static void dfs(List<Edge>[] graph, int src, boolean[] isVisited) {
		System.out.print(src + "  ");
		isVisited[src] = true;
		for (Edge e : graph[src]) {
			int dest = e.dest;
			if (!isVisited[dest]) {
				dfs(graph, dest, isVisited);
			}
		}

	}
}
