package com.soft.MyHTTP;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.GetPositionClient.*;
import com.Path.Dijkstra.SubGraph.B1SubFloor;
import com.Path.Dijkstra.SubGraph.Floor;
import com.Path.Dijkstra.SubGraph.Vertex;
import com.Path.monolayer.Floor_1;
import com.Path.monolayer.Floor_2;
import com.Path.monolayer.Floor_G1;

/**
 * Created by toy on 15-4-6.
 */
@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    String same = new String();
    String final_Path = new String();
    @Override
    public void init() throws ServletException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("action");
        GetPositionClient agent_client = new GetPositionClient();
        String str;
        String start;
        String end;



        Floor graph = new B1SubFloor(0);

        if (name.equals("locate")) {
            try {
                str = agent_client.GetPosition();
                str = str.replaceAll("\\[", "");
                str = str.replaceAll("\\]", "");
                str = str.replaceAll("\\s", "");
                out.println(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (name.equals("test")) {
            try {
//                graph.AnalyzeVertex("[0.11, 0.1, 0.0]",0);
//                graph.AnalyzeVertex("[0.72, 0.37, 0.0]",1);
//                graph.InitializeStartEnd();
//                out.println(graph.GetArrList());
                out.print("0.1,0.2,0.0");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(name.equals("getPath")){
            String tmp = request.getParameter("Points");
            if(same.equals(tmp)){
                out.print(final_Path);
            } else {
                same = tmp;
                String arr_str[] = request.getParameter("Points").split("/");
                start = arr_str[0].replaceAll("\\s", "");
                end = arr_str[1].replaceAll("\\s", "");
                //graph.AnalyzeVertex(start, 0);
               // graph.AnalyzeVertex(end, 1);
               // graph.InitializeStartEnd();
                //final_Path = graph.GetArrList();
               // out.print(final_Path);
                Vertex final_Start, final_End;
                final_Start=String2Vertex(start,"ThisPoint");
                final_End=String2Vertex(end,"Destination");
                FinalRoute finalRoute=new FinalRoute(final_Start,final_End);
                final_Path=finalRoute.CreateFinalPath();
                out.print(final_Path);
            }
        }

    }

    protected Vertex String2Vertex(String str,String name){
        str = str.replaceAll("\\[", "");
        str = str.replaceAll("\\]", "");
        str = str.replaceAll("\\s", "");
        String xyz[] = str.split(",");
        double pos_x = Double.valueOf(xyz[0]);
        double pos_y = Double.valueOf(xyz[1]);
        double pos_z = Double.valueOf(xyz[2]);
        return new Vertex(name,pos_x, pos_y, pos_z);
    }


}
