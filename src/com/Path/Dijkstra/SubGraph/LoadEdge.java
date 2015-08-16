
package com.Path.Dijkstra.SubGraph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Panda on 2015/8/15.
 */
public class LoadEdge {
    public static ArrayList<Edge> LoadEdges(String edgeDir){
        String[] temp;
        ArrayList<Edge> alist = new ArrayList<Edge>();
        File file = new File(edgeDir);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                temp = tempString.split(" ");
                //Edge.createBothSides(Vertex.getVertex_(temp[0]), Vertex.getVertex_(temp[1]));
                if(Edge.getEdge_(Vertex.getVertex_(temp[0]), Vertex.getVertex_(temp[1])) == null) {
                    alist.add(new Edge(Vertex.getVertex_(temp[0]), Vertex.getVertex_(temp[1])));
                }
                if(Edge.getEdge_(Vertex.getVertex_(temp[1]),Vertex.getVertex_(temp[0])) == null) {
                    alist.add(new Edge(Vertex.getVertex_(temp[1]), Vertex.getVertex_(temp[0])));
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }

        }
        return alist;
    }
}

