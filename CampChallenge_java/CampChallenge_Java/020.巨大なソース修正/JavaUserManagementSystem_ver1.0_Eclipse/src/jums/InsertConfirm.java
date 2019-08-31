package jums;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InsertConfirm
 */
@WebServlet("/InsertConfirm")
public class InsertConfirm extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertConfirm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
            HttpSession session = request.getSession();
            request.setCharacterEncoding("UTF-8");//セッションに格納する文字コードをUTF-8に変更
            String accesschk = request.getParameter("ac");
            if(accesschk ==null || (Integer)session.getAttribute("ac")!=Integer.parseInt(accesschk)){
                throw new Exception("不正なアクセスです");
            }

            UserDataBeans udb = new UserDataBeans();
            udb.setname(request.getParameter("name"));
            udb.setyear(request.getParameter("year"));
            udb.setmonth(request.getParameter("month"));
            udb.setday(request.getParameter("day"));
            udb.settype(request.getParameter("type"));
            udb.settell(request.getParameter("tell"));
            udb.setcomment(request.getParameter("comment"));

            //フォームからの入力を取得
            //String name = request.getParameter("name");
            //String year = request.getParameter("year");
            //String month = request.getParameter("month");
            //String day = request.getParameter("day");
            //String type = request.getParameter("type");
            //String tell = request.getParameter("tell");
            //String comment = request.getParameter("comment");

            //セッションに格納
            session.setAttribute("udb", udb);
            //session.setAttribute("year", year);
            //session.setAttribute("month",month);
            //session.setAttribute("day", day);
            //session.setAttribute("type", type);
            //session.setAttribute("tell", tell);
            //session.setAttribute("comment", comment);
            System.out.println("Session updated!!");

          //  session.setAttribute("ac2", (int) (Math.random() * 1000));

            request.getRequestDispatcher("/insertconfirm.jsp").forward(request, response);
        }catch(Exception e){
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
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
