package ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Users;
import service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String uaccount = request.getParameter("uaccount");
		String password = request.getParameter("password");
		System.out.println(uaccount);
		System.out.println(password);
		String  autologin = request.getParameter("autologin") ;
		Users loginu = new Users();
		loginu.setUaccount(uaccount);
		loginu.setPassword(password);
		UserService userService = new UserService();
		Users exitsu = userService.login(loginu);
		if(exitsu!=null){
			session.setAttribute("uname", exitsu.getUname());
			request.getRequestDispatcher("./meituan.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("./login.jsp").forward(request, response);
			
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
