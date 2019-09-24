package com.fayelee.algs.graph;

import edu.princeton.cs.algs4.In;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.core.Is.is;

public class TestGraph {
    private static final int EMPTY_VERTEX_NUMBER = 8;

    private Graph empty;
    private Graph graph;

    @Before
    public void setup() {
        empty = new Graph(EMPTY_VERTEX_NUMBER);
        graph = new Graph(new In(
                this.getClass().getResource("/tinyG.txt")));
    }

    @Test
    public void V() {
        assertThat(empty.V(), is(EMPTY_VERTEX_NUMBER));
        assertThat(graph.V(), is(13));
    }

    @Test
    public void E() {
        assertThat(empty.E(), is(0));
        assertThat(graph.E(), is(13));
    }

    @Test
    public void addEdge() {
        assertThat(empty.V(), is(EMPTY_VERTEX_NUMBER));
        assertThat(empty.E(), is(0));

        empty.addEdge(0, 1);
        assertThat(empty.V(), is(EMPTY_VERTEX_NUMBER));
        assertThat(empty.E(), is(1));

        empty.addEdge(1, 2);
        assertThat(empty.V(), is(EMPTY_VERTEX_NUMBER));
        assertThat(empty.E(), is(2));
    }

    @Test
    public void adj() {
        for (int v = 0; v < graph.V(); v++) {
            for (int w : graph.adj(v)) {
                assertThat(TestData.tiny.get(v), hasItem(w));
            }
        }
    }

    @Test
    public void string() {
        String sb = "13 vertices, 13 edges\n" + "0: 6 2 1 5 \n" +
                "1: 0 \n" +
                "2: 0 \n" +
                "3: 5 4 \n" +
                "4: 5 6 3 \n" +
                "5: 3 4 0 \n" +
                "6: 0 4 \n" +
                "7: 8 \n" +
                "8: 7 \n" +
                "9: 11 10 12 \n" +
                "10: 9 \n" +
                "11: 9 12 \n" +
                "12: 11 9 \n";
        assertThat(sb, is(graph.toString()));
    }
}
