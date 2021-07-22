package service;

import core.dao.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

public abstract class BaseServlet extends HttpServlet {

    protected Connection conn;

    private HttpServletRequest request;

    protected abstract void onGetRequest();

    protected abstract String onResponse();

    protected abstract void onFinished();

    protected String getParams(String field){
        return request.getParameter(field);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        onGetRequest();

        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");

        request = req;
        conn = DBUtil.getConnection();

        PrintWriter pw=resp.getWriter();
        pw.write(onResponse());

        pw.close();
        DBUtil.close();

        onFinished();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

        onGetRequest();

        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");

        request = req;
        conn = DBUtil.getConnection();

        PrintWriter pw=resp.getWriter();
        pw.write(onResponse());

        pw.close();
        DBUtil.close();

        onFinished();
    }
}
