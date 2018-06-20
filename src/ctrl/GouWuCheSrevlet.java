package ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dingdan;
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
		doPost(request, response);
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		GouWuCheService gs=new GouWuCheService();
		  String name = request.getParameter("name");
	      String price  = request.getParameter("price");
	      String pic = request.getParameter("pic");
	      String id = request.getParameter("ddid");
	      String num = request.getParameter("ddnum");
	      Dingdan dingdan=new Dingdan();
	      dingdan.setDdid(id);
	      dingdan.setDdname(name);
	      dingdan.setDdprice(price);
	      dingdan.setDdpic(pic);
	      dingdan.setDdnum(num);
	      gs.addsp(dingdan);
	}

}
