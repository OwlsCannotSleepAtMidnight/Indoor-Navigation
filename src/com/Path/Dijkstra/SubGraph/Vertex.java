package com.Path.Dijkstra.SubGraph;

import com.Path.DefinedVertex.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by toy on 4/22/15.
 */
public class Vertex {
    protected String _name;
    protected double _x;
    protected double _y;
    protected double _z;

    protected static Dictionary _instance = new Hashtable();
    public static String file_path = "/opt/data/";

    public Vertex(){
        _name = "None";
        _x = 99;
        _y = 99;
        _z = 99;
    }

    private Vertex(Vertex v){
        _name = v.getName();
        _x = v.getX();
        _y = v.getY();
        _z = v.getZ();
    }

    public Vertex(String n, double x, double y, double z){
        Initialized(n,x,y,z);
    }


    protected void Initialized(String n, double x, double y,double z){
        _name = n;
        _x = x;
        _y = y;
        _z = z;
    }
    public void setName(String n){
        _name = n;
    }

    public void setXY(double x, double y){
        _x = x;
        _y = y;
    }

    public void setZ(double z){
        _z = z;
    }

    public void setXYZ(double x, double y, double z){
        _x = x;
        _y = y;
        _z = z;
    }
    
    public String getName(){
        return _name;
    }

    public double getX(){
        return _x;
    }

    public double getY(){
        return _y;
    }

    public double getZ(){
        return _z;
    }

    public String getString(){
        return _x+","+_y+","+_z;
    }
    public boolean equals(Vertex v){
        return (v.getX() == _x && v.getY() == _y && v.getZ() == _z && v.getName().equals(_name));
    }

    public static Vertex pinPosition(Vertex v){
        int px = (int)(v.getX() * 100);
        int py = (int)(v.getY() * 100);
        int pz = (int)(v.getZ());
        if(px%2 == 1)
            px ++;
        if(py%2 == 1)
            py ++;
        String id = String.format("P%02d_%02d_%01d", px,py,pz);
        if(_instance.get(id) != null)
            return (Vertex)_instance.get(id);
        return (Vertex)_instance.get(id);
    }

    public boolean equalPosition(Vertex v, double scope){
        return(v.getX() >= getX() - scope && v.getX() <= getX() + scope
                && v.getY() >= getY() - scope && v.getY() <= getY() + scope && v.getZ()==getZ());
    }

    public static Vertex getVertex_(String name){
        return (Vertex)_instance.get(name);
    }

    private void store(){
        _instance.put(this.getName(), this);
    }

    public static void createVertex(String name, double x, double y, double z){
        new Vertex(name,x, y, z).store();
    }

    public static void findFilePath(String str){
        file_path = str;
    }
    public static void loadVertex_(){
        loadVertex_B1();
        loadVertex_F1Bottom();
        loadVertex_F1Left();
        loadVertex_F1Right();
        loadVertex_F2Bottom();
        loadVertex_F2Center();
        loadVertex_F2Top();
    }
    
    public static void loadVertex_B1() {
        LoadVertex.LoadVertexs(file_path+"PointB1.txt");
    }

    public static void loadVertex_F1Left() {
        LoadVertex.LoadVertexs(file_path+"PointF1left.txt");
    }
    public static void loadVertex_F1Right() {
        LoadVertex.LoadVertexs(file_path+"PointF1right.txt");
    }
    
    public static void loadVertex_F1Bottom() {
        LoadVertex.LoadVertexs(file_path+"PointF1bottom.txt");
    }
    
    public static void loadVertex_F2Bottom() {
        LoadVertex.LoadVertexs(file_path+"PointF2bottom.txt");
    }
    
    public static void loadVertex_F2Center() {
        LoadVertex.LoadVertexs(file_path+"PointF2center.txt");
    }
    
    public static void loadVertex_F2Top() {
        LoadVertex.LoadVertexs(file_path+"PointF2top.txt");
    }
    
    
    
    
    public static void main(String[] args){
        String str = "0.01,0.24324%2C0.4%2F0.5234,0.4%2C0.5";
        String start, end;
        String sb[] = str.split(",|%2[CF]");
        for(String each: sb)
            System.out.println(each);
    }

}
