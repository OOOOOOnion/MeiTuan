package ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Gouwuche;
import net.sf.json.JSONArray;
import service.GouWuCheService;

/**
 * Servlet implementation class GouWuCheSrevlet
 */
@WebServlet("/GouWuCheServlet")
public class GouWuCheSrevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GouWuCheSrevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request, response);
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		int uid =0;
		if(session.getAttribute("uid")!=null){
			uid = (int) session.getAttribute("uid");
		}else{
			request.getRequestDispatcher("./login.jsp").forward(request, response);
			
		}
		int sjid =  Integer.parseInt(request.getParameter("sjid")) ;
		int spid =  Integer.parseInt(request.getParameter("spid")) ;
		String spname = request.getParameter("spname");
		int price =  Integer.parseInt(request.getParameter("price")) ;
		Gouwuche gouwuche  = new Gouwuche();
		gouwuche.setSjid(sjid);
		gouwuche.setSpid(spid);
		gouwuche.setUid(uid);
		gouwuche.setSpname(spname);
		gouwuche.setPrice(price);
		System.out.println(spname);
	/*	System.out.println(gouwuche);*/
		GouWuCheService gouWuCheService=new GouWuCheService();
		 ArrayList<Gouwuche> itemlist = gouWuCheService.addsp(gouwuche);
		 System.out.println(itemlist);
		 JSONArray jsonitem = JSONArray.fromObject(itemlist);
			out.println(jsonitem.toString());
			//System.out.println(jsonUsers.toString());
	        out.flush();
	        out.close();
		 
	}

}
