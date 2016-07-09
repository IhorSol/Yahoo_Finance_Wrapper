package Servlet;

import ParsingUtils.Parser;
import ParsingUtils.Rate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

/**
 * @author Ihor Solohub.
 */

public class ParsingServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String beginning = "";
        String[] values = request.getParameterValues("currency");
        for (int i = 0; i<values.length; i++){
            if (i!=values.length-1) {
                beginning = beginning + "\"" + values[i] + "\"" + ",";
            } else {
                beginning = beginning + "\""+values[i]+"\"";
            }
        }
        String queryString = "http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20("+beginning+")&env=store://datatables.org/alltableswithkeys";
        try {
            ParsingUtils.Query query = Parser.parsFinance(queryString);
//            response.getWriter().println(query.getResults().getRateList());

            List<Rate> rates = query.getResults().getRateList();
            request.setAttribute("list", rates);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/result.jsp");
            dispatcher.forward(request, response);
            response.sendRedirect("http://localhost:18080/result.jsp");
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }

    }

}
