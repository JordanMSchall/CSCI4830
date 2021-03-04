package q1.extract_method.refactored;

import java.util.List;

class Graph {
	String name;

	public boolean contains(String p) {
		return name.contains(p);
	}
}

public class A {
	Node m1(List<Node> nodes, String p) {
		implementation(nodes, p);
		return null;
	}

	Edge m2(List<Edge> edgeList, String p) {
		implementation(edgeList, p);
		return null;
	}

	<T extends Graph> void implementation(List<T> objs, String p) {
		for (T obj : objs) {
			if (obj.contains(p))
				System.out.println(obj);
		}
	}
}

class Node extends Graph {
	String name;

	public boolean contains(String p) {
		return name.contains(p);
	}
}

class Edge extends Graph {
	String name;

	public boolean contains(String p) {
		return name.contains(p);
	}
}