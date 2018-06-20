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
import model.Shops;
import net.sf.json.JSONArray;
import service.GouWuCheService;
import service.ShowShopsService;
import service.SjToSpService;

/**
 * Servlet implementation class SjToSpServlet
 */
@WebServlet("/SjToSpServlet")
public class SjToSpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SjToSpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		SjToSpService stss=new SjToSpService();
		 String sid =request.getParameter("sid");
		 int ssid=Integer.parseInt(sid);
		 Shops shops=new Shops();
	     shops.setSid(ssid);
	     
	     
	      ArrayList<Shops> list = null;
			 try {
				 list = (ArrayList<Shops>)stss.sjtosp(shops);
			} catch (Exception e) {
				e.printStackTrace();
			}
			 JSONArray jsonlist = new JSONArray();
			 jsonlist.addAll(list);
			 out.println(jsonlist);
			 out.flush();
		        out.close();
			 //request.getRequestDispatcher("/meituan/ZunBaoPizza.jsp").forward(request, response);
	}

}
