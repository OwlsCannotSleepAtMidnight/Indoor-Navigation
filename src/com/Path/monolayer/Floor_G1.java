package com.Path.monolayer;

import com.Obstacle.Division;
import com.Path.DefinedVertex.SubNumber;
import com.Path.Dijkstra.SubGraph.*;


/**
 * Created by Panda on 2015/5/23.
 */
public class Floor_G1 {
    Vertex V_start, V_end;
    String path;
    String final_Output;



    public Floor_G1(Vertex s, Vertex e) {
        V_start = s;
        V_end = e;
    }

    public String RoutePlan() {

        if (Division.GetSubGraphNum(V_start).equals(Division.GetSubGraphNum(V_end))) {
            /*Floor subfloor = new B1SubFloor(0);

            subfloor.AnalyzeVertex(V_start.GetString(), 0);
            subfloor.AnalyzeVertex(V_end.GetString(), 1);
            subfloor.InitializeStartEnd();
            path = subfloor.GetArrList();*/
            Floor subfloor = Floor.getFloor(SubNumber.B1Sub);
            path = subfloor.showPath(V_start, V_end);
            System.out.print(path);
            final_Output = path;
        }
        return  final_Output;
    }
}
