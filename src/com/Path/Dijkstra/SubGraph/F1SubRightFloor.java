package com.Path.Dijkstra.SubGraph;
import com.Path.DefinedVertex.F1SubRight;
import com.Path.DefinedVertex.SubNumber;

/**
 * Created by toy on 4/11/15.
 */


public class F1SubRightFloor extends Floor{
    //ArrayList<Vertex> B1_vertex= new ArrayList();
    public F1SubRightFloor(int stair) {
        super(stair);
        _sub_no = SubNumber.F1SubRight;
    }

    public void InitializeVertex() {

       //basic points added
        _path.AddVertex(F1SubRight.S24.ordinal(), new Vertex("S24" , 0.8167, 0.3998, _stair));
        _path.AddVertex(F1SubRight.S21.ordinal(), new Vertex("S21" , 0.8860, 0.3632, _stair));
        _path.AddVertex(F1SubRight.S22.ordinal(), new Vertex("S22" , 0.8860, 0.3267, _stair));
        _path.AddVertex(F1SubRight.S23.ordinal(), new Vertex("S23" , 0.8860, 0.2882, _stair));
        _path.AddVertex(F1SubRight.W4.ordinal(), new Vertex("W4" , 0.9302, 0.1939, _stair));
        _path.AddVertex(F1SubRight.E18.ordinal(), new Vertex("E18" , 0.9630, 0.2632, _stair));
        _path.AddVertex(F1SubRight.WT4.ordinal(), new Vertex("WT4" , 0.9514, 0.3190, _stair));
        _path.AddVertex(F1SubRight.E17.ordinal(), new Vertex("E17" , 0.9630, 0.3825, _stair));
        _path.AddVertex(F1SubRight.E16.ordinal(), new Vertex("E16" , 0.9630, 0.5018, _stair));
        _path.AddVertex(F1SubRight.E15.ordinal(), new Vertex("E15" , 0.9630, 0.6211, _stair));
        _path.AddVertex(F1SubRight.WT8.ordinal(), new Vertex("WT8" , 0.9514, 0.6808, _stair));
        _path.AddVertex(F1SubRight.E14.ordinal(), new Vertex("E14" , 0.9630, 0.7404, _stair));
        _path.AddVertex(F1SubRight.E13.ordinal(), new Vertex("E13" , 0.9630, 0.8636, _stair));
        _path.AddVertex(F1SubRight.WT10.ordinal(), new Vertex("WT10" , 0.9514, 0.9329, _stair));
        _path.AddVertex(F1SubRight.W8.ordinal(), new Vertex("W8" , 0.9283, 0.9329, _stair));
        _path.AddVertex(F1SubRight.ES8.ordinal(), new Vertex("ES8" , 0.8764, 0.9155, _stair));
        _path.AddVertex(F1SubRight.EL8.ordinal(), new Vertex("EL8" , 0.8552, 0.9502, _stair));
        _path.AddVertex(F1SubRight.E12.ordinal(), new Vertex("E12" , 0.7975, 0.9713, _stair));
        _path.AddVertex(F1SubRight.E11.ordinal(), new Vertex("E11" , 0.6782, 0.9713, _stair));
        _path.AddVertex(F1SubRight.WT12.ordinal(), new Vertex("WT12" , 0.6166, 0.9502, _stair));
        _path.AddVertex(F1SubRight.E10.ordinal(), new Vertex("E10" , 0.5625, 0.9713, _stair));
        _path.AddVertex(F1SubRight.S34.ordinal(), new Vertex("S34" , 0.5492, 0.8212, _stair));
        _path.AddVertex(F1SubRight.S35.ordinal(), new Vertex("S35" , 0.5492, 0.7808, _stair));
        _path.AddVertex(F1SubRight.S36.ordinal(), new Vertex("S36" , 0.5492, 0.7404, _stair));
        _path.AddVertex(F1SubRight.S37.ordinal(), new Vertex("S37" , 0.7436, 0.8212, _stair));
        _path.AddVertex(F1SubRight.S38.ordinal(), new Vertex("S38" , 0.7436, 0.7808, _stair));
        _path.AddVertex(F1SubRight.S39.ordinal(), new Vertex("S39" , 0.7436, 0.7404, _stair));
        _path.AddVertex(F1SubRight.S40.ordinal(), new Vertex("S40" , 0.8436, 0.8212, _stair));
        _path.AddVertex(F1SubRight.S41.ordinal(), new Vertex("S41" , 0.8436, 0.7808, _stair));
        _path.AddVertex(F1SubRight.S42.ordinal(), new Vertex("S42" , 0.8436, 0.7404, _stair));
        _path.AddVertex(F1SubRight.B4.ordinal(), new Vertex("B4" , 0.5473, 0.6288, _stair));
        _path.AddVertex(F1SubRight.B5.ordinal(), new Vertex("B5" , 0.6666, 0.5711, _stair));
        _path.AddVertex(F1SubRight.B6.ordinal(), new Vertex("B6" , 0.7878, 0.5711, _stair));
        _path.AddVertex(F1SubRight.ES6.ordinal(), new Vertex("ES6" , 0.6666, 0.6942, _stair));
        _path.AddVertex(F1SubRight.EL6.ordinal(), new Vertex("EL6" , 0.6878, 0.6750, _stair));
        _path.AddVertex(F1SubRight.M1.ordinal(), new Vertex("M1" , 0.4992, 0.4210, _stair));
        _path.AddVertex(F1SubRight.L1.ordinal(), new Vertex("L1" , 0.4992, 0.6288, _stair));
        _path.AddVertex(F1SubRight.K1.ordinal(), new Vertex("K1" , 0.4992, 0.6942, _stair));
        _path.AddVertex(F1SubRight.I.ordinal(), new Vertex("I" , 0.4992, 0.9155, _stair));
        _path.AddVertex(F1SubRight.U2.ordinal(), new Vertex("U2" , 0.5625, 0.9155, _stair));
        _path.AddVertex(F1SubRight.T2.ordinal(), new Vertex("T2" , 0.6166, 0.9155, _stair));
        _path.AddVertex(F1SubRight.P2.ordinal(), new Vertex("P2" , 0.6666, 0.9155, _stair));
        _path.AddVertex(F1SubRight.O2.ordinal(), new Vertex("O2" , 0.6782, 0.9155, _stair));
        _path.AddVertex(F1SubRight.N2.ordinal(), new Vertex("N2" , 0.7975, 0.9155, _stair));
        _path.AddVertex(F1SubRight.M2.ordinal(), new Vertex("M2" , 0.8552, 0.9155, _stair));
        _path.AddVertex(F1SubRight.L2.ordinal(), new Vertex("L2" , 0.9283, 0.9155, _stair));
        _path.AddVertex(F1SubRight.K2.ordinal(), new Vertex("K2" , 0.9514, 0.9155, _stair));
        _path.AddVertex(F1SubRight.J2.ordinal(), new Vertex("J2" , 0.9283, 0.8636, _stair));
        _path.AddVertex(F1SubRight.I2.ordinal(), new Vertex("I2" , 0.9283, 0.8212, _stair));
        _path.AddVertex(F1SubRight.H2.ordinal(), new Vertex("H2" , 0.9283, 0.7808, _stair));
        _path.AddVertex(F1SubRight.G2.ordinal(), new Vertex("G2" , 0.9283, 0.7404, _stair));
        _path.AddVertex(F1SubRight.F2.ordinal(), new Vertex("F2" , 0.9283, 0.6808, _stair));
        _path.AddVertex(F1SubRight.b2.ordinal(), new Vertex("b2" , 0.9283, 0.6211, _stair));
        _path.AddVertex(F1SubRight.A2.ordinal(), new Vertex("A2" , 0.9283, 0.6019, _stair));
        _path.AddVertex(F1SubRight.Z1.ordinal(), new Vertex("Z1" , 0.9283, 0.5018, _stair));
        _path.AddVertex(F1SubRight.T1.ordinal(), new Vertex("T1" , 0.9283, 0.4210, _stair));
        _path.AddVertex(F1SubRight.U1.ordinal(), new Vertex("U1" , 0.9283, 0.3825, _stair));
        _path.AddVertex(F1SubRight.V1.ordinal(), new Vertex("V1" , 0.9283, 0.3632, _stair));
        _path.AddVertex(F1SubRight.w1.ordinal(), new Vertex("w1" , 0.9283, 0.3267, _stair));
        _path.AddVertex(F1SubRight.X1.ordinal(), new Vertex("X1" , 0.9283, 0.2882, _stair));
        _path.AddVertex(F1SubRight.Y1.ordinal(), new Vertex("Y1" , 0.9283, 0.2632, _stair));
        _path.AddVertex(F1SubRight.s1.ordinal(), new Vertex("s1" , 0.8436, 0.4210, _stair));
        _path.AddVertex(F1SubRight.R1.ordinal(), new Vertex("R1" , 0.7423, 0.4210, _stair));
        _path.AddVertex(F1SubRight.q1.ordinal(), new Vertex("q1" , 0.5973, 0.4210, _stair));
        _path.AddVertex(F1SubRight.C2.ordinal(), new Vertex("C2" , 0.8436, 0.6019, _stair));
        _path.AddVertex(F1SubRight.d2.ordinal(), new Vertex("d2" , 0.7878, 0.6019, _stair));
        _path.AddVertex(F1SubRight.e2.ordinal(), new Vertex("e2" , 0.7423, 0.6019, _stair));
        _path.AddVertex(F1SubRight.J4.ordinal(), new Vertex("J4" , 0.6666, 0.6019, _stair));
        _path.AddVertex(F1SubRight.I4.ordinal(), new Vertex("I4" , 0.5973, 0.6019, _stair));
        _path.AddVertex(F1SubRight.P1.ordinal(), new Vertex("P1" , 0.5973, 0.6288, _stair));
        _path.AddVertex(F1SubRight.O1.ordinal(), new Vertex("O1" , 0.5973, 0.6942, _stair));
        _path.AddVertex(F1SubRight.N1.ordinal(), new Vertex("N1" , 0.5473, 0.6942, _stair));
        _path.AddVertex(F1SubRight.K4.ordinal(), new Vertex("K4" , 0.6878, 0.6942, _stair));
        _path.AddVertex(F1SubRight.q2.ordinal(), new Vertex("q2" , 0.6666, 0.8212, _stair));
        _path.AddVertex(F1SubRight.R2.ordinal(), new Vertex("R2" , 0.6666, 0.7808, _stair));
        _path.AddVertex(F1SubRight.s2.ordinal(), new Vertex("s2" , 0.6666, 0.7404, _stair));
        _path.AddVertex(F1SubRight.Z3.ordinal(), new Vertex("Z3" , 0.4992,0.3806 , _stair));




        //necessary points added

        _path.AddVertex(F1SubRight.start_position.ordinal(), new Vertex("Start", 0, 0, _stair));
        _path.AddVertex(F1SubRight.end_position.ordinal(), new Vertex("End", 0, 0, _stair));
        _path.AddVertex(F1SubRight.start_auxiliary_pos.ordinal(), new Vertex("Start_aux", 0, 0, _stair));
        _path.AddVertex(F1SubRight.end_auxiliary_pos.ordinal(), new Vertex("End_aux", 0, 0, _stair));
        _path.AddVertex(F1SubRight.start_auxiliary_pos2.ordinal(), new Vertex("Start_aux2", 0, 0, _stair));
        _path.AddVertex(F1SubRight.end_auxiliary_pos2.ordinal(), new Vertex("End_aux2", 0, 0, _stair));
        _path.AddVertex(F1SubRight.start_auxiliary_pos3.ordinal(), new Vertex("Start_aux3", 0, 0, _stair));
        _path.AddVertex(F1SubRight.end_auxiliary_pos3.ordinal(), new Vertex("End_aux3", 0, 0, _stair));
        _path.AddVertex(F1SubRight.start_auxiliary_pos4.ordinal(), new Vertex("Start_aux4", 0, 0, _stair));
        _path.AddVertex(F1SubRight.end_auxiliary_pos4.ordinal(), new Vertex("End_aux4", 0, 0, _stair));

        //extend points added
        _path.AddVertex(F1SubRight.ER1.ordinal(), new Vertex ("ER1", 0.8860,0.4210, _stair));
        _path.AddVertex(F1SubRight.ER2.ordinal(), new Vertex ("ER2", 0.5973, 0.5018, _stair));
        _path.AddVertex(F1SubRight.EBP1.ordinal(), new Vertex ("EBP1", 0.4992, 0.5018, _stair));
        _path.AddVertex(F1SubRight.ER3.ordinal(), new Vertex("ER3", 0.8436, 0.6942, _stair) );
        _path.AddVertex(F1SubRight.ER4.ordinal(), new Vertex ("ER4", 0.7878, 0.6942, _stair));
        _path.AddVertex(F1SubRight.ER5.ordinal(), new Vertex ("ER5", 0.7436, 0.6942, _stair));
        _path.AddVertex(F1SubRight.ER6.ordinal(), new Vertex ("ER6", 0.7423, 0.6942, _stair));
        _path.AddVertex(F1SubRight.ER7.ordinal(), new Vertex("ER7", 0.8436, 0.9155, _stair) );
        _path.AddVertex(F1SubRight.ER8.ordinal(), new Vertex("ER8", 0.7436, 0.9155, _stair) );
        _path.AddVertex(F1SubRight.ER9.ordinal(), new Vertex("ER9", 0.6666, 0.8636, _stair) );
        _path.AddVertex(F1SubRight.ER10.ordinal(), new Vertex("ER10",0.5492, 0.8636, _stair) );
        _path.AddVertex(F1SubRight.ER11.ordinal(), new Vertex ("ER11", 0.5492, 0.9155, _stair));
        _path.AddVertex(F1SubRight.EBP2.ordinal(), new Vertex ("EBP2",0.4492, 0.8636, _stair));
        _path.AddVertex(F1SubRight.ER12.ordinal(), new Vertex("ER12",0.9283,0.6942, _stair) );






    }

    public void InitializeEdge() {

       //basic edges added

        _path.AddRoute(_path.GetVertex(F1SubRight.A2.ordinal()), _path.GetVertex(F1SubRight.Z1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.A2.ordinal()).GetY()-_path.GetVertex(F1SubRight.Z1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.A2.ordinal()), _path.GetVertex(F1SubRight.b2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.A2.ordinal()).GetY()-_path.GetVertex(F1SubRight.b2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.B4.ordinal()), _path.GetVertex(F1SubRight.N1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.B4.ordinal()).GetY()-_path.GetVertex(F1SubRight.N1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.B4.ordinal()), _path.GetVertex(F1SubRight.P1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.B4.ordinal()).GetX()-_path.GetVertex(F1SubRight.P1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.B5.ordinal()), _path.GetVertex(F1SubRight.B6.ordinal()), Math.abs(_path.GetVertex(F1SubRight.B5.ordinal()).GetX()-_path.GetVertex(F1SubRight.B6.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.B5.ordinal()), _path.GetVertex(F1SubRight.J4.ordinal()), Math.abs(_path.GetVertex(F1SubRight.B5.ordinal()).GetY()-_path.GetVertex(F1SubRight.J4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.B6.ordinal()), _path.GetVertex(F1SubRight.d2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.B6.ordinal()).GetY()-_path.GetVertex(F1SubRight.d2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.C2.ordinal()), _path.GetVertex(F1SubRight.A2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.C2.ordinal()).GetX()-_path.GetVertex(F1SubRight.A2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.C2.ordinal()), _path.GetVertex(F1SubRight.M2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.C2.ordinal()).GetY()-_path.GetVertex(F1SubRight.M2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.C2.ordinal()), _path.GetVertex(F1SubRight.s1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.C2.ordinal()).GetY()-_path.GetVertex(F1SubRight.s1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.E10.ordinal()), _path.GetVertex(F1SubRight.U2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.E10.ordinal()).GetY()-_path.GetVertex(F1SubRight.U2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.E11.ordinal()), _path.GetVertex(F1SubRight.E12.ordinal()), Math.abs(_path.GetVertex(F1SubRight.E11.ordinal()).GetX()-_path.GetVertex(F1SubRight.E12.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.E11.ordinal()), _path.GetVertex(F1SubRight.O2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.E11.ordinal()).GetY()-_path.GetVertex(F1SubRight.O2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.E12.ordinal()), _path.GetVertex(F1SubRight.N2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.E12.ordinal()).GetY()-_path.GetVertex(F1SubRight.N2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.E13.ordinal()), _path.GetVertex(F1SubRight.E14.ordinal()), Math.abs(_path.GetVertex(F1SubRight.E13.ordinal()).GetY()-_path.GetVertex(F1SubRight.E14.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.E14.ordinal()), _path.GetVertex(F1SubRight.E13.ordinal()), Math.abs(_path.GetVertex(F1SubRight.E14.ordinal()).GetY()-_path.GetVertex(F1SubRight.E13.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.E15.ordinal()), _path.GetVertex(F1SubRight.E16.ordinal()), Math.abs(_path.GetVertex(F1SubRight.E15.ordinal()).GetY()-_path.GetVertex(F1SubRight.E16.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.E16.ordinal()), _path.GetVertex(F1SubRight.E15.ordinal()), Math.abs(_path.GetVertex(F1SubRight.E16.ordinal()).GetY()-_path.GetVertex(F1SubRight.E15.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.E16.ordinal()), _path.GetVertex(F1SubRight.E17.ordinal()), Math.abs(_path.GetVertex(F1SubRight.E16.ordinal()).GetY()-_path.GetVertex(F1SubRight.E17.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.E17.ordinal()), _path.GetVertex(F1SubRight.E16.ordinal()), Math.abs(_path.GetVertex(F1SubRight.E17.ordinal()).GetY()-_path.GetVertex(F1SubRight.E16.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.E18.ordinal()), _path.GetVertex(F1SubRight.E17.ordinal()), Math.abs(_path.GetVertex(F1SubRight.E18.ordinal()).GetY()-_path.GetVertex(F1SubRight.E17.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.EL6.ordinal()), _path.GetVertex(F1SubRight.K4.ordinal()), Math.abs(_path.GetVertex(F1SubRight.EL6.ordinal()).GetY()-_path.GetVertex(F1SubRight.K4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.EL8.ordinal()), _path.GetVertex(F1SubRight.M2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.EL8.ordinal()).GetY()-_path.GetVertex(F1SubRight.M2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ES6.ordinal()), _path.GetVertex(F1SubRight.K4.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ES6.ordinal()).GetX()-_path.GetVertex(F1SubRight.K4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ES6.ordinal()), _path.GetVertex(F1SubRight.s2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ES6.ordinal()).GetY()-_path.GetVertex(F1SubRight.s2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ES8.ordinal()), _path.GetVertex(F1SubRight.L2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ES8.ordinal()).GetX()-_path.GetVertex(F1SubRight.L2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.F2.ordinal()), _path.GetVertex(F1SubRight.G2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.F2.ordinal()).GetY()-_path.GetVertex(F1SubRight.G2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.F2.ordinal()), _path.GetVertex(F1SubRight.WT8.ordinal()), Math.abs(_path.GetVertex(F1SubRight.F2.ordinal()).GetX()-_path.GetVertex(F1SubRight.WT8.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.F2.ordinal()), _path.GetVertex(F1SubRight.b2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.F2.ordinal()).GetY()-_path.GetVertex(F1SubRight.b2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.G2.ordinal()), _path.GetVertex(F1SubRight.E14.ordinal()), Math.abs(_path.GetVertex(F1SubRight.G2.ordinal()).GetX()-_path.GetVertex(F1SubRight.E14.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.G2.ordinal()), _path.GetVertex(F1SubRight.F2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.G2.ordinal()).GetY()-_path.GetVertex(F1SubRight.F2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.G2.ordinal()), _path.GetVertex(F1SubRight.H2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.G2.ordinal()).GetY()-_path.GetVertex(F1SubRight.H2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.H2.ordinal()), _path.GetVertex(F1SubRight.G2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.H2.ordinal()).GetY()-_path.GetVertex(F1SubRight.G2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.H2.ordinal()), _path.GetVertex(F1SubRight.I2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.H2.ordinal()).GetY()-_path.GetVertex(F1SubRight.I2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.I.ordinal()), _path.GetVertex(F1SubRight.U2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.I.ordinal()).GetX()-_path.GetVertex(F1SubRight.U2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.I2.ordinal()), _path.GetVertex(F1SubRight.H2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.I2.ordinal()).GetY()-_path.GetVertex(F1SubRight.H2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.I2.ordinal()), _path.GetVertex(F1SubRight.J2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.I2.ordinal()).GetY()-_path.GetVertex(F1SubRight.J2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.I4.ordinal()), _path.GetVertex(F1SubRight.J4.ordinal()), Math.abs(_path.GetVertex(F1SubRight.I4.ordinal()).GetX()-_path.GetVertex(F1SubRight.J4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.I4.ordinal()), _path.GetVertex(F1SubRight.P1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.I4.ordinal()).GetY()-_path.GetVertex(F1SubRight.P1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.I4.ordinal()), _path.GetVertex(F1SubRight.q1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.I4.ordinal()).GetY()-_path.GetVertex(F1SubRight.q1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.J2.ordinal()), _path.GetVertex(F1SubRight.E13.ordinal()), Math.abs(_path.GetVertex(F1SubRight.J2.ordinal()).GetX()-_path.GetVertex(F1SubRight.E13.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.J2.ordinal()), _path.GetVertex(F1SubRight.I2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.J2.ordinal()).GetY()-_path.GetVertex(F1SubRight.I2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.J2.ordinal()), _path.GetVertex(F1SubRight.L2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.J2.ordinal()).GetY()-_path.GetVertex(F1SubRight.L2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.J4.ordinal()), _path.GetVertex(F1SubRight.B5.ordinal()), Math.abs(_path.GetVertex(F1SubRight.J4.ordinal()).GetY()-_path.GetVertex(F1SubRight.B5.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.J4.ordinal()), _path.GetVertex(F1SubRight.e2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.J4.ordinal()).GetX()-_path.GetVertex(F1SubRight.e2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.K1.ordinal()), _path.GetVertex(F1SubRight.L1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.K1.ordinal()).GetY()-_path.GetVertex(F1SubRight.L1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.K1.ordinal()), _path.GetVertex(F1SubRight.N1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.K1.ordinal()).GetX()-_path.GetVertex(F1SubRight.N1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.K2.ordinal()), _path.GetVertex(F1SubRight.WT10.ordinal()), Math.abs(_path.GetVertex(F1SubRight.K2.ordinal()).GetY()-_path.GetVertex(F1SubRight.WT10.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.K2.ordinal()), _path.GetVertex(F1SubRight.WT8.ordinal()), Math.abs(_path.GetVertex(F1SubRight.K2.ordinal()).GetY()-_path.GetVertex(F1SubRight.WT8.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.K4.ordinal()), _path.GetVertex(F1SubRight.EL6.ordinal()), Math.abs(_path.GetVertex(F1SubRight.K4.ordinal()).GetY()-_path.GetVertex(F1SubRight.EL6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.L1.ordinal()), _path.GetVertex(F1SubRight.B4.ordinal()), Math.abs(_path.GetVertex(F1SubRight.L1.ordinal()).GetX()-_path.GetVertex(F1SubRight.B4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.L1.ordinal()), _path.GetVertex(F1SubRight.K1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.L1.ordinal()).GetY()-_path.GetVertex(F1SubRight.K1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.L1.ordinal()), _path.GetVertex(F1SubRight.M1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.L1.ordinal()).GetY()-_path.GetVertex(F1SubRight.M1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.L2.ordinal()), _path.GetVertex(F1SubRight.J2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.L2.ordinal()).GetY()-_path.GetVertex(F1SubRight.J2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.L2.ordinal()), _path.GetVertex(F1SubRight.K2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.L2.ordinal()).GetX()-_path.GetVertex(F1SubRight.K2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.L2.ordinal()), _path.GetVertex(F1SubRight.W8.ordinal()), Math.abs(_path.GetVertex(F1SubRight.L2.ordinal()).GetY()-_path.GetVertex(F1SubRight.W8.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.M1.ordinal()), _path.GetVertex(F1SubRight.L1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.M1.ordinal()).GetY()-_path.GetVertex(F1SubRight.L1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.M1.ordinal()), _path.GetVertex(F1SubRight.q1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.M1.ordinal()).GetX()-_path.GetVertex(F1SubRight.q1.ordinal()).GetX()));

        _path.AddRoute(_path.GetVertex(F1SubRight.M2.ordinal()), _path.GetVertex(F1SubRight.C2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.M2.ordinal()).GetY()-_path.GetVertex(F1SubRight.C2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.M2.ordinal()), _path.GetVertex(F1SubRight.EL8.ordinal()), Math.abs(_path.GetVertex(F1SubRight.M2.ordinal()).GetY()-_path.GetVertex(F1SubRight.EL8.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.M2.ordinal()), _path.GetVertex(F1SubRight.ES8.ordinal()), Math.abs(_path.GetVertex(F1SubRight.M2.ordinal()).GetX()-_path.GetVertex(F1SubRight.ES8.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.N1.ordinal()), _path.GetVertex(F1SubRight.B4.ordinal()), Math.abs(_path.GetVertex(F1SubRight.N1.ordinal()).GetY()-_path.GetVertex(F1SubRight.B4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.N1.ordinal()), _path.GetVertex(F1SubRight.O1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.N1.ordinal()).GetX()-_path.GetVertex(F1SubRight.O1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.N2.ordinal()), _path.GetVertex(F1SubRight.E12.ordinal()), Math.abs(_path.GetVertex(F1SubRight.N2.ordinal()).GetY()-_path.GetVertex(F1SubRight.E12.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.N2.ordinal()), _path.GetVertex(F1SubRight.M2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.N2.ordinal()).GetX()-_path.GetVertex(F1SubRight.M2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.O1.ordinal()), _path.GetVertex(F1SubRight.ES6.ordinal()), Math.abs(_path.GetVertex(F1SubRight.O1.ordinal()).GetX()-_path.GetVertex(F1SubRight.ES6.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.O1.ordinal()), _path.GetVertex(F1SubRight.P1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.O1.ordinal()).GetY()-_path.GetVertex(F1SubRight.P1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.O2.ordinal()), _path.GetVertex(F1SubRight.E11.ordinal()), Math.abs(_path.GetVertex(F1SubRight.O2.ordinal()).GetY()-_path.GetVertex(F1SubRight.E11.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.O2.ordinal()), _path.GetVertex(F1SubRight.N2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.O2.ordinal()).GetX()-_path.GetVertex(F1SubRight.N2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.P1.ordinal()), _path.GetVertex(F1SubRight.I4.ordinal()), Math.abs(_path.GetVertex(F1SubRight.P1.ordinal()).GetY()-_path.GetVertex(F1SubRight.I4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.P1.ordinal()), _path.GetVertex(F1SubRight.O1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.P1.ordinal()).GetY()-_path.GetVertex(F1SubRight.O1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.P2.ordinal()), _path.GetVertex(F1SubRight.O2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.P2.ordinal()).GetX()-_path.GetVertex(F1SubRight.O2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.P2.ordinal()), _path.GetVertex(F1SubRight.q2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.P2.ordinal()).GetY()-_path.GetVertex(F1SubRight.q2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.R1.ordinal()), _path.GetVertex(F1SubRight.e2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.R1.ordinal()).GetY()-_path.GetVertex(F1SubRight.e2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.R1.ordinal()), _path.GetVertex(F1SubRight.s1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.R1.ordinal()).GetX()-_path.GetVertex(F1SubRight.s1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.R2.ordinal()), _path.GetVertex(F1SubRight.S38.ordinal()), Math.abs(_path.GetVertex(F1SubRight.R2.ordinal()).GetX()-_path.GetVertex(F1SubRight.S38.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.R2.ordinal()), _path.GetVertex(F1SubRight.q2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.R2.ordinal()).GetY()-_path.GetVertex(F1SubRight.q2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.R2.ordinal()), _path.GetVertex(F1SubRight.s2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.R2.ordinal()).GetY()-_path.GetVertex(F1SubRight.s2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S21.ordinal()), _path.GetVertex(F1SubRight.S22.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S21.ordinal()).GetY()-_path.GetVertex(F1SubRight.S22.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S21.ordinal()), _path.GetVertex(F1SubRight.V1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S21.ordinal()).GetX()-_path.GetVertex(F1SubRight.V1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S22.ordinal()), _path.GetVertex(F1SubRight.S21.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S22.ordinal()).GetY()-_path.GetVertex(F1SubRight.S21.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S22.ordinal()), _path.GetVertex(F1SubRight.S23.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S22.ordinal()).GetY()-_path.GetVertex(F1SubRight.S23.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S22.ordinal()), _path.GetVertex(F1SubRight.w1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S22.ordinal()).GetX()-_path.GetVertex(F1SubRight.w1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S23.ordinal()), _path.GetVertex(F1SubRight.S22.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S23.ordinal()).GetY()-_path.GetVertex(F1SubRight.S22.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S23.ordinal()), _path.GetVertex(F1SubRight.X1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S23.ordinal()).GetX()-_path.GetVertex(F1SubRight.X1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S34.ordinal()), _path.GetVertex(F1SubRight.S35.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S34.ordinal()).GetY()-_path.GetVertex(F1SubRight.S35.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S34.ordinal()), _path.GetVertex(F1SubRight.q2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S34.ordinal()).GetX()-_path.GetVertex(F1SubRight.q2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S35.ordinal()), _path.GetVertex(F1SubRight.R2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S35.ordinal()).GetX()-_path.GetVertex(F1SubRight.R2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S35.ordinal()), _path.GetVertex(F1SubRight.S34.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S35.ordinal()).GetY()-_path.GetVertex(F1SubRight.S34.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S35.ordinal()), _path.GetVertex(F1SubRight.S36.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S35.ordinal()).GetY()-_path.GetVertex(F1SubRight.S36.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S36.ordinal()), _path.GetVertex(F1SubRight.S35.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S36.ordinal()).GetY()-_path.GetVertex(F1SubRight.S35.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S36.ordinal()), _path.GetVertex(F1SubRight.s2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S36.ordinal()).GetX()-_path.GetVertex(F1SubRight.s2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S37.ordinal()), _path.GetVertex(F1SubRight.S38.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S37.ordinal()).GetY()-_path.GetVertex(F1SubRight.S38.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S38.ordinal()), _path.GetVertex(F1SubRight.S37.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S38.ordinal()).GetY()-_path.GetVertex(F1SubRight.S37.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S38.ordinal()), _path.GetVertex(F1SubRight.S39.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S38.ordinal()).GetY()-_path.GetVertex(F1SubRight.S39.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S39.ordinal()), _path.GetVertex(F1SubRight.S38.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S39.ordinal()).GetY()-_path.GetVertex(F1SubRight.S38.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S40.ordinal()), _path.GetVertex(F1SubRight.I2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S40.ordinal()).GetX()-_path.GetVertex(F1SubRight.I2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S40.ordinal()), _path.GetVertex(F1SubRight.S41.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S40.ordinal()).GetY()-_path.GetVertex(F1SubRight.S41.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S41.ordinal()), _path.GetVertex(F1SubRight.H2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S41.ordinal()).GetX()-_path.GetVertex(F1SubRight.H2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S41.ordinal()), _path.GetVertex(F1SubRight.S40.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S41.ordinal()).GetY()-_path.GetVertex(F1SubRight.S40.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S41.ordinal()), _path.GetVertex(F1SubRight.S42.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S41.ordinal()).GetY()-_path.GetVertex(F1SubRight.S42.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S42.ordinal()), _path.GetVertex(F1SubRight.G2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S42.ordinal()).GetX()-_path.GetVertex(F1SubRight.G2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.S42.ordinal()), _path.GetVertex(F1SubRight.S41.ordinal()), Math.abs(_path.GetVertex(F1SubRight.S42.ordinal()).GetY()-_path.GetVertex(F1SubRight.S41.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.T1.ordinal()), _path.GetVertex(F1SubRight.U1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.T1.ordinal()).GetY()-_path.GetVertex(F1SubRight.U1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.T1.ordinal()), _path.GetVertex(F1SubRight.Z1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.T1.ordinal()).GetY()-_path.GetVertex(F1SubRight.Z1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.T2.ordinal()), _path.GetVertex(F1SubRight.P2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.T2.ordinal()).GetX()-_path.GetVertex(F1SubRight.P2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.T2.ordinal()), _path.GetVertex(F1SubRight.WT12.ordinal()), Math.abs(_path.GetVertex(F1SubRight.T2.ordinal()).GetY()-_path.GetVertex(F1SubRight.WT12.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.U1.ordinal()), _path.GetVertex(F1SubRight.E17.ordinal()), Math.abs(_path.GetVertex(F1SubRight.U1.ordinal()).GetX()-_path.GetVertex(F1SubRight.E17.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.U1.ordinal()), _path.GetVertex(F1SubRight.T1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.U1.ordinal()).GetY()-_path.GetVertex(F1SubRight.T1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.U1.ordinal()), _path.GetVertex(F1SubRight.V1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.U1.ordinal()).GetY()-_path.GetVertex(F1SubRight.V1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.U2.ordinal()), _path.GetVertex(F1SubRight.E10.ordinal()), Math.abs(_path.GetVertex(F1SubRight.U2.ordinal()).GetY()-_path.GetVertex(F1SubRight.E10.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.U2.ordinal()), _path.GetVertex(F1SubRight.T2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.U2.ordinal()).GetX()-_path.GetVertex(F1SubRight.T2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.V1.ordinal()), _path.GetVertex(F1SubRight.U1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.V1.ordinal()).GetY()-_path.GetVertex(F1SubRight.U1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.V1.ordinal()), _path.GetVertex(F1SubRight.w1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.V1.ordinal()).GetY()-_path.GetVertex(F1SubRight.w1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.W8.ordinal()), _path.GetVertex(F1SubRight.L2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.W8.ordinal()).GetY()-_path.GetVertex(F1SubRight.L2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.W8.ordinal()), _path.GetVertex(F1SubRight.WT10.ordinal()), Math.abs(_path.GetVertex(F1SubRight.W8.ordinal()).GetX()-_path.GetVertex(F1SubRight.WT10.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.WT10.ordinal()), _path.GetVertex(F1SubRight.K2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.WT10.ordinal()).GetY()-_path.GetVertex(F1SubRight.K2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.WT12.ordinal()), _path.GetVertex(F1SubRight.EL8.ordinal()), Math.abs(_path.GetVertex(F1SubRight.WT12.ordinal()).GetX()-_path.GetVertex(F1SubRight.EL8.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.WT12.ordinal()), _path.GetVertex(F1SubRight.T2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.WT12.ordinal()).GetY()-_path.GetVertex(F1SubRight.T2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.WT4.ordinal()), _path.GetVertex(F1SubRight.WT8.ordinal()), Math.abs(_path.GetVertex(F1SubRight.WT4.ordinal()).GetY()-_path.GetVertex(F1SubRight.WT8.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.WT8.ordinal()), _path.GetVertex(F1SubRight.K2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.WT8.ordinal()).GetY()-_path.GetVertex(F1SubRight.K2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.WT8.ordinal()), _path.GetVertex(F1SubRight.WT4.ordinal()), Math.abs(_path.GetVertex(F1SubRight.WT8.ordinal()).GetY()-_path.GetVertex(F1SubRight.WT4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.X1.ordinal()), _path.GetVertex(F1SubRight.Y1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.X1.ordinal()).GetY()-_path.GetVertex(F1SubRight.Y1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.X1.ordinal()), _path.GetVertex(F1SubRight.w1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.X1.ordinal()).GetY()-_path.GetVertex(F1SubRight.w1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.Y1.ordinal()), _path.GetVertex(F1SubRight.E18.ordinal()), Math.abs(_path.GetVertex(F1SubRight.Y1.ordinal()).GetX()-_path.GetVertex(F1SubRight.E18.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.Y1.ordinal()), _path.GetVertex(F1SubRight.X1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.Y1.ordinal()).GetY()-_path.GetVertex(F1SubRight.X1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.Z1.ordinal()), _path.GetVertex(F1SubRight.A2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.Z1.ordinal()).GetY()-_path.GetVertex(F1SubRight.A2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.Z1.ordinal()), _path.GetVertex(F1SubRight.E16.ordinal()), Math.abs(_path.GetVertex(F1SubRight.Z1.ordinal()).GetX()-_path.GetVertex(F1SubRight.E16.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.Z1.ordinal()), _path.GetVertex(F1SubRight.T1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.Z1.ordinal()).GetY()-_path.GetVertex(F1SubRight.T1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.b2.ordinal()), _path.GetVertex(F1SubRight.A2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.b2.ordinal()).GetY()-_path.GetVertex(F1SubRight.A2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.b2.ordinal()), _path.GetVertex(F1SubRight.E15.ordinal()), Math.abs(_path.GetVertex(F1SubRight.b2.ordinal()).GetX()-_path.GetVertex(F1SubRight.E15.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.b2.ordinal()), _path.GetVertex(F1SubRight.F2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.b2.ordinal()).GetY()-_path.GetVertex(F1SubRight.F2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.d2.ordinal()), _path.GetVertex(F1SubRight.B6.ordinal()), Math.abs(_path.GetVertex(F1SubRight.d2.ordinal()).GetY()-_path.GetVertex(F1SubRight.B6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.d2.ordinal()), _path.GetVertex(F1SubRight.C2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.d2.ordinal()).GetX()-_path.GetVertex(F1SubRight.C2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.e2.ordinal()), _path.GetVertex(F1SubRight.R1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.e2.ordinal()).GetY()-_path.GetVertex(F1SubRight.R1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.e2.ordinal()), _path.GetVertex(F1SubRight.d2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.e2.ordinal()).GetX()-_path.GetVertex(F1SubRight.d2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.q1.ordinal()), _path.GetVertex(F1SubRight.I4.ordinal()), Math.abs(_path.GetVertex(F1SubRight.q1.ordinal()).GetY()-_path.GetVertex(F1SubRight.I4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.q1.ordinal()), _path.GetVertex(F1SubRight.R1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.q1.ordinal()).GetX()-_path.GetVertex(F1SubRight.R1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.q2.ordinal()), _path.GetVertex(F1SubRight.P2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.q2.ordinal()).GetY()-_path.GetVertex(F1SubRight.P2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.q2.ordinal()), _path.GetVertex(F1SubRight.R2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.q2.ordinal()).GetY()-_path.GetVertex(F1SubRight.R2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.q2.ordinal()), _path.GetVertex(F1SubRight.S37.ordinal()), Math.abs(_path.GetVertex(F1SubRight.q2.ordinal()).GetX()-_path.GetVertex(F1SubRight.S37.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.s1.ordinal()), _path.GetVertex(F1SubRight.C2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.s1.ordinal()).GetY()-_path.GetVertex(F1SubRight.C2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.s1.ordinal()), _path.GetVertex(F1SubRight.T1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.s1.ordinal()).GetX()-_path.GetVertex(F1SubRight.T1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.s2.ordinal()), _path.GetVertex(F1SubRight.ES6.ordinal()), Math.abs(_path.GetVertex(F1SubRight.s2.ordinal()).GetY()-_path.GetVertex(F1SubRight.ES6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.s2.ordinal()), _path.GetVertex(F1SubRight.R2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.s2.ordinal()).GetY()-_path.GetVertex(F1SubRight.R2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.s2.ordinal()), _path.GetVertex(F1SubRight.S39.ordinal()), Math.abs(_path.GetVertex(F1SubRight.s2.ordinal()).GetX()-_path.GetVertex(F1SubRight.S39.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.w1.ordinal()), _path.GetVertex(F1SubRight.V1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.w1.ordinal()).GetY()-_path.GetVertex(F1SubRight.V1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.w1.ordinal()), _path.GetVertex(F1SubRight.X1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.w1.ordinal()).GetY()-_path.GetVertex(F1SubRight.X1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.Z3.ordinal()), _path.GetVertex(F1SubRight.M1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.Z3.ordinal()).GetY()-_path.GetVertex(F1SubRight.M1.ordinal()).GetY()));


        //extend edges added

        _path.AddRoute(_path.GetVertex(F1SubRight.ER1.ordinal()), _path.GetVertex(F1SubRight.U1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER1.ordinal()).GetY() - _path.GetVertex(F1SubRight.U1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER1.ordinal()), _path.GetVertex(F1SubRight.s1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER1.ordinal()).GetX() - _path.GetVertex(F1SubRight.s1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER1.ordinal()), _path.GetVertex(F1SubRight.T1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER1.ordinal()).GetX()-_path.GetVertex(F1SubRight.T1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER2.ordinal()), _path.GetVertex(F1SubRight.q1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER2.ordinal()).GetY() - _path.GetVertex(F1SubRight.q1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER2.ordinal()), _path.GetVertex(F1SubRight.EBP1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER2.ordinal()).GetX() - _path.GetVertex(F1SubRight.EBP1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER2.ordinal()), _path.GetVertex(F1SubRight.I4.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER2.ordinal()).GetY()-_path.GetVertex(F1SubRight.I4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER3.ordinal()), _path.GetVertex(F1SubRight.C2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER3.ordinal()).GetY() - _path.GetVertex(F1SubRight.C2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER3.ordinal()), _path.GetVertex(F1SubRight.ER4.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER3.ordinal()).GetX() - _path.GetVertex(F1SubRight.ER4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER3.ordinal()), _path.GetVertex(F1SubRight.S42.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER3.ordinal()).GetY() - _path.GetVertex(F1SubRight.S42.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER3.ordinal()), _path.GetVertex(F1SubRight.ER12.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER3.ordinal()).GetX()-_path.GetVertex(F1SubRight.ER12.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER4.ordinal()), _path.GetVertex(F1SubRight.d2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER4.ordinal()).GetY() - _path.GetVertex(F1SubRight.d2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER4.ordinal()), _path.GetVertex(F1SubRight.ER5.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER4.ordinal()).GetX()-_path.GetVertex(F1SubRight.ER5.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER5.ordinal()), _path.GetVertex(F1SubRight.ER6.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER5.ordinal()).GetX() - _path.GetVertex(F1SubRight.ER6.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER5.ordinal()), _path.GetVertex(F1SubRight.S39.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER5.ordinal()).GetY()-_path.GetVertex(F1SubRight.S39.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER6.ordinal()), _path.GetVertex(F1SubRight.e2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER6.ordinal()).GetY() - _path.GetVertex(F1SubRight.e2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER6.ordinal()), _path.GetVertex(F1SubRight.K4.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER6.ordinal()).GetX()-_path.GetVertex(F1SubRight.K4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER7.ordinal()), _path.GetVertex(F1SubRight.S40.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER7.ordinal()).GetY() - _path.GetVertex(F1SubRight.S40.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER7.ordinal()), _path.GetVertex(F1SubRight.N2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER7.ordinal()).GetX() - _path.GetVertex(F1SubRight.N2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER7.ordinal()), _path.GetVertex(F1SubRight.M2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER7.ordinal()).GetX()-_path.GetVertex(F1SubRight.M2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER8.ordinal()), _path.GetVertex(F1SubRight.S37.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER8.ordinal()).GetY() - _path.GetVertex(F1SubRight.S37.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER8.ordinal()), _path.GetVertex(F1SubRight.O2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER8.ordinal()).GetX() - _path.GetVertex(F1SubRight.O2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER8.ordinal()), _path.GetVertex(F1SubRight.N2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER8.ordinal()).GetX()-_path.GetVertex(F1SubRight.N2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER9.ordinal()), _path.GetVertex(F1SubRight.q2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER9.ordinal()).GetY() - _path.GetVertex(F1SubRight.q2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER9.ordinal()), _path.GetVertex(F1SubRight.ER10.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER9.ordinal()).GetX() - _path.GetVertex(F1SubRight.ER10.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER9.ordinal()), _path.GetVertex(F1SubRight.P2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER9.ordinal()).GetY()-_path.GetVertex(F1SubRight.P2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER10.ordinal()), _path.GetVertex(F1SubRight.S34.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER10.ordinal()).GetY() - _path.GetVertex(F1SubRight.S34.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER10.ordinal()), _path.GetVertex(F1SubRight.EBP2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER10.ordinal()).GetX() - _path.GetVertex(F1SubRight.EBP2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER10.ordinal()), _path.GetVertex(F1SubRight.ER11.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER10.ordinal()).GetY()-_path.GetVertex(F1SubRight.ER11.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER11.ordinal()), _path.GetVertex(F1SubRight.I.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER11.ordinal()).GetX() - _path.GetVertex(F1SubRight.I.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER11.ordinal()), _path.GetVertex(F1SubRight.U2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER11.ordinal()).GetX()-_path.GetVertex(F1SubRight.U2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER12.ordinal()), _path.GetVertex(F1SubRight.G2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER12.ordinal()).GetY() - _path.GetVertex(F1SubRight.G2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.ER12.ordinal()), _path.GetVertex(F1SubRight.F2.ordinal()), Math.abs(_path.GetVertex(F1SubRight.ER12.ordinal()).GetY()-_path.GetVertex(F1SubRight.F2.ordinal()).GetY()));

        _path.AddRoute(_path.GetVertex(F1SubRight.EBP1.ordinal()), _path.GetVertex(F1SubRight.M1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.EBP1.ordinal()).GetY()-_path.GetVertex(F1SubRight.M1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubRight.EBP1.ordinal()), _path.GetVertex(F1SubRight.L1.ordinal()), Math.abs(_path.GetVertex(F1SubRight.EBP1.ordinal()).GetY()-_path.GetVertex(F1SubRight.L1.ordinal()).GetY()));


    }

    public int GetStartOrder(){

        return F1SubRight.start_position.ordinal();
    }
    public int GetEndOrder(){

        return F1SubRight.end_position.ordinal();
    }

    public int GetStartAux1Order(){
        return F1SubRight.start_auxiliary_pos.ordinal();
    }
    public int GetStartAux2Order(){
        return F1SubRight.start_auxiliary_pos2.ordinal();
    }
    public int GetStartAux3Order(){
        return F1SubRight.start_auxiliary_pos3.ordinal();
    }
    public int GetStartAux4Order(){
        return F1SubRight.start_auxiliary_pos4.ordinal();
    }
    public int GetEndAux1Order(){
        return F1SubRight.end_auxiliary_pos.ordinal();
    }
    public int GetEndAux2Order(){
        return F1SubRight.end_auxiliary_pos2.ordinal();
    }
    public int GetEndAux3Order(){
        return F1SubRight.end_auxiliary_pos3.ordinal();
    }
    public int GetEndAux4Order(){
        return F1SubRight.end_auxiliary_pos4.ordinal();
    }
}