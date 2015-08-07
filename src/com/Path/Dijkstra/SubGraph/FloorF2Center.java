package com.Path.Dijkstra.SubGraph;
import com.Path.DefinedVertex.SubNumber;

import java.util.List;

/**
 * Created by toy on 4/11/15.
 */


public class FloorF2Center extends Floor {
    //ArrayList<Vertex> B1_vertex= new ArrayList();
    public FloorF2Center() {
        super();
        _sub_no = SubNumber.F2SubCenter;
    }

    protected List getEdges_() {
        return Edge.Edge_F2Center();

    }
}