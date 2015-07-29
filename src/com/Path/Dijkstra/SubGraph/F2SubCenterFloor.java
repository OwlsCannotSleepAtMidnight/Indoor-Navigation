package com.Path.Dijkstra.SubGraph;
import com.Path.DefinedVertex.F2SubCenter;
import com.Path.DefinedVertex.SubNumber;

/**
 * Created by toy on 4/11/15.
 */


public class F2SubCenterFloor extends Floor{
    //ArrayList<Vertex> B1_vertex= new ArrayList();
    public F2SubCenterFloor(int stair) {
        super(stair);
        _sub_no = SubNumber.F2SubCenter;
    }

    public void InitializeVertex() {

        //basic points added

        _path.AddVertex(F2SubCenter.SC1.ordinal(), new Vertex("SC1" , 0.2009, 0.5018, _stair));
        _path.AddVertex(F2SubCenter.SC2.ordinal(), new Vertex("SC2" , 0.4992, 0.8001, _stair));
        _path.AddVertex(F2SubCenter.SC3.ordinal(), new Vertex("SC3" , 0.7975, 0.5018, _stair));
        _path.AddVertex(F2SubCenter.C1.ordinal(), new Vertex("C1" , 0.3279, 0.5711, _stair));
        _path.AddVertex(F2SubCenter.C2.ordinal(), new Vertex("C2" , 0.4280, 0.5711, _stair));
        _path.AddVertex(F2SubCenter.C3.ordinal(), new Vertex("C3" , 0.4491, 0.5711, _stair));
        _path.AddVertex(F2SubCenter.C4.ordinal(), new Vertex("C4" , 0.5473, 0.5711, _stair));
        _path.AddVertex(F2SubCenter.C5.ordinal(), new Vertex("C5" , 0.5665, 0.5711, _stair));
        _path.AddVertex(F2SubCenter.C6.ordinal(), new Vertex("C6" , 0.6666, 0.5711, _stair));
        _path.AddVertex(F2SubCenter.EL5.ordinal(), new Vertex("EL5" , 0.3029, 0.6750, _stair));
        _path.AddVertex(F2SubCenter.ES5.ordinal(), new Vertex("ES5" , 0.3279, 0.7000, _stair));
        _path.AddVertex(F2SubCenter.ES6.ordinal(), new Vertex("ES6" , 0.6666, 0.7000, _stair));
        _path.AddVertex(F2SubCenter.EL6.ordinal(), new Vertex("EL6" , 0.6897, 0.6750, _stair));
        _path.AddVertex(F2SubCenter.X3.ordinal(), new Vertex("X3" , 0.4992, 0.7520, _stair));
        _path.AddVertex(F2SubCenter.U3.ordinal(), new Vertex("U3" , 0.3029, 0.7520, _stair));
        _path.AddVertex(F2SubCenter.V3.ordinal(), new Vertex("V3" , 0.3279, 0.7520, _stair));
        _path.AddVertex(F2SubCenter.w3.ordinal(), new Vertex("w3" , 0.3760, 0.7520, _stair));
        _path.AddVertex(F2SubCenter.Y3.ordinal(), new Vertex("Y3" , 0.6185, 0.7520, _stair));
        _path.AddVertex(F2SubCenter.Z3.ordinal(), new Vertex("Z3" , 0.6666, 0.7520, _stair));
        _path.AddVertex(F2SubCenter.A4.ordinal(), new Vertex("A4" , 0.6897, 0.7520, _stair));
        _path.AddVertex(F2SubCenter.P3.ordinal(), new Vertex("P3" , 0.4992, 0.6019, _stair));
        _path.AddVertex(F2SubCenter.T3.ordinal(), new Vertex("T3" , 0.3279, 0.6019, _stair));
        _path.AddVertex(F2SubCenter.s3.ordinal(), new Vertex("s3" , 0.3760, 0.6019, _stair));
        _path.AddVertex(F2SubCenter.R3.ordinal(), new Vertex("R3" , 0.4280, 0.6019, _stair));
        _path.AddVertex(F2SubCenter.Q3.ordinal(), new Vertex("Q3" , 0.4491, 0.6019, _stair));
        _path.AddVertex(F2SubCenter.O3.ordinal(), new Vertex("O3" , 0.5473, 0.6019, _stair));
        _path.AddVertex(F2SubCenter.N3.ordinal(), new Vertex("N3" , 0.5665, 0.6019, _stair));
        _path.AddVertex(F2SubCenter.M3.ordinal(), new Vertex("M3" , 0.6185, 0.6019, _stair));
        _path.AddVertex(F2SubCenter.L3.ordinal(), new Vertex("L3" , 0.6666, 0.6019, _stair));
        _path.AddVertex(F2SubCenter.J3.ordinal(), new Vertex("J3" , 0.4992, 0.3806, _stair));
        _path.AddVertex(F2SubCenter.I3.ordinal(), new Vertex("I3" , 0.3760, 0.3806, _stair));
        _path.AddVertex(F2SubCenter.K3.ordinal(), new Vertex("K3" , 0.6185, 0.3806, _stair));





         //necessary points added

        _path.AddVertex(F2SubCenter.start_position.ordinal(), new Vertex("Start", 0, 0, _stair));
        _path.AddVertex(F2SubCenter.end_position.ordinal(), new Vertex("End", 0, 0, _stair));
        _path.AddVertex(F2SubCenter.start_auxiliary_pos.ordinal(), new Vertex("Start_aux", 0, 0, _stair));
        _path.AddVertex(F2SubCenter.end_auxiliary_pos.ordinal(), new Vertex("End_aux", 0, 0, _stair));
        _path.AddVertex(F2SubCenter.start_auxiliary_pos2.ordinal(), new Vertex("Start_aux2", 0, 0, _stair));
        _path.AddVertex(F2SubCenter.end_auxiliary_pos2.ordinal(), new Vertex("End_aux2", 0, 0, _stair));
        _path.AddVertex(F2SubCenter.start_auxiliary_pos3.ordinal(), new Vertex("Start_aux3", 0, 0, _stair));
        _path.AddVertex(F2SubCenter.end_auxiliary_pos3.ordinal(), new Vertex("End_aux3", 0, 0, _stair));
        _path.AddVertex(F2SubCenter.start_auxiliary_pos4.ordinal(), new Vertex("Start_aux4", 0, 0, _stair));
        _path.AddVertex(F2SubCenter.end_auxiliary_pos4.ordinal(), new Vertex("End_aux4", 0, 0, _stair));


        //extend points added

        _path.AddVertex(F2SubCenter.EM1.ordinal(), new Vertex("EM1",0.2702,0.7520, _stair));
        _path.AddVertex(F2SubCenter.EM2.ordinal(), new Vertex("EM2",0.2702,0.6019, _stair));
        _path.AddVertex(F2SubCenter.EM3.ordinal(), new Vertex("EM3",0.2702,0.5711, _stair));
        _path.AddVertex(F2SubCenter.EM4.ordinal(), new Vertex("EM4",0.2702,0.5018, _stair));
        _path.AddVertex(F2SubCenter.EM5.ordinal(), new Vertex("EM5",0.2702,0.4210, _stair));
        _path.AddVertex(F2SubCenter.EM6.ordinal(), new Vertex("EM6",0.3760,0.4210, _stair));
        _path.AddVertex(F2SubCenter.EM7.ordinal(), new Vertex("EM7",0.4992,0.4210, _stair));
        _path.AddVertex(F2SubCenter.EM8.ordinal(), new Vertex("EM8",0.6185,0.4210, _stair));
        _path.AddVertex(F2SubCenter.EM9.ordinal(), new Vertex("EM9",0.7263,0.4210, _stair));
        _path.AddVertex(F2SubCenter.EM10.ordinal(), new Vertex("EM10",0.7263,0.5018, _stair));
        _path.AddVertex(F2SubCenter.EM11.ordinal(), new Vertex("EM11",0.7263,0.5711, _stair));
        _path.AddVertex(F2SubCenter.EM12.ordinal(), new Vertex("EM12",0.7263,0.6019, _stair));
        _path.AddVertex(F2SubCenter.EM13.ordinal(), new Vertex("EM13",0.7263,0.7520, _stair));

    }

    public void InitializeEdge() {

        //basic edges added

        _path.AddRoute(_path.GetVertex(F2SubCenter.A4.ordinal()), _path.GetVertex(F2SubCenter.EL6.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.A4.ordinal()).GetY()-_path.GetVertex(F2SubCenter.EL6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.C1.ordinal()), _path.GetVertex(F2SubCenter.C2.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.C1.ordinal()).GetX()-_path.GetVertex(F2SubCenter.C2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.C1.ordinal()), _path.GetVertex(F2SubCenter.T3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.C1.ordinal()).GetY()-_path.GetVertex(F2SubCenter.T3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.C2.ordinal()), _path.GetVertex(F2SubCenter.C3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.C2.ordinal()).GetX()-_path.GetVertex(F2SubCenter.C3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.C2.ordinal()), _path.GetVertex(F2SubCenter.R3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.C2.ordinal()).GetY()-_path.GetVertex(F2SubCenter.R3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.C3.ordinal()), _path.GetVertex(F2SubCenter.C4.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.C3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.C4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.C3.ordinal()), _path.GetVertex(F2SubCenter.Q3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.C3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.Q3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.C4.ordinal()), _path.GetVertex(F2SubCenter.C5.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.C4.ordinal()).GetX()-_path.GetVertex(F2SubCenter.C5.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.C4.ordinal()), _path.GetVertex(F2SubCenter.O3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.C4.ordinal()).GetY()-_path.GetVertex(F2SubCenter.O3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.C5.ordinal()), _path.GetVertex(F2SubCenter.C6.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.C5.ordinal()).GetX()-_path.GetVertex(F2SubCenter.C6.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.C5.ordinal()), _path.GetVertex(F2SubCenter.N3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.C5.ordinal()).GetY()-_path.GetVertex(F2SubCenter.N3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.C6.ordinal()), _path.GetVertex(F2SubCenter.L3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.C6.ordinal()).GetY()-_path.GetVertex(F2SubCenter.L3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EL5.ordinal()), _path.GetVertex(F2SubCenter.U3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EL5.ordinal()).GetY()-_path.GetVertex(F2SubCenter.U3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EL6.ordinal()), _path.GetVertex(F2SubCenter.A4.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EL6.ordinal()).GetY()-_path.GetVertex(F2SubCenter.A4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.ES5.ordinal()), _path.GetVertex(F2SubCenter.ES6.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.ES5.ordinal()).GetX()-_path.GetVertex(F2SubCenter.ES6.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.ES5.ordinal()), _path.GetVertex(F2SubCenter.V3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.ES5.ordinal()).GetY()-_path.GetVertex(F2SubCenter.V3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.ES6.ordinal()), _path.GetVertex(F2SubCenter.Z3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.ES6.ordinal()).GetY()-_path.GetVertex(F2SubCenter.Z3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.I3.ordinal()), _path.GetVertex(F2SubCenter.J3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.I3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.J3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.I3.ordinal()), _path.GetVertex(F2SubCenter.s3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.I3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.s3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.J3.ordinal()), _path.GetVertex(F2SubCenter.K3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.J3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.K3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.J3.ordinal()), _path.GetVertex(F2SubCenter.P3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.J3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.P3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.K3.ordinal()), _path.GetVertex(F2SubCenter.M3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.K3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.M3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.L3.ordinal()), _path.GetVertex(F2SubCenter.C6.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.L3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.C6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.M3.ordinal()), _path.GetVertex(F2SubCenter.K3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.M3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.K3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.M3.ordinal()), _path.GetVertex(F2SubCenter.L3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.M3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.L3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.M3.ordinal()), _path.GetVertex(F2SubCenter.Y3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.M3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.Y3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.N3.ordinal()), _path.GetVertex(F2SubCenter.C5.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.N3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.C5.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.N3.ordinal()), _path.GetVertex(F2SubCenter.M3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.N3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.M3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.O3.ordinal()), _path.GetVertex(F2SubCenter.C4.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.O3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.C4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.O3.ordinal()), _path.GetVertex(F2SubCenter.N3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.O3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.N3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.P3.ordinal()), _path.GetVertex(F2SubCenter.J3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.P3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.J3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.P3.ordinal()), _path.GetVertex(F2SubCenter.O3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.P3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.O3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.P3.ordinal()), _path.GetVertex(F2SubCenter.X3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.P3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.X3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.Q3.ordinal()), _path.GetVertex(F2SubCenter.C3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.Q3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.C3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.Q3.ordinal()), _path.GetVertex(F2SubCenter.P3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.Q3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.P3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.R3.ordinal()), _path.GetVertex(F2SubCenter.C2.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.R3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.C2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.R3.ordinal()), _path.GetVertex(F2SubCenter.Q3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.R3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.Q3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.SC2.ordinal()), _path.GetVertex(F2SubCenter.X3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.SC2.ordinal()).GetY()-_path.GetVertex(F2SubCenter.X3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.T3.ordinal()), _path.GetVertex(F2SubCenter.C1.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.T3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.C1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.T3.ordinal()), _path.GetVertex(F2SubCenter.s3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.T3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.s3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.U3.ordinal()), _path.GetVertex(F2SubCenter.EL5.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.U3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.EL5.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.U3.ordinal()), _path.GetVertex(F2SubCenter.V3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.U3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.V3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.V3.ordinal()), _path.GetVertex(F2SubCenter.ES5.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.V3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.ES5.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.V3.ordinal()), _path.GetVertex(F2SubCenter.w3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.V3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.w3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.X3.ordinal()), _path.GetVertex(F2SubCenter.P3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.X3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.P3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.X3.ordinal()), _path.GetVertex(F2SubCenter.SC2.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.X3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.SC2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.X3.ordinal()), _path.GetVertex(F2SubCenter.Y3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.X3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.Y3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.Y3.ordinal()), _path.GetVertex(F2SubCenter.M3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.Y3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.M3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.Y3.ordinal()), _path.GetVertex(F2SubCenter.Z3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.Y3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.Z3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.Z3.ordinal()), _path.GetVertex(F2SubCenter.A4.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.Z3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.A4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.Z3.ordinal()), _path.GetVertex(F2SubCenter.ES6.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.Z3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.ES6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.s3.ordinal()), _path.GetVertex(F2SubCenter.I3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.s3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.I3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.s3.ordinal()), _path.GetVertex(F2SubCenter.R3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.s3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.R3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.s3.ordinal()), _path.GetVertex(F2SubCenter.w3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.s3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.w3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.w3.ordinal()), _path.GetVertex(F2SubCenter.X3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.w3.ordinal()).GetX()-_path.GetVertex(F2SubCenter.X3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.w3.ordinal()), _path.GetVertex(F2SubCenter.s3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.w3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.s3.ordinal()).GetY()));


        //extends edges added

        _path.AddRoute(_path.GetVertex(F2SubCenter.U3.ordinal()), _path.GetVertex(F2SubCenter.EM1.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.U3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.EM1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM1.ordinal()), _path.GetVertex(F2SubCenter.EM2.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM1.ordinal()).GetY() - _path.GetVertex(F2SubCenter.EM2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM2.ordinal()), _path.GetVertex(F2SubCenter.T3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM2.ordinal()).GetY()-_path.GetVertex(F2SubCenter.T3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM2.ordinal()), _path.GetVertex(F2SubCenter.EM3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM2.ordinal()).GetY()-_path.GetVertex(F2SubCenter.EM3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM3.ordinal()), _path.GetVertex(F2SubCenter.EM4.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.EM4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM3.ordinal()), _path.GetVertex(F2SubCenter.C1.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.C1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM3.ordinal()), _path.GetVertex(F2SubCenter.EM4.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.EM4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM4.ordinal()), _path.GetVertex(F2SubCenter.SC1.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM4.ordinal()).GetY()-_path.GetVertex(F2SubCenter.SC1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM4.ordinal()), _path.GetVertex(F2SubCenter.EM5.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM4.ordinal()).GetY()-_path.GetVertex(F2SubCenter.EM5.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM5.ordinal()), _path.GetVertex(F2SubCenter.EM6.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM5.ordinal()).GetY() - _path.GetVertex(F2SubCenter.EM6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM6.ordinal()), _path.GetVertex(F2SubCenter.s3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM6.ordinal()).GetY()-_path.GetVertex(F2SubCenter.s3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM6.ordinal()), _path.GetVertex(F2SubCenter.I3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM6.ordinal()).GetY()-_path.GetVertex(F2SubCenter.I3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM7.ordinal()), _path.GetVertex(F2SubCenter.P3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.P3.ordinal()).GetY()-_path.GetVertex(F2SubCenter.EM7.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM7.ordinal()), _path.GetVertex(F2SubCenter.EM6.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM7.ordinal()).GetY()-_path.GetVertex(F2SubCenter.EM6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM7.ordinal()), _path.GetVertex(F2SubCenter.J3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM7.ordinal()).GetY() - _path.GetVertex(F2SubCenter.J3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM7.ordinal()), _path.GetVertex(F2SubCenter.EM8.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM7.ordinal()).GetY() - _path.GetVertex(F2SubCenter.EM8.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM8.ordinal()), _path.GetVertex(F2SubCenter.M3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM8.ordinal()).GetY()-_path.GetVertex(F2SubCenter.M3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM8.ordinal()), _path.GetVertex(F2SubCenter.EM9.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM8.ordinal()).GetY() - _path.GetVertex(F2SubCenter.EM9.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM8.ordinal()), _path.GetVertex(F2SubCenter.K3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM8.ordinal()).GetY()-_path.GetVertex(F2SubCenter.K3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM9.ordinal()), _path.GetVertex(F2SubCenter.EM10.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM9.ordinal()).GetY()-_path.GetVertex(F2SubCenter.EM10.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM10.ordinal()), _path.GetVertex(F2SubCenter.SC3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM9.ordinal()).GetY()-_path.GetVertex(F2SubCenter.SC3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM10.ordinal()), _path.GetVertex(F2SubCenter.EM11.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM10.ordinal()).GetY()-_path.GetVertex(F2SubCenter.EM11.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM11.ordinal()), _path.GetVertex(F2SubCenter.C6.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM11.ordinal()).GetY() - _path.GetVertex(F2SubCenter.C6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM11.ordinal()), _path.GetVertex(F2SubCenter.EM12.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM11.ordinal()).GetY()-_path.GetVertex(F2SubCenter.EM12.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM12.ordinal()), _path.GetVertex(F2SubCenter.L3.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM12.ordinal()).GetY()-_path.GetVertex(F2SubCenter.L3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM12.ordinal()), _path.GetVertex(F2SubCenter.EM13.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM12.ordinal()).GetY()-_path.GetVertex(F2SubCenter.EM13.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubCenter.EM13.ordinal()), _path.GetVertex(F2SubCenter.A4.ordinal()), Math.abs(_path.GetVertex(F2SubCenter.EM13.ordinal()).GetY()-_path.GetVertex(F2SubCenter.A4.ordinal()).GetY()));




    }
    public int GetStartOrder(){

        return F2SubCenter.start_position.ordinal();
    }
    public int GetEndOrder(){

        return F2SubCenter.end_position.ordinal();
}

    public int GetStartAux1Order(){
        return F2SubCenter.start_auxiliary_pos.ordinal();
    }
    public int GetStartAux2Order(){
        return F2SubCenter.start_auxiliary_pos2.ordinal();
    }
    public int GetStartAux3Order(){
        return F2SubCenter.start_auxiliary_pos3.ordinal();
    }
    public int GetStartAux4Order(){
        return F2SubCenter.start_auxiliary_pos4.ordinal();
    }
    public int GetEndAux1Order(){
        return F2SubCenter.end_auxiliary_pos.ordinal();
    }
    public int GetEndAux2Order(){
        return F2SubCenter.end_auxiliary_pos2.ordinal();
    }
    public int GetEndAux3Order(){
        return F2SubCenter.end_auxiliary_pos3.ordinal();
    }
    public int GetEndAux4Order(){
        return F2SubCenter.end_auxiliary_pos4.ordinal();
    }
}