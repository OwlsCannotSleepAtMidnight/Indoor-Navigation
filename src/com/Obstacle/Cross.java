package com.Obstacle;

import com.Path.DefinedVertex.B1Vertex;
import com.Path.DefinedVertex.SubNumber;
import com.Path.Dijkstra.SubGraph.Floor;
import com.Path.Dijkstra.SubGraph.Vertex;
import com.Path.Dijkstra.SubGraph.Graph;
import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * Created by toy on 15-5-10.
 */
public class Cross {
    public static boolean IsOverObstacle(SubNumber sub_no,Graph path,Vertex vertex1,Vertex vertex2){
        /*if(sub_no == SubNumber.B1Sub){
            return IsOverObstacleB1Sub(path, vertex1, vertex2);
        }
        if(sub_no == SubNumber.F1SubLeft){
            return IsOverObstacleF1SubLeft(path, vertex1, vertex2);
        }
        if(sub_no == SubNumber.F1SubRight){
            return IsOverObstacleF1SubRight(path, vertex1, vertex2);
        }
        if(sub_no == SubNumber.F1SubBottom){
            return IsOverObstacleF1SubBottom(path, vertex1, vertex2);
        }
        if(sub_no == SubNumber.F2SubBottom){
            return IsOverObstacleF2SubBottom(path, vertex1, vertex2);
        }
        if(sub_no == SubNumber.F2SubCenter){
            return IsOverObstacleF2SubCenter(path, vertex1, vertex2);
        }
        if(sub_no == SubNumber.F2SubTop){
            return IsOverObstacleF2SubTop(path, vertex1, vertex2);
        }*/
        return false;
    }

    public static void main(String[] args) {

    }

    public static boolean IsOverObstacleB1Sub(Graph path,Vertex vertex1, Vertex vertex2){
        if(vertex1.GetX()>vertex2.GetX()){
            Vertex tmp= vertex1;
            vertex1 = vertex2;
            vertex2 = tmp;
        }
        if(vertex1.GetY()<path.GetVertex(B1Vertex.ES1.ordinal()).GetY()&&vertex2.GetY()<path.GetVertex(B1Vertex.ES1.ordinal()).GetY()) {
            if (vertex1.GetX() < path.GetVertex(B1Vertex.ES1.ordinal()).GetX()&&vertex2.GetX() > path.GetVertex(B1Vertex.ES1.ordinal()).GetX()) {
                return true;
            }
        }
        if(vertex1.GetY()<path.GetVertex(B1Vertex.ES2.ordinal()).GetY()&&vertex2.GetY()<path.GetVertex(B1Vertex.ES2.ordinal()).GetY()) {
            if (vertex1.GetX() < path.GetVertex(B1Vertex.ES2.ordinal()).GetX()&&vertex2.GetX() > path.GetVertex(B1Vertex.ES2.ordinal()).GetX()) {
                return true;
            }
        }
        if(vertex1.GetY()>path.GetVertex(B1Vertex.ES3.ordinal()).GetY()&&vertex2.GetY()>path.GetVertex(B1Vertex.ES3.ordinal()).GetY()) {
            if (vertex1.GetX() < path.GetVertex(B1Vertex.ES3.ordinal()).GetX()&&vertex2.GetX() > path.GetVertex(B1Vertex.ES3.ordinal()).GetX()) {
                return true;
            }
        }
        if(vertex1.GetY()>path.GetVertex(B1Vertex.ES4.ordinal()).GetY()&&vertex2.GetY()>path.GetVertex(B1Vertex.ES4.ordinal()).GetY()) {
            if (vertex1.GetX() < path.GetVertex(B1Vertex.ES4.ordinal()).GetX()&&vertex2.GetX() > path.GetVertex(B1Vertex.ES4.ordinal()).GetX()) {
                return true;
            }
        }

        return false;
    }
    public static boolean IsOverObstacleF1SubLeft(Graph path,Vertex vertex1, Vertex vertex2){
        if(vertex1.GetX()>vertex2.GetX()){
            Vertex tmp= vertex1;
            vertex1 = vertex2;
            vertex2 = tmp;
        }
        if(vertex1.GetY()<0.85&&vertex1.GetY()>0.72&&vertex2.GetY()<0.85&&vertex2.GetY()>0.72){
            if(vertex1.GetX()<0.2&&vertex2.GetX()>0.2){//s25
                return true;
            }
            if(vertex1.GetX()<0.49&&vertex2.GetX()>0.49){//s31
                return true;
            }
        }

        if(vertex1.GetY()>0.92&&vertex2.GetY()>0.92){
            if(vertex1.GetX()<0.13&&vertex2.GetX()>0.13)
                return true;
        }
        if(vertex1.GetY()<0.68&&vertex1.GetY()>0.62&&vertex2.GetY()<0.68&&vertex2.GetY()>0.62){//es5
            if(vertex1.GetX()<0.32&&vertex2.GetX()>0.32)
                return true;
        }
        if(vertex1.GetY()<0.56&&vertex1.GetY()>0.44&&vertex2.GetY()<0.56&&vertex2.GetY()>0.44){//b1b2
            if(vertex1.GetX()<0.2&&vertex2.GetX()>0.2)
                return true;
            if(vertex1.GetX()<0.33&&vertex2.GetX()>0.33)
                return true;
        }
        if(vertex1.GetY()<0.62&&vertex1.GetY()>0.5&&vertex2.GetY()<0.62&&vertex2.GetY()>0.5) {
            if (vertex1.GetX() < 0.45 && vertex2.GetX() > 0.45) {
                return true;
            }
        }
        if(vertex1.GetY()<0.3806&&vertex1.GetY()>0.27&&vertex2.GetY()<0.3806&&vertex2.GetY()>0.27) {
            if(vertex1.GetX()<0.14&&vertex2.GetX()>0.14){
                return true;
            }
        }
        if(vertex1.GetY()>vertex2.GetY()){
            Vertex tmp= vertex1;
            vertex1 = vertex2;
            vertex2 = tmp;
        }
        if(vertex1.GetX()>0.16&&vertex1.GetX()<0.24&&vertex2.GetX()>0.16&&vertex2.GetX()<0.24)
            if(vertex1.GetY()<0.78&&vertex2.GetY()>0.78)
                return true;
        if(vertex1.GetX()>0.46&&vertex1.GetX()<0.5&&vertex2.GetX()>0.46&&vertex2.GetX()<0.5)
            if(vertex1.GetY()<0.46&&vertex2.GetY()>0.46)
                return true;
        if(vertex1.GetX()>0.3&&vertex1.GetX()<0.34&&vertex2.GetX()>0.3&&vertex2.GetX()<0.34)
            if(vertex1.GetY()<0.65&&vertex2.GetY()>0.65)
                return true;
        if(vertex1.GetX()>0.2&&vertex1.GetX()<0.22&&vertex2.GetX()>0.2&&vertex2.GetX()<0.22)
            if(vertex1.GetY()<0.5&&vertex2.GetY()>0.5)
                return true;
        if(vertex1.GetX()>0.32&&vertex1.GetX()<0.34&&vertex2.GetX()>0.32&&vertex2.GetX()<0.34)
            if(vertex1.GetY()<0.5&&vertex2.GetY()>0.5)
                return true;
        if(vertex1.GetX()>0.12&&vertex1.GetX()<0.16&&vertex2.GetX()>0.12&&vertex2.GetX()<0.16)
            if(vertex1.GetY()<0.3806&&vertex2.GetY()>0.3806)
                return true;
        if(vertex1.GetX()>0.16&&vertex1.GetX()<0.2&&vertex2.GetX()>0.16&&vertex2.GetX()<0.2)
            if(vertex1.GetY()<0.37&&vertex2.GetY()>0.37)
                return true;
        if(vertex1.GetX()>0.44&&vertex1.GetX()<0.46&&vertex2.GetX()>0.44&&vertex2.GetX()<0.46)
            if(vertex1.GetY()<0.56&&vertex2.GetY()>0.56)
                return true;
        return false;
    }
    public static boolean IsOverObstacleF1SubRight(Graph path,Vertex vertex1, Vertex vertex2){
        if(vertex1.GetX()>vertex2.GetX()){
            Vertex tmp= vertex1;
            vertex1 = vertex2;
            vertex2 = tmp;
        }
        if(vertex1.GetY()<0.85&&vertex1.GetY()>0.72&&vertex2.GetY()<0.85&&vertex2.GetY()>0.72){
            if(vertex1.GetX()<0.8&&vertex2.GetX()>0.8){//s40
                return true;
            }
            if(vertex1.GetX()<0.51&&vertex2.GetX()>0.51){//s31
                return true;
            }
        }

        if(vertex1.GetY()>0.92&&vertex2.GetY()>0.92){//el8
            if(vertex1.GetX()<0.87&&vertex2.GetX()>0.87)
                return true;
        }
        if(vertex1.GetY()<0.68&&vertex1.GetY()>0.62&&vertex2.GetY()<0.68&&vertex2.GetY()>0.62){//es5
            if(vertex1.GetX()<0.68&&vertex2.GetX()>0.68)
                return true;
        }
        if(vertex1.GetY()<0.56&&vertex1.GetY()>0.44&&vertex2.GetY()<0.56&&vertex2.GetY()>0.44){//b1b2
            if(vertex1.GetX()<0.8&&vertex2.GetX()>0.8)
                return true;
            if(vertex1.GetX()<0.67&&vertex2.GetX()>0.67)
                return true;
        }
        if(vertex1.GetY()<0.62&&vertex1.GetY()>0.5&&vertex2.GetY()<0.62&&vertex2.GetY()>0.5) {
            if (vertex1.GetX() < 0.55 && vertex2.GetX() > 0.55) {
                return true;
            }
        }
        if(vertex1.GetY()<0.3806&&vertex1.GetY()>0.27&&vertex2.GetY()<0.3806&&vertex2.GetY()>0.27) {
            if(vertex1.GetX()<0.86&&vertex2.GetX()>0.86){
                return true;
            }
        }
        if(vertex1.GetY()>vertex2.GetY()){
            Vertex tmp= vertex1;
            vertex1 = vertex2;
            vertex2 = tmp;
        }
        if(vertex1.GetX()>0.76&&vertex1.GetX()<0.84&&vertex2.GetX()>0.76&&vertex2.GetX()<0.84)//s37s40
            if(vertex1.GetY()<0.78&&vertex2.GetY()>0.78)
                return true;
        if(vertex1.GetX()>0.5&&vertex1.GetX()<0.54&&vertex2.GetX()>0.5&&vertex2.GetX()<0.54)
            if(vertex1.GetY()<0.46&&vertex2.GetY()>0.46)
                return true;
        if(vertex1.GetX()>0.66&&vertex1.GetX()<0.7&&vertex2.GetX()>0.66&&vertex2.GetX()<0.7)
            if(vertex1.GetY()<0.65&&vertex2.GetY()>0.65)
                return true;
        if(vertex1.GetX()>0.78&&vertex1.GetX()<0.8&&vertex2.GetX()>0.78&&vertex2.GetX()<0.8)
            if(vertex1.GetY()<0.5&&vertex2.GetY()>0.5)
                return true;
        if(vertex1.GetX()>0.66&&vertex1.GetX()<0.68&&vertex2.GetX()>0.66&&vertex2.GetX()<0.68)
            if(vertex1.GetY()<0.5&&vertex2.GetY()>0.5)
                return true;
        if(vertex1.GetX()>0.84&&vertex1.GetX()<0.88&&vertex2.GetX()>0.84&&vertex2.GetX()<0.88)
            if(vertex1.GetY()<0.3806&&vertex2.GetY()>0.3806)
                return true;
        if(vertex1.GetX()>0.8&&vertex1.GetX()<0.84&&vertex2.GetX()>0.8&&vertex2.GetX()<0.84)
            if(vertex1.GetY()<0.37&&vertex2.GetY()>0.37)
                return true;
        if(vertex1.GetX()>0.54&&vertex1.GetX()<0.56&&vertex2.GetX()>0.54&&vertex2.GetX()<0.56)
            if(vertex1.GetY()<0.56&&vertex2.GetY()>0.56)
                return true;
        return false;
    }
    public static boolean IsOverObstacleF1SubBottom(Graph path,Vertex vertex1, Vertex vertex2){
        if(vertex1.GetX()>vertex2.GetX()){
            Vertex tmp= vertex1;
            vertex1 = vertex2;
            vertex2 = tmp;
        }
        if(vertex1.GetY()<0.08&&vertex2.GetY()<0.08) {
            if (vertex1.GetX() < 0.12 && vertex2.GetX() > 0.12)
                return true;
            if(vertex1.GetX()<0.88&&vertex2.GetX()>0.88){
                return true;
            }
        }
        if(vertex1.GetY()<0.06&&vertex2.GetY()<0.06) {
            if (vertex1.GetX() < 0.3806 && vertex2.GetX() > 0.3806)
                return true;
            if (vertex1.GetX() < 0.62 && vertex2.GetX() > 0.62)
                return true;
        }
        if(vertex1.GetY()<0.24&&vertex2.GetY()<0.24&&vertex1.GetY()>0.18&&vertex2.GetY()>0.18) {
            if (vertex1.GetX() < 0.3806 && vertex2.GetX() > 0.3806)
                return true;
            if (vertex1.GetX() < 0.62 && vertex2.GetX() > 0.62)
                return true;
        }
        if(vertex1.GetY()<0.32&&vertex2.GetY()<0.3806&&vertex1.GetY()>0.32&&vertex2.GetY()>0.3806) {
            if (vertex1.GetX() < 0.32 && vertex2.GetX() > 0.32)
                return true;
            if (vertex1.GetX() < 0.68 && vertex2.GetX() > 0.68)
                return true;
        }
        if(vertex1.GetY()>vertex2.GetY()){
            Vertex tmp= vertex1;
            vertex1 = vertex2;
            vertex2 = tmp;
        }
        if(vertex1.GetX()>0.34&&vertex1.GetX()<0.42&&vertex2.GetX()>0.34&&vertex2.GetX()<0.42){
            if(vertex1.GetY()<0.21&&vertex2.GetY()>0.21){
                return true;
            }
        }
        if(vertex1.GetX()>0.58&&vertex1.GetX()<0.66&&vertex2.GetX()>0.58&&vertex2.GetX()<0.66){
            if(vertex1.GetY()<0.21&&vertex2.GetY()>0.21){
                return true;
            }
        }
        if(vertex1.GetX()>0.2&&vertex1.GetX()<0.24&&vertex2.GetX()>0.2&&vertex2.GetX()<0.24){
            if(vertex1.GetY()<0.21&&vertex2.GetY()>0.21){
                return true;
            }
        }
        if(vertex1.GetX()>0.76&&vertex1.GetX()<0.8&&vertex2.GetX()>0.76&&vertex2.GetX()<0.8){
            if(vertex1.GetY()<0.21&&vertex2.GetY()>0.21){
                return true;
            }
        }
        if(vertex1.GetX()>0.42&&vertex1.GetX()<0.58&&vertex2.GetX()>0.42&&vertex2.GetX()<0.58){
            if(vertex1.GetY()<0.34&&vertex2.GetY()>0.34){
                return true;
            }
        }
        return false;
    }
    public static boolean IsOverObstacleF2SubTop(Graph path,Vertex vertex1, Vertex vertex2){
        if(vertex1.GetX()>vertex2.GetX()){
            Vertex tmp= vertex1;
            vertex1 = vertex2;
            vertex2 = tmp;
        }

        if(vertex1.GetY()<0.8){
            if(vertex1.GetX()<0.2&&vertex2.GetX()>0.2)
                return true;
        }

        if(vertex2.GetY()<0.8){
            if(vertex1.GetX()<0.8&&vertex2.GetX()>0.8)
                return true;
        }
        
        if(vertex1.GetY()>0.92&&vertex2.GetY()>0.92){
            if(vertex1.GetX()<0.12&&vertex2.GetX()>0.12){
                return true;
            }

            if(vertex1.GetX()<0.88&&vertex2.GetX()>0.88){
                return true;
            }
        }

        if(vertex1.GetY()<0.84&&vertex1.GetY()>0.8&&vertex2.GetY()<0.84&&vertex2.GetY()>0.8)
        {
            if(vertex1.GetX()< 0.22&&vertex2.GetX()>0.22)
                return true;
            if(vertex1.GetX()<0.78&&vertex2.GetX() >0.78)
                return true;
        }
        if(vertex1.GetY()<.03806&&vertex1.GetY()>0.26&&vertex2.GetY()<0.3806&&vertex2.GetY()>0.26){
            if(vertex1.GetX()<0.15&&vertex2.GetX()>0.15)
                return true;
            if(vertex1.GetX()<0.85&&vertex2.GetX()>0.85)
                return true;
        }


        if(vertex1.GetY()>vertex2.GetY()){
            Vertex tmp= vertex1;
            vertex1 = vertex2;
            vertex2 = tmp;
        }


        if(vertex1.GetX()>0.16&&vertex1.GetX()<0.2&&vertex2.GetX()>0.16&&vertex2.GetX()<0.2){
            if(vertex1.GetY()< 0.78&& vertex2.GetY()>0.78) {
                return true;
            }
        }
        if(vertex1.GetX()>0.8&&vertex1.GetX()<0.84&&vertex2.GetX()>0.8&&vertex2.GetX()<0.84){
            if(vertex1.GetY()< 0.78&& vertex2.GetY()>0.78) {
                return true;
            }
        }
        if(vertex1.GetX()>0.12&&vertex1.GetX()<0.2&&vertex2.GetX()>0.12&&vertex2.GetX()<0.2){
            if(vertex1.GetY()< 0.36&& vertex2.GetY()>0.36) {
                return true;
            }
        }
        if(vertex1.GetX()>0.8&&vertex1.GetX()<0.88&&vertex2.GetX()>0.8&&vertex2.GetX()<0.88){
            if(vertex1.GetY()< 0.36&& vertex2.GetY()>0.36) {
                return true;
            }
        }
        return false;
    }
    public static boolean IsOverObstacleF2SubCenter(Graph path,Vertex vertex1, Vertex vertex2){
        if(vertex1.GetX()>vertex2.GetX()){
            Vertex tmp= vertex1;
            vertex1 = vertex2;
            vertex2 = tmp;
        }
        if(vertex1.GetY()<0.68&&vertex1.GetY()>0.62&&vertex2.GetY()<0.68&&vertex2.GetY()>0.62){//es5
            if(vertex1.GetX()<0.32&&vertex2.GetX()>0.32)
                return true;
            if(vertex1.GetX()<0.68&&vertex2.GetX() >0.68)
                return true;
        }
        if(vertex1.GetY()<0.56&&vertex1.GetY()>0.44&&vertex2.GetY()<0.56&&vertex2.GetY()>0.44){
            if(vertex1.GetX()<0.33&&vertex2.GetX() >0.33)
                return true;
            if(vertex1.GetX()<0.44&&vertex2.GetX() >0.44)
                return true;
            if(vertex1.GetX()<0.56&&vertex2.GetX() >0.56)
                return true;
            if(vertex1.GetX()<0.67&&vertex2.GetX() >0.67)
                return true;
        }

        if(vertex1.GetY()>vertex2.GetY()){
            Vertex tmp= vertex1;
            vertex1 = vertex2;
            vertex2 = tmp;
        }
        if(vertex1.GetX() >0.3&&vertex1.GetX()<0.34&&vertex2.GetX() >0.3&&vertex2.GetX()<0.34)
            if(vertex1.GetY()<0.65&&vertex2.GetY() >0.65)
                return true;
        if(vertex1.GetX() >0.66&&vertex1.GetX()<0.7&&vertex2.GetX() >0.66&&vertex2.GetX()<0.7)
            if(vertex1.GetY()<0.65&&vertex2.GetY() >0.65)
                return true;
        if(vertex1.GetY()<0.5&&vertex2.GetY() >0.5){
            if(vertex1.GetX() >0.32&&vertex1.GetX()<0.34&&vertex2.GetX() >0.32&&vertex2.GetX()<0.34)
                return true;
            if(vertex1.GetX() >0.42&&vertex1.GetX()<0.46&&vertex2.GetX() >0.42&&vertex2.GetX()<0.46)
                return true;
            if(vertex1.GetX() >0.54&&vertex1.GetX()<0.58&&vertex2.GetX() >0.54&&vertex2.GetX()<0.58)
                return true;
            if(vertex1.GetX() >0.66&&vertex1.GetX()<0.68&&vertex2.GetX() >0.66&&vertex2.GetX()<0.68)
                return true;

        }

        return false;
    }
    public static boolean IsOverObstacleF2SubBottom(Graph path,Vertex vertex1, Vertex vertex2){
        if(vertex1.GetX()>vertex2.GetX()){
            Vertex tmp= vertex1;
            vertex1 = vertex2;
            vertex2 = tmp;
        }
        if(vertex1.GetY()<0.08&&vertex2.GetY()<0.08) {
            if (vertex1.GetX() < 0.12 && vertex2.GetX()  > 0.12)
                return true;
            if(vertex1.GetX()<0.88&&vertex2.GetX() >0.88){
                return true;
            }
        }
        if(vertex1.GetY()<0.06&&vertex2.GetY()<0.06) {
            if (vertex1.GetX() < 0.3806 && vertex2.GetX()  > 0.3806)
                return true;
            if (vertex1.GetX() < 0.62 && vertex2.GetX()  > 0.62)
                return true;
        }
        if(vertex1.GetY()<0.24&&vertex2.GetY()<0.24&&vertex1.GetY() >0.18&&vertex2.GetY() >0.18) {
            if (vertex1.GetX() < 0.3806 && vertex2.GetX()  > 0.3806)
                return true;
            if (vertex1.GetX() < 0.62 && vertex2.GetX()  > 0.62)
                return true;
        }
        if(vertex1.GetY()<0.32&&vertex2.GetY()<0.3806&&vertex1.GetY() >0.32&&vertex2.GetY() >0.3806) {
            if (vertex1.GetX() < 0.32 && vertex2.GetX()  > 0.32)
                return true;
            if (vertex1.GetX() < 0.68 && vertex2.GetX()  > 0.68)
                return true;
        }
        if(vertex1.GetY()>vertex2.GetY()){
            Vertex tmp= vertex1;
            vertex1 = vertex2;
            vertex2 = tmp;
        }
        if(vertex1.GetX() >0.34&&vertex1.GetX()<0.42&&vertex2.GetX() >0.34&&vertex2.GetX()<0.42){
            if(vertex1.GetY()<0.21&&vertex2.GetY() >0.21){
                return true;
            }
        }
        if(vertex1.GetX() >0.58&&vertex1.GetX()<0.66&&vertex2.GetX() >0.58&&vertex2.GetX()<0.66){
            if(vertex1.GetY()<0.21&&vertex2.GetY() >0.21){
                return true;
            }
        }
        if(vertex1.GetX() >0.2&&vertex1.GetX()<0.24&&vertex2.GetX() >0.2&&vertex2.GetX()<0.24){
            if(vertex1.GetY()<0.21&&vertex2.GetY() >0.21){
                return true;
            }
        }
        if(vertex1.GetX() >0.76&&vertex1.GetX()<0.8&&vertex2.GetX() >0.76&&vertex2.GetX()<0.8){
            if(vertex1.GetY()<0.21&&vertex2.GetY() >0.21){
                return true;
            }
        }
        return false;
    }
}
