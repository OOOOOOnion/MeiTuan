package ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Shops;
import model.Users;
import service.SjRegisterService;
import service.UserService;

/**
 * Servlet implementation class UserRegisteServlet
 */
@WebServlet("/SjRegisterServlet")
public class SjRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SjRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sname = request.getParameter("sjname");
		String saccount = request.getParameter("sjaccount");
		String password = request.getParameter("password");	
		System.out.println(sname);
		System.out.println(saccount);
		System.out.println(password);


		Shops s = new Shops();
		s.setSname(sname);
		s.setSaccount(saccount);
		s.setPassword(password);
		
		SjRegisterService ss = new SjRegisterService();
		boolean flag = ss.register(s);
		if(flag){
			System.out.println("注册成功");
			request.getRequestDispatcher("./sjLogin.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("./Sjregister.jsp").forward(request, response);
			
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
