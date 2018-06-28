package com.huan;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;
public class ServletPracticeOne implements Servlet
{
	
	public void init(ServletConfig config)
          throws ServletException{
			  System.out.print("  init()...");
	}

		public ServletConfig getServletConfig(){
		return null;
	}

	public void service(ServletRequest req,
                    ServletResponse res)
             throws ServletException,
                    java.io.IOException{
						System.out.print("  service()...");
				PrintWriter writer = res.getWriter();
				writer.print("ServletPracticeOne===<font size = \"6\" color = \"pink\">huan</font>  "+new Date());
	}
		public java.lang.String getServletInfo(){
		return null;
	}
	public void destroy(){
		System.out.print("  destroy()...");
	}
}