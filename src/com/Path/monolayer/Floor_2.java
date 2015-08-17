package com.Path.monolayer;

import com.Obstacle.Division;
import com.Path.DefinedVertex.F2SubTop;
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
    ArrayList<Vertex> tmpInside = new ArrayList<Vertex>();


    public Floor_2(Vertex s, Vertex e) {
        V_start = s;
        V_end = e;
    }

    public  String RoutePlan() {

        if (Division.GetSubGraphNum(V_start).equals(Division.GetSubGraphNum(V_end))) {
            //�����յ���ͬһ����ͼ�ϵ�·�߹滮
            Floor subfloor = CreateSubFloor(Division.GetSubGraphNum(V_start));
            //subfloor.AnalyzeVertex(V_start.GetString(), 0);
            //subfloor.AnalyzeVertex(V_end.GetString(), 1);
            //subfloor.InitializeStartEnd();
            //path = subfloor.GetArrList();
            path = subfloor.showPath(V_start, V_end);
            final_Output = path;
        }
        else if(Division.GetSubGraphNum(V_start).equals(SubNumber.F2SubTop)
                && Division.GetSubGraphNum(V_end).equals(SubNumber.F2SubBottom) )
        {

            //�Ӷ���ͼ������ͼ��·�߹滮
            ArrayList<Vertex>  temp1=new ArrayList<Vertex>();
            temp1.add(new Vertex("SC1" , 0.2009, 0.5018,2));
            temp1.add(new Vertex("SC2" , 0.4992, 0.8001,2));
            temp1.add(new Vertex("SC3" , 0.7975, 0.5018,2));

            double minDistance_TtoM=9999;
            Vertex min_TtoM=new Vertex();
            for(int i=0;i<temp1.size();i++ )
            {
                if (inRectangle(temp1.get(i), V_start, V_end))
                    tmpInside.add(temp1.get(i));

                if(GetDistance(V_start,temp1.get(i))< minDistance_TtoM) {
                    minDistance_TtoM = GetDistance(V_start, temp1.get(i));
                    min_TtoM=temp1.get(i);
                }
            }

            if (!tmpInside.isEmpty()) {
                double insideMin = 999;
                for (int i = 0; i < tmpInside.size(); i++) {
                    if (GetDistance(V_start, tmpInside.get(i)) < insideMin) {
                        insideMin = GetDistance(V_start, tmpInside.get(i));
                        min_TtoM = tmpInside.get(i);
                    }
                }
            }



            String path_TtoM_1, path_TtoM_2;
            //����ͼ����·�߹滮
            //Floor  sub_top=new F2SubTopFloor(2);
            Floor sub_top = Floor.getFloor(SubNumber.F2SubTop);
           // sub_top.AnalyzeVertex(V_start.GetString(), 0);
           // sub_top.AnalyzeVertex(min_TtoM.GetString(), 1);
          //  sub_top.InitializeStartEnd();
            path_TtoM_1 = sub_top.showPath(V_start, min_TtoM);
            //path_TtoM_1 = sub_top.GetArrList();


            //����ͼ���ֺ͵���ͼ����·�߹滮
            Vertex TinM = GoToMiddile(min_TtoM);
            Floor_2 Route_TtoM=new Floor_2(TinM,V_end);
            path_TtoM_2=Route_TtoM.RoutePlan();

            final_Output=path_TtoM_1+path_TtoM_2;

        }
        else if(Division.GetSubGraphNum(V_start).equals(SubNumber.F2SubBottom)
                && Division.GetSubGraphNum(V_end).equals(SubNumber.F2SubTop) )
        {
            //�ӵ���ͼ������ͼ��·�߹滮
            ArrayList<Vertex>  temp2=new ArrayList<Vertex>();
            temp2.add(new Vertex("J3",0.4992,0.3806,2));
            temp2.add(new Vertex("I3",0.3760,0.3806,2));
            temp2.add(new Vertex("K3",0.6185,0.3806,2));

            double minDistance_BtoM=9999;
            Vertex min_BtoM=new Vertex();
            for(int i=0;i<temp2.size();i++ )
            {
                if (inRectangle(temp2.get(i), V_start, V_end))
                    tmpInside.add(temp2.get(i));
                if(GetDistance(V_start,temp2.get(i))< minDistance_BtoM) {
                    minDistance_BtoM = GetDistance(V_start, temp2.get(i));
                    min_BtoM=temp2.get(i);
                }
            }

            if (!tmpInside.isEmpty()) {
                double insideMin = 999;
                for (int i = 0; i < tmpInside.size(); i++) {
                    if (GetDistance(V_start, tmpInside.get(i)) < insideMin) {
                        insideMin = GetDistance(V_start, tmpInside.get(i));
                        min_BtoM = tmpInside.get(i);
                    }
                }
            }


             //commit by mo
            String path_BtoM_1, path_BtoM_2;
            //����ͼ����·�߹滮
            //Floor  sub_top=new F2SubBottomFloor(2);
            Floor sub_top = Floor.getFloor(SubNumber.F2SubBottom);
           /* sub_top.AnalyzeVertex(V_start.GetString(), 0);
            sub_top.AnalyzeVertex(min_BtoM.GetString(), 1);
            sub_top.InitializeStartEnd();*/
            path_BtoM_1 = sub_top.showPath(V_start, min_BtoM);
           // path_BtoM_1 = sub_top.GetArrList();

            //����ͼ���ֺͶ���ͼ����·�߹滮
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
                if (inRectangle(CommonList.get(i), V_start, V_end))
                    tmpInside.add(CommonList.get(i));
                if(GetDistance(V_start,CommonList.get(i))< min) {
                    min = GetDistance(V_start, CommonList.get(i));
                    EssentialPoint = CommonList.get(i);
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
            S_subfloor.showPath(V_start, EssentialPoint);
           /* S_subfloor.AnalyzeVertex(V_start.GetString(), 0);
            S_subfloor.AnalyzeVertex( EssentialPoint.GetString(), 1);
            S_subfloor.InitializeStartEnd();*/
            path_1 =  S_subfloor.showPath(V_start, EssentialPoint);
           // path_1 = S_subfloor.GetArrList();

           /* E_subfloor.AnalyzeVertex(EssentialPoint.GetString(), 0);
            E_subfloor.AnalyzeVertex( V_end.GetString(), 1);
            E_subfloor.InitializeStartEnd();
            path_2 = E_subfloor.GetArrList();*/

            path_2 = E_subfloor.showPath(EssentialPoint, V_end);

            final_Output=path_1+path_2;
        }
        return final_Output;
    }

    Floor CreateSubFloor(SubNumber sn) {
        if (sn.equals(SubNumber.F2SubTop)) {
           return Floor.getFloor(SubNumber.F2SubTop);
           // return new F2SubTopFloor(2);
        }
        else if (sn.equals(SubNumber.F2SubCenter)) {
            return Floor.getFloor(SubNumber.F2SubCenter);
           // return new F2SubCenterFloor(2);
        }
        else
            return Floor.getFloor(SubNumber.F2SubBottom);
        //    return new F2SubBottomFloor(2);
    }

    ArrayList<Vertex> CommonPoint(Floor start, Floor end)
    {
        ArrayList<Vertex>  commonList=new ArrayList<Vertex>();

        if(start.getSubNO().equals(SubNumber.F2SubTop)&&end.getSubNO().equals(SubNumber.F2SubCenter)
                ||start.getSubNO().equals(SubNumber.F2SubCenter)&&end.getSubNO().equals(SubNumber.F2SubTop))
        {
            //��Ӷ���ͼ������ͼ�Ĺ�����
            commonList.add(new Vertex("SC1" , 0.2009, 0.5018,2));
            commonList.add(new Vertex("SC2" , 0.4992, 0.8001,2));
            commonList.add(new Vertex("SC3" , 0.7975, 0.5018,2));
        }
        else if((start.getSubNO().equals(SubNumber.F2SubTop)&&end.getSubNO().equals(SubNumber.F1SubBottom)
                ||start.getSubNO().equals(SubNumber.F1SubBottom)&&end.getSubNO().equals(SubNumber.F2SubTop)))
        {
            //���ڶ���ͼ�����ͼû�й����㣬Ҫ��Ӷ���ͼ������ͼ�����뾭������ͼ
            commonList.add(new Vertex("SC1" , 0.2009, 0.5018,2));
            commonList.add(new Vertex("SC2" , 0.4992, 0.8001,2));
            commonList.add(new Vertex("SC3" , 0.7975, 0.5018,2));
        }
        else if ((start.getSubNO().equals(SubNumber.F2SubCenter)&&end.getSubNO().equals(SubNumber.F2SubBottom)
                ||start.getSubNO().equals(SubNumber.F2SubBottom)&&end.getSubNO().equals(SubNumber.F2SubCenter)))
        {
            //�������ͼ�͵���ͼ�Ĺ�����
            commonList.add(new Vertex("J3",0.4992 ,0.3806,2));
            commonList.add(new Vertex("I3",0.3760,0.3806,2));
            commonList.add(new Vertex("K3",0.6185,0.3806,2));
        }
        return  commonList;
    }
    Vertex GoToMiddile(Vertex borderVertex){

        Vertex middleVertex;

        if(borderVertex.equals(new Vertex("SC2" , 0.4992, 0.8001,2))){
            middleVertex = new Vertex("SC2_mid",0.4992,0.8,2);

        }
        else if(borderVertex.equals(new Vertex("SC1" , 0.2009, 0.5018,2))){
            middleVertex = new Vertex("SC1_mid",0.201,0.5018,2);
        }
        else if(borderVertex.equals(new Vertex("SC3" , 0.7975, 0.5018,2))){
            middleVertex = new Vertex("SC3_mid",0.797,0.5018,2);
        }
        else {
            middleVertex = new Vertex("bottomInMid", borderVertex.getX(), borderVertex.getY()+0.0001, 2);

        }

        return middleVertex;
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
        Vertex D1 = new Vertex("D1" , 0.2606,0.0419,2);
        Vertex start =  new Vertex("S27" , 0.68, 0.8404, 2);
         Floor_2 fl2 = new Floor_2(start,D1);
        String line = fl2.RoutePlan();
        System.out.println(line);
    }
}
