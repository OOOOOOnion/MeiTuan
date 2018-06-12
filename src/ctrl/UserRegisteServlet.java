package ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Users;
import service.UserService;

/**
 * Servlet implementation class UserRegisteServlet
 */
@WebServlet("/UserRegisteServlet")
public class UserRegisteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegisteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uaccount = request.getParameter("uaccount");
		String password = request.getParameter("password");
		System.out.println(uaccount);
		System.out.println(password);
		
		Users regu = new Users();
		regu.setUaccount(uaccount);
		regu.setPassword(password);
		UserService userService = new UserService();
		boolean flag = userService.register(regu);
		if(flag){
			
			request.getRequestDispatcher("./login.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("./register.jsp").forward(request, response);
			
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
