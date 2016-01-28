<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<head>
	<title>Shatranj</title>

	<link rel="stylesheet" href="css/main.css" type="text/css" />

	<script type="text/javascript" src="js/jquery.js" ></script>
	<script type="text/javascript" src="js/jquery-bp.js" ></script>
	<script type="text/javascript" src="js/navigation.js" ></script>
	<script type="text/javascript" src="js/jquery.scrollTo-min.js"></script>
	<script type="text/javascript" src="js/jquery.highlightFade.js"></script>
	<script type="text/javascript" src="js/init.js"></script>

</head>
<body>
	<div id="header">
		<img src="img/title1.png" style="float:left;margin-right:30em"/>
		<div style="margin-top:2.5em;color:yellow">

	    	<c:set var="name" value="${sessionScope.userName}" />
	    	<c:if test="${name != null}">
	    		Welcome
	   		    <span style="font-size:1.2em">
		    	    <c:out   value="${name}" />,
		    	    <a href="logout.do" style="color:yellow">Log out</a>
	    	    </span>
	    	</c:if>
	   	</div>
	</div>
	<div id="navigation" class="container">
		<div id="PlayChess" class="pri-nav "><div><a href="PlayChess.jsp">PlayChess</a></div></div>
		<div id="LearnChess" class="pri-nav active"><div><a>LearnChess</a></div></div>
		<div id="Members" class="pri-nav"><div><a href="Members.jsp">Members</a></div></div>
		<div id="AboutUs" class="pri-nav"><div><a href="AboutUs.jsp">AboutUs</a></div></div>
		<div id="ContactUs" class="pri-nav"><div><a href="ContactUs.jsp">ContactUs</a></div></div>
	</div>

	<div id="LearnChessDiv" style="border:2px solid white;margin-top:5em;padding:0.5em;background-color:rgb(200,24,24);-moz-border-radius:0.75em;">


	  <a id="top_zone"></a>
	  <h1 style="font-size:1.4em">CHESS RULES AND BASICS</h1>

	<a id="question_1" onClick="return false;" href="#">Basic rules </a><br />
	<a id="question_2" onClick="return false;" href="#">Aim of the game </a><br />
	<a id="question_3" onClick="return false;" href="#">Start of the game </a><br />
	<a id="question_4" onClick="return false;" href="#">Chess Pieces </a><br />
	<a id="question_5" onClick="return false;" href="#">Playing the game </a><br />
	<a id="question_6" onClick="return false;" href="#">End of the game </a><br />

	<br />
	<br />


	<h3 id="answer_1">Basic rules</h3>
	<div id="answer_1_text">
		<img src="img/up_arrow.png" class="go_to_top" style="cursor:pointer">
		Chess is a two-player game, where one player is assigned white pieces and the other black. Each player has 16 pieces to start the game: one king, one queen, two rooks, two bishops, two knights and eight pawns.
	</div>

	<h3 id="answer_2">Aim of the game </h3>
	<div id="answer_2_text">
		<img src="img/up_arrow.png" class="go_to_top" style="cursor:pointer">
		The object of the game is to capture the other player's king. This capture is never actually completed, but once a king is under attack and unable to avoid capture, it is said to be checkmated and the game is over.
	</div>

	<h3 id="answer_3">Start of the game </h3>
	<div id="answer_3_text">
		<img src="img/up_arrow.png" class="go_to_top" style="cursor:pointer">
		The game is started in the position shown below on a chess board consisting of 64 squares in an 8x8 grid. The White player moves first. Then each player takes a single turn. In fact, a player must move in turn. In other words a move cannot be skipped.
		<img src="img/LearnChessBoard.JPG"/>
	</div>
	<h3 id="answer_4">Chess Pieces </h3>
		<div id="answer_4_text">
			<img src="img/up_arrow.png" class="go_to_top" style="cursor:pointer">

			 <h4>The King</h4>
			The king is the most important piece on the chessboard. The king may move one square in any direction, including diagonally . It can never be captured and if it is in danger then it must be made safe immediately. If it is not possible to make the king safe then the game is lost. When they are attacked by a piece of the opponent, it is called check, and when in a check that cannot be removed, they are checkmated, and the game is lost for their owner.

			<h4>The Queen</h4>
			The queen is the most powerful piece on the board. This is because it can control more squares than any other chessman. It moves straight forward or backwards and diagonally any number of squares. However, it cannot jump over other pieces.
			 <h4>The Rook</h4>
			The rook moves any number of squares horizontally or vertically, but it cannot jump over other pieces.
			 <h4>The Bishop</h4>
			The bishop moves to any square on the diagonals on which it stands. However, it is not allowed to jump over other pieces.
			 <h4>The Knight</h4>
			The knight's move is composed of two different steps; first, it makes one step of one single square along its rank or file, and then, still moving away from the square of departure, one step of one single square on a diagonal. It does not matter if the square of the first step is occupied.
			<h4>The Pawn</h4>
			The pawn normally moves only forward.
			<ul>
			<li>First move: It advances from its original square either one or two vacant squares along the file on which it is placed, and on subsequent moves it advances one vacant square along the file.</li>
			<li>Capturing: it advances one square along either of the diagonals on which it stands.</li>
			</ul>

	</div>

	<h3 id="answer_5">Playing the game  </h3>
	<div id="answer_5_text">
			<img src="img/up_arrow.png" class="go_to_top" style="cursor:pointer"/>
			A move consists of placing one piece on a different square, following the rules of movement for that piece.
			A player can take an opponent's piece by moving one of his or her own pieces to the square that contains an opponent's piece. The opponent's piece is removed from the board and is out of play for the rest of the game.

			<h4>Check</h4>
			If a King is threatened with capture, but has a means to escape, then it is said to be in check. A King cannot move into check, and if in check must move out of check immediately. There are three ways you may move out of check:
			<ul>
			<li>Capture the checking piece</li>
			<li>Block the line of attack by placing one of your own pieces between the checking piece and the King. (Of course, a Knight cannot be blocked.)</li>
			<li>Move the King away from check.</li>
			</ul>
			<h4>Checkmate</h4>
			The primary objective in chess is to checkmate your opponent's King. When a King cannot avoid capture then it is checkmated and the game is immediately over.

			<h4>Stalemate</h4>
			The game is drawn when the player to move has no legal move and his king is not in check. The game is said to end in 'stalemate'. This immediately ends the game.
	</div>

	<h3 id="answer_6">End of the game </h3>
		<div id="answer_6_text">
			<img src="img/up_arrow.png" class="go_to_top" style="cursor:pointer">
			<h4>Winning</h4>
			The game is won by the player
			<ul>
			<li>who has checkmated his opponent's king.</li>
			<li>whose opponent declares he resigns. </li>
			</ul>
			<h4>Draw </h4>
			The game is drawn when the king of the player who has the move is not in check, and this player cannot make any legal move. The player's king is then said to be "stalemated". This immediately ends the game.
			The game is drawn upon agreement between the two players.
			The game is drawn when one of the following endings arises:
			<ul>
			<li>king against king;</li>
			<li>king against king with only bishop or knight; </li>
			<li>king and bishop against king and bishop, with both bishops on diagonals of the same colour. </li>
			</ul>

			The player to move can claim a draw if
			<ul>
			<li>the same position with the same player to move is repeated three times in the game </li>
			<li>there are have been 50 consecutive moves of white and of black without
				<ul>
				<li>any piece taken</li>
				<li>any pawn move</li>
				</ul>
			</li>
			</ul>
			<h4>Losing </h4>
			The game is lost by a player who has not completed the prescribed number of moves in the allotted time, unless his opponent has only the king remaining, in which case the game is drawn.

	</div>


	</div>
</body>
