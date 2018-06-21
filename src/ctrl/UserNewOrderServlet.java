package ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.DingdanService;

/**
 * Servlet implementation class UserNewOrderServlet
 */
@WebServlet("/UserNewOrderServlet")
public class UserNewOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserNewOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*System.out.println(111);*/
		HttpSession session = request.getSession();
		int sid =  Integer.parseInt(request.getParameter("sjid")) ;
		int uid =0;
		if(session.getAttribute("uid")!=null){
			uid = (int) session.getAttribute("uid");
		}else{
			request.getRequestDispatcher("./login.jsp").forward(request, response);
			
		}
		DingdanService dingdanService = new DingdanService();
		dingdanService.creatOrderByUser(uid,sid);
		request.getRequestDispatcher("./meituan.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
