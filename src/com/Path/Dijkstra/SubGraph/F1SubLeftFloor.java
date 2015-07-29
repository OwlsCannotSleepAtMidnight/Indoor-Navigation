package com.Path.Dijkstra.SubGraph;
import com.Path.DefinedVertex.F1SubLeft;
import com.Path.DefinedVertex.SubNumber;

/**
 * Created by toy on 4/11/15.
 */


public class F1SubLeftFloor extends Floor{
    //ArrayList<Vertex> B1_vertex= new ArrayList();
    public F1SubLeftFloor(int stair) {
        super(stair);
        _sub_no = SubNumber.F1SubLeft;
    }

    public void InitializeVertex() {

        //basic points added
        _path.AddVertex(F1SubLeft.E9.ordinal(), new Vertex("E9" , 0.4395, 0.9713, _stair));
        _path.AddVertex(F1SubLeft.WT11.ordinal(), new Vertex("WT11" , 0.3799, 0.9502, _stair));
        _path.AddVertex(F1SubLeft.E8.ordinal(), new Vertex("E8" , 0.3183, 0.9713, _stair));
        _path.AddVertex(F1SubLeft.E7.ordinal(), new Vertex("E7" , 0.1990, 0.9713, _stair));
        _path.AddVertex(F1SubLeft.EL7.ordinal(), new Vertex("EL7" , 0.1432, 0.9502, _stair));
        _path.AddVertex(F1SubLeft.ES7.ordinal(), new Vertex("ES7" , 0.1182, 0.9155, _stair));
        _path.AddVertex(F1SubLeft.W7.ordinal(), new Vertex("W7" , 0.0604, 0.9329, _stair));
        _path.AddVertex(F1SubLeft.WT9.ordinal(), new Vertex("WT9" , 0.0450, 0.9329, _stair));
        _path.AddVertex(F1SubLeft.E6.ordinal(), new Vertex("E6" , 0.0316, 0.8636, _stair));
        _path.AddVertex(F1SubLeft.E5.ordinal(), new Vertex("E5" , 0.0316, 0.7423, _stair));
        _path.AddVertex(F1SubLeft.WT7.ordinal(), new Vertex("WT7" , 0.0450, 0.6808, _stair));
        _path.AddVertex(F1SubLeft.E4.ordinal(), new Vertex("E4" , 0.0316, 0.6211, _stair));
        _path.AddVertex(F1SubLeft.E3.ordinal(), new Vertex("E3" , 0.0316, 0.5018, _stair));
        _path.AddVertex(F1SubLeft.E2.ordinal(), new Vertex("E2" , 0.0316, 0.3825, _stair));
        _path.AddVertex(F1SubLeft.WT3.ordinal(), new Vertex("WT3" , 0.0450, 0.3190, _stair));
        _path.AddVertex(F1SubLeft.E1.ordinal(), new Vertex("E1" , 0.0316, 0.2632, _stair));
        _path.AddVertex(F1SubLeft.W3.ordinal(), new Vertex("W3" , 0.0604, 0.1939, _stair));
        _path.AddVertex(F1SubLeft.S19.ordinal(), new Vertex("S19" , 0.1085, 0.2863, _stair));
        _path.AddVertex(F1SubLeft.S18.ordinal(), new Vertex("S18" , 0.1085, 0.3267, _stair));
        _path.AddVertex(F1SubLeft.S17.ordinal(), new Vertex("S17" , 0.1085, 0.3632, _stair));
        _path.AddVertex(F1SubLeft.S20.ordinal(), new Vertex("S20" , 0.1797, 0.3998, _stair));
        _path.AddVertex(F1SubLeft.S27.ordinal(), new Vertex("S27" , 0.1509, 0.7404, _stair));
        _path.AddVertex(F1SubLeft.S26.ordinal(), new Vertex("S26" , 0.1509, 0.7808, _stair));
        _path.AddVertex(F1SubLeft.S25.ordinal(), new Vertex("S25" , 0.1509, 0.8212, _stair));
        _path.AddVertex(F1SubLeft.S28.ordinal(), new Vertex("S28" , 0.2529, 0.8212, _stair));
        _path.AddVertex(F1SubLeft.S29.ordinal(), new Vertex("S29" , 0.2529, 0.7808, _stair));
        _path.AddVertex(F1SubLeft.S30.ordinal(), new Vertex("S30" , 0.2529, 0.7404, _stair));
        _path.AddVertex(F1SubLeft.S31.ordinal(), new Vertex("S31" , 0.4511, 0.8212, _stair));
        _path.AddVertex(F1SubLeft.S32.ordinal(), new Vertex("S32" , 0.4511, 0.7808, _stair));
        _path.AddVertex(F1SubLeft.S33.ordinal(), new Vertex("S33" , 0.4511, 0.7404, _stair));
        _path.AddVertex(F1SubLeft.ES5.ordinal(), new Vertex("ES5" , 0.3279, 0.6942, _stair));
        _path.AddVertex(F1SubLeft.EL5.ordinal(), new Vertex("EL5" , 0.3048, 0.6750, _stair));
        _path.AddVertex(F1SubLeft.B1.ordinal(), new Vertex("B1" , 0.2086, 0.5711, _stair));
        _path.AddVertex(F1SubLeft.B2.ordinal(), new Vertex("B2" , 0.3279, 0.5711, _stair));
        _path.AddVertex(F1SubLeft.B3.ordinal(), new Vertex("B3" , 0.4511, 0.6288, _stair));
        _path.AddVertex(F1SubLeft.Z3.ordinal(), new Vertex("Z3" , 0.4992, 0.3806, _stair));
        _path.AddVertex(F1SubLeft.M1.ordinal(), new Vertex("M1" , 0.4992, 0.4210, _stair));
        _path.AddVertex(F1SubLeft.L1.ordinal(), new Vertex("L1" , 0.4992, 0.6288, _stair));
        _path.AddVertex(F1SubLeft.K1.ordinal(), new Vertex("K1" , 0.4992, 0.6942, _stair));
        _path.AddVertex(F1SubLeft.I.ordinal(), new Vertex("I" , 0.4992, 0.9155, _stair));
        _path.AddVertex(F1SubLeft.A.ordinal(), new Vertex("A" , 0.0450, 0.9155, _stair));
        _path.AddVertex(F1SubLeft.B.ordinal(), new Vertex("B" , 0.0604, 0.9155, _stair));
        _path.AddVertex(F1SubLeft.C.ordinal(), new Vertex("C" , 0.1432, 0.9155, _stair));
        _path.AddVertex(F1SubLeft.D.ordinal(), new Vertex("D" , 0.1990, 0.9155, _stair));
        _path.AddVertex(F1SubLeft.E.ordinal(), new Vertex("E" , 0.3183, 0.9155, _stair));
        _path.AddVertex(F1SubLeft.F.ordinal(), new Vertex("F" , 0.3279, 0.9155, _stair));
        _path.AddVertex(F1SubLeft.G.ordinal(), new Vertex("G" , 0.3799, 0.9155, _stair));
        _path.AddVertex(F1SubLeft.H.ordinal(), new Vertex("H" , 0.4395, 0.9155, _stair));
        _path.AddVertex(F1SubLeft.I1.ordinal(), new Vertex("I1" , 0.3279, 0.8212, _stair));
        _path.AddVertex(F1SubLeft.H1.ordinal(), new Vertex("H1" , 0.3279, 0.7808, _stair));
        _path.AddVertex(F1SubLeft.G1.ordinal(), new Vertex("G1" , 0.3279, 0.7404, _stair));
        _path.AddVertex(F1SubLeft.F1.ordinal(), new Vertex("F1" , 0.3048, 0.6942, _stair));
        _path.AddVertex(F1SubLeft.e1.ordinal(), new Vertex("e1" , 0.3895, 0.6942, _stair));
        _path.AddVertex(F1SubLeft.J1.ordinal(), new Vertex("J1" , 0.4511, 0.6942, _stair));
        _path.AddVertex(F1SubLeft.d1.ordinal(), new Vertex("d1" , 0.3895, 0.6288, _stair));
        _path.AddVertex(F1SubLeft.C1.ordinal(), new Vertex("C1" , 0.3895, 0.6019, _stair));
        _path.AddVertex(F1SubLeft.b1.ordinal(), new Vertex("b1" , 0.3895, 0.4210, _stair));
        _path.AddVertex(F1SubLeft.A1.ordinal(), new Vertex("A1" , 0.3279, 0.6019, _stair));
        _path.AddVertex(F1SubLeft.Y.ordinal(), new Vertex("Y" , 0.2702, 0.6019, _stair));
        _path.AddVertex(F1SubLeft.Z.ordinal(), new Vertex("Z" , 0.2702, 0.4210, _stair));
        _path.AddVertex(F1SubLeft.X.ordinal(), new Vertex("X" , 0.2086, 0.6019, _stair));
        _path.AddVertex(F1SubLeft.F4.ordinal(), new Vertex("F4" , 0.1509, 0.6019, _stair));
        _path.AddVertex(F1SubLeft.H4.ordinal(), new Vertex("H4" , 0.1509, 0.4210, _stair));
        _path.AddVertex(F1SubLeft.P.ordinal(), new Vertex("P" , 0.0604, 0.6019, _stair));
        _path.AddVertex(F1SubLeft.J.ordinal(), new Vertex("J" , 0.0604, 0.8636, _stair));
        _path.AddVertex(F1SubLeft.K.ordinal(), new Vertex("K" , 0.0604, 0.8212, _stair));
        _path.AddVertex(F1SubLeft.L.ordinal(), new Vertex("L" , 0.0604, 0.7808, _stair));
        _path.AddVertex(F1SubLeft.M.ordinal(), new Vertex("M" , 0.0604, 0.7404, _stair));
        _path.AddVertex(F1SubLeft.N.ordinal(), new Vertex("N" , 0.0604, 0.6808, _stair));
        _path.AddVertex(F1SubLeft.O.ordinal(), new Vertex("O" , 0.0604, 0.6211, _stair));
        _path.AddVertex(F1SubLeft.Q.ordinal(), new Vertex("Q" , 0.0604, 0.5018, _stair));
        _path.AddVertex(F1SubLeft.R.ordinal(), new Vertex("R" , 0.0604, 0.4210, _stair));
        _path.AddVertex(F1SubLeft.S.ordinal(), new Vertex("S" , 0.0604, 0.3825, _stair));
        _path.AddVertex(F1SubLeft.T.ordinal(), new Vertex("T" , 0.0604, 0.3632, _stair));
        _path.AddVertex(F1SubLeft.U.ordinal(), new Vertex("U" , 0.0604, 0.3267, _stair));
        _path.AddVertex(F1SubLeft.V.ordinal(), new Vertex("V" , 0.0604, 0.2863, _stair));
        _path.AddVertex(F1SubLeft.W.ordinal(), new Vertex("W" , 0.0604, 0.2632, _stair));



        //necessary points added

        _path.AddVertex(F1SubLeft.start_position.ordinal(), new Vertex("Start", 0, 0, _stair));
        _path.AddVertex(F1SubLeft.end_position.ordinal(), new Vertex("End", 0, 0, _stair));
        _path.AddVertex(F1SubLeft.start_auxiliary_pos.ordinal(), new Vertex("Start_aux", 0, 0, _stair));
        _path.AddVertex(F1SubLeft.end_auxiliary_pos.ordinal(), new Vertex("End_aux", 0, 0, _stair));
        _path.AddVertex(F1SubLeft.start_auxiliary_pos2.ordinal(), new Vertex("Start_aux2", 0, 0, _stair));
        _path.AddVertex(F1SubLeft.end_auxiliary_pos2.ordinal(), new Vertex("End_aux2", 0, 0, _stair));
        _path.AddVertex(F1SubLeft.start_auxiliary_pos3.ordinal(), new Vertex("Start_aux3", 0, 0, _stair));
        _path.AddVertex(F1SubLeft.end_auxiliary_pos3.ordinal(), new Vertex("End_aux3", 0, 0, _stair));
        _path.AddVertex(F1SubLeft.start_auxiliary_pos4.ordinal(), new Vertex("Start_aux4", 0, 0, _stair));
        _path.AddVertex(F1SubLeft.end_auxiliary_pos4.ordinal(), new Vertex("End_aux4", 0, 0, _stair));

        //extend points added

        _path.AddVertex(F1SubLeft.LE1.ordinal(), new Vertex("LE1",0.1085,0.4210, _stair) );
        _path.AddVertex(F1SubLeft.LE2.ordinal(), new Vertex("LE2",0.3895,0.5018, _stair) );
        _path.AddVertex(F1SubLeft.EBP1.ordinal(), new Vertex("EBP1", 0.4992, 0.5018, _stair) );
        _path.AddVertex(F1SubLeft.LE3.ordinal(), new Vertex("LE3", 0.0604, 0.6942, _stair) );
        _path.AddVertex(F1SubLeft.LE4.ordinal(), new Vertex("LE4" ,0.1509, 0.6942, _stair) );
        _path.AddVertex(F1SubLeft.LE6.ordinal(), new Vertex ("LE6", 0.2086, 0.6942, _stair));
        _path.AddVertex(F1SubLeft.LE7.ordinal(), new Vertex("LE7", 0.2702, 0.6942, _stair) );
        _path.AddVertex(F1SubLeft.LE8.ordinal(), new Vertex("LE8", 0.1509,0.9155, _stair) );
        _path.AddVertex(F1SubLeft.LE9.ordinal(), new Vertex("LE9", 0.2529,0.9155, _stair) );
        _path.AddVertex(F1SubLeft.LE10.ordinal(), new Vertex ("LE10", 0.3279, 0.8636, _stair));
        _path.AddVertex(F1SubLeft.LE11.ordinal(), new Vertex("LE11", 0.4511, 0.8636, _stair) );
        _path.AddVertex(F1SubLeft.EBP2.ordinal(), new Vertex ("EBP2", 0.4992, 0.8636, _stair));
        _path.AddVertex(F1SubLeft.LE12.ordinal(), new Vertex("LE12", 0.4511, 0.9155, _stair) );



    }

    public void InitializeEdge() {

        //basic edges added
        _path.AddRoute(_path.GetVertex(F1SubLeft.A.ordinal()), _path.GetVertex(F1SubLeft.B.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.A.ordinal()).GetX()-_path.GetVertex(F1SubLeft.B.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.A.ordinal()), _path.GetVertex(F1SubLeft.WT7.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.A.ordinal()).GetY()-_path.GetVertex(F1SubLeft.WT7.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.A.ordinal()), _path.GetVertex(F1SubLeft.WT9.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.A.ordinal()).GetY()-_path.GetVertex(F1SubLeft.WT9.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.A1.ordinal()), _path.GetVertex(F1SubLeft.B2.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.A1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.B2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.A1.ordinal()), _path.GetVertex(F1SubLeft.C1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.A1.ordinal()).GetX()-_path.GetVertex(F1SubLeft.C1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.B.ordinal()), _path.GetVertex(F1SubLeft.ES7.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.B.ordinal()).GetX()-_path.GetVertex(F1SubLeft.ES7.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.B.ordinal()), _path.GetVertex(F1SubLeft.J.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.B.ordinal()).GetY()-_path.GetVertex(F1SubLeft.J.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.B.ordinal()), _path.GetVertex(F1SubLeft.W7.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.B.ordinal()).GetY()-_path.GetVertex(F1SubLeft.W7.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.B1.ordinal()), _path.GetVertex(F1SubLeft.B2.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.B1.ordinal()).GetX()-_path.GetVertex(F1SubLeft.B2.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.B1.ordinal()), _path.GetVertex(F1SubLeft.X.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.B1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.X.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.B2.ordinal()), _path.GetVertex(F1SubLeft.A1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.B2.ordinal()).GetY()-_path.GetVertex(F1SubLeft.A1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.B3.ordinal()), _path.GetVertex(F1SubLeft.J1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.B3.ordinal()).GetY()-_path.GetVertex(F1SubLeft.J1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.B3.ordinal()), _path.GetVertex(F1SubLeft.L1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.B3.ordinal()).GetX()-_path.GetVertex(F1SubLeft.L1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.C.ordinal()), _path.GetVertex(F1SubLeft.D.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.C.ordinal()).GetX()-_path.GetVertex(F1SubLeft.D.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.C.ordinal()), _path.GetVertex(F1SubLeft.EL7.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.C.ordinal()).GetY()-_path.GetVertex(F1SubLeft.EL7.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.C.ordinal()), _path.GetVertex(F1SubLeft.F4.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.C.ordinal()).GetY()-_path.GetVertex(F1SubLeft.F4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.C1.ordinal()), _path.GetVertex(F1SubLeft.b1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.C1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.b1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.C1.ordinal()), _path.GetVertex(F1SubLeft.d1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.C1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.d1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.D.ordinal()), _path.GetVertex(F1SubLeft.E.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.D.ordinal()).GetX()-_path.GetVertex(F1SubLeft.E.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.D.ordinal()), _path.GetVertex(F1SubLeft.E7.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.D.ordinal()).GetY()-_path.GetVertex(F1SubLeft.E7.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E.ordinal()), _path.GetVertex(F1SubLeft.E8.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E.ordinal()).GetY()-_path.GetVertex(F1SubLeft.E8.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E.ordinal()), _path.GetVertex(F1SubLeft.F.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E.ordinal()).GetX()-_path.GetVertex(F1SubLeft.F.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E1.ordinal()), _path.GetVertex(F1SubLeft.W.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E1.ordinal()).GetX()-_path.GetVertex(F1SubLeft.W.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E2.ordinal()), _path.GetVertex(F1SubLeft.E3.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E2.ordinal()).GetY()-_path.GetVertex(F1SubLeft.E3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E2.ordinal()), _path.GetVertex(F1SubLeft.S.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E2.ordinal()).GetX()-_path.GetVertex(F1SubLeft.S.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E3.ordinal()), _path.GetVertex(F1SubLeft.E2.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E3.ordinal()).GetY()-_path.GetVertex(F1SubLeft.E2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E3.ordinal()), _path.GetVertex(F1SubLeft.E4.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E3.ordinal()).GetY()-_path.GetVertex(F1SubLeft.E4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E3.ordinal()), _path.GetVertex(F1SubLeft.Q.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E3.ordinal()).GetX()-_path.GetVertex(F1SubLeft.Q.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E4.ordinal()), _path.GetVertex(F1SubLeft.E3.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E4.ordinal()).GetY()-_path.GetVertex(F1SubLeft.E3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E4.ordinal()), _path.GetVertex(F1SubLeft.O.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E4.ordinal()).GetX()-_path.GetVertex(F1SubLeft.O.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E5.ordinal()), _path.GetVertex(F1SubLeft.E6.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E5.ordinal()).GetY()-_path.GetVertex(F1SubLeft.E6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E6.ordinal()), _path.GetVertex(F1SubLeft.E5.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E6.ordinal()).GetY()-_path.GetVertex(F1SubLeft.E5.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E6.ordinal()), _path.GetVertex(F1SubLeft.J.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E6.ordinal()).GetX()-_path.GetVertex(F1SubLeft.J.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E7.ordinal()), _path.GetVertex(F1SubLeft.D.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E7.ordinal()).GetY()-_path.GetVertex(F1SubLeft.D.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E7.ordinal()), _path.GetVertex(F1SubLeft.E8.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E7.ordinal()).GetX()-_path.GetVertex(F1SubLeft.E8.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E8.ordinal()), _path.GetVertex(F1SubLeft.E.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E8.ordinal()).GetY()-_path.GetVertex(F1SubLeft.E.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.E9.ordinal()), _path.GetVertex(F1SubLeft.H.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.E9.ordinal()).GetY()-_path.GetVertex(F1SubLeft.H.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.EL5.ordinal()), _path.GetVertex(F1SubLeft.F1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.EL5.ordinal()).GetY()-_path.GetVertex(F1SubLeft.F1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.EL7.ordinal()), _path.GetVertex(F1SubLeft.C.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.EL7.ordinal()).GetY()-_path.GetVertex(F1SubLeft.C.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.EL7.ordinal()), _path.GetVertex(F1SubLeft.WT11.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.EL7.ordinal()).GetX()-_path.GetVertex(F1SubLeft.WT11.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.ES5.ordinal()), _path.GetVertex(F1SubLeft.G1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.ES5.ordinal()).GetY()-_path.GetVertex(F1SubLeft.G1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.ES5.ordinal()), _path.GetVertex(F1SubLeft.e1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.ES5.ordinal()).GetX()-_path.GetVertex(F1SubLeft.e1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.ES7.ordinal()), _path.GetVertex(F1SubLeft.C.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.ES7.ordinal()).GetX()-_path.GetVertex(F1SubLeft.C.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.F.ordinal()), _path.GetVertex(F1SubLeft.G.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.F.ordinal()).GetX()-_path.GetVertex(F1SubLeft.G.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.F.ordinal()), _path.GetVertex(F1SubLeft.I1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.F.ordinal()).GetY()-_path.GetVertex(F1SubLeft.I1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.F1.ordinal()), _path.GetVertex(F1SubLeft.EL5.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.F1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.EL5.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.F1.ordinal()), _path.GetVertex(F1SubLeft.ES5.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.F1.ordinal()).GetX()-_path.GetVertex(F1SubLeft.ES5.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.F4.ordinal()), _path.GetVertex(F1SubLeft.C.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.F4.ordinal()).GetY()-_path.GetVertex(F1SubLeft.C.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.F4.ordinal()), _path.GetVertex(F1SubLeft.H4.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.F4.ordinal()).GetY()-_path.GetVertex(F1SubLeft.H4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.F4.ordinal()), _path.GetVertex(F1SubLeft.X.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.F4.ordinal()).GetX()-_path.GetVertex(F1SubLeft.X.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.G.ordinal()), _path.GetVertex(F1SubLeft.H.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.G.ordinal()).GetX()-_path.GetVertex(F1SubLeft.H.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.G.ordinal()), _path.GetVertex(F1SubLeft.WT11.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.G.ordinal()).GetY()-_path.GetVertex(F1SubLeft.WT11.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.G1.ordinal()), _path.GetVertex(F1SubLeft.ES5.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.G1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.ES5.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.G1.ordinal()), _path.GetVertex(F1SubLeft.H1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.G1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.H1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.G1.ordinal()), _path.GetVertex(F1SubLeft.S33.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.G1.ordinal()).GetX()-_path.GetVertex(F1SubLeft.S33.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.H.ordinal()), _path.GetVertex(F1SubLeft.E9.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.H.ordinal()).GetY()-_path.GetVertex(F1SubLeft.E9.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.H.ordinal()), _path.GetVertex(F1SubLeft.I.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.H.ordinal()).GetX()-_path.GetVertex(F1SubLeft.I.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.H1.ordinal()), _path.GetVertex(F1SubLeft.G1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.H1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.G1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.H1.ordinal()), _path.GetVertex(F1SubLeft.I1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.H1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.I1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.H1.ordinal()), _path.GetVertex(F1SubLeft.S32.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.H1.ordinal()).GetX()-_path.GetVertex(F1SubLeft.S32.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.H4.ordinal()), _path.GetVertex(F1SubLeft.F4.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.H4.ordinal()).GetY()-_path.GetVertex(F1SubLeft.F4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.H4.ordinal()), _path.GetVertex(F1SubLeft.Z.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.H4.ordinal()).GetX()-_path.GetVertex(F1SubLeft.Z.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.I1.ordinal()), _path.GetVertex(F1SubLeft.F.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.I1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.F.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.I1.ordinal()), _path.GetVertex(F1SubLeft.H1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.I1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.H1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.I1.ordinal()), _path.GetVertex(F1SubLeft.S31.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.I1.ordinal()).GetX()-_path.GetVertex(F1SubLeft.S31.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.J.ordinal()), _path.GetVertex(F1SubLeft.B.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.J.ordinal()).GetY()-_path.GetVertex(F1SubLeft.B.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.J.ordinal()), _path.GetVertex(F1SubLeft.K.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.J.ordinal()).GetY()-_path.GetVertex(F1SubLeft.K.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.J1.ordinal()), _path.GetVertex(F1SubLeft.B3.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.J1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.B3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.J1.ordinal()), _path.GetVertex(F1SubLeft.K1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.J1.ordinal()).GetX()-_path.GetVertex(F1SubLeft.K1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.J1.ordinal()), _path.GetVertex(F1SubLeft.S33.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.J1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S33.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.K.ordinal()), _path.GetVertex(F1SubLeft.J.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.K.ordinal()).GetY()-_path.GetVertex(F1SubLeft.J.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.K.ordinal()), _path.GetVertex(F1SubLeft.L.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.K.ordinal()).GetY()-_path.GetVertex(F1SubLeft.L.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.K.ordinal()), _path.GetVertex(F1SubLeft.S25.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.K.ordinal()).GetX()-_path.GetVertex(F1SubLeft.S25.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.K1.ordinal()), _path.GetVertex(F1SubLeft.L1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.K1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.L1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.L.ordinal()), _path.GetVertex(F1SubLeft.K.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.L.ordinal()).GetY()-_path.GetVertex(F1SubLeft.K.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.L.ordinal()), _path.GetVertex(F1SubLeft.M.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.L.ordinal()).GetY()-_path.GetVertex(F1SubLeft.M.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.L.ordinal()), _path.GetVertex(F1SubLeft.S26.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.L.ordinal()).GetX()-_path.GetVertex(F1SubLeft.S26.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.L1.ordinal()), _path.GetVertex(F1SubLeft.K1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.L1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.K1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.L1.ordinal()), _path.GetVertex(F1SubLeft.M1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.L1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.M1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.M.ordinal()), _path.GetVertex(F1SubLeft.L.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.M.ordinal()).GetY()-_path.GetVertex(F1SubLeft.L.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.M.ordinal()), _path.GetVertex(F1SubLeft.N.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.M.ordinal()).GetY()-_path.GetVertex(F1SubLeft.N.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.M.ordinal()), _path.GetVertex(F1SubLeft.S27.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.M.ordinal()).GetX()-_path.GetVertex(F1SubLeft.S27.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.M1.ordinal()), _path.GetVertex(F1SubLeft.L1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.M1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.L1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.M1.ordinal()), _path.GetVertex(F1SubLeft.Z3.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.M1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.Z3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.N.ordinal()), _path.GetVertex(F1SubLeft.M.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.N.ordinal()).GetY()-_path.GetVertex(F1SubLeft.M.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.N.ordinal()), _path.GetVertex(F1SubLeft.O.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.N.ordinal()).GetY()-_path.GetVertex(F1SubLeft.O.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.O.ordinal()), _path.GetVertex(F1SubLeft.N.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.O.ordinal()).GetY()-_path.GetVertex(F1SubLeft.N.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.O.ordinal()), _path.GetVertex(F1SubLeft.P.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.O.ordinal()).GetY()-_path.GetVertex(F1SubLeft.P.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.P.ordinal()), _path.GetVertex(F1SubLeft.F4.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.P.ordinal()).GetX()-_path.GetVertex(F1SubLeft.F4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.P.ordinal()), _path.GetVertex(F1SubLeft.O.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.P.ordinal()).GetY()-_path.GetVertex(F1SubLeft.O.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.P.ordinal()), _path.GetVertex(F1SubLeft.Q.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.P.ordinal()).GetY()-_path.GetVertex(F1SubLeft.Q.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.Q.ordinal()), _path.GetVertex(F1SubLeft.P.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.Q.ordinal()).GetY()-_path.GetVertex(F1SubLeft.P.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.Q.ordinal()), _path.GetVertex(F1SubLeft.R.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.Q.ordinal()).GetY()-_path.GetVertex(F1SubLeft.R.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.R.ordinal()), _path.GetVertex(F1SubLeft.H4.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.R.ordinal()).GetX()-_path.GetVertex(F1SubLeft.H4.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.R.ordinal()), _path.GetVertex(F1SubLeft.Q.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.R.ordinal()).GetY()-_path.GetVertex(F1SubLeft.Q.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.R.ordinal()), _path.GetVertex(F1SubLeft.S.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.R.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S.ordinal()), _path.GetVertex(F1SubLeft.R.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S.ordinal()).GetY()-_path.GetVertex(F1SubLeft.R.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S.ordinal()), _path.GetVertex(F1SubLeft.T.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S.ordinal()).GetY()-_path.GetVertex(F1SubLeft.T.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S17.ordinal()), _path.GetVertex(F1SubLeft.S18.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S17.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S18.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S18.ordinal()), _path.GetVertex(F1SubLeft.S17.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S18.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S17.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S18.ordinal()), _path.GetVertex(F1SubLeft.S19.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S18.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S19.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S19.ordinal()), _path.GetVertex(F1SubLeft.S18.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S19.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S18.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S25.ordinal()), _path.GetVertex(F1SubLeft.S26.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S25.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S26.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S26.ordinal()), _path.GetVertex(F1SubLeft.S25.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S26.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S25.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S26.ordinal()), _path.GetVertex(F1SubLeft.S27.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S26.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S27.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S27.ordinal()), _path.GetVertex(F1SubLeft.S26.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S27.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S26.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S28.ordinal()), _path.GetVertex(F1SubLeft.I1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S28.ordinal()).GetX()-_path.GetVertex(F1SubLeft.I1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S28.ordinal()), _path.GetVertex(F1SubLeft.S29.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S28.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S29.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S29.ordinal()), _path.GetVertex(F1SubLeft.H1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S29.ordinal()).GetX()-_path.GetVertex(F1SubLeft.H1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S29.ordinal()), _path.GetVertex(F1SubLeft.S28.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S29.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S28.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S29.ordinal()), _path.GetVertex(F1SubLeft.S30.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S29.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S30.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S30.ordinal()), _path.GetVertex(F1SubLeft.G1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S30.ordinal()).GetX()-_path.GetVertex(F1SubLeft.G1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S30.ordinal()), _path.GetVertex(F1SubLeft.S29.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S30.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S29.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S31.ordinal()), _path.GetVertex(F1SubLeft.S32.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S31.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S32.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S32.ordinal()), _path.GetVertex(F1SubLeft.S31.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S32.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S31.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S32.ordinal()), _path.GetVertex(F1SubLeft.S33.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S32.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S33.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S33.ordinal()), _path.GetVertex(F1SubLeft.J1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S33.ordinal()).GetY()-_path.GetVertex(F1SubLeft.J1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.S33.ordinal()), _path.GetVertex(F1SubLeft.S32.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.S33.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S32.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.T.ordinal()), _path.GetVertex(F1SubLeft.S.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.T.ordinal()).GetY()-_path.GetVertex(F1SubLeft.S.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.T.ordinal()), _path.GetVertex(F1SubLeft.S17.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.T.ordinal()).GetX()-_path.GetVertex(F1SubLeft.S17.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.T.ordinal()), _path.GetVertex(F1SubLeft.U.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.T.ordinal()).GetY()-_path.GetVertex(F1SubLeft.U.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.U.ordinal()), _path.GetVertex(F1SubLeft.S18.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.U.ordinal()).GetX()-_path.GetVertex(F1SubLeft.S18.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.U.ordinal()), _path.GetVertex(F1SubLeft.T.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.U.ordinal()).GetY()-_path.GetVertex(F1SubLeft.T.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.U.ordinal()), _path.GetVertex(F1SubLeft.V.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.U.ordinal()).GetY()-_path.GetVertex(F1SubLeft.V.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.V.ordinal()), _path.GetVertex(F1SubLeft.S19.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.V.ordinal()).GetX()-_path.GetVertex(F1SubLeft.S19.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.V.ordinal()), _path.GetVertex(F1SubLeft.U.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.V.ordinal()).GetY()-_path.GetVertex(F1SubLeft.U.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.V.ordinal()), _path.GetVertex(F1SubLeft.W.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.V.ordinal()).GetY()-_path.GetVertex(F1SubLeft.W.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.W.ordinal()), _path.GetVertex(F1SubLeft.V.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.W.ordinal()).GetY()-_path.GetVertex(F1SubLeft.V.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.W.ordinal()), _path.GetVertex(F1SubLeft.W3.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.W.ordinal()).GetY()-_path.GetVertex(F1SubLeft.W3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.W3.ordinal()), _path.GetVertex(F1SubLeft.W.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.W3.ordinal()).GetY()-_path.GetVertex(F1SubLeft.W.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.W7.ordinal()), _path.GetVertex(F1SubLeft.B.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.W7.ordinal()).GetY()-_path.GetVertex(F1SubLeft.B.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.WT11.ordinal()), _path.GetVertex(F1SubLeft.G.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.WT11.ordinal()).GetY()-_path.GetVertex(F1SubLeft.G.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.WT3.ordinal()), _path.GetVertex(F1SubLeft.WT7.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.WT3.ordinal()).GetY()-_path.GetVertex(F1SubLeft.WT7.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.WT7.ordinal()), _path.GetVertex(F1SubLeft.A.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.WT7.ordinal()).GetY()-_path.GetVertex(F1SubLeft.A.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.WT7.ordinal()), _path.GetVertex(F1SubLeft.N.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.WT7.ordinal()).GetX()-_path.GetVertex(F1SubLeft.N.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.WT7.ordinal()), _path.GetVertex(F1SubLeft.WT3.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.WT7.ordinal()).GetY()-_path.GetVertex(F1SubLeft.WT3.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.WT9.ordinal()), _path.GetVertex(F1SubLeft.A.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.WT9.ordinal()).GetY()-_path.GetVertex(F1SubLeft.A.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.WT9.ordinal()), _path.GetVertex(F1SubLeft.W7.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.WT9.ordinal()).GetX()-_path.GetVertex(F1SubLeft.W7.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.X.ordinal()), _path.GetVertex(F1SubLeft.B1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.X.ordinal()).GetY()-_path.GetVertex(F1SubLeft.B1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.X.ordinal()), _path.GetVertex(F1SubLeft.Y.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.X.ordinal()).GetX()-_path.GetVertex(F1SubLeft.Y.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.Y.ordinal()), _path.GetVertex(F1SubLeft.A1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.Y.ordinal()).GetX()-_path.GetVertex(F1SubLeft.A1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.Y.ordinal()), _path.GetVertex(F1SubLeft.Z.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.Y.ordinal()).GetY()-_path.GetVertex(F1SubLeft.Z.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.Z.ordinal()), _path.GetVertex(F1SubLeft.Y.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.Z.ordinal()).GetY()-_path.GetVertex(F1SubLeft.Y.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.Z.ordinal()), _path.GetVertex(F1SubLeft.b1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.Z.ordinal()).GetX()-_path.GetVertex(F1SubLeft.b1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.Z3.ordinal()), _path.GetVertex(F1SubLeft.M1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.Z3.ordinal()).GetY()-_path.GetVertex(F1SubLeft.M1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.b1.ordinal()), _path.GetVertex(F1SubLeft.C1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.b1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.C1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.b1.ordinal()), _path.GetVertex(F1SubLeft.M1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.b1.ordinal()).GetX()-_path.GetVertex(F1SubLeft.M1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.d1.ordinal()), _path.GetVertex(F1SubLeft.B3.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.d1.ordinal()).GetX()-_path.GetVertex(F1SubLeft.B3.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.d1.ordinal()), _path.GetVertex(F1SubLeft.C1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.d1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.C1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.d1.ordinal()), _path.GetVertex(F1SubLeft.e1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.d1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.e1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.e1.ordinal()), _path.GetVertex(F1SubLeft.J1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.e1.ordinal()).GetX()-_path.GetVertex(F1SubLeft.J1.ordinal()).GetX()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.e1.ordinal()), _path.GetVertex(F1SubLeft.d1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.e1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.d1.ordinal()).GetY()));


        //extend edges added

        _path.AddRoute(_path.GetVertex(F1SubLeft.LE1.ordinal()), _path.GetVertex(F1SubLeft.S17.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE1.ordinal()).GetY() - _path.GetVertex(F1SubLeft.S17.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE1.ordinal()), _path.GetVertex(F1SubLeft.R.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE1.ordinal()).GetY() - _path.GetVertex(F1SubLeft.R.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE1.ordinal()), _path.GetVertex(F1SubLeft.H4.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE1.ordinal()).GetY()-_path.GetVertex(F1SubLeft.H4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE2.ordinal()), _path.GetVertex(F1SubLeft.b1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE2.ordinal()).GetY() - _path.GetVertex(F1SubLeft.b1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE2.ordinal()), _path.GetVertex(F1SubLeft.C1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE2.ordinal()).GetY() - _path.GetVertex(F1SubLeft.C1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE2.ordinal()), _path.GetVertex(F1SubLeft.EBP1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE2.ordinal()).GetY()-_path.GetVertex(F1SubLeft.EBP1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE3.ordinal()), _path.GetVertex(F1SubLeft.N.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE3.ordinal()).GetY() - _path.GetVertex(F1SubLeft.N.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE3.ordinal()), _path.GetVertex(F1SubLeft.M.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE3.ordinal()).GetY() - _path.GetVertex(F1SubLeft.M.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE3.ordinal()), _path.GetVertex(F1SubLeft.LE4.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE3.ordinal()).GetY()-_path.GetVertex(F1SubLeft.LE4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE4.ordinal()), _path.GetVertex(F1SubLeft.F4.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE4.ordinal()).GetY() - _path.GetVertex(F1SubLeft.F4.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE4.ordinal()), _path.GetVertex(F1SubLeft.S27.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE4.ordinal()).GetY() - _path.GetVertex(F1SubLeft.S27.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE4.ordinal()), _path.GetVertex(F1SubLeft.LE6.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE4.ordinal()).GetY()-_path.GetVertex(F1SubLeft.LE6.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE6.ordinal()), _path.GetVertex(F1SubLeft.X.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE6.ordinal()).GetY() - _path.GetVertex(F1SubLeft.X.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE6.ordinal()), _path.GetVertex(F1SubLeft.LE7.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE6.ordinal()).GetY() - _path.GetVertex(F1SubLeft.LE7.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE7.ordinal()), _path.GetVertex(F1SubLeft.Y.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE7.ordinal()).GetY() - _path.GetVertex(F1SubLeft.Y.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE7.ordinal()), _path.GetVertex(F1SubLeft.F1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE7.ordinal()).GetY()-_path.GetVertex(F1SubLeft.F1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE8.ordinal()), _path.GetVertex(F1SubLeft.C.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE8.ordinal()).GetY() - _path.GetVertex(F1SubLeft.C.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE8.ordinal()), _path.GetVertex(F1SubLeft.S25.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE8.ordinal()).GetY() - _path.GetVertex(F1SubLeft.S25.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE8.ordinal()), _path.GetVertex(F1SubLeft.D.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE8.ordinal()).GetY()-_path.GetVertex(F1SubLeft.D.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE9.ordinal()), _path.GetVertex(F1SubLeft.S28.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE9.ordinal()).GetY() - _path.GetVertex(F1SubLeft.S28.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE9.ordinal()), _path.GetVertex(F1SubLeft.D.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE9.ordinal()).GetY() - _path.GetVertex(F1SubLeft.D.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE9.ordinal()), _path.GetVertex(F1SubLeft.E.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE9.ordinal()).GetY() - _path.GetVertex(F1SubLeft.E.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE10.ordinal()), _path.GetVertex(F1SubLeft.I1.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE10.ordinal()).GetY() - _path.GetVertex(F1SubLeft.I1.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE10.ordinal()), _path.GetVertex(F1SubLeft.F.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE10.ordinal()).GetY() - _path.GetVertex(F1SubLeft.F.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE10.ordinal()), _path.GetVertex(F1SubLeft.LE11.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE10.ordinal()).GetY()-_path.GetVertex(F1SubLeft.LE11.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE11.ordinal()), _path.GetVertex(F1SubLeft.S31.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE11.ordinal()).GetY() - _path.GetVertex(F1SubLeft.S31.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE11.ordinal()), _path.GetVertex(F1SubLeft.LE12.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE11.ordinal()).GetY() - _path.GetVertex(F1SubLeft.LE12.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE11.ordinal()), _path.GetVertex(F1SubLeft.EBP2.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE11.ordinal()).GetY()-_path.GetVertex(F1SubLeft.EBP2.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE12.ordinal()), _path.GetVertex(F1SubLeft.H.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE12.ordinal()).GetY() - _path.GetVertex(F1SubLeft.H.ordinal()).GetY()));
        _path.AddRoute(_path.GetVertex(F1SubLeft.LE12.ordinal()), _path.GetVertex(F1SubLeft.I.ordinal()), Math.abs(_path.GetVertex(F1SubLeft.LE12.ordinal()).GetY()-_path.GetVertex(F1SubLeft.I.ordinal()).GetY()));





    }

    public int GetStartOrder(){

        return F1SubLeft.start_position.ordinal();
    }
    public int GetEndOrder(){

        return F1SubLeft.end_position.ordinal();
    }

    public int GetStartAux1Order(){
        return F1SubLeft.start_auxiliary_pos.ordinal();
    }
    public int GetStartAux2Order(){
        return F1SubLeft.start_auxiliary_pos2.ordinal();
    }
    public int GetStartAux3Order(){
        return F1SubLeft.start_auxiliary_pos3.ordinal();
    }
    public int GetStartAux4Order(){
        return F1SubLeft.start_auxiliary_pos4.ordinal();
    }
    public int GetEndAux1Order(){
        return F1SubLeft.end_auxiliary_pos.ordinal();
    }
    public int GetEndAux2Order(){
        return F1SubLeft.end_auxiliary_pos2.ordinal();
    }
    public int GetEndAux3Order(){
        return F1SubLeft.end_auxiliary_pos3.ordinal();
    }
    public int GetEndAux4Order(){
        return F1SubLeft.end_auxiliary_pos4.ordinal();
    }
}