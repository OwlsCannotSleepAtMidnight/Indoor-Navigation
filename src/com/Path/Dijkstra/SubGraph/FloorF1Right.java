package com.Path.Dijkstra.SubGraph;
import com.Path.DefinedVertex.SubNumber;

import java.util.List;

/**
 * Created by toy on 4/11/15.
 */


public class FloorF1Right extends Floor {
    //ArrayList<Vertex> B1_vertex= new ArrayList();
    public FloorF1Right() {
        super();
        _sub_no = SubNumber.F1SubRight;
    }

    protected List getEdges_() {
        return Edge.Edge_F1Right();

    }
}