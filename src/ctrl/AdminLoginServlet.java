package ctrl;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Admin;
import model.Users;
import service.UserService;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		System.out.println(account);

		Admin admin = new Admin();
		admin.setAdminaccount(account);
		admin.setAdminpassword(password);
		UserService userService = new UserService();
		Admin adminexits;
		try {
			adminexits = userService.adminlogin(admin);
			if(adminexits!=null){
				session.setAttribute("adminaccount", adminexits.getAdminaccount());
				session.setAttribute("adminpassword",adminexits.getAdminpassword());
				session.setAttribute("adminid",adminexits.getAdminid());
				request.getRequestDispatcher("/frameset/frameset.jsp").forward(request, response);
			}
			else{
				request.getRequestDispatcher("./Admin.jsp").forward(request, response);}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
