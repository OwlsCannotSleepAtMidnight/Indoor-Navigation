package com.Path.Dijkstra.SubGraph;
import com.Path.DefinedVertex.F2SubBottom;
import com.Path.DefinedVertex.SubNumber;

/**
 * Created by toy on 4/11/15.
 */


public class F2SubBottomFloor extends Floor{
    //ArrayList<Vertex> B1_vertex= new ArrayList();
    public F2SubBottomFloor(int stair) {
        super(stair);
        _sub_no = SubNumber.F2SubBottom;
    }

    public void InitializeVertex() {

        //basic points added

        _path.AddVertex(F2SubBottom.WT5.ordinal(), new Vertex("WT5" , 0.2702, 0.3498, _stair));
        _path.AddVertex(F2SubBottom.W5.ordinal(), new Vertex("W5" , 0.2490, 0.3344, _stair));
        _path.AddVertex(F2SubBottom.EL3.ordinal(), new Vertex("EL3" , 0.3087, 0.3344, _stair));
        _path.AddVertex(F2SubBottom.ES3.ordinal(), new Vertex("ES3" , 0.3279, 0.3151, _stair));
        _path.AddVertex(F2SubBottom.S9.ordinal(), new Vertex("S9" , 0.2490, 0.2593, _stair));
        _path.AddVertex(F2SubBottom.S10.ordinal(), new Vertex("S10" , 0.2490, 0.2247, _stair));
        _path.AddVertex(F2SubBottom.S11.ordinal(), new Vertex("S11" , 0.2490, 0.1843, _stair));
        _path.AddVertex(F2SubBottom.S12.ordinal(), new Vertex("S12" , 0.1836, 0.1535, _stair));
        _path.AddVertex(F2SubBottom.S5.ordinal(), new Vertex("S5" , 0.3606, 0.2497, _stair));
        _path.AddVertex(F2SubBottom.S6.ordinal(), new Vertex("S6" , 0.3991, 0.2497, _stair));
        _path.AddVertex(F2SubBottom.Q1.ordinal(), new Vertex("Q1" , 0.3799, 0.1746, _stair));
        _path.AddVertex(F2SubBottom.S7.ordinal(), new Vertex("S7" , 0.6012, 0.2497, _stair));
        _path.AddVertex(F2SubBottom.S8.ordinal(), new Vertex("S8" , 0.6358, 0.2497, _stair));
        _path.AddVertex(F2SubBottom.Q2.ordinal(), new Vertex("Q2" , 0.6185, 0.1746, _stair));
        _path.AddVertex(F2SubBottom.W6.ordinal(), new Vertex("W6" , 0.7493, 0.3344, _stair));
        _path.AddVertex(F2SubBottom.WT6.ordinal(), new Vertex("WT6" , 0.7263, 0.3498, _stair));
        _path.AddVertex(F2SubBottom.EL4.ordinal(), new Vertex("EL4" , 0.6916, 0.3344, _stair));
        _path.AddVertex(F2SubBottom.ES4.ordinal(), new Vertex("ES4" , 0.6666, 0.3151, _stair));
        _path.AddVertex(F2SubBottom.S13.ordinal(), new Vertex("S13" , 0.7493, 0.2593, _stair));
        _path.AddVertex(F2SubBottom.S14.ordinal(), new Vertex("S14" , 0.7493, 0.2247, _stair));
        _path.AddVertex(F2SubBottom.S15.ordinal(), new Vertex("S15" , 0.7493, 0.1843, _stair));
        _path.AddVertex(F2SubBottom.S16.ordinal(), new Vertex("S16" , 0.8167, 0.1535, _stair));
        _path.AddVertex(F2SubBottom.WT1.ordinal(), new Vertex("WT1" , 0.0489, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.W1.ordinal(), new Vertex("W1" , 0.0681, 0.0707, _stair));
        _path.AddVertex(F2SubBottom.ES1.ordinal(), new Vertex("ES1" , 0.1220, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.EL1.ordinal(), new Vertex("EL1" , 0.1393, 0.0553, _stair));
        _path.AddVertex(F2SubBottom.D1.ordinal(), new Vertex("D1" , 0.2606, 0.0419, _stair));
        _path.AddVertex(F2SubBottom.S1.ordinal(), new Vertex("S1" , 0.3606, 0.0746, _stair));
        _path.AddVertex(F2SubBottom.S2.ordinal(), new Vertex("S2" , 0.3991, 0.0746, _stair));
        _path.AddVertex(F2SubBottom.D2.ordinal(), new Vertex("D2" , 0.4992, 0.0419, _stair));
        _path.AddVertex(F2SubBottom.S3.ordinal(), new Vertex("S3" , 0.6012, 0.0746, _stair));
        _path.AddVertex(F2SubBottom.S4.ordinal(), new Vertex("S4" , 0.6358, 0.0746, _stair));
        _path.AddVertex(F2SubBottom.D3.ordinal(), new Vertex("D3" , 0.7378, 0.0419, _stair));
        _path.AddVertex(F2SubBottom.EL2.ordinal(), new Vertex("EL2" , 0.8552, 0.0553, _stair));
        _path.AddVertex(F2SubBottom.ES2.ordinal(), new Vertex("ES2" , 0.8764, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.W2.ordinal(), new Vertex("W2" , 0.9302, 0.0707, _stair));
        _path.AddVertex(F2SubBottom.WT2.ordinal(), new Vertex("WT2" , 0.9456, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.A3.ordinal(), new Vertex("A3" , 0.4992, 0.2959, _stair));
        _path.AddVertex(F2SubBottom.H3.ordinal(), new Vertex("H3" , 0.2490, 0.2959, _stair));
        _path.AddVertex(F2SubBottom.G3.ordinal(), new Vertex("G3" , 0.2702, 0.2959, _stair));
        _path.AddVertex(F2SubBottom.F3.ordinal(), new Vertex("F3" , 0.3087, 0.2959, _stair));
        _path.AddVertex(F2SubBottom.e3.ordinal(), new Vertex("e3" , 0.3279, 0.2959, _stair));
        _path.AddVertex(F2SubBottom.d3.ordinal(), new Vertex("d3" , 0.3606, 0.2959, _stair));
        _path.AddVertex(F2SubBottom.c3.ordinal(), new Vertex("c3" , 0.3760, 0.2959, _stair));
        _path.AddVertex(F2SubBottom.B3.ordinal(), new Vertex("B3" , 0.3991, 0.2959, _stair));
        _path.AddVertex(F2SubBottom.Z2.ordinal(), new Vertex("Z2" , 0.6012, 0.2959, _stair));
        _path.AddVertex(F2SubBottom.J3.ordinal(), new Vertex("J3" , 0.4992, 0.3806, _stair));
        _path.AddVertex(F2SubBottom.I3.ordinal(), new Vertex("I3" , 0.3760, 0.3806, _stair));
        _path.AddVertex(F2SubBottom.K3.ordinal(), new Vertex("K3" , 0.6185, 0.3806, _stair));
        _path.AddVertex(F2SubBottom.Y2.ordinal(), new Vertex("Y2" , 0.6185, 0.2959, _stair));
        _path.AddVertex(F2SubBottom.X2.ordinal(), new Vertex("X2" , 0.6358, 0.2959, _stair));
        _path.AddVertex(F2SubBottom.w2.ordinal(), new Vertex("w2" , 0.6666, 0.2959, _stair));
        _path.AddVertex(F2SubBottom.V2.ordinal(), new Vertex("V2" , 0.6916, 0.2959, _stair));
        _path.AddVertex(F2SubBottom.U2.ordinal(), new Vertex("U2" , 0.7263, 0.2959, _stair));
        _path.AddVertex(F2SubBottom.T2.ordinal(), new Vertex("T2" , 0.7493, 0.2959, _stair));
        _path.AddVertex(F2SubBottom.R2.ordinal(), new Vertex("R2" , 0.2490, 0.1535, _stair));
        _path.AddVertex(F2SubBottom.s2.ordinal(), new Vertex("s2" , 0.3799, 0.1535, _stair));
        _path.AddVertex(F2SubBottom.K2.ordinal(), new Vertex("K2" , 0.4992, 0.1535, _stair));
        _path.AddVertex(F2SubBottom.J2.ordinal(), new Vertex("J2" , 0.6185, 0.1535, _stair));
        _path.AddVertex(F2SubBottom.F4.ordinal(), new Vertex("F4" , 0.7493, 0.1535, _stair));
        _path.AddVertex(F2SubBottom.q2.ordinal(), new Vertex("q2" , 0.0681, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.P2.ordinal(), new Vertex("P2" , 0.1393, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.O2.ordinal(), new Vertex("O2" , 0.2490, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.N2.ordinal(), new Vertex("N2" , 0.2606, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.M2.ordinal(), new Vertex("M2" , 0.3606, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.L2.ordinal(), new Vertex("L2" , 0.3991, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.I2.ordinal(), new Vertex("I2" , 0.4992, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.H2.ordinal(), new Vertex("H2" , 0.6012, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.G2.ordinal(), new Vertex("G2" , 0.6358, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.F2.ordinal(), new Vertex("F2" , 0.7378, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.e2.ordinal(), new Vertex("e2" , 0.7493, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.c2.ordinal(), new Vertex("c2" , 0.8552, 0.0900, _stair));
        _path.AddVertex(F2SubBottom.B2.ordinal(), new Vertex("B2" , 0.9302, 0.0900, _stair));



        //necessary points added

        _path.AddVertex(F2SubBottom.start_position.ordinal(), new Vertex("Start", 0, 0, _stair));
        _path.AddVertex(F2SubBottom.end_position.ordinal(), new Vertex("End", 0, 0, _stair));
        _path.AddVertex(F2SubBottom.start_auxiliary_pos.ordinal(), new Vertex("Start_aux", 0, 0, _stair));
        _path.AddVertex(F2SubBottom.end_auxiliary_pos.ordinal(), new Vertex("End_aux", 0, 0, _stair));
        _path.AddVertex(F2SubBottom.start_auxiliary_pos2.ordinal(), new Vertex("Start_aux2", 0, 0, _stair));
        _path.AddVertex(F2SubBottom.end_auxiliary_pos2.ordinal(), new Vertex("End_aux2", 0, 0, _stair));
        _path.AddVertex(F2SubBottom.start_auxiliary_pos3.ordinal(), new Vertex("Start_aux3", 0, 0, _stair));
        _path.AddVertex(F2SubBottom.end_auxiliary_pos3.ordinal(), new Vertex("End_aux3", 0, 0, _stair));
        _path.AddVertex(F2SubBottom.start_auxiliary_pos4.ordinal(), new Vertex("Start_aux4", 0, 0, _stair));
        _path.AddVertex(F2SubBottom.end_auxiliary_pos4.ordinal(), new Vertex("End_aux4", 0, 0, _stair));


        //extend points added

        _path.AddVertex(F2SubBottom.EB1.ordinal(), new Vertex("EB1",0.1863,0.0900, _stair));
        _path.AddVertex(F2SubBottom.EB2.ordinal(), new Vertex("EB2",0.3087,0.0900, _stair));
        _path.AddVertex(F2SubBottom.EB3.ordinal(), new Vertex("EB3",0.4491,0.0900, _stair));
        _path.AddVertex(F2SubBottom.EB4.ordinal(), new Vertex("EB4",0.5473,0.0900, _stair));
        _path.AddVertex(F2SubBottom.EB5.ordinal(), new Vertex("EB5",0.6916,0.0900, _stair));
        _path.AddVertex(F2SubBottom.EB6.ordinal(), new Vertex("EB6",0.8167,0.0900, _stair));
        _path.AddVertex(F2SubBottom.EB7.ordinal(), new Vertex("EB7",0.6916,0.1535, _stair));
        _path.AddVertex(F2SubBottom.EB8.ordinal(), new Vertex("EB7",0.6916,0.1535, _stair));
        _path.AddVertex(F2SubBottom.EB9.ordinal(), new Vertex("EB8",0.5473,0.1535, _stair));
        _path.AddVertex(F2SubBottom.EB10.ordinal(), new Vertex("EB10",0.3087,0.1535, _stair));
        _path.AddVertex(F2SubBottom.EB11.ordinal(), new Vertex("EB11",0.4491,0.2959, _stair));
        _path.AddVertex(F2SubBottom.EB12.ordinal(), new Vertex("EB12",0.5473,0.2959, _stair));



    }

    public void InitializeEdge() {

        //basic edges added

        _path.AddRoute(_path.GetVertex(F2SubBottom.A3.ordinal()), _path.GetVertex(F2SubBottom.J3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.A3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.J3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.A3.ordinal()), _path.GetVertex(F2SubBottom.K2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.A3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.K2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.A3.ordinal()), _path.GetVertex(F2SubBottom.Z2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.A3.ordinal()).GetX()-_path.GetVertex(F2SubBottom.Z2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.B2.ordinal()), _path.GetVertex(F2SubBottom.W2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.B2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.W2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.B2.ordinal()), _path.GetVertex(F2SubBottom.WT2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.B2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.WT2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.B3.ordinal()), _path.GetVertex(F2SubBottom.A3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.B3.ordinal()).GetX()-_path.GetVertex(F2SubBottom.A3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.B3.ordinal()), _path.GetVertex(F2SubBottom.S6.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.B3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.D1.ordinal()), _path.GetVertex(F2SubBottom.N2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.D1.ordinal()).GetY()-_path.GetVertex(F2SubBottom.N2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.D2.ordinal()), _path.GetVertex(F2SubBottom.I2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.D2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.I2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.D3.ordinal()), _path.GetVertex(F2SubBottom.F2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.D3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.F2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EL1.ordinal()), _path.GetVertex(F2SubBottom.P2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EL1.ordinal()).GetY()-_path.GetVertex(F2SubBottom.P2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EL2.ordinal()), _path.GetVertex(F2SubBottom.c2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EL2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.c2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EL3.ordinal()), _path.GetVertex(F2SubBottom.F3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EL3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.F3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EL4.ordinal()), _path.GetVertex(F2SubBottom.V2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EL4.ordinal()).GetY()-_path.GetVertex(F2SubBottom.V2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EL4.ordinal()), _path.GetVertex(F2SubBottom.W6.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EL4.ordinal()).GetX()-_path.GetVertex(F2SubBottom.W6.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.ES1.ordinal()), _path.GetVertex(F2SubBottom.P2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.ES1.ordinal()).GetX()-_path.GetVertex(F2SubBottom.P2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.ES2.ordinal()), _path.GetVertex(F2SubBottom.B2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.ES2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.B2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.ES3.ordinal()), _path.GetVertex(F2SubBottom.ES4.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.ES3.ordinal()).GetX()-_path.GetVertex(F2SubBottom.ES4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.ES3.ordinal()), _path.GetVertex(F2SubBottom.e3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.ES3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.e3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.ES4.ordinal()), _path.GetVertex(F2SubBottom.w2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.ES4.ordinal()).GetY()-_path.GetVertex(F2SubBottom.w2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.F2.ordinal()), _path.GetVertex(F2SubBottom.D3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.F2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.D3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.F2.ordinal()), _path.GetVertex(F2SubBottom.e2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.F2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.e2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.F3.ordinal()), _path.GetVertex(F2SubBottom.EL3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.F3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.EL3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.F3.ordinal()), _path.GetVertex(F2SubBottom.e3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.F3.ordinal()).GetX()-_path.GetVertex(F2SubBottom.e3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.F4.ordinal()), _path.GetVertex(F2SubBottom.S15.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.F4.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S15.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.F4.ordinal()), _path.GetVertex(F2SubBottom.S16.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.F4.ordinal()).GetX()-_path.GetVertex(F2SubBottom.S16.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.F4.ordinal()), _path.GetVertex(F2SubBottom.e2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.F4.ordinal()).GetY()-_path.GetVertex(F2SubBottom.e2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.G2.ordinal()), _path.GetVertex(F2SubBottom.F2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.G2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.F2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.G2.ordinal()), _path.GetVertex(F2SubBottom.S4.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.G2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.G3.ordinal()), _path.GetVertex(F2SubBottom.F3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.G3.ordinal()).GetX()-_path.GetVertex(F2SubBottom.F3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.G3.ordinal()), _path.GetVertex(F2SubBottom.WT5.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.G3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.WT5.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.H2.ordinal()), _path.GetVertex(F2SubBottom.G2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.H2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.G2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.H2.ordinal()), _path.GetVertex(F2SubBottom.S3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.H2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.H3.ordinal()), _path.GetVertex(F2SubBottom.G3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.H3.ordinal()).GetX()-_path.GetVertex(F2SubBottom.G3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.H3.ordinal()), _path.GetVertex(F2SubBottom.S9.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.H3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S9.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.H3.ordinal()), _path.GetVertex(F2SubBottom.W5.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.H3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.W5.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.I2.ordinal()), _path.GetVertex(F2SubBottom.D2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.I2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.D2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.I2.ordinal()), _path.GetVertex(F2SubBottom.H2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.I2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.H2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.I2.ordinal()), _path.GetVertex(F2SubBottom.K2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.I2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.K2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.I3.ordinal()), _path.GetVertex(F2SubBottom.J3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.I3.ordinal()).GetX()-_path.GetVertex(F2SubBottom.J3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.I3.ordinal()), _path.GetVertex(F2SubBottom.c3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.I3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.c3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.J2.ordinal()), _path.GetVertex(F2SubBottom.F4.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.J2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.F4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.J2.ordinal()), _path.GetVertex(F2SubBottom.Q2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.J2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.Q2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.J3.ordinal()), _path.GetVertex(F2SubBottom.A3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.J3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.A3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.J3.ordinal()), _path.GetVertex(F2SubBottom.K3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.J3.ordinal()).GetX()-_path.GetVertex(F2SubBottom.K3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.K2.ordinal()), _path.GetVertex(F2SubBottom.A3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.K2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.A3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.K2.ordinal()), _path.GetVertex(F2SubBottom.I2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.K2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.I2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.K2.ordinal()), _path.GetVertex(F2SubBottom.J2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.K2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.J2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.K3.ordinal()), _path.GetVertex(F2SubBottom.Y2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.K3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.Y2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.L2.ordinal()), _path.GetVertex(F2SubBottom.I2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.L2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.I2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.L2.ordinal()), _path.GetVertex(F2SubBottom.S2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.L2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.M2.ordinal()), _path.GetVertex(F2SubBottom.L2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.M2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.L2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.M2.ordinal()), _path.GetVertex(F2SubBottom.S1.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.M2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.N2.ordinal()), _path.GetVertex(F2SubBottom.D1.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.N2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.D1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.N2.ordinal()), _path.GetVertex(F2SubBottom.M2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.N2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.M2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.O2.ordinal()), _path.GetVertex(F2SubBottom.N2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.O2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.N2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.O2.ordinal()), _path.GetVertex(F2SubBottom.R2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.O2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.R2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.P2.ordinal()), _path.GetVertex(F2SubBottom.EL1.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.P2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.EL1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.P2.ordinal()), _path.GetVertex(F2SubBottom.O2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.P2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.O2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.Q1.ordinal()), _path.GetVertex(F2SubBottom.Q2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.Q1.ordinal()).GetX()-_path.GetVertex(F2SubBottom.Q2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.Q1.ordinal()), _path.GetVertex(F2SubBottom.s2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.Q1.ordinal()).GetY()-_path.GetVertex(F2SubBottom.s2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.Q2.ordinal()), _path.GetVertex(F2SubBottom.J2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.Q2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.J2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.R2.ordinal()), _path.GetVertex(F2SubBottom.O2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.R2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.O2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.R2.ordinal()), _path.GetVertex(F2SubBottom.S11.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.R2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S11.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.R2.ordinal()), _path.GetVertex(F2SubBottom.s2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.R2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.s2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S1.ordinal()), _path.GetVertex(F2SubBottom.M2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S1.ordinal()).GetY()-_path.GetVertex(F2SubBottom.M2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S1.ordinal()), _path.GetVertex(F2SubBottom.S2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S1.ordinal()).GetX()-_path.GetVertex(F2SubBottom.S2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S10.ordinal()), _path.GetVertex(F2SubBottom.S11.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S10.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S11.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S10.ordinal()), _path.GetVertex(F2SubBottom.S9.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S10.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S9.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S11.ordinal()), _path.GetVertex(F2SubBottom.R2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S11.ordinal()).GetY()-_path.GetVertex(F2SubBottom.R2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S11.ordinal()), _path.GetVertex(F2SubBottom.S10.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S11.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S10.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S12.ordinal()), _path.GetVertex(F2SubBottom.R2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S12.ordinal()).GetX()-_path.GetVertex(F2SubBottom.R2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S13.ordinal()), _path.GetVertex(F2SubBottom.S14.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S13.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S14.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S13.ordinal()), _path.GetVertex(F2SubBottom.T2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S13.ordinal()).GetY()-_path.GetVertex(F2SubBottom.T2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S14.ordinal()), _path.GetVertex(F2SubBottom.S13.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S14.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S13.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S14.ordinal()), _path.GetVertex(F2SubBottom.S15.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S14.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S15.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S15.ordinal()), _path.GetVertex(F2SubBottom.F4.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S15.ordinal()).GetY()-_path.GetVertex(F2SubBottom.F4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S15.ordinal()), _path.GetVertex(F2SubBottom.S14.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S15.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S14.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S2.ordinal()), _path.GetVertex(F2SubBottom.L2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.L2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S2.ordinal()), _path.GetVertex(F2SubBottom.S3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.S3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S3.ordinal()), _path.GetVertex(F2SubBottom.H2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.H2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S3.ordinal()), _path.GetVertex(F2SubBottom.S4.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S3.ordinal()).GetX()-_path.GetVertex(F2SubBottom.S4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S4.ordinal()), _path.GetVertex(F2SubBottom.G2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S4.ordinal()).GetY()-_path.GetVertex(F2SubBottom.G2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S5.ordinal()), _path.GetVertex(F2SubBottom.S6.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S5.ordinal()).GetX()-_path.GetVertex(F2SubBottom.S6.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S5.ordinal()), _path.GetVertex(F2SubBottom.d3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S5.ordinal()).GetY()-_path.GetVertex(F2SubBottom.d3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S6.ordinal()), _path.GetVertex(F2SubBottom.B3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S6.ordinal()).GetY()-_path.GetVertex(F2SubBottom.B3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S6.ordinal()), _path.GetVertex(F2SubBottom.S7.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S6.ordinal()).GetX()-_path.GetVertex(F2SubBottom.S7.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S7.ordinal()), _path.GetVertex(F2SubBottom.S8.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S7.ordinal()).GetX()-_path.GetVertex(F2SubBottom.S8.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S7.ordinal()), _path.GetVertex(F2SubBottom.Z2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S7.ordinal()).GetY()-_path.GetVertex(F2SubBottom.Z2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S8.ordinal()), _path.GetVertex(F2SubBottom.X2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S8.ordinal()).GetY()-_path.GetVertex(F2SubBottom.X2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S9.ordinal()), _path.GetVertex(F2SubBottom.H3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S9.ordinal()).GetY()-_path.GetVertex(F2SubBottom.H3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S9.ordinal()), _path.GetVertex(F2SubBottom.S10.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S9.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S10.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.S9.ordinal()), _path.GetVertex(F2SubBottom.S13.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.S9.ordinal()).GetX()-_path.GetVertex(F2SubBottom.S13.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.T2.ordinal()), _path.GetVertex(F2SubBottom.S13.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.T2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S13.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.T2.ordinal()), _path.GetVertex(F2SubBottom.W6.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.T2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.W6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.U2.ordinal()), _path.GetVertex(F2SubBottom.T2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.U2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.T2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.U2.ordinal()), _path.GetVertex(F2SubBottom.WT6.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.U2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.WT6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.V2.ordinal()), _path.GetVertex(F2SubBottom.EL4.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.V2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.EL4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.V2.ordinal()), _path.GetVertex(F2SubBottom.U2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.V2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.U2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.W1.ordinal()), _path.GetVertex(F2SubBottom.q2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.W1.ordinal()).GetY()-_path.GetVertex(F2SubBottom.q2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.W2.ordinal()), _path.GetVertex(F2SubBottom.B2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.W2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.B2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.W5.ordinal()), _path.GetVertex(F2SubBottom.EL3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.W5.ordinal()).GetX()-_path.GetVertex(F2SubBottom.EL3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.W5.ordinal()), _path.GetVertex(F2SubBottom.H3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.W5.ordinal()).GetY()-_path.GetVertex(F2SubBottom.H3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.W6.ordinal()), _path.GetVertex(F2SubBottom.T2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.W6.ordinal()).GetY()-_path.GetVertex(F2SubBottom.T2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.WT1.ordinal()), _path.GetVertex(F2SubBottom.q2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.WT1.ordinal()).GetX()-_path.GetVertex(F2SubBottom.q2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.WT5.ordinal()), _path.GetVertex(F2SubBottom.G3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.WT5.ordinal()).GetY()-_path.GetVertex(F2SubBottom.G3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.WT6.ordinal()), _path.GetVertex(F2SubBottom.U2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.WT6.ordinal()).GetY()-_path.GetVertex(F2SubBottom.U2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.X2.ordinal()), _path.GetVertex(F2SubBottom.S8.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.X2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S8.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.X2.ordinal()), _path.GetVertex(F2SubBottom.w2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.X2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.w2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.Y2.ordinal()), _path.GetVertex(F2SubBottom.K3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.Y2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.K3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.Y2.ordinal()), _path.GetVertex(F2SubBottom.X2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.Y2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.X2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.Z2.ordinal()), _path.GetVertex(F2SubBottom.S7.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.Z2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S7.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.Z2.ordinal()), _path.GetVertex(F2SubBottom.Y2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.Z2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.Y2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.c2.ordinal()), _path.GetVertex(F2SubBottom.EL2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.c2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.EL2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.c2.ordinal()), _path.GetVertex(F2SubBottom.ES2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.c2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.ES2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.c3.ordinal()), _path.GetVertex(F2SubBottom.B3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.c3.ordinal()).GetX()-_path.GetVertex(F2SubBottom.B3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.c3.ordinal()), _path.GetVertex(F2SubBottom.I3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.c3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.I3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.d3.ordinal()), _path.GetVertex(F2SubBottom.S5.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.d3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.S5.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.d3.ordinal()), _path.GetVertex(F2SubBottom.c3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.d3.ordinal()).GetX()-_path.GetVertex(F2SubBottom.c3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.e2.ordinal()), _path.GetVertex(F2SubBottom.F4.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.e2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.F4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.e2.ordinal()), _path.GetVertex(F2SubBottom.c2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.e2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.c2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.e3.ordinal()), _path.GetVertex(F2SubBottom.ES3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.e3.ordinal()).GetY()-_path.GetVertex(F2SubBottom.ES3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.e3.ordinal()), _path.GetVertex(F2SubBottom.d3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.e3.ordinal()).GetX()-_path.GetVertex(F2SubBottom.d3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.q2.ordinal()), _path.GetVertex(F2SubBottom.ES1.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.q2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.ES1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.q2.ordinal()), _path.GetVertex(F2SubBottom.W1.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.q2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.W1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.s2.ordinal()), _path.GetVertex(F2SubBottom.K2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.s2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.K2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.s2.ordinal()), _path.GetVertex(F2SubBottom.Q1.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.s2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.Q1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.w2.ordinal()), _path.GetVertex(F2SubBottom.ES4.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.w2.ordinal()).GetY()-_path.GetVertex(F2SubBottom.ES4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.w2.ordinal()), _path.GetVertex(F2SubBottom.V2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.w2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.V2.ordinal()).GetX()));


        //extend edges added

        _path.AddRoute(_path.GetVertex(F2SubBottom.EB1.ordinal()), _path.GetVertex(F2SubBottom.S12.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB1.ordinal()).GetX()-_path.GetVertex(F2SubBottom.S12.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB1.ordinal()), _path.GetVertex(F2SubBottom.P2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB1.ordinal()).GetX()-_path.GetVertex(F2SubBottom.P2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB1.ordinal()), _path.GetVertex(F2SubBottom.O2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB1.ordinal()).GetX()-_path.GetVertex(F2SubBottom.O2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB2.ordinal()), _path.GetVertex(F2SubBottom.N2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.N2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB2.ordinal()), _path.GetVertex(F2SubBottom.EB10.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB2.ordinal()).GetX() - _path.GetVertex(F2SubBottom.EB10.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB2.ordinal()), _path.GetVertex(F2SubBottom.M2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB2.ordinal()).GetX()-_path.GetVertex(F2SubBottom.M2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB3.ordinal()), _path.GetVertex(F2SubBottom.L2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB3.ordinal()).GetX() - _path.GetVertex(F2SubBottom.L2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB3.ordinal()), _path.GetVertex(F2SubBottom.EB9.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB3.ordinal()).GetX() - _path.GetVertex(F2SubBottom.EB9.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB3.ordinal()), _path.GetVertex(F2SubBottom.I2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB3.ordinal()).GetX()-_path.GetVertex(F2SubBottom.I2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB4.ordinal()), _path.GetVertex(F2SubBottom.I2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB4.ordinal()).GetX() - _path.GetVertex(F2SubBottom.I2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB4.ordinal()), _path.GetVertex(F2SubBottom.EB8.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB4.ordinal()).GetX() - _path.GetVertex(F2SubBottom.EB8.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB4.ordinal()), _path.GetVertex(F2SubBottom.H2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB4.ordinal()).GetX()-_path.GetVertex(F2SubBottom.H2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB5.ordinal()), _path.GetVertex(F2SubBottom.G2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB5.ordinal()).GetX() - _path.GetVertex(F2SubBottom.G2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB5.ordinal()), _path.GetVertex(F2SubBottom.EB7.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB5.ordinal()).GetX() - _path.GetVertex(F2SubBottom.EB7.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB5.ordinal()), _path.GetVertex(F2SubBottom.F2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB5.ordinal()).GetX()-_path.GetVertex(F2SubBottom.F2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB6.ordinal()), _path.GetVertex(F2SubBottom.e2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB6.ordinal()).GetX() - _path.GetVertex(F2SubBottom.e2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB6.ordinal()), _path.GetVertex(F2SubBottom.S16.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB6.ordinal()).GetX() - _path.GetVertex(F2SubBottom.S16.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB6.ordinal()), _path.GetVertex(F2SubBottom.c2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB6.ordinal()).GetX() - _path.GetVertex(F2SubBottom.c2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB7.ordinal()), _path.GetVertex(F2SubBottom.J2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB7.ordinal()).GetX() - _path.GetVertex(F2SubBottom.J2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB7.ordinal()), _path.GetVertex(F2SubBottom.V2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB7.ordinal()).GetX() - _path.GetVertex(F2SubBottom.V2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB7.ordinal()), _path.GetVertex(F2SubBottom.F4.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB7.ordinal()).GetX()-_path.GetVertex(F2SubBottom.F4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB8.ordinal()), _path.GetVertex(F2SubBottom.K2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB8.ordinal()).GetX() - _path.GetVertex(F2SubBottom.K2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB8.ordinal()), _path.GetVertex(F2SubBottom.EB12.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB8.ordinal()).GetX() - _path.GetVertex(F2SubBottom.EB12.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB8.ordinal()), _path.GetVertex(F2SubBottom.J2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB8.ordinal()).GetX()-_path.GetVertex(F2SubBottom.J2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB9.ordinal()), _path.GetVertex(F2SubBottom.S2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB9.ordinal()).GetX() - _path.GetVertex(F2SubBottom.S2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB9.ordinal()), _path.GetVertex(F2SubBottom.EB11.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB9.ordinal()).GetX() - _path.GetVertex(F2SubBottom.EB11.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB9.ordinal()), _path.GetVertex(F2SubBottom.K2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB9.ordinal()).GetX() - _path.GetVertex(F2SubBottom.K2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB10.ordinal()), _path.GetVertex(F2SubBottom.R2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB10.ordinal()).GetX() - _path.GetVertex(F2SubBottom.R2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB10.ordinal()), _path.GetVertex(F2SubBottom.F3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB10.ordinal()).GetX() - _path.GetVertex(F2SubBottom.F3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB10.ordinal()), _path.GetVertex(F2SubBottom.S2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB10.ordinal()).GetX()-_path.GetVertex(F2SubBottom.S2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB11.ordinal()), _path.GetVertex(F2SubBottom.B3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB11.ordinal()).GetX() - _path.GetVertex(F2SubBottom.B3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB11.ordinal()), _path.GetVertex(F2SubBottom.A3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB11.ordinal()).GetX()-_path.GetVertex(F2SubBottom.A3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB12.ordinal()), _path.GetVertex(F2SubBottom.A3.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB12.ordinal()).GetX() - _path.GetVertex(F2SubBottom.A3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubBottom.EB12.ordinal()), _path.GetVertex(F2SubBottom.Z2.ordinal()), Math.abs(_path.GetVertex(F2SubBottom.EB12.ordinal()).GetX()-_path.GetVertex(F2SubBottom.Z2.ordinal()).GetX()));

    }

    public int GetStartOrder(){

        return F2SubBottom.start_position.ordinal();
    }
    public int GetEndOrder(){

        return F2SubBottom.end_position.ordinal();
    }
    public int GetStartAux1Order(){
        return F2SubBottom.start_auxiliary_pos.ordinal();
    }
    public int GetStartAux2Order(){
        return F2SubBottom.start_auxiliary_pos2.ordinal();
    }
    public int GetStartAux3Order(){
        return F2SubBottom.start_auxiliary_pos3.ordinal();
    }
    public int GetStartAux4Order(){
        return F2SubBottom.start_auxiliary_pos4.ordinal();
    }
    public int GetEndAux1Order(){
        return F2SubBottom.end_auxiliary_pos.ordinal();
    }
    public int GetEndAux2Order(){
        return F2SubBottom.end_auxiliary_pos2.ordinal();
    }
    public int GetEndAux3Order(){
        return F2SubBottom.end_auxiliary_pos3.ordinal();
    }
    public int GetEndAux4Order(){
        return F2SubBottom.end_auxiliary_pos4.ordinal();
    }
}