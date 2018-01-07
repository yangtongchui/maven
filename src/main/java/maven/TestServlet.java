package maven;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//first
		//second
		//third	
		super.doGet(req, resp);
		String s;
		s.equals("123");
		System.out.println("--------------3333333--------------------");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
