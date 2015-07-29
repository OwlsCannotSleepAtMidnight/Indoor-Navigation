package com.Path.monolayer;

import com.Obstacle.Division;
import com.Path.DefinedVertex.SubNumber;
import com.Path.Dijkstra.SubGraph.*;

import java.util.ArrayList;

/**
 * Created by Panda on 2015/5/23.
 */
public class Floor_2 {
    Vertex V_start, V_end;
    String path;
    String final_Output;
    ArrayList<Vertex>  CommonList;


    public Floor_2(Vertex s, Vertex e) {
        V_start = s;
        V_end = e;
    }

    public String RoutePlan() {

        if (Division.GetSubGraphNum(V_start).equals(Division.GetSubGraphNum(V_end))) {
            //起点和终点在同一个子图上的路线规划
            Floor subfloor = CreateSubFloor(Division.GetSubGraphNum(V_start));
            subfloor.AnalyzeVertex(V_start.GetString(), 0);
            subfloor.AnalyzeVertex(V_end.GetString(), 1);
            subfloor.InitializeStartEnd();
            path = subfloor.GetArrList();

            System.out.print(path);
            final_Output = path;
        }
        else if(Division.GetSubGraphNum(V_start).equals(SubNumber.F2SubTop)
                && Division.GetSubGraphNum(V_end).equals(SubNumber.F2SubBottom) )
        {
            //从顶子图到底子图的路线规划
            ArrayList<Vertex>  temp1=new ArrayList<Vertex>();
            temp1.add(new Vertex("SC1",0.1971,0.5056,2));
            temp1.add(new Vertex("SC2",0.4953,0.8039,2));
            temp1.add(new Vertex("SC3",0.7975,0.5018,2));

            double minDistance_TtoM=9999;
            Vertex min_TtoM=new Vertex();
            for(int i=0;i<temp1.size();i++ )
            {
                if(GetDistance(V_start,temp1.get(i))< minDistance_TtoM) {
                    minDistance_TtoM = GetDistance(V_start, temp1.get(i));
                    min_TtoM=temp1.get(i);
                }
            }

            String path_TtoM_1, path_TtoM_2;

            //顶子图部分路线规划
            Floor  sub_top=new F2SubTopFloor(2);
            sub_top.AnalyzeVertex(V_start.GetString(), 0);
            sub_top.AnalyzeVertex(min_TtoM.GetString(), 1);
            sub_top.InitializeStartEnd();
            path_TtoM_1 = sub_top.GetArrList();


            //中子图部分和底子图部分路线规划
            Vertex TinM = GoToMiddile(min_TtoM);
            Floor_2 Route_TtoM=new Floor_2(TinM,V_end);
            path_TtoM_2=Route_TtoM.RoutePlan();

            final_Output=path_TtoM_1+path_TtoM_2;

        }
        else if(Division.GetSubGraphNum(V_start).equals(SubNumber.F2SubBottom)
                && Division.GetSubGraphNum(V_end).equals(SubNumber.F2SubTop) )
        {
            //从底子图到顶子图的路线规划
            ArrayList<Vertex>  temp2=new ArrayList<Vertex>();
            temp2.add(new Vertex("J3",0.4953,0.3806,2));
            temp2.add(new Vertex("I3",0.3760,0.3806,2));
            temp2.add(new Vertex("K3",0.6185,0.3806,2));

            double minDistance_BtoM=9999;
            Vertex min_BtoM=new Vertex();
            for(int i=0;i<temp2.size();i++ )
            {
                if(GetDistance(V_start,temp2.get(i))< minDistance_BtoM) {
                    minDistance_BtoM = GetDistance(V_start, temp2.get(i));
                    min_BtoM=temp2.get(i);
                }
            }

            String path_BtoM_1, path_BtoM_2;
            //底子图部分路线规划
            Floor  sub_top=new F2SubBottomFloor(2);
            sub_top.AnalyzeVertex(V_start.GetString(), 0);
            sub_top.AnalyzeVertex(min_BtoM.GetString(), 1);
            sub_top.InitializeStartEnd();
            path_BtoM_1 = sub_top.GetArrList();

            //中子图部分和顶子图部分路线规划
            Vertex BinM = GoToMiddile(min_BtoM);
            Floor_2 Route_BtoM=new Floor_2(BinM,V_end);
            path_BtoM_2=Route_BtoM.RoutePlan();

            final_Output=path_BtoM_1+path_BtoM_2;

        }
        else  {
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
        if (sn.equals(SubNumber.F2SubTop)) {
            return new F2SubTopFloor(2);
        }
        else if (sn.equals(SubNumber.F2SubCenter)) {
            return new F2SubCenterFloor(2);
        }
        else
            return new F2SubBottomFloor(2);
    }

    ArrayList<Vertex> CommonPoint(Floor start, Floor end)
    {
        ArrayList<Vertex>  commonList=new ArrayList<Vertex>();

        if(start.GetSubNO().equals(SubNumber.F2SubTop)&&end.equals(SubNumber.F2SubCenter)
                ||start.GetSubNO().equals(SubNumber.F2SubCenter)&&end.equals(SubNumber.F2SubTop))
        {
            //添加顶子图和中子图的公共点
            commonList.add(new Vertex("SC1",0.1971,0.5056,2));
            commonList.add(new Vertex("SC2",0.4953,0.8039,2));
            commonList.add(new Vertex("SC3",0.7975,0.5018,2));
        }
        else if((start.GetSubNO().equals(SubNumber.F2SubTop)&&end.equals(SubNumber.F1SubBottom)
                ||start.GetSubNO().equals(SubNumber.F1SubBottom)&&end.equals(SubNumber.F2SubTop)))
        {
            //由于顶子图与底子图没有公共点，要想从顶子图到底子图，必须经过中子图
            commonList.add(new Vertex("SC1",0.1971,0.5056,2));
            commonList.add(new Vertex("SC2",0.4953,0.8039,2));
            commonList.add(new Vertex("SC3",0.7975,0.5018,2));
        }
        else if ((start.GetSubNO().equals(SubNumber.F2SubCenter)&&end.equals(SubNumber.F2SubBottom)
                ||start.GetSubNO().equals(SubNumber.F2SubBottom)&&end.equals(SubNumber.F2SubCenter)))
        {
            //添加中子图和底子图的公共点
            commonList.add(new Vertex("J3",0.4953,0.3806,2));
            commonList.add(new Vertex("I3",0.3760,0.3806,2));
            commonList.add(new Vertex("K3",0.6185,0.3806,2));
        }
        return  commonList;
    }
    Vertex GoToMiddile(Vertex borderVertex){

        Vertex middleVertex;

        if(borderVertex.equals(new Vertex("SC2",0.4953,0.8039,2))){
            middleVertex = new Vertex("SC2_mid",0.4953,0.8,2);
        }
        else if(borderVertex.equals(new Vertex("SC1",0.1971,0.5056,2))){
            middleVertex = new Vertex("SC1_mid",0.198,0.5056,2);
        }
        else if(borderVertex.equals(new Vertex("SC3",0.7975,0.5018,2))){
            middleVertex = new Vertex("SC3_mid",0.79,0.5018,2);
        }
        else {
            middleVertex = new Vertex("bottomInMid", borderVertex.GetX(), borderVertex.GetY()+0.001, 2);
        }

        return middleVertex;
    }

    double GetDistance(Vertex v1, Vertex v2)
    {
        return Math.sqrt(Math.pow(v1.GetX()-v2.GetX(),2) + Math.pow(v1.GetY()-v2.GetY(),2));
    }
}
