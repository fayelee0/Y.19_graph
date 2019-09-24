package com.fayelee.algs.graph;

import edu.princeton.cs.algs4.In;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestGraphs {
    private Graph empty;
    private Graph tiny;
    private Graph medium;

    @Before
    public void setup() {
        empty = new Graph(8);
        tiny = new Graph(new In("/tinyG.txt"));
        medium = new Graph(new In("/mediumG.txt"));
    }

    @Test
    public void degreeWithTiny() {
        for (int v = 0; v < tiny.V(); v++) {
            assertThat(Graphs.degree(tiny, v), is(TestData.tiny.get(v).size()));
        }
    }

    @Test
    public void degreeWithEmpty() {
        for (int v = 0; v < empty.V(); v++) {
            assertThat(Graphs.degree(empty, v), is(0));
        }
    }
}
