package com.Path.Dijkstra.SubGraph;

/**
 * Created by Panda on 2015/8/15.
 */
import java.io.*;

public class LoadVertex {

    public static void LoadVertexs(String dir) {
        String[] temp;
        File file = new File(dir);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                temp = tempString.split(" ");
                Vertex.createVertex(temp[0],Double.parseDouble(temp[1]),Double.parseDouble(temp[2]),
                           Double.parseDouble(temp[3]));
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
