package com.kys.jsptag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HelloTag extends SimpleTagSupport {
	StringWriter sw = new StringWriter();
	
	private String message = null;
	private Boolean required = null;
	
	@Override
	public void doTag() throws JspException, IOException {
		//空标签
//		JspWriter out = this.getJspContext().getOut();
//		out.println("Hello Custom Tag!");
		//访问标签体
//		this.getJspBody().invoke(sw);
//		this.getJspContext().getOut().println(sw.toString());
		
		//自定义标签属性
		if(message != null){
			this.getJspContext().getOut().println(message);
		}else{
			this.getJspBody().invoke(sw);
			this.getJspContext().getOut().println(sw.toString());
		}
		
		System.out.println(this.required);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

}
