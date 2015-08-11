package com.Path.Dijkstra.SubGraph;

import java.util.*;

/**
 * Created by toy on 4/22/15.
 */
public class Graph {

    protected HashMap<Vertex, ArrayList<Edge>> _link;
    protected HashMap<Vertex, Double> _sel_points;
    protected Set _added_vertex;
    protected Stack<Edge> _sel_path;

    private Graph(HashMap map){
        _link = map;
        _sel_points = new HashMap<Vertex, Double>();
        _sel_path = new Stack<Edge>();
        _added_vertex = new HashSet<Vertex>();
    }

    public Set getaddedSet(){
        return _added_vertex;
    }

    public void addAddedSet(Vertex v){
        _added_vertex.add(v);
    }

    public void updateAddedSet(){
        for(Vertex each: _sel_points.keySet()){
            _added_vertex.add(each);
        }
    }

    public Stack<Edge> getSelEdge(){
        return _sel_path;

    }

    public void addSelEdge(Edge edge){
        if(!_sel_path.contains(edge))
            _sel_path.push(edge);
    }


    public HashMap getSelPoints(){
        return _sel_points;
    }

    public Edge getMinEdge(){
        double min_val = 9999;
        Edge min_e = null;
        for(Object each: _added_vertex){
            ArrayList<Edge> edge_list = _link.get(each);
            for(Edge this_edge: edge_list){
                Vertex  to = this_edge.getTo();
                if(!_added_vertex.contains(to)
                        || _sel_points.get(to) > _sel_points.get(each) + this_edge.getWeight()) {
                    _sel_points.put(to, _sel_points.get(each) + this_edge.getWeight());
                }
                if(min_val > _sel_points.get(to) && !_added_vertex.contains(to)){
                    min_e = this_edge;
                    min_val = _sel_points.get(to);
                }
            }

        }
        return min_e;
    }


    public static Stack<Edge> dijkstra_algorithm(Vertex start, Vertex end, HashMap map){
        Graph graph = new Graph(map);
        HashMap sel_point = graph.getSelPoints();

        sel_point.put(start, 0.0);
        graph.addAddedSet(start);
        Vertex p = start;

      //  start.setCost(0);
        while(p != end){
            Edge min_edge = graph.getMinEdge();
            if(min_edge == null)
                break;
            graph.addSelEdge(min_edge);
            p = min_edge.getTo();
            graph.addAddedSet(p);
            if(p==null) {
                break;
            }
        }
       // Vertex.initializeCost();
        return graph.getSelEdge();

    }
    public static ArrayList<Vertex> shortest_path(Vertex start,Vertex end,Stack<Edge> sp){
        ArrayList<Vertex> list = new ArrayList<Vertex>();
        Vertex next = end;
        while(sp.size()>0){
            Edge tmp = sp.pop();
            if(tmp.getTo().equals(next)){
                list.add(next);
                next = tmp.getFrom();
            }
            if(next.equals(start)) {
                list.add(next);
                break;
            }
        }
        return list;
    }

    public static String getString(ArrayList<Vertex> list){
        String path = "";
        for(int i = list.size()-1;i>=0;i--){
            path += list.get(i).getString();
            path += ",";
        }
        return path;
    }

    public static String showPath(Vertex start, Vertex end, HashMap link){

        return getString(shortest_path(start, end, dijkstra_algorithm(start, end, link)));
    }

    public ArrayList<Vertex> OutputVxt(Vertex start, Vertex end, HashMap link){
        return shortest_path(start, end, dijkstra_algorithm(start, end,link));
    }

    public static void main(String[] args) {
        System.out.println("hello sb");
        HashMap<String, Integer> abs = new HashMap<String, Integer>();
        abs.put("asd", 1);
        abs.put("asd", 2);
        System.out.println(abs.get("asd"));
   }

}
