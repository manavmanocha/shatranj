package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Members_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Shatranj</title>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/main.css\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.js\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-bp.js\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/navigation.js\" ></script>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t//move the image in pixel\r\n");
      out.write("\t\tvar move = -15;\r\n");
      out.write("\r\n");
      out.write("\t\t//zoom percentage, 1.2 =120%\r\n");
      out.write("\t\tvar zoom = 1.2;\r\n");
      out.write("\r\n");
      out.write("\t\t//On mouse over those thumbnail\r\n");
      out.write("\t\t$('.member').hover(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t//Set the width and height according to the zoom percentage\r\n");
      out.write("\t\t\twidth = $('.member').width() * zoom;\r\n");
      out.write("\t\t\theight = $('.member').height() * zoom;\r\n");
      out.write("\r\n");
      out.write("\t\t\t//Move and zoom the image\r\n");
      out.write("\t\t\t$(this).find('img').stop(false,true).animate({'width':width, 'height':height, 'top':move, 'left':move}, {duration:200});\r\n");
      out.write("\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tfunction() {\r\n");
      out.write("\t\t\t//Reset the image\r\n");
      out.write("\t\t\t$(this).find('img').stop(false,true).animate({'width':$('.member').width(), 'height':$('.member').height(), 'top':'0', 'left':'0'}, {duration:100});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction displaySearch()\r\n");
      out.write("\t{\r\n");
      out.write("\r\n");
      out.write("\tdocument.getElementById(\"SearchResultsDiv\").style.display=\"none\";\r\n");
      out.write("\tdocument.getElementById(\"NewestUsersDiv\").style.display=\"none\";\r\n");
      out.write("\tdocument.getElementById(\"SearchDiv\").style.display=\"block\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction displayNewest()\r\n");
      out.write("\t{\r\n");
      out.write("\r\n");
      out.write("\t\tdocument.getElementById(\"SearchResultsDiv\").style.display=\"none\";\r\n");
      out.write("\t\tdocument.getElementById(\"SearchDiv\").style.display=\"none\";\r\n");
      out.write("\t\tdocument.getElementById(\"NewestUsersDiv\").style.display=\"block\";\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction SearchResults()\r\n");
      out.write("\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\tdocument.getElementById(\"SearchDiv\").style.display=\"none\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"NewestUsersDiv\").style.display=\"none\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"SearchResultsDiv\").style.display=\"block\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<img src=\"img/title1.png\" style=\"float:left;margin-right:30em\"/>\r\n");
      out.write("\t\t<div style=\"margin-top:2.5em;color:yellow\">\r\n");
      out.write("\r\n");
      out.write("\t    \t");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t    \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t   \t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"navigation\" class=\"container\">\r\n");
      out.write("\t\t<div id=\"PlayChess\" class=\"pri-nav \"><div><a href=\"PlayChess.jsp\">PlayChess</a></div></div>\r\n");
      out.write("\t\t<div id=\"LearnChess\" class=\"pri-nav \"><div><a href=\"LearnChess.jsp\">LearnChess</a></div></div>\r\n");
      out.write("\t\t<div id=\"Members\" class=\"pri-nav active\"><div><a>Members</a></div></div>\r\n");
      out.write("\t\t<div id=\"AboutUs\" class=\"pri-nav\"><div><a href=\"AboutUs.jsp\">AboutUs</a></div></div>\r\n");
      out.write("\t\t<div id=\"ContactUs\" class=\"pri-nav\"><div><a href=\"ContactUs.jsp\">ContactUs</a></div></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"SearchDiv\" style=\"display:none\">\r\n");
      out.write("\t\t<form >\r\n");
      out.write("\t\t\t<div style=\"background-color:brown;\">\r\n");
      out.write("\t\t\t\tSearch for Members:\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t<div style=\"float:left;margin-left:1em;width:5em\">\r\n");
      out.write("\t\t\t\tName:\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<input type=\"text\"/><br/><br/>\r\n");
      out.write("\t\t\t<div style=\"float:left;margin-left:1em;width:5em\">\r\n");
      out.write("\t\t\t\tCountry:\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<input type=\"text\"/>\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t<div style=\"margin-left:7em\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"Search\" onclick=\"SearchResults();\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"display:none\" id=\"NewestUsersDiv\" >\r\n");
      out.write("\t\t<div style=\"font-size:1.3em;text-decoration:underline;margin:0.25em 1.5em 1em 1em\">\r\n");
      out.write("\t\t\tNewest Users\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div  style=\"overflow:hidden;float:left;height:11em;width:8em;border:1px solid white;MARGIN-LEFT:2EM;margin-bottom:1em\">\r\n");
      out.write("\t\t\t<div class=\"member\" style=\"overflow:hidden;height:9em;width:8em;border-bottom:1px solid white;\">\r\n");
      out.write("\t\t\t<img  src=\"img/2.jpg\" style=\"height:9em;width:8em;\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<a href=\"#\" style=\"margin-left:0.5em;text-decoration:none;color:white\">Ramanjit singh</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"display:none\" id=\"SearchResultsDiv\" >\r\n");
      out.write("\t\t<div style=\"font-size:1.3em;text-decoration:underline;margin:0.25em 1.5em 1em 1em\">\r\n");
      out.write("\t\t\tSearch Results\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div  style=\"overflow:hidden;float:left;height:11em;width:8em;border:1px solid white;MARGIN-LEFT:2EM;margin-bottom:1em\">\r\n");
      out.write("\t\t\t<div class=\"member\" style=\"overflow:hidden;height:9em;width:8em;border-bottom:1px solid white;\">\r\n");
      out.write("\t\t\t<img  src=\"img/2.jpg\" style=\"height:9em;width:8em;\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<a href=\"#\" style=\"margin-left:0.5em;text-decoration:none;color:white\">Ramanjit singh</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div  style=\"text-align:center;background-color:rgb(33,142,190);border:2px solid white;margin-left:2em;-moz-border-radius:1em;margin-top:10em;width:8.5em;padding:0.25em\">\r\n");
      out.write("\t<a style=\" text-decoration:none;color:white\" href=\"PlayChess.jsp\">Online Members</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"cursor:pointer;text-align:center;background-color:rgb(33,142,190);border:2px solid white;margin-left:2em;-moz-border-radius:1em;margin-top:2em;width:8.5em;padding:0.25em\" onclick=\"displayNewest();\">\r\n");
      out.write("\tNewest Members\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"cursor:pointer;text-align:center;background-color:rgb(33,142,190);border:2px solid white;margin-left:2em;-moz-border-radius:1em;margin-top:2em;width:8.5em;padding:0.25em\" onclick=\"displaySearch();\">\r\n");
      out.write("\tSearch Members\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    _jspx_th_c_005fset_005f0.setVar("name");
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t    \t\tWelcome\r\n");
        out.write("\t   \t\t    <span style=\"font-size:1.2em\">\r\n");
        out.write("\t\t    \t    ");
        if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write(",\r\n");
        out.write("\t\t    \t    <a href=\"logout.do\" style=\"color:yellow\">Log out</a>\r\n");
        out.write("\t    \t    </span>\r\n");
        out.write("\t    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }
}
