/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-18 05:02:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Recursos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t \t<title>Asignación de recursos virtuales a los temas de una unidad didáctica</title>\t \t\r\n");
      out.write("\t\t<!-- Required meta tags -->\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1.0, shrink-to-fit=no\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Alert's -->\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write(" \"></script>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"  />\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Cargar Combos -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- PARA API YOUTUBE-->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\"  />\r\n");
      out.write("\t    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("\" />\t    \r\n");
      out.write("\t    <!-- Latest compiled and minified CSS -->\r\n");
      out.write("\t    <!-- <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\" > -->\r\n");
      out.write("\t    <link rel=\"stylesheet\" type=\"text/css\" href=\"http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\" >\r\n");
      out.write("\t    <script src=\"http://code.jquery.com/jquery-2.1.4.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t    <script src=\"http://code.jquery.com/ui/1.11.4/jquery-ui.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t    <!-- Underscore, backbone and pretty are used for displaying the json responce in user redable format -->\r\n");
      out.write("\t    <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f7(_jspx_page_context))
        return;
      out.write(" \"></script>\r\n");
      out.write("\t    <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f8(_jspx_page_context))
        return;
      out.write(" \"></script>\r\n");
      out.write("\t    <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f9(_jspx_page_context))
        return;
      out.write(" \"></script>\r\n");
      out.write("\t\t<!-- PARA API YOUTUBE-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f10(_jspx_page_context))
        return;
      out.write("\"  />\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t\tlimpiarListasSemanticas();\r\n");
      out.write("\t\t\t\tCargarAreasAcademicasDelAnioSeleccionado();\r\n");
      out.write("\t\t\t\tcargaUnidadesDelAreaSeleccionada();\r\n");
      out.write("\t\t\t\tcargaTemasDeLaUnidadSeleccionada();\r\n");
      out.write("\t\t\t    $(\"#formSelectAnios\").on( \"change\", function( event ) {\t\t\t    \t\r\n");
      out.write("\t\t\t    \tlimpiarListasSemanticas();\t\t\t    \t\r\n");
      out.write("\t\t\t    \t$(\"#list-temas\").html('<li href=\"#\" class=\"list-group-item title\"> Temas de la Unidad</li>');\r\n");
      out.write("\t\t\t    \tdocument.getElementById(\"hyv-search\").value = '';\t\r\n");
      out.write("\t\t\t    \t$('#formSelectUnidades').empty().append($('<option>').text('Seleccionar...').attr('value',''));\r\n");
      out.write("\r\n");
      out.write("\t\t\t    });\t\t\t\t\r\n");
      out.write("\t\t\t    $(\"#hyv-searchBtn\").on( \"click\", function( event ) {\t\t\t    \t\r\n");
      out.write("\t\t\t        youtubeApiCall();\r\n");
      out.write("\t\t\t        webApiCall();\r\n");
      out.write("\t\t\t        imageApiCall();\r\n");
      out.write("\t\t\t        document.getElementById(\"btnGuardarRecurso\").disabled = false;\r\n");
      out.write("\t\t\t        return false;\r\n");
      out.write("\t\t\t    });\t\r\n");
      out.write("\t    \r\n");
      out.write("\t\t\t\t   \t\t\t    \r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</script>\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body style=\"background-color:#314E7A;\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/menu.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"idTemaSeleccionado\" name=\"idTemaSeleccionado\" >\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t  <div class=\"col-xs-12 col-sm-6 col-md-12\">\r\n");
      out.write("\t\t\t\t  \t<div class=\"jumbotron_grv\"><h3>Asignación de Recursos Virtuales</h3></div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t  <div class=\"col-xs-6\">\r\n");
      out.write("\t\t\t\t\t  <div class=\"jumbotron\" style=\"height: 300px;\"><br>\t\t\t\t  \r\n");
      out.write("\t\t\t\t  \t\t<label class=\"label-control\">Año Escolar</label><BR>\t\t\t\t  \t\t\r\n");
      out.write("\t\t\t\t\t\t<select  name=\"formSelectAnios\" id=\"formSelectAnios\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t<BR><BR>\r\n");
      out.write("\t\t\t\t\t\t<label class=\"label-control\">Áreas Academicas</label><BR>\r\n");
      out.write("\t\t\t\t\t\t<select name=\"formSelectAreas\" id=\"formSelectAreas\" >\r\n");
      out.write("\t\t\t\t\t\t  <option>Seleccionar opción</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<BR><BR>\r\n");
      out.write("\t\t\t\t\t\t<label class=\"label-control\">Unidades Academicas</label><BR>\r\n");
      out.write("\t\t\t\t\t\t<select name=\"formSelectUnidades\" id=\"formSelectUnidades\" >\r\n");
      out.write("\t\t\t\t\t\t  <option>Seleccionar opción</option>\r\n");
      out.write("\t\t\t\t\t\t</select><br><br>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t                    <div class=\"col-md-10 col-md-offset-7\">\r\n");
      out.write("\t\t                        <button type=\"button\" onclick=\"Cancel();\" class=\"btn btn-danger\" id=\"btn-cancelar\">\r\n");
      out.write("\t\t                            Cancelar\r\n");
      out.write("\t\t                            <span class=\"glyphicon glyphicon-remove-sign\"></span>\r\n");
      out.write("\t\t                        </button>\t\r\n");
      out.write("\t\t                        <button  value=\"Guardar\" class=\"btn btn-primary\" id=\"btnGuardarRecurso\" disabled=\"disabled\" onclick=\"AsignarRecursosAlTema()\">\r\n");
      out.write("\t\t                            Guardar\r\n");
      out.write("\t\t                            <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("\t\t                        </button>\r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t\t\t\t  </div>\t\t\t\t\r\n");
      out.write("\t\t\t\t  </div>\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <div class=\"col-xs-6\">\t  \r\n");
      out.write("\t\t\t\t  \t<div class=\"jumbotron_grv\" style=\"height: 300px;\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"list-group\" id=\"list-temas\"><li href=\"#\" class=\"list-group-item title\"> Temas de la Unidad</li></ul>\r\n");
      out.write("\t\t\t\t  \t</div>\r\n");
      out.write("\t\t\t\t  </div>\t\t\t\t  \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div id=\"busqueda_semantica\" style=\"visibility: hidden;\" >\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"jumbotron_grv\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"container-4\">\t                        \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"search\" name=\"hyv-search\" id=\"hyv-search\" placeholder=\"Search...\" class=\"ui-autocomplete-input\" autocomplete=\"off\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"icon\" id=\"hyv-searchBtn\"></button>\t                        \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6 col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"hyv-watch-content\" class=\"hyv-watch-main-col hyv-card hyv-card-has-padding\">\r\n");
      out.write("\t\t\t\t\t\t\t\t    <ul id=\"hyv-watch-related\" class=\"hyv-video-list\"></ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>  \t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6 col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"hyv-watch-content\" class=\"hyv-watch-main-col hyv-card hyv-card-has-padding\">\r\n");
      out.write("\t\t\t\t\t\t\t\t    <ul id=\"hyv-see-related\" class=\"hyv-video-list\"></ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>  \t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6 col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"hyv-watch-content\" class=\"hyv-watch-main-col hyv-card hyv-card-has-padding\">\r\n");
      out.write("\t\t\t\t\t\t\t\t    <ul id=\"hyv-read-related\" class=\"hyv-video-list\"></ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>  \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t<!-- FOOTER -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        body{\r\n");
      out.write("            background-color: #efefef;\r\n");
      out.write("        }\r\n");
      out.write("        .container-4 input#hyv-search {\r\n");
      out.write("            width: 500px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            border: 1px solid #c6c6c6;\r\n");
      out.write("            font-size: 10pt;\r\n");
      out.write("            float: left;\r\n");
      out.write("            padding-left: 15px;\r\n");
      out.write("            -webkit-border-top-left-radius: 5px;\r\n");
      out.write("            -webkit-border-bottom-left-radius: 5px;\r\n");
      out.write("            -moz-border-top-left-radius: 5px;\r\n");
      out.write("            -moz-border-bottom-left-radius: 5px;\r\n");
      out.write("            border-top-left-radius: 5px;\r\n");
      out.write("            border-bottom-left-radius: 5px;\r\n");
      out.write("            border-radius: 6px\r\n");
      out.write("        }\r\n");
      out.write("        .container-4 button.icon {\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            background: #f0f0f0 url('js/semantic/images/searchicon.png') 10px 1px no-repeat;\r\n");
      out.write("            background-size: 24px;\r\n");
      out.write("            -webkit-border-top-right-radius: 5px;\r\n");
      out.write("            -webkit-border-bottom-right-radius: 5px;\r\n");
      out.write("            -moz-border-radius-topright: 5px;\r\n");
      out.write("            -moz-border-radius-bottomright: 5px;\r\n");
      out.write("            border-top-right-radius: 5px;\r\n");
      out.write("            border-bottom-right-radius: 5px;\r\n");
      out.write("            border: 1px solid #c6c6c6;\r\n");
      out.write("            width: 50px;\r\n");
      out.write("            margin-left: -44px;\r\n");
      out.write("            color: #4f5b66;\r\n");
      out.write("            font-size: 10pt;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\t  \r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/pages/Recursos.jsp(15,38) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/bootstrap/sweetalert/lib/sweetalert.min.js");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/pages/Recursos.jsp(16,47) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/bootstrap/sweetalert/lib/sweetalert.css");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/pages/Recursos.jsp(20,38) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/js/modulo/recursos_virtuales/recursos.js");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/pages/Recursos.jsp(23,38) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/js/semantic/api-youtube.js");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /WEB-INF/pages/Recursos.jsp(24,38) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/js/semantic/api-web.js");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent(null);
    // /WEB-INF/pages/Recursos.jsp(26,50) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/js/semantic/maincss.css");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f6.setParent(null);
    // /WEB-INF/pages/Recursos.jsp(27,50) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f6.setValue("/js/semantic/lib/pretty-json.css");
    int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
    if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f7(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f7.setParent(null);
    // /WEB-INF/pages/Recursos.jsp(34,41) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f7.setValue("/js/semantic/lib/js/underscore-min.js");
    int _jspx_eval_c_005furl_005f7 = _jspx_th_c_005furl_005f7.doStartTag();
    if (_jspx_th_c_005furl_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f8(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f8.setParent(null);
    // /WEB-INF/pages/Recursos.jsp(35,41) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f8.setValue("/js/semantic/lib/js/backbone-min.js");
    int _jspx_eval_c_005furl_005f8 = _jspx_th_c_005furl_005f8.doStartTag();
    if (_jspx_th_c_005furl_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f9(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f9.setParent(null);
    // /WEB-INF/pages/Recursos.jsp(36,41) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f9.setValue("/js/semantic/lib/js/pretty-json-min.js");
    int _jspx_eval_c_005furl_005f9 = _jspx_th_c_005furl_005f9.doStartTag();
    if (_jspx_th_c_005furl_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f10(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f10.setParent(null);
    // /WEB-INF/pages/Recursos.jsp(39,47) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f10.setValue("/css/grv.css");
    int _jspx_eval_c_005furl_005f10 = _jspx_th_c_005furl_005f10.doStartTag();
    if (_jspx_th_c_005furl_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/pages/Recursos.jsp(87,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/Recursos.jsp(87,7) '${aniosacademicoslist}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${aniosacademicoslist}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/pages/Recursos.jsp(87,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("anio");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<option id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${anio.idAnioAcademico}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${anio.idAnioAcademico}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${anio.anio}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
