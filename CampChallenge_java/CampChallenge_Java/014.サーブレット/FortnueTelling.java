package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class FortnueTelling
 */
@WebServlet("/FortnueTelling")
public class FortnueTelling extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FortnueTelling() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");

		String luckList[] = {"大吉", "中吉", "吉", "半吉", "末小吉", "凶", "小凶", "半凶", "末凶", "凶", "大凶"};
		Random rand = new Random();
		//乱数所得
		Integer index = rand.nextInt(luckList.length);

		ResultData data = new ResultData();
		data.setD(new Date());
		data.setLuck(luckList[index]);
		request.setAttribute("DATA", data);

		String result = "/WEB-INF/jsp/FortuneTellingResult.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(result);
		rd.forward(request, response);

		try (PrintWriter out = response.getWriter()) {

	        out.println("あなたの運勢は…" + luckList[index]);
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
