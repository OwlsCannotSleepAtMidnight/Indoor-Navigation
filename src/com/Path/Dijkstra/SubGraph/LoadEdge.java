package com.Path.Dijkstra.SubGraph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Panda on 2015/8/15.
 */
public class LoadEdge {
    public static void LoadEdges(String edgeDir){
        String[] temp;
        File file = new File(edgeDir);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                temp = tempString.split(" ");
                Edge.createBothSides(Vertex.getVertex_(temp[0]), Vertex.getVertex_(temp[1]));
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
    }
    }

