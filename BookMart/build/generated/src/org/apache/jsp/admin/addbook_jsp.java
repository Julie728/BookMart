package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.pitt.domain.Category;
import edu.pitt.domain.Book;

public final class addbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Book Page</title>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            \n");
      out.write("                var dtCh = \"/\";\n");
      out.write("                var minYear = 1900;\n");
      out.write("                var maxYear = 2100;\n");
      out.write("\n");
      out.write("                function isInteger(s) {\n");
      out.write("                    var i;\n");
      out.write("                    for (i = 0; i < s.length; i++) {\n");
      out.write("                        // Check that current character is number.\n");
      out.write("                        var c = s.charAt(i);\n");
      out.write("                        if (((c < \"0\") || (c > \"9\")))\n");
      out.write("                            return false;\n");
      out.write("                    }\n");
      out.write("                    // All characters are numbers.\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function stripCharsInBag(s, bag) {\n");
      out.write("                    var i;\n");
      out.write("                    var returnString = \"\";\n");
      out.write("                    // Search through string's characters one by one.\n");
      out.write("                    // If character is not in bag, append to returnString.\n");
      out.write("                    for (i = 0; i < s.length; i++) {\n");
      out.write("                        var c = s.charAt(i);\n");
      out.write("                        if (bag.indexOf(c) === -1)\n");
      out.write("                            returnString += c;\n");
      out.write("                    }\n");
      out.write("                    return returnString;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function daysInFebruary(year) {\n");
      out.write("                    // February has 29 days in any year evenly divisible by four,\n");
      out.write("                    // EXCEPT for centurial years which are not also divisible by 400.\n");
      out.write("                    return (((year % 4 === 0) && ((!(year % 100 === 0)) || (year % 400 === 0))) ? 29 : 28);\n");
      out.write("                }\n");
      out.write("                function DaysArray(n) {\n");
      out.write("                    for (var i = 1; i <= n; i++) {\n");
      out.write("                        this[i] = 31;\n");
      out.write("                        if (i === 4 || i === 6 || i === 9 || i === 11) {\n");
      out.write("                            this[i] = 30;\n");
      out.write("                        }\n");
      out.write("                        if (i === 2) {\n");
      out.write("                            this[i] = 29;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                    return this;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function isDate(dtStr) {\n");
      out.write("                    var daysInMonth = DaysArray(12);\n");
      out.write("                    var pos1 = dtStr.indexOf(dtCh);\n");
      out.write("                    var pos2 = dtStr.indexOf(dtCh, pos1 + 1);\n");
      out.write("                    var strMonth = dtStr.substring(0, pos1);\n");
      out.write("                    var strDay = dtStr.substring(pos1 + 1, pos2);\n");
      out.write("                    var strYear = dtStr.substring(pos2 + 1);\n");
      out.write("                    strYr = strYear;\n");
      out.write("                    if (strDay.charAt(0) === \"0\" && strDay.length > 1)\n");
      out.write("                        strDay = strDay.substring(1);\n");
      out.write("                    if (strMonth.charAt(0) === \"0\" && strMonth.length > 1)\n");
      out.write("                        strMonth = strMonth.substring(1);\n");
      out.write("                    for (var i = 1; i <= 3; i++) {\n");
      out.write("                        if (strYr.charAt(0) === \"0\" && strYr.length > 1)\n");
      out.write("                            strYr = strYr.substring(1);\n");
      out.write("                    }\n");
      out.write("                    month = parseInt(strMonth);\n");
      out.write("                    day = parseInt(strDay);\n");
      out.write("                    year = parseInt(strYr);\n");
      out.write("                    if (pos1 === -1 || pos2 === -1) {\n");
      out.write("                        alert(\"The date format should be : mm/dd/yyyy\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    if (strMonth.length < 1 || month < 1 || month > 12) {\n");
      out.write("                        alert(\"Please enter a valid month\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    if (strDay.length < 1 || day < 1 || day > 31 || (month === 2 && day > daysInFebruary(year)) || day > daysInMonth[month]) {\n");
      out.write("                        alert(\"Please enter a valid day\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    if (strYear.length !== 4 || year === 0 || year < minYear || year > maxYear) {\n");
      out.write("                        alert(\"Please enter a valid 4 digit year between \" + minYear + \" and \" + maxYear);\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    if (dtStr.indexOf(dtCh, pos2 + 1) !== -1 || isInteger(stripCharsInBag(dtStr, dtCh)) === false) {\n");
      out.write("                        alert(\"Please enter a valid date\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function checkDateFormat() {\n");
      out.write("                    var dt = document.getElementsByName(publishDate);\n");
      out.write("                    if (isDate(dt.value) === false) {\n");
      out.write("                        dt.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Add a new Book</h1>\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/BookServlet?method=add\" method=\"post\">\n");
      out.write("            Book Name:<input type=\"text\" name=\"name\"><br/>\n");
      out.write("            Author:<input type=\"text\" name=\"author\" ><br/>\n");
      out.write("            Publisher:<input type=\"text\" name=\"publisher\" ><br/>\n");
      out.write("            Publish date:<b>(mm/dd/yyyy)</b><input type=\"text\" name=\"publishDate\" maxlength=\"10\" size=\"15\" onblur=\"checkDateFormat()\"><br/>\n");
      out.write("            Price:<input type=\"text\" name=\"price\" ><br/>\n");
      out.write("            <!--Cover:<input type=\"file\" name=\"cover\"><br/>-->\n");
      out.write("            Category:<select name=\"category\">\n");
      out.write("                ");

                    Category category = new Category();
                    String[] categoryList = category.getAllCategory();
                    for(String categoryName: categoryList){
                    out.println("<option value='"+categoryName+"'>"+categoryName+"</option>");
                    }
                
      out.write("\n");
      out.write("            </select><br />\n");
      out.write("            Description: <br /><textarea rows=\"5\" cols=\"80\" name=\"description\"></textarea><br/>\n");
      out.write("            <input type=\"submit\" value=\"Add\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
