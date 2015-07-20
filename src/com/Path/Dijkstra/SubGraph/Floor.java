package com.Path.Dijkstra.SubGraph;

import com.Obstacle.Cross;
import com.Path.DefinedVertex.B1Vertex;
import com.Path.DefinedVertex.SubNumber;

import java.util.ArrayList;

/**
 * Created by toy on 15-5-10.
 */
public abstract class Floor {
    protected int _stair;
    protected SubNumber _sub_no;
    public static final int left_up = 0;
    public static final int left_down = 1;
    public static final int right_up = 2;
    public static final int right_down = 3;
    //ArrayList<Vertex> B1_vertex= new ArrayList();
    protected Graph _path;
    Vertex[] judge_start = new Vertex[5];
    Vertex[] judge_end = new Vertex[5];
    
    public Floor(int stair) {
        _path = new Graph();
        _stair = stair;
        InitializeVertex();
        InitializeEdge();

    }
    public abstract int GetStartOrder();
    public abstract int GetEndOrder();
    public abstract int GetStartAux1Order();
    public abstract int GetStartAux2Order();
    public abstract int GetStartAux3Order();
    public abstract int GetStartAux4Order();
    public abstract int GetEndAux1Order();
    public abstract int GetEndAux2Order();
    public abstract int GetEndAux3Order();
    public abstract int GetEndAux4Order();


    public abstract void InitializeVertex();
    public abstract void InitializeEdge();
    public void SetStartPosition(double x, double y, double z) {
        _path.GetVertex(GetStartOrder()).SetXYZ(x, y, z);
    }

    public void SetEndPosition(double x, double y, double z) {
        _path.GetVertex(GetEndOrder()).SetXYZ(x, y, z);
    }

    public void AnalyzeVertex(String str, int point) {
        str = str.replaceAll("\\[", "");
        str = str.replaceAll("\\]", "");
        str = str.replaceAll("\\s", "");
        String xyz[] = str.split(",");
        double pos_x = Double.valueOf(xyz[0]);
        double pos_y = Double.valueOf(xyz[1]);
        double pos_z = Double.valueOf(xyz[2]);
        if (point == 0) {
            SetStartPosition(pos_x, pos_y, pos_z);
        } else {
            SetEndPosition(pos_x, pos_y, pos_z);
        }
    }

    public void InitializeStartEnd() {
        _path.GetPin().set(GetStartOrder(), InsertSEVertex(true));
        _path.GetPin().set(GetEndOrder(), InsertSEVertex(false));

    }

    public Vertex InsertSEVertex(boolean is_start) {
        Vertex start;
        int aux, aux2, aux3, aux4;
        if (is_start) {
            start = _path.GetVertex(GetStartOrder());
            aux = GetStartAux1Order();
            aux2 = GetStartAux2Order();
            aux3 = GetStartAux3Order();
            aux4 = GetStartAux4Order();
        } else {
            start = _path.GetVertex(GetEndOrder());
            aux = GetEndAux1Order();
            aux2 =  GetEndAux2Order();
            aux3 =  GetEndAux3Order();
            aux4 =  GetEndAux4Order();
        }

        Vertex start_near[] = new Vertex[5];
        start_near = GetNearestVertexes(start);
        if (start != start_near[4]) {
            start = start_near[4];
        }
        SetSEJudge(start_near, is_start);
        TouchRoute(aux, aux2, aux3, aux4, start_near);
        return start;
    }

    public void TouchRoute(int aux, int aux2, int aux3, int aux4, Vertex[] news) {
        SetAuxV(aux, aux2, aux3, aux4, news);
        SetAuxR(news[left_up], _path.GetVertex(aux), true);
        SetAuxR(news[left_up], _path.GetVertex(aux4), false);
        SetAuxR(news[left_down], _path.GetVertex(aux3), true);
        SetAuxR(news[left_down], _path.GetVertex(aux4), false);
        SetAuxR(news[right_up], _path.GetVertex(aux), true);
        SetAuxR(news[right_up], _path.GetVertex(aux2), false);
        SetAuxR(news[right_down], _path.GetVertex(aux3), true);
        SetAuxR(news[right_down], _path.GetVertex(aux2), false);

        _path.AddRoute(news[4], _path.GetVertex(aux), Math.abs(news[4].GetY() - _path.GetVertex(aux).GetY()));
        _path.AddRoute(news[4], _path.GetVertex(aux3), Math.abs(news[4].GetY() - _path.GetVertex(aux3).GetY()));

        _path.AddRoute(news[4], _path.GetVertex(aux2), Math.abs(news[4].GetX() - _path.GetVertex(aux2).GetX()));
        _path.AddRoute(news[4], _path.GetVertex(aux4), Math.abs(news[4].GetX() - _path.GetVertex(aux4).GetX()));

    }

    protected double Distance(Vertex v1, Vertex v2) {
        return Math.sqrt(Math.pow(v1.GetX() - v2.GetX(), 2) + Math.pow(v1.GetY() - v2.GetY(), 2));
    }

    public void SetSEJudge(Vertex[] v, boolean is_start) {
        if (is_start) {
            judge_start = v;
        } else {
            judge_end = v;
        }
    }

    protected void SetAuxR(Vertex v1, Vertex v2, boolean is_x) {
        if (v1 == null || v2 == null)
            return;
        if (!Cross.IsOverObstacle(GetSubNO(),_path,v1, v2)) {
            _path.AddRoute(v1, v2, Distance(v1, v2));
        }
    }

    protected void SetAuxV(int aux, int aux2, int aux3, int aux4, Vertex[] news) {
        if (NearVExist(left_up, news)) {
            _path.GetVertex(aux).SetXYZ(news[4].GetX(), news[left_up].GetY(), _stair);
            _path.GetVertex(aux4).SetXYZ(news[left_up].GetX(), news[4].GetY(), _stair);
        }
        if (NearVExist(left_down, news)) {
            _path.GetVertex(aux3).SetXYZ(news[4].GetX(), news[left_down].GetY(), _stair);
            if (NearVExist(left_up, news) && (news[left_up].GetX() < news[left_down].GetX()))
                _path.GetVertex(aux4).SetXYZ(news[left_down].GetX(), news[4].GetY(), _stair);
        }
        if (NearVExist(right_up, news)) {
            if (NearVExist(left_up, news) && (news[left_up].GetY() > news[right_up].GetY()))
                _path.GetVertex(aux).SetXYZ(news[4].GetX(), news[right_up].GetY(), _stair);
            _path.GetVertex(aux2).SetXYZ(news[right_up].GetX(), news[4].GetY(), _stair);
        }
        if (NearVExist(right_down, news)) {
            if (NearVExist(right_up, news) && (news[right_up].GetX() > news[right_down].GetX()))
                _path.GetVertex(aux2).SetXYZ(news[right_down].GetX(), news[4].GetY(), _stair);
            if (NearVExist(left_down, news) && (news[left_down].GetY() < news[right_down].GetY()))
                _path.GetVertex(aux3).SetXYZ(news[4].GetX(), news[right_down].GetY(), _stair);
        }
    }

    public boolean NearVExist(int direction, Vertex[] v) {
        return v[direction] != null;
    }

    public Vertex[] GetNearestVertexes(Vertex v) {
        Vertex nearest_vertex[] = new Vertex[5];
        for (int i = 0; i < 4; i++) {
            nearest_vertex[i] = null;
        }
        nearest_vertex[4] = v;
        double sum[] = {2, 2, 2, 2};
        for (Vertex vertex : _path.GetPin()) {
            if (vertex == v)
                continue;
            //if (vertex.GetName().equals("Start"))
            //    continue;
            if (vertex.GetName().equals("Start_aux2"))
                continue;
            if (vertex.GetName().equals("End_aux2"))
                continue;
            if (vertex.GetName().equals("Start_aux"))
                continue;
            if (vertex.GetName().equals("End_aux"))
                continue;
            //if(vertex.GetName().equals("End"))
            //   continue;
            if (vertex.GetName().equals("Start_aux3"))
                continue;
            if (vertex.GetName().equals("End_aux3"))
                continue;
            if (vertex.GetName().equals("Start_aux4"))
                continue;
            if (vertex.GetName().equals("End_aux4"))
                continue;
            if (v.GetX() == vertex.GetX() && v.GetY() == vertex.GetY()) {
                nearest_vertex[4] = vertex;
                for (int i = 0; i < 4; i++) {
                    nearest_vertex[i] = null;
                }
                break;
            }
            //距离start左上最近点点
            double tmp = Math.abs(v.GetX() - vertex.GetX()) + Math.abs(v.GetY() - vertex.GetY());
            if (vertex.GetX() < v.GetX()) {
                if (vertex.GetY() >= v.GetY()) {
                    if (sum[left_up] > tmp) {
                        sum[left_up] = tmp;
                        nearest_vertex[left_up] = vertex;
                    }
                }
                //距离start左下的点
                else {
                    if (sum[left_down] > tmp) {
                        sum[left_down] = tmp;
                        nearest_vertex[left_down] = vertex;
                    }
                }
            }
            //距离start右上的点
            else {
                if (vertex.GetY() >= v.GetY()) {
                    if (sum[right_up] > tmp) {
                        sum[right_up] = tmp;
                        nearest_vertex[right_up] = vertex;
                    }
                }
                //距离start右下的点
                else {
                    if (sum[right_down] > tmp) {
                        sum[right_down] = tmp;
                        nearest_vertex[right_down] = vertex;
                    }
                }
            }
        }
        return nearest_vertex;
    }
    public ArrayList<Vertex> GetOutList() {
        return _path.OutputVxt(_path.GetVertex(GetStartOrder()), _path.GetVertex(GetEndOrder()));
    }

    public String GetArrList() {
        return _path.run(_path.GetVertex(GetStartOrder()), _path.GetVertex(GetEndOrder()));
    }

    public String GetOutString(ArrayList<Vertex> list) {
        return _path.GetString(list);

    }
    public SubNumber GetSubNO(){
        return _sub_no;
    }
    public Graph GetPath(){
        return _path;
    }

}
