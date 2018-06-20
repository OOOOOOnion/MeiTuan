package ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GouWuChe;
import net.sf.json.JSONObject;
import service.GouWuCheService;

/**
 * Servlet implementation class GouWuCheSrevlet
 */
@WebServlet("/GouWuCheSrevlet")
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		GouWuCheService gs=new GouWuCheService();
		  String name = request.getParameter("name");
	      String price  = request.getParameter("price");
	      String pic = request.getParameter("pic");
	      String id = request.getParameter("ddid");
	      String num = request.getParameter("ddnum");
	      GouWuChe gwc=new GouWuChe();
	      gwc.setGwcid(id);
	      gwc.setGwcname(name);
	      gwc.setGwcprice(price);
	      gwc.setGwcpic(pic);
	      gwc.setGwcnum(num);
	      gs.addsp(gwc);
	}

}
