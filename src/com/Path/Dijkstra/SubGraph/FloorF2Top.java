package com.Path.Dijkstra.SubGraph;
import com.Path.DefinedVertex.SubNumber;

import java.util.List;

/**
 * Created by toy on 4/11/15.
 */


public class FloorF2Top extends Floor {
    //ArrayList<Vertex> B1_vertex= new ArrayList();
    public FloorF2Top() {
        super();
        _sub_no = SubNumber.F2SubTop;
    }

    protected List getEdges_() {
        return Edge.Edge_F2Top();

    }
}