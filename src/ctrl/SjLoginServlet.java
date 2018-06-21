package ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Shops;
import model.Users;
import service.SjLoginService;
import service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/SjLoginServlet")
public class SjLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SjLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String sjaccount = request.getParameter("uaccount");
		String sjpassword = request.getParameter("password");
		String  autologin = request.getParameter("autologin") ;
		Shops shops=new Shops();
		shops.setSaccount(sjaccount);
		shops.setPassword(sjpassword);
		SjLoginService sjloginservice=new SjLoginService();
		Shops exitssj = sjloginservice.sjlogin(shops);
		System.out.println(exitssj);
		if(exitssj!=null){
			session.setAttribute("sjid", exitssj.getSid());
			session.setAttribute("sjname", exitssj.getSname());
			session.setAttribute("sj", exitssj);
			request.getRequestDispatcher("/ShopBackstage/shopframeset.jsp").forward(request, response);
		}else{
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
