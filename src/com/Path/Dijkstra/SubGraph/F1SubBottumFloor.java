package com.Path.Dijkstra.SubGraph;
import com.Path.DefinedVertex.F1SubBottom;
import com.Path.DefinedVertex.F1SubBottom;
import com.Path.DefinedVertex.SubNumber;

/**
 * Created by toy on 4/11/15.
 */


public class F1SubBottumFloor extends Floor{
    //ArrayList<Vertex> B1_vertex= new ArrayList();
    public F1SubBottumFloor(int stair) {
        super(stair);
        _sub_no = SubNumber.F1SubBottom;
    }

    public void InitializeVertex() {
        _path.AddVertex(F1SubBottom.WT5.ordinal(), new Vertex("WT5" , 0.2702, 0.3498, _stair));
        _path.AddVertex(F1SubBottom.W5.ordinal(), new Vertex("W5" , 0.2490, 0.3344, _stair));
        _path.AddVertex(F1SubBottom.EL3.ordinal(), new Vertex("EL3" , 0.3087, 0.3344, _stair));
        _path.AddVertex(F1SubBottom.ES3.ordinal(), new Vertex("ES3" , 0.3298, 0.3094, _stair));
        _path.AddVertex(F1SubBottom.S9.ordinal(), new Vertex("S9" , 0.2490, 0.2593, _stair));
        _path.AddVertex(F1SubBottom.S10.ordinal(), new Vertex("S10" , 0.2490, 0.2247, _stair));
        _path.AddVertex(F1SubBottom.S11.ordinal(), new Vertex("S11" , 0.2490, 0.1843, _stair));
        _path.AddVertex(F1SubBottom.S12.ordinal(), new Vertex("S12" , 0.1836, 0.1535, _stair));
        _path.AddVertex(F1SubBottom.S5.ordinal(), new Vertex("S5" , 0.3587, 0.2574, _stair));
        _path.AddVertex(F1SubBottom.S6.ordinal(), new Vertex("S6" , 0.3953, 0.2574, _stair));
        _path.AddVertex(F1SubBottom.Q1.ordinal(), new Vertex("Q1" , 0.3722, 0.1746, _stair));
        _path.AddVertex(F1SubBottom.S7.ordinal(), new Vertex("S7" , 0.5973, 0.2574, _stair));
        _path.AddVertex(F1SubBottom.S8.ordinal(), new Vertex("S8" , 0.6358, 0.2574, _stair));
        _path.AddVertex(F1SubBottom.Q2.ordinal(), new Vertex("Q2" , 0.6223, 0.1746, _stair));
        _path.AddVertex(F1SubBottom.W6.ordinal(), new Vertex("W6" , 0.7493, 0.3324, _stair));
        _path.AddVertex(F1SubBottom.WT6.ordinal(), new Vertex("WT6" , 0.7423, 0.3498, _stair));
        _path.AddVertex(F1SubBottom.EL4.ordinal(), new Vertex("EL4" , 0.6916, 0.3344, _stair));
        _path.AddVertex(F1SubBottom.ES4.ordinal(), new Vertex("ES4" , 0.6666, 0.3094, _stair));
        _path.AddVertex(F1SubBottom.S13.ordinal(), new Vertex("S13" , 0.7493, 0.2593, _stair));
        _path.AddVertex(F1SubBottom.S14.ordinal(), new Vertex("S14" , 0.7493, 0.2247, _stair));
        _path.AddVertex(F1SubBottom.S15.ordinal(), new Vertex("S15" , 0.7493, 0.1843, _stair));
        _path.AddVertex(F1SubBottom.S16.ordinal(), new Vertex("S16" , 0.8167, 0.1535, _stair));
        _path.AddVertex(F1SubBottom.WT1.ordinal(), new Vertex("WT1" , 0.0489, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.W1.ordinal(), new Vertex("W1" , 0.0681, 0.0707, _stair));
        _path.AddVertex(F1SubBottom.ES1.ordinal(), new Vertex("ES1" , 0.1220, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.EL1.ordinal(), new Vertex("EL1" , 0.1393, 0.0553, _stair));
        _path.AddVertex(F1SubBottom.D1.ordinal(), new Vertex("D1" , 0.2606, 0.0419, _stair));
        _path.AddVertex(F1SubBottom.S1.ordinal(), new Vertex("S1" , 0.3606, 0.0746, _stair));
        _path.AddVertex(F1SubBottom.S2.ordinal(), new Vertex("S2" , 0.4010, 0.0746, _stair));
        _path.AddVertex(F1SubBottom.D2.ordinal(), new Vertex("D2" , 0.4992, 0.0419, _stair));
        _path.AddVertex(F1SubBottom.S3.ordinal(), new Vertex("S3" , 0.5993, 0.0746, _stair));
        _path.AddVertex(F1SubBottom.S4.ordinal(), new Vertex("S4" , 0.6339, 0.0746, _stair));
        _path.AddVertex(F1SubBottom.D3.ordinal(), new Vertex("D3" , 0.7378, 0.0361, _stair));
        _path.AddVertex(F1SubBottom.EL2.ordinal(), new Vertex("EL2" , 0.8552, 0.0553, _stair));
        _path.AddVertex(F1SubBottom.ES2.ordinal(), new Vertex("ES2" , 0.8764, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.W2.ordinal(), new Vertex("W2" , 0.9302, 0.0707, _stair));
        _path.AddVertex(F1SubBottom.WT2.ordinal(), new Vertex("WT2" , 0.9456, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.Z3.ordinal(), new Vertex("Z3" , 0.4992, 0.3806, _stair));
        _path.AddVertex(F1SubBottom.Y3.ordinal(), new Vertex("Y3" , 0.4992, 0.3594, _stair));
        _path.AddVertex(F1SubBottom.U3.ordinal(), new Vertex("U3" , 0.4086, 0.3594, _stair));
        _path.AddVertex(F1SubBottom.X3.ordinal(), new Vertex("X3" , 0.5973, 0.3594, _stair));
        _path.AddVertex(F1SubBottom.P3.ordinal(), new Vertex("P3" , 0.2490, 0.2882, _stair));
        _path.AddVertex(F1SubBottom.Q3.ordinal(), new Vertex("Q3" , 0.2702, 0.2882, _stair));
        _path.AddVertex(F1SubBottom.R3.ordinal(), new Vertex("R3" , 0.3087, 0.2882, _stair));
        _path.AddVertex(F1SubBottom.s3.ordinal(), new Vertex("s3" , 0.3298, 0.2882, _stair));
        _path.AddVertex(F1SubBottom.T3.ordinal(), new Vertex("T3" , 0.4086, 0.2882, _stair));
        _path.AddVertex(F1SubBottom.V3.ordinal(), new Vertex("V3" , 0.4992, 0.2882, _stair));
        _path.AddVertex(F1SubBottom.w3.ordinal(), new Vertex("w3" , 0.5973, 0.2882, _stair));
        _path.AddVertex(F1SubBottom.A4.ordinal(), new Vertex("A4" , 0.6666, 0.2882, _stair));
        _path.AddVertex(F1SubBottom.b4.ordinal(), new Vertex("b4" , 0.6916, 0.2882, _stair));
        _path.AddVertex(F1SubBottom.C4.ordinal(), new Vertex("C4" , 0.7423, 0.2882, _stair));
        _path.AddVertex(F1SubBottom.D4.ordinal(), new Vertex("D4" , 0.7493, 0.2882, _stair));
        _path.AddVertex(F1SubBottom.O3.ordinal(), new Vertex("O3" , 0.2490, 0.1535, _stair));
        _path.AddVertex(F1SubBottom.N3.ordinal(), new Vertex("N3" , 0.2490, 0.1535, _stair));
        _path.AddVertex(F1SubBottom.e4.ordinal(), new Vertex("e4" , 0.4992, 0.1535, _stair));
        _path.AddVertex(F1SubBottom.M3.ordinal(), new Vertex("M3" , 0.6223, 0.1535, _stair));
        _path.AddVertex(F1SubBottom.L3.ordinal(), new Vertex("L3" , 0.7493, 0.1535, _stair));
        _path.AddVertex(F1SubBottom.V2.ordinal(), new Vertex("V2" , 0.0681, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.w2.ordinal(), new Vertex("w2" , 0.1393, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.X2.ordinal(), new Vertex("X2" , 0.2490, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.Y2.ordinal(), new Vertex("Y2" , 0.2606, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.Z2.ordinal(), new Vertex("Z2" , 0.3606, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.A3.ordinal(), new Vertex("A3" , 0.2490, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.b3.ordinal(), new Vertex("b3" , 0.4010, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.C3.ordinal(), new Vertex("C3" , 0.4992, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.d3.ordinal(), new Vertex("d3" , 0.5993, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.e3.ordinal(), new Vertex("e3" , 0.6223, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.F3.ordinal(), new Vertex("F3" , 0.6339, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.G3.ordinal(), new Vertex("G3" , 0.7378, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.H3.ordinal(), new Vertex("H3" , 0.7493, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.I3.ordinal(), new Vertex("I3" , 0.8167, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.J3.ordinal(), new Vertex("J3" , 0.8552, 0.0900, _stair));
        _path.AddVertex(F1SubBottom.K3.ordinal(), new Vertex("K3" , 0.9302, 0.0900, _stair));


        _path.AddVertex(F1SubBottom.start_position.ordinal(), new Vertex("Start", 0, 0, _stair));
        _path.AddVertex(F1SubBottom.end_position.ordinal(), new Vertex("End", 0, 0, _stair));
        _path.AddVertex(F1SubBottom.start_auxiliary_pos.ordinal(), new Vertex("Start_aux", 0, 0, _stair));
        _path.AddVertex(F1SubBottom.end_auxiliary_pos.ordinal(), new Vertex("End_aux", 0, 0, _stair));
        _path.AddVertex(F1SubBottom.start_auxiliary_pos2.ordinal(), new Vertex("Start_aux2", 0, 0, _stair));
        _path.AddVertex(F1SubBottom.end_auxiliary_pos2.ordinal(), new Vertex("End_aux2", 0, 0, _stair));
        _path.AddVertex(F1SubBottom.start_auxiliary_pos3.ordinal(), new Vertex("Start_aux3", 0, 0, _stair));
        _path.AddVertex(F1SubBottom.end_auxiliary_pos3.ordinal(), new Vertex("End_aux3", 0, 0, _stair));
        _path.AddVertex(F1SubBottom.start_auxiliary_pos4.ordinal(), new Vertex("Start_aux4", 0, 0, _stair));
        _path.AddVertex(F1SubBottom.end_auxiliary_pos4.ordinal(), new Vertex("End_aux4", 0, 0, _stair));
    }

    public void InitializeEdge() {

        _path.AddRoute(_path.GetVertex(F1SubBottom.S9.ordinal()), _path.GetVertex(F1SubBottom.P3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S9.ordinal()).GetY()-_path.GetVertex(F1SubBottom.P3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S10.ordinal()), _path.GetVertex(F1SubBottom.S9.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S10.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S9.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S11.ordinal()), _path.GetVertex(F1SubBottom.S10.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S11.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S10.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S7.ordinal()), _path.GetVertex(F1SubBottom.w3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S7.ordinal()).GetY()-_path.GetVertex(F1SubBottom.w3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S13.ordinal()), _path.GetVertex(F1SubBottom.D4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S13.ordinal()).GetY()-_path.GetVertex(F1SubBottom.D4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S14.ordinal()), _path.GetVertex(F1SubBottom.S13.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S14.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S13.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S15.ordinal()), _path.GetVertex(F1SubBottom.S14.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S15.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S14.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.W1.ordinal()), _path.GetVertex(F1SubBottom.V2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.W1.ordinal()).GetY()-_path.GetVertex(F1SubBottom.V2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.EL1.ordinal()), _path.GetVertex(F1SubBottom.w2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.EL1.ordinal()).GetY()-_path.GetVertex(F1SubBottom.w2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.D1.ordinal()), _path.GetVertex(F1SubBottom.Y2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.D1.ordinal()).GetY()-_path.GetVertex(F1SubBottom.Y2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S1.ordinal()), _path.GetVertex(F1SubBottom.Z2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S1.ordinal()).GetY()-_path.GetVertex(F1SubBottom.Z2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S2.ordinal()), _path.GetVertex(F1SubBottom.b3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S2.ordinal()).GetY()-_path.GetVertex(F1SubBottom.b3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.D2.ordinal()), _path.GetVertex(F1SubBottom.C3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.D2.ordinal()).GetY()-_path.GetVertex(F1SubBottom.C3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S3.ordinal()), _path.GetVertex(F1SubBottom.d3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.d3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S4.ordinal()), _path.GetVertex(F1SubBottom.F3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S4.ordinal()).GetY()-_path.GetVertex(F1SubBottom.F3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.D3.ordinal()), _path.GetVertex(F1SubBottom.G3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.D3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.G3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.EL2.ordinal()), _path.GetVertex(F1SubBottom.J3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.EL2.ordinal()).GetY()-_path.GetVertex(F1SubBottom.J3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.W2.ordinal()), _path.GetVertex(F1SubBottom.K3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.W2.ordinal()).GetY()-_path.GetVertex(F1SubBottom.K3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Y3.ordinal()), _path.GetVertex(F1SubBottom.Z3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Y3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.Z3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.P3.ordinal()), _path.GetVertex(F1SubBottom.W5.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.P3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.W5.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Q3.ordinal()), _path.GetVertex(F1SubBottom.WT5.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Q3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.WT5.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.R3.ordinal()), _path.GetVertex(F1SubBottom.EL3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.R3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.EL3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.s3.ordinal()), _path.GetVertex(F1SubBottom.ES3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.s3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.ES3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.T3.ordinal()), _path.GetVertex(F1SubBottom.U3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.T3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.U3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.w3.ordinal()), _path.GetVertex(F1SubBottom.X3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.w3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.X3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.A4.ordinal()), _path.GetVertex(F1SubBottom.ES4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.A4.ordinal()).GetY()-_path.GetVertex(F1SubBottom.ES4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.b4.ordinal()), _path.GetVertex(F1SubBottom.EL4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.b4.ordinal()).GetY()-_path.GetVertex(F1SubBottom.EL4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.C4.ordinal()), _path.GetVertex(F1SubBottom.WT6.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.C4.ordinal()).GetY()-_path.GetVertex(F1SubBottom.WT6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.D4.ordinal()), _path.GetVertex(F1SubBottom.W6.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.D4.ordinal()).GetY()-_path.GetVertex(F1SubBottom.W6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.O3.ordinal()), _path.GetVertex(F1SubBottom.S11.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.O3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S11.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.N3.ordinal()), _path.GetVertex(F1SubBottom.S11.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.N3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S11.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.e4.ordinal()), _path.GetVertex(F1SubBottom.V3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.e4.ordinal()).GetY()-_path.GetVertex(F1SubBottom.V3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.M3.ordinal()), _path.GetVertex(F1SubBottom.Q2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.M3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.Q2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.L3.ordinal()), _path.GetVertex(F1SubBottom.S15.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.L3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S15.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.X2.ordinal()), _path.GetVertex(F1SubBottom.O3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.X2.ordinal()).GetY()-_path.GetVertex(F1SubBottom.O3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.C3.ordinal()), _path.GetVertex(F1SubBottom.e4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.C3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.e4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.e3.ordinal()), _path.GetVertex(F1SubBottom.M3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.e3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.M3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.H3.ordinal()), _path.GetVertex(F1SubBottom.L3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.H3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.L3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.I3.ordinal()), _path.GetVertex(F1SubBottom.S16.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.I3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S16.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.WT5.ordinal()), _path.GetVertex(F1SubBottom.Q3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.WT5.ordinal()).GetY()-_path.GetVertex(F1SubBottom.Q3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.W5.ordinal()), _path.GetVertex(F1SubBottom.P3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.W5.ordinal()).GetY()-_path.GetVertex(F1SubBottom.P3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.EL3.ordinal()), _path.GetVertex(F1SubBottom.R3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.EL3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.R3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.ES3.ordinal()), _path.GetVertex(F1SubBottom.s3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.ES3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.s3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S9.ordinal()), _path.GetVertex(F1SubBottom.S10.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S9.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S10.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S10.ordinal()), _path.GetVertex(F1SubBottom.S11.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S10.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S11.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S11.ordinal()), _path.GetVertex(F1SubBottom.O3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S11.ordinal()).GetY()-_path.GetVertex(F1SubBottom.O3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Q2.ordinal()), _path.GetVertex(F1SubBottom.M3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Q2.ordinal()).GetY()-_path.GetVertex(F1SubBottom.M3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.W6.ordinal()), _path.GetVertex(F1SubBottom.D4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.W6.ordinal()).GetY()-_path.GetVertex(F1SubBottom.D4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.WT6.ordinal()), _path.GetVertex(F1SubBottom.C4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.WT6.ordinal()).GetY()-_path.GetVertex(F1SubBottom.C4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.EL4.ordinal()), _path.GetVertex(F1SubBottom.b4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.EL4.ordinal()).GetY()-_path.GetVertex(F1SubBottom.b4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.ES4.ordinal()), _path.GetVertex(F1SubBottom.A4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.ES4.ordinal()).GetY()-_path.GetVertex(F1SubBottom.A4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S13.ordinal()), _path.GetVertex(F1SubBottom.S14.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S13.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S14.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S14.ordinal()), _path.GetVertex(F1SubBottom.S15.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S14.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S15.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S15.ordinal()), _path.GetVertex(F1SubBottom.L3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S15.ordinal()).GetY()-_path.GetVertex(F1SubBottom.L3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S16.ordinal()), _path.GetVertex(F1SubBottom.I3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S16.ordinal()).GetY()-_path.GetVertex(F1SubBottom.I3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Z3.ordinal()), _path.GetVertex(F1SubBottom.Y3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Z3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.Y3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.U3.ordinal()), _path.GetVertex(F1SubBottom.T3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.U3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.T3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.X3.ordinal()), _path.GetVertex(F1SubBottom.w3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.X3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.w3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.P3.ordinal()), _path.GetVertex(F1SubBottom.S9.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.P3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S9.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.V3.ordinal()), _path.GetVertex(F1SubBottom.e4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.V3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.e4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.w3.ordinal()), _path.GetVertex(F1SubBottom.S7.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.w3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S7.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.D4.ordinal()), _path.GetVertex(F1SubBottom.S13.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.D4.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S13.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.O3.ordinal()), _path.GetVertex(F1SubBottom.X2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.O3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.X2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.N3.ordinal()), _path.GetVertex(F1SubBottom.X2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.N3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.X2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.e4.ordinal()), _path.GetVertex(F1SubBottom.C3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.e4.ordinal()).GetY()-_path.GetVertex(F1SubBottom.C3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.M3.ordinal()), _path.GetVertex(F1SubBottom.e3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.M3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.e3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.L3.ordinal()), _path.GetVertex(F1SubBottom.H3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.L3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.H3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.V2.ordinal()), _path.GetVertex(F1SubBottom.W1.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.V2.ordinal()).GetY()-_path.GetVertex(F1SubBottom.W1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.w2.ordinal()), _path.GetVertex(F1SubBottom.EL1.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.w2.ordinal()).GetY()-_path.GetVertex(F1SubBottom.EL1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Y2.ordinal()), _path.GetVertex(F1SubBottom.D1.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Y2.ordinal()).GetY()-_path.GetVertex(F1SubBottom.D1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Z2.ordinal()), _path.GetVertex(F1SubBottom.S1.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Z2.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.b3.ordinal()), _path.GetVertex(F1SubBottom.S2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.b3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.C3.ordinal()), _path.GetVertex(F1SubBottom.D2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.C3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.D2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.d3.ordinal()), _path.GetVertex(F1SubBottom.S3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.d3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.F3.ordinal()), _path.GetVertex(F1SubBottom.S4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.F3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.S4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.G3.ordinal()), _path.GetVertex(F1SubBottom.D3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.G3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.D3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.J3.ordinal()), _path.GetVertex(F1SubBottom.EL2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.J3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.EL2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.K3.ordinal()), _path.GetVertex(F1SubBottom.W2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.K3.ordinal()).GetY()-_path.GetVertex(F1SubBottom.W2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.W5.ordinal()), _path.GetVertex(F1SubBottom.EL3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.W5.ordinal()).GetX()-_path.GetVertex(F1SubBottom.EL3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.ES3.ordinal()), _path.GetVertex(F1SubBottom.ES4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.ES3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.ES4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S9.ordinal()), _path.GetVertex(F1SubBottom.S13.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S9.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S13.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S12.ordinal()), _path.GetVertex(F1SubBottom.O3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S12.ordinal()).GetX()-_path.GetVertex(F1SubBottom.O3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S5.ordinal()), _path.GetVertex(F1SubBottom.S6.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S5.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S6.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S6.ordinal()), _path.GetVertex(F1SubBottom.S7.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S6.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S7.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Q1.ordinal()), _path.GetVertex(F1SubBottom.Q2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Q1.ordinal()).GetX()-_path.GetVertex(F1SubBottom.Q2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S7.ordinal()), _path.GetVertex(F1SubBottom.S8.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S7.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S8.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.WT1.ordinal()), _path.GetVertex(F1SubBottom.V2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.WT1.ordinal()).GetX()-_path.GetVertex(F1SubBottom.V2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.ES1.ordinal()), _path.GetVertex(F1SubBottom.w2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.ES1.ordinal()).GetX()-_path.GetVertex(F1SubBottom.w2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S1.ordinal()), _path.GetVertex(F1SubBottom.S2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S1.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S2.ordinal()), _path.GetVertex(F1SubBottom.S3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S2.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S3.ordinal()), _path.GetVertex(F1SubBottom.S4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.ES2.ordinal()), _path.GetVertex(F1SubBottom.K3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.ES2.ordinal()).GetX()-_path.GetVertex(F1SubBottom.K3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Y3.ordinal()), _path.GetVertex(F1SubBottom.X3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Y3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.X3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.U3.ordinal()), _path.GetVertex(F1SubBottom.Y3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.U3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.Y3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.P3.ordinal()), _path.GetVertex(F1SubBottom.Q3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.P3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.Q3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Q3.ordinal()), _path.GetVertex(F1SubBottom.R3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Q3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.R3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.R3.ordinal()), _path.GetVertex(F1SubBottom.s3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.R3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.s3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.s3.ordinal()), _path.GetVertex(F1SubBottom.T3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.s3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.T3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.T3.ordinal()), _path.GetVertex(F1SubBottom.V3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.T3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.V3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.V3.ordinal()), _path.GetVertex(F1SubBottom.w3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.V3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.w3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.w3.ordinal()), _path.GetVertex(F1SubBottom.A4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.w3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.A4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.A4.ordinal()), _path.GetVertex(F1SubBottom.b4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.A4.ordinal()).GetX()-_path.GetVertex(F1SubBottom.b4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.b4.ordinal()), _path.GetVertex(F1SubBottom.C4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.b4.ordinal()).GetX()-_path.GetVertex(F1SubBottom.C4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.C4.ordinal()), _path.GetVertex(F1SubBottom.D4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.C4.ordinal()).GetX()-_path.GetVertex(F1SubBottom.D4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.O3.ordinal()), _path.GetVertex(F1SubBottom.e4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.O3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.e4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.N3.ordinal()), _path.GetVertex(F1SubBottom.e4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.N3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.e4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.e4.ordinal()), _path.GetVertex(F1SubBottom.M3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.e4.ordinal()).GetX()-_path.GetVertex(F1SubBottom.M3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.M3.ordinal()), _path.GetVertex(F1SubBottom.L3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.M3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.L3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.L3.ordinal()), _path.GetVertex(F1SubBottom.S16.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.L3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S16.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.V2.ordinal()), _path.GetVertex(F1SubBottom.ES1.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.V2.ordinal()).GetX()-_path.GetVertex(F1SubBottom.ES1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.w2.ordinal()), _path.GetVertex(F1SubBottom.X2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.w2.ordinal()).GetX()-_path.GetVertex(F1SubBottom.X2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.X2.ordinal()), _path.GetVertex(F1SubBottom.Y2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.X2.ordinal()).GetX()-_path.GetVertex(F1SubBottom.Y2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Y2.ordinal()), _path.GetVertex(F1SubBottom.Z2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Y2.ordinal()).GetX()-_path.GetVertex(F1SubBottom.Z2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Z2.ordinal()), _path.GetVertex(F1SubBottom.b3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Z2.ordinal()).GetX()-_path.GetVertex(F1SubBottom.b3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.A3.ordinal()), _path.GetVertex(F1SubBottom.Y2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.A3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.Y2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.b3.ordinal()), _path.GetVertex(F1SubBottom.C3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.b3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.C3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.C3.ordinal()), _path.GetVertex(F1SubBottom.d3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.C3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.d3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.d3.ordinal()), _path.GetVertex(F1SubBottom.e3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.d3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.e3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.e3.ordinal()), _path.GetVertex(F1SubBottom.F3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.e3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.F3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.F3.ordinal()), _path.GetVertex(F1SubBottom.G3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.F3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.G3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.G3.ordinal()), _path.GetVertex(F1SubBottom.H3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.G3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.H3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.H3.ordinal()), _path.GetVertex(F1SubBottom.I3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.H3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.I3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.I3.ordinal()), _path.GetVertex(F1SubBottom.J3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.I3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.J3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.J3.ordinal()), _path.GetVertex(F1SubBottom.ES2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.J3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.ES2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.K3.ordinal()), _path.GetVertex(F1SubBottom.WT2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.K3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.WT2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.W5.ordinal()), _path.GetVertex(F1SubBottom.EL3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.W5.ordinal()).GetX()-_path.GetVertex(F1SubBottom.EL3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.ES3.ordinal()), _path.GetVertex(F1SubBottom.ES4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.ES3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.ES4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S9.ordinal()), _path.GetVertex(F1SubBottom.S13.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S9.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S13.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S12.ordinal()), _path.GetVertex(F1SubBottom.O3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S12.ordinal()).GetX()-_path.GetVertex(F1SubBottom.O3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S5.ordinal()), _path.GetVertex(F1SubBottom.S6.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S5.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S6.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S6.ordinal()), _path.GetVertex(F1SubBottom.S7.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S6.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S7.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Q1.ordinal()), _path.GetVertex(F1SubBottom.Q2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Q1.ordinal()).GetX()-_path.GetVertex(F1SubBottom.Q2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S7.ordinal()), _path.GetVertex(F1SubBottom.S8.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S7.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S8.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.WT1.ordinal()), _path.GetVertex(F1SubBottom.V2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.WT1.ordinal()).GetX()-_path.GetVertex(F1SubBottom.V2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.ES1.ordinal()), _path.GetVertex(F1SubBottom.w2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.ES1.ordinal()).GetX()-_path.GetVertex(F1SubBottom.w2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.EL1.ordinal()), _path.GetVertex(F1SubBottom.EL2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.EL1.ordinal()).GetX()-_path.GetVertex(F1SubBottom.EL2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S1.ordinal()), _path.GetVertex(F1SubBottom.S2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S1.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S2.ordinal()), _path.GetVertex(F1SubBottom.S3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S2.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.S3.ordinal()), _path.GetVertex(F1SubBottom.S4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.S3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.ES2.ordinal()), _path.GetVertex(F1SubBottom.K3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.ES2.ordinal()).GetX()-_path.GetVertex(F1SubBottom.K3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Y3.ordinal()), _path.GetVertex(F1SubBottom.X3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Y3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.X3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.U3.ordinal()), _path.GetVertex(F1SubBottom.Y3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.U3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.Y3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.P3.ordinal()), _path.GetVertex(F1SubBottom.Q3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.P3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.Q3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Q3.ordinal()), _path.GetVertex(F1SubBottom.R3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Q3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.R3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.R3.ordinal()), _path.GetVertex(F1SubBottom.s3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.R3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.s3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.s3.ordinal()), _path.GetVertex(F1SubBottom.T3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.s3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.T3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.T3.ordinal()), _path.GetVertex(F1SubBottom.V3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.T3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.V3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.V3.ordinal()), _path.GetVertex(F1SubBottom.w3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.V3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.w3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.w3.ordinal()), _path.GetVertex(F1SubBottom.A4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.w3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.A4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.A4.ordinal()), _path.GetVertex(F1SubBottom.b4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.A4.ordinal()).GetX()-_path.GetVertex(F1SubBottom.b4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.b4.ordinal()), _path.GetVertex(F1SubBottom.C4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.b4.ordinal()).GetX()-_path.GetVertex(F1SubBottom.C4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.C4.ordinal()), _path.GetVertex(F1SubBottom.D4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.C4.ordinal()).GetX()-_path.GetVertex(F1SubBottom.D4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.O3.ordinal()), _path.GetVertex(F1SubBottom.e4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.O3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.e4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.N3.ordinal()), _path.GetVertex(F1SubBottom.e4.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.N3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.e4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.e4.ordinal()), _path.GetVertex(F1SubBottom.M3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.e4.ordinal()).GetX()-_path.GetVertex(F1SubBottom.M3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.M3.ordinal()), _path.GetVertex(F1SubBottom.L3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.M3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.L3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.L3.ordinal()), _path.GetVertex(F1SubBottom.S16.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.L3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.S16.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.V2.ordinal()), _path.GetVertex(F1SubBottom.ES1.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.V2.ordinal()).GetX()-_path.GetVertex(F1SubBottom.ES1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.w2.ordinal()), _path.GetVertex(F1SubBottom.X2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.w2.ordinal()).GetX()-_path.GetVertex(F1SubBottom.X2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.X2.ordinal()), _path.GetVertex(F1SubBottom.Y2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.X2.ordinal()).GetX()-_path.GetVertex(F1SubBottom.Y2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Y2.ordinal()), _path.GetVertex(F1SubBottom.Z2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Y2.ordinal()).GetX()-_path.GetVertex(F1SubBottom.Z2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.Z2.ordinal()), _path.GetVertex(F1SubBottom.b3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.Z2.ordinal()).GetX()-_path.GetVertex(F1SubBottom.b3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.A3.ordinal()), _path.GetVertex(F1SubBottom.Y2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.A3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.Y2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.b3.ordinal()), _path.GetVertex(F1SubBottom.C3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.b3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.C3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.C3.ordinal()), _path.GetVertex(F1SubBottom.d3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.C3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.d3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.d3.ordinal()), _path.GetVertex(F1SubBottom.e3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.d3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.e3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.e3.ordinal()), _path.GetVertex(F1SubBottom.F3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.e3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.F3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.F3.ordinal()), _path.GetVertex(F1SubBottom.G3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.F3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.G3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.G3.ordinal()), _path.GetVertex(F1SubBottom.H3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.G3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.H3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.H3.ordinal()), _path.GetVertex(F1SubBottom.I3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.H3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.I3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.I3.ordinal()), _path.GetVertex(F1SubBottom.J3.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.I3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.J3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.J3.ordinal()), _path.GetVertex(F1SubBottom.ES2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.J3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.ES2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubBottom.K3.ordinal()), _path.GetVertex(F1SubBottom.WT2.ordinal()), Math.abs(_path.GetVertex(F1SubBottom.K3.ordinal()).GetX()-_path.GetVertex(F1SubBottom.WT2.ordinal()).GetX()));



    }

    public int GetStartOrder(){

        return F1SubBottom.start_position.ordinal();
    }
    public int GetEndOrder(){

        return F1SubBottom.end_position.ordinal();
    }

    public int GetStartAux1Order(){
        return F1SubBottom.start_auxiliary_pos.ordinal();
    }
    public int GetStartAux2Order(){
        return F1SubBottom.start_auxiliary_pos2.ordinal();
    }
    public int GetStartAux3Order(){
        return F1SubBottom.start_auxiliary_pos3.ordinal();
    }
    public int GetStartAux4Order(){
        return F1SubBottom.start_auxiliary_pos4.ordinal();
    }
    public int GetEndAux1Order(){
        return F1SubBottom.end_auxiliary_pos.ordinal();
    }
    public int GetEndAux2Order(){
        return F1SubBottom.end_auxiliary_pos2.ordinal();
    }
    public int GetEndAux3Order(){
        return F1SubBottom.end_auxiliary_pos3.ordinal();
    }
    public int GetEndAux4Order(){
        return F1SubBottom.end_auxiliary_pos4.ordinal();
    }
}