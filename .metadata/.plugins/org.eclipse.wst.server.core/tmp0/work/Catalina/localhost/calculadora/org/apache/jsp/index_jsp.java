package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function ponerValor(valorBoton) {\r\n");
      out.write("\tvar numero_uno = document.getElementById('numero_uno').value;\r\n");
      out.write("\tvar numero_dos = document.getElementById('numero_dos').value;\r\n");
      out.write("\tvar operacion = document.getElementById('operacion').value;\r\n");
      out.write("//(condicion)?si:sino\r\n");
      out.write("\tif(operacion == \"\") {\r\n");
      out.write("\t\tdocument.getElementById('numero_uno').value+=valorBoton;\r\n");
      out.write("\t}\r\n");
      out.write("\telse {\r\n");
      out.write("\t\tdocument.getElementById('numero_dos').value+=valorBoton;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write(" function ponerOperador(oper) {\r\n");
      out.write("\t document.getElementById('operacion').value=oper;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"CalculadoraServlet\" method=\"POST\">\r\n");
      out.write("\t\tPrimer Número: <input style=\"margin-left: 0.9% !important\" type=\"text\" id=\"numero_uno\" name=\"numero_uno\"><br>\r\n");
      out.write("\t\tOperación: <input style=\"margin-left: 3.4% !important\" type=\"text\" id=\"operacion\" name=\"operacion\"><br>\r\n");
      out.write("\t\tSegundo Número: <input style=\"margin-left: 0% !important\" type=\"text\" id=\"numero_dos\" name=\"numero_dos\"><br>\r\n");
      out.write("\t\t<br><input type=\"submit\" value=\"Calcular\">\r\n");
      out.write("\t</form><br>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<input type=\"button\" value=\"+\" onClick=\"ponerOperador('+')\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"-\" onClick=\"ponerOperador('-')\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"*\" onClick=\"ponerOperador('*')\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"/\" onClick=\"ponerOperador('/')\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"Raíz\" onClick=\"ponerOperador('r')\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div><br>\r\n");
      out.write("\t\t<input type=\"button\" value=\"1\" onClick=\"ponerValor('1')\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"2\" onClick=\"ponerValor('2')\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"3\" onClick=\"ponerValor('3')\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<input type=\"button\" value=\"4\" onClick=\"ponerValor('4')\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"5\" onClick=\"ponerValor('5')\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"6\" onClick=\"ponerValor('6')\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<input type=\"button\" value=\"7\" onClick=\"ponerValor('7')\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"8\" onClick=\"ponerValor('8')\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"9\" onClick=\"ponerValor('9')\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<input style=\"margin-left: 2.03% !important\" type=\"button\" value=\"0\" onClick=\"ponerValor('0')\">\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
