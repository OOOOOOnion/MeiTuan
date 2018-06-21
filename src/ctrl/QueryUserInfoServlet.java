package ctrl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Users;
import service.QueryUserInfoService;

/**
 * Servlet implementation class QueryUserInfoServlet
 */
@WebServlet("/QueryUserInfoServlet")
public class QueryUserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryUserInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		QueryUserInfoService qs=new QueryUserInfoService();
		ArrayList<Users> list = null;
		 try {
			 list = (ArrayList<Users>)qs.queryAllUser();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		 request.setAttribute("userList", list);
		 System.out.println(list);
		 request.getRequestDispatcher("/frameset/UserInfo.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
