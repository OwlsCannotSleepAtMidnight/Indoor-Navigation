package com.Path.Dijkstra.SubGraph;
import com.Path.DefinedVertex.B1Vertex;
import com.Path.DefinedVertex.SubNumber;

import java.util.ArrayList;

/**
 * Created by toy on 4/11/15.
 */


public class B1SubFloor extends Floor{
    //ArrayList<Vertex> B1_vertex= new ArrayList();
    public B1SubFloor(int stair) {
        super(stair);
        _sub_no = SubNumber.B1Sub;
    }

    public void InitializeVertex() {

        _path.AddVertex(B1Vertex.ES1.ordinal(), new Vertex("ES1" ,0.1220,0.0900, _stair));
        _path.AddVertex(B1Vertex.EL1.ordinal(), new Vertex("EL1", 0.1393,0.0553, _stair));
        _path.AddVertex(B1Vertex.D1.ordinal(), new Vertex("D1",  0.2606,0.0419, _stair));
        _path.AddVertex(B1Vertex.D2.ordinal(), new Vertex("D2", 0.4992, 0.0419, _stair));
        _path.AddVertex(B1Vertex.D3.ordinal(), new Vertex("D3", 0.7378, 0.0419, _stair));
        _path.AddVertex(B1Vertex.EL2.ordinal(), new Vertex("EL2", 0.8552,0.0553, _stair));
        _path.AddVertex(B1Vertex.ES2.ordinal(), new Vertex("ES2", 0.8764,0.0900, _stair));
        _path.AddVertex(B1Vertex.EL3.ordinal(), new Vertex("EL3",0.3087,0.3344, _stair));
        _path.AddVertex(B1Vertex.ES3.ordinal(), new Vertex("ES3", 0.3298,0.3151, _stair));
        _path.AddVertex(B1Vertex.ES4.ordinal(), new Vertex("ES4",  0.6666,0.3151, _stair));
        _path.AddVertex(B1Vertex.EL4.ordinal(), new Vertex("EL4", 0.6916,0.3344, _stair));
        _path.AddVertex(B1Vertex.ES1EL1.ordinal(), new Vertex("ES1EL1", 0.17, 0.1, _stair));
        _path.AddVertex(B1Vertex.ES1D1.ordinal(), new Vertex("ES1D1", 0.27, 0.1, _stair));
        _path.AddVertex(B1Vertex.ES1D2.ordinal(), new Vertex("ES1D2", 0.5, 0.1, _stair));
        _path.AddVertex(B1Vertex.ES1D3.ordinal(), new Vertex("ES1D3", 0.72, 0.1, _stair));
        _path.AddVertex(B1Vertex.ES2EL2.ordinal(), new Vertex("ES2EL2", 0.83, 0.1, _stair));
        _path.AddVertex(B1Vertex.ES3EL3.ordinal(), new Vertex("ES3EL3", 0.27, 0.3, _stair));
        _path.AddVertex(B1Vertex.ES3D2.ordinal(), new Vertex("ES3D2", 0.5, 0.3, _stair));
        _path.AddVertex(B1Vertex.ES4EL4.ordinal(), new Vertex("ES4EL4", 0.72, 0.3, _stair));
        _path.AddVertex(B1Vertex.start_position.ordinal(), new Vertex("Start", 0, 0, _stair));
        _path.AddVertex(B1Vertex.end_position.ordinal(), new Vertex("End", 0, 0, _stair));
        _path.AddVertex(B1Vertex.start_auxiliary_pos.ordinal(), new Vertex("Start_aux", 0, 0, _stair));
        _path.AddVertex(B1Vertex.end_auxiliary_pos.ordinal(), new Vertex("End_aux", 0, 0, _stair));
        _path.AddVertex(B1Vertex.ES1NW.ordinal(), new Vertex("ES1NW", 0.08, 0.1, _stair));
        _path.AddVertex(B1Vertex.ES1SW.ordinal(), new Vertex("ES1SW", 0.08, 0.05, _stair));
        _path.AddVertex(B1Vertex.ES2NE.ordinal(), new Vertex("ES2NE", 0.91, 0.1, _stair));
        _path.AddVertex(B1Vertex.ES2SE.ordinal(), new Vertex("ES2SE", 0.91, 0.05, _stair));
        _path.AddVertex(B1Vertex.ES3NE.ordinal(), new Vertex("ES3NE", 0.35, 0.37, _stair));
        _path.AddVertex(B1Vertex.ES3SE.ordinal(), new Vertex("ES3SE", 0.35, 0.3, _stair));
        _path.AddVertex(B1Vertex.ES4NW.ordinal(), new Vertex("ES4NW", 0.62, 0.37, _stair));
        _path.AddVertex(B1Vertex.ES4SW.ordinal(), new Vertex("ES4SW", 0.62, 0.3, _stair));
        _path.AddVertex(B1Vertex.start_auxiliary_pos2.ordinal(), new Vertex("Start_aux2", 0, 0, _stair));
        _path.AddVertex(B1Vertex.end_auxiliary_pos2.ordinal(), new Vertex("End_aux2", 0, 0, _stair));
        _path.AddVertex(B1Vertex.start_auxiliary_pos3.ordinal(), new Vertex("Start_aux3", 0, 0, _stair));
        _path.AddVertex(B1Vertex.end_auxiliary_pos3.ordinal(), new Vertex("End_aux3", 0, 0, _stair));
        _path.AddVertex(B1Vertex.start_auxiliary_pos4.ordinal(), new Vertex("Start_aux4", 0, 0, _stair));
        _path.AddVertex(B1Vertex.end_auxiliary_pos4.ordinal(), new Vertex("End_aux4", 0, 0, _stair));

    }

    public void InitializeEdge() {

        _path.AddRoute(_path.GetVertex(B1Vertex.ES1.ordinal()), _path.GetVertex(B1Vertex.ES1EL1.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES1.ordinal()).GetX() - _path.GetVertex(B1Vertex.ES1EL1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(B1Vertex.EL1.ordinal()), _path.GetVertex(B1Vertex.D1.ordinal()), Math.abs(_path.GetVertex(B1Vertex.EL1.ordinal()).GetX() - _path.GetVertex(B1Vertex.D1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES1EL1.ordinal()), _path.GetVertex(B1Vertex.ES1D1.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES1EL1.ordinal()).GetX() - _path.GetVertex(B1Vertex.ES1D1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES1D1.ordinal()), _path.GetVertex(B1Vertex.ES1D2.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES1D1.ordinal()).GetX() - _path.GetVertex(B1Vertex.ES1D2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(B1Vertex.D1.ordinal()), _path.GetVertex(B1Vertex.D2.ordinal()), Math.abs(_path.GetVertex(B1Vertex.D1.ordinal()).GetX() - _path.GetVertex(B1Vertex.D2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES1D2.ordinal()), _path.GetVertex(B1Vertex.ES1D3.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES1D2.ordinal()).GetX() - _path.GetVertex(B1Vertex.ES1D3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(B1Vertex.D2.ordinal()), _path.GetVertex(B1Vertex.D3.ordinal()), Math.abs(_path.GetVertex(B1Vertex.D2.ordinal()).GetX() - _path.GetVertex(B1Vertex.D3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES1D3.ordinal()), _path.GetVertex(B1Vertex.ES2EL2.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES1D3.ordinal()).GetX() - _path.GetVertex(B1Vertex.ES2EL2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(B1Vertex.D3.ordinal()), _path.GetVertex(B1Vertex.EL2.ordinal()), Math.abs(_path.GetVertex(B1Vertex.D3.ordinal()).GetX() - _path.GetVertex(B1Vertex.EL2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES2EL2.ordinal()), _path.GetVertex(B1Vertex.ES2.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES2EL2.ordinal()).GetX() - _path.GetVertex(B1Vertex.ES2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES3EL3.ordinal()), _path.GetVertex(B1Vertex.ES3.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES3EL3.ordinal()).GetX() - _path.GetVertex(B1Vertex.ES3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES3.ordinal()), _path.GetVertex(B1Vertex.ES3SE.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES3.ordinal()).GetX() - _path.GetVertex(B1Vertex.ES3SE.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES3SE.ordinal()), _path.GetVertex(B1Vertex.ES3D2.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES3SE.ordinal()).GetX() - _path.GetVertex(B1Vertex.ES3D2.ordinal()).GetX()));

        _path.AddRoute(_path.GetVertex(B1Vertex.ES3D2.ordinal()), _path.GetVertex(B1Vertex.ES4SW.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES3D2.ordinal()).GetX() - _path.GetVertex(B1Vertex.ES4SW.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES4SW.ordinal()), _path.GetVertex(B1Vertex.ES4.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES4SW.ordinal()).GetX() - _path.GetVertex(B1Vertex.ES4.ordinal()).GetX()));

        _path.AddRoute(_path.GetVertex(B1Vertex.ES4.ordinal()), _path.GetVertex(B1Vertex.ES4EL4.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES4.ordinal()).GetX() - _path.GetVertex(B1Vertex.ES4EL4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES1NW.ordinal()), _path.GetVertex(B1Vertex.ES1.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES1NW.ordinal()).GetX() - _path.GetVertex(B1Vertex.ES1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES2NE.ordinal()), _path.GetVertex(B1Vertex.ES2.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES2NE.ordinal()).GetX() - _path.GetVertex(B1Vertex.ES2.ordinal()).GetX()));

        _path.AddRoute(_path.GetVertex(B1Vertex.EL1.ordinal()), _path.GetVertex(B1Vertex.ES1EL1.ordinal()), Math.abs(_path.GetVertex(B1Vertex.EL1.ordinal()).GetY() - _path.GetVertex(B1Vertex.ES1EL1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(B1Vertex.EL3.ordinal()), _path.GetVertex(B1Vertex.ES3EL3.ordinal()), Math.abs(_path.GetVertex(B1Vertex.EL3.ordinal()).GetY() - _path.GetVertex(B1Vertex.ES3EL3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES3EL3.ordinal()), _path.GetVertex(B1Vertex.ES1D1.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES3EL3.ordinal()).GetY() - _path.GetVertex(B1Vertex.ES1D1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES1D1.ordinal()), _path.GetVertex(B1Vertex.D1.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES1D1.ordinal()).GetY() - _path.GetVertex(B1Vertex.D1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES3D2.ordinal()), _path.GetVertex(B1Vertex.ES1D2.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES3D2.ordinal()).GetY() - _path.GetVertex(B1Vertex.ES1D2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES1D2.ordinal()), _path.GetVertex(B1Vertex.D2.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES1D2.ordinal()).GetY() - _path.GetVertex(B1Vertex.D2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(B1Vertex.EL4.ordinal()), _path.GetVertex(B1Vertex.ES4EL4.ordinal()), Math.abs(_path.GetVertex(B1Vertex.EL4.ordinal()).GetY() - _path.GetVertex(B1Vertex.ES4EL4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES4EL4.ordinal()), _path.GetVertex(B1Vertex.ES1D3.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES4EL4.ordinal()).GetY() - _path.GetVertex(B1Vertex.ES1D3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES1D3.ordinal()), _path.GetVertex(B1Vertex.D3.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES1D3.ordinal()).GetY() - _path.GetVertex(B1Vertex.D3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES2EL2.ordinal()), _path.GetVertex(B1Vertex.EL2.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES2EL2.ordinal()).GetY() - _path.GetVertex(B1Vertex.EL2.ordinal()).GetY()));


        _path.AddRoute(_path.GetVertex(B1Vertex.ES1NW.ordinal()), _path.GetVertex(B1Vertex.ES1SW.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES1NW.ordinal()).GetY() - _path.GetVertex(B1Vertex.ES1SW.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES4NW.ordinal()), _path.GetVertex(B1Vertex.ES4SW.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES4NW.ordinal()).GetY() - _path.GetVertex(B1Vertex.ES4SW.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES2NE.ordinal()), _path.GetVertex(B1Vertex.ES2SE.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES2NE.ordinal()).GetY() - _path.GetVertex(B1Vertex.ES2SE.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(B1Vertex.ES3NE.ordinal()), _path.GetVertex(B1Vertex.ES3SE.ordinal()), Math.abs(_path.GetVertex(B1Vertex.ES3NE.ordinal()).GetY() - _path.GetVertex(B1Vertex.ES3SE.ordinal()).GetY()));

    }
    public int GetStartOrder(){

        return B1Vertex.start_position.ordinal();
    }
    public int GetEndOrder(){

        return B1Vertex.end_position.ordinal();
    }

    public int GetStartAux1Order(){
        return B1Vertex.start_auxiliary_pos.ordinal();
    }
    public int GetStartAux2Order(){
        return B1Vertex.start_auxiliary_pos2.ordinal();
    }
    public int GetStartAux3Order(){
        return B1Vertex.start_auxiliary_pos3.ordinal();
    }
    public int GetStartAux4Order(){
        return B1Vertex.start_auxiliary_pos4.ordinal();
    }
    public int GetEndAux1Order(){
        return B1Vertex.end_auxiliary_pos.ordinal();
    }
    public int GetEndAux2Order(){
        return B1Vertex.end_auxiliary_pos2.ordinal();
    }
    public int GetEndAux3Order(){
        return B1Vertex.end_auxiliary_pos3.ordinal();
    }
    public int GetEndAux4Order(){
        return B1Vertex.end_auxiliary_pos4.ordinal();
    }
}