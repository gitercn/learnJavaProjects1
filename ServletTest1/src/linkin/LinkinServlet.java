package linkin;
 
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class LinkinServlet extends HttpServlet
{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
 
	@Override
	public void init() throws ServletException
	{
		System.out.println("init...");
	}
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		
		out.write("test test");
	}
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		this.doGet(req, resp);
	}
	
	
 
}
