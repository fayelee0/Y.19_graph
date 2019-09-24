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

    @Test
    public void degreeWithMedium() {
        for (int v = 0; v < medium.V(); v++) {
            assertThat(Graphs.degree(medium, v), is(TestData.medium.get(v).size()));
        }
    }

    @Test
    public void maxDegree() {
        assertThat(Graphs.maxDegree(empty), is(0));
        assertThat(Graphs.maxDegree(tiny), is(4));
        assertThat(Graphs.maxDegree(medium), is(21));
    }

    @Test
    public void averageDegree() {
        assertThat(Graphs.averageDegree(empty), is(0));
        assertThat(Graphs.averageDegree(tiny), is(2));
        assertThat(Graphs.averageDegree(medium), is(10));
    }

    @Test
    public void numberOfSelfLoops() {
        assertThat(Graphs.numberOfSelfLoops(empty), is(0));
        assertThat(Graphs.numberOfSelfLoops(tiny), is(0));
        assertThat(Graphs.numberOfSelfLoops(medium), is(0));

        tiny.addEdge(1, 1);
        assertThat(Graphs.numberOfSelfLoops(tiny), is(1));

        tiny.addEdge(2, 2);
        assertThat(Graphs.numberOfSelfLoops(tiny), is(2));
    }
}
