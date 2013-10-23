package web.requests;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class RequestManager {
	HttpServletRequest request;
	HttpServletResponse response;
	
	public RequestManager(HttpServletRequest req, HttpServletResponse resp) {
		this.request = req;
		this.response = resp;
	}
	
	public abstract void request();
	
	public void forward(String url) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(url);
		
		request();
		
		rd.forward(request, response);
		return;
	}
}
