package ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.PageBean;
import model.Shops;

import net.sf.json.JSONArray;
import service.ShowShopsService;

/**
 * Servlet implementation class TestServlet
 */

@WebServlet("/showShopsServlet")


public class ShowShopsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowShopsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	private PageBean pagebean = new  PageBean();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");// 
		int page = 1;
		if(request.getParameter("page")!=null){
			page = Integer.parseInt(request.getParameter("page"));
		}
		System.out.println(name);
		System.out.println(page);
		pagebean.setPage(page);
		
		ArrayList<Shops> shops = new ArrayList<Shops>();
		ShowShopsService showShopsService  =new ShowShopsService();
		shops = showShopsService.QueryShopsByPage(pagebean);
		
		
		JSONArray jsonUsers = JSONArray.fromObject(shops);
		out.println(jsonUsers.toString());
		//System.out.println(jsonUsers.toString());
        out.flush();
        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
