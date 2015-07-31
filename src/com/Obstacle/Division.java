package com.Obstacle;

import com.Path.DefinedVertex.SubNumber;
import com.Path.Dijkstra.SubGraph.Vertex;

import java.awt.*;

/**
 * Created by toy on 15-5-23.
 */
public class Division {
    public static SubNumber GetSubGraphNum(Vertex v){
        if(v.GetZ()== 0)//����һ��`
            return SubNumber.B1Sub;
        if(v.GetY()>0.3806){
            if(IsInF1(v)){
                if(v.GetX()<0.4992) {
                    return SubNumber.F1SubLeft;
                }
                return SubNumber.F1SubRight;
            }
            if(v.GetY()>0.8001){
                return SubNumber.F2SubTop;
            }
            if(v.GetX()<0.2009){
                return SubNumber.F2SubTop;
            }
            if(v.GetX()>0.7975){
                return SubNumber.F2SubTop;
            }
            if(v.GetY() > 0.8001){
                if(v.GetX()>=0.2009 && v.GetX()<= 0.7975){
                    return  SubNumber.F2SubTop;
                }
            }
            return SubNumber.F2SubCenter;
        }

        if(v.GetX()<0.2009&&v.GetY()>0.1414) {
            if(v.GetY()>=0.34){
                if(IsInF1(v))
                    return SubNumber.F1SubLeft;
                return SubNumber.F2SubTop;
            }
            if(GetDistance(v,false)<0.2){//��v�ľ����ڰ�Բ��
                if(IsInF1(v))
                    return SubNumber.F1SubLeft;
                return SubNumber.F2SubTop;
            }
            if(IsInF1(v)){
                return SubNumber.F1SubBottom;
            }
            return SubNumber.F2SubBottom;
        }
        if(v.GetX()>0.7975&&v.GetY()>0.1414) {
            if(v.GetY()>=0.34){
                if(IsInF1(v))
                    return SubNumber.F1SubRight;
                return SubNumber.F2SubTop;
            }
            if(GetDistance(v,true)<0.2){//��v�ľ����ڰ�Բ��
                if(IsInF1(v))
                    return SubNumber.F1SubRight;
                return SubNumber.F2SubTop;
            }
            if(IsInF1(v)){
                return SubNumber.F1SubBottom;
            }
            return SubNumber.F2SubBottom;
        }
        if(IsInF1(v)){
            return SubNumber.F1SubBottom;
        }
        return SubNumber.F2SubBottom;
        //return SubNumber.ErrorNumber;//����ڵ�
    }

    protected static boolean IsInF1(Vertex v){
        if(v.GetZ()==1)
            return true;
        return false;
    }

    public static double GetDistance(Vertex v, boolean is_right){//���� ��v �Ƿ��ڰ�Բ�İ뾶֮�� is_right �����ǲ����ұߵĵ�
        double c_x;
        if(is_right){
            c_x = 1;
        }
        else{
            c_x = 0;
        }
        double c_y = 0.34;
        return Math.sqrt(Math.pow(c_x-v.GetX(),2)+Math.pow(c_y-v.GetY(),2));
    }

    public static void main(String[] args) {
        Vertex v = new Vertex("sb",0.0749,0.2573,1);
        SubNumber sub = Division.GetSubGraphNum(v);
        System.out.println(sub.ordinal());
    }
}