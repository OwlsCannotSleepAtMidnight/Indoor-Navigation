package com.Path.Dijkstra.SubGraph;

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
        createName(f, t);
    }

    private void createName(Vertex f, Vertex t){
        _name = f.getName().toString()+t.getName().toString() + String.valueOf(f.getZ());
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
        if(v.getID() instanceof B1Vertex)
            _sub_b1.add(edge);
        else if(v.getID() instanceof F1SubLeft)
            _sub_f1_left.add(edge);
        else if(v.getID() instanceof F1SubRight)
            _sub_f1_right.add(edge);
        else if(v.getID() instanceof F1SubBottom)
            _sub_f1_bottom.add(edge);
        else if(v.getID() instanceof F2SubBottom)
            _sub_f2_bottom.add(edge);
        else if(v.getID() instanceof F2SubCenter)
            _sub_f2_center.add(edge);
        else if(v.getID() instanceof F2SubTop)
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
        String name= f.getID().toString() + t.getID().toString();
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

        createBothSides(Vertex.getVertex_(B1Vertex.ES1), Vertex.getVertex_(B1Vertex.ES1EL1));
        createBothSides(Vertex.getVertex_(B1Vertex.EL1), Vertex.getVertex_(B1Vertex.D1));
        createBothSides(Vertex.getVertex_(B1Vertex.ES1EL1), Vertex.getVertex_(B1Vertex.ES1D1));
        createBothSides(Vertex.getVertex_(B1Vertex.ES1D1), Vertex.getVertex_(B1Vertex.ES1D2));
        createBothSides(Vertex.getVertex_(B1Vertex.D1), Vertex.getVertex_(B1Vertex.D2));
        createBothSides(Vertex.getVertex_(B1Vertex.ES1D2), Vertex.getVertex_(B1Vertex.ES1D3));
        createBothSides(Vertex.getVertex_(B1Vertex.D2), Vertex.getVertex_(B1Vertex.D3));
        createBothSides(Vertex.getVertex_(B1Vertex.ES1D3), Vertex.getVertex_(B1Vertex.ES2EL2));
        createBothSides(Vertex.getVertex_(B1Vertex.D3), Vertex.getVertex_(B1Vertex.EL2));
        createBothSides(Vertex.getVertex_(B1Vertex.ES2EL2), Vertex.getVertex_(B1Vertex.ES2));
        createBothSides(Vertex.getVertex_(B1Vertex.ES3EL3), Vertex.getVertex_(B1Vertex.ES3));
        createBothSides(Vertex.getVertex_(B1Vertex.ES3), Vertex.getVertex_(B1Vertex.ES3SE));
        createBothSides(Vertex.getVertex_(B1Vertex.ES3SE), Vertex.getVertex_(B1Vertex.ES3D2));

        createBothSides(Vertex.getVertex_(B1Vertex.ES3D2), Vertex.getVertex_(B1Vertex.ES4SW));
        createBothSides(Vertex.getVertex_(B1Vertex.ES4SW), Vertex.getVertex_(B1Vertex.ES4));

        createBothSides(Vertex.getVertex_(B1Vertex.ES4), Vertex.getVertex_(B1Vertex.ES4EL4));
        createBothSides(Vertex.getVertex_(B1Vertex.ES1NW), Vertex.getVertex_(B1Vertex.ES1));
        createBothSides(Vertex.getVertex_(B1Vertex.ES2NE), Vertex.getVertex_(B1Vertex.ES2));

        createBothSides(Vertex.getVertex_(B1Vertex.EL1), Vertex.getVertex_(B1Vertex.ES1EL1));
        createBothSides(Vertex.getVertex_(B1Vertex.EL3), Vertex.getVertex_(B1Vertex.ES3EL3));
        createBothSides(Vertex.getVertex_(B1Vertex.ES3EL3), Vertex.getVertex_(B1Vertex.ES1D1));
        createBothSides(Vertex.getVertex_(B1Vertex.ES1D1), Vertex.getVertex_(B1Vertex.D1));
        createBothSides(Vertex.getVertex_(B1Vertex.ES3D2), Vertex.getVertex_(B1Vertex.ES1D2));
        createBothSides(Vertex.getVertex_(B1Vertex.ES1D2), Vertex.getVertex_(B1Vertex.D2));
        createBothSides(Vertex.getVertex_(B1Vertex.EL4), Vertex.getVertex_(B1Vertex.ES4EL4));
        createBothSides(Vertex.getVertex_(B1Vertex.ES4EL4), Vertex.getVertex_(B1Vertex.ES1D3));
        createBothSides(Vertex.getVertex_(B1Vertex.ES1D3), Vertex.getVertex_(B1Vertex.D3));
        createBothSides(Vertex.getVertex_(B1Vertex.ES2EL2), Vertex.getVertex_(B1Vertex.EL2));


        createBothSides(Vertex.getVertex_(B1Vertex.ES1NW), Vertex.getVertex_(B1Vertex.ES1SW));
        createBothSides(Vertex.getVertex_(B1Vertex.ES4NW), Vertex.getVertex_(B1Vertex.ES4SW));
        createBothSides(Vertex.getVertex_(B1Vertex.ES2NE), Vertex.getVertex_(B1Vertex.ES2SE));
        createBothSides(Vertex.getVertex_(B1Vertex.ES3NE), Vertex.getVertex_(B1Vertex.ES3SE));

    }

    public static void loadEdge_F1Left(){

        //basic edges added
        createBothSides(Vertex.getVertex_(F1SubLeft.A), Vertex.getVertex_(F1SubLeft.B));
        createBothSides(Vertex.getVertex_(F1SubLeft.A), Vertex.getVertex_(F1SubLeft.WT7));
        createBothSides(Vertex.getVertex_(F1SubLeft.A), Vertex.getVertex_(F1SubLeft.WT9));
        createBothSides(Vertex.getVertex_(F1SubLeft.A1), Vertex.getVertex_(F1SubLeft.B2));
        createBothSides(Vertex.getVertex_(F1SubLeft.A1), Vertex.getVertex_(F1SubLeft.C1));
        createBothSides(Vertex.getVertex_(F1SubLeft.B), Vertex.getVertex_(F1SubLeft.ES7));
        createBothSides(Vertex.getVertex_(F1SubLeft.B), Vertex.getVertex_(F1SubLeft.J));
        createBothSides(Vertex.getVertex_(F1SubLeft.B), Vertex.getVertex_(F1SubLeft.W7));
        createBothSides(Vertex.getVertex_(F1SubLeft.B1), Vertex.getVertex_(F1SubLeft.B2));
        createBothSides(Vertex.getVertex_(F1SubLeft.B1), Vertex.getVertex_(F1SubLeft.X));
        createBothSides(Vertex.getVertex_(F1SubLeft.B2), Vertex.getVertex_(F1SubLeft.A1));
        createBothSides(Vertex.getVertex_(F1SubLeft.B3), Vertex.getVertex_(F1SubLeft.J1));
        createBothSides(Vertex.getVertex_(F1SubLeft.B3), Vertex.getVertex_(F1SubLeft.L1));
        createBothSides(Vertex.getVertex_(F1SubLeft.C), Vertex.getVertex_(F1SubLeft.D));
        createBothSides(Vertex.getVertex_(F1SubLeft.C), Vertex.getVertex_(F1SubLeft.EL7));
        createBothSides(Vertex.getVertex_(F1SubLeft.C), Vertex.getVertex_(F1SubLeft.F4));
        createBothSides(Vertex.getVertex_(F1SubLeft.C1), Vertex.getVertex_(F1SubLeft.b1));
        createBothSides(Vertex.getVertex_(F1SubLeft.C1), Vertex.getVertex_(F1SubLeft.d1));
        createBothSides(Vertex.getVertex_(F1SubLeft.D), Vertex.getVertex_(F1SubLeft.E));
        createBothSides(Vertex.getVertex_(F1SubLeft.D), Vertex.getVertex_(F1SubLeft.E7));
        createBothSides(Vertex.getVertex_(F1SubLeft.E), Vertex.getVertex_(F1SubLeft.E8));
        createBothSides(Vertex.getVertex_(F1SubLeft.E), Vertex.getVertex_(F1SubLeft.F));
        createBothSides(Vertex.getVertex_(F1SubLeft.E1), Vertex.getVertex_(F1SubLeft.W));
        createBothSides(Vertex.getVertex_(F1SubLeft.E2), Vertex.getVertex_(F1SubLeft.E3));
        createBothSides(Vertex.getVertex_(F1SubLeft.E2), Vertex.getVertex_(F1SubLeft.S));
        createBothSides(Vertex.getVertex_(F1SubLeft.E3), Vertex.getVertex_(F1SubLeft.E2));
        createBothSides(Vertex.getVertex_(F1SubLeft.E3), Vertex.getVertex_(F1SubLeft.E4));
        createBothSides(Vertex.getVertex_(F1SubLeft.E3), Vertex.getVertex_(F1SubLeft.Q));
        createBothSides(Vertex.getVertex_(F1SubLeft.E4), Vertex.getVertex_(F1SubLeft.E3));
        createBothSides(Vertex.getVertex_(F1SubLeft.E4), Vertex.getVertex_(F1SubLeft.O));
        createBothSides(Vertex.getVertex_(F1SubLeft.E5), Vertex.getVertex_(F1SubLeft.E6));
        createBothSides(Vertex.getVertex_(F1SubLeft.E6), Vertex.getVertex_(F1SubLeft.E5));
        createBothSides(Vertex.getVertex_(F1SubLeft.E6), Vertex.getVertex_(F1SubLeft.J));
        createBothSides(Vertex.getVertex_(F1SubLeft.E7), Vertex.getVertex_(F1SubLeft.D));
        createBothSides(Vertex.getVertex_(F1SubLeft.E7), Vertex.getVertex_(F1SubLeft.E8));
        createBothSides(Vertex.getVertex_(F1SubLeft.E8), Vertex.getVertex_(F1SubLeft.E));
        createBothSides(Vertex.getVertex_(F1SubLeft.E9), Vertex.getVertex_(F1SubLeft.H));
        createBothSides(Vertex.getVertex_(F1SubLeft.EL5), Vertex.getVertex_(F1SubLeft.F1));
        createBothSides(Vertex.getVertex_(F1SubLeft.EL7), Vertex.getVertex_(F1SubLeft.C));
        createBothSides(Vertex.getVertex_(F1SubLeft.EL7), Vertex.getVertex_(F1SubLeft.WT11));
        createBothSides(Vertex.getVertex_(F1SubLeft.ES5), Vertex.getVertex_(F1SubLeft.G1));
        createBothSides(Vertex.getVertex_(F1SubLeft.ES5), Vertex.getVertex_(F1SubLeft.e1));
        createBothSides(Vertex.getVertex_(F1SubLeft.ES7), Vertex.getVertex_(F1SubLeft.C));
        createBothSides(Vertex.getVertex_(F1SubLeft.F), Vertex.getVertex_(F1SubLeft.G));
        createBothSides(Vertex.getVertex_(F1SubLeft.F), Vertex.getVertex_(F1SubLeft.I1));
        createBothSides(Vertex.getVertex_(F1SubLeft.F1), Vertex.getVertex_(F1SubLeft.EL5));
        createBothSides(Vertex.getVertex_(F1SubLeft.F1), Vertex.getVertex_(F1SubLeft.ES5));
        createBothSides(Vertex.getVertex_(F1SubLeft.F4), Vertex.getVertex_(F1SubLeft.C));
        createBothSides(Vertex.getVertex_(F1SubLeft.F4), Vertex.getVertex_(F1SubLeft.H4));
        createBothSides(Vertex.getVertex_(F1SubLeft.F4), Vertex.getVertex_(F1SubLeft.X));
        createBothSides(Vertex.getVertex_(F1SubLeft.G), Vertex.getVertex_(F1SubLeft.H));
        createBothSides(Vertex.getVertex_(F1SubLeft.G), Vertex.getVertex_(F1SubLeft.WT11));
        createBothSides(Vertex.getVertex_(F1SubLeft.G1), Vertex.getVertex_(F1SubLeft.ES5));
        createBothSides(Vertex.getVertex_(F1SubLeft.G1), Vertex.getVertex_(F1SubLeft.H1));
        createBothSides(Vertex.getVertex_(F1SubLeft.G1), Vertex.getVertex_(F1SubLeft.S33));
        createBothSides(Vertex.getVertex_(F1SubLeft.H), Vertex.getVertex_(F1SubLeft.E9));
        createBothSides(Vertex.getVertex_(F1SubLeft.H), Vertex.getVertex_(F1SubLeft.I));
        createBothSides(Vertex.getVertex_(F1SubLeft.H1), Vertex.getVertex_(F1SubLeft.G1));
        createBothSides(Vertex.getVertex_(F1SubLeft.H1), Vertex.getVertex_(F1SubLeft.I1));
        createBothSides(Vertex.getVertex_(F1SubLeft.H1), Vertex.getVertex_(F1SubLeft.S32));
        createBothSides(Vertex.getVertex_(F1SubLeft.H4), Vertex.getVertex_(F1SubLeft.F4));
        createBothSides(Vertex.getVertex_(F1SubLeft.H4), Vertex.getVertex_(F1SubLeft.Z));
        createBothSides(Vertex.getVertex_(F1SubLeft.I1), Vertex.getVertex_(F1SubLeft.F));
        createBothSides(Vertex.getVertex_(F1SubLeft.I1), Vertex.getVertex_(F1SubLeft.H1));
        createBothSides(Vertex.getVertex_(F1SubLeft.I1), Vertex.getVertex_(F1SubLeft.S31));
        createBothSides(Vertex.getVertex_(F1SubLeft.J), Vertex.getVertex_(F1SubLeft.B));
        createBothSides(Vertex.getVertex_(F1SubLeft.J), Vertex.getVertex_(F1SubLeft.K));
        createBothSides(Vertex.getVertex_(F1SubLeft.J1), Vertex.getVertex_(F1SubLeft.B3));
        createBothSides(Vertex.getVertex_(F1SubLeft.J1), Vertex.getVertex_(F1SubLeft.K1));
        createBothSides(Vertex.getVertex_(F1SubLeft.J1), Vertex.getVertex_(F1SubLeft.S33));
        createBothSides(Vertex.getVertex_(F1SubLeft.K), Vertex.getVertex_(F1SubLeft.J));
        createBothSides(Vertex.getVertex_(F1SubLeft.K), Vertex.getVertex_(F1SubLeft.L));
        createBothSides(Vertex.getVertex_(F1SubLeft.K), Vertex.getVertex_(F1SubLeft.S25));
        createBothSides(Vertex.getVertex_(F1SubLeft.K1), Vertex.getVertex_(F1SubLeft.L1));
        createBothSides(Vertex.getVertex_(F1SubLeft.L), Vertex.getVertex_(F1SubLeft.K));
        createBothSides(Vertex.getVertex_(F1SubLeft.L), Vertex.getVertex_(F1SubLeft.M));
        createBothSides(Vertex.getVertex_(F1SubLeft.L), Vertex.getVertex_(F1SubLeft.S26));
        createBothSides(Vertex.getVertex_(F1SubLeft.L1), Vertex.getVertex_(F1SubLeft.K1));
        createBothSides(Vertex.getVertex_(F1SubLeft.L1), Vertex.getVertex_(F1SubLeft.M1));
        createBothSides(Vertex.getVertex_(F1SubLeft.M), Vertex.getVertex_(F1SubLeft.L));
        createBothSides(Vertex.getVertex_(F1SubLeft.M), Vertex.getVertex_(F1SubLeft.N));
        createBothSides(Vertex.getVertex_(F1SubLeft.M), Vertex.getVertex_(F1SubLeft.S27));
        createBothSides(Vertex.getVertex_(F1SubLeft.M1), Vertex.getVertex_(F1SubLeft.L1));
        createBothSides(Vertex.getVertex_(F1SubLeft.M1), Vertex.getVertex_(F1SubLeft.Z3));
        createBothSides(Vertex.getVertex_(F1SubLeft.N), Vertex.getVertex_(F1SubLeft.M));
        createBothSides(Vertex.getVertex_(F1SubLeft.N), Vertex.getVertex_(F1SubLeft.O));
        createBothSides(Vertex.getVertex_(F1SubLeft.O), Vertex.getVertex_(F1SubLeft.N));
        createBothSides(Vertex.getVertex_(F1SubLeft.O), Vertex.getVertex_(F1SubLeft.P));
        createBothSides(Vertex.getVertex_(F1SubLeft.P), Vertex.getVertex_(F1SubLeft.F4));
        createBothSides(Vertex.getVertex_(F1SubLeft.P), Vertex.getVertex_(F1SubLeft.O));
        createBothSides(Vertex.getVertex_(F1SubLeft.P), Vertex.getVertex_(F1SubLeft.Q));
        createBothSides(Vertex.getVertex_(F1SubLeft.Q), Vertex.getVertex_(F1SubLeft.P));
        createBothSides(Vertex.getVertex_(F1SubLeft.Q), Vertex.getVertex_(F1SubLeft.R));
        createBothSides(Vertex.getVertex_(F1SubLeft.R), Vertex.getVertex_(F1SubLeft.H4));
        createBothSides(Vertex.getVertex_(F1SubLeft.R), Vertex.getVertex_(F1SubLeft.Q));
        createBothSides(Vertex.getVertex_(F1SubLeft.R), Vertex.getVertex_(F1SubLeft.S));
        createBothSides(Vertex.getVertex_(F1SubLeft.S), Vertex.getVertex_(F1SubLeft.R));
        createBothSides(Vertex.getVertex_(F1SubLeft.S), Vertex.getVertex_(F1SubLeft.T));
        createBothSides(Vertex.getVertex_(F1SubLeft.S17), Vertex.getVertex_(F1SubLeft.S18));
        createBothSides(Vertex.getVertex_(F1SubLeft.S18), Vertex.getVertex_(F1SubLeft.S17));
        createBothSides(Vertex.getVertex_(F1SubLeft.S18), Vertex.getVertex_(F1SubLeft.S19));
        createBothSides(Vertex.getVertex_(F1SubLeft.S19), Vertex.getVertex_(F1SubLeft.S18));
        createBothSides(Vertex.getVertex_(F1SubLeft.S25), Vertex.getVertex_(F1SubLeft.S26));
        createBothSides(Vertex.getVertex_(F1SubLeft.S26), Vertex.getVertex_(F1SubLeft.S25));
        createBothSides(Vertex.getVertex_(F1SubLeft.S26), Vertex.getVertex_(F1SubLeft.S27));
        createBothSides(Vertex.getVertex_(F1SubLeft.S27), Vertex.getVertex_(F1SubLeft.S26));
        createBothSides(Vertex.getVertex_(F1SubLeft.S28), Vertex.getVertex_(F1SubLeft.I1));
        createBothSides(Vertex.getVertex_(F1SubLeft.S28), Vertex.getVertex_(F1SubLeft.S29));
        createBothSides(Vertex.getVertex_(F1SubLeft.S29), Vertex.getVertex_(F1SubLeft.H1));
        createBothSides(Vertex.getVertex_(F1SubLeft.S29), Vertex.getVertex_(F1SubLeft.S28));
        createBothSides(Vertex.getVertex_(F1SubLeft.S29), Vertex.getVertex_(F1SubLeft.S30));
        createBothSides(Vertex.getVertex_(F1SubLeft.S30), Vertex.getVertex_(F1SubLeft.G1));
        createBothSides(Vertex.getVertex_(F1SubLeft.S30), Vertex.getVertex_(F1SubLeft.S29));
        createBothSides(Vertex.getVertex_(F1SubLeft.S31), Vertex.getVertex_(F1SubLeft.S32));
        createBothSides(Vertex.getVertex_(F1SubLeft.S32), Vertex.getVertex_(F1SubLeft.S31));
        createBothSides(Vertex.getVertex_(F1SubLeft.S32), Vertex.getVertex_(F1SubLeft.S33));
        createBothSides(Vertex.getVertex_(F1SubLeft.S33), Vertex.getVertex_(F1SubLeft.J1));
        createBothSides(Vertex.getVertex_(F1SubLeft.S33), Vertex.getVertex_(F1SubLeft.S32));
        createBothSides(Vertex.getVertex_(F1SubLeft.T), Vertex.getVertex_(F1SubLeft.S));
        createBothSides(Vertex.getVertex_(F1SubLeft.T), Vertex.getVertex_(F1SubLeft.S17));
        createBothSides(Vertex.getVertex_(F1SubLeft.T), Vertex.getVertex_(F1SubLeft.U));
        createBothSides(Vertex.getVertex_(F1SubLeft.U), Vertex.getVertex_(F1SubLeft.S18));
        createBothSides(Vertex.getVertex_(F1SubLeft.U), Vertex.getVertex_(F1SubLeft.T));
        createBothSides(Vertex.getVertex_(F1SubLeft.U), Vertex.getVertex_(F1SubLeft.V));
        createBothSides(Vertex.getVertex_(F1SubLeft.V), Vertex.getVertex_(F1SubLeft.S19));
        createBothSides(Vertex.getVertex_(F1SubLeft.V), Vertex.getVertex_(F1SubLeft.U));
        createBothSides(Vertex.getVertex_(F1SubLeft.V), Vertex.getVertex_(F1SubLeft.W));
        createBothSides(Vertex.getVertex_(F1SubLeft.W), Vertex.getVertex_(F1SubLeft.V));
        createBothSides(Vertex.getVertex_(F1SubLeft.W), Vertex.getVertex_(F1SubLeft.W3));
        createBothSides(Vertex.getVertex_(F1SubLeft.W3), Vertex.getVertex_(F1SubLeft.W));
        createBothSides(Vertex.getVertex_(F1SubLeft.W7), Vertex.getVertex_(F1SubLeft.B));
        createBothSides(Vertex.getVertex_(F1SubLeft.WT11), Vertex.getVertex_(F1SubLeft.G));
        createBothSides(Vertex.getVertex_(F1SubLeft.WT3), Vertex.getVertex_(F1SubLeft.WT7));
        createBothSides(Vertex.getVertex_(F1SubLeft.WT7), Vertex.getVertex_(F1SubLeft.A));
        createBothSides(Vertex.getVertex_(F1SubLeft.WT7), Vertex.getVertex_(F1SubLeft.N));
        createBothSides(Vertex.getVertex_(F1SubLeft.WT7), Vertex.getVertex_(F1SubLeft.WT3));
        createBothSides(Vertex.getVertex_(F1SubLeft.WT9), Vertex.getVertex_(F1SubLeft.A));
        createBothSides(Vertex.getVertex_(F1SubLeft.WT9), Vertex.getVertex_(F1SubLeft.W7));
        createBothSides(Vertex.getVertex_(F1SubLeft.X), Vertex.getVertex_(F1SubLeft.B1));
        createBothSides(Vertex.getVertex_(F1SubLeft.X), Vertex.getVertex_(F1SubLeft.Y));
        createBothSides(Vertex.getVertex_(F1SubLeft.Y), Vertex.getVertex_(F1SubLeft.A1));
        createBothSides(Vertex.getVertex_(F1SubLeft.Y), Vertex.getVertex_(F1SubLeft.Z));
        createBothSides(Vertex.getVertex_(F1SubLeft.Z), Vertex.getVertex_(F1SubLeft.Y));
        createBothSides(Vertex.getVertex_(F1SubLeft.Z), Vertex.getVertex_(F1SubLeft.b1));
        createBothSides(Vertex.getVertex_(F1SubLeft.Z3), Vertex.getVertex_(F1SubLeft.M1));
        createBothSides(Vertex.getVertex_(F1SubLeft.b1), Vertex.getVertex_(F1SubLeft.C1));
        createBothSides(Vertex.getVertex_(F1SubLeft.b1), Vertex.getVertex_(F1SubLeft.M1));
        createBothSides(Vertex.getVertex_(F1SubLeft.d1), Vertex.getVertex_(F1SubLeft.B3));
        createBothSides(Vertex.getVertex_(F1SubLeft.d1), Vertex.getVertex_(F1SubLeft.C1));
        createBothSides(Vertex.getVertex_(F1SubLeft.d1), Vertex.getVertex_(F1SubLeft.e1));
        createBothSides(Vertex.getVertex_(F1SubLeft.e1), Vertex.getVertex_(F1SubLeft.J1));
        createBothSides(Vertex.getVertex_(F1SubLeft.e1), Vertex.getVertex_(F1SubLeft.d1));


        //extend edges added

        createBothSides(Vertex.getVertex_(F1SubLeft.LE1), Vertex.getVertex_(F1SubLeft.S17));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE1), Vertex.getVertex_(F1SubLeft.R));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE1), Vertex.getVertex_(F1SubLeft.H4));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE2), Vertex.getVertex_(F1SubLeft.b1));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE2), Vertex.getVertex_(F1SubLeft.C1));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE2), Vertex.getVertex_(F1SubLeft.EBP1));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE3), Vertex.getVertex_(F1SubLeft.N));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE3), Vertex.getVertex_(F1SubLeft.M));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE3), Vertex.getVertex_(F1SubLeft.LE4));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE4), Vertex.getVertex_(F1SubLeft.F4));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE4), Vertex.getVertex_(F1SubLeft.S27));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE4), Vertex.getVertex_(F1SubLeft.LE6));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE6), Vertex.getVertex_(F1SubLeft.X));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE6), Vertex.getVertex_(F1SubLeft.LE7));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE7), Vertex.getVertex_(F1SubLeft.Y));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE7), Vertex.getVertex_(F1SubLeft.F1));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE8), Vertex.getVertex_(F1SubLeft.C));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE8), Vertex.getVertex_(F1SubLeft.S25));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE8), Vertex.getVertex_(F1SubLeft.D));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE9), Vertex.getVertex_(F1SubLeft.S28));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE9), Vertex.getVertex_(F1SubLeft.D));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE9), Vertex.getVertex_(F1SubLeft.E));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE10), Vertex.getVertex_(F1SubLeft.I1));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE10), Vertex.getVertex_(F1SubLeft.F));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE10), Vertex.getVertex_(F1SubLeft.LE11));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE11), Vertex.getVertex_(F1SubLeft.S31));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE11), Vertex.getVertex_(F1SubLeft.LE12));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE11), Vertex.getVertex_(F1SubLeft.EBP2));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE12), Vertex.getVertex_(F1SubLeft.H));
        createBothSides(Vertex.getVertex_(F1SubLeft.LE12), Vertex.getVertex_(F1SubLeft.I));





    }
    
    public static void loadEdge_F1Right(){


        //basic edges added

        createBothSides(Vertex.getVertex_(F1SubRight.A2), Vertex.getVertex_(F1SubRight.Z1));
        createBothSides(Vertex.getVertex_(F1SubRight.A2), Vertex.getVertex_(F1SubRight.b2));
        createBothSides(Vertex.getVertex_(F1SubRight.B4), Vertex.getVertex_(F1SubRight.N1));
        createBothSides(Vertex.getVertex_(F1SubRight.B4), Vertex.getVertex_(F1SubRight.P1));
        createBothSides(Vertex.getVertex_(F1SubRight.B5), Vertex.getVertex_(F1SubRight.B6));
        createBothSides(Vertex.getVertex_(F1SubRight.B5), Vertex.getVertex_(F1SubRight.J4));
        createBothSides(Vertex.getVertex_(F1SubRight.B6), Vertex.getVertex_(F1SubRight.d2));
        createBothSides(Vertex.getVertex_(F1SubRight.C2), Vertex.getVertex_(F1SubRight.A2));
        createBothSides(Vertex.getVertex_(F1SubRight.C2), Vertex.getVertex_(F1SubRight.M2));
        createBothSides(Vertex.getVertex_(F1SubRight.C2), Vertex.getVertex_(F1SubRight.s1));
        createBothSides(Vertex.getVertex_(F1SubRight.E10), Vertex.getVertex_(F1SubRight.U2));
        createBothSides(Vertex.getVertex_(F1SubRight.E11), Vertex.getVertex_(F1SubRight.E12));
        createBothSides(Vertex.getVertex_(F1SubRight.E11), Vertex.getVertex_(F1SubRight.O2));
        createBothSides(Vertex.getVertex_(F1SubRight.E12), Vertex.getVertex_(F1SubRight.N2));
        createBothSides(Vertex.getVertex_(F1SubRight.E13), Vertex.getVertex_(F1SubRight.E14));
        createBothSides(Vertex.getVertex_(F1SubRight.E14), Vertex.getVertex_(F1SubRight.E13));
        createBothSides(Vertex.getVertex_(F1SubRight.E15), Vertex.getVertex_(F1SubRight.E16));
        createBothSides(Vertex.getVertex_(F1SubRight.E16), Vertex.getVertex_(F1SubRight.E15));
        createBothSides(Vertex.getVertex_(F1SubRight.E16), Vertex.getVertex_(F1SubRight.E17));
        createBothSides(Vertex.getVertex_(F1SubRight.E17), Vertex.getVertex_(F1SubRight.E16));
        createBothSides(Vertex.getVertex_(F1SubRight.E18), Vertex.getVertex_(F1SubRight.E17));
        createBothSides(Vertex.getVertex_(F1SubRight.EL6), Vertex.getVertex_(F1SubRight.K4));
        createBothSides(Vertex.getVertex_(F1SubRight.EL8), Vertex.getVertex_(F1SubRight.M2));
        createBothSides(Vertex.getVertex_(F1SubRight.ES6), Vertex.getVertex_(F1SubRight.K4));
        createBothSides(Vertex.getVertex_(F1SubRight.ES6), Vertex.getVertex_(F1SubRight.s2));
        createBothSides(Vertex.getVertex_(F1SubRight.ES8), Vertex.getVertex_(F1SubRight.L2));
        createBothSides(Vertex.getVertex_(F1SubRight.F2), Vertex.getVertex_(F1SubRight.G2));
        createBothSides(Vertex.getVertex_(F1SubRight.F2), Vertex.getVertex_(F1SubRight.WT8));
        createBothSides(Vertex.getVertex_(F1SubRight.F2), Vertex.getVertex_(F1SubRight.b2));
        createBothSides(Vertex.getVertex_(F1SubRight.G2), Vertex.getVertex_(F1SubRight.E14));
        createBothSides(Vertex.getVertex_(F1SubRight.G2), Vertex.getVertex_(F1SubRight.F2));
        createBothSides(Vertex.getVertex_(F1SubRight.G2), Vertex.getVertex_(F1SubRight.H2));
        createBothSides(Vertex.getVertex_(F1SubRight.H2), Vertex.getVertex_(F1SubRight.G2));
        createBothSides(Vertex.getVertex_(F1SubRight.H2), Vertex.getVertex_(F1SubRight.I2));
        createBothSides(Vertex.getVertex_(F1SubRight.I), Vertex.getVertex_(F1SubRight.U2));
        createBothSides(Vertex.getVertex_(F1SubRight.I2), Vertex.getVertex_(F1SubRight.H2));
        createBothSides(Vertex.getVertex_(F1SubRight.I2), Vertex.getVertex_(F1SubRight.J2));
        createBothSides(Vertex.getVertex_(F1SubRight.I4), Vertex.getVertex_(F1SubRight.J4));
        createBothSides(Vertex.getVertex_(F1SubRight.I4), Vertex.getVertex_(F1SubRight.P1));
        createBothSides(Vertex.getVertex_(F1SubRight.I4), Vertex.getVertex_(F1SubRight.q1));
        createBothSides(Vertex.getVertex_(F1SubRight.J2), Vertex.getVertex_(F1SubRight.E13));
        createBothSides(Vertex.getVertex_(F1SubRight.J2), Vertex.getVertex_(F1SubRight.I2));
        createBothSides(Vertex.getVertex_(F1SubRight.J2), Vertex.getVertex_(F1SubRight.L2));
        createBothSides(Vertex.getVertex_(F1SubRight.J4), Vertex.getVertex_(F1SubRight.B5));
        createBothSides(Vertex.getVertex_(F1SubRight.J4), Vertex.getVertex_(F1SubRight.e2));
        createBothSides(Vertex.getVertex_(F1SubRight.K1), Vertex.getVertex_(F1SubRight.L1));
        createBothSides(Vertex.getVertex_(F1SubRight.K1), Vertex.getVertex_(F1SubRight.N1));
        createBothSides(Vertex.getVertex_(F1SubRight.K2), Vertex.getVertex_(F1SubRight.WT10));
        createBothSides(Vertex.getVertex_(F1SubRight.K2), Vertex.getVertex_(F1SubRight.WT8));
        createBothSides(Vertex.getVertex_(F1SubRight.K4), Vertex.getVertex_(F1SubRight.EL6));
        createBothSides(Vertex.getVertex_(F1SubRight.L1), Vertex.getVertex_(F1SubRight.B4));
        createBothSides(Vertex.getVertex_(F1SubRight.L1), Vertex.getVertex_(F1SubRight.K1));
        createBothSides(Vertex.getVertex_(F1SubRight.L1), Vertex.getVertex_(F1SubRight.M1));
        createBothSides(Vertex.getVertex_(F1SubRight.L2), Vertex.getVertex_(F1SubRight.J2));
        createBothSides(Vertex.getVertex_(F1SubRight.L2), Vertex.getVertex_(F1SubRight.K2));
        createBothSides(Vertex.getVertex_(F1SubRight.L2), Vertex.getVertex_(F1SubRight.W8));
        createBothSides(Vertex.getVertex_(F1SubRight.M1), Vertex.getVertex_(F1SubRight.L1));
        createBothSides(Vertex.getVertex_(F1SubRight.M1), Vertex.getVertex_(F1SubRight.q1));

        createBothSides(Vertex.getVertex_(F1SubRight.M2), Vertex.getVertex_(F1SubRight.C2));
        createBothSides(Vertex.getVertex_(F1SubRight.M2), Vertex.getVertex_(F1SubRight.EL8));
        createBothSides(Vertex.getVertex_(F1SubRight.M2), Vertex.getVertex_(F1SubRight.ES8));
        createBothSides(Vertex.getVertex_(F1SubRight.N1), Vertex.getVertex_(F1SubRight.B4));
        createBothSides(Vertex.getVertex_(F1SubRight.N1), Vertex.getVertex_(F1SubRight.O1));
        createBothSides(Vertex.getVertex_(F1SubRight.N2), Vertex.getVertex_(F1SubRight.E12));
        createBothSides(Vertex.getVertex_(F1SubRight.N2), Vertex.getVertex_(F1SubRight.M2));
        createBothSides(Vertex.getVertex_(F1SubRight.O1), Vertex.getVertex_(F1SubRight.ES6));
        createBothSides(Vertex.getVertex_(F1SubRight.O1), Vertex.getVertex_(F1SubRight.P1));
        createBothSides(Vertex.getVertex_(F1SubRight.O2), Vertex.getVertex_(F1SubRight.E11));
        createBothSides(Vertex.getVertex_(F1SubRight.O2), Vertex.getVertex_(F1SubRight.N2));
        createBothSides(Vertex.getVertex_(F1SubRight.P1), Vertex.getVertex_(F1SubRight.I4));
        createBothSides(Vertex.getVertex_(F1SubRight.P1), Vertex.getVertex_(F1SubRight.O1));
        createBothSides(Vertex.getVertex_(F1SubRight.P2), Vertex.getVertex_(F1SubRight.O2));
        createBothSides(Vertex.getVertex_(F1SubRight.P2), Vertex.getVertex_(F1SubRight.q2));
        createBothSides(Vertex.getVertex_(F1SubRight.R1), Vertex.getVertex_(F1SubRight.e2));
        createBothSides(Vertex.getVertex_(F1SubRight.R1), Vertex.getVertex_(F1SubRight.s1));
        createBothSides(Vertex.getVertex_(F1SubRight.R2), Vertex.getVertex_(F1SubRight.S38));
        createBothSides(Vertex.getVertex_(F1SubRight.R2), Vertex.getVertex_(F1SubRight.q2));
        createBothSides(Vertex.getVertex_(F1SubRight.R2), Vertex.getVertex_(F1SubRight.s2));
        createBothSides(Vertex.getVertex_(F1SubRight.S21), Vertex.getVertex_(F1SubRight.S22));
        createBothSides(Vertex.getVertex_(F1SubRight.S21), Vertex.getVertex_(F1SubRight.V1));
        createBothSides(Vertex.getVertex_(F1SubRight.S22), Vertex.getVertex_(F1SubRight.S21));
        createBothSides(Vertex.getVertex_(F1SubRight.S22), Vertex.getVertex_(F1SubRight.S23));
        createBothSides(Vertex.getVertex_(F1SubRight.S22), Vertex.getVertex_(F1SubRight.w1));
        createBothSides(Vertex.getVertex_(F1SubRight.S23), Vertex.getVertex_(F1SubRight.S22));
        createBothSides(Vertex.getVertex_(F1SubRight.S23), Vertex.getVertex_(F1SubRight.X1));
        createBothSides(Vertex.getVertex_(F1SubRight.S34), Vertex.getVertex_(F1SubRight.S35));
        createBothSides(Vertex.getVertex_(F1SubRight.S34), Vertex.getVertex_(F1SubRight.q2));
        createBothSides(Vertex.getVertex_(F1SubRight.S35), Vertex.getVertex_(F1SubRight.R2));
        createBothSides(Vertex.getVertex_(F1SubRight.S35), Vertex.getVertex_(F1SubRight.S34));
        createBothSides(Vertex.getVertex_(F1SubRight.S35), Vertex.getVertex_(F1SubRight.S36));
        createBothSides(Vertex.getVertex_(F1SubRight.S36), Vertex.getVertex_(F1SubRight.S35));
        createBothSides(Vertex.getVertex_(F1SubRight.S36), Vertex.getVertex_(F1SubRight.s2));
        createBothSides(Vertex.getVertex_(F1SubRight.S37), Vertex.getVertex_(F1SubRight.S38));
        createBothSides(Vertex.getVertex_(F1SubRight.S38), Vertex.getVertex_(F1SubRight.S37));
        createBothSides(Vertex.getVertex_(F1SubRight.S38), Vertex.getVertex_(F1SubRight.S39));
        createBothSides(Vertex.getVertex_(F1SubRight.S39), Vertex.getVertex_(F1SubRight.S38));
        createBothSides(Vertex.getVertex_(F1SubRight.S40), Vertex.getVertex_(F1SubRight.I2));
        createBothSides(Vertex.getVertex_(F1SubRight.S40), Vertex.getVertex_(F1SubRight.S41));
        createBothSides(Vertex.getVertex_(F1SubRight.S41), Vertex.getVertex_(F1SubRight.H2));
        createBothSides(Vertex.getVertex_(F1SubRight.S41), Vertex.getVertex_(F1SubRight.S40));
        createBothSides(Vertex.getVertex_(F1SubRight.S41), Vertex.getVertex_(F1SubRight.S42));
        createBothSides(Vertex.getVertex_(F1SubRight.S42), Vertex.getVertex_(F1SubRight.G2));
        createBothSides(Vertex.getVertex_(F1SubRight.S42), Vertex.getVertex_(F1SubRight.S41));
        createBothSides(Vertex.getVertex_(F1SubRight.T1), Vertex.getVertex_(F1SubRight.U1));
        createBothSides(Vertex.getVertex_(F1SubRight.T1), Vertex.getVertex_(F1SubRight.Z1));
        createBothSides(Vertex.getVertex_(F1SubRight.T2), Vertex.getVertex_(F1SubRight.P2));
        createBothSides(Vertex.getVertex_(F1SubRight.T2), Vertex.getVertex_(F1SubRight.WT12));
        createBothSides(Vertex.getVertex_(F1SubRight.U1), Vertex.getVertex_(F1SubRight.E17));
        createBothSides(Vertex.getVertex_(F1SubRight.U1), Vertex.getVertex_(F1SubRight.T1));
        createBothSides(Vertex.getVertex_(F1SubRight.U1), Vertex.getVertex_(F1SubRight.V1));
        createBothSides(Vertex.getVertex_(F1SubRight.U2), Vertex.getVertex_(F1SubRight.E10));
        createBothSides(Vertex.getVertex_(F1SubRight.U2), Vertex.getVertex_(F1SubRight.T2));
        createBothSides(Vertex.getVertex_(F1SubRight.V1), Vertex.getVertex_(F1SubRight.U1));
        createBothSides(Vertex.getVertex_(F1SubRight.V1), Vertex.getVertex_(F1SubRight.w1));
        createBothSides(Vertex.getVertex_(F1SubRight.W8), Vertex.getVertex_(F1SubRight.L2));
        createBothSides(Vertex.getVertex_(F1SubRight.W8), Vertex.getVertex_(F1SubRight.WT10));
        createBothSides(Vertex.getVertex_(F1SubRight.WT10), Vertex.getVertex_(F1SubRight.K2));
        createBothSides(Vertex.getVertex_(F1SubRight.WT12), Vertex.getVertex_(F1SubRight.EL8));
        createBothSides(Vertex.getVertex_(F1SubRight.WT12), Vertex.getVertex_(F1SubRight.T2));
        createBothSides(Vertex.getVertex_(F1SubRight.WT4), Vertex.getVertex_(F1SubRight.WT8));
        createBothSides(Vertex.getVertex_(F1SubRight.WT8), Vertex.getVertex_(F1SubRight.K2));
        createBothSides(Vertex.getVertex_(F1SubRight.WT8), Vertex.getVertex_(F1SubRight.WT4));
        createBothSides(Vertex.getVertex_(F1SubRight.X1), Vertex.getVertex_(F1SubRight.Y1));
        createBothSides(Vertex.getVertex_(F1SubRight.X1), Vertex.getVertex_(F1SubRight.w1));
        createBothSides(Vertex.getVertex_(F1SubRight.Y1), Vertex.getVertex_(F1SubRight.E18));
        createBothSides(Vertex.getVertex_(F1SubRight.Y1), Vertex.getVertex_(F1SubRight.X1));
        createBothSides(Vertex.getVertex_(F1SubRight.Z1), Vertex.getVertex_(F1SubRight.A2));
        createBothSides(Vertex.getVertex_(F1SubRight.Z1), Vertex.getVertex_(F1SubRight.E16));
        createBothSides(Vertex.getVertex_(F1SubRight.Z1), Vertex.getVertex_(F1SubRight.T1));
        createBothSides(Vertex.getVertex_(F1SubRight.b2), Vertex.getVertex_(F1SubRight.A2));
        createBothSides(Vertex.getVertex_(F1SubRight.b2), Vertex.getVertex_(F1SubRight.E15));
        createBothSides(Vertex.getVertex_(F1SubRight.b2), Vertex.getVertex_(F1SubRight.F2));
        createBothSides(Vertex.getVertex_(F1SubRight.d2), Vertex.getVertex_(F1SubRight.B6));
        createBothSides(Vertex.getVertex_(F1SubRight.d2), Vertex.getVertex_(F1SubRight.C2));
        createBothSides(Vertex.getVertex_(F1SubRight.e2), Vertex.getVertex_(F1SubRight.R1));
        createBothSides(Vertex.getVertex_(F1SubRight.e2), Vertex.getVertex_(F1SubRight.d2));
        createBothSides(Vertex.getVertex_(F1SubRight.q1), Vertex.getVertex_(F1SubRight.I4));
        createBothSides(Vertex.getVertex_(F1SubRight.q1), Vertex.getVertex_(F1SubRight.R1));
        createBothSides(Vertex.getVertex_(F1SubRight.q2), Vertex.getVertex_(F1SubRight.P2));
        createBothSides(Vertex.getVertex_(F1SubRight.q2), Vertex.getVertex_(F1SubRight.R2));
        createBothSides(Vertex.getVertex_(F1SubRight.q2), Vertex.getVertex_(F1SubRight.S37));
        createBothSides(Vertex.getVertex_(F1SubRight.s1), Vertex.getVertex_(F1SubRight.C2));
        createBothSides(Vertex.getVertex_(F1SubRight.s1), Vertex.getVertex_(F1SubRight.T1));
        createBothSides(Vertex.getVertex_(F1SubRight.s2), Vertex.getVertex_(F1SubRight.ES6));
        createBothSides(Vertex.getVertex_(F1SubRight.s2), Vertex.getVertex_(F1SubRight.R2));
        createBothSides(Vertex.getVertex_(F1SubRight.s2), Vertex.getVertex_(F1SubRight.S39));
        createBothSides(Vertex.getVertex_(F1SubRight.w1), Vertex.getVertex_(F1SubRight.V1));
        createBothSides(Vertex.getVertex_(F1SubRight.w1), Vertex.getVertex_(F1SubRight.X1));
        createBothSides(Vertex.getVertex_(F1SubRight.Z3), Vertex.getVertex_(F1SubRight.M1));


        //extend edges added

        createBothSides(Vertex.getVertex_(F1SubRight.ER1), Vertex.getVertex_(F1SubRight.U1));
        createBothSides(Vertex.getVertex_(F1SubRight.ER1), Vertex.getVertex_(F1SubRight.s1));
        createBothSides(Vertex.getVertex_(F1SubRight.ER1), Vertex.getVertex_(F1SubRight.T1));
        createBothSides(Vertex.getVertex_(F1SubRight.ER2), Vertex.getVertex_(F1SubRight.q1));
        createBothSides(Vertex.getVertex_(F1SubRight.ER2), Vertex.getVertex_(F1SubRight.EBP1));
        createBothSides(Vertex.getVertex_(F1SubRight.ER2), Vertex.getVertex_(F1SubRight.I4));
        createBothSides(Vertex.getVertex_(F1SubRight.ER3), Vertex.getVertex_(F1SubRight.C2));
        createBothSides(Vertex.getVertex_(F1SubRight.ER3), Vertex.getVertex_(F1SubRight.ER4));
        createBothSides(Vertex.getVertex_(F1SubRight.ER3), Vertex.getVertex_(F1SubRight.S42));
        createBothSides(Vertex.getVertex_(F1SubRight.ER3), Vertex.getVertex_(F1SubRight.ER12));
        createBothSides(Vertex.getVertex_(F1SubRight.ER4), Vertex.getVertex_(F1SubRight.d2));
        createBothSides(Vertex.getVertex_(F1SubRight.ER4), Vertex.getVertex_(F1SubRight.ER5));
        createBothSides(Vertex.getVertex_(F1SubRight.ER5), Vertex.getVertex_(F1SubRight.ER6));
        createBothSides(Vertex.getVertex_(F1SubRight.ER5), Vertex.getVertex_(F1SubRight.S39));
        createBothSides(Vertex.getVertex_(F1SubRight.ER6), Vertex.getVertex_(F1SubRight.e2));
        createBothSides(Vertex.getVertex_(F1SubRight.ER6), Vertex.getVertex_(F1SubRight.K4));
        createBothSides(Vertex.getVertex_(F1SubRight.ER7), Vertex.getVertex_(F1SubRight.S40));
        createBothSides(Vertex.getVertex_(F1SubRight.ER7), Vertex.getVertex_(F1SubRight.N2));
        createBothSides(Vertex.getVertex_(F1SubRight.ER7), Vertex.getVertex_(F1SubRight.M2));
        createBothSides(Vertex.getVertex_(F1SubRight.ER8), Vertex.getVertex_(F1SubRight.S37));
        createBothSides(Vertex.getVertex_(F1SubRight.ER8), Vertex.getVertex_(F1SubRight.O2));
        createBothSides(Vertex.getVertex_(F1SubRight.ER8), Vertex.getVertex_(F1SubRight.N2));
        createBothSides(Vertex.getVertex_(F1SubRight.ER9), Vertex.getVertex_(F1SubRight.q2));
        createBothSides(Vertex.getVertex_(F1SubRight.ER9), Vertex.getVertex_(F1SubRight.ER10));
        createBothSides(Vertex.getVertex_(F1SubRight.ER9), Vertex.getVertex_(F1SubRight.P2));
        createBothSides(Vertex.getVertex_(F1SubRight.ER10), Vertex.getVertex_(F1SubRight.S34));
        createBothSides(Vertex.getVertex_(F1SubRight.ER10), Vertex.getVertex_(F1SubRight.EBP2));
        createBothSides(Vertex.getVertex_(F1SubRight.ER10), Vertex.getVertex_(F1SubRight.ER11));
        createBothSides(Vertex.getVertex_(F1SubRight.ER11), Vertex.getVertex_(F1SubRight.I));
        createBothSides(Vertex.getVertex_(F1SubRight.ER11), Vertex.getVertex_(F1SubRight.U2));
        createBothSides(Vertex.getVertex_(F1SubRight.ER12), Vertex.getVertex_(F1SubRight.G2));
        createBothSides(Vertex.getVertex_(F1SubRight.ER12), Vertex.getVertex_(F1SubRight.F2));

        createBothSides(Vertex.getVertex_(F1SubRight.EBP1), Vertex.getVertex_(F1SubRight.M1));
        createBothSides(Vertex.getVertex_(F1SubRight.EBP1), Vertex.getVertex_(F1SubRight.L1));



    }
    
    public static void loadEdge_F1Bottom(){

        createBothSides(Vertex.getVertex_(F1SubBottom.A3), Vertex.getVertex_(F1SubBottom.N3));
        createBothSides(Vertex.getVertex_(F1SubBottom.A3), Vertex.getVertex_(F1SubBottom.b3));
        createBothSides(Vertex.getVertex_(F1SubBottom.A4), Vertex.getVertex_(F1SubBottom.ES4));
        createBothSides(Vertex.getVertex_(F1SubBottom.A4), Vertex.getVertex_(F1SubBottom.b4));
        createBothSides(Vertex.getVertex_(F1SubBottom.C3), Vertex.getVertex_(F1SubBottom.D2));
        createBothSides(Vertex.getVertex_(F1SubBottom.C3), Vertex.getVertex_(F1SubBottom.d3));
        createBothSides(Vertex.getVertex_(F1SubBottom.C3), Vertex.getVertex_(F1SubBottom.e4));
        createBothSides(Vertex.getVertex_(F1SubBottom.C4), Vertex.getVertex_(F1SubBottom.D4));
        createBothSides(Vertex.getVertex_(F1SubBottom.C4), Vertex.getVertex_(F1SubBottom.WT6));
        createBothSides(Vertex.getVertex_(F1SubBottom.D1), Vertex.getVertex_(F1SubBottom.Y2));
        createBothSides(Vertex.getVertex_(F1SubBottom.D2), Vertex.getVertex_(F1SubBottom.C3));
        createBothSides(Vertex.getVertex_(F1SubBottom.D3), Vertex.getVertex_(F1SubBottom.G3));
        createBothSides(Vertex.getVertex_(F1SubBottom.D4), Vertex.getVertex_(F1SubBottom.S13));
        createBothSides(Vertex.getVertex_(F1SubBottom.D4), Vertex.getVertex_(F1SubBottom.W6));
        createBothSides(Vertex.getVertex_(F1SubBottom.EL1), Vertex.getVertex_(F1SubBottom.w2));
        createBothSides(Vertex.getVertex_(F1SubBottom.EL2), Vertex.getVertex_(F1SubBottom.J3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EL3), Vertex.getVertex_(F1SubBottom.R3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EL4), Vertex.getVertex_(F1SubBottom.W6));
        createBothSides(Vertex.getVertex_(F1SubBottom.EL4), Vertex.getVertex_(F1SubBottom.b4));
        createBothSides(Vertex.getVertex_(F1SubBottom.ES1), Vertex.getVertex_(F1SubBottom.w2));
        createBothSides(Vertex.getVertex_(F1SubBottom.ES2), Vertex.getVertex_(F1SubBottom.K3));
        createBothSides(Vertex.getVertex_(F1SubBottom.ES3), Vertex.getVertex_(F1SubBottom.ES4));
        createBothSides(Vertex.getVertex_(F1SubBottom.ES3), Vertex.getVertex_(F1SubBottom.s3));
        createBothSides(Vertex.getVertex_(F1SubBottom.ES4), Vertex.getVertex_(F1SubBottom.A4));
        createBothSides(Vertex.getVertex_(F1SubBottom.F3), Vertex.getVertex_(F1SubBottom.G3));
        createBothSides(Vertex.getVertex_(F1SubBottom.F3), Vertex.getVertex_(F1SubBottom.S4));
        createBothSides(Vertex.getVertex_(F1SubBottom.G3), Vertex.getVertex_(F1SubBottom.D3));
        createBothSides(Vertex.getVertex_(F1SubBottom.G3), Vertex.getVertex_(F1SubBottom.H3));
        createBothSides(Vertex.getVertex_(F1SubBottom.H3), Vertex.getVertex_(F1SubBottom.I3));
        createBothSides(Vertex.getVertex_(F1SubBottom.H3), Vertex.getVertex_(F1SubBottom.L3));
        createBothSides(Vertex.getVertex_(F1SubBottom.I3), Vertex.getVertex_(F1SubBottom.J3));
        createBothSides(Vertex.getVertex_(F1SubBottom.I3), Vertex.getVertex_(F1SubBottom.S16));
        createBothSides(Vertex.getVertex_(F1SubBottom.J3), Vertex.getVertex_(F1SubBottom.EL2));
        createBothSides(Vertex.getVertex_(F1SubBottom.J3), Vertex.getVertex_(F1SubBottom.ES2));
        createBothSides(Vertex.getVertex_(F1SubBottom.K3), Vertex.getVertex_(F1SubBottom.W2));
        createBothSides(Vertex.getVertex_(F1SubBottom.K3), Vertex.getVertex_(F1SubBottom.WT2));
        createBothSides(Vertex.getVertex_(F1SubBottom.L3), Vertex.getVertex_(F1SubBottom.H3));
        createBothSides(Vertex.getVertex_(F1SubBottom.L3), Vertex.getVertex_(F1SubBottom.S15));
        createBothSides(Vertex.getVertex_(F1SubBottom.L3), Vertex.getVertex_(F1SubBottom.S16));
        createBothSides(Vertex.getVertex_(F1SubBottom.M3), Vertex.getVertex_(F1SubBottom.L3));
        createBothSides(Vertex.getVertex_(F1SubBottom.M3), Vertex.getVertex_(F1SubBottom.Q2));
        createBothSides(Vertex.getVertex_(F1SubBottom.M3), Vertex.getVertex_(F1SubBottom.e3));
        createBothSides(Vertex.getVertex_(F1SubBottom.N3), Vertex.getVertex_(F1SubBottom.A3));
        createBothSides(Vertex.getVertex_(F1SubBottom.N3), Vertex.getVertex_(F1SubBottom.Q1));
        createBothSides(Vertex.getVertex_(F1SubBottom.N3), Vertex.getVertex_(F1SubBottom.e4));
        createBothSides(Vertex.getVertex_(F1SubBottom.O3), Vertex.getVertex_(F1SubBottom.N3));
        createBothSides(Vertex.getVertex_(F1SubBottom.O3), Vertex.getVertex_(F1SubBottom.S11));
        createBothSides(Vertex.getVertex_(F1SubBottom.O3), Vertex.getVertex_(F1SubBottom.X2));
        createBothSides(Vertex.getVertex_(F1SubBottom.P3), Vertex.getVertex_(F1SubBottom.Q3));
        createBothSides(Vertex.getVertex_(F1SubBottom.P3), Vertex.getVertex_(F1SubBottom.S9));
        createBothSides(Vertex.getVertex_(F1SubBottom.P3), Vertex.getVertex_(F1SubBottom.W5));
        createBothSides(Vertex.getVertex_(F1SubBottom.Q1), Vertex.getVertex_(F1SubBottom.N3));
        createBothSides(Vertex.getVertex_(F1SubBottom.Q1), Vertex.getVertex_(F1SubBottom.Q2));
        createBothSides(Vertex.getVertex_(F1SubBottom.Q2), Vertex.getVertex_(F1SubBottom.M3));
        createBothSides(Vertex.getVertex_(F1SubBottom.Q3), Vertex.getVertex_(F1SubBottom.R3));
        createBothSides(Vertex.getVertex_(F1SubBottom.Q3), Vertex.getVertex_(F1SubBottom.WT5));
        createBothSides(Vertex.getVertex_(F1SubBottom.R3), Vertex.getVertex_(F1SubBottom.EL3));
        createBothSides(Vertex.getVertex_(F1SubBottom.R3), Vertex.getVertex_(F1SubBottom.s3));
        createBothSides(Vertex.getVertex_(F1SubBottom.S1), Vertex.getVertex_(F1SubBottom.S2));
        createBothSides(Vertex.getVertex_(F1SubBottom.S1), Vertex.getVertex_(F1SubBottom.Z2));
        createBothSides(Vertex.getVertex_(F1SubBottom.S10), Vertex.getVertex_(F1SubBottom.S11));
        createBothSides(Vertex.getVertex_(F1SubBottom.S10), Vertex.getVertex_(F1SubBottom.S9));
        createBothSides(Vertex.getVertex_(F1SubBottom.S11), Vertex.getVertex_(F1SubBottom.O3));
        createBothSides(Vertex.getVertex_(F1SubBottom.S11), Vertex.getVertex_(F1SubBottom.S10));
        createBothSides(Vertex.getVertex_(F1SubBottom.S12), Vertex.getVertex_(F1SubBottom.O3));
        createBothSides(Vertex.getVertex_(F1SubBottom.S13), Vertex.getVertex_(F1SubBottom.D4));
        createBothSides(Vertex.getVertex_(F1SubBottom.S13), Vertex.getVertex_(F1SubBottom.S14));
        createBothSides(Vertex.getVertex_(F1SubBottom.S14), Vertex.getVertex_(F1SubBottom.S13));
        createBothSides(Vertex.getVertex_(F1SubBottom.S14), Vertex.getVertex_(F1SubBottom.S15));
        createBothSides(Vertex.getVertex_(F1SubBottom.S15), Vertex.getVertex_(F1SubBottom.L3));
        createBothSides(Vertex.getVertex_(F1SubBottom.S15), Vertex.getVertex_(F1SubBottom.S14));
        createBothSides(Vertex.getVertex_(F1SubBottom.S16), Vertex.getVertex_(F1SubBottom.I3));
        createBothSides(Vertex.getVertex_(F1SubBottom.S2), Vertex.getVertex_(F1SubBottom.S3));
        createBothSides(Vertex.getVertex_(F1SubBottom.S2), Vertex.getVertex_(F1SubBottom.b3));
        createBothSides(Vertex.getVertex_(F1SubBottom.S3), Vertex.getVertex_(F1SubBottom.S4));
        createBothSides(Vertex.getVertex_(F1SubBottom.S3), Vertex.getVertex_(F1SubBottom.d3));
        createBothSides(Vertex.getVertex_(F1SubBottom.S4), Vertex.getVertex_(F1SubBottom.F3));
        createBothSides(Vertex.getVertex_(F1SubBottom.S5), Vertex.getVertex_(F1SubBottom.S6));
        createBothSides(Vertex.getVertex_(F1SubBottom.S6), Vertex.getVertex_(F1SubBottom.S7));
        createBothSides(Vertex.getVertex_(F1SubBottom.S6), Vertex.getVertex_(F1SubBottom.T3));
        createBothSides(Vertex.getVertex_(F1SubBottom.S7), Vertex.getVertex_(F1SubBottom.S8));
        createBothSides(Vertex.getVertex_(F1SubBottom.S7), Vertex.getVertex_(F1SubBottom.w3));
        createBothSides(Vertex.getVertex_(F1SubBottom.S9), Vertex.getVertex_(F1SubBottom.P3));
        createBothSides(Vertex.getVertex_(F1SubBottom.S9), Vertex.getVertex_(F1SubBottom.S10));
        createBothSides(Vertex.getVertex_(F1SubBottom.S9), Vertex.getVertex_(F1SubBottom.S13));
        createBothSides(Vertex.getVertex_(F1SubBottom.T3), Vertex.getVertex_(F1SubBottom.S6));
        createBothSides(Vertex.getVertex_(F1SubBottom.T3), Vertex.getVertex_(F1SubBottom.U3));
        createBothSides(Vertex.getVertex_(F1SubBottom.T3), Vertex.getVertex_(F1SubBottom.V3));
        createBothSides(Vertex.getVertex_(F1SubBottom.U3), Vertex.getVertex_(F1SubBottom.T3));
        createBothSides(Vertex.getVertex_(F1SubBottom.V2), Vertex.getVertex_(F1SubBottom.ES1));
        createBothSides(Vertex.getVertex_(F1SubBottom.V2), Vertex.getVertex_(F1SubBottom.W1));
        createBothSides(Vertex.getVertex_(F1SubBottom.V3), Vertex.getVertex_(F1SubBottom.e4));
        createBothSides(Vertex.getVertex_(F1SubBottom.V3), Vertex.getVertex_(F1SubBottom.w3));
        createBothSides(Vertex.getVertex_(F1SubBottom.W1), Vertex.getVertex_(F1SubBottom.V2));
        createBothSides(Vertex.getVertex_(F1SubBottom.W2), Vertex.getVertex_(F1SubBottom.K3));
        createBothSides(Vertex.getVertex_(F1SubBottom.W5), Vertex.getVertex_(F1SubBottom.EL3));
        createBothSides(Vertex.getVertex_(F1SubBottom.W5), Vertex.getVertex_(F1SubBottom.P3));
        createBothSides(Vertex.getVertex_(F1SubBottom.W6), Vertex.getVertex_(F1SubBottom.D4));
        createBothSides(Vertex.getVertex_(F1SubBottom.WT1), Vertex.getVertex_(F1SubBottom.V2));
        createBothSides(Vertex.getVertex_(F1SubBottom.WT5), Vertex.getVertex_(F1SubBottom.Q3));
        createBothSides(Vertex.getVertex_(F1SubBottom.WT6), Vertex.getVertex_(F1SubBottom.C4));
        createBothSides(Vertex.getVertex_(F1SubBottom.X2), Vertex.getVertex_(F1SubBottom.O3));
        createBothSides(Vertex.getVertex_(F1SubBottom.X2), Vertex.getVertex_(F1SubBottom.Y2));
        createBothSides(Vertex.getVertex_(F1SubBottom.X3), Vertex.getVertex_(F1SubBottom.w3));
        createBothSides(Vertex.getVertex_(F1SubBottom.X3), Vertex.getVertex_(F1SubBottom.Y3));
        createBothSides(Vertex.getVertex_(F1SubBottom.Y2), Vertex.getVertex_(F1SubBottom.D1));
        createBothSides(Vertex.getVertex_(F1SubBottom.Y2), Vertex.getVertex_(F1SubBottom.Z2));
        createBothSides(Vertex.getVertex_(F1SubBottom.Y3), Vertex.getVertex_(F1SubBottom.U3));
        createBothSides(Vertex.getVertex_(F1SubBottom.Y3), Vertex.getVertex_(F1SubBottom.X3));
        createBothSides(Vertex.getVertex_(F1SubBottom.Y3), Vertex.getVertex_(F1SubBottom.Z3));
        createBothSides(Vertex.getVertex_(F1SubBottom.Z2), Vertex.getVertex_(F1SubBottom.A3));
        createBothSides(Vertex.getVertex_(F1SubBottom.Z2), Vertex.getVertex_(F1SubBottom.S1));
        createBothSides(Vertex.getVertex_(F1SubBottom.b3), Vertex.getVertex_(F1SubBottom.C3));
        createBothSides(Vertex.getVertex_(F1SubBottom.b3), Vertex.getVertex_(F1SubBottom.S2));
        createBothSides(Vertex.getVertex_(F1SubBottom.b4), Vertex.getVertex_(F1SubBottom.C4));
        createBothSides(Vertex.getVertex_(F1SubBottom.b4), Vertex.getVertex_(F1SubBottom.EL4));
        createBothSides(Vertex.getVertex_(F1SubBottom.d3), Vertex.getVertex_(F1SubBottom.S3));
        createBothSides(Vertex.getVertex_(F1SubBottom.d3), Vertex.getVertex_(F1SubBottom.e3));
        createBothSides(Vertex.getVertex_(F1SubBottom.e3), Vertex.getVertex_(F1SubBottom.F3));
        createBothSides(Vertex.getVertex_(F1SubBottom.e3), Vertex.getVertex_(F1SubBottom.M3));
        createBothSides(Vertex.getVertex_(F1SubBottom.e4), Vertex.getVertex_(F1SubBottom.C3));
        createBothSides(Vertex.getVertex_(F1SubBottom.e4), Vertex.getVertex_(F1SubBottom.M3));
        createBothSides(Vertex.getVertex_(F1SubBottom.e4), Vertex.getVertex_(F1SubBottom.V3));
        createBothSides(Vertex.getVertex_(F1SubBottom.s3), Vertex.getVertex_(F1SubBottom.ES3));
        createBothSides(Vertex.getVertex_(F1SubBottom.s3), Vertex.getVertex_(F1SubBottom.T3));
        createBothSides(Vertex.getVertex_(F1SubBottom.w2), Vertex.getVertex_(F1SubBottom.EL1));
        createBothSides(Vertex.getVertex_(F1SubBottom.w2), Vertex.getVertex_(F1SubBottom.X2));
        createBothSides(Vertex.getVertex_(F1SubBottom.w3), Vertex.getVertex_(F1SubBottom.A4));
        createBothSides(Vertex.getVertex_(F1SubBottom.w3), Vertex.getVertex_(F1SubBottom.S7));
        createBothSides(Vertex.getVertex_(F1SubBottom.w3), Vertex.getVertex_(F1SubBottom.X3));


        //extend edges added

        createBothSides(Vertex.getVertex_(F1SubBottom.EB1), Vertex.getVertex_(F1SubBottom.w2));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB1), Vertex.getVertex_(F1SubBottom.S12));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB1), Vertex.getVertex_(F1SubBottom.X2));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB2), Vertex.getVertex_(F1SubBottom.Y2));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB2), Vertex.getVertex_(F1SubBottom.EB9));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB2), Vertex.getVertex_(F1SubBottom.Z2));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB3), Vertex.getVertex_(F1SubBottom.b3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB3), Vertex.getVertex_(F1SubBottom.EB8));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB3), Vertex.getVertex_(F1SubBottom.C3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB4), Vertex.getVertex_(F1SubBottom.C3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB4), Vertex.getVertex_(F1SubBottom.EB7));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB4), Vertex.getVertex_(F1SubBottom.d3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB5), Vertex.getVertex_(F1SubBottom.F3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB5), Vertex.getVertex_(F1SubBottom.EB6));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB5), Vertex.getVertex_(F1SubBottom.G3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB6), Vertex.getVertex_(F1SubBottom.M3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB6), Vertex.getVertex_(F1SubBottom.b4));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB6), Vertex.getVertex_(F1SubBottom.L3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB7), Vertex.getVertex_(F1SubBottom.e4));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB7), Vertex.getVertex_(F1SubBottom.EB11));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB7), Vertex.getVertex_(F1SubBottom.M3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB8), Vertex.getVertex_(F1SubBottom.N3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB8), Vertex.getVertex_(F1SubBottom.EB10));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB8), Vertex.getVertex_(F1SubBottom.e4));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB9), Vertex.getVertex_(F1SubBottom.O3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB9), Vertex.getVertex_(F1SubBottom.R3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB9), Vertex.getVertex_(F1SubBottom.N3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB10), Vertex.getVertex_(F1SubBottom.S6));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB10), Vertex.getVertex_(F1SubBottom.EB13));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB11), Vertex.getVertex_(F1SubBottom.EB12));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB11), Vertex.getVertex_(F1SubBottom.S7));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB12), Vertex.getVertex_(F1SubBottom.V3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB12), Vertex.getVertex_(F1SubBottom.w3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB13), Vertex.getVertex_(F1SubBottom.T3));
        createBothSides(Vertex.getVertex_(F1SubBottom.EB13), Vertex.getVertex_(F1SubBottom.V3));
        
    }
    
    public static void loadEdge_F2Bottom(){

        createBothSides(Vertex.getVertex_(F2SubBottom.A3), Vertex.getVertex_(F2SubBottom.J3));
        createBothSides(Vertex.getVertex_(F2SubBottom.A3), Vertex.getVertex_(F2SubBottom.K2));
        createBothSides(Vertex.getVertex_(F2SubBottom.A3), Vertex.getVertex_(F2SubBottom.Z2));
        createBothSides(Vertex.getVertex_(F2SubBottom.B2), Vertex.getVertex_(F2SubBottom.W2));
        createBothSides(Vertex.getVertex_(F2SubBottom.B2), Vertex.getVertex_(F2SubBottom.WT2));
        createBothSides(Vertex.getVertex_(F2SubBottom.B3), Vertex.getVertex_(F2SubBottom.S6));
        createBothSides(Vertex.getVertex_(F2SubBottom.D1), Vertex.getVertex_(F2SubBottom.N2));
        createBothSides(Vertex.getVertex_(F2SubBottom.D2), Vertex.getVertex_(F2SubBottom.I2));
        createBothSides(Vertex.getVertex_(F2SubBottom.D3), Vertex.getVertex_(F2SubBottom.F2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EL1), Vertex.getVertex_(F2SubBottom.P2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EL2), Vertex.getVertex_(F2SubBottom.c2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EL3), Vertex.getVertex_(F2SubBottom.F3));
        createBothSides(Vertex.getVertex_(F2SubBottom.EL4), Vertex.getVertex_(F2SubBottom.V2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EL4), Vertex.getVertex_(F2SubBottom.W6));
        createBothSides(Vertex.getVertex_(F2SubBottom.ES1), Vertex.getVertex_(F2SubBottom.P2));
        createBothSides(Vertex.getVertex_(F2SubBottom.ES2), Vertex.getVertex_(F2SubBottom.B2));
        createBothSides(Vertex.getVertex_(F2SubBottom.ES3), Vertex.getVertex_(F2SubBottom.ES4));
        createBothSides(Vertex.getVertex_(F2SubBottom.ES3), Vertex.getVertex_(F2SubBottom.e3));
        createBothSides(Vertex.getVertex_(F2SubBottom.ES4), Vertex.getVertex_(F2SubBottom.w2));
        createBothSides(Vertex.getVertex_(F2SubBottom.F2), Vertex.getVertex_(F2SubBottom.D3));
        createBothSides(Vertex.getVertex_(F2SubBottom.F2), Vertex.getVertex_(F2SubBottom.e2));
        createBothSides(Vertex.getVertex_(F2SubBottom.F3), Vertex.getVertex_(F2SubBottom.EL3));
        createBothSides(Vertex.getVertex_(F2SubBottom.F3), Vertex.getVertex_(F2SubBottom.e3));
        createBothSides(Vertex.getVertex_(F2SubBottom.F4), Vertex.getVertex_(F2SubBottom.S15));
        createBothSides(Vertex.getVertex_(F2SubBottom.F4), Vertex.getVertex_(F2SubBottom.S16));
        createBothSides(Vertex.getVertex_(F2SubBottom.F4), Vertex.getVertex_(F2SubBottom.e2));
        createBothSides(Vertex.getVertex_(F2SubBottom.G2), Vertex.getVertex_(F2SubBottom.F2));
        createBothSides(Vertex.getVertex_(F2SubBottom.G2), Vertex.getVertex_(F2SubBottom.S4));
        createBothSides(Vertex.getVertex_(F2SubBottom.G3), Vertex.getVertex_(F2SubBottom.F3));
        createBothSides(Vertex.getVertex_(F2SubBottom.G3), Vertex.getVertex_(F2SubBottom.WT5));
        createBothSides(Vertex.getVertex_(F2SubBottom.H2), Vertex.getVertex_(F2SubBottom.G2));
        createBothSides(Vertex.getVertex_(F2SubBottom.H2), Vertex.getVertex_(F2SubBottom.S3));
        createBothSides(Vertex.getVertex_(F2SubBottom.H3), Vertex.getVertex_(F2SubBottom.G3));
        createBothSides(Vertex.getVertex_(F2SubBottom.H3), Vertex.getVertex_(F2SubBottom.S9));
        createBothSides(Vertex.getVertex_(F2SubBottom.H3), Vertex.getVertex_(F2SubBottom.W5));
        createBothSides(Vertex.getVertex_(F2SubBottom.I2), Vertex.getVertex_(F2SubBottom.D2));
        createBothSides(Vertex.getVertex_(F2SubBottom.I2), Vertex.getVertex_(F2SubBottom.H2));
        createBothSides(Vertex.getVertex_(F2SubBottom.I2), Vertex.getVertex_(F2SubBottom.K2));
        createBothSides(Vertex.getVertex_(F2SubBottom.I3), Vertex.getVertex_(F2SubBottom.J3));
        createBothSides(Vertex.getVertex_(F2SubBottom.I3), Vertex.getVertex_(F2SubBottom.c3));
        createBothSides(Vertex.getVertex_(F2SubBottom.J2), Vertex.getVertex_(F2SubBottom.F4));
        createBothSides(Vertex.getVertex_(F2SubBottom.J2), Vertex.getVertex_(F2SubBottom.Q2));
        createBothSides(Vertex.getVertex_(F2SubBottom.J3), Vertex.getVertex_(F2SubBottom.A3));
        createBothSides(Vertex.getVertex_(F2SubBottom.J3), Vertex.getVertex_(F2SubBottom.K3));
        createBothSides(Vertex.getVertex_(F2SubBottom.K2), Vertex.getVertex_(F2SubBottom.A3));
        createBothSides(Vertex.getVertex_(F2SubBottom.K2), Vertex.getVertex_(F2SubBottom.I2));
        createBothSides(Vertex.getVertex_(F2SubBottom.K2), Vertex.getVertex_(F2SubBottom.J2));
        createBothSides(Vertex.getVertex_(F2SubBottom.K3), Vertex.getVertex_(F2SubBottom.Y2));
        createBothSides(Vertex.getVertex_(F2SubBottom.L2), Vertex.getVertex_(F2SubBottom.I2));
        createBothSides(Vertex.getVertex_(F2SubBottom.L2), Vertex.getVertex_(F2SubBottom.S2));
        createBothSides(Vertex.getVertex_(F2SubBottom.M2), Vertex.getVertex_(F2SubBottom.L2));
        createBothSides(Vertex.getVertex_(F2SubBottom.M2), Vertex.getVertex_(F2SubBottom.S1));
        createBothSides(Vertex.getVertex_(F2SubBottom.N2), Vertex.getVertex_(F2SubBottom.D1));
        createBothSides(Vertex.getVertex_(F2SubBottom.N2), Vertex.getVertex_(F2SubBottom.M2));
        createBothSides(Vertex.getVertex_(F2SubBottom.O2), Vertex.getVertex_(F2SubBottom.N2));
        createBothSides(Vertex.getVertex_(F2SubBottom.O2), Vertex.getVertex_(F2SubBottom.R2));
        createBothSides(Vertex.getVertex_(F2SubBottom.P2), Vertex.getVertex_(F2SubBottom.EL1));
        createBothSides(Vertex.getVertex_(F2SubBottom.P2), Vertex.getVertex_(F2SubBottom.O2));
        createBothSides(Vertex.getVertex_(F2SubBottom.Q1), Vertex.getVertex_(F2SubBottom.Q2));
        createBothSides(Vertex.getVertex_(F2SubBottom.Q1), Vertex.getVertex_(F2SubBottom.s2));
        createBothSides(Vertex.getVertex_(F2SubBottom.Q2), Vertex.getVertex_(F2SubBottom.J2));
        createBothSides(Vertex.getVertex_(F2SubBottom.R2), Vertex.getVertex_(F2SubBottom.O2));
        createBothSides(Vertex.getVertex_(F2SubBottom.R2), Vertex.getVertex_(F2SubBottom.S11));
        createBothSides(Vertex.getVertex_(F2SubBottom.R2), Vertex.getVertex_(F2SubBottom.s2));
        createBothSides(Vertex.getVertex_(F2SubBottom.S1), Vertex.getVertex_(F2SubBottom.M2));
        createBothSides(Vertex.getVertex_(F2SubBottom.S1), Vertex.getVertex_(F2SubBottom.S2));
        createBothSides(Vertex.getVertex_(F2SubBottom.S10), Vertex.getVertex_(F2SubBottom.S11));
        createBothSides(Vertex.getVertex_(F2SubBottom.S10), Vertex.getVertex_(F2SubBottom.S9));
        createBothSides(Vertex.getVertex_(F2SubBottom.S11), Vertex.getVertex_(F2SubBottom.R2));
        createBothSides(Vertex.getVertex_(F2SubBottom.S11), Vertex.getVertex_(F2SubBottom.S10));
        createBothSides(Vertex.getVertex_(F2SubBottom.S12), Vertex.getVertex_(F2SubBottom.R2));
        createBothSides(Vertex.getVertex_(F2SubBottom.S13), Vertex.getVertex_(F2SubBottom.S14));
        createBothSides(Vertex.getVertex_(F2SubBottom.S13), Vertex.getVertex_(F2SubBottom.T2));
        createBothSides(Vertex.getVertex_(F2SubBottom.S14), Vertex.getVertex_(F2SubBottom.S13));
        createBothSides(Vertex.getVertex_(F2SubBottom.S14), Vertex.getVertex_(F2SubBottom.S15));
        createBothSides(Vertex.getVertex_(F2SubBottom.S15), Vertex.getVertex_(F2SubBottom.F4));
        createBothSides(Vertex.getVertex_(F2SubBottom.S15), Vertex.getVertex_(F2SubBottom.S14));
        createBothSides(Vertex.getVertex_(F2SubBottom.S2), Vertex.getVertex_(F2SubBottom.L2));
        createBothSides(Vertex.getVertex_(F2SubBottom.S2), Vertex.getVertex_(F2SubBottom.S3));
        createBothSides(Vertex.getVertex_(F2SubBottom.S3), Vertex.getVertex_(F2SubBottom.H2));
        createBothSides(Vertex.getVertex_(F2SubBottom.S3), Vertex.getVertex_(F2SubBottom.S4));
        createBothSides(Vertex.getVertex_(F2SubBottom.S4), Vertex.getVertex_(F2SubBottom.G2));
        createBothSides(Vertex.getVertex_(F2SubBottom.S5), Vertex.getVertex_(F2SubBottom.S6));
        createBothSides(Vertex.getVertex_(F2SubBottom.S5), Vertex.getVertex_(F2SubBottom.d3));
        createBothSides(Vertex.getVertex_(F2SubBottom.S6), Vertex.getVertex_(F2SubBottom.B3));
        createBothSides(Vertex.getVertex_(F2SubBottom.S6), Vertex.getVertex_(F2SubBottom.S7));
        createBothSides(Vertex.getVertex_(F2SubBottom.S7), Vertex.getVertex_(F2SubBottom.S8));
        createBothSides(Vertex.getVertex_(F2SubBottom.S7), Vertex.getVertex_(F2SubBottom.Z2));
        createBothSides(Vertex.getVertex_(F2SubBottom.S8), Vertex.getVertex_(F2SubBottom.X2));
        createBothSides(Vertex.getVertex_(F2SubBottom.S9), Vertex.getVertex_(F2SubBottom.H3));
        createBothSides(Vertex.getVertex_(F2SubBottom.S9), Vertex.getVertex_(F2SubBottom.S10));
        createBothSides(Vertex.getVertex_(F2SubBottom.S9), Vertex.getVertex_(F2SubBottom.S13));
        createBothSides(Vertex.getVertex_(F2SubBottom.T2), Vertex.getVertex_(F2SubBottom.S13));
        createBothSides(Vertex.getVertex_(F2SubBottom.T2), Vertex.getVertex_(F2SubBottom.W6));
        createBothSides(Vertex.getVertex_(F2SubBottom.U2), Vertex.getVertex_(F2SubBottom.T2));
        createBothSides(Vertex.getVertex_(F2SubBottom.U2), Vertex.getVertex_(F2SubBottom.WT6));
        createBothSides(Vertex.getVertex_(F2SubBottom.V2), Vertex.getVertex_(F2SubBottom.EL4));
        createBothSides(Vertex.getVertex_(F2SubBottom.V2), Vertex.getVertex_(F2SubBottom.U2));
        createBothSides(Vertex.getVertex_(F2SubBottom.W1), Vertex.getVertex_(F2SubBottom.q2));
        createBothSides(Vertex.getVertex_(F2SubBottom.W2), Vertex.getVertex_(F2SubBottom.B2));
        createBothSides(Vertex.getVertex_(F2SubBottom.W5), Vertex.getVertex_(F2SubBottom.EL3));
        createBothSides(Vertex.getVertex_(F2SubBottom.W5), Vertex.getVertex_(F2SubBottom.H3));
        createBothSides(Vertex.getVertex_(F2SubBottom.W6), Vertex.getVertex_(F2SubBottom.T2));
        createBothSides(Vertex.getVertex_(F2SubBottom.WT1), Vertex.getVertex_(F2SubBottom.q2));
        createBothSides(Vertex.getVertex_(F2SubBottom.WT5), Vertex.getVertex_(F2SubBottom.G3));
        createBothSides(Vertex.getVertex_(F2SubBottom.WT6), Vertex.getVertex_(F2SubBottom.U2));
        createBothSides(Vertex.getVertex_(F2SubBottom.X2), Vertex.getVertex_(F2SubBottom.S8));
        createBothSides(Vertex.getVertex_(F2SubBottom.X2), Vertex.getVertex_(F2SubBottom.w2));
        createBothSides(Vertex.getVertex_(F2SubBottom.Y2), Vertex.getVertex_(F2SubBottom.K3));
        createBothSides(Vertex.getVertex_(F2SubBottom.Y2), Vertex.getVertex_(F2SubBottom.X2));
        createBothSides(Vertex.getVertex_(F2SubBottom.Z2), Vertex.getVertex_(F2SubBottom.S7));
        createBothSides(Vertex.getVertex_(F2SubBottom.Z2), Vertex.getVertex_(F2SubBottom.Y2));
        createBothSides(Vertex.getVertex_(F2SubBottom.c2), Vertex.getVertex_(F2SubBottom.EL2));
        createBothSides(Vertex.getVertex_(F2SubBottom.c2), Vertex.getVertex_(F2SubBottom.ES2));
        createBothSides(Vertex.getVertex_(F2SubBottom.c3), Vertex.getVertex_(F2SubBottom.B3));
        createBothSides(Vertex.getVertex_(F2SubBottom.c3), Vertex.getVertex_(F2SubBottom.I3));
        createBothSides(Vertex.getVertex_(F2SubBottom.d3), Vertex.getVertex_(F2SubBottom.S5));
        createBothSides(Vertex.getVertex_(F2SubBottom.d3), Vertex.getVertex_(F2SubBottom.c3));
        createBothSides(Vertex.getVertex_(F2SubBottom.e2), Vertex.getVertex_(F2SubBottom.F4));
        createBothSides(Vertex.getVertex_(F2SubBottom.e2), Vertex.getVertex_(F2SubBottom.c2));
        createBothSides(Vertex.getVertex_(F2SubBottom.e3), Vertex.getVertex_(F2SubBottom.ES3));
        createBothSides(Vertex.getVertex_(F2SubBottom.e3), Vertex.getVertex_(F2SubBottom.d3));
        createBothSides(Vertex.getVertex_(F2SubBottom.q2), Vertex.getVertex_(F2SubBottom.ES1));
        createBothSides(Vertex.getVertex_(F2SubBottom.q2), Vertex.getVertex_(F2SubBottom.W1));
        createBothSides(Vertex.getVertex_(F2SubBottom.s2), Vertex.getVertex_(F2SubBottom.K2));
        createBothSides(Vertex.getVertex_(F2SubBottom.s2), Vertex.getVertex_(F2SubBottom.Q1));
        createBothSides(Vertex.getVertex_(F2SubBottom.w2), Vertex.getVertex_(F2SubBottom.ES4));
        createBothSides(Vertex.getVertex_(F2SubBottom.w2), Vertex.getVertex_(F2SubBottom.V2));


        //extend edges added

        createBothSides(Vertex.getVertex_(F2SubBottom.EB1), Vertex.getVertex_(F2SubBottom.S12));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB1), Vertex.getVertex_(F2SubBottom.P2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB1), Vertex.getVertex_(F2SubBottom.O2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB2), Vertex.getVertex_(F2SubBottom.N2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB2), Vertex.getVertex_(F2SubBottom.EB10));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB2), Vertex.getVertex_(F2SubBottom.M2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB3), Vertex.getVertex_(F2SubBottom.L2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB3), Vertex.getVertex_(F2SubBottom.EB9));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB3), Vertex.getVertex_(F2SubBottom.I2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB4), Vertex.getVertex_(F2SubBottom.I2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB4), Vertex.getVertex_(F2SubBottom.EB8));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB4), Vertex.getVertex_(F2SubBottom.H2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB5), Vertex.getVertex_(F2SubBottom.G2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB5), Vertex.getVertex_(F2SubBottom.EB7));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB5), Vertex.getVertex_(F2SubBottom.F2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB6), Vertex.getVertex_(F2SubBottom.e2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB6), Vertex.getVertex_(F2SubBottom.S16));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB6), Vertex.getVertex_(F2SubBottom.c2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB7), Vertex.getVertex_(F2SubBottom.J2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB7), Vertex.getVertex_(F2SubBottom.V2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB7), Vertex.getVertex_(F2SubBottom.F4));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB8), Vertex.getVertex_(F2SubBottom.K2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB8), Vertex.getVertex_(F2SubBottom.EB12));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB8), Vertex.getVertex_(F2SubBottom.J2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB9), Vertex.getVertex_(F2SubBottom.s2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB9), Vertex.getVertex_(F2SubBottom.EB11));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB9), Vertex.getVertex_(F2SubBottom.K2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB10), Vertex.getVertex_(F2SubBottom.R2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB10), Vertex.getVertex_(F2SubBottom.F3));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB10), Vertex.getVertex_(F2SubBottom.s2));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB11), Vertex.getVertex_(F2SubBottom.B3));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB11), Vertex.getVertex_(F2SubBottom.A3));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB12), Vertex.getVertex_(F2SubBottom.A3));
        createBothSides(Vertex.getVertex_(F2SubBottom.EB12), Vertex.getVertex_(F2SubBottom.Z2));


    }
    
    public static void loadEdge_F2Center(){

        createBothSides(Vertex.getVertex_(F2SubCenter.A4), Vertex.getVertex_(F2SubCenter.EL6));
        createBothSides(Vertex.getVertex_(F2SubCenter.C1), Vertex.getVertex_(F2SubCenter.C2));
        createBothSides(Vertex.getVertex_(F2SubCenter.C1), Vertex.getVertex_(F2SubCenter.T3));
        createBothSides(Vertex.getVertex_(F2SubCenter.C2), Vertex.getVertex_(F2SubCenter.C3));
        createBothSides(Vertex.getVertex_(F2SubCenter.C2), Vertex.getVertex_(F2SubCenter.R3));
        createBothSides(Vertex.getVertex_(F2SubCenter.C3), Vertex.getVertex_(F2SubCenter.C4));
        createBothSides(Vertex.getVertex_(F2SubCenter.C3), Vertex.getVertex_(F2SubCenter.Q3));
        createBothSides(Vertex.getVertex_(F2SubCenter.C4), Vertex.getVertex_(F2SubCenter.C5));
        createBothSides(Vertex.getVertex_(F2SubCenter.C4), Vertex.getVertex_(F2SubCenter.O3));
        createBothSides(Vertex.getVertex_(F2SubCenter.C5), Vertex.getVertex_(F2SubCenter.C6));
        createBothSides(Vertex.getVertex_(F2SubCenter.C5), Vertex.getVertex_(F2SubCenter.N3));
        createBothSides(Vertex.getVertex_(F2SubCenter.C6), Vertex.getVertex_(F2SubCenter.L3));
        createBothSides(Vertex.getVertex_(F2SubCenter.EL5), Vertex.getVertex_(F2SubCenter.U3));
        createBothSides(Vertex.getVertex_(F2SubCenter.EL6), Vertex.getVertex_(F2SubCenter.A4));
        createBothSides(Vertex.getVertex_(F2SubCenter.ES5), Vertex.getVertex_(F2SubCenter.ES6));
        createBothSides(Vertex.getVertex_(F2SubCenter.ES5), Vertex.getVertex_(F2SubCenter.V3));
        createBothSides(Vertex.getVertex_(F2SubCenter.ES6), Vertex.getVertex_(F2SubCenter.Z3));
        createBothSides(Vertex.getVertex_(F2SubCenter.I3), Vertex.getVertex_(F2SubCenter.J3));
        createBothSides(Vertex.getVertex_(F2SubCenter.I3), Vertex.getVertex_(F2SubCenter.s3));
        createBothSides(Vertex.getVertex_(F2SubCenter.J3), Vertex.getVertex_(F2SubCenter.K3));
        createBothSides(Vertex.getVertex_(F2SubCenter.J3), Vertex.getVertex_(F2SubCenter.P3));
        createBothSides(Vertex.getVertex_(F2SubCenter.K3), Vertex.getVertex_(F2SubCenter.M3));
        createBothSides(Vertex.getVertex_(F2SubCenter.L3), Vertex.getVertex_(F2SubCenter.C6));
        createBothSides(Vertex.getVertex_(F2SubCenter.M3), Vertex.getVertex_(F2SubCenter.K3));
        createBothSides(Vertex.getVertex_(F2SubCenter.M3), Vertex.getVertex_(F2SubCenter.L3));
        createBothSides(Vertex.getVertex_(F2SubCenter.M3), Vertex.getVertex_(F2SubCenter.Y3));
        createBothSides(Vertex.getVertex_(F2SubCenter.N3), Vertex.getVertex_(F2SubCenter.C5));
        createBothSides(Vertex.getVertex_(F2SubCenter.N3), Vertex.getVertex_(F2SubCenter.M3));
        createBothSides(Vertex.getVertex_(F2SubCenter.O3), Vertex.getVertex_(F2SubCenter.C4));
        createBothSides(Vertex.getVertex_(F2SubCenter.O3), Vertex.getVertex_(F2SubCenter.N3));
        createBothSides(Vertex.getVertex_(F2SubCenter.P3), Vertex.getVertex_(F2SubCenter.J3));
        createBothSides(Vertex.getVertex_(F2SubCenter.P3), Vertex.getVertex_(F2SubCenter.O3));
        createBothSides(Vertex.getVertex_(F2SubCenter.P3), Vertex.getVertex_(F2SubCenter.X3));
        createBothSides(Vertex.getVertex_(F2SubCenter.Q3), Vertex.getVertex_(F2SubCenter.C3));
        createBothSides(Vertex.getVertex_(F2SubCenter.Q3), Vertex.getVertex_(F2SubCenter.P3));
        createBothSides(Vertex.getVertex_(F2SubCenter.R3), Vertex.getVertex_(F2SubCenter.C2));
        createBothSides(Vertex.getVertex_(F2SubCenter.R3), Vertex.getVertex_(F2SubCenter.Q3));
        createBothSides(Vertex.getVertex_(F2SubCenter.SC2), Vertex.getVertex_(F2SubCenter.X3));
        createBothSides(Vertex.getVertex_(F2SubCenter.T3), Vertex.getVertex_(F2SubCenter.C1));
        createBothSides(Vertex.getVertex_(F2SubCenter.T3), Vertex.getVertex_(F2SubCenter.s3));
        createBothSides(Vertex.getVertex_(F2SubCenter.U3), Vertex.getVertex_(F2SubCenter.EL5));
        createBothSides(Vertex.getVertex_(F2SubCenter.U3), Vertex.getVertex_(F2SubCenter.V3));
        createBothSides(Vertex.getVertex_(F2SubCenter.V3), Vertex.getVertex_(F2SubCenter.ES5));
        createBothSides(Vertex.getVertex_(F2SubCenter.V3), Vertex.getVertex_(F2SubCenter.w3));
        createBothSides(Vertex.getVertex_(F2SubCenter.X3), Vertex.getVertex_(F2SubCenter.P3));
        createBothSides(Vertex.getVertex_(F2SubCenter.X3), Vertex.getVertex_(F2SubCenter.SC2));
        createBothSides(Vertex.getVertex_(F2SubCenter.X3), Vertex.getVertex_(F2SubCenter.Y3));
        createBothSides(Vertex.getVertex_(F2SubCenter.Y3), Vertex.getVertex_(F2SubCenter.M3));
        createBothSides(Vertex.getVertex_(F2SubCenter.Y3), Vertex.getVertex_(F2SubCenter.Z3));
        createBothSides(Vertex.getVertex_(F2SubCenter.Z3), Vertex.getVertex_(F2SubCenter.A4));
        createBothSides(Vertex.getVertex_(F2SubCenter.Z3), Vertex.getVertex_(F2SubCenter.ES6));
        createBothSides(Vertex.getVertex_(F2SubCenter.s3), Vertex.getVertex_(F2SubCenter.I3));
        createBothSides(Vertex.getVertex_(F2SubCenter.s3), Vertex.getVertex_(F2SubCenter.R3));
        createBothSides(Vertex.getVertex_(F2SubCenter.s3), Vertex.getVertex_(F2SubCenter.w3));
        createBothSides(Vertex.getVertex_(F2SubCenter.w3), Vertex.getVertex_(F2SubCenter.X3));
        createBothSides(Vertex.getVertex_(F2SubCenter.w3), Vertex.getVertex_(F2SubCenter.s3));


        //extends edges added

        createBothSides(Vertex.getVertex_(F2SubCenter.U3), Vertex.getVertex_(F2SubCenter.EM1));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM1), Vertex.getVertex_(F2SubCenter.EM2));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM2), Vertex.getVertex_(F2SubCenter.T3));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM2), Vertex.getVertex_(F2SubCenter.EM3));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM3), Vertex.getVertex_(F2SubCenter.EM4));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM3), Vertex.getVertex_(F2SubCenter.C1));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM3), Vertex.getVertex_(F2SubCenter.EM4));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM4), Vertex.getVertex_(F2SubCenter.SC1));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM4), Vertex.getVertex_(F2SubCenter.EM5));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM5), Vertex.getVertex_(F2SubCenter.EM6));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM6), Vertex.getVertex_(F2SubCenter.s3));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM6), Vertex.getVertex_(F2SubCenter.I3));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM7), Vertex.getVertex_(F2SubCenter.P3));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM7), Vertex.getVertex_(F2SubCenter.EM6));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM7), Vertex.getVertex_(F2SubCenter.J3));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM7), Vertex.getVertex_(F2SubCenter.EM8));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM8), Vertex.getVertex_(F2SubCenter.M3));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM8), Vertex.getVertex_(F2SubCenter.EM9));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM8), Vertex.getVertex_(F2SubCenter.K3));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM9), Vertex.getVertex_(F2SubCenter.EM10));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM10), Vertex.getVertex_(F2SubCenter.SC3));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM10), Vertex.getVertex_(F2SubCenter.EM11));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM11), Vertex.getVertex_(F2SubCenter.C6));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM11), Vertex.getVertex_(F2SubCenter.EM12));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM12), Vertex.getVertex_(F2SubCenter.L3));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM12), Vertex.getVertex_(F2SubCenter.EM13));
        createBothSides(Vertex.getVertex_(F2SubCenter.EM13), Vertex.getVertex_(F2SubCenter.A4));



    }
    
    public static void loadEdge_F2Top(){


        //basic edges added
        createBothSides(Vertex.getVertex_(F2SubTop.A), Vertex.getVertex_(F2SubTop.E7));
        createBothSides(Vertex.getVertex_(F2SubTop.A), Vertex.getVertex_(F2SubTop.H));
        createBothSides(Vertex.getVertex_(F2SubTop.A1), Vertex.getVertex_(F2SubTop.S25));
        createBothSides(Vertex.getVertex_(F2SubTop.A1), Vertex.getVertex_(F2SubTop.Z));
        createBothSides(Vertex.getVertex_(F2SubTop.A2), Vertex.getVertex_(F2SubTop.W4));
        createBothSides(Vertex.getVertex_(F2SubTop.A2), Vertex.getVertex_(F2SubTop.e4));
        createBothSides(Vertex.getVertex_(F2SubTop.B), Vertex.getVertex_(F2SubTop.J));
        createBothSides(Vertex.getVertex_(F2SubTop.B), Vertex.getVertex_(F2SubTop.C));
        createBothSides(Vertex.getVertex_(F2SubTop.B), Vertex.getVertex_(F2SubTop.WT9));
        createBothSides(Vertex.getVertex_(F2SubTop.B1), Vertex.getVertex_(F2SubTop.A1));
        createBothSides(Vertex.getVertex_(F2SubTop.B4), Vertex.getVertex_(F2SubTop.S));
        createBothSides(Vertex.getVertex_(F2SubTop.B4), Vertex.getVertex_(F2SubTop.S19));
        createBothSides(Vertex.getVertex_(F2SubTop.C), Vertex.getVertex_(F2SubTop.B1));
        createBothSides(Vertex.getVertex_(F2SubTop.C), Vertex.getVertex_(F2SubTop.L));
        createBothSides(Vertex.getVertex_(F2SubTop.D), Vertex.getVertex_(F2SubTop.K));
        createBothSides(Vertex.getVertex_(F2SubTop.D), Vertex.getVertex_(F2SubTop.WT11));
        createBothSides(Vertex.getVertex_(F2SubTop.D4), Vertex.getVertex_(F2SubTop.S21));
        createBothSides(Vertex.getVertex_(F2SubTop.D4), Vertex.getVertex_(F2SubTop.U1));
        createBothSides(Vertex.getVertex_(F2SubTop.D4), Vertex.getVertex_(F2SubTop.X1));
        createBothSides(Vertex.getVertex_(F2SubTop.E), Vertex.getVertex_(F2SubTop.WT10));
        createBothSides(Vertex.getVertex_(F2SubTop.E1), Vertex.getVertex_(F2SubTop.Q));
        createBothSides(Vertex.getVertex_(F2SubTop.E10), Vertex.getVertex_(F2SubTop.d1));
        createBothSides(Vertex.getVertex_(F2SubTop.E11), Vertex.getVertex_(F2SubTop.F1));
        createBothSides(Vertex.getVertex_(F2SubTop.E12), Vertex.getVertex_(F2SubTop.I1));
        createBothSides(Vertex.getVertex_(F2SubTop.E14), Vertex.getVertex_(F2SubTop.E13));
        createBothSides(Vertex.getVertex_(F2SubTop.E15), Vertex.getVertex_(F2SubTop.E16));
        createBothSides(Vertex.getVertex_(F2SubTop.E16), Vertex.getVertex_(F2SubTop.E17));
        createBothSides(Vertex.getVertex_(F2SubTop.E2), Vertex.getVertex_(F2SubTop.E3));
        createBothSides(Vertex.getVertex_(F2SubTop.E2), Vertex.getVertex_(F2SubTop.P));
        createBothSides(Vertex.getVertex_(F2SubTop.E3), Vertex.getVertex_(F2SubTop.E4));
        createBothSides(Vertex.getVertex_(F2SubTop.E3), Vertex.getVertex_(F2SubTop.O));
        createBothSides(Vertex.getVertex_(F2SubTop.E4), Vertex.getVertex_(F2SubTop.N));
        createBothSides(Vertex.getVertex_(F2SubTop.E5), Vertex.getVertex_(F2SubTop.L));
        createBothSides(Vertex.getVertex_(F2SubTop.E6), Vertex.getVertex_(F2SubTop.C));
        createBothSides(Vertex.getVertex_(F2SubTop.E7), Vertex.getVertex_(F2SubTop.E8));
        createBothSides(Vertex.getVertex_(F2SubTop.E8), Vertex.getVertex_(F2SubTop.F));
        createBothSides(Vertex.getVertex_(F2SubTop.E9), Vertex.getVertex_(F2SubTop.E10));
        createBothSides(Vertex.getVertex_(F2SubTop.E9), Vertex.getVertex_(F2SubTop.K));
        createBothSides(Vertex.getVertex_(F2SubTop.EL7), Vertex.getVertex_(F2SubTop.I));
        createBothSides(Vertex.getVertex_(F2SubTop.EL7), Vertex.getVertex_(F2SubTop.WT11));
        createBothSides(Vertex.getVertex_(F2SubTop.EL8), Vertex.getVertex_(F2SubTop.J1));
        createBothSides(Vertex.getVertex_(F2SubTop.ES7), Vertex.getVertex_(F2SubTop.I));
        createBothSides(Vertex.getVertex_(F2SubTop.ES8), Vertex.getVertex_(F2SubTop.K1));
        createBothSides(Vertex.getVertex_(F2SubTop.F), Vertex.getVertex_(F2SubTop.D));
        createBothSides(Vertex.getVertex_(F2SubTop.F1), Vertex.getVertex_(F2SubTop.G1));
        createBothSides(Vertex.getVertex_(F2SubTop.G), Vertex.getVertex_(F2SubTop.F));
        createBothSides(Vertex.getVertex_(F2SubTop.G), Vertex.getVertex_(F2SubTop.S29));
        createBothSides(Vertex.getVertex_(F2SubTop.G1), Vertex.getVertex_(F2SubTop.H1));
        createBothSides(Vertex.getVertex_(F2SubTop.G1), Vertex.getVertex_(F2SubTop.S33));
        createBothSides(Vertex.getVertex_(F2SubTop.H), Vertex.getVertex_(F2SubTop.G));
        createBothSides(Vertex.getVertex_(F2SubTop.H), Vertex.getVertex_(F2SubTop.S28));
        createBothSides(Vertex.getVertex_(F2SubTop.H1), Vertex.getVertex_(F2SubTop.I1));
        createBothSides(Vertex.getVertex_(F2SubTop.H1), Vertex.getVertex_(F2SubTop.S34));
        createBothSides(Vertex.getVertex_(F2SubTop.I), Vertex.getVertex_(F2SubTop.A));
        createBothSides(Vertex.getVertex_(F2SubTop.I1), Vertex.getVertex_(F2SubTop.J1));
        createBothSides(Vertex.getVertex_(F2SubTop.J), Vertex.getVertex_(F2SubTop.ES7));
        createBothSides(Vertex.getVertex_(F2SubTop.J), Vertex.getVertex_(F2SubTop.W7));
        createBothSides(Vertex.getVertex_(F2SubTop.J1), Vertex.getVertex_(F2SubTop.ES8));
        createBothSides(Vertex.getVertex_(F2SubTop.K), Vertex.getVertex_(F2SubTop.c1));
        createBothSides(Vertex.getVertex_(F2SubTop.K1), Vertex.getVertex_(F2SubTop.E));
        createBothSides(Vertex.getVertex_(F2SubTop.K1), Vertex.getVertex_(F2SubTop.W8));
        createBothSides(Vertex.getVertex_(F2SubTop.K1), Vertex.getVertex_(F2SubTop.c4));
        createBothSides(Vertex.getVertex_(F2SubTop.L), Vertex.getVertex_(F2SubTop.N));
        createBothSides(Vertex.getVertex_(F2SubTop.L), Vertex.getVertex_(F2SubTop.Y));
        createBothSides(Vertex.getVertex_(F2SubTop.L1), Vertex.getVertex_(F2SubTop.M1));
        createBothSides(Vertex.getVertex_(F2SubTop.L1), Vertex.getVertex_(F2SubTop.c4));
        createBothSides(Vertex.getVertex_(F2SubTop.M1), Vertex.getVertex_(F2SubTop.N1));
        createBothSides(Vertex.getVertex_(F2SubTop.N), Vertex.getVertex_(F2SubTop.O));
        createBothSides(Vertex.getVertex_(F2SubTop.N), Vertex.getVertex_(F2SubTop.W));
        createBothSides(Vertex.getVertex_(F2SubTop.N), Vertex.getVertex_(F2SubTop.WT7));
        createBothSides(Vertex.getVertex_(F2SubTop.N1), Vertex.getVertex_(F2SubTop.O1));
        createBothSides(Vertex.getVertex_(F2SubTop.O), Vertex.getVertex_(F2SubTop.P));
        createBothSides(Vertex.getVertex_(F2SubTop.O), Vertex.getVertex_(F2SubTop.V));
        createBothSides(Vertex.getVertex_(F2SubTop.O1), Vertex.getVertex_(F2SubTop.P1));
        createBothSides(Vertex.getVertex_(F2SubTop.O1), Vertex.getVertex_(F2SubTop.q1));
        createBothSides(Vertex.getVertex_(F2SubTop.P), Vertex.getVertex_(F2SubTop.T));
        createBothSides(Vertex.getVertex_(F2SubTop.P), Vertex.getVertex_(F2SubTop.WT3));
        createBothSides(Vertex.getVertex_(F2SubTop.P1), Vertex.getVertex_(F2SubTop.E14));
        createBothSides(Vertex.getVertex_(F2SubTop.P1), Vertex.getVertex_(F2SubTop.R1));
        createBothSides(Vertex.getVertex_(F2SubTop.P1), Vertex.getVertex_(F2SubTop.c4));
        createBothSides(Vertex.getVertex_(F2SubTop.Q), Vertex.getVertex_(F2SubTop.R));
        createBothSides(Vertex.getVertex_(F2SubTop.Q), Vertex.getVertex_(F2SubTop.WT3));
        createBothSides(Vertex.getVertex_(F2SubTop.R), Vertex.getVertex_(F2SubTop.B4));
        createBothSides(Vertex.getVertex_(F2SubTop.R), Vertex.getVertex_(F2SubTop.W3));
        createBothSides(Vertex.getVertex_(F2SubTop.R1), Vertex.getVertex_(F2SubTop.T1));
        createBothSides(Vertex.getVertex_(F2SubTop.R1), Vertex.getVertex_(F2SubTop.WT8));
        createBothSides(Vertex.getVertex_(F2SubTop.S), Vertex.getVertex_(F2SubTop.W3));
        createBothSides(Vertex.getVertex_(F2SubTop.S17), Vertex.getVertex_(F2SubTop.S18));
        createBothSides(Vertex.getVertex_(F2SubTop.S17), Vertex.getVertex_(F2SubTop.T));
        createBothSides(Vertex.getVertex_(F2SubTop.S18), Vertex.getVertex_(F2SubTop.S19));
        createBothSides(Vertex.getVertex_(F2SubTop.S21), Vertex.getVertex_(F2SubTop.S22));
        createBothSides(Vertex.getVertex_(F2SubTop.S22), Vertex.getVertex_(F2SubTop.S23));
        createBothSides(Vertex.getVertex_(F2SubTop.S22), Vertex.getVertex_(F2SubTop.Y1));
        createBothSides(Vertex.getVertex_(F2SubTop.S23), Vertex.getVertex_(F2SubTop.e4));
        createBothSides(Vertex.getVertex_(F2SubTop.S24), Vertex.getVertex_(F2SubTop.V1));
        createBothSides(Vertex.getVertex_(F2SubTop.S25), Vertex.getVertex_(F2SubTop.S26));
        createBothSides(Vertex.getVertex_(F2SubTop.S26), Vertex.getVertex_(F2SubTop.S27));
        createBothSides(Vertex.getVertex_(F2SubTop.S28), Vertex.getVertex_(F2SubTop.S29));
        createBothSides(Vertex.getVertex_(F2SubTop.S29), Vertex.getVertex_(F2SubTop.S33));
        createBothSides(Vertex.getVertex_(F2SubTop.S30), Vertex.getVertex_(F2SubTop.M1));
        createBothSides(Vertex.getVertex_(F2SubTop.S30), Vertex.getVertex_(F2SubTop.S31));
        createBothSides(Vertex.getVertex_(F2SubTop.S31), Vertex.getVertex_(F2SubTop.N1));
        createBothSides(Vertex.getVertex_(F2SubTop.S31), Vertex.getVertex_(F2SubTop.S32));
        createBothSides(Vertex.getVertex_(F2SubTop.S32), Vertex.getVertex_(F2SubTop.O1));
        createBothSides(Vertex.getVertex_(F2SubTop.SC2), Vertex.getVertex_(F2SubTop.c1));
        createBothSides(Vertex.getVertex_(F2SubTop.SC3), Vertex.getVertex_(F2SubTop.V1));
        createBothSides(Vertex.getVertex_(F2SubTop.T), Vertex.getVertex_(F2SubTop.U));
        createBothSides(Vertex.getVertex_(F2SubTop.T1), Vertex.getVertex_(F2SubTop.E15));
        createBothSides(Vertex.getVertex_(F2SubTop.T1), Vertex.getVertex_(F2SubTop.w1));
        createBothSides(Vertex.getVertex_(F2SubTop.U), Vertex.getVertex_(F2SubTop.S20));
        createBothSides(Vertex.getVertex_(F2SubTop.U), Vertex.getVertex_(F2SubTop.V));
        createBothSides(Vertex.getVertex_(F2SubTop.U1), Vertex.getVertex_(F2SubTop.s1));
        createBothSides(Vertex.getVertex_(F2SubTop.U1), Vertex.getVertex_(F2SubTop.w1));
        createBothSides(Vertex.getVertex_(F2SubTop.V), Vertex.getVertex_(F2SubTop.SC1));
        createBothSides(Vertex.getVertex_(F2SubTop.V), Vertex.getVertex_(F2SubTop.W));
        createBothSides(Vertex.getVertex_(F2SubTop.V1), Vertex.getVertex_(F2SubTop.U1));
        createBothSides(Vertex.getVertex_(F2SubTop.W), Vertex.getVertex_(F2SubTop.X));
        createBothSides(Vertex.getVertex_(F2SubTop.WT12), Vertex.getVertex_(F2SubTop.e1));
        createBothSides(Vertex.getVertex_(F2SubTop.WT3), Vertex.getVertex_(F2SubTop.S18));
        createBothSides(Vertex.getVertex_(F2SubTop.WT7), Vertex.getVertex_(F2SubTop.X));
        createBothSides(Vertex.getVertex_(F2SubTop.WT9), Vertex.getVertex_(F2SubTop.W7));
        createBothSides(Vertex.getVertex_(F2SubTop.X), Vertex.getVertex_(F2SubTop.Y));
        createBothSides(Vertex.getVertex_(F2SubTop.X1), Vertex.getVertex_(F2SubTop.E17));
        createBothSides(Vertex.getVertex_(F2SubTop.X1), Vertex.getVertex_(F2SubTop.Y1));
        createBothSides(Vertex.getVertex_(F2SubTop.X1), Vertex.getVertex_(F2SubTop.w1));
        createBothSides(Vertex.getVertex_(F2SubTop.Y), Vertex.getVertex_(F2SubTop.S27));
        createBothSides(Vertex.getVertex_(F2SubTop.Y), Vertex.getVertex_(F2SubTop.Z));
        createBothSides(Vertex.getVertex_(F2SubTop.Y1), Vertex.getVertex_(F2SubTop.WT4));
        createBothSides(Vertex.getVertex_(F2SubTop.Y1), Vertex.getVertex_(F2SubTop.Z1));
        createBothSides(Vertex.getVertex_(F2SubTop.Z), Vertex.getVertex_(F2SubTop.S26));
        createBothSides(Vertex.getVertex_(F2SubTop.Z1), Vertex.getVertex_(F2SubTop.E18));
        createBothSides(Vertex.getVertex_(F2SubTop.c1), Vertex.getVertex_(F2SubTop.d1));
        createBothSides(Vertex.getVertex_(F2SubTop.c4), Vertex.getVertex_(F2SubTop.E13));
        createBothSides(Vertex.getVertex_(F2SubTop.d1), Vertex.getVertex_(F2SubTop.e1));
        createBothSides(Vertex.getVertex_(F2SubTop.e1), Vertex.getVertex_(F2SubTop.F1));
        createBothSides(Vertex.getVertex_(F2SubTop.e4), Vertex.getVertex_(F2SubTop.Z1));
        createBothSides(Vertex.getVertex_(F2SubTop.q1), Vertex.getVertex_(F2SubTop.R1));
        createBothSides(Vertex.getVertex_(F2SubTop.q1), Vertex.getVertex_(F2SubTop.s1));
        createBothSides(Vertex.getVertex_(F2SubTop.s1), Vertex.getVertex_(F2SubTop.T1));
        createBothSides(Vertex.getVertex_(F2SubTop.w1), Vertex.getVertex_(F2SubTop.E16));
        createBothSides(Vertex.getVertex_(F2SubTop.WT4), Vertex.getVertex_(F2SubTop.Z1));
        createBothSides(Vertex.getVertex_(F2SubTop.L1), Vertex.getVertex_(F2SubTop.ES8));
        createBothSides(Vertex.getVertex_(F2SubTop.B1), Vertex.getVertex_(F2SubTop.ES7));

        //extend edges added
        createBothSides(Vertex.getVertex_(F2SubTop.ET1), Vertex.getVertex_(F2SubTop.X));
        createBothSides(Vertex.getVertex_(F2SubTop.ET1), Vertex.getVertex_(F2SubTop.ET6));
        createBothSides(Vertex.getVertex_(F2SubTop.ET6), Vertex.getVertex_(F2SubTop.W));
        createBothSides(Vertex.getVertex_(F2SubTop.ET6), Vertex.getVertex_(F2SubTop.ET2));
        createBothSides(Vertex.getVertex_(F2SubTop.ET2), Vertex.getVertex_(F2SubTop.V));
        createBothSides(Vertex.getVertex_(F2SubTop.ET2), Vertex.getVertex_(F2SubTop.SC1));
        createBothSides(Vertex.getVertex_(F2SubTop.ET2), Vertex.getVertex_(F2SubTop.S20));
        createBothSides(Vertex.getVertex_(F2SubTop.ET5), Vertex.getVertex_(F2SubTop.S29));
        createBothSides(Vertex.getVertex_(F2SubTop.ET5), Vertex.getVertex_(F2SubTop.c1));
        createBothSides(Vertex.getVertex_(F2SubTop.ET5), Vertex.getVertex_(F2SubTop.S33));
        createBothSides(Vertex.getVertex_(F2SubTop.ET5), Vertex.getVertex_(F2SubTop.SC2));
        createBothSides(Vertex.getVertex_(F2SubTop.ET4), Vertex.getVertex_(F2SubTop.V1));
        createBothSides(Vertex.getVertex_(F2SubTop.ET4), Vertex.getVertex_(F2SubTop.s1));
        createBothSides(Vertex.getVertex_(F2SubTop.ET4), Vertex.getVertex_(F2SubTop.ET3));
        createBothSides(Vertex.getVertex_(F2SubTop.ET3), Vertex.getVertex_(F2SubTop.q1));
        createBothSides(Vertex.getVertex_(F2SubTop.S24), Vertex.getVertex_(F2SubTop.ET7));


    }


    
    
    
    
    
    public static void main(String[] args) {
        Vertex.loadVertex_();
        loadEdge_();
        addlist();
    }
}
