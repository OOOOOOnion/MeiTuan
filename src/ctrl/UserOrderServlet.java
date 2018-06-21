package ctrl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.PageBean;
import model.Order;

import service.UserOrderService;
import service.UserService;

/**
 * Servlet implementation class UserOrderServlet
 */
@WebServlet("/UserOrderServlet")
public class UserOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int page = 0;
		if(request.getParameter("page") != null){
		 page = Integer.parseInt(request.getParameter("page"));
		}
		if(page < 1){
			page = 1;
		}
		
		PageBean pageBean = new PageBean();
		pageBean.setPage(page);
		pageBean.setPagesize(5);
		UserOrderService userOrderService = new UserOrderService();
		int size= userOrderService.QueryAllOrder();
		
		pageBean.setTotalpage(size/5+1);
		if(page > pageBean.getTotalpage()){
			pageBean.setPage( pageBean.getTotalpage());
		}
		ArrayList<Order> list = userOrderService.QueryOrderByPage(pageBean);
		request.setAttribute("OrderList", list);
		request.setAttribute("pageBean", pageBean);
		System.out.println(pageBean);
		request.getRequestDispatcher("uinfo/myorder.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
