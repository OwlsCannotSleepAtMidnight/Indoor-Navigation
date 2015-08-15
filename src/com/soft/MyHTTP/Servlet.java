package com.soft.MyHTTP;

import com.GetPositionClient.GetPositionClient;
import com.Path.DefinedVertex.SubNumber;
import com.Path.Dijkstra.SubGraph.Floor;
import com.Path.Dijkstra.SubGraph.LoadMethod;
import com.Path.Dijkstra.SubGraph.Vertex;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by toy on 15-4-6.
 */
@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    String same = new String();
    String final_Path = new String();
    @Override
    public void init() throws ServletException {
        LoadMethod.loadAll();
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



        Floor graph = Floor.getFloor(SubNumber.B1Sub);

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
            String nowpath=System.getProperty("user.dir");
            try {
                out.println(nowpath);

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
                Vertex final_Start, final_End;
                final_Start=String2Vertex(start,"ThisPoint");
                final_End=String2Vertex(end,"Destination");
                FinalRoute finalRoute=new FinalRoute(final_Start,final_End);
                final_Path=finalRoute.CreateFinalPath();
                out.print(final_Path);
            }
        }

        if(name.equals("getPartPath")){
            String tmp = request.getParameter("Points");
            if(same.equals(tmp)){
                out.print(final_Path);
            } else {
                same = tmp;
                String arr_str[] = request.getParameter("Points").split("/");
                start = arr_str[0].replaceAll("\\s", "");
                end = arr_str[1].replaceAll("\\s", "");
                Vertex final_Start, final_End;
                final_Start=String2Vertex(start,"ThisPoint");
                final_End=String2Vertex(end,"Destination");
                FinalMonoRoute  finalPartRoute=new FinalMonoRoute (final_Start,final_End);
                final_Path=finalPartRoute.CreateFinalPath();
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
