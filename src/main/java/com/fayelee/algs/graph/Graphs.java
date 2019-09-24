package com.fayelee.algs.graph;

public class Graphs {
    public static int degree(Graph G, int v) {
        int degree = 0;
        for (int ignored : G.adj(v)) {
            degree++;
        }
        return degree;
    }


}
