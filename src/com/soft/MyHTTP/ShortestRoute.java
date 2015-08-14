package com.soft.MyHTTP;

import com.Path.Dijkstra.SubGraph.LoadMethod;
import com.Path.Dijkstra.SubGraph.Vertex;

import java.util.ArrayList;

/**
 * Created by Panda on 2015/8/6.
 */
public class ShortestRoute {

    public ArrayList<Vertex> inArrayList=new ArrayList();
    public ArrayList<Vertex> sortArray = new ArrayList();
    public String plannedRoute;
    public int ArrageSize;
    ArrayList<Vertex> fullList = new ArrayList<Vertex>();

    public ShortestRoute(ArrayList<Vertex> inArray){


        inArrayList = inArray;

        for(int i=1; i<inArray.size()-1;i++){
            sortArray.add(inArrayList.get(i));
        }
        ArrageSize= sortArray.size();
    }

    public  void fullSort( ArrayList<Vertex> data ,ArrayList<Vertex> target) {


        for (int i = 0; i < data.size(); i++) {
            ArrayList<Vertex> newData = new ArrayList(data);
            ArrayList newTarget = new ArrayList(target);
            newTarget.add(newData.get(i));
            newData.remove(i);
            fullSort(newData,newTarget);
        }

        if (target.size() ==ArrageSize) {
            for (int i=0; i<target.size();i++) {
              //  System.out.print(target.get(i).GetName() + "  ");
                fullList.add(target.get(i));
            }

        }
    }

    public ArrayList<Vertex>  CalculateShortesrt(ArrayList<Vertex> allArray){

        double shortestRoute = 999.0;
        Vertex start = inArrayList.get(0);
        Vertex end = inArrayList.get(inArrayList.size()-1);

        ArrayList<Vertex> tempList = new ArrayList<Vertex>();
        ArrayList<Vertex> shortestList =new ArrayList<Vertex>();

        for(int i = 0; i<allArray.size();){
            if(i%ArrageSize==0){
                for(int j=0; j<ArrageSize; j++){
                    tempList.add(allArray.get(i));
                    i++;
                }
                tempList.add(0,start);
                tempList.add(end);
              //  System.out.println("SB");
            }

            if(getDistance(tempList)<shortestRoute) {
                if(!shortestList.isEmpty())
                    shortestList.clear();
                for (int k = 0; k < tempList.size(); k++) {
                    shortestList.add(tempList.get(k));
                }
                shortestRoute =getDistance(tempList);
            }
            if(!tempList.isEmpty())
                tempList.clear();
        }
        return shortestList;
    }

    public String getPlannedRoute(){
        return plannedRoute;
    }

    public double getDistance(ArrayList<Vertex> shortestArray){
        double shortestDistance = 0;
        plannedRoute ="";
        for (int i =0; i<shortestArray.size()-1;i++){

            double deltaX, deltaY, tempDist;
            FinalRoute tempFinal = new FinalRoute(shortestArray.get(i),shortestArray.get(i+1));
            String tempRoute = tempFinal.CreateFinalPath();
            plannedRoute += tempRoute;
            ArrayList<Vertex> StoArray = strToArrayList(tempRoute);


            for(int j = 0; j<StoArray.size()-1;j++) {
                 deltaX = Math.pow((StoArray.get(j).getX() - StoArray.get(j + 1).getX()), 2);
                 deltaY = Math.pow((StoArray.get(j).getY() - StoArray.get(j + 1).getY()), 2);
                 tempDist = Math.sqrt(deltaX+deltaY);
                 shortestDistance += tempDist;
            }
        }

        return shortestDistance;
    }

    public ArrayList<Vertex> strToArrayList(String s){
        ArrayList<Vertex> strArray= new ArrayList<Vertex>();
        String[] tempString =s.split(",");

        for(int i =0; i<tempString.length; i+=3){

                Vertex tempVertex = new Vertex("tempV",Double.parseDouble(tempString[i]),
                                                Double.parseDouble(tempString[i+1]),Double.parseDouble(tempString[i+2]));
                strArray.add(tempVertex);
        }

        return strArray;
    }






    public static void main(String[] args) {
        LoadMethod.loadAll();

        ArrayList<Vertex>  commonList=new ArrayList<Vertex>();
        commonList.add(new Vertex("D1",0.2606, 0.0419, 2));
        commonList.add(new Vertex("E6",0.0316, 0.8636, 2));
        commonList.add(new Vertex("S32", 0.8436, 0.7404, 2));
        commonList.add(new Vertex("E8", 0.3183, 0.9713, 1));
        commonList.add(new Vertex("SC1", 0.2009, 0.5018, 2));
        commonList.add(new Vertex("C6",  0.6666, 0.5711, 2));


        ShortestRoute stR = new ShortestRoute(commonList);

        stR.fullSort(stR.sortArray, new ArrayList<Vertex>());


        ArrayList<Vertex> ll =stR.fullList;
        ArrayList<Vertex> llT=stR.CalculateShortesrt(ll);

        String LLTRoute = stR.getPlannedRoute();

        System.out.println("The shortest Route is :");
       // System.out.println(llT.size());
        for(int i= 0; i<llT.size(); i++){
            System.out.print(llT.get(i).getName() + " ");
        }
        System.out.println();
        System.out.println("All points of shortest Route are :");
        System.out.println(LLTRoute);

    }


}
