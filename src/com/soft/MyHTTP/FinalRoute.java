package com.soft.MyHTTP;

import com.Path.Dijkstra.SubGraph.Vertex;
import com.Path.monolayer.Floor_1;
import com.Path.monolayer.Floor_2;
import com.Path.monolayer.Floor_G1;

import java.util.ArrayList;

/**
 * Created by Panda on 2015/5/25.
 */
public class FinalRoute {
    Vertex start, end;
    Vertex nearestEvaluator;
    ArrayList<Vertex>  Evaluator =new ArrayList<Vertex>();

    public FinalRoute(Vertex v1, Vertex v2){
        start=v1;
        end=v2;
    }
    public String CreateFinalPath(){
        double start_Z, end_Z;
        String finalRoute=null;

        start_Z=start.getZ();
        end_Z=end.getZ();

        if(start_Z==end_Z){
            if(start_Z==0){
                Floor_G1 floor_g1=new Floor_G1(start,end);
                finalRoute=floor_g1.RoutePlan();
            }
            else if(start_Z==1){
                Floor_1 floor_1 =new Floor_1(start,end);
                finalRoute=floor_1.RoutePlan();
            }
            else {
                Floor_2 floor_2=new Floor_2(start,end);
                finalRoute=floor_2.RoutePlan();
            }
        }
        else {
            if(start_Z==0){
                if(end_Z==1){
                    Evaluator.add(new Vertex("EL1", 0.1393,0.0553,0));
                    Evaluator.add(new Vertex("EL2", 0.8552,0.0553,0));
                    Evaluator.add(new Vertex("EL3", 0.3087,0.3344,0));
                    Evaluator.add(new Vertex("EL4", 0.6916,0.3344,0));
                    nearestEvaluator=nearEvaluator(Evaluator,start,end);

                    String temp1_G1ToF1;
                    String temp2__G1ToF1;
                    Floor_G1 G1ToF1_1=new Floor_G1(start,nearestEvaluator);
                    temp1_G1ToF1=G1ToF1_1.RoutePlan();

                    Vertex EvalToF1=new Vertex("E_G1toF1",nearestEvaluator.getX(),nearestEvaluator.getY(),1);
                    Floor_1 G1ToF1_2=new Floor_1(EvalToF1,end);
                    temp2__G1ToF1=G1ToF1_2.RoutePlan();

                    finalRoute=temp1_G1ToF1+temp2__G1ToF1;
                }
                else {
                    Evaluator.add(new Vertex("EL1", 0.1393,0.0553,0));
                    Evaluator.add(new Vertex("EL2", 0.8552,0.0553,0));
                    Evaluator.add(new Vertex("EL3", 0.3087,0.3344,0));
                    Evaluator.add(new Vertex("EL4", 0.6916,0.3344,0));
                    nearestEvaluator=nearEvaluator(Evaluator,start,end);

                    String temp1_G1ToF2;
                    String temp2_G1ToF2;
                    Floor_G1 G1ToF2_1=new Floor_G1(start,nearestEvaluator);
                    temp1_G1ToF2=G1ToF2_1.RoutePlan();

                    Vertex EvalToF2=new Vertex("E_G1toF2",nearestEvaluator.getX(),nearestEvaluator.getY(),2);
                    Floor_2 G1ToF1_2=new Floor_2(EvalToF2,end);
                    temp2_G1ToF2=G1ToF1_2.RoutePlan();

                    finalRoute=temp1_G1ToF2+temp2_G1ToF2;
                }
            }
            else if(start_Z==1){
                if(end_Z==0){
                    Evaluator.add(new Vertex("EL1", 0.1393,0.0553,1));
                    Evaluator.add(new Vertex("EL2", 0.8552,0.0553,1));
                    Evaluator.add(new Vertex("EL3", 0.3087,0.3344,1));
                    Evaluator.add(new Vertex("EL4", 0.6916,0.3344,1));
                    nearestEvaluator=nearEvaluator(Evaluator,start,end);

                    String temp1_F1ToG1;
                    String temp2_F1ToG1;
                    Floor_1 F1ToG1_1=new Floor_1(start,nearestEvaluator);
                    temp1_F1ToG1=F1ToG1_1.RoutePlan();

                    Vertex EvalToG1=new Vertex("E_G1toF2",nearestEvaluator.getX(),nearestEvaluator.getY(),0);
                    Floor_G1 F1ToG1_2=new Floor_G1(EvalToG1,end);
                    temp2_F1ToG1=F1ToG1_2.RoutePlan();

                    finalRoute=temp1_F1ToG1+temp2_F1ToG1;
                }
                else{
                    Evaluator.add(new Vertex("EL1", 0.1393,0.0553,1));
                    Evaluator.add(new Vertex("EL2", 0.8552,0.0553,1));
                    Evaluator.add(new Vertex("EL3", 0.3087,0.3344,1));
                    Evaluator.add(new Vertex("EL4", 0.6916,0.3344,1));
                    Evaluator.add(new Vertex("EL5", 0.3048,0.6750,1));
                    Evaluator.add(new Vertex("EL6",0.6878,0.6750,1));
                    Evaluator.add(new Vertex("EL7", 0.1432,0.902,1));
                    Evaluator.add(new Vertex("EL8", 0.8552,0.9559,1));
                    nearestEvaluator=nearEvaluator(Evaluator,start,end);

                    String temp1_F1ToF2;
                    String temp2_F1ToF2;
                    Floor_1 F1ToF2_1=new Floor_1(start,nearestEvaluator);
                    temp1_F1ToF2=F1ToF2_1.RoutePlan();

                    Vertex EvalToF2=new Vertex("E_F1toF2",nearestEvaluator.getX(),nearestEvaluator.getY(),2);
                    Floor_2 F1ToF2_2=new Floor_2(EvalToF2,end);
                    temp2_F1ToF2=F1ToF2_2.RoutePlan();

                    finalRoute=temp1_F1ToF2+temp2_F1ToF2;

                }
            }
            else if(start_Z==2){
                if(end_Z==0){
                    Evaluator.add(new Vertex("EL1", 0.1393,0.0553,2));
                    Evaluator.add(new Vertex("EL2", 0.8552,0.0553,2));
                    Evaluator.add(new Vertex("EL3", 0.3087,0.3344,2));
                    Evaluator.add(new Vertex("EL4", 0.6916,0.3344,2));
                    nearestEvaluator=nearEvaluator(Evaluator,start,end);

                    String temp1_F2ToG1;
                    String temp2_F2ToG1;
                    Floor_2 F2ToG1_1=new Floor_2(start,nearestEvaluator);
                    temp1_F2ToG1=F2ToG1_1.RoutePlan();

                    Vertex EvalToG1=new Vertex("E_F2toG1",nearestEvaluator.getX(),nearestEvaluator.getY(),0);
                    Floor_G1 F2ToG1_2=new Floor_G1(EvalToG1,end);
                    temp2_F2ToG1=F2ToG1_2.RoutePlan();

                    finalRoute=temp1_F2ToG1+temp2_F2ToG1;
                }
                else {
                    Evaluator.add(new Vertex("EL1", 0.1393,0.0553,2));
                    Evaluator.add(new Vertex("EL2", 0.8552,0.0553,2));
                    Evaluator.add(new Vertex("EL3", 0.3087,0.3344,2));
                    Evaluator.add(new Vertex("EL4", 0.6916,0.3344,2));
                    Evaluator.add(new Vertex("EL5", 0.3048,0.6750,2));
                    Evaluator.add(new Vertex("EL6",0.6878,0.6750,2));
                    Evaluator.add(new Vertex("EL7", 0.1432,0.902,2));
                    Evaluator.add(new Vertex("EL8", 0.8552,0.9559,2));
                    nearestEvaluator=nearEvaluator(Evaluator,start,end);

                    String temp1_F2ToF1;
                    String temp2__F2ToF1;
                    Floor_2 F2ToF1_1=new Floor_2(start,nearestEvaluator);
                    temp1_F2ToF1=F2ToF1_1.RoutePlan();

                    Vertex EvalToF1=new Vertex("E_F2toF1",nearestEvaluator.getX(),nearestEvaluator.getY(),1);
                    Floor_1 F2ToF1_2=new Floor_1(EvalToF1,end);
                    temp2__F2ToF1=F2ToF1_2.RoutePlan();

                    finalRoute=temp1_F2ToF1+temp2__F2ToF1;
                }
            }
        }
        return  finalRoute;
    }
    public Vertex nearEvaluator(ArrayList<Vertex> arrList, Vertex vStart, Vertex vEnd){
        double min=9999;
        Vertex nearEval=new Vertex();
        ArrayList<Vertex> tmpInside = new ArrayList<Vertex>();
        for(int i=0;i<arrList.size();i++ ) {
            if (inRectangle(arrList.get(i), vStart, vEnd))
                tmpInside.add(arrList.get(i));
            if (GetDistance(vStart, arrList.get(i)) < min) {
                min = GetDistance(vStart, arrList.get(i));
                nearEval = arrList.get(i);
            }
        }
            if (!tmpInside.isEmpty()) {
                for (int i = 0; i < tmpInside.size(); i++) {
                    if (GetDistance(vStart, tmpInside.get(i)) < min) {
                        min = GetDistance(vStart, tmpInside.get(i));
                        nearEval = tmpInside.get(i);
                    }
                }
            }

        return  nearEval;
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
}
