package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GamePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
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
      out.write("\t<script src=\"js/jquery.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.js\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-bp.js\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/navigation.js\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.blockUI.js\" ></script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tvar lastUpadatedJsonData=\"\";\r\n");
      out.write("\r\n");
      out.write("\tfunction GetXmlHttpObject()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif (window.XMLHttpRequest)\r\n");
      out.write("\t\t  {\r\n");
      out.write("\t\t  return new XMLHttpRequest();\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\tif (window.ActiveXObject)\r\n");
      out.write("\t\t  {\r\n");
      out.write("\t\t  return new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\treturn null;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction getDataFromServer()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t\t  xmlhttp=GetXmlHttpObject();\r\n");
      out.write("  \t\t\t  xmlhttp.onreadystatechange=getUsers;\r\n");
      out.write("  \t\t\t  function getUsers()\r\n");
      out.write("\t\t\t  {\r\n");
      out.write("\t\t\t\t  if(xmlhttp.readyState==4)\r\n");
      out.write("\t\t\t\t    {\r\n");
      out.write("\t\t\t\t\t\t  var JsonData=xmlhttp.responseText;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  if(lastUpadatedJsonData != JsonData)\r\n");
      out.write("\t\t\t\t\t\t\t {\r\n");
      out.write("\t\t\t\t\t\t\t    lastUpadatedJsonData = JsonData;\r\n");
      out.write("\t\t\t\t\t\t\t\tvar JsonObject = eval('(' + JsonData + ')');\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t    var onlineUsersContainer=document.getElementById('OnlineUsersContainer');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  if ( onlineUsersContainer.hasChildNodes() )\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    while (onlineUsersContainer.hasChildNodes())\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t       onlineUsersContainer.removeChild( onlineUsersContainer.lastChild );\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t    var onlineUsersHeader  = document.createElement('span');\r\n");
      out.write("\t\t\t\t\t\t\t\tonlineUsersHeader.innerHTML=\"Online Users\";\r\n");
      out.write("\t\t\t\t\t\t\t\tonlineUsersContainer.appendChild(onlineUsersHeader);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t     for(i=0;i<(JsonObject.users.length);i++)\r\n");
      out.write("\t\t\t\t\t\t\t\t    {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  var name=JsonObject.users[i].name;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  var image=JsonObject.users[i].image;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  var username=JsonObject.users[i].username;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  var userBusy=JsonObject.users[i].userbusy;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  var onlineUsersDiv  = document.createElement('div');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  onlineUsersContainer.appendChild(onlineUsersDiv);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  var userImage = document.createElement('img');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  userImage.src=image;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  userImage.setAttribute(\"name\",username);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  onlineUsersDiv.appendChild(userImage);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  var userName = document.createElement('div');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  userName.innerHTML=name;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  onlineUsersDiv.appendChild(userName);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  if(userBusy == \"false\" )\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  var playButton = document.createElement(\"input\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  playButton.setAttribute(\"type\",\"button\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  playButton.setAttribute(\"name\",username);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  playButton.setAttribute(\"value\",\"Invite for match\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  playButton.onclick=setInvitation;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  onlineUsersDiv.appendChild(playButton);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  }\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  if(userBusy == \"true\" )\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \t  var busySpan = document.createElement(\"div\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \t  busySpan.innerHTML = \"User Busy\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \t  busySpan.style.color=\"red\";\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  onlineUsersDiv.appendChild(busySpan);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  }\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  }\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  if(JsonObject.invitedby != \"null\")\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t{\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t\tdocument.getElementById('invitedBy').innerHTML=JsonObject.invitedby;\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t$.blockUI.defaults.css = {};\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$.blockUI({ message: JsonObject.invitedby+' has Invited you to play ShAtRaNj <br/>Do You Want to play?<br/><input type=\"button\" value=\"Yes\" onclick=\"acceptInvitation(event);\"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"button\" value=\"No\" onclick=\"rejectInvitation();\"/>'});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  if(JsonObject.invitationstatus == \"3\")\r\n");
      out.write("\t\t\t\t\t\t\t\t  {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  $.unblockUI();\r\n");
      out.write("\t\t\t\t\t\t\t\t  var invited= document.getElementById('invited').innerHTML;\r\n");
      out.write("\t\t\t\t\t\t\t\t  $.blockUI.defaults.css = {};\r\n");
      out.write("\t\t\t\t\t\t\t\t  $.blockUI({ message: invited +' Does not want to play<br/><input type=\"button\" value=\"Ok\" onclick=\"clearInvitationStatus();\" '  });\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  }\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  if(JsonObject.invitationstatus == \"4\")\r\n");
      out.write("\t\t\t\t\t\t\t\t  {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  $.unblockUI();\r\n");
      out.write("\t\t\t\t\t\t\t\t  var invited= document.getElementById('invited').innerHTML;\r\n");
      out.write("\t\t\t\t\t\t\t\t  $.blockUI.defaults.css = {};\r\n");
      out.write("\t\t\t\t\t\t\t\t  $.blockUI({ message: invited +' is already playing Shatranj with Someone<br/><input type=\"button\" value=\"Ok\" onclick=\"clearInvitationStatus();\" '  });\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  }\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  if(JsonObject.invitationstatus == \"2\")\r\n");
      out.write("\t\t\t\t\t\t\t\t  {\r\n");
      out.write("\t\t\t\t\t\t\t\t  $.unblockUI();\r\n");
      out.write("\t\t\t\t\t\t\t\t  var invited= document.getElementById('invited').innerHTML;\r\n");
      out.write("\t\t\t\t\t\t\t\t  window.location=\"playGame.do?invited=\"+invited;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t  }\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t    }\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t\t  xmlhttp.open(\"POST\",\"getDataFromServer.do\",true);\r\n");
      out.write("\t\t\t  xmlhttp.send(null);\r\n");
      out.write("\t\t\t  setTimeout(\"getDataFromServer()\",10000);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction clearInvitationStatus()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t $.unblockUI();\r\n");
      out.write("\t\t\t xmlhttp=GetXmlHttpObject();\r\n");
      out.write("\t\t\t    xmlhttp.onreadystatechange=function()\r\n");
      out.write("\t\t\t    {\r\n");
      out.write("\t\t\t\t\t if(xmlhttp.readyState==4)\r\n");
      out.write("\t\t\t\t\t {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\txmlhttp.open(\"GET\",\"clearInvitationStatus.do\",true);\r\n");
      out.write("\t\t\t\txmlhttp.send(null);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction setInvitation(event)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar event = event || window.event;\r\n");
      out.write("\t\t\t    var target = event.target || event.srcElement;\r\n");
      out.write("\t\t\t    document.getElementById('invited').innerHTML=target.name;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$.blockUI.defaults.css = {};\r\n");
      out.write("\t\t\t\t$.blockUI({ message: 'Waiting for '+target.name+' to approve<br/><br/><img src=\"img/loading.gif\"' });\r\n");
      out.write("\r\n");
      out.write("\t\t\t\txmlhttp=GetXmlHttpObject();\r\n");
      out.write("\t\t\t    xmlhttp.onreadystatechange=function()\r\n");
      out.write("\t\t\t    {\r\n");
      out.write("\t\t\t\t\t if(xmlhttp.readyState==4)\r\n");
      out.write("\t\t\t\t\t {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\txmlhttp.open(\"GET\",\"inviteUser.do?userInvited=\"+target.name,true);\r\n");
      out.write("\t\t\t\txmlhttp.send(null);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction acceptInvitation()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t   \tvar invitedBy= document.getElementById('invitedBy').innerHTML;\r\n");
      out.write("\t\t\t\txmlhttp=GetXmlHttpObject();\r\n");
      out.write("\t\t\t    xmlhttp.onreadystatechange=function()\r\n");
      out.write("\t\t\t    {\r\n");
      out.write("\t\t\t\t\t if(xmlhttp.readyState==4)\r\n");
      out.write("\t\t\t\t\t {\r\n");
      out.write("\t\t\t\t\t \t$.unblockUI();\r\n");
      out.write("\t\t\t\t\t \twindow.location=\"playGame.do?invitedBy=\"+invitedBy;\r\n");
      out.write("\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\txmlhttp.open(\"GET\",\"acceptInvitation.do?invitedBy=\"+invitedBy,true);\r\n");
      out.write("\t\t\t\txmlhttp.send(null);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction rejectInvitation()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t   \tvar invitedBy= document.getElementById('invitedBy').innerHTML;\r\n");
      out.write("\t\t\t\txmlhttp=GetXmlHttpObject();\r\n");
      out.write("\t\t\t    xmlhttp.onreadystatechange=function()\r\n");
      out.write("\t\t\t    {\r\n");
      out.write("\t\t\t\t\t if(xmlhttp.readyState==4)\r\n");
      out.write("\t\t\t\t\t {\r\n");
      out.write("\t\t\t\t\t \t$.unblockUI();\r\n");
      out.write("\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\txmlhttp.open(\"GET\",\"rejectInvitation.do?invitedBy=\"+invitedBy,true);\r\n");
      out.write("\t\t\t\txmlhttp.send(null);\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"getDataFromServer();\" >\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t<img src=\"img/title1.png\" style=\"float:left;margin-right:30em\"/>\r\n");
      out.write("\t<div style=\"margin-top:2.5em;color:yellow\">\r\n");
      out.write("\t\tWelcome\r\n");
      out.write("\t    <span style=\"font-size:1.2em\">\r\n");
      out.write("\t    \t");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t    \t  ");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write(",\r\n");
      out.write("\t    \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t    </span>\r\n");
      out.write("\r\n");
      out.write("\t\t<a href=\"logout.do\" style=\"color:yellow\">Log out</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"navigation\" class=\"container\">\r\n");
      out.write("\t\t<div id=\"PlayChess\" class=\"pri-nav active\"><div><a>PlayChess</a></div></div>\r\n");
      out.write("\t\t<div id=\"LearnChess\" class=\"pri-nav\"><div><a href=\"LearnChess.jsp\">LearnChess</a></div></div>\r\n");
      out.write("\t\t<div id=\"Members\" class=\"pri-nav\"><div><a href=\"Members.jsp\">Members</a></div></div>\r\n");
      out.write("\t\t<div id=\"AboutUs\" class=\"pri-nav\"><div><a href=\"AboutUs.jsp\">AboutUs</a></div></div>\r\n");
      out.write("\t\t<div id=\"ContactUs\" class=\"pri-nav\"><div><a href=\"ContactUs.jsp\">ContactUs</a></div></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"gamePageContainer\" style=\"margin:5em 0.5em 0em 0.5em;border:2px solid white;height:24.8em;width:62.5em\">\r\n");
      out.write("\t\t<div id=\"UserInfo\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fset_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fset_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fset_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<img src=\"");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("\t\t\t\t<div style=\"font-size:1.4em\">\r\n");
      out.write("\t\t\t\tWelcome ,\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fout_005f2(_jspx_page_context))
        return;
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fout_005f3(_jspx_page_context))
        return;
      out.write("<br/>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fout_005f4(_jspx_page_context))
        return;
      out.write("<br/>\r\n");
      out.write("\t\t\t\t-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t    <div id=\"OnlineUsersContainer\">\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<span id=\"invitedBy\" style=\"display:none\"></span>\r\n");
      out.write("\t\t<span id=\"invited\" style=\"display:none\"></span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fout_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (true) {
          _jspx_page_context.forward("showerror.jsp");
          return true;
        }
        out.write("\r\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_c_005fset_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    _jspx_th_c_005fset_005f1.setVar("fullname");
    _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.storedName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f2.setParent(null);
    _jspx_th_c_005fset_005f2.setVar("gender");
    _jspx_th_c_005fset_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.storedGender}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
    if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f3.setParent(null);
    _jspx_th_c_005fset_005f3.setVar("age");
    _jspx_th_c_005fset_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.storedAge}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f3 = _jspx_th_c_005fset_005f3.doStartTag();
    if (_jspx_th_c_005fset_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f4.setParent(null);
    _jspx_th_c_005fset_005f4.setVar("image");
    _jspx_th_c_005fset_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userImage}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f4 = _jspx_th_c_005fset_005f4.doStartTag();
    if (_jspx_th_c_005fset_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent(null);
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${image}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent(null);
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fullname}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent(null);
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gender}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f4.setParent(null);
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${age}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
    if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
    return false;
  }
}
