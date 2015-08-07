package com.Path.Dijkstra.SubGraph;

import java.util.*;

/**
 * Created by toy on 4/22/15.
 */
public class Graph {

    protected static HashMap link;
    public static Edge min_value(HashSet set){
        double min = 9999;
        Edge min_edge = null;
        Iterator<Vertex> it=set.iterator();
        while(it.hasNext()) {
            Vertex current_v = it.next();
            ArrayList<Edge> list = (ArrayList)link.get(current_v);
            for (int i=0;i<list.size();i++) {
                Vertex to = list.get(i).getTo();
                    if (!set.contains(to)) {
                        double to_cost = list.get(i).getWeight()+current_v.getCost();
                        if (to.getCost() > to_cost) {
                            to.setCost(to_cost);

                        }
                        if(min>to_cost) {
                            min = to.getCost();
                            min_edge = list.get(i);
                        }
                    }

            }
        }
        return min_edge;
    }

    public static Stack<Edge> dijkstra_algorithm(Vertex start, Vertex end, HashMap map){
        Stack<Edge> shortestpath = new Stack<Edge>();
        link = map;
        HashSet<Vertex> set = new HashSet<Vertex>();
        Vertex p = start;
        start.setCost(0);
        int counter=0;
        while(p != end){
            set.add(p);
            Edge min_edge = min_value(set);
            shortestpath.push(min_edge);
            p = min_edge.getTo();
            if(p==null) {
                break;
            }
        }
        Vertex.initializeCost();
        return shortestpath;

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
        String path = new String();
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
        int _stair =2;
        Graph _path = new Graph();

   }

}
