package com.Path.Dijkstra.SubGraph;
import com.Path.DefinedVertex.F2SubTop;
import com.Path.DefinedVertex.SubNumber;

/**
 * Created by toy on 4/11/15.
 */


public class F2SubTopFloor extends Floor{
    //ArrayList<Vertex> B1_vertex= new ArrayList();
    public F2SubTopFloor(int stair) {
        super(stair);
        _sub_no = SubNumber.F2SubTop;
    }

    public void InitializeVertex() {

       //basic points added
        _path.AddVertex(F2SubTop.SC2.ordinal(), new Vertex("SC2" , 0.4992, 0.8001, _stair));
        _path.AddVertex(F2SubTop.E9.ordinal(), new Vertex("E9" , 0.4395, 0.9713, _stair));
        _path.AddVertex(F2SubTop.WT11.ordinal(), new Vertex("WT11" , 0.3799, 0.9502, _stair));
        _path.AddVertex(F2SubTop.E8.ordinal(), new Vertex("E8" , 0.3183, 0.9713, _stair));
        _path.AddVertex(F2SubTop.E7.ordinal(), new Vertex("E7" , 0.1990, 0.9713, _stair));
        _path.AddVertex(F2SubTop.EL7.ordinal(), new Vertex("EL7" , 0.1432, 0.9502, _stair));
        _path.AddVertex(F2SubTop.ES7.ordinal(), new Vertex("ES7" , 0.1182, 0.9155, _stair));
        _path.AddVertex(F2SubTop.W7.ordinal(), new Vertex("W7" , 0.0604, 0.9329, _stair));
        _path.AddVertex(F2SubTop.WT9.ordinal(), new Vertex("WT9" , 0.0450, 0.9329, _stair));
        _path.AddVertex(F2SubTop.E6.ordinal(), new Vertex("E6" , 0.0316, 0.8636, _stair));
        _path.AddVertex(F2SubTop.E5.ordinal(), new Vertex("E5" , 0.0316, 0.7404, _stair));
        _path.AddVertex(F2SubTop.WT7.ordinal(), new Vertex("WT7" , 0.0450, 0.6808, _stair));
        _path.AddVertex(F2SubTop.E4.ordinal(), new Vertex("E4" , 0.0316, 0.6211, _stair));
        _path.AddVertex(F2SubTop.E3.ordinal(), new Vertex("E3" , 0.0316, 0.5018, _stair));
        _path.AddVertex(F2SubTop.E2.ordinal(), new Vertex("E2" , 0.0316, 0.3825, _stair));
        _path.AddVertex(F2SubTop.WT3.ordinal(), new Vertex("WT3" , 0.0450, 0.3190, _stair));
        _path.AddVertex(F2SubTop.E1.ordinal(), new Vertex("E1" , 0.0316, 0.2632, _stair));
        _path.AddVertex(F2SubTop.W3.ordinal(), new Vertex("W3" , 0.0604, 0.1939, _stair));
        _path.AddVertex(F2SubTop.S19.ordinal(), new Vertex("S19" , 0.1085, 0.2863, _stair));
        _path.AddVertex(F2SubTop.S18.ordinal(), new Vertex("S18" , 0.1085, 0.3190, _stair));
        _path.AddVertex(F2SubTop.S17.ordinal(), new Vertex("S17" , 0.1085, 0.3632, _stair));
        _path.AddVertex(F2SubTop.S20.ordinal(), new Vertex("S20" , 0.1797, 0.3998, _stair));
        _path.AddVertex(F2SubTop.SC1.ordinal(), new Vertex("SC1" , 0.2009, 0.5018, _stair));
        _path.AddVertex(F2SubTop.S27.ordinal(), new Vertex("S27" , 0.1509, 0.7404, _stair));
        _path.AddVertex(F2SubTop.S26.ordinal(), new Vertex("S26" , 0.1509, 0.7808, _stair));
        _path.AddVertex(F2SubTop.S25.ordinal(), new Vertex("S25" , 0.1509, 0.8212, _stair));
        _path.AddVertex(F2SubTop.S28.ordinal(), new Vertex("S28" , 0.2163, 0.8520, _stair));
        _path.AddVertex(F2SubTop.S29.ordinal(), new Vertex("S29" , 0.2548, 0.8520, _stair));
        _path.AddVertex(F2SubTop.S33.ordinal(), new Vertex("S33" , 0.7416, 0.8520, _stair));
        _path.AddVertex(F2SubTop.S34.ordinal(), new Vertex("S34" , 0.7763, 0.8520, _stair));
        _path.AddVertex(F2SubTop.S30.ordinal(), new Vertex("S30" , 0.8436, 0.8212, _stair));
        _path.AddVertex(F2SubTop.S31.ordinal(), new Vertex("S31" , 0.8436, 0.7808, _stair));
        _path.AddVertex(F2SubTop.S32.ordinal(), new Vertex("S32" , 0.8436, 0.7404, _stair));
        _path.AddVertex(F2SubTop.SC3.ordinal(), new Vertex("SC3" , 0.7975, 0.5018, _stair));
        _path.AddVertex(F2SubTop.S24.ordinal(), new Vertex("S24" , 0.8186, 0.3960, _stair));
        _path.AddVertex(F2SubTop.S21.ordinal(), new Vertex("S21" , 0.8860, 0.3632, _stair));
        _path.AddVertex(F2SubTop.S22.ordinal(), new Vertex("S22" , 0.8860, 0.3190, _stair));
        _path.AddVertex(F2SubTop.S23.ordinal(), new Vertex("S23" , 0.8860, 0.2863, _stair));
        _path.AddVertex(F2SubTop.W4.ordinal(), new Vertex("W4" , 0.9302, 0.1939, _stair));
        _path.AddVertex(F2SubTop.E18.ordinal(), new Vertex("E18" , 0.9630, 0.2632, _stair));
        _path.AddVertex(F2SubTop.WT4.ordinal(), new Vertex("WT4" , 0.9514, 0.3190, _stair));
        _path.AddVertex(F2SubTop.E17.ordinal(), new Vertex("E17" , 0.9630, 0.3825, _stair));
        _path.AddVertex(F2SubTop.E16.ordinal(), new Vertex("E16" , 0.9630, 0.5018, _stair));
        _path.AddVertex(F2SubTop.E15.ordinal(), new Vertex("E15" , 0.9630, 0.6211, _stair));
        _path.AddVertex(F2SubTop.WT8.ordinal(), new Vertex("WT8" , 0.9514, 0.6808, _stair));
        _path.AddVertex(F2SubTop.E14.ordinal(), new Vertex("E14" , 0.9630, 0.7404, _stair));
        _path.AddVertex(F2SubTop.E13.ordinal(), new Vertex("E13" , 0.9630, 0.8636, _stair));
        _path.AddVertex(F2SubTop.WT10.ordinal(), new Vertex("WT10" , 0.9514, 0.9329, _stair));
        _path.AddVertex(F2SubTop.W8.ordinal(), new Vertex("W8" , 0.9283, 0.9329, _stair));
        _path.AddVertex(F2SubTop.ES8.ordinal(), new Vertex("ES8" , 0.8764, 0.9155, _stair));
        _path.AddVertex(F2SubTop.EL8.ordinal(), new Vertex("EL8" , 0.8552, 0.9502, _stair));
        _path.AddVertex(F2SubTop.E12.ordinal(), new Vertex("E12" , 0.7975, 0.9713, _stair));
        _path.AddVertex(F2SubTop.E11.ordinal(), new Vertex("E11" , 0.6782, 0.9713, _stair));
        _path.AddVertex(F2SubTop.WT12.ordinal(), new Vertex("WT12" , 0.6166, 0.9502, _stair));
        _path.AddVertex(F2SubTop.E10.ordinal(), new Vertex("E10" , 0.5625, 0.9713, _stair));
        _path.AddVertex(F2SubTop.c1.ordinal(), new Vertex("c1" , 0.4992, 0.9155, _stair));
        _path.AddVertex(F2SubTop.K.ordinal(), new Vertex("K" , 0.4395, 0.9155, _stair));
        _path.AddVertex(F2SubTop.D.ordinal(), new Vertex("D" , 0.3799, 0.9155, _stair));
        _path.AddVertex(F2SubTop.F.ordinal(), new Vertex("F" , 0.3183, 0.9155, _stair));
        _path.AddVertex(F2SubTop.G.ordinal(), new Vertex("G" , 0.2548, 0.9155, _stair));
        _path.AddVertex(F2SubTop.H.ordinal(), new Vertex("H" , 0.2163, 0.9155, _stair));
        _path.AddVertex(F2SubTop.A.ordinal(), new Vertex("A" , 0.1990, 0.9155, _stair));
        _path.AddVertex(F2SubTop.I.ordinal(), new Vertex("I" , 0.1432, 0.9155, _stair));
        _path.AddVertex(F2SubTop.J.ordinal(), new Vertex("J" , 0.0604, 0.9155, _stair));
        _path.AddVertex(F2SubTop.B.ordinal(), new Vertex("B" , 0.0450, 0.9155, _stair));
        _path.AddVertex(F2SubTop.B1.ordinal(), new Vertex("B1" , 0.1085, 0.8636, _stair));
        _path.AddVertex(F2SubTop.A1.ordinal(), new Vertex("A1" , 0.1085, 0.8212, _stair));
        _path.AddVertex(F2SubTop.Z.ordinal(), new Vertex("Z" , 0.1085, 0.7808, _stair));
        _path.AddVertex(F2SubTop.Y.ordinal(), new Vertex("Y" , 0.1085, 0.7404, _stair));
        _path.AddVertex(F2SubTop.X.ordinal(), new Vertex("X" , 0.1085, 0.6808, _stair));
        _path.AddVertex(F2SubTop.W.ordinal(), new Vertex("W" , 0.1085, 0.6211, _stair));
        _path.AddVertex(F2SubTop.V.ordinal(), new Vertex("V" , 0.1085, 0.5018, _stair));
        _path.AddVertex(F2SubTop.U.ordinal(), new Vertex("U" , 0.1085, 0.3998, _stair));
        _path.AddVertex(F2SubTop.T.ordinal(), new Vertex("T" , 0.1085, 0.3825, _stair));
        _path.AddVertex(F2SubTop.C.ordinal(), new Vertex("C" , 0.0450, 0.8636, _stair));
        _path.AddVertex(F2SubTop.L.ordinal(), new Vertex("L" , 0.0450, 0.7404, _stair));
        _path.AddVertex(F2SubTop.N.ordinal(), new Vertex("N" , 0.0450, 0.6211, _stair));
        _path.AddVertex(F2SubTop.O.ordinal(), new Vertex("O" , 0.0450, 0.5018, _stair));
        _path.AddVertex(F2SubTop.P.ordinal(), new Vertex("P" , 0.0450, 0.3825, _stair));
        _path.AddVertex(F2SubTop.Q.ordinal(), new Vertex("Q" , 0.0450, 0.2632, _stair));
        _path.AddVertex(F2SubTop.R.ordinal(), new Vertex("R" , 0.0604, 0.2632, _stair));
        _path.AddVertex(F2SubTop.B4.ordinal(), new Vertex("B4" , 0.1085, 0.2632, _stair));
        _path.AddVertex(F2SubTop.S.ordinal(), new Vertex("S" , 0.1085, 0.1939, _stair));
        _path.AddVertex(F2SubTop.d1.ordinal(), new Vertex("d1" , 0.5625, 0.9155, _stair));
        _path.AddVertex(F2SubTop.e1.ordinal(), new Vertex("e1" , 0.6166, 0.9155, _stair));
        _path.AddVertex(F2SubTop.F1.ordinal(), new Vertex("F1" , 0.6782, 0.9155, _stair));
        _path.AddVertex(F2SubTop.G1.ordinal(), new Vertex("G1" , 0.7416, 0.9155, _stair));
        _path.AddVertex(F2SubTop.H1.ordinal(), new Vertex("H1" , 0.7763, 0.9155, _stair));
        _path.AddVertex(F2SubTop.I1.ordinal(), new Vertex("I1" , 0.7975, 0.9155, _stair));
        _path.AddVertex(F2SubTop.J1.ordinal(), new Vertex("J1" , 0.8552, 0.9155, _stair));
        _path.AddVertex(F2SubTop.K1.ordinal(), new Vertex("K1" , 0.9283, 0.9155, _stair));
        _path.AddVertex(F2SubTop.E.ordinal(), new Vertex("E" , 0.9514, 0.9155, _stair));
        _path.AddVertex(F2SubTop.L1.ordinal(), new Vertex("L1" , 0.8860, 0.8636, _stair));
        _path.AddVertex(F2SubTop.M1.ordinal(), new Vertex("M1" , 0.8860, 0.8212, _stair));
        _path.AddVertex(F2SubTop.N1.ordinal(), new Vertex("N1" , 0.8860, 0.7808, _stair));
        _path.AddVertex(F2SubTop.O1.ordinal(), new Vertex("O1" , 0.8860, 0.7404, _stair));
        _path.AddVertex(F2SubTop.q1.ordinal(), new Vertex("q1" , 0.8860, 0.6808, _stair));
        _path.AddVertex(F2SubTop.s1.ordinal(), new Vertex("s1" , 0.8860, 0.6211, _stair));
        _path.AddVertex(F2SubTop.U1.ordinal(), new Vertex("U1" , 0.8860, 0.5018, _stair));
        _path.AddVertex(F2SubTop.A2.ordinal(), new Vertex("A2" , 0.8860, 0.1939, _stair));
        _path.AddVertex(F2SubTop.c4.ordinal(), new Vertex("c4" , 0.9283, 0.8636, _stair));
        _path.AddVertex(F2SubTop.P1.ordinal(), new Vertex("P1" , 0.9283, 0.7404, _stair));
        _path.AddVertex(F2SubTop.R1.ordinal(), new Vertex("R1" , 0.9283, 0.6808, _stair));
        _path.AddVertex(F2SubTop.T1.ordinal(), new Vertex("T1" , 0.9283, 0.6211, _stair));
        _path.AddVertex(F2SubTop.V1.ordinal(), new Vertex("V1" , 0.8186, 0.5018, _stair));
        _path.AddVertex(F2SubTop.w1.ordinal(), new Vertex("w1" , 0.9283, 0.5018, _stair));
        _path.AddVertex(F2SubTop.X1.ordinal(), new Vertex("X1" , 0.9283, 0.3825, _stair));
        _path.AddVertex(F2SubTop.D4.ordinal(), new Vertex("D4" , 0.8860, 0.3825, _stair));
        _path.AddVertex(F2SubTop.Y1.ordinal(), new Vertex("Y1" , 0.9283, 0.3190, _stair));
        _path.AddVertex(F2SubTop.Z1.ordinal(), new Vertex("Z1" , 0.9283, 0.2632, _stair));
        _path.AddVertex(F2SubTop.e4.ordinal(), new Vertex("e4" , 0.8860, 0.2632, _stair));


        //necessary points added

        _path.AddVertex(F2SubTop.start_position.ordinal(), new Vertex("Start", 0, 0, _stair));
        _path.AddVertex(F2SubTop.end_position.ordinal(), new Vertex("End", 0, 0, _stair));
        _path.AddVertex(F2SubTop.start_auxiliary_pos.ordinal(), new Vertex("Start_aux", 0, 0, _stair));
        _path.AddVertex(F2SubTop.end_auxiliary_pos.ordinal(), new Vertex("End_aux", 0, 0, _stair));
        _path.AddVertex(F2SubTop.start_auxiliary_pos2.ordinal(), new Vertex("Start_aux2", 0, 0, _stair));
        _path.AddVertex(F2SubTop.end_auxiliary_pos2.ordinal(), new Vertex("End_aux2", 0, 0, _stair));
        _path.AddVertex(F2SubTop.start_auxiliary_pos3.ordinal(), new Vertex("Start_aux3", 0, 0, _stair));
        _path.AddVertex(F2SubTop.end_auxiliary_pos3.ordinal(), new Vertex("End_aux3", 0, 0, _stair));
        _path.AddVertex(F2SubTop.start_auxiliary_pos4.ordinal(), new Vertex("Start_aux4", 0, 0, _stair));
        _path.AddVertex(F2SubTop.end_auxiliary_pos4.ordinal(), new Vertex("End_aux4", 0, 0, _stair));


        //extend points added

        _path.AddVertex(F2SubTop.ET1.ordinal(), new Vertex("ET1",0.1797,0.6808, _stair));
        _path.AddVertex(F2SubTop.ET2.ordinal(), new Vertex("ET2",0.1797,0.5018, _stair));
        _path.AddVertex(F2SubTop.ET3.ordinal(), new Vertex("ET3",0.8186,0.6808, _stair));
        _path.AddVertex(F2SubTop.ET4.ordinal(), new Vertex("ET4",0.8186,0.6211, _stair));
        _path.AddVertex(F2SubTop.ET5.ordinal(), new Vertex("ET5",0.4992,0.8520, _stair));
        _path.AddVertex(F2SubTop.ET6.ordinal(), new Vertex("ET6",0.1797,0.6211, _stair));
        _path.AddVertex(F2SubTop.ET7.ordinal(), new Vertex("ET7", 0.8860,0.3960,_stair));


    }

    public void InitializeEdge() {


        //basic edges added
        _path.AddRoute(_path.GetVertex(F2SubTop.A.ordinal()), _path.GetVertex(F2SubTop.E7.ordinal()), Math.abs(_path.GetVertex(F2SubTop.A.ordinal()).GetY()-_path.GetVertex(F2SubTop.E7.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.A.ordinal()), _path.GetVertex(F2SubTop.H.ordinal()), Math.abs(_path.GetVertex(F2SubTop.A.ordinal()).GetX()-_path.GetVertex(F2SubTop.H.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.A1.ordinal()), _path.GetVertex(F2SubTop.S25.ordinal()), Math.abs(_path.GetVertex(F2SubTop.A1.ordinal()).GetX()-_path.GetVertex(F2SubTop.S25.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.A1.ordinal()), _path.GetVertex(F2SubTop.Z.ordinal()), Math.abs(_path.GetVertex(F2SubTop.A1.ordinal()).GetY()-_path.GetVertex(F2SubTop.Z.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.A2.ordinal()), _path.GetVertex(F2SubTop.W4.ordinal()), Math.abs(_path.GetVertex(F2SubTop.A2.ordinal()).GetX()-_path.GetVertex(F2SubTop.W4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.A2.ordinal()), _path.GetVertex(F2SubTop.e4.ordinal()), Math.abs(_path.GetVertex(F2SubTop.A2.ordinal()).GetY()-_path.GetVertex(F2SubTop.e4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.B.ordinal()), _path.GetVertex(F2SubTop.J.ordinal()), Math.abs(_path.GetVertex(F2SubTop.B.ordinal()).GetX()-_path.GetVertex(F2SubTop.J.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.B.ordinal()), _path.GetVertex(F2SubTop.C.ordinal()), Math.abs(_path.GetVertex(F2SubTop.B.ordinal()).GetY()-_path.GetVertex(F2SubTop.C.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.B.ordinal()), _path.GetVertex(F2SubTop.WT9.ordinal()), Math.abs(_path.GetVertex(F2SubTop.B.ordinal()).GetY()-_path.GetVertex(F2SubTop.WT9.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.B1.ordinal()), _path.GetVertex(F2SubTop.A1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.B1.ordinal()).GetY()-_path.GetVertex(F2SubTop.A1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.B4.ordinal()), _path.GetVertex(F2SubTop.S.ordinal()), Math.abs(_path.GetVertex(F2SubTop.B4.ordinal()).GetY()-_path.GetVertex(F2SubTop.S.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.B4.ordinal()), _path.GetVertex(F2SubTop.S19.ordinal()), Math.abs(_path.GetVertex(F2SubTop.B4.ordinal()).GetY()-_path.GetVertex(F2SubTop.S19.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.C.ordinal()), _path.GetVertex(F2SubTop.B1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.C.ordinal()).GetX()-_path.GetVertex(F2SubTop.B1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.C.ordinal()), _path.GetVertex(F2SubTop.L.ordinal()), Math.abs(_path.GetVertex(F2SubTop.C.ordinal()).GetY()-_path.GetVertex(F2SubTop.L.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.D.ordinal()), _path.GetVertex(F2SubTop.K.ordinal()), Math.abs(_path.GetVertex(F2SubTop.D.ordinal()).GetX()-_path.GetVertex(F2SubTop.K.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.D.ordinal()), _path.GetVertex(F2SubTop.WT11.ordinal()), Math.abs(_path.GetVertex(F2SubTop.D.ordinal()).GetY()-_path.GetVertex(F2SubTop.WT11.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.D4.ordinal()), _path.GetVertex(F2SubTop.S21.ordinal()), Math.abs(_path.GetVertex(F2SubTop.D4.ordinal()).GetY()-_path.GetVertex(F2SubTop.S21.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.D4.ordinal()), _path.GetVertex(F2SubTop.U1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.D4.ordinal()).GetY()-_path.GetVertex(F2SubTop.U1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.D4.ordinal()), _path.GetVertex(F2SubTop.X1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.D4.ordinal()).GetX()-_path.GetVertex(F2SubTop.X1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E.ordinal()), _path.GetVertex(F2SubTop.WT10.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E.ordinal()).GetY()-_path.GetVertex(F2SubTop.WT10.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E1.ordinal()), _path.GetVertex(F2SubTop.Q.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E1.ordinal()).GetX()-_path.GetVertex(F2SubTop.Q.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E10.ordinal()), _path.GetVertex(F2SubTop.d1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E10.ordinal()).GetY()-_path.GetVertex(F2SubTop.d1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E11.ordinal()), _path.GetVertex(F2SubTop.F1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E11.ordinal()).GetY()-_path.GetVertex(F2SubTop.F1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E12.ordinal()), _path.GetVertex(F2SubTop.I1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E12.ordinal()).GetY()-_path.GetVertex(F2SubTop.I1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E14.ordinal()), _path.GetVertex(F2SubTop.E13.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E14.ordinal()).GetY()-_path.GetVertex(F2SubTop.E13.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E15.ordinal()), _path.GetVertex(F2SubTop.E16.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E15.ordinal()).GetY()-_path.GetVertex(F2SubTop.E16.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E16.ordinal()), _path.GetVertex(F2SubTop.E17.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E16.ordinal()).GetY()-_path.GetVertex(F2SubTop.E17.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E2.ordinal()), _path.GetVertex(F2SubTop.E3.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E2.ordinal()).GetY()-_path.GetVertex(F2SubTop.E3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E2.ordinal()), _path.GetVertex(F2SubTop.P.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E2.ordinal()).GetX()-_path.GetVertex(F2SubTop.P.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E3.ordinal()), _path.GetVertex(F2SubTop.E4.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E3.ordinal()).GetY()-_path.GetVertex(F2SubTop.E4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E3.ordinal()), _path.GetVertex(F2SubTop.O.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E3.ordinal()).GetX()-_path.GetVertex(F2SubTop.O.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E4.ordinal()), _path.GetVertex(F2SubTop.N.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E4.ordinal()).GetX()-_path.GetVertex(F2SubTop.N.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E5.ordinal()), _path.GetVertex(F2SubTop.L.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E5.ordinal()).GetX()-_path.GetVertex(F2SubTop.L.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E6.ordinal()), _path.GetVertex(F2SubTop.C.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E6.ordinal()).GetX()-_path.GetVertex(F2SubTop.C.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E7.ordinal()), _path.GetVertex(F2SubTop.E8.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E7.ordinal()).GetX()-_path.GetVertex(F2SubTop.E8.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E8.ordinal()), _path.GetVertex(F2SubTop.F.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E8.ordinal()).GetY()-_path.GetVertex(F2SubTop.F.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E9.ordinal()), _path.GetVertex(F2SubTop.E10.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E9.ordinal()).GetX()-_path.GetVertex(F2SubTop.E10.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.E9.ordinal()), _path.GetVertex(F2SubTop.K.ordinal()), Math.abs(_path.GetVertex(F2SubTop.E9.ordinal()).GetY()-_path.GetVertex(F2SubTop.K.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.EL7.ordinal()), _path.GetVertex(F2SubTop.I.ordinal()), Math.abs(_path.GetVertex(F2SubTop.EL7.ordinal()).GetY()-_path.GetVertex(F2SubTop.I.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.EL7.ordinal()), _path.GetVertex(F2SubTop.WT11.ordinal()), Math.abs(_path.GetVertex(F2SubTop.EL7.ordinal()).GetX()-_path.GetVertex(F2SubTop.WT11.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.EL8.ordinal()), _path.GetVertex(F2SubTop.J1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.EL8.ordinal()).GetY()-_path.GetVertex(F2SubTop.J1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ES7.ordinal()), _path.GetVertex(F2SubTop.I.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ES7.ordinal()).GetX()-_path.GetVertex(F2SubTop.I.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ES8.ordinal()), _path.GetVertex(F2SubTop.K1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ES8.ordinal()).GetX()-_path.GetVertex(F2SubTop.K1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.F.ordinal()), _path.GetVertex(F2SubTop.D.ordinal()), Math.abs(_path.GetVertex(F2SubTop.F.ordinal()).GetX()-_path.GetVertex(F2SubTop.D.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.F1.ordinal()), _path.GetVertex(F2SubTop.G1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.F1.ordinal()).GetX()-_path.GetVertex(F2SubTop.G1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.G.ordinal()), _path.GetVertex(F2SubTop.F.ordinal()), Math.abs(_path.GetVertex(F2SubTop.G.ordinal()).GetX()-_path.GetVertex(F2SubTop.F.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.G.ordinal()), _path.GetVertex(F2SubTop.S29.ordinal()), Math.abs(_path.GetVertex(F2SubTop.G.ordinal()).GetY()-_path.GetVertex(F2SubTop.S29.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.G1.ordinal()), _path.GetVertex(F2SubTop.H1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.G1.ordinal()).GetX()-_path.GetVertex(F2SubTop.H1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.G1.ordinal()), _path.GetVertex(F2SubTop.S33.ordinal()), Math.abs(_path.GetVertex(F2SubTop.G1.ordinal()).GetY()-_path.GetVertex(F2SubTop.S33.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.H.ordinal()), _path.GetVertex(F2SubTop.G.ordinal()), Math.abs(_path.GetVertex(F2SubTop.H.ordinal()).GetX()-_path.GetVertex(F2SubTop.G.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.H.ordinal()), _path.GetVertex(F2SubTop.S28.ordinal()), Math.abs(_path.GetVertex(F2SubTop.H.ordinal()).GetY()-_path.GetVertex(F2SubTop.S28.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.H1.ordinal()), _path.GetVertex(F2SubTop.I1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.H1.ordinal()).GetX()-_path.GetVertex(F2SubTop.I1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.H1.ordinal()), _path.GetVertex(F2SubTop.S34.ordinal()), Math.abs(_path.GetVertex(F2SubTop.H1.ordinal()).GetY()-_path.GetVertex(F2SubTop.S34.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.I.ordinal()), _path.GetVertex(F2SubTop.A.ordinal()), Math.abs(_path.GetVertex(F2SubTop.I.ordinal()).GetX()-_path.GetVertex(F2SubTop.A.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.I1.ordinal()), _path.GetVertex(F2SubTop.J1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.I1.ordinal()).GetX()-_path.GetVertex(F2SubTop.J1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.J.ordinal()), _path.GetVertex(F2SubTop.ES7.ordinal()), Math.abs(_path.GetVertex(F2SubTop.J.ordinal()).GetX()-_path.GetVertex(F2SubTop.ES7.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.J.ordinal()), _path.GetVertex(F2SubTop.W7.ordinal()), Math.abs(_path.GetVertex(F2SubTop.J.ordinal()).GetY()-_path.GetVertex(F2SubTop.W7.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.J1.ordinal()), _path.GetVertex(F2SubTop.ES8.ordinal()), Math.abs(_path.GetVertex(F2SubTop.J1.ordinal()).GetX()-_path.GetVertex(F2SubTop.ES8.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.K.ordinal()), _path.GetVertex(F2SubTop.c1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.K.ordinal()).GetX()-_path.GetVertex(F2SubTop.c1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.K1.ordinal()), _path.GetVertex(F2SubTop.E.ordinal()), Math.abs(_path.GetVertex(F2SubTop.K1.ordinal()).GetX()-_path.GetVertex(F2SubTop.E.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.K1.ordinal()), _path.GetVertex(F2SubTop.W8.ordinal()), Math.abs(_path.GetVertex(F2SubTop.K1.ordinal()).GetY()-_path.GetVertex(F2SubTop.W8.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.K1.ordinal()), _path.GetVertex(F2SubTop.c4.ordinal()), Math.abs(_path.GetVertex(F2SubTop.K1.ordinal()).GetY()-_path.GetVertex(F2SubTop.c4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.L.ordinal()), _path.GetVertex(F2SubTop.N.ordinal()), Math.abs(_path.GetVertex(F2SubTop.L.ordinal()).GetY()-_path.GetVertex(F2SubTop.WT7.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.L.ordinal()), _path.GetVertex(F2SubTop.Y.ordinal()), Math.abs(_path.GetVertex(F2SubTop.L.ordinal()).GetX()-_path.GetVertex(F2SubTop.Y.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.L1.ordinal()), _path.GetVertex(F2SubTop.M1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.L1.ordinal()).GetY()-_path.GetVertex(F2SubTop.M1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.L1.ordinal()), _path.GetVertex(F2SubTop.c4.ordinal()), Math.abs(_path.GetVertex(F2SubTop.L1.ordinal()).GetX()-_path.GetVertex(F2SubTop.c4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.M1.ordinal()), _path.GetVertex(F2SubTop.N1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.M1.ordinal()).GetY()-_path.GetVertex(F2SubTop.N1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.N.ordinal()), _path.GetVertex(F2SubTop.O.ordinal()), Math.abs(_path.GetVertex(F2SubTop.N.ordinal()).GetY()-_path.GetVertex(F2SubTop.O.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.N.ordinal()), _path.GetVertex(F2SubTop.W.ordinal()), Math.abs(_path.GetVertex(F2SubTop.N.ordinal()).GetX()-_path.GetVertex(F2SubTop.W.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.N.ordinal()), _path.GetVertex(F2SubTop.WT7.ordinal()), Math.abs(_path.GetVertex(F2SubTop.N.ordinal()).GetY()-_path.GetVertex(F2SubTop.WT7.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.N1.ordinal()), _path.GetVertex(F2SubTop.O1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.N1.ordinal()).GetY()-_path.GetVertex(F2SubTop.O1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.O.ordinal()), _path.GetVertex(F2SubTop.P.ordinal()), Math.abs(_path.GetVertex(F2SubTop.O.ordinal()).GetY()-_path.GetVertex(F2SubTop.P.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.O.ordinal()), _path.GetVertex(F2SubTop.V.ordinal()), Math.abs(_path.GetVertex(F2SubTop.O.ordinal()).GetX()-_path.GetVertex(F2SubTop.V.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.O1.ordinal()), _path.GetVertex(F2SubTop.P1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.O1.ordinal()).GetX()-_path.GetVertex(F2SubTop.P1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.O1.ordinal()), _path.GetVertex(F2SubTop.q1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.O1.ordinal()).GetY()-_path.GetVertex(F2SubTop.q1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.P.ordinal()), _path.GetVertex(F2SubTop.T.ordinal()), Math.abs(_path.GetVertex(F2SubTop.P.ordinal()).GetX()-_path.GetVertex(F2SubTop.T.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.P.ordinal()), _path.GetVertex(F2SubTop.WT3.ordinal()), Math.abs(_path.GetVertex(F2SubTop.P.ordinal()).GetY()-_path.GetVertex(F2SubTop.WT3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.P1.ordinal()), _path.GetVertex(F2SubTop.E14.ordinal()), Math.abs(_path.GetVertex(F2SubTop.P1.ordinal()).GetX()-_path.GetVertex(F2SubTop.E14.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.P1.ordinal()), _path.GetVertex(F2SubTop.R1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.P1.ordinal()).GetY()-_path.GetVertex(F2SubTop.R1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.P1.ordinal()), _path.GetVertex(F2SubTop.c4.ordinal()), Math.abs(_path.GetVertex(F2SubTop.P1.ordinal()).GetY()-_path.GetVertex(F2SubTop.c4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.Q.ordinal()), _path.GetVertex(F2SubTop.R.ordinal()), Math.abs(_path.GetVertex(F2SubTop.Q.ordinal()).GetX()-_path.GetVertex(F2SubTop.R.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.Q.ordinal()), _path.GetVertex(F2SubTop.WT3.ordinal()), Math.abs(_path.GetVertex(F2SubTop.Q.ordinal()).GetY()-_path.GetVertex(F2SubTop.WT3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.R.ordinal()), _path.GetVertex(F2SubTop.B4.ordinal()), Math.abs(_path.GetVertex(F2SubTop.R.ordinal()).GetX()-_path.GetVertex(F2SubTop.B4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.R.ordinal()), _path.GetVertex(F2SubTop.W3.ordinal()), Math.abs(_path.GetVertex(F2SubTop.R.ordinal()).GetY()-_path.GetVertex(F2SubTop.W3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.R1.ordinal()), _path.GetVertex(F2SubTop.T1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.R1.ordinal()).GetY()-_path.GetVertex(F2SubTop.T1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.R1.ordinal()), _path.GetVertex(F2SubTop.WT8.ordinal()), Math.abs(_path.GetVertex(F2SubTop.R1.ordinal()).GetX()-_path.GetVertex(F2SubTop.WT8.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S.ordinal()), _path.GetVertex(F2SubTop.W3.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S.ordinal()).GetX()-_path.GetVertex(F2SubTop.W3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S17.ordinal()), _path.GetVertex(F2SubTop.S18.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S17.ordinal()).GetY()-_path.GetVertex(F2SubTop.S18.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S17.ordinal()), _path.GetVertex(F2SubTop.T.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S17.ordinal()).GetY()-_path.GetVertex(F2SubTop.T.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S18.ordinal()), _path.GetVertex(F2SubTop.S19.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S18.ordinal()).GetY()-_path.GetVertex(F2SubTop.S19.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S21.ordinal()), _path.GetVertex(F2SubTop.S22.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S21.ordinal()).GetY()-_path.GetVertex(F2SubTop.S22.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S22.ordinal()), _path.GetVertex(F2SubTop.S23.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S22.ordinal()).GetY()-_path.GetVertex(F2SubTop.S23.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S22.ordinal()), _path.GetVertex(F2SubTop.Y1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S22.ordinal()).GetX()-_path.GetVertex(F2SubTop.Y1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S23.ordinal()), _path.GetVertex(F2SubTop.e4.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S23.ordinal()).GetY()-_path.GetVertex(F2SubTop.e4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S24.ordinal()), _path.GetVertex(F2SubTop.V1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S24.ordinal()).GetY()-_path.GetVertex(F2SubTop.V1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S25.ordinal()), _path.GetVertex(F2SubTop.S26.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S25.ordinal()).GetY()-_path.GetVertex(F2SubTop.S26.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S26.ordinal()), _path.GetVertex(F2SubTop.S27.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S26.ordinal()).GetY()-_path.GetVertex(F2SubTop.S27.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S28.ordinal()), _path.GetVertex(F2SubTop.S29.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S28.ordinal()).GetX()-_path.GetVertex(F2SubTop.S29.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S29.ordinal()), _path.GetVertex(F2SubTop.S33.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S29.ordinal()).GetX()-_path.GetVertex(F2SubTop.S33.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S30.ordinal()), _path.GetVertex(F2SubTop.M1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S30.ordinal()).GetX()-_path.GetVertex(F2SubTop.M1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S30.ordinal()), _path.GetVertex(F2SubTop.S31.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S30.ordinal()).GetY()-_path.GetVertex(F2SubTop.S31.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S31.ordinal()), _path.GetVertex(F2SubTop.N1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S31.ordinal()).GetX()-_path.GetVertex(F2SubTop.N1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S31.ordinal()), _path.GetVertex(F2SubTop.S32.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S31.ordinal()).GetY()-_path.GetVertex(F2SubTop.S32.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S32.ordinal()), _path.GetVertex(F2SubTop.O1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S32.ordinal()).GetX()-_path.GetVertex(F2SubTop.O1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.SC2.ordinal()), _path.GetVertex(F2SubTop.c1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.SC2.ordinal()).GetY()-_path.GetVertex(F2SubTop.c1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.SC3.ordinal()), _path.GetVertex(F2SubTop.V1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.SC3.ordinal()).GetX()-_path.GetVertex(F2SubTop.V1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.T.ordinal()), _path.GetVertex(F2SubTop.U.ordinal()), Math.abs(_path.GetVertex(F2SubTop.T.ordinal()).GetY()-_path.GetVertex(F2SubTop.U.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.T1.ordinal()), _path.GetVertex(F2SubTop.E15.ordinal()), Math.abs(_path.GetVertex(F2SubTop.T1.ordinal()).GetX()-_path.GetVertex(F2SubTop.E15.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.T1.ordinal()), _path.GetVertex(F2SubTop.w1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.T1.ordinal()).GetY()-_path.GetVertex(F2SubTop.w1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.U.ordinal()), _path.GetVertex(F2SubTop.S20.ordinal()), Math.abs(_path.GetVertex(F2SubTop.U.ordinal()).GetX()-_path.GetVertex(F2SubTop.S20.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.U.ordinal()), _path.GetVertex(F2SubTop.V.ordinal()), Math.abs(_path.GetVertex(F2SubTop.U.ordinal()).GetY()-_path.GetVertex(F2SubTop.V.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.U1.ordinal()), _path.GetVertex(F2SubTop.s1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.U1.ordinal()).GetY()-_path.GetVertex(F2SubTop.s1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.U1.ordinal()), _path.GetVertex(F2SubTop.w1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.U1.ordinal()).GetX()-_path.GetVertex(F2SubTop.w1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.V.ordinal()), _path.GetVertex(F2SubTop.SC1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.V.ordinal()).GetX()-_path.GetVertex(F2SubTop.SC1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.V.ordinal()), _path.GetVertex(F2SubTop.W.ordinal()), Math.abs(_path.GetVertex(F2SubTop.V.ordinal()).GetY()-_path.GetVertex(F2SubTop.W.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.V1.ordinal()), _path.GetVertex(F2SubTop.U1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.V1.ordinal()).GetX()-_path.GetVertex(F2SubTop.U1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.W.ordinal()), _path.GetVertex(F2SubTop.X.ordinal()), Math.abs(_path.GetVertex(F2SubTop.W.ordinal()).GetY()-_path.GetVertex(F2SubTop.X.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.WT12.ordinal()), _path.GetVertex(F2SubTop.e1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.WT12.ordinal()).GetY()-_path.GetVertex(F2SubTop.e1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.WT3.ordinal()), _path.GetVertex(F2SubTop.S18.ordinal()), Math.abs(_path.GetVertex(F2SubTop.WT3.ordinal()).GetX()-_path.GetVertex(F2SubTop.S18.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.WT7.ordinal()), _path.GetVertex(F2SubTop.X.ordinal()), Math.abs(_path.GetVertex(F2SubTop.WT7.ordinal()).GetX()-_path.GetVertex(F2SubTop.X.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.WT9.ordinal()), _path.GetVertex(F2SubTop.W7.ordinal()), Math.abs(_path.GetVertex(F2SubTop.WT9.ordinal()).GetX()-_path.GetVertex(F2SubTop.W7.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.X.ordinal()), _path.GetVertex(F2SubTop.Y.ordinal()), Math.abs(_path.GetVertex(F2SubTop.X.ordinal()).GetY()-_path.GetVertex(F2SubTop.Y.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.X1.ordinal()), _path.GetVertex(F2SubTop.E17.ordinal()), Math.abs(_path.GetVertex(F2SubTop.X1.ordinal()).GetX()-_path.GetVertex(F2SubTop.E17.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.X1.ordinal()), _path.GetVertex(F2SubTop.Y1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.X1.ordinal()).GetY()-_path.GetVertex(F2SubTop.Y1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.X1.ordinal()), _path.GetVertex(F2SubTop.w1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.X1.ordinal()).GetY()-_path.GetVertex(F2SubTop.w1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.Y.ordinal()), _path.GetVertex(F2SubTop.S27.ordinal()), Math.abs(_path.GetVertex(F2SubTop.Y.ordinal()).GetX()-_path.GetVertex(F2SubTop.S27.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.Y.ordinal()), _path.GetVertex(F2SubTop.Z.ordinal()), Math.abs(_path.GetVertex(F2SubTop.Y.ordinal()).GetY()-_path.GetVertex(F2SubTop.Z.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.Y1.ordinal()), _path.GetVertex(F2SubTop.WT4.ordinal()), Math.abs(_path.GetVertex(F2SubTop.Y1.ordinal()).GetX()-_path.GetVertex(F2SubTop.WT4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.Y1.ordinal()), _path.GetVertex(F2SubTop.Z1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.Y1.ordinal()).GetY()-_path.GetVertex(F2SubTop.Z1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.Z.ordinal()), _path.GetVertex(F2SubTop.S26.ordinal()), Math.abs(_path.GetVertex(F2SubTop.Z.ordinal()).GetX()-_path.GetVertex(F2SubTop.S26.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.Z1.ordinal()), _path.GetVertex(F2SubTop.E18.ordinal()), Math.abs(_path.GetVertex(F2SubTop.Z1.ordinal()).GetX()-_path.GetVertex(F2SubTop.E18.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.c1.ordinal()), _path.GetVertex(F2SubTop.d1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.c1.ordinal()).GetX()-_path.GetVertex(F2SubTop.d1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.c4.ordinal()), _path.GetVertex(F2SubTop.E13.ordinal()), Math.abs(_path.GetVertex(F2SubTop.c4.ordinal()).GetX()-_path.GetVertex(F2SubTop.E13.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.d1.ordinal()), _path.GetVertex(F2SubTop.e1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.d1.ordinal()).GetX()-_path.GetVertex(F2SubTop.e1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.e1.ordinal()), _path.GetVertex(F2SubTop.F1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.e1.ordinal()).GetX()-_path.GetVertex(F2SubTop.F1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.e4.ordinal()), _path.GetVertex(F2SubTop.Z1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.e4.ordinal()).GetX()-_path.GetVertex(F2SubTop.Z1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.q1.ordinal()), _path.GetVertex(F2SubTop.R1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.q1.ordinal()).GetX()-_path.GetVertex(F2SubTop.R1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.q1.ordinal()), _path.GetVertex(F2SubTop.s1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.q1.ordinal()).GetY()-_path.GetVertex(F2SubTop.s1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.s1.ordinal()), _path.GetVertex(F2SubTop.T1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.s1.ordinal()).GetX()-_path.GetVertex(F2SubTop.T1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.w1.ordinal()), _path.GetVertex(F2SubTop.E16.ordinal()), Math.abs(_path.GetVertex(F2SubTop.w1.ordinal()).GetX()-_path.GetVertex(F2SubTop.E16.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.WT4.ordinal()), _path.GetVertex(F2SubTop.Z1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.WT4.ordinal()).GetY()-_path.GetVertex(F2SubTop.Z1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.L1.ordinal()), _path.GetVertex(F2SubTop.ES8.ordinal()), Math.abs(_path.GetVertex(F2SubTop.L1.ordinal()).GetY()-_path.GetVertex(F2SubTop.ES8.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.B1.ordinal()), _path.GetVertex(F2SubTop.ES7.ordinal()), Math.abs(_path.GetVertex(F2SubTop.B1.ordinal()).GetY()-_path.GetVertex(F2SubTop.ES7.ordinal()).GetY()));

        //extend edges added
        _path.AddRoute(_path.GetVertex(F2SubTop.ET1.ordinal()), _path.GetVertex(F2SubTop.X.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ET1.ordinal()).GetX()-_path.GetVertex(F2SubTop.X.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ET1.ordinal()), _path.GetVertex(F2SubTop.ET6.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ET1.ordinal()).GetY()-_path.GetVertex(F2SubTop.ET6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ET6.ordinal()), _path.GetVertex(F2SubTop.W.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ET6.ordinal()).GetX()-_path.GetVertex(F2SubTop.W.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ET6.ordinal()), _path.GetVertex(F2SubTop.ET2.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ET6.ordinal()).GetY()-_path.GetVertex(F2SubTop.ET2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ET2.ordinal()), _path.GetVertex(F2SubTop.V.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ET2.ordinal()).GetX()-_path.GetVertex(F2SubTop.V.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ET2.ordinal()), _path.GetVertex(F2SubTop.SC1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ET2.ordinal()).GetX()-_path.GetVertex(F2SubTop.SC1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ET2.ordinal()), _path.GetVertex(F2SubTop.S20.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ET2.ordinal()).GetY() - _path.GetVertex(F2SubTop.S20.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ET5.ordinal()), _path.GetVertex(F2SubTop.S29.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ET5.ordinal()).GetX()-_path.GetVertex(F2SubTop.S29.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ET5.ordinal()), _path.GetVertex(F2SubTop.c1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ET5.ordinal()).GetY()-_path.GetVertex(F2SubTop.c1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ET5.ordinal()), _path.GetVertex(F2SubTop.S33.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ET5.ordinal()).GetX()-_path.GetVertex(F2SubTop.S33.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ET5.ordinal()), _path.GetVertex(F2SubTop.SC2.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ET5.ordinal()).GetY()-_path.GetVertex(F2SubTop.SC2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ET4.ordinal()), _path.GetVertex(F2SubTop.V1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ET4.ordinal()).GetY() - _path.GetVertex(F2SubTop.V1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ET4.ordinal()), _path.GetVertex(F2SubTop.s1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ET4.ordinal()).GetX()-_path.GetVertex(F2SubTop.s1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ET4.ordinal()), _path.GetVertex(F2SubTop.ET3.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ET4.ordinal()).GetY()-_path.GetVertex(F2SubTop.ET3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F2SubTop.ET3.ordinal()), _path.GetVertex(F2SubTop.q1.ordinal()), Math.abs(_path.GetVertex(F2SubTop.ET3.ordinal()).GetX() - _path.GetVertex(F2SubTop.q1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F2SubTop.S24.ordinal()), _path.GetVertex(F2SubTop.ET7.ordinal()), Math.abs(_path.GetVertex(F2SubTop.S24.ordinal()).GetX()-_path.GetVertex(F2SubTop.ET7.ordinal()).GetX()));

    }

    public int GetStartOrder(){

        return F2SubTop.start_position.ordinal();
    }
    public int GetEndOrder(){

        return F2SubTop.end_position.ordinal();
    }

    public int GetStartAux1Order(){
        return F2SubTop.start_auxiliary_pos.ordinal();
    }
    public int GetStartAux2Order(){
        return F2SubTop.start_auxiliary_pos2.ordinal();
    }
    public int GetStartAux3Order(){
        return F2SubTop.start_auxiliary_pos3.ordinal();
    }
    public int GetStartAux4Order(){
        return F2SubTop.start_auxiliary_pos4.ordinal();
    }
    public int GetEndAux1Order(){
        return F2SubTop.end_auxiliary_pos.ordinal();
    }
    public int GetEndAux2Order(){
        return F2SubTop.end_auxiliary_pos2.ordinal();
    }
    public int GetEndAux3Order(){
        return F2SubTop.end_auxiliary_pos3.ordinal();
    }
    public int GetEndAux4Order(){
        return F2SubTop.end_auxiliary_pos4.ordinal();
    }
}