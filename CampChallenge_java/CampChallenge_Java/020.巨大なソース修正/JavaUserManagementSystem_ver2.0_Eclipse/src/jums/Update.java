package jums;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hayashi-s
 */
public class Update extends HttpServlet {

	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("UTF-8");
            //DTOオブジェクトにマッピング。DB専用のパラメータに変換
            UserDataDTO searchData = new UserDataDTO();
            searchData.setUserID(Integer.parseInt(request.getParameter("id")));

            UserDataDTO resultData = UserDataDAO .getInstance().searchByID(searchData);
            UserDataBeans udb = new UserDataBeans();
            udb.UD3DTOMapping(resultData);
            request.setAttribute("udb", udb);
            request.setAttribute("searchData",searchData);
            request.getRequestDispatcher("/update.jsp").forward(request, response);

		}catch(Exception e) {
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
