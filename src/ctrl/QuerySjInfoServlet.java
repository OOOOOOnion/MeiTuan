package ctrl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Shops;
import model.Users;
import service.QuerySjInfoService;
import service.QueryUserInfoService;

/**
 * Servlet implementation class QuerySjInfoServlet
 */
@WebServlet("/QuerySjInfoServlet")
public class QuerySjInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuerySjInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		QuerySjInfoService qs=new QuerySjInfoService();
		ArrayList<Shops> list = null;
		 try {
			 list = (ArrayList<Shops>)qs.queryAllSj();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		 request.setAttribute("sjList", list);
		 System.out.println(list);
		 request.getRequestDispatcher("/frameset/SjInfo.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
