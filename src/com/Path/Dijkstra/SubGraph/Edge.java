package com.Path.Dijkstra.SubGraph;

import com.Obstacle.Division;
import com.Path.DefinedVertex.*;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by toy on 4/22/15.
 */
public class Edge {
    protected String _name;
    protected EdgeEnd _ends;
    protected double _weight;

    private static Dictionary _instance = new Hashtable();
    public static String file_path = "/opt/data/";

    private static ArrayList<Edge> _sub_b1 = new ArrayList<Edge>();
    private static ArrayList<Edge> _sub_f1_left = new ArrayList<Edge>();
    private static ArrayList<Edge> _sub_f1_right = new ArrayList<Edge>();
    private static ArrayList<Edge> _sub_f1_bottom = new ArrayList<Edge>();
    private static ArrayList<Edge> _sub_f2_bottom = new ArrayList<Edge>();
    private static ArrayList<Edge> _sub_f2_center = new ArrayList<Edge>();
    private static ArrayList<Edge> _sub_f2_top = new ArrayList<Edge>();

    public static ArrayList Edge_B1(){
        return _sub_b1;
    }
    public static ArrayList Edge_F1Left(){
        return _sub_f1_left;
    }
    public static ArrayList Edge_F1Right(){
        return _sub_f1_right;
    }
    public static ArrayList Edge_F1Bottom(){
        return _sub_f1_bottom;
    }
    public static ArrayList Edge_F2Top(){
        return _sub_f2_top;
    }
    public static ArrayList Edge_F2Center(){
        return _sub_f2_center;
    }
    public static ArrayList Edge_F2Bottom(){
        return _sub_f2_bottom;
    }

    public String getName(){
        return _name;
    }

    Edge(Vertex f, Vertex t){
        _ends = new EdgeEnd(f, t);
        _weight = calculateWeight(f, t);
        _name = getName(f, t);
    }

    private static String getName(Vertex f, Vertex t){
        return f.getName()+t.getName() + String.valueOf(f.getZ());
    }
   // public void setEnds(Vertex_ f, Vertex_ t, double w){
    //    _ends.setTo(t);
    //    _ends.setFrom(f);
    //}
    public Vertex getFrom(){
        return _ends.getFrom();
    }
    public Vertex getTo(){
        return _ends.getTo();
    }
    public EdgeEnd getEnds(){
        return _ends;
    }
    public void setWeight(double w){
        _weight = w;
    }
    public double getWeight(){
        return _weight;
    }
    protected double calculateWeight(Vertex f, Vertex t) {
        if (f.getX() == t.getX())
            return Math.abs(f.getY() - t.getY());
        if (f.getY() == t.getY())
            return Math.abs(f.getX() - t.getX());
        return Math.sqrt(Math.pow(f.getX() - t.getX(), 2) + Math.pow(f.getY() - t.getY(), 2));

    }

    protected static void selectAddList(Edge edge){
        Vertex v = edge.getFrom();
        if(Division.GetSubGraphNum(v) == SubNumber.B1Sub)
            _sub_b1.add(edge);
        else if(Division.GetSubGraphNum(v) == SubNumber.F1SubLeft)
            _sub_f1_left.add(edge);
        else if(Division.GetSubGraphNum(v) == SubNumber.F1SubRight)
            _sub_f1_right.add(edge);
        else if(Division.GetSubGraphNum(v) == SubNumber.F1SubBottom)
            _sub_f1_bottom.add(edge);
        else if(Division.GetSubGraphNum(v) == SubNumber.F2SubBottom)
            _sub_f2_bottom.add(edge);
        else if(Division.GetSubGraphNum(v) == SubNumber.F2SubCenter)
            _sub_f2_center.add(edge);
        else if(Division.GetSubGraphNum(v) == SubNumber.F2SubTop)
            _sub_f2_top.add(edge);
    }

    public static void addlist(){
        Enumeration e2 = _instance.elements();
        while(e2.hasMoreElements()){
            Edge edge = (Edge)e2.nextElement();
            selectAddList(edge);
        }

    }

    public static void createBothSides(Vertex f, Vertex t){
        if(Edge.getEdge_(f, t) == null) {
            new Edge(f, t).store();
        }
        if(Edge.getEdge_(t, f) == null) {
            new Edge(t, f).store();
        }
    }

    
    public static Edge getEdge_(Vertex f, Vertex t){
        String name= getName(f, t);
        return (Edge)_instance.get(name);
    }


    public static Edge getEdge_(String name){
        return (Edge)_instance.get(name);
    }

    private void store(){
        _instance.put(this.getName(), this);
    }

    public static void loadEdge_(){
        loadEdge_B1();
        loadEdge_F1Bottom();
        loadEdge_F1Left();
        loadEdge_F1Right();
        loadEdge_F2Bottom();
        loadEdge_F2Center();
        loadEdge_F2Top();

        addlist(); // for sub graph
    }
    
    
    
    public static void loadEdge_B1(){
        LoadEdge.LoadEdges(file_path+"EdgeB1.txt");
    }

    public static void loadEdge_F1Left(){
        LoadEdge.LoadEdges(file_path+"EdgeF1left.txt");
    }
    
    public static void loadEdge_F1Right(){
        LoadEdge.LoadEdges(file_path+"EdgeF1right.txt");
    }
    
    public static void loadEdge_F1Bottom(){
        LoadEdge.LoadEdges(file_path+"EdgeF1bottom.txt");
    }
    
    public static void loadEdge_F2Bottom(){
        LoadEdge.LoadEdges(file_path+"EdgeF2bottom.txt");
    }
    
    public static void loadEdge_F2Center(){
        LoadEdge.LoadEdges(file_path+"EdgeF2center.txt");
    }
    
    public static void loadEdge_F2Top(){
        LoadEdge.LoadEdges(file_path+"EdgeF2top.txt");
    }
    public static void findFilePath(String str){
        file_path = str;
    }

    public static void main(String[] args) {
        Vertex.loadVertex_();
        loadEdge_();
        addlist();
    }
}
