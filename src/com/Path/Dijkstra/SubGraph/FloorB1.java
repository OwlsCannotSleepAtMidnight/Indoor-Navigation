package com.Path.Dijkstra.SubGraph;
import com.Path.DefinedVertex.SubNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by toy on 4/11/15.
 */


public class FloorB1 extends Floor {
    //ArrayList<Vertex> B1_vertex= new ArrayList();
    public FloorB1()
    {
        super();
        _sub_no = SubNumber.B1Sub;
    }



    protected List getEdges_(){
        return Edge.Edge_B1();
    }


    public static void main(String[] args) {
        LoadMethod.loadAll();
        Floor f = getFloor(SubNumber.B1Sub);
        System.out.println("done");
    }



}