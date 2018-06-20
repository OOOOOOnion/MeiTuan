package ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dingdan;
import model.Shangpin;
import model.Shops;
import net.sf.json.JSONArray;
import service.ShangpinService;

@WebServlet("/ShangpinServlet")
public class ShangpinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ShangpinService sps = new ShangpinService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String id=request.getParameter("sjid");
		 int sjid=Integer.parseInt(id);
		 Shangpin sp=new Shangpin();
	     sp.setSjid(sjid);
	     
		PrintWriter out = response.getWriter();
		ArrayList<Shangpin> list = null;
		 try {
			 list = (ArrayList<Shangpin>)sps.queryAllspInfo(sp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 JSONArray jsonsp = JSONArray.fromObject(list);
		 out.println(jsonsp);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
