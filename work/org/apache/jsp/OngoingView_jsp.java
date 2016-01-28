package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class OngoingView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<title>Shatranj</title>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/main.css\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.js\" ></script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/navigation.js\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.blockUI.js\" ></script>\r\n");
      out.write("  \t<script type=\"text/javascript\" src=\"js/chess-moves.js\"></script>\r\n");
      out.write("  \t<script type=\"text/javascript\" src=\"js/chess-functions.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\tvar whiteUser=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gameUsers[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\tvar blackUser=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gameUsers[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\tvar movesJsonDataObject =null;\r\n");
      out.write("\t\tvar movesJsonDataObjectLength = null;\r\n");
      out.write("\t\tvar moveCounter =  0;\r\n");
      out.write("\t\tvar attackedPiecesArray = [\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"];\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\tfunction LoadGameState()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t var movesJsonDataJson = document.getElementById(\"MovesJsonData\").innerHTML;\r\n");
      out.write("\t\t\t movesJsonDataObject = eval('(' + movesJsonDataJson + ')');\r\n");
      out.write("\t\t\t movesJsonDataObjectLength = movesJsonDataObject.length ;\r\n");
      out.write("\r\n");
      out.write("\t\t\tfor(moveCounter=0;moveCounter<movesJsonDataObjectLength;moveCounter++)\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\texecuteMove(moveCounter,movesJsonDataObject);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tgetNextMove();\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction getNextMove()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\tvar gameId = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gameId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t\txmlhttp=GetXmlHttpObject();\r\n");
      out.write("\t    \txmlhttp.onreadystatechange=function()\r\n");
      out.write("\t    \t{\r\n");
      out.write("\t\t\t \tif(xmlhttp.readyState==4)\r\n");
      out.write("\t\t\t \t{\r\n");
      out.write("\t\t\t \t\tvar updatedMovesJsonDataJson = xmlhttp.responseText ;\r\n");
      out.write("\t\t\t \t\tmovesJsonDataObjectLength = movesJsonDataObject.length ;\r\n");
      out.write("\t\t\t\t\tvar updatedMovesJsonDataObject = eval('(' + updatedMovesJsonDataJson + ')');\r\n");
      out.write("\t\t\t\t    updatedMovesJsonDataObjectLength = updatedMovesJsonDataObject.length ;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif(updatedMovesJsonDataObjectLength == movesJsonDataObjectLength)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif(updatedMovesJsonDataObjectLength  > movesJsonDataObjectLength)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tvar differenceMoves = (updatedMovesJsonDataObjectLength - movesJsonDataObjectLength);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tfor(moveCounter=movesJsonDataObjectLength;moveCounter<updatedMovesJsonDataObjectLength;moveCounter++)\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\texecuteMove(moveCounter,updatedMovesJsonDataObject);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tmovesJsonDataObject = updatedMovesJsonDataObject;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\txmlhttp.open(\"GET\",\"getNextMove.do?gameId=\"+gameId,true);\r\n");
      out.write("\t\t\txmlhttp.send(null);\r\n");
      out.write("\t\t\tsetTimeout(\"getNextMove()\",5000);\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction executeMove(counter,JsonObject)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar pieceId = JsonObject[counter][0];\r\n");
      out.write("\t\t\tvar startSquareId = JsonObject[counter][1];\r\n");
      out.write("\t\t\tvar endSquareId = JsonObject[counter][2];\r\n");
      out.write("\t\t\tvar startSquare=document.getElementById(startSquareId);\r\n");
      out.write("\t\t\tvar endSquare=document.getElementById(endSquareId);\r\n");
      out.write("\t\t\tvar pieceToMove=document.getElementById(pieceId);\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar booleanOccupiedSquare=checkIfOccupiedSquare(endSquare);\r\n");
      out.write("\t\t\tif(booleanOccupiedSquare == \"yes\")\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tvar attackedPiece=null;\r\n");
      out.write("\t\t\t\tfor(d=0;d<endSquare.childNodes.length;d++)\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\r\n");
      out.write(" \t\t\t\t\t\tif(endSquare.childNodes[d].nodeName == \"IMG\")\r\n");
      out.write("\t\t\t  \t\t\t{\r\n");
      out.write("\t\t\t  \t\t\t\tattackedPiece = endSquare.childNodes[d];\r\n");
      out.write("\t\t\t  \t\t\t}\r\n");
      out.write("\t\t\t  \t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t  \tattackedPiecesArray[counter]=\tattackedPiece.id;\r\n");
      out.write("\t\t\t\tendSquare.removeChild(attackedPiece);\r\n");
      out.write("\t\t\t\tvar attackedPieceClassArray = attackedPiece.className.split(' ');\r\n");
      out.write("\t\t\t\tvar attackedPieceColor=attackedPieceClassArray[2];\r\n");
      out.write("\t\t\t\tif(attackedPieceColor == \"white\")\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('removedPiecesWhite').appendChild(attackedPiece);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(attackedPieceColor == \"black\")\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('removedPiecesBlack').appendChild(attackedPiece);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\tstartSquare.removeChild(pieceToMove);\r\n");
      out.write("\t\t\tendSquare.appendChild(pieceToMove);\r\n");
      out.write("\t\t\tupdateLastMove(startSquareId,endSquareId,pieceId,counter);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction updateLastMove(startSquareId,endSquareId,pieceId,counter)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t\tif(counter%2 == 0)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"lastBlackMove\").innerHTML =\"\";\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"lastWhiteMove\").innerHTML = \"Last Move : \"+pieceId+\" : \"+startSquareId+\" - \"+endSquareId;\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"turnIndicator\").innerHTML = whiteUser+\"'s turn\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"lastWhiteMove\").innerHTML =\"\";\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"lastBlackMove\").innerHTML =  \"Last Move : \"+pieceId+\" : \"+startSquareId+\" - \"+endSquareId;\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"turnIndicator\").innerHTML = blackUser+\"'s turn\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction QuitPlayBackDialog()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$.blockUI.defaults.css = {};\r\n");
      out.write("\t\t\t$.blockUI({ message: 'This will end the Ongoing Game view<br/>Are You sure want to quit ?<br/><br/><input type=\"button\" value=\"Yes\" onclick=\"EndPlayBackGame();\"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"button\" value=\"No\" onclick=\"HideQuitPlayBackDialog();\"/> '  });\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction HideQuitPlayBackDialog()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$.unblockUI();\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction EndPlayBackGame()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t window.location=\"Home.jsp\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction GetXmlHttpObject()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif (window.XMLHttpRequest)\r\n");
      out.write("\t\t\t  {\r\n");
      out.write("\t\t\t  return new XMLHttpRequest();\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t\tif (window.ActiveXObject)\r\n");
      out.write("\t\t\t  {\r\n");
      out.write("\t\t\t  return new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t\treturn null;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"LoadGameState()\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<img src=\"img/title1.png\" style=\"float:left;margin-right:30em\"/>\r\n");
      out.write("\r\n");
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
      out.write("\t\t<div id=\"gameinfo\" style=\"margin-top:1em;float:left;width:17em;height:100%\"/>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fset_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div  style=\"height:8em\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t    \t  \t\t<div id=\"lastWhiteMove\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div  style=\"color:black;height:8em\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"lastBlackMove\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"float:right;width:15em\">\r\n");
      out.write("\t\t\t<div id=\"turnIndicator\" style=\"font-size:2em\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"removedPiecesWhite\" style=\"width:15em;height:8em\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"removedPiecesBlack\" style=\"width:15em;height:8em\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input type=\"button\" style=\"margin-top:4em\" value=\"Quit Ongoing View\" onclick=\"QuitPlayBackDialog()\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fset_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"MovesJsonData\" style=\"display:none\">");
      if (_jspx_meth_c_005fout_005f2(_jspx_page_context))
        return;
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    _jspx_th_c_005fset_005f0.setVar("gameUsers");
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.gameUsers}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
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
    _jspx_th_c_005fset_005f1.setVar("gameId");
    _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.gameId}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    _jspx_th_c_005fset_005f2.setVar("gameUsers");
    _jspx_th_c_005fset_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.gameUsers}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
    if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
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
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gameUsers[0]}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gameUsers[1]}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
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
    _jspx_th_c_005fset_005f3.setVar("gameMovesJSONArray");
    _jspx_th_c_005fset_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.gameMovesJSONArray}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f3 = _jspx_th_c_005fset_005f3.doStartTag();
    if (_jspx_th_c_005fset_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
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
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gameMovesJSONArray}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }
}
