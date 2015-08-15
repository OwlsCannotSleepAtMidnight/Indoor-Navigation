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
    ArrayList<Vertex> tmpInside = new ArrayList<Vertex>();



    public Floor_1(Vertex s, Vertex e) {
        //传入参数起点s 和终点e
        V_start = s;
        V_end = e;
    }

    public String RoutePlan() {

        if (Division.GetSubGraphNum(V_start).equals(Division.GetSubGraphNum(V_end))) {
            Floor subfloor = CreateSubFloor(Division.GetSubGraphNum(V_start));
            path = subfloor.showPath(V_start, V_end);
            //subfloor.AnalyzeVertex(V_start.GetString(), 0);
           // subfloor.AnalyzeVertex(V_end.GetString(), 1);
           // subfloor.InitializeStartEnd();
           // path = subfloor.GetArrList();

           // System.out.print(path);
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
                if (inRectangle(CommonList.get(i), V_start, V_end))
                    tmpInside.add(CommonList.get(i));

                if(GetDistance(V_start,CommonList.get(i))< min) {
                    min = GetDistance(V_start, CommonList.get(i));
                    EssentialPoint=CommonList.get(i);
                }
            }

            if (!tmpInside.isEmpty()) {
                double insideMin = 999;
                for (int i = 0; i < tmpInside.size(); i++) {
                    if (GetDistance(V_start, tmpInside.get(i)) < insideMin) {
                        insideMin = GetDistance(V_start, tmpInside.get(i));
                        EssentialPoint = tmpInside.get(i);
                    }
                }
            }



            String path_1, path_2;
            path_1 = S_subfloor.showPath(V_start, EssentialPoint);
            //S_subfloor.AnalyzeVertex(V_start.GetString(), 0);
            //S_subfloor.AnalyzeVertex( EssentialPoint.GetString(), 1);
            //S_subfloor.InitializeStartEnd();
            //path_1 = S_subfloor.GetArrList();

            path_2 = E_subfloor.showPath(EssentialPoint , V_end);
           // E_subfloor.AnalyzeVertex(EssentialPoint.GetString(), 0);
          //  E_subfloor.AnalyzeVertex( V_end.GetString(), 1);
         //   E_subfloor.InitializeStartEnd();
         //   path_2 = E_subfloor.GetArrList();

            final_Output=path_1+path_2;
        }
        return final_Output;
    }

    Floor CreateSubFloor(SubNumber sn) {
        if (sn.equals(SubNumber.F1SubRight)) {
            return Floor.getFloor(SubNumber.F1SubRight);
           // return new F1SubRightFloor(1);
        }
        else if (sn.equals(SubNumber.F1SubLeft)) {
            return Floor.getFloor(SubNumber.F1SubLeft);
          //  return new F1SubLeftFloor(1);
        }
        else
            return Floor.getFloor(SubNumber.F1SubBottom);
           // return new F1SubBottomFloor(1);
    }

    ArrayList<Vertex> CommonPoint(Floor start, Floor end)
    {
        ArrayList<Vertex>  commonList=new ArrayList<Vertex>();

        if(start.getSubNO().equals(SubNumber.F1SubLeft)&&end.getSubNO().equals(SubNumber.F1SubRight)
                ||start.getSubNO().equals(SubNumber.F1SubRight)&&end.getSubNO().equals(SubNumber.F1SubLeft))
        {
            //左子图与右子图的公共点
            commonList.add(new Vertex("K1",0.4992,0.6942,1));
            commonList.add(new Vertex("I",0.4992,0.9155,1));
            commonList.add(new Vertex("L1",0.4992,0.6288,1));
            commonList.add(new Vertex("M1",0.4992,0.4152,1));
            commonList.add(new Vertex("EBP1", 0.4992, 0.5018,1));
            commonList.add(new Vertex ("EBP2",0.4492, 0.8636, 1));
        }
        else if((start.getSubNO().equals(SubNumber.F1SubLeft)&&end.getSubNO().equals(SubNumber.F1SubBottom)
                ||start.getSubNO().equals(SubNumber.F1SubBottom)&&end.getSubNO().equals(SubNumber.F1SubLeft)))
        {
            //左子图与底子图的公共点
            commonList.add(new Vertex("Z3",0.4992,0.3806,1));
        }
        else if ((start.getSubNO().equals(SubNumber.F1SubRight)&&end.getSubNO().equals(SubNumber.F1SubBottom)
                ||start.getSubNO().equals(SubNumber.F1SubBottom)&&end.getSubNO().equals(SubNumber.F1SubRight)))
        {
            //右子图与底子图的公共点
            commonList.add(new Vertex("Z3",0.4992,0.3806,1));
        }
        return  commonList;
    }

    boolean inRectangle(Vertex v, Vertex s, Vertex e){

        boolean inside = false;

        if(s.getX() <= e.getX()){
            if(v.getX()>s.getX() && v.getX()<e.getX() && v.getY()>s.getY() && v.getY()<e.getY()){
                inside = true;
            }
            else if(v.getX()>s.getX() && v.getX()<e.getX() && v.getY()<s.getY() && v.getY()>e.getY() ){
                inside =true;
            }
        }
        else if(s.getX()>e.getX()) {
            if (v.getX() > e.getX() && v.getX() < s.getX() && v.getY() < s.getY() && v.getY() > e.getY()) {
                inside = true;
            } else if (v.getX() > e.getX() && v.getX() < s.getX() && v.getY() < e.getY() && v.getY() > s.getY()) {
                inside = true;
            }
        }
        return inside;
    }


    double GetDistance(Vertex v1, Vertex v2)
    {
        return Math.sqrt(Math.pow(v1.getX()-v2.getX(),2) + Math.pow(v1.getY()-v2.getY(),2));
    }


    public static void main(String[] args) {
        LoadMethod.loadAll();
        Vertex s1 = new Vertex("S25",0.1509,0.8212,1);
        Vertex e1 = new Vertex("S10",0.2490,0.2247 ,1);
        Floor_1 fl = new Floor_1(s1,e1);
        String route = fl.RoutePlan();
        System.out.println(route);
    }


}
