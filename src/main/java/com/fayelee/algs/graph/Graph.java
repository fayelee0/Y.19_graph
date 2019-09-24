package com.fayelee.algs.graph;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.In;

public class Graph {
    private final int V;
    private int E;
    private Bag<Integer>[] adj;

    @SuppressWarnings("unchecked")
    public Graph(int V) {
        this.V = V;
        this.E = 0;

        this.adj = new Bag[V];
        for (int v = 0; v < V; v++) {
            this.adj[v] = new Bag<>();
        }
    }

    public Graph(In in) {
        this(in.readInt());

        int E = in.readInt();
        for (int i = 0; i < E; i++) {
            this.addEdge(in.readInt(), in.readInt());
        }
    }

    public int V() {
        return this.V;
    }

    public int E() {
        return this.E;
    }

    public void addEdge(int v, int w) {
        this.adj[v].add(w);
        this.adj[w].add(v);
        this.E++;
    }

    public Iterable<Integer> adj(int v) {
        return this.adj[v];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder().append(this.V).append(" vertices, ")
                .append(this.E).append(" edges\n");

        for (int v = 0; v < this.V; v++) {
            s.append(v).append(": ");
            for (int w : this.adj(v)) {
                s.append(w).append(" ");
            }
            s.append("\n");
        }

        return s.toString();
    }
}
