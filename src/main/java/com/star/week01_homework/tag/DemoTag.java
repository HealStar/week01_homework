package com.star.week01_homework.tag;

import com.sun.xml.internal.ws.client.RequestContext;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 演示标签
 *
 * @author star
 * @date 2021/07/08
 */
public class DemoTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        String author = "I am star.This is self-defined taglib";
        String tip = "下次争取按时交作业";
        PrintWriter out = new PrintWriter(getJspContext().getOut());
        out.println("<h1>" + author + "</h1>");
        out.println("<h1>" + tip + "</h1>");
    }
}
