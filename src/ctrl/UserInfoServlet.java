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
 * Servlet implementation class UserInfoServlet
 */
@WebServlet("/UserInfoServlet")
public class UserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().append("InfoServlet,Served at: ").append(request.getContextPath());*/
		int id = (int) request.getSession().getAttribute("uid");
		String  uname = (String) request.getParameter("uname");
		String uaccount = request.getParameter("uaccount");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		Users u = new Users();
		u.setUid(id);
		u.setUname(uname);
		u.setUaccount(uaccount);
		u.setPassword(password);
		u.setPhone(phone);
		u.setAddress(address);
		UserService userService = new UserService();
		boolean flag = userService.modify(u);
		if(flag){
			
			response.sendRedirect("./login.jsp");
		}else{
			response.sendRedirect("./login.jsp");
			
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
