package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LearnChess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.scrollTo-min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.highlightFade.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/init.js\"></script>\r\n");
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
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"navigation\" class=\"container\">\r\n");
      out.write("\t\t<div id=\"PlayChess\" class=\"pri-nav \"><div><a href=\"PlayChess.jsp\">PlayChess</a></div></div>\r\n");
      out.write("\t\t<div id=\"LearnChess\" class=\"pri-nav active\"><div><a>LearnChess</a></div></div>\r\n");
      out.write("\t\t<div id=\"Members\" class=\"pri-nav\"><div><a href=\"Members.jsp\">Members</a></div></div>\r\n");
      out.write("\t\t<div id=\"AboutUs\" class=\"pri-nav\"><div><a href=\"AboutUs.jsp\">AboutUs</a></div></div>\r\n");
      out.write("\t\t<div id=\"ContactUs\" class=\"pri-nav\"><div><a href=\"ContactUs.jsp\">ContactUs</a></div></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"LearnChessDiv\" style=\"border:2px solid white;margin-top:5em;padding:0.5em;background-color:rgb(200,24,24);-moz-border-radius:0.75em;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t  <a id=\"top_zone\"></a>\r\n");
      out.write("\t  <h1 style=\"font-size:1.4em\">CHESS RULES AND BASICS</h1>\r\n");
      out.write("\r\n");
      out.write("\t<a id=\"question_1\" onClick=\"return false;\" href=\"#\">Basic rules </a><br />\r\n");
      out.write("\t<a id=\"question_2\" onClick=\"return false;\" href=\"#\">Aim of the game </a><br />\r\n");
      out.write("\t<a id=\"question_3\" onClick=\"return false;\" href=\"#\">Start of the game </a><br />\r\n");
      out.write("\t<a id=\"question_4\" onClick=\"return false;\" href=\"#\">Chess Pieces </a><br />\r\n");
      out.write("\t<a id=\"question_5\" onClick=\"return false;\" href=\"#\">Playing the game </a><br />\r\n");
      out.write("\t<a id=\"question_6\" onClick=\"return false;\" href=\"#\">End of the game </a><br />\r\n");
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<h3 id=\"answer_1\">Basic rules</h3>\r\n");
      out.write("\t<div id=\"answer_1_text\">\r\n");
      out.write("\t\t<img src=\"img/up_arrow.png\" class=\"go_to_top\" style=\"cursor:pointer\">\r\n");
      out.write("\t\tChess is a two-player game, where one player is assigned white pieces and the other black. Each player has 16 pieces to start the game: one king, one queen, two rooks, two bishops, two knights and eight pawns.\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<h3 id=\"answer_2\">Aim of the game </h3>\r\n");
      out.write("\t<div id=\"answer_2_text\">\r\n");
      out.write("\t\t<img src=\"img/up_arrow.png\" class=\"go_to_top\" style=\"cursor:pointer\">\r\n");
      out.write("\t\tThe object of the game is to capture the other player's king. This capture is never actually completed, but once a king is under attack and unable to avoid capture, it is said to be checkmated and the game is over.\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<h3 id=\"answer_3\">Start of the game </h3>\r\n");
      out.write("\t<div id=\"answer_3_text\">\r\n");
      out.write("\t\t<img src=\"img/up_arrow.png\" class=\"go_to_top\" style=\"cursor:pointer\">\r\n");
      out.write("\t\tThe game is started in the position shown below on a chess board consisting of 64 squares in an 8x8 grid. The White player moves first. Then each player takes a single turn. In fact, a player must move in turn. In other words a move cannot be skipped.\r\n");
      out.write("\t\t<img src=\"img/LearnChessBoard.JPG\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<h3 id=\"answer_4\">Chess Pieces </h3>\r\n");
      out.write("\t\t<div id=\"answer_4_text\">\r\n");
      out.write("\t\t\t<img src=\"img/up_arrow.png\" class=\"go_to_top\" style=\"cursor:pointer\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t <h4>The King</h4>\r\n");
      out.write("\t\t\tThe king is the most important piece on the chessboard. The king may move one square in any direction, including diagonally . It can never be captured and if it is in danger then it must be made safe immediately. If it is not possible to make the king safe then the game is lost. When they are attacked by a piece of the opponent, it is called check, and when in a check that cannot be removed, they are checkmated, and the game is lost for their owner.\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h4>The Queen</h4>\r\n");
      out.write("\t\t\tThe queen is the most powerful piece on the board. This is because it can control more squares than any other chessman. It moves straight forward or backwards and diagonally any number of squares. However, it cannot jump over other pieces.\r\n");
      out.write("\t\t\t <h4>The Rook</h4>\r\n");
      out.write("\t\t\tThe rook moves any number of squares horizontally or vertically, but it cannot jump over other pieces.\r\n");
      out.write("\t\t\t <h4>The Bishop</h4>\r\n");
      out.write("\t\t\tThe bishop moves to any square on the diagonals on which it stands. However, it is not allowed to jump over other pieces.\r\n");
      out.write("\t\t\t <h4>The Knight</h4>\r\n");
      out.write("\t\t\tThe knight's move is composed of two different steps; first, it makes one step of one single square along its rank or file, and then, still moving away from the square of departure, one step of one single square on a diagonal. It does not matter if the square of the first step is occupied.\r\n");
      out.write("\t\t\t<h4>The Pawn</h4>\r\n");
      out.write("\t\t\tThe pawn normally moves only forward.\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t<li>First move: It advances from its original square either one or two vacant squares along the file on which it is placed, and on subsequent moves it advances one vacant square along the file.</li>\r\n");
      out.write("\t\t\t<li>Capturing: it advances one square along either of the diagonals on which it stands.</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<h3 id=\"answer_5\">Playing the game  </h3>\r\n");
      out.write("\t<div id=\"answer_5_text\">\r\n");
      out.write("\t\t\t<img src=\"img/up_arrow.png\" class=\"go_to_top\" style=\"cursor:pointer\"/>\r\n");
      out.write("\t\t\tA move consists of placing one piece on a different square, following the rules of movement for that piece.\r\n");
      out.write("\t\t\tA player can take an opponent's piece by moving one of his or her own pieces to the square that contains an opponent's piece. The opponent's piece is removed from the board and is out of play for the rest of the game.\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h4>Check</h4>\r\n");
      out.write("\t\t\tIf a King is threatened with capture, but has a means to escape, then it is said to be in check. A King cannot move into check, and if in check must move out of check immediately. There are three ways you may move out of check:\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t<li>Capture the checking piece</li>\r\n");
      out.write("\t\t\t<li>Block the line of attack by placing one of your own pieces between the checking piece and the King. (Of course, a Knight cannot be blocked.)</li>\r\n");
      out.write("\t\t\t<li>Move the King away from check.</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<h4>Checkmate</h4>\r\n");
      out.write("\t\t\tThe primary objective in chess is to checkmate your opponent's King. When a King cannot avoid capture then it is checkmated and the game is immediately over.\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h4>Stalemate</h4>\r\n");
      out.write("\t\t\tThe game is drawn when the player to move has no legal move and his king is not in check. The game is said to end in 'stalemate'. This immediately ends the game.\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<h3 id=\"answer_6\">End of the game </h3>\r\n");
      out.write("\t\t<div id=\"answer_6_text\">\r\n");
      out.write("\t\t\t<img src=\"img/up_arrow.png\" class=\"go_to_top\" style=\"cursor:pointer\">\r\n");
      out.write("\t\t\t<h4>Winning</h4>\r\n");
      out.write("\t\t\tThe game is won by the player\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t<li>who has checkmated his opponent's king.</li>\r\n");
      out.write("\t\t\t<li>whose opponent declares he resigns. </li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<h4>Draw </h4>\r\n");
      out.write("\t\t\tThe game is drawn when the king of the player who has the move is not in check, and this player cannot make any legal move. The player's king is then said to be \"stalemated\". This immediately ends the game.\r\n");
      out.write("\t\t\tThe game is drawn upon agreement between the two players.\r\n");
      out.write("\t\t\tThe game is drawn when one of the following endings arises:\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t<li>king against king;</li>\r\n");
      out.write("\t\t\t<li>king against king with only bishop or knight; </li>\r\n");
      out.write("\t\t\t<li>king and bishop against king and bishop, with both bishops on diagonals of the same colour. </li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\tThe player to move can claim a draw if\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t<li>the same position with the same player to move is repeated three times in the game </li>\r\n");
      out.write("\t\t\t<li>there are have been 50 consecutive moves of white and of black without\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>any piece taken</li>\r\n");
      out.write("\t\t\t\t<li>any pawn move</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<h4>Losing </h4>\r\n");
      out.write("\t\t\tThe game is lost by a player who has not completed the prescribed number of moves in the allotted time, unless his opponent has only the king remaining, in which case the game is drawn.\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
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
