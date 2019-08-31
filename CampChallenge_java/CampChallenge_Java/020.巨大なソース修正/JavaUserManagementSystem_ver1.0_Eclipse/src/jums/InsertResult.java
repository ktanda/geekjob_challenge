package jums;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InsertResult
 */
@WebServlet("/InsertResult")
public class InsertResult extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertResult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//セッションスタート
        HttpSession session = request.getSession();
        request.setCharacterEncoding("UTF-8");
        try{
            String accesschk = request.getParameter("ac");
            if(accesschk ==null || (Integer)session.getAttribute("ac")!=Integer.parseInt(accesschk)){
                throw new Exception("不正なアクセスです");
            }
            System.out.println("udb");
            //ユーザー情報に対応したJavaBeansオブジェクトに格納していく
            UserDataDTO userdata = new UserDataDTO();
            UserDataBeans udb = (UserDataBeans)session.getAttribute("udb");

            userdata.setName(udb.getname());
            Calendar birthday = Calendar.getInstance();
            birthday.set(Integer.parseInt(udb.getyear()),Integer.parseInt(udb.getmonth())-1,Integer.parseInt(udb.getday()));
            userdata.setBirthday(birthday.getTime());
            userdata.setType(Integer.parseInt(udb.gettype()));
            userdata.setTell(udb.gettell());
            userdata.setComment(udb.getcomment());

            //DBへデータの挿入
            UserDataDAO .getInstance().insert(userdata);

            session.invalidate();
            request.setAttribute("udb", udb);

            request.getRequestDispatcher("/insertresult.jsp").forward(request, response);
        }catch(Exception e){
            //データ挿入に失敗したらエラーページにエラー文を渡して表示
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
