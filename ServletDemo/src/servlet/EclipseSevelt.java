package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EclipseSevelt
 */
@WebServlet("/EclipseSevelt")
public class EclipseSevelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EclipseSevelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("处理get请求");
		PrintWriter out = response.getWriter();
		out.append("Served at: ").append(request.getContextPath());
		out.println();
		out.println("<string>Hello lover</strong>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO Auto-generated method stub
		System.out.println("处理post请求");
		PrintWriter out = response.getWriter();
		out.append("Served at: ").append(request.getContextPath());
		out.println();
		out.println("<string>Hello lover！</strong>");
	}

}
