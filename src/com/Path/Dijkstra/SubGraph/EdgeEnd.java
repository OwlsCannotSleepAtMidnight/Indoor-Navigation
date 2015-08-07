package com.Path.Dijkstra.SubGraph;

/**
 * Created by toy on 15-8-5.
 */
public class EdgeEnd {
    private Vertex _from;
    private Vertex _to;

    public EdgeEnd(Vertex f, Vertex t){
        _from = f;
        _to = t;
    }

    public Vertex getFrom(){
        return _from;
    }

    public Vertex getTo(){
        return _to;
    }

    public void setFrom(Vertex f){
        _from = f;
    }

    public void setTo(Vertex t){
        _to = t;
    }

    public boolean equals(EdgeEnd obj){
        return  (getFrom().equals(obj.getFrom()) && getTo().equals(obj.getTo()));
    }
    @Override
    public boolean equals(Object obj){
        return  (getFrom().equals(((EdgeEnd)obj).getFrom()) && getTo().equals(((EdgeEnd)obj).getTo()));
    }
}
