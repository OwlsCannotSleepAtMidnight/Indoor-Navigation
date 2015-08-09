package com.Obstacle;

import com.Path.DefinedVertex.SubNumber;
import com.Path.Dijkstra.SubGraph.Vertex;

/**
 * Created by toy on 15-5-10.
 */
public class Cross {
    public static boolean IsOverObstacle(Vertex vertex1, Vertex vertex2) {
        Block.loadBlock();
        if (Division.GetSubGraphNum(vertex1) != Division.GetSubGraphNum(vertex2))
            return true;
        SubNumber sub_no = Division.GetSubGraphNum(vertex1);
        if (sub_no == SubNumber.B1Sub) {
            return IsOverObstacleB1Sub(vertex1, vertex2);
        }
        if (sub_no == SubNumber.F1SubLeft) {
            return IsOverObstacleF1SubLeft(vertex1, vertex2);
        }
        if (sub_no == SubNumber.F1SubRight) {
            return IsOverObstacleF1SubRight(vertex1, vertex2);
        }
        if (sub_no == SubNumber.F1SubBottom) {
            return IsOverObstacleF1SubBottom(vertex1, vertex2);
        }
        if (sub_no == SubNumber.F2SubBottom) {
            return IsOverObstacleF2SubBottom(vertex1, vertex2);
        }
        if (sub_no == SubNumber.F2SubCenter) {
            return IsOverObstacleF2SubCenter(vertex1, vertex2);
        }
        if (sub_no == SubNumber.F2SubTop) {
            return IsOverObstacleF2SubTop(vertex1, vertex2);
        }
        return true;
    }

    public static boolean IsInScopePartB1(SubNumber no, Vertex v1, Vertex v2) {
        return !(v1.getY() > 0.38 || v2.getY() > 0.38);
    }

    public static boolean IsOverObstacleB1Sub(Vertex v1, Vertex v2) {
        if (!IsInScopePartB1(SubNumber.B1Sub, v1, v2))
            return true;
        for (Enum each : BlockB1.values()) {
            if (Block.getBlock(each).isOverBlock(v1, v2))
                return true;
        }
        return false;

    }

    public static boolean IsOverObstacleF1SubLeft(Vertex v1, Vertex v2) {
        for (Enum each : BlockF1Left.values()) {
            if (Block.getBlock(each).isOverBlock(v1, v2))
                return true;
        }
        return false;

    }

    public static boolean IsOverObstacleF1SubRight(Vertex v1, Vertex v2) {
        for (Enum each : BlockF1Right.values()) {
            if (Block.getBlock(each).isOverBlock(v1, v2))
                return true;
        }
        return false;

    }

    public static boolean IsOverObstacleF1SubBottom(Vertex v1, Vertex v2) {
        for (Enum each : BlockF1Bottom.values()) {
            if (Block.getBlock(each).isOverBlock(v1, v2))
                return true;
        }
        return false;

    }

    public static boolean IsOverObstacleF2SubBottom(Vertex v1, Vertex v2) {
        for (Enum each : BlockF2Bottom.values()) {
            if (Block.getBlock(each).isOverBlock(v1, v2))
                return true;
        }
        return false;

    }

    public static boolean IsOverObstacleF2SubCenter(Vertex v1, Vertex v2) {
        for (Enum each : BlockF2Center.values()) {
            if (Block.getBlock(each).isOverBlock(v1, v2))
                return true;
        }
        return false;

    }

    public static boolean IsOverObstacleF2SubTop(Vertex v1, Vertex v2) {
        for (Enum each : BlockF2Top.values()) {
            if (Block.getBlock(each).isOverBlock(v1, v2))
                return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Vertex v1 = new Vertex("v1", 0.6185, 0.1746, 1);
        Vertex v2 = new Vertex("v2", 0.6358, 0.2497, 2);
        System.out.println(IsOverObstacle(v1, v2));

    }

}