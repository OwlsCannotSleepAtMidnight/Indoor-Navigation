package com.Path.Dijkstra.SubGraph;

/**
 * Created by toy on 4/22/15.
 */
public class Vertex {
    String name;
    double X;
    double Y;
    double Z;
    double cost;
    public Vertex(){
        name = "None";
        X = -1;
        Y = -1;
        Z = -1;
        cost = 9999;
    }
    public Vertex(Vertex v){
        this.name = v.name;
        this.X = v.GetX();
        this.Y = v.GetY();
        this.Z =v.GetZ();
        this.cost =v.GetCost();
    }
    public Vertex(String n, double x, double y,double z){
        Initialized(n,x,y,z);

    }
    public void Initialized(String n, double x, double y,double z){
        name = n;
        X = x;
        Y = y;
        Z = z;
        cost = 9999;
    }
    public void SetName(String n){
        name = n;
    }

    public void SetXY(double x, double y){
        X = x;
        Y = y;
    }

    public void SetZ(double z){
        Z = z;
    }

    public void SetXYZ(double x, double y, double z){
        X = x;
        Y = y;
        Z = z;
    }

    public String GetName(){
        return name;
    }

    public double GetX(){
        return X;
    }

    public double GetY(){
        return Y;
    }

    public double GetZ(){
        return Z;
    }

    public void SetCost(double c){
        cost = c;
    }

    public double GetCost(){
        return cost;
    }
    public String GetString(){
        return X+","+Y+","+Z;
    }
    public boolean equals(Vertex v){
        return (v.GetX() == X && v.GetY() == Y && v.GetZ() == Z && v.GetName().equals(name));
    }

}
