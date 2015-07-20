package com.Path.monolayer;

import com.Obstacle.Division;
import com.Path.DefinedVertex.SubNumber;
import com.Path.Dijkstra.SubGraph.*;

import java.util.ArrayList;

/**
 * Created by Panda on 2015/5/23.
 */
public class Floor_1 {
    Vertex V_start, V_end;
    String path;
    String final_Output;
    ArrayList<Vertex>  CommonList;


    public Floor_1(Vertex s, Vertex e) {
        V_start = s;
        V_end = e;
    }

    public String RoutePlan() {

        if (Division.GetSubGraphNum(V_start).equals(Division.GetSubGraphNum(V_end))) {
            Floor subfloor = CreateSubFloor(Division.GetSubGraphNum(V_start));
            subfloor.AnalyzeVertex(V_start.GetString(), 0);
            subfloor.AnalyzeVertex(V_end.GetString(), 1);
            subfloor.InitializeStartEnd();
            path = subfloor.GetArrList();

            System.out.print(path);
            final_Output = path;
        }
        else {
            Floor S_subfloor= CreateSubFloor(Division.GetSubGraphNum(V_start));
            Floor E_subfloor= CreateSubFloor(Division.GetSubGraphNum(V_end));
            CommonList=CommonPoint(S_subfloor,E_subfloor);

            double min=9999;
            Vertex EssentialPoint=new Vertex();
            for(int i=0;i<CommonList.size();i++ )
            {
                if(GetDistance(V_start,CommonList.get(i))< min) {
                    min = GetDistance(V_start, CommonList.get(i));
                    EssentialPoint=CommonList.get(i);
                }
            }
            String path_1, path_2;
            S_subfloor.AnalyzeVertex(V_start.GetString(), 0);
            S_subfloor.AnalyzeVertex( EssentialPoint.GetString(), 1);
            S_subfloor.InitializeStartEnd();
            path_1 = S_subfloor.GetArrList();

            E_subfloor.AnalyzeVertex(EssentialPoint.GetString(), 0);
            E_subfloor.AnalyzeVertex( V_end.GetString(), 1);
            E_subfloor.InitializeStartEnd();
            path_2 = E_subfloor.GetArrList();

            final_Output=path_1+path_2;
        }
        return final_Output;
    }

    Floor CreateSubFloor(SubNumber sn) {
        if (sn.equals(SubNumber.F1SubRight)) {
            return new F1SubRightFloor(1);
        }
        else if (sn.equals(SubNumber.F1SubLeft)) {
            return new F1SubLeftFloor(1);
        }
        else
            return new F1SubBottumFloor(1);
    }

    ArrayList<Vertex> CommonPoint(Floor start, Floor end)
    {
        ArrayList<Vertex>  commonList=new ArrayList<Vertex>();

        if(start.GetSubNO().equals(SubNumber.F1SubLeft)&&end.GetSubNO().equals(SubNumber.F1SubRight)
                ||start.GetSubNO().equals(SubNumber.F1SubRight)&&end.GetSubNO().equals(SubNumber.F1SubLeft))
        {
            //??????????????????????
            commonList.add(new Vertex("K1",0.4992,0.6942,1));
            commonList.add(new Vertex("I",0.4992,0.9155,1));
            commonList.add(new Vertex("L1",0.4992,0.6288,1));
            commonList.add(new Vertex("M1",0.4992,0.4152,1));
            commonList.add(new Vertex("Z3",0.4992,0.3806,1));
        }
        else if((start.GetSubNO().equals(SubNumber.F1SubLeft)&&end.GetSubNO().equals(SubNumber.F1SubBottom)
                ||start.GetSubNO().equals(SubNumber.F1SubBottom)&&end.GetSubNO().equals(SubNumber.F1SubLeft)))
        {
            //?????????????????????
            commonList.add(new Vertex("Z3",0.4992,0.3806,1));
        }
        else if ((start.GetSubNO().equals(SubNumber.F1SubRight)&&end.GetSubNO().equals(SubNumber.F1SubBottom)
                ||start.GetSubNO().equals(SubNumber.F1SubBottom)&&end.GetSubNO().equals(SubNumber.F1SubRight)))
        {
            //?????????????????????
            commonList.add(new Vertex("Z3",0.4992,0.3806,1));
        }
        return  commonList;
    }
    double GetDistance(Vertex v1, Vertex v2)
    {
        return Math.sqrt(Math.pow(v1.GetX()-v2.GetX(),2) + Math.pow(v1.GetY()-v2.GetY(),2));
    }
}
