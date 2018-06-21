package ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Shops;
import service.ShopInfoService;

/**
 * Servlet implementation class ShopInfoServlet
 */
@WebServlet("/ShopInfoServlet")
public class ShopInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		int sid = (int)session.getAttribute("sjid");
		String  sname = request.getParameter("sname");
		String  saccount = request.getParameter("saccount");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		double startprice =0.0;
		if(request.getParameter("startprice")!=null){
			startprice = Double.parseDouble(request.getParameter("startprice"));
		}
		 
		double deliveryfee =0;
		if(request.getParameter("deliverytime")!=null){
			deliveryfee = Double.parseDouble(request.getParameter("deliveryfee"));
		}
		double deliverytime = 0;
		if(request.getParameter("deliverytime")!=null){
			deliverytime =Double.parseDouble(request.getParameter("deliverytime"));
			
		}
		
		Shops s = new Shops();
		s.setSid(sid);
		s.setSname(sname);
		s.setSaccount(saccount);

		s.setPassword(password);
		s.setPhone(phone);
		s.setAddress(address);
		s.setDeliveryfee(deliveryfee);
		s.setDeliverytime(deliverytime);
		s.setStartprice(startprice);
		ShopInfoService shopInfoService = new ShopInfoService();
		System.out.println(s);
		boolean flag = shopInfoService.modify(s);
		if(flag){
			session.removeAttribute("sjid");
			session.removeAttribute("sjname");
			session.removeAttribute("sj");
			request.getRequestDispatcher("/sjLogin.jsp").forward(request, response);
		}else{
			session.removeAttribute("sjid");
			session.removeAttribute("sjname");
			session.removeAttribute("sj");
			request.getRequestDispatcher("/sjLogin.jsp").forward(request, response);
		}
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
