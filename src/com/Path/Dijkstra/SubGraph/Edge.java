package com.Path.Dijkstra.SubGraph;

/**
 * Created by toy on 4/22/15.
 */
public class Edge {
    Vertex from;
    Vertex to;
    double weight;

    Edge(Vertex f,Vertex t, double w){
        SetVertex(f,t,w);
    }
    public void SetVertex(Vertex f, Vertex t, double w){
        from = f;
        to = t;
        weight = w;
    }
    public Vertex GetFrom(){
        return from;
    }
    public Vertex GetTo(){
        return to;
    }
    public Vertex[] GetVertex(){
        Vertex tmp[]= new Vertex[2];
        tmp[0]=from;
        tmp[1]=to;
        return  tmp;
    }
    public void SetWeight(double w){
        weight = w;
    }
    public double GetWeight(){
        return weight;
    }
}
