package com.fayelee.algs.graph;

public class Graphs {
    public static int degree(Graph G, int v) {
        int degree = 0;
        for (int ignored : G.adj(v)) {
            degree++;
        }
        return degree;
    }

    public static int maxDegree(Graph G) {
        int max = 0;
        for (int v = 0; v < G.V(); v++) {
            int cur = degree(G, v);
            if (cur > max) {
                max = cur;
            }
        }
        return max;
    }

    public static int averageDegree(Graph G) {
        return (int) 2.0 * G.E() / G.V();
    }

    public static int numberOfSelfLoops(Graph G) {
        int n = 0;
        for (int v = 0; v < G.V(); v++) {
            for (int w : G.adj(v)) {
                if (w == v) {
                    n++;
                }
            }
        }
        return n;
    }
}
