/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-10-30 03:16:28 UTC
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fclass_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fclass_005faction.release();
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
      out.write("\t\t<!-- Required meta tags -->\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1.0, shrink-to-fit=no\">\t\t\r\n");
      out.write("\t\t<!-- Bootstrap CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" ></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" ></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$( \"#formSelectAnios\").change(function() {\t\t\r\n");
      out.write("\t\tvar id = $(\"#formSelectAnios\").val();\r\n");
      out.write("\t\tvar params = {idAnio:id };\t\t\r\n");
      out.write("\t\tconsole.log(\"Cargando las áreas academicas del año escolar\t\"+id)\r\n");
      out.write("\t    $.ajax({\r\n");
      out.write("\t    \ttype: 'GET',\r\n");
      out.write("\t        url: 'http://localhost:8455/malla/areas/academicas?anioAcademico='+id, //'AreasAcademicas', /*desde controller no devuel*/\r\n");
      out.write("\t        data: params,\r\n");
      out.write("\t        dataType: 'json',\t        \r\n");
      out.write("\t        success: function (data) {\r\n");
      out.write("\t       \t\t$('#formSelectAreas').empty();       \t\r\n");
      out.write("\t        \t$('#select').append($('<option>').text(\"Select\"));\r\n");
      out.write("\t        \t$.each(data, function(i, obj) {\t    \r\n");
      out.write("        \t        $('#formSelectAreas').append($('<option>').\r\n");
      out.write("        \t        \t\ttext(obj.nombreArea).attr('value',obj.idAreaAcademica));        \t      \r\n");
      out.write("        \t    });\r\n");
      out.write("\t        },\t        \r\n");
      out.write("\t        error    : function(XMLHttpRequest, textStatus, errorThrown) {\t        \t\r\n");
      out.write("\t        \t //alert(\"Status: \" + textStatus); alert(\"Error: \" + errorThrown);\r\n");
      out.write("\t        \t console.log(\"Status : \"+textStatus );\r\n");
      out.write("\t        \t console.log(\"Error : \"+errorThrown );\r\n");
      out.write("\t        },\r\n");
      out.write("\t        complete : function() {\r\n");
      out.write("\t        \t// console.log(\"Complete Areas\");\r\n");
      out.write("\t       \t}\t        \r\n");
      out.write("\t    });\r\n");
      out.write("\r\n");
      out.write("\t\t});\t\r\n");
      out.write("\r\n");
      out.write("$( \"#formSelectAreas\").change(function() {\t\r\n");
      out.write("\tvar id = $(\"#formSelectAreas\").val();\r\n");
      out.write("\tvar params = {idArea:id };\t\t\r\n");
      out.write("\tconsole.log(\"Cargando Unidades de las áreas\"+id)\r\n");
      out.write("    $.ajax({\r\n");
      out.write("    \ttype: 'GET',\r\n");
      out.write("        url: 'http://localhost:8455/malla/unidades/didacticas?idAreaAcademica='+id,\r\n");
      out.write("        data: params,\r\n");
      out.write("        dataType: 'json',\t        \r\n");
      out.write("        success: function (data) {\r\n");
      out.write("       \t\t$('#formSelectUnidades').empty();       \t\r\n");
      out.write("        \t$('#select').append($('<option>').text(\"Select\"));\r\n");
      out.write("        \t$.each(data, function(i, obj) {\t    \r\n");
      out.write("    \t        $('#formSelectUnidades').append($('<option>').\r\n");
      out.write("    \t        \t\ttext(\"Unidad \"+obj.idUnidadDidactica +\" - \" +obj.tituloUnidad).attr('value',obj.idUnidadDidactica));        \t      \r\n");
      out.write("    \t    });\r\n");
      out.write("        },\t        \r\n");
      out.write("        error    : function(XMLHttpRequest, textStatus, errorThrown) {\t        \t\r\n");
      out.write("        \t //alert(\"Status: \" + textStatus); alert(\"Error: \" + errorThrown);\r\n");
      out.write("        \t console.log(\"Status : \"+textStatus );\r\n");
      out.write("        \t console.log(\"Error : \"+errorThrown );\r\n");
      out.write("        },\r\n");
      out.write("        complete : function() {\r\n");
      out.write("        \t// console.log(\"Complete...\" );\r\n");
      out.write("       \t}\t        \r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t$( \"#formSelectUnidades\").change(function() {\r\n");
      out.write("\t\tvar id = $(\"#formSelectUnidades\").val();\r\n");
      out.write("\t\tvar params = {idUnidadDidactica:id };\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t    $.ajax({\r\n");
      out.write("\t\t    \ttype: 'GET',\r\n");
      out.write("\t\t        url: 'unidadesAcademicas/temas_recursos',\r\n");
      out.write("\t\t        data: params,\r\n");
      out.write("\t\t        dataType: 'json',\t        \r\n");
      out.write("\t\t        success: function (data) {        \t\r\n");
      out.write("\t\t    \t    //$.each(data, function(i, obj) {\t   \r\n");
      out.write("\t\t  \t    \t$.each(data, function(i, item) {\r\n");
      out.write("\t\t  \t    \t    $('<tr>').html(\"<td>\" + data[i].campo_tematico + \"</td><td>\" + data[i].nroIMG + \"</td><td>\" + data[i].nroVIDEO + \"</td>\" + \"</td><td>\" + data[i].nroWEB + \"</td>\").appendTo('#temas_table');\r\n");
      out.write("\t\t  \t    \t});\r\n");
      out.write("\t\t        },\t        \r\n");
      out.write("\t\t        error    : function(XMLHttpRequest, textStatus, errorThrown) {\t        \t\r\n");
      out.write("\t\t        \t console.log(\"Status : \"+textStatus );\r\n");
      out.write("\t\t        \t console.log(\"Error : \"+errorThrown );\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        complete : function() {\r\n");
      out.write("\t\t        \t// console.log(\"Complete...\" );\r\n");
      out.write("\t\t       \t}\t        \r\n");
      out.write("\t\t    });\r\n");
      out.write("\t\r\n");
      out.write("\t\t});\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#submitImg\").click(searchImagenes);\r\n");
      out.write("\t$(\"#submitVideo\").click(searchVideos);\r\n");
      out.write("\t$(\"#submitWeb\").click(searchWeb);\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\t\r\n");
      out.write("\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/menu.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<h2>Asignar Recursos a los temas de una Unidad Didactica</h2>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"Temas\">\t\t\r\n");
      out.write("\t\t\t<table class=\"table\" id=\"temas_table\" class=\"tbtTemas\">\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <th>Temas de la Unidad</th>\r\n");
      out.write("\t                <th>Recursos Video</th>\r\n");
      out.write("\t                <th>Recursos Imagen</th>\r\n");
      out.write("\t                <th>Recursos Web</th>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t        </table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<div id=\"SemanticSearch\">\r\n");
      out.write("      <div class=\"radio icheck-sunflower\">\r\n");
      out.write("          <input type=\"radio\" id=\"sunflower1\" name=\"sunflower\" />\r\n");
      out.write("          <label for=\"sunflower1\">Buscar Video</label>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"radio icheck-sunflower\">\r\n");
      out.write("          <input type=\"radio\" id=\"sunflower1\" name=\"sunflower\" />\r\n");
      out.write("          <label for=\"sunflower1\">Buscar Imagen</label>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"radio icheck-sunflower\">\r\n");
      out.write("          <input type=\"radio\" id=\"sunflower1\" name=\"sunflower\" />\r\n");
      out.write("          <label for=\"sunflower1\">Buscar Web</label>\r\n");
      out.write("      </div>                                        \r\n");
      out.write("\t</div>\t\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("\t<div class=\"row\" id=\"RecursosEncontradosPorSemantica\">\r\n");
      out.write("\t\t<div class=\"divVideo\">\r\n");
      out.write("\t\t   <img id=\"img\"  src=\"https://professor-falken.com/wp-content/uploads/2017/10/arbol-tronco-musco-humedad-bosque-raices-Fondos-de-Pantalla-HD-professor-falken.com_.jpg\"  style=\"width:200px;height:200px;\">\r\n");
      out.write("\t\t   <p id=\"p1\">  </p>  \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"divImg\">\r\n");
      out.write("\t\t   <img id=\"img\"  src=\"https://professor-falken.com/wp-content/uploads/2017/10/arbol-tronco-musco-humedad-bosque-raices-Fondos-de-Pantalla-HD-professor-falken.com_.jpg\"  style=\"width:200px;height:200px;\">\r\n");
      out.write("\t\t\t    <p id=\"p2\">  </p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t  <div class=\"divWeb\">\r\n");
      out.write("\t\t\t    <img id=\"img\"  src=\"https://professor-falken.com/wp-content/uploads/2017/10/arbol-tronco-musco-humedad-bosque-raices-Fondos-de-Pantalla-HD-professor-falken.com_.jpg\"  style=\"width:200px;height:200px;\">\r\n");
      out.write("\t\t\t    <p id=\"p3\">  </p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t<button id=\"btnGuardarRecurso\" >GUARDAR</button>    \r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
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
    // /WEB-INF/pages/Recursos.jsp(23,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/js/semantic/semantic_search.js");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/pages/Recursos.jsp(138,2) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("GET");
    // /WEB-INF/pages/Recursos.jsp(138,2) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("/Recursos/BuscarRecursos");
    // /WEB-INF/pages/Recursos.jsp(138,2) null
    _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "class", "form-horizontal");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("       \r\n");
          out.write("\t\t\t\t\t<!-- Combo AÑO -->\r\n");
          out.write("\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t  <label class=\"label-control\" for=\"formSelectAnios\">Año Académico:</label>\r\n");
          out.write("\t\t\t  <select class=\"selectpicker\" name=\"formSelectAnios\" id=\"formSelectAnios\" class=\"form-control\" style=\"width:200px\">\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t  </select>\t\t\t\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<!-- Combo AREA -->\t\t\t\t\t\t\r\n");
          out.write("\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t  <label class=\"label-control\" for=\"formSelectAreas\">Área Academica:</label>\r\n");
          out.write("\t\t\t <select class=\"selectpicker\" name=\"formSelectAreas\" id=\"formSelectAreas\" style=\"width:200px\">\r\n");
          out.write("\t\t\t\t <option>Selecciona Área</option>\r\n");
          out.write("\t\t\t  </select>\r\n");
          out.write("\t\t\t</div>\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t  <label class=\"label-control\" for=\"formSelectUnidades\">Unidades:</label>\r\n");
          out.write("\t\t\t <select class=\"selectpicker\" name=\"formSelectUnidades\" id=\"formSelectUnidades\" style=\"width:400px\">\r\n");
          out.write("\t\t\t\t <option>Seleccionar Unidad</option>\r\n");
          out.write("\t\t\t  </select>\r\n");
          out.write("\t\t\t</div>\t\t\t\t\r\n");
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fclass_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/pages/Recursos.jsp(144,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/Recursos.jsp(144,4) '${aniosacademicoslist}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${aniosacademicoslist}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/pages/Recursos.jsp(144,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("anio");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<option id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${anio.idAnioAcademico}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${anio.idAnioAcademico}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${anio.anio}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t");
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
