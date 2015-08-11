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

/**
 * Created by toy on 4/22/15.
 */
public class Vertex {
    protected Enum _id;
    protected String _name;
    protected double _x;
    protected double _y;
    protected double _z;

    protected static Dictionary _instance = new Hashtable();

    private static ArrayList _sub_b1 = new ArrayList();
    private static ArrayList _sub_f1_left = new ArrayList();
    private static ArrayList _sub_f1_right = new ArrayList();
    private static ArrayList _sub_f1_bottom = new ArrayList();
    private static ArrayList _sub_f2_top = new ArrayList();
    private static ArrayList _sub_f2_center = new ArrayList();
    private static ArrayList _sub_f2_bottom = new ArrayList();


    public static ArrayList Vertex_B1(){
        return _sub_b1;
    }
    public static ArrayList Vertex_F1Left(){
        return _sub_f1_left;
    }
    public static ArrayList Vertex_F1Right(){
        return _sub_f1_right;
    }
    public static ArrayList Vertex_F1Bottom(){
        return _sub_f1_bottom;
    }
    public static ArrayList Vertex_F2Top(){
        return _sub_f2_top;
    }
    public static ArrayList Vertex_F2Center(){
        return _sub_f2_center;
    }
    public static ArrayList Vertex_F2Bottom(){
        return _sub_f2_bottom;
    }


    public Vertex(){
        _name = "None";
        _x = 99;
        _y = 99;
        _z = 99;
        _id = null;
    }

    private Vertex(Vertex v){
        _id = null;
        _name = v.getName();
        _x = v.getX();
        _y = v.getY();
        _z = v.getZ();
    }

    public Vertex(String n, double x, double y, double z){
        _id = null;
        Initialized(n,x,y,z);
    }

    private Vertex(Enum id, String n, double x, double y, double z){
        _id = id;
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
    public void setID(Enum id){
        _id = id;
    }

    public Enum getID() {
        return _id;
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

    public boolean equalPosition(Vertex v, double scope){
        return(v.getX() >= getX() - scope && v.getX() <= getX() + scope
                && v.getY() >= getY() - scope && v.getY() <= getY() + scope && v.getZ()==getZ());
    }

    public static Vertex getVertex_(Enum id){
        return (Vertex)_instance.get(id);
    }

    private void store(){
        _instance.put(this.getID(), this);
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
    
    public static void loadVertex_B1(){
        new Vertex(B1Vertex.ES1, "ES1", 0.11, 0.1, 0).store();
        new Vertex(B1Vertex.EL1, "EL1", 0.17, 0.05, 0).store();
        new Vertex(B1Vertex.D1, "D1", 0.27, 0.05, 0).store();
        new Vertex(B1Vertex.D2, "D2", 0.5, 0.05, 0).store();
        new Vertex(B1Vertex.D3, "D3", 0.72, 0.05, 0).store();
        new Vertex(B1Vertex.EL2, "EL2", 0.83, 0.05, 0).store();
        new Vertex(B1Vertex.ES2, "ES2", 0.87, 0.1, 0).store();
        new Vertex(B1Vertex.EL3, "EL3", 0.27, 0.37, 0).store();
        new Vertex(B1Vertex.ES3, "ES3", 0.33, 0.3, 0).store();
        new Vertex(B1Vertex.ES4, "ES4", 0.61, 0.3, 0).store();
        new Vertex(B1Vertex.EL4, "EL4", 0.72, 0.37, 0).store();
        new Vertex(B1Vertex.ES1EL1, "ES1EL1", 0.17, 0.1, 0).store();
        new Vertex(B1Vertex.ES1D1, "ES1D1", 0.27, 0.1, 0).store();
        new Vertex(B1Vertex.ES1D2, "ES1D2", 0.5, 0.1, 0).store();
        new Vertex(B1Vertex.ES1D3, "ES1D3", 0.72, 0.1, 0).store();
        new Vertex(B1Vertex.ES2EL2, "ES2EL2", 0.83, 0.1, 0).store();
        new Vertex(B1Vertex.ES3EL3, "ES3EL3", 0.27, 0.3, 0).store();
        new Vertex(B1Vertex.ES3D2, "ES3D2", 0.5, 0.3, 0).store();
        new Vertex(B1Vertex.ES4EL4, "ES4EL4", 0.72, 0.3, 0).store();
        new Vertex(B1Vertex.start_position, "Start", 0, 0, 0).store();
        new Vertex(B1Vertex.end_position, "End", 0, 0, 0).store();
        new Vertex(B1Vertex.start_auxiliary_pos, "Start_aux", 0, 0, 0).store();
        new Vertex(B1Vertex.end_auxiliary_pos, "End_aux", 0, 0, 0).store();
        new Vertex(B1Vertex.ES1NW, "ES1NW", 0.08, 0.1, 0).store();
        new Vertex(B1Vertex.ES1SW, "ES1SW", 0.08, 0.05, 0).store();
        new Vertex(B1Vertex.ES2NE, "ES2NE", 0.91, 0.1, 0).store();
        new Vertex(B1Vertex.ES2SE, "ES2SE", 0.91, 0.05, 0).store();
        new Vertex(B1Vertex.ES3NE, "ES3NE", 0.35, 0.37, 0).store();
        new Vertex(B1Vertex.ES3SE, "ES3SE", 0.35, 0.3, 0).store();
        new Vertex(B1Vertex.ES4NW, "ES4NW", 0.62, 0.37, 0).store();
        new Vertex(B1Vertex.ES4SW, "ES4SW", 0.62, 0.3, 0).store();
        new Vertex(B1Vertex.start_auxiliary_pos2, "Start_aux2", 0, 0, 0).store();
        new Vertex(B1Vertex.end_auxiliary_pos2, "End_aux2", 0, 0, 0).store();
        new Vertex(B1Vertex.start_auxiliary_pos3, "Start_aux3", 0, 0, 0).store();
        new Vertex(B1Vertex.end_auxiliary_pos3, "End_aux3", 0, 0, 0).store();
        new Vertex(B1Vertex.start_auxiliary_pos4, "Start_aux4", 0, 0, 0).store();
        new Vertex(B1Vertex.end_auxiliary_pos4, "End_aux4", 0, 0, 0).store();

    }

    public static void loadVertex_F1Left() {

        //basic points added
        new Vertex(F1SubLeft.E9, "E9" , 0.4395, 0.9713, 1).store();
        new Vertex(F1SubLeft.WT11, "WT11" , 0.3799, 0.9502, 1).store();
        new Vertex(F1SubLeft.E8, "E8" , 0.3183, 0.9713, 1).store();
        new Vertex(F1SubLeft.E7, "E7" , 0.1990, 0.9713, 1).store();
        new Vertex(F1SubLeft.EL7, "EL7" , 0.1432, 0.9502, 1).store();
        new Vertex(F1SubLeft.ES7, "ES7" , 0.1182, 0.9155, 1).store();
        new Vertex(F1SubLeft.W7, "W7" , 0.0604, 0.9329, 1).store();
        new Vertex(F1SubLeft.WT9, "WT9" , 0.0450, 0.9329, 1).store();
        new Vertex(F1SubLeft.E6, "E6" , 0.0316, 0.8636, 1).store();
        new Vertex(F1SubLeft.E5, "E5" , 0.0316, 0.7423, 1).store();
        new Vertex(F1SubLeft.WT7, "WT7" , 0.0450, 0.6808, 1).store();
        new Vertex(F1SubLeft.E4, "E4" , 0.0316, 0.6211, 1).store();
        new Vertex(F1SubLeft.E3, "E3" , 0.0316, 0.5018, 1).store();
        new Vertex(F1SubLeft.E2, "E2" , 0.0316, 0.3825, 1).store();
        new Vertex(F1SubLeft.WT3, "WT3" , 0.0450, 0.3190, 1).store();
        new Vertex(F1SubLeft.E1, "E1" , 0.0316, 0.2632, 1).store();
        new Vertex(F1SubLeft.W3, "W3" , 0.0604, 0.1939, 1).store();
        new Vertex(F1SubLeft.S19, "S19" , 0.1085, 0.2863, 1).store();
        new Vertex(F1SubLeft.S18, "S18" , 0.1085, 0.3267, 1).store();
        new Vertex(F1SubLeft.S17, "S17" , 0.1085, 0.3632, 1).store();
        new Vertex(F1SubLeft.S20, "S20" , 0.1797, 0.3998, 1).store();
        new Vertex(F1SubLeft.S27, "S27" , 0.1509, 0.7404, 1).store();
        new Vertex(F1SubLeft.S26, "S26" , 0.1509, 0.7808, 1).store();
        new Vertex(F1SubLeft.S25, "S25" , 0.1509, 0.8212, 1).store();
        new Vertex(F1SubLeft.S28, "S28" , 0.2529, 0.8212, 1).store();
        new Vertex(F1SubLeft.S29, "S29" , 0.2529, 0.7808, 1).store();
        new Vertex(F1SubLeft.S30, "S30" , 0.2529, 0.7404, 1).store();
        new Vertex(F1SubLeft.S31, "S31" , 0.4511, 0.8212, 1).store();
        new Vertex(F1SubLeft.S32, "S32" , 0.4511, 0.7808, 1).store();
        new Vertex(F1SubLeft.S33, "S33" , 0.4511, 0.7404, 1).store();
        new Vertex(F1SubLeft.ES5, "ES5" , 0.3279, 0.6942, 1).store();
        new Vertex(F1SubLeft.EL5, "EL5" , 0.3048, 0.6750, 1).store();
        new Vertex(F1SubLeft.B1, "B1" , 0.2086, 0.5711, 1).store();
        new Vertex(F1SubLeft.B2, "B2" , 0.3279, 0.5711, 1).store();
        new Vertex(F1SubLeft.B3, "B3" , 0.4511, 0.6288, 1).store();
        new Vertex(F1SubLeft.Z3, "Z3" , 0.4992, 0.3806, 1).store();
        new Vertex(F1SubLeft.M1, "M1" , 0.4992, 0.4210, 1).store();
        new Vertex(F1SubLeft.L1, "L1" , 0.4992, 0.6288, 1).store();
        new Vertex(F1SubLeft.K1, "K1" , 0.4992, 0.6942, 1).store();
        new Vertex(F1SubLeft.I, "I" , 0.4992, 0.9155, 1).store();
        new Vertex(F1SubLeft.A, "A" , 0.0450, 0.9155, 1).store();
        new Vertex(F1SubLeft.B, "B" , 0.0604, 0.9155, 1).store();
        new Vertex(F1SubLeft.C, "C" , 0.1432, 0.9155, 1).store();
        new Vertex(F1SubLeft.D, "D" , 0.1990, 0.9155, 1).store();
        new Vertex(F1SubLeft.E, "E" , 0.3183, 0.9155, 1).store();
        new Vertex(F1SubLeft.F, "F" , 0.3279, 0.9155, 1).store();
        new Vertex(F1SubLeft.G, "G" , 0.3799, 0.9155, 1).store();
        new Vertex(F1SubLeft.H, "H" , 0.4395, 0.9155, 1).store();
        new Vertex(F1SubLeft.I1, "I1" , 0.3279, 0.8212, 1).store();
        new Vertex(F1SubLeft.H1, "H1" , 0.3279, 0.7808, 1).store();
        new Vertex(F1SubLeft.G1, "G1" , 0.3279, 0.7404, 1).store();
        new Vertex(F1SubLeft.F1, "F1" , 0.3048, 0.6942, 1).store();
        new Vertex(F1SubLeft.e1, "e1" , 0.3895, 0.6942, 1).store();
        new Vertex(F1SubLeft.J1, "J1" , 0.4511, 0.6942, 1).store();
        new Vertex(F1SubLeft.d1, "d1" , 0.3895, 0.6288, 1).store();
        new Vertex(F1SubLeft.C1, "C1" , 0.3895, 0.6019, 1).store();
        new Vertex(F1SubLeft.b1, "b1" , 0.3895, 0.4210, 1).store();
        new Vertex(F1SubLeft.A1, "A1" , 0.3279, 0.6019, 1).store();
        new Vertex(F1SubLeft.Y, "Y" , 0.2702, 0.6019, 1).store();
        new Vertex(F1SubLeft.Z, "Z" , 0.2702, 0.4210, 1).store();
        new Vertex(F1SubLeft.X, "X" , 0.2086, 0.6019, 1).store();
        new Vertex(F1SubLeft.F4, "F4" , 0.1509, 0.6019, 1).store();
        new Vertex(F1SubLeft.H4, "H4" , 0.1509, 0.4210, 1).store();
        new Vertex(F1SubLeft.P, "P" , 0.0604, 0.6019, 1).store();
        new Vertex(F1SubLeft.J, "J" , 0.0604, 0.8636, 1).store();
        new Vertex(F1SubLeft.K, "K" , 0.0604, 0.8212, 1).store();
        new Vertex(F1SubLeft.L, "L" , 0.0604, 0.7808, 1).store();
        new Vertex(F1SubLeft.M, "M" , 0.0604, 0.7404, 1).store();
        new Vertex(F1SubLeft.N, "N" , 0.0604, 0.6808, 1).store();
        new Vertex(F1SubLeft.O, "O" , 0.0604, 0.6211, 1).store();
        new Vertex(F1SubLeft.Q, "Q" , 0.0604, 0.5018, 1).store();
        new Vertex(F1SubLeft.R, "R" , 0.0604, 0.4210, 1).store();
        new Vertex(F1SubLeft.S, "S" , 0.0604, 0.3825, 1).store();
        new Vertex(F1SubLeft.T, "T" , 0.0604, 0.3632, 1).store();
        new Vertex(F1SubLeft.U, "U" , 0.0604, 0.3267, 1).store();
        new Vertex(F1SubLeft.V, "V" , 0.0604, 0.2863, 1).store();
        new Vertex(F1SubLeft.W, "W" , 0.0604, 0.2632, 1).store();



        //necessary points added

        new Vertex(F1SubLeft.start_position, "Start", 0, 0, 1).store();
        new Vertex(F1SubLeft.end_position, "End", 0, 0, 1).store();
        new Vertex(F1SubLeft.start_auxiliary_pos, "Start_aux", 0, 0, 1).store();
        new Vertex(F1SubLeft.end_auxiliary_pos, "End_aux", 0, 0, 1).store();
        new Vertex(F1SubLeft.start_auxiliary_pos2, "Start_aux2", 0, 0, 1).store();
        new Vertex(F1SubLeft.end_auxiliary_pos2, "End_aux2", 0, 0, 1).store();
        new Vertex(F1SubLeft.start_auxiliary_pos3, "Start_aux3", 0, 0, 1).store();
        new Vertex(F1SubLeft.end_auxiliary_pos3, "End_aux3", 0, 0, 1).store();
        new Vertex(F1SubLeft.start_auxiliary_pos4, "Start_aux4", 0, 0, 1).store();
        new Vertex(F1SubLeft.end_auxiliary_pos4, "End_aux4", 0, 0, 1).store();

        //extend points added

        new Vertex(F1SubLeft.LE1, "LE1",0.1085,0.4210, 1).store();
        new Vertex(F1SubLeft.LE2, "LE2",0.3895,0.5018, 1).store();
        new Vertex(F1SubLeft.EBP1, "EBP1", 0.4992, 0.5018, 1).store();
        new Vertex(F1SubLeft.LE3, "LE3", 0.0604, 0.6942, 1).store();
        new Vertex(F1SubLeft.LE4, "LE4" ,0.1509, 0.6942, 1).store();
        new Vertex(F1SubLeft.LE6, "LE6", 0.2086, 0.6942, 1).store();
        new Vertex(F1SubLeft.LE7, "LE7", 0.2702, 0.6942, 1).store();
        new Vertex(F1SubLeft.LE8, "LE8", 0.1509,0.9155, 1).store();
        new Vertex(F1SubLeft.LE9, "LE9", 0.2529,0.9155, 1).store();
        new Vertex(F1SubLeft.LE10, "LE10", 0.3279, 0.8636, 1).store();
        new Vertex(F1SubLeft.LE11, "LE11", 0.4511, 0.8636, 1).store();
        new Vertex(F1SubLeft.EBP2, "EBP2", 0.4992, 0.8636, 1).store();
        new Vertex(F1SubLeft.LE12, "LE12", 0.4511, 0.9155, 1).store();


    }
    public static void loadVertex_F1Right() {
        new Vertex(F1SubRight.S24, "S24" , 0.8167, 0.3998, 1).store();
        new Vertex(F1SubRight.S21, "S21" , 0.8860, 0.3632, 1).store();
        new Vertex(F1SubRight.S22, "S22" , 0.8860, 0.3267, 1).store();
        new Vertex(F1SubRight.S23, "S23" , 0.8860, 0.2882, 1).store();
        new Vertex(F1SubRight.W4, "W4" , 0.9302, 0.1939, 1).store();
        new Vertex(F1SubRight.E18, "E18" , 0.9630, 0.2632, 1).store();
        new Vertex(F1SubRight.WT4, "WT4" , 0.9514, 0.3190, 1).store();
        new Vertex(F1SubRight.E17, "E17" , 0.9630, 0.3825, 1).store();
        new Vertex(F1SubRight.E16, "E16" , 0.9630, 0.5018, 1).store();
        new Vertex(F1SubRight.E15, "E15" , 0.9630, 0.6211, 1).store();
        new Vertex(F1SubRight.WT8, "WT8" , 0.9514, 0.6808, 1).store();
        new Vertex(F1SubRight.E14, "E14" , 0.9630, 0.7404, 1).store();
        new Vertex(F1SubRight.E13, "E13" , 0.9630, 0.8636, 1).store();
        new Vertex(F1SubRight.WT10, "WT10" , 0.9514, 0.9329, 1).store();
        new Vertex(F1SubRight.W8, "W8" , 0.9283, 0.9329, 1).store();
        new Vertex(F1SubRight.ES8, "ES8" , 0.8764, 0.9155, 1).store();
        new Vertex(F1SubRight.EL8, "EL8" , 0.8552, 0.9502, 1).store();
        new Vertex(F1SubRight.E12, "E12" , 0.7975, 0.9713, 1).store();
        new Vertex(F1SubRight.E11, "E11" , 0.6782, 0.9713, 1).store();
        new Vertex(F1SubRight.WT12, "WT12" , 0.6166, 0.9502, 1).store();
        new Vertex(F1SubRight.E10, "E10" , 0.5625, 0.9713, 1).store();
        new Vertex(F1SubRight.S34, "S34" , 0.5492, 0.8212, 1).store();
        new Vertex(F1SubRight.S35, "S35" , 0.5492, 0.7808, 1).store();
        new Vertex(F1SubRight.S36, "S36" , 0.5492, 0.7404, 1).store();
        new Vertex(F1SubRight.S37, "S37" , 0.7436, 0.8212, 1).store();
        new Vertex(F1SubRight.S38, "S38" , 0.7436, 0.7808, 1).store();
        new Vertex(F1SubRight.S39, "S39" , 0.7436, 0.7404, 1).store();
        new Vertex(F1SubRight.S40, "S40" , 0.8436, 0.8212, 1).store();
        new Vertex(F1SubRight.S41, "S41" , 0.8436, 0.7808, 1).store();
        new Vertex(F1SubRight.S42, "S42" , 0.8436, 0.7404, 1).store();
        new Vertex(F1SubRight.B4, "B4" , 0.5473, 0.6288, 1).store();
        new Vertex(F1SubRight.B5, "B5" , 0.6666, 0.5711, 1).store();
        new Vertex(F1SubRight.B6, "B6" , 0.7878, 0.5711, 1).store();
        new Vertex(F1SubRight.ES6, "ES6" , 0.6666, 0.6942, 1).store();
        new Vertex(F1SubRight.EL6, "EL6" , 0.6878, 0.6750, 1).store();
        new Vertex(F1SubRight.M1, "M1" , 0.4992, 0.4210, 1).store();
        new Vertex(F1SubRight.L1, "L1" , 0.4992, 0.6288, 1).store();
        new Vertex(F1SubRight.K1, "K1" , 0.4992, 0.6942, 1).store();
        new Vertex(F1SubRight.I, "I" , 0.4992, 0.9155, 1).store();
        new Vertex(F1SubRight.U2, "U2" , 0.5625, 0.9155, 1).store();
        new Vertex(F1SubRight.T2, "T2" , 0.6166, 0.9155, 1).store();
        new Vertex(F1SubRight.P2, "P2" , 0.6666, 0.9155, 1).store();
        new Vertex(F1SubRight.O2, "O2" , 0.6782, 0.9155, 1).store();
        new Vertex(F1SubRight.N2, "N2" , 0.7975, 0.9155, 1).store();
        new Vertex(F1SubRight.M2, "M2" , 0.8552, 0.9155, 1).store();
        new Vertex(F1SubRight.L2, "L2" , 0.9283, 0.9155, 1).store();
        new Vertex(F1SubRight.K2, "K2" , 0.9514, 0.9155, 1).store();
        new Vertex(F1SubRight.J2, "J2" , 0.9283, 0.8636, 1).store();
        new Vertex(F1SubRight.I2, "I2" , 0.9283, 0.8212, 1).store();
        new Vertex(F1SubRight.H2, "H2" , 0.9283, 0.7808, 1).store();
        new Vertex(F1SubRight.G2, "G2" , 0.9283, 0.7404, 1).store();
        new Vertex(F1SubRight.F2, "F2" , 0.9283, 0.6808, 1).store();
        new Vertex(F1SubRight.b2, "b2" , 0.9283, 0.6211, 1).store();
        new Vertex(F1SubRight.A2, "A2" , 0.9283, 0.6019, 1).store();
        new Vertex(F1SubRight.Z1, "Z1" , 0.9283, 0.5018, 1).store();
        new Vertex(F1SubRight.T1, "T1" , 0.9283, 0.4210, 1).store();
        new Vertex(F1SubRight.U1, "U1" , 0.9283, 0.3825, 1).store();
        new Vertex(F1SubRight.V1, "V1" , 0.9283, 0.3632, 1).store();
        new Vertex(F1SubRight.w1, "w1" , 0.9283, 0.3267, 1).store();
        new Vertex(F1SubRight.X1, "X1" , 0.9283, 0.2882, 1).store();
        new Vertex(F1SubRight.Y1, "Y1" , 0.9283, 0.2632, 1).store();
        new Vertex(F1SubRight.s1, "s1" , 0.8436, 0.4210, 1).store();
        new Vertex(F1SubRight.R1, "R1" , 0.7423, 0.4210, 1).store();
        new Vertex(F1SubRight.q1, "q1" , 0.5973, 0.4210, 1).store();
        new Vertex(F1SubRight.C2, "C2" , 0.8436, 0.6019, 1).store();
        new Vertex(F1SubRight.d2, "d2" , 0.7878, 0.6019, 1).store();
        new Vertex(F1SubRight.e2, "e2" , 0.7423, 0.6019, 1).store();
        new Vertex(F1SubRight.J4, "J4" , 0.6666, 0.6019, 1).store();
        new Vertex(F1SubRight.I4, "I4" , 0.5973, 0.6019, 1).store();
        new Vertex(F1SubRight.P1, "P1" , 0.5973, 0.6288, 1).store();
        new Vertex(F1SubRight.O1, "O1" , 0.5973, 0.6942, 1).store();
        new Vertex(F1SubRight.N1, "N1" , 0.5473, 0.6942, 1).store();
        new Vertex(F1SubRight.K4, "K4" , 0.6878, 0.6942, 1).store();
        new Vertex(F1SubRight.q2, "q2" , 0.6666, 0.8212, 1).store();
        new Vertex(F1SubRight.R2, "R2" , 0.6666, 0.7808, 1).store();
        new Vertex(F1SubRight.s2, "s2" , 0.6666, 0.7404, 1).store();
        new Vertex(F1SubRight.Z3, "Z3" , 0.4992,0.3806 , 1).store();
        
        //necessary points added

        new Vertex(F1SubRight.start_position, "Start", 0, 0, 1).store();
        new Vertex(F1SubRight.end_position, "End", 0, 0, 1).store();
        new Vertex(F1SubRight.start_auxiliary_pos, "Start_aux", 0, 0, 1).store();
        new Vertex(F1SubRight.end_auxiliary_pos, "End_aux", 0, 0, 1).store();
        new Vertex(F1SubRight.start_auxiliary_pos2, "Start_aux2", 0, 0, 1).store();
        new Vertex(F1SubRight.end_auxiliary_pos2, "End_aux2", 0, 0, 1).store();
        new Vertex(F1SubRight.start_auxiliary_pos3, "Start_aux3", 0, 0, 1).store();
        new Vertex(F1SubRight.end_auxiliary_pos3, "End_aux3", 0, 0, 1).store();
        new Vertex(F1SubRight.start_auxiliary_pos4, "Start_aux4", 0, 0, 1).store();
        new Vertex(F1SubRight.end_auxiliary_pos4, "End_aux4", 0, 0, 1).store();

        //extend points added
        new Vertex(F1SubRight.ER1, "ER1", 0.8860,0.4210, 1).store();
        new Vertex(F1SubRight.ER2, "ER2", 0.5973, 0.5018, 1).store();
        new Vertex(F1SubRight.EBP1,"EBP1", 0.4992, 0.5018, 1).store();
        new Vertex(F1SubRight.ER3, "ER3", 0.8436, 0.6942, 1).store();
        new Vertex(F1SubRight.ER4, "ER4", 0.7878, 0.6942, 1).store();
        new Vertex(F1SubRight.ER5, "ER5", 0.7436, 0.6942, 1).store();
        new Vertex(F1SubRight.ER6, "ER6", 0.7423, 0.6942, 1).store();
        new Vertex(F1SubRight.ER7, "ER7", 0.8436, 0.9155, 1).store();
        new Vertex(F1SubRight.ER8, "ER8", 0.7436, 0.9155, 1).store();
        new Vertex(F1SubRight.ER9, "ER9", 0.6666, 0.8636, 1).store();
        new Vertex(F1SubRight.ER10, "ER10",0.5492, 0.8636, 1).store();
        new Vertex(F1SubRight.ER11, "ER11", 0.5492, 0.9155, 1).store();
        new Vertex(F1SubRight.EBP2, "EBP2",0.4492, 0.8636, 1).store();
        new Vertex(F1SubRight.ER12, "ER12",0.9283,0.6942, 1).store();
        
    }
    
    public static void loadVertex_F1Bottom() {
        new Vertex(F1SubBottom.WT5, "WT5" , 0.2702,0.3498 , 1).store();
        new Vertex(F1SubBottom.W5, "W5" , 0.2490,0.3344 , 1).store();
        new Vertex(F1SubBottom.EL3, "EL3" , 0.3087,0.3344 , 1).store();
        new Vertex(F1SubBottom.ES3, "ES3" , 0.3298,0.3151 , 1).store();
        new Vertex(F1SubBottom.S9, "S9" , 0.2490,0.2593 , 1).store();
        new Vertex(F1SubBottom.S10, "S10" , 0.2490,0.2247 , 1).store();
        new Vertex(F1SubBottom.S11, "S11" , 0.2490,0.1843 , 1).store();
        new Vertex(F1SubBottom.S12, "S12" , 0.1836,0.1535 , 1).store();
        new Vertex(F1SubBottom.S5, "S5" , 0.3606,0.2497 , 1).store();
        new Vertex(F1SubBottom.S6, "S6" , 0.3991,0.2497 , 1).store();
        new Vertex(F1SubBottom.Q1, "Q1" , 0.3799,0.1746 , 1).store();
        new Vertex(F1SubBottom.S7, "S7" , 0.6012,0.2497 , 1).store();
        new Vertex(F1SubBottom.S8, "S8" , 0.6358,0.2497 , 1).store();
        new Vertex(F1SubBottom.Q2, "Q2" , 0.6185,0.1746 , 1).store();
        new Vertex(F1SubBottom.W6, "W6" , 0.7493,0.3344 , 1).store();
        new Vertex(F1SubBottom.WT6, "WT6" , 0.7263,0.3498 , 1).store();
        new Vertex(F1SubBottom.EL4, "EL4" , 0.6916,0.3344 , 1).store();
        new Vertex(F1SubBottom.ES4, "ES4" , 0.6666,0.3151 , 1).store();
        new Vertex(F1SubBottom.S13, "S13" , 0.7493,0.2593 , 1).store();
        new Vertex(F1SubBottom.S14, "S14" , 0.7493,0.2247 , 1).store();
        new Vertex(F1SubBottom.S15, "S15" , 0.7493,0.1843 , 1).store();
        new Vertex(F1SubBottom.S16, "S16" , 0.8167,0.1535 , 1).store();
        new Vertex(F1SubBottom.WT1, "WT1" , 0.0489,0.0900 , 1).store();
        new Vertex(F1SubBottom.W1, "W1" , 0.0681,0.0707 , 1).store();
        new Vertex(F1SubBottom.ES1, "ES1" , 0.1220,0.0900 , 1).store();
        new Vertex(F1SubBottom.EL1, "EL1" , 0.1393,0.0553 , 1).store();
        new Vertex(F1SubBottom.D1, "D1" , 0.2606,0.0419 , 1).store();
        new Vertex(F1SubBottom.S1, "S1" , 0.3606,0.0746 , 1).store();
        new Vertex(F1SubBottom.S2, "S2" , 0.3991,0.0746 , 1).store();
        new Vertex(F1SubBottom.D2, "D2" , 0.4992,0.0419 , 1).store();
        new Vertex(F1SubBottom.S3, "S3" , 0.6012,0.0746 , 1).store();
        new Vertex(F1SubBottom.S4, "S4" , 0.6358,0.0746 , 1).store();
        new Vertex(F1SubBottom.D3, "D3" , 0.7378,0.0419 , 1).store();
        new Vertex(F1SubBottom.EL2, "EL2" , 0.8552,0.0553 , 1).store();
        new Vertex(F1SubBottom.ES2, "ES2" , 0.8764,0.0900 , 1).store();
        new Vertex(F1SubBottom.W2, "W2" , 0.9302,0.0707 , 1).store();
        new Vertex(F1SubBottom.WT2, "WT2" , 0.9456,0.0900 , 1).store();
        new Vertex(F1SubBottom.Z3, "Z3" , 0.4992,0.3806 , 1).store();
        new Vertex(F1SubBottom.Y3, "Y3" , 0.4992,0.3594 , 1).store();
        new Vertex(F1SubBottom.U3, "U3" , 0.3991,0.3594 , 1).store();
        new Vertex(F1SubBottom.X3, "X3" , 0.6012,0.3594 , 1).store();
        new Vertex(F1SubBottom.P3, "P3" , 0.2490,0.2882 , 1).store();
        new Vertex(F1SubBottom.Q3, "Q3" , 0.2702,0.2882 , 1).store();
        new Vertex(F1SubBottom.R3, "R3" , 0.3087,0.2882 , 1).store();
        new Vertex(F1SubBottom.s3, "s3" , 0.3298,0.2882 , 1).store();
        new Vertex(F1SubBottom.T3, "T3" , 0.3991,0.2882 , 1).store();
        new Vertex(F1SubBottom.V3, "V3" , 0.4992,0.2882 , 1).store();
        new Vertex(F1SubBottom.w3, "w3" , 0.6012,0.2882 , 1).store();
        new Vertex(F1SubBottom.A4, "A4" , 0.6666,0.2882 , 1).store();
        new Vertex(F1SubBottom.b4, "b4" , 0.6916,0.2882 , 1).store();
        new Vertex(F1SubBottom.C4, "C4" , 0.7263,0.2882 , 1).store();
        new Vertex(F1SubBottom.D4, "D4" , 0.7493,0.2882 , 1).store();
        new Vertex(F1SubBottom.O3, "O3" , 0.2490,0.1535 , 1).store();
        new Vertex(F1SubBottom.N3, "N3" , 0.3799,0.1535 , 1).store();
        new Vertex(F1SubBottom.e4, "e4" , 0.4992,0.1535 , 1).store();
        new Vertex(F1SubBottom.M3, "M3" , 0.6185,0.1535 , 1).store();
        new Vertex(F1SubBottom.L3, "L3" , 0.7493,0.1535 , 1).store();
        new Vertex(F1SubBottom.V2, "V2" , 0.0681,0.0900 , 1).store();
        new Vertex(F1SubBottom.w2, "w2" , 0.1393,0.0900 , 1).store();
        new Vertex(F1SubBottom.X2, "X2" , 0.2490,0.0900 , 1).store();
        new Vertex(F1SubBottom.Y2, "Y2" , 0.2606,0.0900 , 1).store();
        new Vertex(F1SubBottom.Z2, "Z2" , 0.3606,0.0900 , 1).store();
        new Vertex(F1SubBottom.A3, "A3" , 0.3799,0.0900 , 1).store();
        new Vertex(F1SubBottom.b3, "b3" , 0.3991,0.0900 , 1).store();
        new Vertex(F1SubBottom.C3, "C3" , 0.4992,0.0900 , 1).store();
        new Vertex(F1SubBottom.d3, "d3" , 0.6012,0.0900 , 1).store();
        new Vertex(F1SubBottom.e3, "e3" , 0.6185,0.0900 , 1).store();
        new Vertex(F1SubBottom.F3, "F3" , 0.6358,0.0900 , 1).store();
        new Vertex(F1SubBottom.G3, "G3" , 0.7378,0.0900 , 1).store();
        new Vertex(F1SubBottom.H3, "H3" , 0.7493,0.0900 , 1).store();
        new Vertex(F1SubBottom.I3, "I3" , 0.8167,0.0900 , 1).store();
        new Vertex(F1SubBottom.J3, "J3" , 0.8552,0.0900 , 1).store();
        new Vertex(F1SubBottom.K3, "K3" , 0.9302,0.0900 , 1).store();
        
        //necessary points added

        new Vertex(F1SubBottom.start_position, "Start", 0, 0, 1).store();
        new Vertex(F1SubBottom.end_position, "End", 0, 0, 1).store();
        new Vertex(F1SubBottom.start_auxiliary_pos, "Start_aux", 0, 0, 1).store();
        new Vertex(F1SubBottom.end_auxiliary_pos, "End_aux", 0, 0, 1).store();
        new Vertex(F1SubBottom.start_auxiliary_pos2, "Start_aux2", 0, 0, 1).store();
        new Vertex(F1SubBottom.end_auxiliary_pos2, "End_aux2", 0, 0, 1).store();
        new Vertex(F1SubBottom.start_auxiliary_pos3, "Start_aux3", 0, 0, 1).store();
        new Vertex(F1SubBottom.end_auxiliary_pos3, "End_aux3", 0, 0, 1).store();
        new Vertex(F1SubBottom.start_auxiliary_pos4, "Start_aux4", 0, 0, 1).store();
        new Vertex(F1SubBottom.end_auxiliary_pos4, "End_aux4", 0, 0, 1).store();
        
        //extend points added

        new Vertex(F1SubBottom.EB1, "EB1", 0.1836,0.0900, 1).store();
        new Vertex(F1SubBottom.EB2, "EB2", 0.3087,0.0900, 1).store();
        new Vertex(F1SubBottom.EB3, "EB3", 0.4511,0.0900, 1).store();
        new Vertex(F1SubBottom.EB4, "EB4", 0.5473,0.0900, 1).store();
        new Vertex(F1SubBottom.EB5, "EB5", 0.6916,0.0900, 1).store();
        new Vertex(F1SubBottom.EB6, "EB6", 0.6916,0.1535, 1).store();
        new Vertex(F1SubBottom.EB7, "EB7", 0.5473,0.1535, 1).store();
        new Vertex(F1SubBottom.EB8, "EB8", 0.4511,0.1535, 1).store();
        new Vertex(F1SubBottom.EB9, "EB9", 0.3087,0.1535, 1).store();
        new Vertex(F1SubBottom.EB10, "EB10",0.4511,0.2497, 1).store();
        new Vertex(F1SubBottom.EB11, "EB11",0.5473,0.2497, 1).store();
        new Vertex(F1SubBottom.EB12, "EB12",0.5473,0.2882, 1).store();
        new Vertex(F1SubBottom.EB13, "EB13",0.4511,0.2882, 1).store();

    }
    
    public static void loadVertex_F2Bottom() {
        //basic points added

        new Vertex(F2SubBottom.WT5, "WT5" , 0.2702, 0.3498, 2).store();
        new Vertex(F2SubBottom.W5, "W5" , 0.2490, 0.3344, 2).store();
        new Vertex(F2SubBottom.EL3, "EL3" , 0.3087, 0.3344, 2).store();
        new Vertex(F2SubBottom.ES3, "ES3" , 0.3279, 0.3151, 2).store();
        new Vertex(F2SubBottom.S9, "S9" , 0.2490, 0.2593, 2).store();
        new Vertex(F2SubBottom.S10, "S10" , 0.2490, 0.2247, 2).store();
        new Vertex(F2SubBottom.S11, "S11" , 0.2490, 0.1843, 2).store();
        new Vertex(F2SubBottom.S12, "S12" , 0.1836, 0.1535, 2).store();
        new Vertex(F2SubBottom.S5, "S5" , 0.3606, 0.2497, 2).store();
        new Vertex(F2SubBottom.S6, "S6" , 0.3991, 0.2497, 2).store();
        new Vertex(F2SubBottom.Q1, "Q1" , 0.3799, 0.1746, 2).store();
        new Vertex(F2SubBottom.S7, "S7" , 0.6012, 0.2497, 2).store();
        new Vertex(F2SubBottom.S8, "S8" , 0.6358, 0.2497, 2).store();
        new Vertex(F2SubBottom.Q2, "Q2" , 0.6185, 0.1746, 2).store();
        new Vertex(F2SubBottom.W6, "W6" , 0.7493, 0.3344, 2).store();
        new Vertex(F2SubBottom.WT6, "WT6" , 0.7263, 0.3498, 2).store();
        new Vertex(F2SubBottom.EL4, "EL4" , 0.6916, 0.3344, 2).store();
        new Vertex(F2SubBottom.ES4, "ES4" , 0.6666, 0.3151, 2).store();
        new Vertex(F2SubBottom.S13, "S13" , 0.7493, 0.2593, 2).store();
        new Vertex(F2SubBottom.S14, "S14" , 0.7493, 0.2247, 2).store();
        new Vertex(F2SubBottom.S15, "S15" , 0.7493, 0.1843, 2).store();
        new Vertex(F2SubBottom.S16, "S16" , 0.8167, 0.1535, 2).store();
        new Vertex(F2SubBottom.WT1, "WT1" , 0.0489, 0.0900, 2).store();
        new Vertex(F2SubBottom.W1, "W1" , 0.0681, 0.0707, 2).store();
        new Vertex(F2SubBottom.ES1, "ES1" , 0.1220, 0.0900, 2).store();
        new Vertex(F2SubBottom.EL1, "EL1" , 0.1393, 0.0553, 2).store();
        new Vertex(F2SubBottom.D1, "D1" , 0.2606, 0.0419, 2).store();
        new Vertex(F2SubBottom.S1, "S1" , 0.3606, 0.0746, 2).store();
        new Vertex(F2SubBottom.S2, "S2" , 0.3991, 0.0746, 2).store();
        new Vertex(F2SubBottom.D2, "D2" , 0.4992, 0.0419, 2).store();
        new Vertex(F2SubBottom.S3, "S3" , 0.6012, 0.0746, 2).store();
        new Vertex(F2SubBottom.S4, "S4" , 0.6358, 0.0746, 2).store();
        new Vertex(F2SubBottom.D3, "D3" , 0.7378, 0.0419, 2).store();
        new Vertex(F2SubBottom.EL2, "EL2" , 0.8552, 0.0553, 2).store();
        new Vertex(F2SubBottom.ES2, "ES2" , 0.8764, 0.0900, 2).store();
        new Vertex(F2SubBottom.W2, "W2" , 0.9302, 0.0707, 2).store();
        new Vertex(F2SubBottom.WT2, "WT2" , 0.9456, 0.0900, 2).store();
        new Vertex(F2SubBottom.A3, "A3" , 0.4992, 0.2959, 2).store();
        new Vertex(F2SubBottom.H3, "H3" , 0.2490, 0.2959, 2).store();
        new Vertex(F2SubBottom.G3, "G3" , 0.2702, 0.2959, 2).store();
        new Vertex(F2SubBottom.F3, "F3" , 0.3087, 0.2959, 2).store();
        new Vertex(F2SubBottom.e3, "e3" , 0.3279, 0.2959, 2).store();
        new Vertex(F2SubBottom.d3, "d3" , 0.3606, 0.2959, 2).store();
        new Vertex(F2SubBottom.c3, "c3" , 0.3760, 0.2959, 2).store();
        new Vertex(F2SubBottom.B3, "B3" , 0.3991, 0.2959, 2).store();
        new Vertex(F2SubBottom.Z2, "Z2" , 0.6012, 0.2959, 2).store();
        new Vertex(F2SubBottom.J3, "J3" , 0.4992, 0.3806, 2).store();
        new Vertex(F2SubBottom.I3, "I3" , 0.3760, 0.3806, 2).store();
        new Vertex(F2SubBottom.K3, "K3" , 0.6185, 0.3806, 2).store();
        new Vertex(F2SubBottom.Y2, "Y2" , 0.6185, 0.2959, 2).store();
        new Vertex(F2SubBottom.X2, "X2" , 0.6358, 0.2959, 2).store();
        new Vertex(F2SubBottom.w2, "w2" , 0.6666, 0.2959, 2).store();
        new Vertex(F2SubBottom.V2, "V2" , 0.6916, 0.2959, 2).store();
        new Vertex(F2SubBottom.U2, "U2" , 0.7263, 0.2959, 2).store();
        new Vertex(F2SubBottom.T2, "T2" , 0.7493, 0.2959, 2).store();
        new Vertex(F2SubBottom.R2, "R2" , 0.2490, 0.1535, 2).store();
        new Vertex(F2SubBottom.s2, "s2" , 0.3799, 0.1535, 2).store();
        new Vertex(F2SubBottom.K2, "K2" , 0.4992, 0.1535, 2).store();
        new Vertex(F2SubBottom.J2, "J2" , 0.6185, 0.1535, 2).store();
        new Vertex(F2SubBottom.F4, "F4" , 0.7493, 0.1535, 2).store();
        new Vertex(F2SubBottom.q2, "q2" , 0.0681, 0.0900, 2).store();
        new Vertex(F2SubBottom.P2, "P2" , 0.1393, 0.0900, 2).store();
        new Vertex(F2SubBottom.O2, "O2" , 0.2490, 0.0900, 2).store();
        new Vertex(F2SubBottom.N2, "N2" , 0.2606, 0.0900, 2).store();
        new Vertex(F2SubBottom.M2, "M2" , 0.3606, 0.0900, 2).store();
        new Vertex(F2SubBottom.L2, "L2" , 0.3991, 0.0900, 2).store();
        new Vertex(F2SubBottom.I2, "I2" , 0.4992, 0.0900, 2).store();
        new Vertex(F2SubBottom.H2, "H2" , 0.6012, 0.0900, 2).store();
        new Vertex(F2SubBottom.G2, "G2" , 0.6358, 0.0900, 2).store();
        new Vertex(F2SubBottom.F2, "F2" , 0.7378, 0.0900, 2).store();
        new Vertex(F2SubBottom.e2, "e2" , 0.7493, 0.0900, 2).store();
        new Vertex(F2SubBottom.c2, "c2" , 0.8552, 0.0900, 2).store();
        new Vertex(F2SubBottom.B2, "B2" , 0.9302, 0.0900, 2).store();



        //necessary points added

        new Vertex(F2SubBottom.start_position, "Start", 0, 0, 2).store();
        new Vertex(F2SubBottom.end_position, "End", 0, 0, 2).store();
        new Vertex(F2SubBottom.start_auxiliary_pos, "Start_aux", 0, 0, 2).store();
        new Vertex(F2SubBottom.end_auxiliary_pos, "End_aux", 0, 0, 2).store();
        new Vertex(F2SubBottom.start_auxiliary_pos2, "Start_aux2", 0, 0, 2).store();
        new Vertex(F2SubBottom.end_auxiliary_pos2, "End_aux2", 0, 0, 2).store();
        new Vertex(F2SubBottom.start_auxiliary_pos3, "Start_aux3", 0, 0, 2).store();
        new Vertex(F2SubBottom.end_auxiliary_pos3, "End_aux3", 0, 0, 2).store();
        new Vertex(F2SubBottom.start_auxiliary_pos4, "Start_aux4", 0, 0, 2).store();
        new Vertex(F2SubBottom.end_auxiliary_pos4, "End_aux4", 0, 0, 2).store();


        //extend points added

        new Vertex(F2SubBottom.EB1, "EB1",0.1863,0.0900, 2).store();
        new Vertex(F2SubBottom.EB2, "EB2",0.3087,0.0900, 2).store();
        new Vertex(F2SubBottom.EB3, "EB3",0.4491,0.0900, 2).store();
        new Vertex(F2SubBottom.EB4, "EB4",0.5473,0.0900, 2).store();
        new Vertex(F2SubBottom.EB5, "EB5",0.6916,0.0900, 2).store();
        new Vertex(F2SubBottom.EB6, "EB6",0.8167,0.0900, 2).store();
        new Vertex(F2SubBottom.EB7, "EB7",0.6916,0.1535, 2).store();
        new Vertex(F2SubBottom.EB8, "EB8",0.5473,0.1535, 2).store();
        new Vertex(F2SubBottom.EB9, "EB9",0.4491,0.1535, 2).store();
        new Vertex(F2SubBottom.EB10, "EB10",0.3087,0.1535, 2).store();
        new Vertex(F2SubBottom.EB11, "EB11",0.4491,0.2959, 2).store();
        new Vertex(F2SubBottom.EB12, "EB12",0.5473,0.2959, 2).store();


    }
    
    public static void loadVertex_F2Center() {

        new Vertex(F2SubCenter.SC1, "SC1" , 0.2009, 0.5018, 2).store();
        new Vertex(F2SubCenter.SC2, "SC2" , 0.4992, 0.8001, 2).store();
        new Vertex(F2SubCenter.SC3, "SC3" , 0.7975, 0.5018, 2).store();
        new Vertex(F2SubCenter.C1, "C1" , 0.3279, 0.5711, 2).store();
        new Vertex(F2SubCenter.C2, "C2" , 0.4280, 0.5711, 2).store();
        new Vertex(F2SubCenter.C3, "C3" , 0.4491, 0.5711, 2).store();
        new Vertex(F2SubCenter.C4, "C4" , 0.5473, 0.5711, 2).store();
        new Vertex(F2SubCenter.C5, "C5" , 0.5665, 0.5711, 2).store();
        new Vertex(F2SubCenter.C6, "C6" , 0.6666, 0.5711, 2).store();
        new Vertex(F2SubCenter.EL5, "EL5" , 0.3029, 0.6750, 2).store();
        new Vertex(F2SubCenter.ES5, "ES5" , 0.3279, 0.7000, 2).store();
        new Vertex(F2SubCenter.ES6, "ES6" , 0.6666, 0.7000, 2).store();
        new Vertex(F2SubCenter.EL6, "EL6" , 0.6897, 0.6750, 2).store();
        new Vertex(F2SubCenter.X3, "X3" , 0.4992, 0.7520, 2).store();
        new Vertex(F2SubCenter.U3, "U3" , 0.3029, 0.7520, 2).store();
        new Vertex(F2SubCenter.V3, "V3" , 0.3279, 0.7520, 2).store();
        new Vertex(F2SubCenter.w3, "w3" , 0.3760, 0.7520, 2).store();
        new Vertex(F2SubCenter.Y3, "Y3" , 0.6185, 0.7520, 2).store();
        new Vertex(F2SubCenter.Z3, "Z3" , 0.6666, 0.7520, 2).store();
        new Vertex(F2SubCenter.A4, "A4" , 0.6897, 0.7520, 2).store();
        new Vertex(F2SubCenter.P3, "P3" , 0.4992, 0.6019, 2).store();
        new Vertex(F2SubCenter.T3, "T3" , 0.3279, 0.6019, 2).store();
        new Vertex(F2SubCenter.s3, "s3" , 0.3760, 0.6019, 2).store();
        new Vertex(F2SubCenter.R3, "R3" , 0.4280, 0.6019, 2).store();
        new Vertex(F2SubCenter.Q3, "Q3" , 0.4491, 0.6019, 2).store();
        new Vertex(F2SubCenter.O3, "O3" , 0.5473, 0.6019, 2).store();
        new Vertex(F2SubCenter.N3, "N3" , 0.5665, 0.6019, 2).store();
        new Vertex(F2SubCenter.M3, "M3" , 0.6185, 0.6019, 2).store();
        new Vertex(F2SubCenter.L3, "L3" , 0.6666, 0.6019, 2).store();
        new Vertex(F2SubCenter.J3, "J3" , 0.4992, 0.3806, 2).store();
        new Vertex(F2SubCenter.I3, "I3" , 0.3760, 0.3806, 2).store();
        new Vertex(F2SubCenter.K3, "K3" , 0.6185, 0.3806, 2).store();





        //necessary points added

        new Vertex(F2SubCenter.start_position, "Start", 0, 0, 2).store();
        new Vertex(F2SubCenter.end_position, "End", 0, 0, 2).store();
        new Vertex(F2SubCenter.start_auxiliary_pos, "Start_aux", 0, 0, 2).store();
        new Vertex(F2SubCenter.end_auxiliary_pos, "End_aux", 0, 0, 2).store();
        new Vertex(F2SubCenter.start_auxiliary_pos2, "Start_aux2", 0, 0, 2).store();
        new Vertex(F2SubCenter.end_auxiliary_pos2, "End_aux2", 0, 0, 2).store();
        new Vertex(F2SubCenter.start_auxiliary_pos3, "Start_aux3", 0, 0, 2).store();
        new Vertex(F2SubCenter.end_auxiliary_pos3, "End_aux3", 0, 0, 2).store();
        new Vertex(F2SubCenter.start_auxiliary_pos4, "Start_aux4", 0, 0, 2).store();
        new Vertex(F2SubCenter.end_auxiliary_pos4, "End_aux4", 0, 0, 2).store();


        //extend points added

        new Vertex(F2SubCenter.EM1, "EM1",0.2702,0.7520, 2).store();
        new Vertex(F2SubCenter.EM2, "EM2",0.2702,0.6019, 2).store();
        new Vertex(F2SubCenter.EM3, "EM3",0.2702,0.5711, 2).store();
        new Vertex(F2SubCenter.EM4, "EM4",0.2702,0.5018, 2).store();
        new Vertex(F2SubCenter.EM5, "EM5",0.2702,0.4210, 2).store();
        new Vertex(F2SubCenter.EM6, "EM6",0.3760,0.4210, 2).store();
        new Vertex(F2SubCenter.EM7, "EM7",0.4992,0.4210, 2).store();
        new Vertex(F2SubCenter.EM8, "EM8",0.6185,0.4210, 2).store();
        new Vertex(F2SubCenter.EM9, "EM9",0.7263,0.4210, 2).store();
        new Vertex(F2SubCenter.EM10, "EM10",0.7263,0.5018, 2).store();
        new Vertex(F2SubCenter.EM11, "EM11",0.7263,0.5711, 2).store();
        new Vertex(F2SubCenter.EM12, "EM12",0.7263,0.6019, 2).store();
        new Vertex(F2SubCenter.EM13, "EM13",0.7263,0.7520, 2).store();

    }
    
    public static void loadVertex_F2Top() {
        //basic points added
        new Vertex(F2SubTop.SC2, "SC2" , 0.4992, 0.8001, 2).store();
        new Vertex(F2SubTop.E9, "E9" , 0.4395, 0.9713, 2).store();
        new Vertex(F2SubTop.WT11, "WT11" , 0.3799, 0.9502, 2).store();
        new Vertex(F2SubTop.E8, "E8" , 0.3183, 0.9713, 2).store();
        new Vertex(F2SubTop.E7, "E7" , 0.1990, 0.9713, 2).store();
        new Vertex(F2SubTop.EL7, "EL7" , 0.1432, 0.9502, 2).store();
        new Vertex(F2SubTop.ES7, "ES7" , 0.1182, 0.9155, 2).store();
        new Vertex(F2SubTop.W7, "W7" , 0.0604, 0.9329, 2).store();
        new Vertex(F2SubTop.WT9, "WT9" , 0.0450, 0.9329, 2).store();
        new Vertex(F2SubTop.E6, "E6" , 0.0316, 0.8636, 2).store();
        new Vertex(F2SubTop.E5, "E5" , 0.0316, 0.7404, 2).store();
        new Vertex(F2SubTop.WT7, "WT7" , 0.0450, 0.6808, 2).store();
        new Vertex(F2SubTop.E4, "E4" , 0.0316, 0.6211, 2).store();
        new Vertex(F2SubTop.E3, "E3" , 0.0316, 0.5018, 2).store();
        new Vertex(F2SubTop.E2, "E2" , 0.0316, 0.3825, 2).store();
        new Vertex(F2SubTop.WT3, "WT3" , 0.0450, 0.3190, 2).store();
        new Vertex(F2SubTop.E1, "E1" , 0.0316, 0.2632, 2).store();
        new Vertex(F2SubTop.W3, "W3" , 0.0604, 0.1939, 2).store();
        new Vertex(F2SubTop.S19, "S19" , 0.1085, 0.2863, 2).store();
        new Vertex(F2SubTop.S18, "S18" , 0.1085, 0.3190, 2).store();
        new Vertex(F2SubTop.S17, "S17" , 0.1085, 0.3632, 2).store();
        new Vertex(F2SubTop.S20, "S20" , 0.1797, 0.3998, 2).store();
        new Vertex(F2SubTop.SC1, "SC1" , 0.2009, 0.5018, 2).store();
        new Vertex(F2SubTop.S27, "S27" , 0.1509, 0.7404, 2).store();
        new Vertex(F2SubTop.S26, "S26" , 0.1509, 0.7808, 2).store();
        new Vertex(F2SubTop.S25, "S25" , 0.1509, 0.8212, 2).store();
        new Vertex(F2SubTop.S28, "S28" , 0.2163, 0.8520, 2).store();
        new Vertex(F2SubTop.S29, "S29" , 0.2548, 0.8520, 2).store();
        new Vertex(F2SubTop.S33, "S33" , 0.7416, 0.8520, 2).store();
        new Vertex(F2SubTop.S34, "S34" , 0.7763, 0.8520, 2).store();
        new Vertex(F2SubTop.S30, "S30" , 0.8436, 0.8212, 2).store();
        new Vertex(F2SubTop.S31, "S31" , 0.8436, 0.7808, 2).store();
        new Vertex(F2SubTop.S32, "S32" , 0.8436, 0.7404, 2).store();
        new Vertex(F2SubTop.SC3, "SC3" , 0.7975, 0.5018, 2).store();
        new Vertex(F2SubTop.S24, "S24" , 0.8186, 0.3960, 2).store();
        new Vertex(F2SubTop.S21, "S21" , 0.8860, 0.3632, 2).store();
        new Vertex(F2SubTop.S22, "S22" , 0.8860, 0.3190, 2).store();
        new Vertex(F2SubTop.S23, "S23" , 0.8860, 0.2863, 2).store();
        new Vertex(F2SubTop.W4, "W4" , 0.9302, 0.1939, 2).store();
        new Vertex(F2SubTop.E18, "E18" , 0.9630, 0.2632, 2).store();
        new Vertex(F2SubTop.WT4, "WT4" , 0.9514, 0.3190, 2).store();
        new Vertex(F2SubTop.E17, "E17" , 0.9630, 0.3825, 2).store();
        new Vertex(F2SubTop.E16, "E16" , 0.9630, 0.5018, 2).store();
        new Vertex(F2SubTop.E15, "E15" , 0.9630, 0.6211, 2).store();
        new Vertex(F2SubTop.WT8, "WT8" , 0.9514, 0.6808, 2).store();
        new Vertex(F2SubTop.E14, "E14" , 0.9630, 0.7404, 2).store();
        new Vertex(F2SubTop.E13, "E13" , 0.9630, 0.8636, 2).store();
        new Vertex(F2SubTop.WT10, "WT10" , 0.9514, 0.9329, 2).store();
        new Vertex(F2SubTop.W8, "W8" , 0.9283, 0.9329, 2).store();
        new Vertex(F2SubTop.ES8, "ES8" , 0.8764, 0.9155, 2).store();
        new Vertex(F2SubTop.EL8, "EL8" , 0.8552, 0.9502, 2).store();
        new Vertex(F2SubTop.E12, "E12" , 0.7975, 0.9713, 2).store();
        new Vertex(F2SubTop.E11, "E11" , 0.6782, 0.9713, 2).store();
        new Vertex(F2SubTop.WT12, "WT12" , 0.6166, 0.9502, 2).store();
        new Vertex(F2SubTop.E10, "E10" , 0.5625, 0.9713, 2).store();
        new Vertex(F2SubTop.c1, "c1" , 0.4992, 0.9155, 2).store();
        new Vertex(F2SubTop.K, "K" , 0.4395, 0.9155, 2).store();
        new Vertex(F2SubTop.D, "D" , 0.3799, 0.9155, 2).store();
        new Vertex(F2SubTop.F, "F" , 0.3183, 0.9155, 2).store();
        new Vertex(F2SubTop.G, "G" , 0.2548, 0.9155, 2).store();
        new Vertex(F2SubTop.H, "H" , 0.2163, 0.9155, 2).store();
        new Vertex(F2SubTop.A, "A" , 0.1990, 0.9155, 2).store();
        new Vertex(F2SubTop.I, "I" , 0.1432, 0.9155, 2).store();
        new Vertex(F2SubTop.J, "J" , 0.0604, 0.9155, 2).store();
        new Vertex(F2SubTop.B, "B" , 0.0450, 0.9155, 2).store();
        new Vertex(F2SubTop.B1, "B1" , 0.1085, 0.8636, 2).store();
        new Vertex(F2SubTop.A1, "A1" , 0.1085, 0.8212, 2).store();
        new Vertex(F2SubTop.Z, "Z" , 0.1085, 0.7808, 2).store();
        new Vertex(F2SubTop.Y, "Y" , 0.1085, 0.7404, 2).store();
        new Vertex(F2SubTop.X, "X" , 0.1085, 0.6808, 2).store();
        new Vertex(F2SubTop.W, "W" , 0.1085, 0.6211, 2).store();
        new Vertex(F2SubTop.V, "V" , 0.1085, 0.5018, 2).store();
        new Vertex(F2SubTop.U, "U" , 0.1085, 0.3998, 2).store();
        new Vertex(F2SubTop.T, "T" , 0.1085, 0.3825, 2).store();
        new Vertex(F2SubTop.C, "C" , 0.0450, 0.8636, 2).store();
        new Vertex(F2SubTop.L, "L" , 0.0450, 0.7404, 2).store();
        new Vertex(F2SubTop.N, "N" , 0.0450, 0.6211, 2).store();
        new Vertex(F2SubTop.O, "O" , 0.0450, 0.5018, 2).store();
        new Vertex(F2SubTop.P, "P" , 0.0450, 0.3825, 2).store();
        new Vertex(F2SubTop.Q, "Q" , 0.0450, 0.2632, 2).store();
        new Vertex(F2SubTop.R, "R" , 0.0604, 0.2632, 2).store();
        new Vertex(F2SubTop.B4, "B4" , 0.1085, 0.2632, 2).store();
        new Vertex(F2SubTop.S, "S" , 0.1085, 0.1939, 2).store();
        new Vertex(F2SubTop.d1, "d1" , 0.5625, 0.9155, 2).store();
        new Vertex(F2SubTop.e1, "e1" , 0.6166, 0.9155, 2).store();
        new Vertex(F2SubTop.F1, "F1" , 0.6782, 0.9155, 2).store();
        new Vertex(F2SubTop.G1, "G1" , 0.7416, 0.9155, 2).store();
        new Vertex(F2SubTop.H1, "H1" , 0.7763, 0.9155, 2).store();
        new Vertex(F2SubTop.I1, "I1" , 0.7975, 0.9155, 2).store();
        new Vertex(F2SubTop.J1, "J1" , 0.8552, 0.9155, 2).store();
        new Vertex(F2SubTop.K1, "K1" , 0.9283, 0.9155, 2).store();
        new Vertex(F2SubTop.E, "E" , 0.9514, 0.9155, 2).store();
        new Vertex(F2SubTop.L1, "L1" , 0.8860, 0.8636, 2).store();
        new Vertex(F2SubTop.M1, "M1" , 0.8860, 0.8212, 2).store();
        new Vertex(F2SubTop.N1, "N1" , 0.8860, 0.7808, 2).store();
        new Vertex(F2SubTop.O1, "O1" , 0.8860, 0.7404, 2).store();
        new Vertex(F2SubTop.q1, "q1" , 0.8860, 0.6808, 2).store();
        new Vertex(F2SubTop.s1, "s1" , 0.8860, 0.6211, 2).store();
        new Vertex(F2SubTop.U1, "U1" , 0.8860, 0.5018, 2).store();
        new Vertex(F2SubTop.A2, "A2" , 0.8860, 0.1939, 2).store();
        new Vertex(F2SubTop.c4, "c4" , 0.9283, 0.8636, 2).store();
        new Vertex(F2SubTop.P1, "P1" , 0.9283, 0.7404, 2).store();
        new Vertex(F2SubTop.R1, "R1" , 0.9283, 0.6808, 2).store();
        new Vertex(F2SubTop.T1, "T1" , 0.9283, 0.6211, 2).store();
        new Vertex(F2SubTop.V1, "V1" , 0.8186, 0.5018, 2).store();
        new Vertex(F2SubTop.w1, "w1" , 0.9283, 0.5018, 2).store();
        new Vertex(F2SubTop.X1, "X1" , 0.9283, 0.3825, 2).store();
        new Vertex(F2SubTop.D4, "D4" , 0.8860, 0.3825, 2).store();
        new Vertex(F2SubTop.Y1, "Y1" , 0.9283, 0.3190, 2).store();
        new Vertex(F2SubTop.Z1, "Z1" , 0.9283, 0.2632, 2).store();
        new Vertex(F2SubTop.e4, "e4" , 0.8860, 0.2632, 2).store();


        //necessary points added

        new Vertex(F2SubTop.start_position, "Start", 0, 0, 2).store();
        new Vertex(F2SubTop.end_position, "End", 0, 0, 2).store();
        new Vertex(F2SubTop.start_auxiliary_pos, "Start_aux", 0, 0, 2).store();
        new Vertex(F2SubTop.end_auxiliary_pos, "End_aux", 0, 0, 2).store();
        new Vertex(F2SubTop.start_auxiliary_pos2, "Start_aux2", 0, 0, 2).store();
        new Vertex(F2SubTop.end_auxiliary_pos2, "End_aux2", 0, 0, 2).store();
        new Vertex(F2SubTop.start_auxiliary_pos3, "Start_aux3", 0, 0, 2).store();
        new Vertex(F2SubTop.end_auxiliary_pos3, "End_aux3", 0, 0, 2).store();
        new Vertex(F2SubTop.start_auxiliary_pos4, "Start_aux4", 0, 0, 2).store();
        new Vertex(F2SubTop.end_auxiliary_pos4, "End_aux4", 0, 0, 2).store();


        //extend points added

        new Vertex(F2SubTop.ET1, "ET1",0.1797,0.6808, 2).store();
        new Vertex(F2SubTop.ET2, "ET2",0.1797,0.5018, 2).store();
        new Vertex(F2SubTop.ET3, "ET3",0.8186,0.6808, 2).store();
        new Vertex(F2SubTop.ET4, "ET4",0.8186,0.6211, 2).store();
        new Vertex(F2SubTop.ET5, "ET5",0.4992,0.8520, 2).store();
        new Vertex(F2SubTop.ET6, "ET6",0.1797,0.6211, 2).store();
        new Vertex(F2SubTop.ET7, "ET7", 0.8860,0.3960,2).store();

    }
    
    
    
    
    public static void main(String[] args){
        loadVertex_();
    }


}
