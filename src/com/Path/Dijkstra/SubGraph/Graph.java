package com.Path.Dijkstra.SubGraph;

import java.util.*;

/**
 * Created by toy on 4/22/15.
 */
public class Graph {
    ArrayList<Edge> way = new ArrayList<Edge>();
    ArrayList<Vertex> pin= new ArrayList<Vertex>();
    HashMap<Vertex,ArrayList> link = new HashMap<Vertex, ArrayList>();
    HashSet<Vertex> set =new HashSet<Vertex>();

    public ArrayList<Vertex> GetPin(){
        return pin;
    }
    

    public void AddRoute(Vertex f, Vertex t, double w){
        Edge tmp1 = new Edge(f,t,w);
        Edge tmp2 = new Edge(t,f,w);
        if(!link.keySet().contains(f))
        {
            ArrayList<Edge> tmpe = new ArrayList<Edge>();
            link.put(f,tmpe);
            link.get(f).add(tmp1);
        }
        else
            link.get(f).add(tmp1);
        if(!link.keySet().contains(t))
        {
            ArrayList<Edge> tmpe = new ArrayList<Edge>();
            link.put(t,tmpe);
            link.get(t).add(tmp2);
        }
        else
            link.get(t).add(tmp2);
    }
    public void AddVertex(int i, Vertex v){
        pin.add(i,v);
    }
    public void AddVertex(int i, String n, double x, double y, double z){
        Vertex tmp = new Vertex(n,x,y,z);
        AddVertex(i,tmp);
    }

    public Vertex GetVertex(int i) {
        return pin.get(i);
    }
    public Vertex GetVertexByName(String n){
        for(Vertex v:pin){
            if(v.GetName().equals(n)){
                return v;
            }
        }
        return null;
    }
    public Edge min_value(){
        double min = 9999;
        Edge min_edge = null;
        Iterator<Vertex> it=set.iterator();
        while(it.hasNext()) {
            Vertex current_v = it.next();
            ArrayList<Edge> list=link.get(current_v);
            for (int i=0;i<list.size();i++) {
                Vertex to = list.get(i).GetTo();
                    if (!set.contains(to)) {
                        double to_cost = list.get(i).GetWeight()+current_v.GetCost();
                        if (to.GetCost() > to_cost) {
                            to.SetCost(to_cost);

                        }
                        if(min>to_cost) {
                            min = to.GetCost();
                            min_edge = list.get(i);
                        }
                    }

            }
        }
        return min_edge;
    }

    public Stack<Edge> dijkstra_algorithm(Vertex start, Vertex end){
        Stack<Edge> shortestpath = new Stack<Edge>();
        Vertex p = start;
        start.SetCost(0);
        int counter=0;
        while(p != end){
            set.add(p);
            Edge min_edge = min_value();
            shortestpath.push(min_edge);
            p = min_edge.GetTo();
            if(p==null) {
                break;
            }
        }
        return shortestpath;

    }
    public ArrayList<Vertex> shortest_path(Vertex start,Vertex end,Stack<Edge> sp){
        ArrayList<Vertex> list = new ArrayList<Vertex>();
        Vertex next = end;
        while(sp.size()>0){
            Edge tmp = sp.pop();
            if(tmp.GetTo().equals(next)){
                list.add(next);
                next = tmp.GetFrom();
            }
            if(next.equals(start)) {
                list.add(next);
                break;
            }
        }
        return list;
    }

    public String GetString(ArrayList<Vertex> list){
        String path = new String();
        for(int i = list.size()-1;i>=0;i--){
            path += list.get(i).GetString();
            path += ",";
        }
        return path;
    }

    public String run(Vertex start, Vertex end){

        return GetString(shortest_path(start,end,dijkstra_algorithm(start,end)));
    }

    public ArrayList<Vertex> OutputVxt(Vertex start, Vertex end){
        return shortest_path(start,end,dijkstra_algorithm(start,end));
    }
}
