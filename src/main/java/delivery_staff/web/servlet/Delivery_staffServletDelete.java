package delivery_staff.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import delivery_staff.dao.Delivery_staffDao;
import delivery_staff.domain.Delivery_staff;


/**
 * Servlet implementation class UserServlet
 */

public class Delivery_staffServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delivery_staffServletDelete() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		Delivery_staffDao Delivery_staffDao = new Delivery_staffDao();
		Delivery_staff delivery_staff = null;
		

		if(method.equals("search"))
		{
			try {
				delivery_staff = Delivery_staffDao.findBydelivery_id(request.getParameter("delivery_id"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			if(delivery_staff.getDelivery_id()!=null){
						System.out.println(delivery_staff);
						request.setAttribute("delivery staff", delivery_staff);
						request.getRequestDispatcher("/jsps/delivery_staff/delivery_staff_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("msg", "Delivery Staff not found");
				request.getRequestDispatcher("/jsps/delivery_staff/delivery_staff_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				Delivery_staffDao.delete(request.getParameter("delivery_id"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Delivery Staff Deleted");
			request.getRequestDispatcher("/jsps/delivery_staff/delivery_staff_read_output.jsp").forward(request, response);
		}
	}	
}
