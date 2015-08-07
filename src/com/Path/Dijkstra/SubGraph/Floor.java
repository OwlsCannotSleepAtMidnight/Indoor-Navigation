package com.Path.Dijkstra.SubGraph;

import com.Obstacle.Cross;
import com.Path.DefinedVertex.F1SubBottom;
import com.Path.DefinedVertex.SubNumber;

import java.util.*;

/**
 * Created by toy on 15-5-10.
 */
public abstract class Floor {
    protected SubNumber _sub_no;
    protected static HashMap<Vertex, List> _set_of_ve = new HashMap<Vertex, List>();

    public static final int left_up = 0;
    public static final int left_down = 1;
    public static final int right_up = 2;
    public static final int right_down = 3;

    protected static Dictionary _instance = new Hashtable();

    public SubNumber getSubNum(){
        return _sub_no;
    }

    protected void store(){
        _instance.put(this.getSubNum(), this);
    }

    public Floor() {

        // init vertex
        // init route
    }


    protected abstract List getEdges_();

    public static void initializeRelationships(List<Edge> edges){
        for(Edge each: edges){
            if(!_set_of_ve.keySet().contains(each.getFrom())){
                _set_of_ve.put(each.getFrom(),new ArrayList<Edge>());
            }
            _set_of_ve.get(each.getFrom()).add(each);
        }
    }

    protected Vertex hasVertex_(Vertex v, HashMap<Vertex, List> ve){
        for(Vertex each: ve.keySet()){
            if(each.equalPosition(v, 0.01))
                return each;
        }
        return null;
    }

    protected static double getDistance(Vertex v1, Vertex v2){
        return Math.sqrt(Math.pow(v1.getX() - v2.getX(), 2) + Math.pow(v1.getY() - v2.getY(), 2));
    }

    protected static Vertex minDistance(Vertex v, List<Vertex> v_set){
        double min_distance = 10000;
        Vertex closed_vertex = null;
        double distance;
        for(Vertex each: v_set){
            if((distance = getDistance(v, each)) < min_distance){
                min_distance = distance;
                closed_vertex = each;
            }
        }
        return closed_vertex;
    }

    protected static HashMap<Integer, List> classifyVertex(Vertex v, HashMap<Vertex, List> ve){
        List<Vertex> l_u = new ArrayList<Vertex>();
        List<Vertex> l_d = new ArrayList<Vertex>();
        List<Vertex> r_u = new ArrayList<Vertex>();
        List<Vertex> r_d = new ArrayList<Vertex>();

        for(Vertex each: ve.keySet()){
            if(each == v)
                continue;
            if(each.getX() >= v.getX() && each.getY() >= v.getY()){
                r_u.add(each);
            }

            if(each.getX() >= v.getX() && each.getY() < v.getY()){
                r_d.add(each);
            }

            if(each.getX() < v.getX() && each.getY() >= v.getY()){
                l_u.add(each);
            }

            if(each.getX() < v.getX() && each.getY() < v.getY()){
                l_d.add(each);
            }
        }
        HashMap<Integer, List> map = new HashMap<Integer, List>();
        map.put(left_up, l_u);
        map.put(left_down, l_d);
        map.put(right_up, r_u);
        map.put(right_down, r_d);
        return map;

    }

    static HashMap<Vertex, List> addEdge(Vertex v1, Vertex v2, HashMap<Vertex, List> ve){
        if(!Cross.IsOverObstacle(v1, v2))
            ve.get(v1).add(new Edge(v1, v2));
        return ve;
    }

    protected HashMap<Vertex, List> setAuxRight(Vertex start, Vertex up, Vertex down, HashMap<Vertex, List> ve){

        Vertex aux_right;
        if(up.getY() == start.getY()) {
                ve = addEdge(start, up, ve);
            // ve =  addEdge((up, start)))
        }

        else if(up.getX() == down.getX()){
            aux_right = new Vertex("aux_right", up.getX(), start.getY(), start.getZ());
            ve.put(aux_right, new ArrayList());
            ve =  addEdge(start, aux_right, ve);
            ve =  addEdge(aux_right, up, ve);
            ve =  addEdge(aux_right, down, ve);

        }
        else if(up.getX() <= down.getX()){
            aux_right = new Vertex("aux_right", up.getX(), start.getY(), start.getZ());
            ve.put(aux_right, new ArrayList());
            ve =  addEdge(start, aux_right, ve);
            ve =  addEdge(aux_right, up, ve);
            Vertex aux_right2 = new Vertex("aux_right2", up.getX(), down.getY(), start.getZ());
            ve.put(aux_right2, new ArrayList());
            ve =  addEdge(aux_right, aux_right2, ve);
            ve =  addEdge(aux_right, down, ve);


        }else{
            aux_right = new Vertex("aux_right", down.getX(), start.getY(), start.getZ());
            ve.put(aux_right, new ArrayList());
            ve =  addEdge(start, aux_right, ve);
            Vertex aux_right2 = new Vertex("aux_right2", down.getX(), up.getY(), start.getZ());
            ve.put(aux_right2, new ArrayList());
            ve =  addEdge(aux_right, down, ve);
            ve =  addEdge(aux_right, aux_right2, ve);
            ve =  addEdge(aux_right, up, ve);
        }

        return ve;

    }

    protected HashMap<Vertex, List> setAuxLeft(Vertex start, Vertex up, Vertex down, HashMap<Vertex, List> ve){

        Vertex aux_left;
        if(up.getY() == start.getY()) {
            ve =  addEdge(start, up, ve);
            // ve =  addEdge(up, start, ve);
        }

        else if(up.getX() == down.getX()){
            aux_left = new Vertex("aux_left", up.getX(), start.getY(), start.getZ());
            ve.put(aux_left, new ArrayList());
            ve =  addEdge(start, aux_left, ve);
            ve =  addEdge(aux_left, up, ve);
            ve =  addEdge(aux_left, down, ve);

        }
        else if(up.getX() >= down.getX()){
            aux_left = new Vertex("aux_left", up.getX(), start.getY(), start.getZ());
            ve.put(aux_left, new ArrayList());
            ve =  addEdge(start, aux_left, ve);
            Vertex aux_left2 = new Vertex("aux_left2", up.getX(), down.getY(), start.getZ());
            ve.put(aux_left2, new ArrayList());
            ve =  addEdge(aux_left, up, ve);
            ve =  addEdge(aux_left, aux_left2, ve);
            ve =  addEdge(aux_left, down, ve);

        }else{
            aux_left = new Vertex("aux_left", down.getX(), start.getY(), start.getZ());
            ve.put(aux_left, new ArrayList());
            ve =  addEdge(start, aux_left, ve);
            Vertex aux_left2 = new Vertex("aux_left2", down.getX(), up.getY(), start.getZ());
            ve.put(aux_left2, new ArrayList());
            ve =  addEdge(aux_left, down, ve);
            ve =  addEdge(aux_left, aux_left2, ve);
            ve =  addEdge(aux_left, up, ve);
        }

        return ve;

    }
    protected HashMap<Vertex, List> setAuxUp(Vertex start, Vertex left, Vertex right, HashMap<Vertex, List> ve){

        Vertex aux_up;
        if(right.getX() == start.getX()) {
            ve =  addEdge(start, right, ve);
            // ve =  addEdge(up, start, ve);
        }

        else if(right.getY() == left.getY()){
            aux_up = new Vertex("aux_up", start.getX(), right.getY(), start.getZ());
            ve.put(aux_up, new ArrayList());
            ve =  addEdge(start, aux_up, ve);
            ve =  addEdge(aux_up, right, ve);
            ve =  addEdge(aux_up, left, ve);

        }
        else if(right.getY() <= left.getY()){
            aux_up = new Vertex("aux_up", start.getX(), right.getY(), start.getZ());
            ve.put(aux_up, new ArrayList());
            ve =  addEdge(start, aux_up, ve);
            Vertex aux_up2 = new Vertex("aux_up2", left.getX(), right.getY(), start.getZ());
            ve.put(aux_up2, new ArrayList());
            ve =  addEdge(aux_up, right, ve);
            ve =  addEdge(aux_up, aux_up2, ve);
            ve =  addEdge(aux_up, left, ve);

        }else{
            aux_up = new Vertex("aux_up", start.getX(), left.getY(), start.getZ());
            ve.put(aux_up, new ArrayList());
            ve =  addEdge(start, aux_up, ve);
            Vertex aux_up2 = new Vertex("aux_up2", right.getX(), left.getY(), start.getZ());
            ve.put(aux_up2, new ArrayList());
            ve =  addEdge(aux_up, left, ve);
            ve =  addEdge(aux_up, aux_up2, ve);
            ve =  addEdge(aux_up, right, ve);
        }

        return ve;

    }

    protected HashMap<Vertex, List> setAuxDown(Vertex start, Vertex left, Vertex right, HashMap<Vertex, List> ve){

        Vertex aux_down;
        if(right.getX() == start.getX()) {
            ve =  addEdge(start, right, ve);
            // ve =  addEdge(up, start, ve);
        }

        else if(right.getY() == left.getY()){
            aux_down = new Vertex("aux_down", start.getX(), right.getY(), start.getZ());
            ve.put(aux_down, new ArrayList());
            ve =  addEdge(start, aux_down, ve);
            ve =  addEdge(aux_down, right, ve);
            ve =  addEdge(aux_down, left, ve);

        }
        else if(right.getY() >= left.getY()){
            aux_down = new Vertex("aux_down", start.getX(), right.getY(), start.getZ());
            ve.put(aux_down, new ArrayList());
            ve =  addEdge(start, aux_down, ve);
            Vertex aux_down2 = new Vertex("aux_down2", left.getX(), right.getY(), start.getZ());
            ve.put(aux_down2, new ArrayList());
            ve =  addEdge(aux_down, right, ve);
            ve =  addEdge(aux_down, aux_down2, ve);
            ve =  addEdge(aux_down, left, ve);

        }else{
            aux_down = new Vertex("aux_down", start.getX(), left.getY(), start.getZ());
            ve.put(aux_down, new ArrayList());
            ve =  addEdge(start, aux_down, ve);
            Vertex aux_down2 = new Vertex("aux_down2", right.getX(), left.getY(), start.getZ());
            ve.put(aux_down2, new ArrayList());
            ve =  addEdge(aux_down, left, ve);
            ve =  addEdge(aux_down, aux_down2, ve);
            ve =  addEdge(aux_down, right, ve);
        }
        return ve;
    }

    protected HashMap<Vertex, List> setAuxVandR(Vertex start, HashMap<Vertex, List> ve){
        HashMap<Integer, List> map = classifyVertex(start, ve);
        Vertex closed[] = new Vertex[4];
        closed[right_up] = minDistance(start, map.get(right_up));
        closed[left_up] = minDistance(start, map.get(left_up));
        closed[right_down] = minDistance(start, map.get(right_down));
        closed[left_down] = minDistance(start, map.get(left_down));

        ve = setAuxRight(start, closed[right_up], closed[right_down], ve);
        ve = setAuxLeft(start, closed[left_up], closed[left_down], ve);
        ve = setAuxUp(start, closed[left_up], closed[right_up], ve);
        ve = setAuxDown(start, closed[left_down], closed[right_down], ve);


        return ve;


    }


    protected String calculatePath(Vertex start, Vertex end, HashMap<Vertex, List> ve){
        Vertex fake_start;
        Vertex fake_end;
        if(!Cross.IsOverObstacle(start, end)){
            return start.getString() +"," + end.getString();
        }

        if((fake_start = hasVertex_(start, ve)) != null) {
            start = fake_start;
        }
        else {
            ve.put(start, new ArrayList());
            ve = setAuxVandR(start, ve);

        }
        if((fake_end = hasVertex_(end, ve)) != null) {
            end = fake_end;
        }
        else {
            ve.put(end, new ArrayList());
            ve = setAuxVandR(end, ve);

        }

        return Graph.showPath(start, end, ve);
    }


    public String showPath(Vertex start, Vertex end){
       return calculatePath(start, end, _set_of_ve);
    }

    public static void loadFloor(){
        initializeRelationships(Edge.Edge_B1());
        initializeRelationships(Edge.Edge_F1Bottom());
        initializeRelationships(Edge.Edge_F1Left());
        initializeRelationships(Edge.Edge_F1Right());
        initializeRelationships(Edge.Edge_F2Bottom());
        initializeRelationships(Edge.Edge_F2Top());
        initializeRelationships(Edge.Edge_F2Center());

        new FloorB1().store();
        new FloorF1Bottom().store();
        new FloorF1Left().store();
        new FloorF1Right().store();
        new FloorF2Top().store();
        new FloorF2Bottom().store();
        new FloorF2Center().store();
    }

    public static Floor getFloor(SubNumber sub){
        return (Floor)_instance.get(sub);
    }

    public static void main(String[] args) {
        LoadMethod.loadAll();
        Floor floor = FloorB1.getFloor(SubNumber.B1Sub);
       // Vertex s = new Vertex("sb", 0.5176, 0.1984, 1);
       // Vertex e = new Vertex("end", 0.5176, 0.2801, 1);
        Vertex s = Vertex.getVertex_(F1SubBottom.X3);
        Vertex e = Vertex.getVertex_(F1SubBottom.Q2);
        floor.showPath(s, e);
        floor.showPath(s, e);
        System.out.println(floor.showPath(s, e));

        System.out.println("done");

    }

    public SubNumber getSubNO(){
        return _sub_no;
    }


}
