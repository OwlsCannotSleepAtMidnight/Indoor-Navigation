package com.Obstacle;

import com.Path.Dijkstra.SubGraph.Vertex;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by toy on 8/4/15.
 */
public class Block {
    private double __left;
    private double __right;
    private double __up;
    private double __down;
    private Enum __id;

    public Enum getID(){
        return __id;
    }

    public double getUp(){
        return __up;
    }
    public double getDown(){
        return __down;
    }
    public double getLeft(){
        return __left;
    }
    public double getRight(){
        return __right;
    }
    private static Dictionary __instance = new Hashtable();

    private Block(Enum id, double l, double r, double u, double d){
        __left = l;
        __right = r;
        __up = u;
        __down = d;
        __id = id;
    }

    private void store(){
        __instance.put(this.getID(), this);
    }
    public static Block getBlock(Enum id){
        return (Block)__instance.get(id);
    }

    public boolean isInBlock(Vertex v){
        return (v.GetX() >= getLeft() && v.GetX() <= getRight() && v.GetY() <= getUp() && v.GetY() >= getDown());
    }

    private boolean isSameSign(double a, double b){
        return  (Math.abs(a + b) == Math.abs(a) + Math.abs(b));
    }
    public boolean isOverBlock(Vertex v1, Vertex v2){
        if(v1.GetX() > v2.GetX()){
            Vertex tmp = v1;
            v1 = v2;
            v2 = tmp;
        }

        if(v1.GetX()>=getRight())
            return false;
        if(v2.GetX()<=getLeft())
            return false;
        if(v1.GetY() >= getUp() && v2.GetY() >= getUp())
            return false;
        if(v1.GetY() <= getDown() && v2.GetY() <= getDown())
            return false;

        if(v1.GetX() == v2.GetX()){
            double axis_y = (getUp() + getDown()) / 2;
            if(v1.GetX() >= getLeft() && v1.GetX() <= getRight()
                    && !isSameSign(axis_y-v1.GetY(),axis_y-v2.GetY()))
                return true;
        }
        if(v1.GetY() == v2.GetY()){
            double axis_x = (getLeft() + getRight()) / 2;
            if(v1.GetX() <= axis_x && v2.GetX() >= axis_x
                    && v1.GetY() <= getUp() && v1.GetY() >= getDown())
                return true;
        }
        double k_slope = (v1.GetY() - v2.GetY())/(v1.GetX() - v2.GetX());
        double b_intercept = v1.GetY() - k_slope*v1.GetX();
        double top_intercept;
        double bottom_intercept;
        if(k_slope > 0){
            top_intercept = getUp() - k_slope*getLeft();
            bottom_intercept = getDown() - k_slope*getRight();
            if(b_intercept < top_intercept && b_intercept > bottom_intercept){
                if(v2.GetX() >= getLeft() && v2.GetY() >= getDown()
                        && v1.GetX() <= getRight() && v1.GetY() <= getUp())
                    return true;
            }
        }
        else{
            top_intercept = getUp() - k_slope*getRight();
            bottom_intercept = getDown() - k_slope*getLeft();
            if(b_intercept < top_intercept && b_intercept > bottom_intercept){
                if(v2.GetX() >= getLeft() && v2.GetY() <= getUp()
                        && v1.GetX() <= getRight() && v1.GetY() >= getDown())
                    return true;
            }
        }


        return false;

    }

    public static void loadBlock(){
        loadBlockB1();
        loadBlockF1Bottom();
        loadBlockF1Left();
        loadBlockF1Right();
        loadBlockF2Bottom();
        loadBlockF2Center();
        loadBlockF2Top();
    }

    public static void loadBlockB1(){
        new Block(BlockB1.EL3, 0.3,  0.32, 0.38, 0.34).store();
        new Block(BlockB1.ES3, 0.32, 0.34, 0.38, 0.32).store();
        new Block(BlockB1.ES4, 0.66, 0.68, 0.38, 0.32).store();
        new Block(BlockB1.EL4, 0.68, 0.7,  0.38, 0.34).store();
        new Block(BlockB1.ES1, 0.11, 0.13, 0.08, 0.02).store();
        new Block(BlockB1.EL1, 0.13, 0.15, 0.04, 0.02).store();
        new Block(BlockB1.EL2, 0.85, 0.87, 0.04, 0.02).store();
        new Block(BlockB1.ES2, 0.87, 0.89, 0.08, 0.02).store();
    }

    public static void loadBlockF1Bottom(){
        new Block(BlockF1Bottom.EL3,        0.3,  0.32,  0.38, 0.34).store();
        new Block(BlockF1Bottom.ES3,        0.32, 0.34,  0.38, 0.32).store();
        new Block(BlockF1Bottom.ES4,        0.66, 0.68,  0.38, 0.32).store();
        new Block(BlockF1Bottom.EL4,        0.68, 0.7,   0.38, 0.34).store();
        new Block(BlockF1Bottom.ES1,        0.11, 0.13,  0.08, 0.02).store();
        new Block(BlockF1Bottom.EL1,        0.13, 0.15,  0.04, 0.02).store();
        new Block(BlockF1Bottom.EL2,        0.85, 0.87,  0.04, 0.02).store();
        new Block(BlockF1Bottom.ES2,        0.87, 0.89,  0.08, 0.02).store();
        new Block(BlockF1Bottom.S12,        0.14, 0.2,   0.2,  0.16).store();
        new Block(BlockF1Bottom.S9S10S11,   0.2,  0.24,  0.28, 0.16).store();
        new Block(BlockF1Bottom.S1S2,       0.34, 0.42,  0.06, 0.02).store();
        new Block(BlockF1Bottom.S5S6Q1,     0.34, 0.42,  0.24, 0.18).store();
        new Block(BlockF1Bottom.wall,       0.42, 0.58,  0.34, 0.34).store();
        new Block(BlockF1Bottom.S7S8Q2,     0.58, 0.66,  0.24, 0.18).store();
        new Block(BlockF1Bottom.S3S4,       0.42, 0.58,  0.34, 0.34).store();
        new Block(BlockF1Bottom.S13S14S15,  0.76, 0.8,   0.28, 0.16).store();
        new Block(BlockF1Bottom.S16,        0.8,  0.84,  0.2,  0.16).store();
    }

    public static void loadBlockF1Left(){
        new Block(BlockF1Left.WT3,       0.02,  0.04,  0.33,  0.307 ).store();
        new Block(BlockF1Left.S17S18S19, 0.122, 0.162, 0.38,  0.264 ).store();
        new Block(BlockF1Left.S20,       0.162,  0.2,   0.38,  0.34  ).store();
        new Block(BlockF1Left.WT7,       0.02,  0.04,  0.69,  0.666 ).store();
        new Block(BlockF1Left.ES7,       0.11,  0.13,  0.98,  0.92  ).store();
        new Block(BlockF1Left.EL7,       0.13,  0.15,  0.98,  0.955 ).store();
        new Block(BlockF1Left.S25S30,    0.16,  0.24,  0.835, 0.72  ).store();
        new Block(BlockF1Left.B1,        0.2,   0.22,  0.56,  0.44  ).store();
        new Block(BlockF1Left.B2,        0.32,  0.34,  0.56,  0.44  ).store();
        new Block(BlockF1Left.B3,        0.44,  0.46,  0.62,  0.5   ).store();
        new Block(BlockF1Left.EL5,       0.3,   0.32,  0.655, 0.615 ).store();
        new Block(BlockF1Left.ES5,       0.32,  0.34,  0.68,  0.615 ).store();
        new Block(BlockF1Left.S31S32S33, 0.46,  0.5,   0.835, 0.72  ).store();
        new Block(BlockF1Left.WT11,      0.37,  0.39,  0.98,  0.955 ).store();

    }

    public static void loadBlockF1Right(){
        new Block(BlockF1Right.WT4,       0.96,  0.98,  0.33,  0.307 ).store();
        new Block(BlockF1Right.S21S22S23, 0.838, 0.878, 0.38,  0.264 ).store();
        new Block(BlockF1Right.S24,       0.8,   0.838, 0.38,  0.34  ).store();
        new Block(BlockF1Right.WT8,       0.96,  0.98,  0.69,  0.666 ).store();
        new Block(BlockF1Right.ES8,       0.87,  0.89,  0.98,  0.92  ).store();
        new Block(BlockF1Right.EL8,       0.85,  0.87,  0.98,  0.955 ).store();
        new Block(BlockF1Right.S37S42,    0.76,  0.84,  0.835, 0.72  ).store();
        new Block(BlockF1Right.B6,        0.78,  0.8,   0.56,  0.44  ).store();
        new Block(BlockF1Right.B5,        0.66, 0.68,   0.56,  0.44  ).store();
        new Block(BlockF1Right.B4,        0.54, 0.56,   0.62,  0.5   ).store();
        new Block(BlockF1Right.EL6,       0.68,  0.7,   0.655, 0.615 ).store();
        new Block(BlockF1Right.ES6,       0.66, 0.68,   0.68,  0.615 ).store();
        new Block(BlockF1Right.S34S35S36, 0.5,  0.54,   0.835, 0.72  ).store();
        new Block(BlockF1Right.WT12,      0.37, 0.39,  0.98,  0.955 ).store();

    }

    public static void loadBlockF2Bottom(){
        new Block(BlockF2Bottom.EL3,        0.3,  0.32,  0.38, 0.34).store();
        new Block(BlockF2Bottom.ES3,        0.32, 0.34,  0.38, 0.32).store();
        new Block(BlockF2Bottom.ES4,        0.66, 0.68,  0.38, 0.32).store();
        new Block(BlockF2Bottom.EL4,        0.68, 0.7,   0.38, 0.34).store();
        new Block(BlockF2Bottom.ES1,        0.11, 0.13,  0.08, 0.02).store();
        new Block(BlockF2Bottom.EL1,        0.13, 0.15,  0.04, 0.02).store();
        new Block(BlockF2Bottom.EL2,        0.85, 0.87,  0.04, 0.02).store();
        new Block(BlockF2Bottom.ES2,        0.87, 0.89,  0.08, 0.02).store();
        new Block(BlockF2Bottom.S12,        0.14, 0.2,   0.2,  0.16).store();
        new Block(BlockF2Bottom.S9S10S11,   0.2,  0.24,  0.28, 0.16).store();
        new Block(BlockF2Bottom.S1S2,       0.34, 0.42,  0.06, 0.02).store();
        new Block(BlockF2Bottom.S5S6Q1,     0.34, 0.42,  0.24, 0.18).store();
        new Block(BlockF2Bottom.S7S8Q2,     0.58, 0.66,  0.24, 0.18).store();
        new Block(BlockF2Bottom.S3S4,       0.42, 0.58,  0.34, 0.34).store();
        new Block(BlockF2Bottom.S13S14S15,  0.76, 0.8,   0.28, 0.16).store();
        new Block(BlockF2Bottom.S16,        0.8,  0.84,  0.2,  0.16).store();

    }

    public static void loadBlockF2Center(){
        new Block(BlockF2Center.EL5,       0.3,  0.32, 0.655, 0.615 ).store();
        new Block(BlockF2Center.ES5,       0.32, 0.34, 0.68,  0.615 ).store();
        new Block(BlockF2Center.EL6,       0.68, 0.7,  0.655, 0.615 ).store();
        new Block(BlockF2Center.ES6,       0.66, 0.68, 0.68,  0.615 ).store();
        new Block(BlockF2Center.C1,        0.32, 0.34, 0.56,  0.44 ).store();
        new Block(BlockF2Center.C2C3,      0.42, 0.46, 0.56,  0.44 ).store();
        new Block(BlockF2Center.C4C5,      0.54, 0.58, 0.56,  0.44 ).store();
        new Block(BlockF2Center.C6,        0.66, 0.68, 0.56,  0.44 ).store();


    }

    public static void loadBlockF2Top(){
        new Block(BlockF2Top.WT3,       0.02,  0.04,  0.33,  0.307 ).store();
        new Block(BlockF2Top.S17S18S19, 0.122, 0.162, 0.38,  0.264 ).store();
        new Block(BlockF2Top.S20,       0.162,  0.2,   0.38,  0.34  ).store();
        new Block(BlockF2Top.WT7,       0.02,  0.04,  0.69,  0.666 ).store();
        new Block(BlockF2Top.ES7,       0.11,  0.13,  0.98,  0.92  ).store();
        new Block(BlockF2Top.EL7,       0.13,  0.15,  0.98,  0.955 ).store();
        new Block(BlockF2Top.WT11,      0.37,  0.39,  0.98,  0.955 ).store();

        new Block(BlockF2Top.WT4,       0.96,  0.98,  0.33,  0.307 ).store();
        new Block(BlockF2Top.S21S22S23, 0.838, 0.878, 0.38,  0.264 ).store();
        new Block(BlockF2Top.S24,       0.8,   0.838, 0.38,  0.34  ).store();
        new Block(BlockF2Top.WT8,       0.96,  0.98,  0.69,  0.666 ).store();
        new Block(BlockF2Top.ES8,       0.87,  0.89,  0.98,  0.92  ).store();
        new Block(BlockF2Top.EL8,       0.85,  0.87,  0.98,  0.955 ).store();
        new Block(BlockF2Top.WT12,      0.37, 0.39,  0.98,  0.955 ).store();

        new Block(BlockF2Top.SC1,      0.18, 0.2,   0.54,  0.46 ).store();
        new Block(BlockF2Top.SC2,      0.46, 0.54,  0.815,  0.795 ).store();
        new Block(BlockF2Top.SC3,      0.8,  0.82,  0.54,  0.46 ).store();

        new Block(BlockF2Top.S25S26S27,      0.16,  0.2,   0.835,  0.72 ).store();
        new Block(BlockF2Top.S25S28S29,      0.16,  0.275, 0.835,  0.795).store();
        new Block(BlockF2Top.S30S31S32,      0.8,   0.84,  0.835,  0.46 ).store();
        new Block(BlockF2Top.S33S34S30,      0.725, 0.84,  0.835, 0.72).store();


    }

    public static void main(String[] args) {
        Block.loadBlockB1();
       // Block b = Block.getBlock(BlockB1.EL1);

    }

}
