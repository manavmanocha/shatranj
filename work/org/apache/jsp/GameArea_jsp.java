package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GameArea_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
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
      out.write("\t<script type=\"text/javascript\" src=\"js/ui.core.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/ui.draggable.js\"></script>\r\n");
      out.write("  \t<script type=\"text/javascript\" src=\"js/ui.droppable.js\"></script>\r\n");
      out.write("  \t<script type=\"text/javascript\" src=\"js/chess-moves.js\"></script>\r\n");
      out.write("  \t<script type=\"text/javascript\" src=\"js/chess-functions.js\"></script>\r\n");
      out.write("  \t<script type=\"text/javascript\" src=\"js/jquery.blockUI.js\" ></script>\r\n");
      out.write("  \t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("  \t\t\t var userColor=null;\r\n");
      out.write("  \t\t\t var gameId=null;\r\n");
      out.write("  \t\t\t var whiteUser=null;\r\n");
      out.write("  \t\t\t var blackUser=null;\r\n");
      out.write("  \t\t\t var inCheck = null;\r\n");
      out.write("  \t\t\t var gameOver=null;\r\n");
      out.write("\r\n");
      out.write(" $(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t    \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \t\t\t");
      if (_jspx_meth_c_005fset_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(" \t\t\tgameId=\"");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("\t\t\tuserColor=\"");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\twhiteUser=\"");
      if (_jspx_meth_c_005fout_005f2(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\tblackUser=\"");
      if (_jspx_meth_c_005fout_005f3(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t  \t\tdocument.getElementById('turnIndicator').innerHTML=whiteUser+\"'s turn\";\r\n");
      out.write("\t  \t\tif(userColor == \"white\")\r\n");
      out.write("\t  \t\t{\r\n");
      out.write("\t  \t\t\t$('.white').draggable({ containment: [42, 149, 390, 475],revert: true });\r\n");
      out.write("\t  \t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t    $('.droppable').droppable({\r\n");
      out.write("\t\t\t\t\tdrop: function(event, ui) {\r\n");
      out.write("\t\t\t\t\tvar endSquare = event.target || event.srcElement;\r\n");
      out.write("\t\t\t\t\tvar endSquareId=endSquare.id;\r\n");
      out.write("\t\t\t\t\tvar startImage = $(ui.draggable);\r\n");
      out.write("  \t\t\t\t\tvar startImageDOM = $(ui.draggable)[0];\r\n");
      out.write("  \t\t\t\t\tvar startSquare=startImageDOM.parentNode;\r\n");
      out.write("  \t\t\t\t\tvar startSquareId=startSquare.id;\r\n");
      out.write("\t\t\t\t\tvar startImageId=startImageDOM.id;\r\n");
      out.write("\t\t\t\t\tvar startImageDOMClassArray=startImageDOM.className.split(' ');\r\n");
      out.write("\t\t\t\t\tvar startImageDOMColor=startImageDOMClassArray[2];\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar DroppedPiece=getPieceType(startImageDOM);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar isMoveValid = checkMoves(DroppedPiece,endSquareId,startSquareId,userColor,startImageId);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif( isMoveValid == \"invalid\" )\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif( isMoveValid == \"valid\" )\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tvar booleanOccupiedSquare=checkIfOccupiedSquare(endSquare);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tif(booleanOccupiedSquare == \"yes\")\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tvar PieceColor = getSquarePieceColor(endSquare);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tif(PieceColor == startImageDOMColor)\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\telse\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar attackedPiece=null;\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor(d=0;d<endSquare.childNodes.length;d++)\r\n");
      out.write("\t\t\t  \t\t\t\t\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t  \t\t\t\t\t\tif(endSquare.childNodes[d].nodeName == \"IMG\")\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t\t\tattackedPiece = endSquare.childNodes[d];\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\tendSquare.removeChild(attackedPiece);\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar attackedPieceClassArray = attackedPiece.className.split(' ');\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar attackedPieceColor=attackedPieceClassArray[2];\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif(attackedPieceColor == \"white\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById('removedPiecesWhite').appendChild(attackedPiece);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif(attackedPieceColor == \"black\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById('removedPiecesBlack').appendChild(attackedPiece);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar opponentColor;\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif(startImageDOMColor==\"white\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\topponentUser=blackUser;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif(startImageDOMColor==\"black\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\topponentUser=whiteUser;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstartSquare.removeChild(startImageDOM);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t    startImageDOM.style.position=\"relative\";\r\n");
      out.write("\t\t\t\t\t\t\t\t    startImageDOM.style.left=\"0px\";\r\n");
      out.write("\t\t\t\t\t\t\t\t    startImageDOM.style.top=\"0px\";\r\n");
      out.write("\t\t\t\t\t\t\t\t    endSquare.appendChild(startImageDOM);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t    $('.black').draggable('destroy');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$('.white').draggable('destroy');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar attackedPieceType= getPieceType(attackedPiece);\r\n");
      out.write("\t\t\t\t\t\t\t\t    if(attackedPieceType == \"king\")\r\n");
      out.write("\t\t\t\t\t\t\t\t    {\r\n");
      out.write("\t\t\t\t\t\t\t\t    \talert(\"Hey U won The game\");\r\n");
      out.write("\t\t\t\t\t\t\t\t    \tgameOver = \"yes\" ;\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t xmlhttp=GetXmlHttpObject();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    xmlhttp.onreadystatechange=function()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t if(xmlhttp.readyState==4)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\txmlhttp.open(\"GET\",\"sendMoves.do?startSquare=\"+startSquare.id+\"&endSquare=\"+endSquare.id+\"&startImageId=\"+startImageId+\"&userColor=\"+userColor+\"&gameId=\"+gameId+\"&gameOver=\"+gameOver,true);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\txmlhttp.send(null);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twindow.location=\"endGameAction.do?gameId=\"+gameId;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t\t\t\t    else\r\n");
      out.write("\t\t\t\t\t\t\t\t    {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    if(userColor == \"black\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \tdocument.getElementById(\"lastWhiteMove\").innerHTML=\"\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \tdocument.getElementById(\"lastBlackMove\").innerHTML=\"Last Move : \"+DroppedPiece+\" : \"+startSquareId+\" - \"+endSquareId;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \tvar isCheckTrue = isKingInCheck(userColor);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \tif(isCheckTrue == \"yes\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\tinCheck = \"yes\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \telse\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\tinCheck = \"no\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    if(userColor == \"white\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \tdocument.getElementById(\"lastBlackMove\").innerHTML=\"\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \tdocument.getElementById(\"lastWhiteMove\").innerHTML=\"Last Move : \"+DroppedPiece+\" : \"+startSquareId+\" - \"+endSquareId;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \tvar isCheckTrue = isKingInCheck(userColor);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \tif(isCheckTrue == \"yes\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\tinCheck = \"yes\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \telse\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t\tinCheck = \"no\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    document.getElementById('turnIndicator').innerHTML=opponentUser+\"'s turn\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    xmlhttp=GetXmlHttpObject();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    xmlhttp.onreadystatechange=function()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t if(xmlhttp.readyState==4)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\txmlhttp.open(\"GET\",\"sendMoves.do?startSquare=\"+startSquare.id+\"&endSquare=\"+endSquare.id+\"&startImageId=\"+startImageId+\"&userColor=\"+userColor+\"&gameId=\"+gameId+\"&gameOver=\"+gameOver,true);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\txmlhttp.send(null);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t  \t\t\t\t\tif(booleanOccupiedSquare == \"no\")\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tvar opponentColor;\r\n");
      out.write("\t\t\t\t\t\t\t\tif(startImageDOMColor==\"white\")\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\topponentUser=blackUser;\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\tif(startImageDOMColor==\"black\")\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\topponentUser=whiteUser;\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tstartSquare.removeChild(startImageDOM);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t    startImageDOM.style.position=\"relative\";\r\n");
      out.write("\t\t\t\t\t\t\t    startImageDOM.style.left=\"0px\";\r\n");
      out.write("\t\t\t\t\t\t\t    startImageDOM.style.top=\"0px\";\r\n");
      out.write("\t\t\t\t\t\t\t    endSquare.appendChild(startImageDOM);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t    $('.black').draggable('destroy');\r\n");
      out.write("\t\t\t\t\t\t\t\t$('.white').draggable('destroy');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t    document.getElementById('turnIndicator').innerHTML=opponentUser+\"'s turn\";\r\n");
      out.write("\t\t\t\t\t\t\t    if(userColor == \"black\")\r\n");
      out.write("\t\t\t\t\t\t\t    {\r\n");
      out.write("\t\t\t\t\t\t\t    \tdocument.getElementById(\"lastWhiteMove\").innerHTML=\"\";\r\n");
      out.write("\t\t\t\t\t\t\t    \tdocument.getElementById(\"lastBlackMove\").innerHTML=\"Last Move : \"+DroppedPiece+\" : \"+startSquareId+\" - \"+endSquareId;\r\n");
      out.write("\t\t\t\t\t\t\t    \tvar isCheckTrue = isKingInCheck(userColor);\r\n");
      out.write("\t\t\t\t\t\t\t\t    \tif(isCheckTrue == \"yes\")\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t{\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\tinCheck = \"yes\";\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t}\r\n");
      out.write("\t\t\t\t\t\t\t\t    \telse\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t{\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\tinCheck = \"no\";\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t\t\t    if(userColor == \"white\")\r\n");
      out.write("\t\t\t\t\t\t\t    {\r\n");
      out.write("\t\t\t\t\t\t\t    \tdocument.getElementById(\"lastBlackMove\").innerHTML=\"\";\r\n");
      out.write("\t\t\t\t\t\t\t    \tdocument.getElementById(\"lastWhiteMove\").innerHTML=\"Last Move : \"+DroppedPiece+\" : \"+startSquareId+\" - \"+endSquareId;\r\n");
      out.write("\t\t\t\t\t\t\t    \tvar isCheckTrue = isKingInCheck(userColor);\r\n");
      out.write("\t\t\t\t\t\t\t\t    \tif(isCheckTrue == \"yes\")\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t{\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\tinCheck = \"yes\";\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t}\r\n");
      out.write("\t\t\t\t\t\t\t\t    \telse\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t{\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t\tinCheck = \"no\";\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t}\r\n");
      out.write("\t\t\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t\t\t    xmlhttp=GetXmlHttpObject();\r\n");
      out.write("\t\t\t\t\t\t\t    xmlhttp.onreadystatechange=function()\r\n");
      out.write("\t\t\t\t\t\t\t    {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t if(xmlhttp.readyState==4)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\txmlhttp.open(\"GET\",\"sendMoves.do?startSquare=\"+startSquare.id+\"&endSquare=\"+endSquare.id+\"&startImageId=\"+startImageId+\"&userColor=\"+userColor+\"&gameId=\"+gameId+\"&inCheck=\"+inCheck+\"&gameOver=\"+gameOver,true);\r\n");
      out.write("\t\t\t\t\t\t\t\txmlhttp.send(null);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t  });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t  function getMovesData()\r\n");
      out.write("\t\t\t  {\r\n");
      out.write("\t\t\t   xmlhttp=GetXmlHttpObject();\r\n");
      out.write("\t\t\t   xmlhttp.onreadystatechange=function()\r\n");
      out.write("\t\t\t    {\r\n");
      out.write("\t\t\t\t\t if(xmlhttp.readyState==4)\r\n");
      out.write("\t\t\t\t\t {\r\n");
      out.write("\t\t\t\t\t \tvar movesJsonData=xmlhttp.responseText;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t \tvar movesJsonObject = eval('(' + movesJsonData + ')');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t \tif(userColor == \"black\")\r\n");
      out.write("\t\t\t\t\t \t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t \t\tvar pieceId=movesJsonObject.white[0].pieceId;\r\n");
      out.write("\t\t\t\t\t \t\tvar startSquareId=movesJsonObject.white[0].startSquare;\r\n");
      out.write("\t\t\t\t\t \t\tvar endSquareId=movesJsonObject.white[0].endSquare;\r\n");
      out.write("\t\t\t\t\t \t\tvar inCheck = movesJsonObject.white[0].inCheck;\r\n");
      out.write("\t\t\t\t\t \t\tvar gameOver = movesJsonObject.white[0].gameOver;\r\n");
      out.write("\t\t\t\t\t \t\tvar quitGame = movesJsonObject.white[0].quitGame;\r\n");
      out.write("\t\t\t\t\t \t\tif(quitGame == \"yes\")\r\n");
      out.write("\t\t\t\t\t \t\t{\r\n");
      out.write("\t\t\t\t\t \t\t\t$.blockUI.defaults.css = {};\r\n");
      out.write("\t\t\t   \t\t\t\t\t$.blockUI({ message: whiteUser+ 'has chosen to end the game<br/><br/><input type=\"button\" value=\"Ok\" onclick=\"EndGameOtherUser();\"/> '  });\r\n");
      out.write("\t\t\t\t\t \t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t \t\tvar pieceToMove=document.getElementById(pieceId);\r\n");
      out.write("\t\t\t\t\t \t\tvar startSquare=document.getElementById(startSquareId);\r\n");
      out.write("\t\t\t\t\t \t\tvar endSquare=document.getElementById(endSquareId);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t \t\tvar booleanOccupiedSquare=checkIfOccupiedSquare(endSquare);\r\n");
      out.write("\t\t\t\t\t\t\tif(booleanOccupiedSquare == \"yes\")\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\tvar attackedPiece=null;\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor(i=0;i<endSquare.childNodes.length;i++)\r\n");
      out.write("\t\t\t  \t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t  \t\t\t\t\t\tif(endSquare.childNodes[i] == \"[object HTMLImageElement]\")\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t\t\tattackedPiece = endSquare.childNodes[i];\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t}\r\n");
      out.write("\t\t\t\t\t\t\t\tendSquare.removeChild(attackedPiece);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tvar attackedPieceClassArray = attackedPiece.className.split(' ');\r\n");
      out.write("\t\t\t\t\t\t\t\tvar attackedPieceColor=attackedPieceClassArray[2];\r\n");
      out.write("\t\t\t\t\t\t\t\tif(attackedPieceColor == \"white\")\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById('removedPiecesWhite').appendChild(attackedPiece);\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\tif(attackedPieceColor == \"black\")\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById('removedPiecesBlack').appendChild(attackedPiece);\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t \t\tstartSquare.removeChild(pieceToMove);\r\n");
      out.write("\t\t\t\t\t\t    endSquare.appendChild(pieceToMove);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t   \tvar DroppedPiece=getPieceType(pieceToMove);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t    \tdocument.getElementById(\"lastBlackMove\").innerHTML=\"\";\r\n");
      out.write("\t\t\t\t\t    \tdocument.getElementById(\"lastWhiteMove\").innerHTML=\"Last Move : \"+DroppedPiece+\" : \"+startSquareId+\" - \"+endSquareId;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tif(gameOver == \"yes\")\r\n");
      out.write("\t\t\t\t\t \t\t{\r\n");
      out.write("\t\t\t\t\t \t\t\talert(\"Buddy you Lost the Game\");\r\n");
      out.write("\t\t\t\t\t \t\t\twindow.location=\"GamePage.jsp\";\r\n");
      out.write("\t\t\t\t\t \t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    else\r\n");
      out.write("\t\t\t\t\t\t    {\r\n");
      out.write("\t\t\t\t\t\t\t    $('.black').draggable({ containment: [42, 149, 390, 475],revert: true });\r\n");
      out.write("\t\t\t\t\t\t \t\tdocument.getElementById('turnIndicator').innerHTML=blackUser+\"'s turn\";\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t \t\tif(inCheck ==\"yes\")\r\n");
      out.write("\t\t\t\t\t\t \t\t{\r\n");
      out.write("\t\t\t\t\t\t \t\t\talert(\"Buddy You are in Check + '\\n' + Save Your King\");\r\n");
      out.write("\t\t\t\t\t\t \t\t}\r\n");
      out.write("\t\t\t\t\t\t \t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t \t\txmlhttp=GetXmlHttpObject();\r\n");
      out.write("\t\t\t\t\t    \txmlhttp.onreadystatechange=function()\r\n");
      out.write("\t\t\t\t\t    \t{\r\n");
      out.write("\t\t\t\t\t\t\t if(xmlhttp.readyState==4)\r\n");
      out.write("\t\t\t\t\t\t\t \t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t \t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\txmlhttp.open(\"GET\",\"sendMoves.do?startSquare=null&endSquare=null&startImageId=null&userColor=white&gameId=\"+gameId,true);\r\n");
      out.write("\t\t\t\t\t\t\txmlhttp.send(null);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t \t}\r\n");
      out.write("\t\t\t\t\t \tif(userColor == \"white\")\r\n");
      out.write("\t\t\t\t\t \t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t \t\tvar pieceId=movesJsonObject.black[0].pieceId;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t \t\tvar startSquareId=movesJsonObject.black[0].startSquare;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t \t\tvar endSquareId=movesJsonObject.black[0].endSquare;\r\n");
      out.write("\t\t\t\t\t \t\tvar inCheck = movesJsonObject.black[0].inCheck;\r\n");
      out.write("\t\t\t\t\t \t\tvar gameOver = movesJsonObject.black[0].gameOver;\r\n");
      out.write("\t\t\t\t\t \t\tvar quitGame = movesJsonObject.black[0].quitGame;\r\n");
      out.write("\t\t\t\t\t \t\tif(quitGame == \"yes\")\r\n");
      out.write("\t\t\t\t\t \t\t{\r\n");
      out.write("\t\t\t\t\t \t\t\t$.blockUI.defaults.css = {};\r\n");
      out.write("\t\t\t   \t\t\t\t\t$.blockUI({ message: blackUser+ 'has chosen to end the game<br/><br/><input type=\"button\" value=\"Ok\" onclick=\"EndGameOtherUser();\"/> '  });\r\n");
      out.write("\t\t\t\t\t \t\t}\r\n");
      out.write("\t\t\t\t\t \t\tvar pieceToMove=document.getElementById(pieceId);\r\n");
      out.write("\t\t\t\t\t \t\tvar startSquare=document.getElementById(startSquareId);\r\n");
      out.write("\t\t\t\t\t \t\tvar endSquare=document.getElementById(endSquareId);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t \t\tvar booleanOccupiedSquare=checkIfOccupiedSquare(endSquare);\r\n");
      out.write("\t\t\t\t\t\t\tif(booleanOccupiedSquare == \"yes\")\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\tvar attackedPiece=null;\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor(i=0;i<endSquare.childNodes.length;i++)\r\n");
      out.write("\t\t\t  \t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t  \t\t\t\t\t\tif(endSquare.childNodes[i] == \"[object HTMLImageElement]\")\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t\t\tattackedPiece = endSquare.childNodes[i];\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t}\r\n");
      out.write("\t\t\t\t\t\t\t\tendSquare.removeChild(attackedPiece);\r\n");
      out.write("\t\t\t\t\t\t\t\tvar attackedPieceClassArray = attackedPiece.className.split(' ');\r\n");
      out.write("\t\t\t\t\t\t\t\tvar attackedPieceColor=attackedPieceClassArray[2];\r\n");
      out.write("\t\t\t\t\t\t\t\tif(attackedPieceColor == \"white\")\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById('removedPiecesWhite').appendChild(attackedPiece);\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\tif(attackedPieceColor == \"black\")\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById('removedPiecesBlack').appendChild(attackedPiece);\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t \t\tstartSquare.removeChild(pieceToMove);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    endSquare.appendChild(pieceToMove);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    var DroppedPiece=getPieceType(pieceToMove);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t    \tdocument.getElementById(\"lastWhiteMove\").innerHTML=\"\";\r\n");
      out.write("\t\t\t\t\t    \tdocument.getElementById(\"lastBlackMove\").innerHTML=\"Last Move : \"+DroppedPiece+\" : \"+startSquareId+\" - \"+endSquareId;\r\n");
      out.write("\t\t\t\t\t\t\tif(gameOver ==\"yes\")\r\n");
      out.write("\t\t\t\t\t \t\t{\r\n");
      out.write("\t\t\t\t\t \t\t\talert(\"Buddy you Lost the Game\");\r\n");
      out.write("\t\t\t\t\t \t\t\twindow.location=\"GamePage.jsp\";\r\n");
      out.write("\t\t\t\t\t \t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t \t\telse\r\n");
      out.write("\t\t\t\t\t \t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t    $('.white').draggable({ containment: [42, 149, 390, 475],revert: true });\r\n");
      out.write("\t\t\t\t\t\t\t   \tdocument.getElementById('turnIndicator').innerHTML=whiteUser+\"'s turn\";\r\n");
      out.write("\t\t\t\t\t\t\t   \tif(inCheck ==\"yes\")\r\n");
      out.write("\t\t\t\t\t\t \t\t{\r\n");
      out.write("\t\t\t\t\t\t \t\t\talert(\"Buddy You are in Check+'\\n'+Save Your King\");\r\n");
      out.write("\t\t\t\t\t\t \t\t}\r\n");
      out.write("\t\t\t\t\t\t \t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t   \txmlhttp=GetXmlHttpObject();\r\n");
      out.write("\t\t\t\t\t    \txmlhttp.onreadystatechange=function()\r\n");
      out.write("\t\t\t\t\t    \t{\r\n");
      out.write("\t\t\t\t\t\t\t if(xmlhttp.readyState==4)\r\n");
      out.write("\t\t\t\t\t\t\t \t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t \t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\txmlhttp.open(\"GET\",\"sendMoves.do?startSquare=null&endSquare=null&startImageId=null&userColor=black&gameId=\"+gameId,true);\r\n");
      out.write("\t\t\t\t\t\t\txmlhttp.send(null);\r\n");
      out.write("\t\t\t\t\t \t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\txmlhttp.open(\"GET\",\"getMovesJSON.do?gameId=\"+gameId,true);\r\n");
      out.write("\t\t\t\txmlhttp.send(null);\r\n");
      out.write("\t\t\t\tsetTimeout(\"getMovesData()\",5000);\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\r\n");
      out.write("\t\t\t  function GetXmlHttpObject()\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tif (window.XMLHttpRequest)\r\n");
      out.write("\t\t\t\t\t  {\r\n");
      out.write("\t\t\t\t\t  return new XMLHttpRequest();\r\n");
      out.write("\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t\tif (window.ActiveXObject)\r\n");
      out.write("\t\t\t\t\t  {\r\n");
      out.write("\t\t\t\t\t  return new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t\treturn null;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t  function QuitDialog()\r\n");
      out.write("\t\t\t  {\r\n");
      out.write("\t\t\t   $.blockUI.defaults.css = {};\r\n");
      out.write("\t\t\t   $.blockUI({ message: 'This will end the game<br/>Are You sure want to quit ?<br/><br/><input type=\"button\" value=\"Yes\" onclick=\"EndGame();\"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"button\" value=\"No\" onclick=\"HideQuitDialog();\"/> '  });\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\r\n");
      out.write("\t\t\t  function HideQuitDialog()\r\n");
      out.write("\t\t\t  {\r\n");
      out.write("\t\t\t   $.unblockUI();\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\r\n");
      out.write("              function EndGame()\r\n");
      out.write("              {\r\n");
      out.write("              \txmlhttp=GetXmlHttpObject();\r\n");
      out.write("\t\t    \txmlhttp.onreadystatechange=function()\r\n");
      out.write("\t\t    \t{\r\n");
      out.write("\t\t\t\t if(xmlhttp.readyState==4)\r\n");
      out.write("\t\t\t\t \t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t \t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\txmlhttp.open(\"GET\",\"sendMoves.do?startSquare=null&endSquare=null&startImageId=null&userColor=black&gameId=\"+gameId+\"&quitGame=yes\",true);\r\n");
      out.write("\t\t\t\txmlhttp.send(null);\r\n");
      out.write("\r\n");
      out.write("              \t$.unblockUI();\r\n");
      out.write("                window.location=\"quitGame.do?gameId=\"+gameId;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              function EndGameOtherUser()\r\n");
      out.write("              {\r\n");
      out.write("              window.location = \"GamePage.jsp\";\r\n");
      out.write("              }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"getMovesData()\">\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<img src=\"img/title1.png\" style=\"float:left;margin-right:30em\"/>\r\n");
      out.write("\t\t<div style=\"margin-top:2.5em;color:yellow\">\r\n");
      out.write("\t\tWelcome\r\n");
      out.write("\t    <span style=\"font-size:1.2em\">\r\n");
      out.write("\t    \t");
      if (_jspx_meth_c_005fset_005f7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t    \t  ");
      if (_jspx_meth_c_005fout_005f4(_jspx_page_context))
        return;
      out.write(",\r\n");
      out.write("\t    \t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t    </span>\r\n");
      out.write("\t   <span style=\"color:yellow;text-decoration:underline;cursor:pointer\" onclick=\"alert('You can not LOG OUT while the game is going on. '+'\\n'+'Please Click on QUIT GAME to quit');\">Log out</span>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"navigation\" class=\"container\">\r\n");
      out.write("\t\t<div id=\"PlayChess\" class=\"pri-nav active\"><div><a>PlayChess</a></div></div>\r\n");
      out.write("\t\t<div id=\"LearnChess\" class=\"pri-nav active\"><div><a>LearnChess</a></div></div>\r\n");
      out.write("\t\t<div id=\"Members\" class=\"pri-nav active\"><div><a>Members</a></div></div>\r\n");
      out.write("\t\t<div id=\"AboutUs\" class=\"pri-nav active\"><div><a>AboutUs</a></div></div>\r\n");
      out.write("\t\t<div id=\"ContactUs\" class=\"pri-nav active\"><div><a>ContactUs</a></div></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"GameArea\" style=\"border:2px solid white;margin-top:5em;height:24em;background-color:rgb(200,24,24);-moz-border-radius:0.75em;width:58em;margin-left:2em\">\r\n");
      out.write("\t\t<table id=\"chessboard\" style=\"margin:0.5em 0.5em 0.5em 0.5em;empty-cells:show;border-collapse:collapse;float:left\">\r\n");
      out.write("\t\t\t\t<tr class=\"chess\" >\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\" id=\"a1\">\r\n");
      out.write("\t\t\t\t\t\t<img  class=\"ChessPieces draggable white rook\" id=\"rook_white1\" src=\"img/rook_white.gif\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable \" id=\"a2\">\r\n");
      out.write("\t\t\t\t\t\t<img  class=\"ChessPieces draggable white knight\" id=\"knight_white1\" src=\"img/knight_white.gif\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\" id=\"a3\">\r\n");
      out.write("\t\t\t\t\t\t<img  class=\"ChessPieces draggable white bishop\" id=\"bishop_white1\" src=\"img/bishop_white.gif\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable \" id=\"a4\">\r\n");
      out.write("\t\t\t\t\t\t<img  class=\"ChessPieces draggable white king\" id=\"king_white\" src=\"img/king_white.gif\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td  class=\"chess droppable\" id=\"a5\">\r\n");
      out.write("\t\t\t\t\t\t<img  class=\"ChessPieces draggable white queen\" id=\"queen_white\" src=\"img/queen_white.gif\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\"  id=\"a6\">\r\n");
      out.write("\t\t\t\t\t\t<img  class=\"ChessPieces draggable white bishop\" id=\"bishop_white2\" src=\"img/bishop_white.gif\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\" id=\"a7\">\r\n");
      out.write("\t\t\t\t\t\t<img  class=\"ChessPieces draggable white knight\" id=\"knight_white2\" src=\"img/knight_white.gif\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\"  id=\"a8\">\r\n");
      out.write("\t\t\t\t\t\t<img  class=\"ChessPieces draggable white rook\" id=\"rook_white2\" src=\"img/rook_white.gif\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=\"chess\" >\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess1 droppable \" id=\"b1\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable white pawn\" id=\"pawn_white1\" src=\"img/pawn_white.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess droppable\" id=\"b2\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable white pawn\" id=\"pawn_white2\" src=\"img/pawn_white.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess1 droppable \" id=\"b3\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable white pawn\" id=\"pawn_white3\" src=\"img/pawn_white.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess droppable\" id=\"b4\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable white pawn\" id=\"pawn_white4\" src=\"img/pawn_white.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess1 droppable \" id=\"b5\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable white pawn\" id=\"pawn_white5\" src=\"img/pawn_white.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td  class=\"chess droppable\" id=\"b6\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable white pawn\" id=\"pawn_white6\" src=\"img/pawn_white.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess1 droppable\"  id=\"b7\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable white pawn\" id=\"pawn_white7\" src=\"img/pawn_white.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess droppable\" id=\"b8\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable white pawn\" id=\"pawn_white8\" src=\"img/pawn_white.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=\"chess\" >\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\"  id=\"c1\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\"  id=\"c2\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\" id=\"c3\" >\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\" id=\"c4\" >\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\" id=\"c5\" >\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\" id=\"c6\" >\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\"  id=\"c7\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\" id=\"c8\" >\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr class=\"chess\" >\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\" id=\"d1\" >\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\" id=\"d2\" >\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\" id=\"d3\" >\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\"  id=\"d4\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\"  id=\"d5\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\" id=\"d6\" >\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\" id=\"d7\" >\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\"  id=\"d8\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr class=\"chess\" >\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\"  id=\"e1\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\" id=\"e2\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\"  id=\"e3\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\"  id=\"e4\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\"  id=\"e5\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\"  id=\"e6\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\"  id=\"e7\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\"  id=\"e8\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr class=\"chess\" >\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\"  id=\"f1\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\"  id=\"f2\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\"  id=\"f3\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\"  id=\"f4\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\"  id=\"f5\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\"  id=\"f6\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess1 droppable\"  id=\"f7\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"chess droppable\"  id=\"f8\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=\"chess\">\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess droppable\" id=\"g1\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black pawn\" id=\"pawn_black1\" src=\"img/pawn_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess1 droppable \" id=\"g2\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black pawn\" id=\"pawn_black2\" src=\"img/pawn_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess droppable\" id=\"g3\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black pawn\" id=\"pawn_black3\" src=\"img/pawn_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess1 droppable \" id=\"g4\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black pawn\"  id=\"pawn_black4\" src=\"img/pawn_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess droppable \" id=\"g5\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black pawn\" id=\"pawn_black5\" src=\"img/pawn_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td  class=\"chess1 droppable\" id=\"g6\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black pawn\" id=\"pawn_black6\" src=\"img/pawn_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess droppable\"  id=\"g7\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black pawn\" id=\"pawn_black7\" src=\"img/pawn_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess1 droppable\" id=\"g8\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black pawn\" id=\"pawn_black8\" src=\"img/pawn_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=\"chess\" >\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess1 droppable\" id=\"h1\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black rook\" id=\"rook_black1\" src=\"img/rook_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess droppable \" id=\"h2\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black knight\" id=\"knight_black1\" src=\"img/knight_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess1 droppable\" id=\"h3\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black bishop\" id=\"bishop_black1\" src=\"img/bishop_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess droppable \" id=\"h4\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black king\" id=\"king_black\" src=\"img/king_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td  class=\"chess1 droppable\" id=\"h5\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black queen\" id=\"queen_black\" src=\"img/queen_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess droppable\"  id=\"h6\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black bishop\" id=\"bishop_black2\" src=\"img/bishop_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess1 droppable\" id=\"h7\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black knight\" id=\"knight_black2\" src=\"img/knight_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"chess droppable\"  id=\"h8\">\r\n");
      out.write("\t\t\t\t\t\t\t<img  class=\"ChessPieces draggable black rook\" id=\"rook_black2\" src=\"img/rook_black.gif\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"gameinfo\" style=\"margin-top:1em;float:left;width:15em;height:100%\"/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fset_005f8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fset_005f9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t    \t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"float:right;width:15em\">\r\n");
      out.write("\t\t\t<div id=\"turnIndicator\" style=\"font-size:2em\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"removedPiecesWhite\" style=\"width:15em;height:8em\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"removedPiecesBlack\" style=\"width:15em;height:8em\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<input type=\"button\" style=\"margin-top:4em\" value=\"Quit Game\" onclick=\"QuitDialog()\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invited != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t    \t\t");
        if (_jspx_meth_c_005fset_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_005fset_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t    \t\t");
        if (_jspx_meth_c_005fset_005f2(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    _jspx_th_c_005fset_005f0.setVar("userColor");
    _jspx_th_c_005fset_005f0.setValue(new String("white"));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    _jspx_th_c_005fset_005f1.setVar("blackUser");
    _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invited}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    _jspx_th_c_005fset_005f2.setVar("whiteUser");
    _jspx_th_c_005fset_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
    if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invitedBy != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_005fset_005f3(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t    \t\t");
        if (_jspx_meth_c_005fset_005f4(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t    \t\t");
        if (_jspx_meth_c_005fset_005f5(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    _jspx_th_c_005fset_005f3.setVar("userColor");
    _jspx_th_c_005fset_005f3.setValue(new String("black"));
    int _jspx_eval_c_005fset_005f3 = _jspx_th_c_005fset_005f3.doStartTag();
    if (_jspx_th_c_005fset_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    _jspx_th_c_005fset_005f4.setVar("blackUser");
    _jspx_th_c_005fset_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f4 = _jspx_th_c_005fset_005f4.doStartTag();
    if (_jspx_th_c_005fset_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    _jspx_th_c_005fset_005f5.setVar("whiteUser");
    _jspx_th_c_005fset_005f5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invitedBy}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f5 = _jspx_th_c_005fset_005f5.doStartTag();
    if (_jspx_th_c_005fset_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f6 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f6.setParent(null);
    _jspx_th_c_005fset_005f6.setVar("gameId");
    _jspx_th_c_005fset_005f6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.gameId}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f6 = _jspx_th_c_005fset_005f6.doStartTag();
    if (_jspx_th_c_005fset_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f6);
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
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gameId}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
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
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userColor}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${whiteUser}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${blackUser}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f7 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f7.setParent(null);
    _jspx_th_c_005fset_005f7.setVar("name");
    _jspx_th_c_005fset_005f7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f7 = _jspx_th_c_005fset_005f7.doStartTag();
    if (_jspx_th_c_005fset_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f7);
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
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
    if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (true) {
          _jspx_page_context.forward("showerror.jsp");
          return true;
        }
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f8 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f8.setParent(null);
    _jspx_th_c_005fset_005f8.setVar("invited");
    _jspx_th_c_005fset_005f8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.invited}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f8 = _jspx_th_c_005fset_005f8.doStartTag();
    if (_jspx_th_c_005fset_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f9 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f9.setParent(null);
    _jspx_th_c_005fset_005f9.setVar("invitedBy");
    _jspx_th_c_005fset_005f9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.invitedBy}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f9 = _jspx_th_c_005fset_005f9.doStartTag();
    if (_jspx_th_c_005fset_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invited != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t    \t\t");
        if (_jspx_meth_c_005fset_005f10(_jspx_th_c_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t    \t\t");
        if (_jspx_meth_c_005fset_005f11(_jspx_th_c_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t<div  style=\"height:10em\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fset_005f12(_jspx_th_c_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t    \t  \t\t");
        if (_jspx_meth_c_005fout_005f5(_jspx_th_c_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t    \t  \t\t<div id=\"lastWhiteMove\">\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div  style=\"color:black;height:10em\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fout_005f6(_jspx_th_c_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t<div id=\"lastBlackMove\">\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f10 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    _jspx_th_c_005fset_005f10.setVar("whiteUser");
    _jspx_th_c_005fset_005f10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f10 = _jspx_th_c_005fset_005f10.doStartTag();
    if (_jspx_th_c_005fset_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f11 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    _jspx_th_c_005fset_005f11.setVar("blackUser");
    _jspx_th_c_005fset_005f11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invited}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f11 = _jspx_th_c_005fset_005f11.doStartTag();
    if (_jspx_th_c_005fset_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f12 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    _jspx_th_c_005fset_005f12.setVar("name");
    _jspx_th_c_005fset_005f12.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f12 = _jspx_th_c_005fset_005f12.doStartTag();
    if (_jspx_th_c_005fset_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f12);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    _jspx_th_c_005fout_005f5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
    if (_jspx_th_c_005fout_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    _jspx_th_c_005fout_005f6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invited}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f6 = _jspx_th_c_005fout_005f6.doStartTag();
    if (_jspx_th_c_005fout_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent(null);
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invitedBy != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_005fset_005f13(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t    \t\t");
        if (_jspx_meth_c_005fset_005f14(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t<div  style=\"height:10em\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fout_005f7(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t<div id=\"lastWhiteMove\">\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div  style=\"color:black;height:10em\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fset_005f15(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t    \t  \t\t");
        if (_jspx_meth_c_005fout_005f8(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t    \t  \t\t<div id=\"lastBlackMove\">\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f13 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    _jspx_th_c_005fset_005f13.setVar("whiteUser");
    _jspx_th_c_005fset_005f13.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invitedBy}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f13 = _jspx_th_c_005fset_005f13.doStartTag();
    if (_jspx_th_c_005fset_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f13);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f14 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    _jspx_th_c_005fset_005f14.setVar("blackUser");
    _jspx_th_c_005fset_005f14.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f14 = _jspx_th_c_005fset_005f14.doStartTag();
    if (_jspx_th_c_005fset_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f14);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    _jspx_th_c_005fout_005f7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invitedBy}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f7 = _jspx_th_c_005fout_005f7.doStartTag();
    if (_jspx_th_c_005fout_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f15 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    _jspx_th_c_005fset_005f15.setVar("name");
    _jspx_th_c_005fset_005f15.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f15 = _jspx_th_c_005fset_005f15.doStartTag();
    if (_jspx_th_c_005fset_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f15);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    _jspx_th_c_005fout_005f8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f8 = _jspx_th_c_005fout_005f8.doStartTag();
    if (_jspx_th_c_005fout_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f8);
    return false;
  }
}
