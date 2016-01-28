<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page isELIgnored="false" %>
<head>
	<title>Shatranj</title>

	<link rel="stylesheet" href="css/main.css" type="text/css" />

	<script type="text/javascript" src="js/jquery.js" ></script>

	<script type="text/javascript" src="js/navigation.js" ></script>
	<script type="text/javascript" src="js/jquery.blockUI.js" ></script>
  	<script type="text/javascript" src="js/chess-moves.js"></script>
  	<script type="text/javascript" src="js/chess-functions.js"></script>
	<script>
		var movesJsonDataObject =null;
		var movesJsonDataObjectLength = null;
		var moveCounter =  0;
		var attackedPiecesArray = ["","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""];
		function LoadMovesJsonData()
		{
		var movesJsonDataJson = document.getElementById("MovesJsonData").innerHTML;
		movesJsonDataObject = eval('(' + movesJsonDataJson + ')');
		movesJsonDataObjectLength = movesJsonDataObject.length ;

		}

		function nextMove()
		{
			if(moveCounter >= movesJsonDataObjectLength)
			{
			 alert("no next move");
			}
			else
			{
				var pieceId = movesJsonDataObject[moveCounter][0];
				var startSquareId = movesJsonDataObject[moveCounter][1];
				var endSquareId = movesJsonDataObject[moveCounter][2];
				var startSquare=document.getElementById(startSquareId);
				var endSquare=document.getElementById(endSquareId);
				var pieceToMove=document.getElementById(pieceId);

				var booleanOccupiedSquare=checkIfOccupiedSquare(endSquare);
				if(booleanOccupiedSquare == "yes")
				{
					var attackedPiece=null;
					for(d=0;d<endSquare.childNodes.length;d++)
							{

	 						if(endSquare.childNodes[d].nodeName == "IMG")
				  			{
				  				attackedPiece = endSquare.childNodes[d];
				  			}
				  	}

				  	attackedPiecesArray[moveCounter]=	attackedPiece.id;
					endSquare.removeChild(attackedPiece);
					var attackedPieceClassArray = attackedPiece.className.split(' ');
					var attackedPieceColor=attackedPieceClassArray[2];
					if(attackedPieceColor == "white")
					{
						document.getElementById('removedPiecesWhite').appendChild(attackedPiece);
					}
					if(attackedPieceColor == "black")
					{
						document.getElementById('removedPiecesBlack').appendChild(attackedPiece);
					}

				}




				startSquare.removeChild(pieceToMove);
				endSquare.appendChild(pieceToMove);
				updateLastMove(moveCounter);
				moveCounter++;
			}

		}

		function previousMove()
		{
			moveCounter--;
			if(moveCounter < 0)
			{
				alert("no previous move");
				moveCounter++;
			}
			else
			{
				var pieceId = movesJsonDataObject[moveCounter][0];
				var startSquareId = movesJsonDataObject[moveCounter][1];
				var endSquareId = movesJsonDataObject[moveCounter][2];

				var startSquare=document.getElementById(startSquareId);
				var endSquare=document.getElementById(endSquareId);
				var pieceToMove=document.getElementById(pieceId);

				if(attackedPiecesArray[moveCounter] != "")
				{
					var pieceRentered = document.getElementById(attackedPiecesArray[moveCounter]);
					endSquare.appendChild(pieceRentered);
				}
				endSquare.removeChild(pieceToMove);
				startSquare.appendChild(pieceToMove);
				updateLastMove(moveCounter);

			}

		}

		function updateLastMove(moveCounter)
		{
				if(moveCounter%2 == 0)
				{
					document.getElementById("lastBlackMove").innerHTML ="";
					document.getElementById("lastWhiteMove").innerHTML = "Last Move : "+movesJsonDataObject[moveCounter][0]+" : "+movesJsonDataObject[moveCounter][1]+" - "+movesJsonDataObject[moveCounter][2];
				}
				else
				{
					document.getElementById("lastWhiteMove").innerHTML ="";
					document.getElementById("lastBlackMove").innerHTML = "Last Move : "+movesJsonDataObject[moveCounter][0]+" : "+movesJsonDataObject[moveCounter][1]+" - "+movesJsonDataObject[moveCounter][2];
				}

		}

		function QuitPlayBackDialog()
		{
			$.blockUI.defaults.css = {};
			$.blockUI({ message: 'This will end the game playback<br/>Are You sure want to quit ?<br/><br/><input type="button" value="Yes" onclick="EndPlayBackGame();"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="No" onclick="HideQuitPlayBackDialog();"/> '  });
		}
		function HideQuitPlayBackDialog()
		{
			$.unblockUI();
		}
		function EndPlayBackGame()
		{
			 window.location="Home.jsp";
		}
	</script>

</head>
<body onload="LoadMovesJsonData()">

	<div id="header">
		<img src="img/title1.png" style="float:left;margin-right:30em"/>


	</div>
	</div>
	<div id="navigation" class="container">
		<div id="PlayChess" class="pri-nav active"><div><a>PlayChess</a></div></div>
		<div id="LearnChess" class="pri-nav active"><div><a>LearnChess</a></div></div>
		<div id="Members" class="pri-nav active"><div><a>Members</a></div></div>
		<div id="AboutUs" class="pri-nav active"><div><a>AboutUs</a></div></div>
		<div id="ContactUs" class="pri-nav active"><div><a>ContactUs</a></div></div>
	</div>
	<div id="GameArea" style="border:2px solid white;margin-top:5em;height:24em;background-color:rgb(200,24,24);-moz-border-radius:0.75em;width:58em;margin-left:2em">
		<table id="chessboard" style="margin:0.5em 0.5em 0.5em 0.5em;empty-cells:show;border-collapse:collapse;float:left">
				<tr class="chess" >
					<td class="chess droppable" id="a1">
						<img  class="ChessPieces draggable white rook" id="rook_white1" src="img/rook_white.gif" />
					</td>
					<td class="chess1 droppable " id="a2">
						<img  class="ChessPieces draggable white knight" id="knight_white1" src="img/knight_white.gif" />
					</td>
					<td class="chess droppable" id="a3">
						<img  class="ChessPieces draggable white bishop" id="bishop_white1" src="img/bishop_white.gif" />
					</td>
					<td class="chess1 droppable " id="a4">
						<img  class="ChessPieces draggable white king" id="king_white" src="img/king_white.gif" />
					</td>
					<td  class="chess droppable" id="a5">
						<img  class="ChessPieces draggable white queen" id="queen_white" src="img/queen_white.gif" />
					</td>
					<td class="chess1 droppable"  id="a6">
						<img  class="ChessPieces draggable white bishop" id="bishop_white2" src="img/bishop_white.gif" />
					</td>
					<td class="chess droppable" id="a7">
						<img  class="ChessPieces draggable white knight" id="knight_white2" src="img/knight_white.gif" />
					</td>
					<td class="chess1 droppable"  id="a8">
						<img  class="ChessPieces draggable white rook" id="rook_white2" src="img/rook_white.gif" />
					</td>
				</tr>
				<tr class="chess" >
						<td class="chess1 droppable " id="b1">
							<img  class="ChessPieces draggable white pawn" id="pawn_white1" src="img/pawn_white.gif" />
						</td>
						<td class="chess droppable" id="b2">
							<img  class="ChessPieces draggable white pawn" id="pawn_white2" src="img/pawn_white.gif" />
						</td>
						<td class="chess1 droppable " id="b3">
							<img  class="ChessPieces draggable white pawn" id="pawn_white3" src="img/pawn_white.gif" />
						</td>
						<td class="chess droppable" id="b4">
							<img  class="ChessPieces draggable white pawn" id="pawn_white4" src="img/pawn_white.gif" />
						</td>
						<td class="chess1 droppable " id="b5">
							<img  class="ChessPieces draggable white pawn" id="pawn_white5" src="img/pawn_white.gif" />
						</td>
						<td  class="chess droppable" id="b6">
							<img  class="ChessPieces draggable white pawn" id="pawn_white6" src="img/pawn_white.gif" />
						</td>
						<td class="chess1 droppable"  id="b7">
							<img  class="ChessPieces draggable white pawn" id="pawn_white7" src="img/pawn_white.gif" />
						</td>
						<td class="chess droppable" id="b8">
							<img  class="ChessPieces draggable white pawn" id="pawn_white8" src="img/pawn_white.gif" />
						</td>
				</tr>
				<tr class="chess" >
					<td class="chess droppable"  id="c1">
					</td>
					<td class="chess1 droppable"  id="c2">
					</td>
					<td class="chess droppable" id="c3" >
					</td>
					<td class="chess1 droppable" id="c4" >
					</td>
					<td class="chess droppable" id="c5" >
					</td>
					<td class="chess1 droppable" id="c6" >
					</td>
					<td class="chess droppable"  id="c7">
					</td>
					<td class="chess1 droppable" id="c8" >
					</td>
				</tr>

				<tr class="chess" >
					<td class="chess1 droppable" id="d1" >
					</td>
					<td class="chess droppable" id="d2" >
					</td>
					<td class="chess1 droppable" id="d3" >
					</td>
					<td class="chess droppable"  id="d4">
					</td>
					<td class="chess1 droppable"  id="d5">
					</td>
					<td class="chess droppable" id="d6" >
					</td>
					<td class="chess1 droppable" id="d7" >
					</td>
					<td class="chess droppable"  id="d8">
					</td>
				</tr>

				<tr class="chess" >
					<td class="chess droppable"  id="e1">
					</td>
					<td class="chess1 droppable" id="e2">
					</td>
					<td class="chess droppable"  id="e3">
					</td>
					<td class="chess1 droppable"  id="e4">
					</td>
					<td class="chess droppable"  id="e5">
					</td>
					<td class="chess1 droppable"  id="e6">
					</td>
					<td class="chess droppable"  id="e7">
					</td>
					<td class="chess1 droppable"  id="e8">
					</td>
				</tr>

				<tr class="chess" >
					<td class="chess1 droppable"  id="f1">
					</td>
					<td class="chess droppable"  id="f2">
					</td>
					<td class="chess1 droppable"  id="f3">
					</td>
					<td class="chess droppable"  id="f4">
					</td>
					<td class="chess1 droppable"  id="f5">
					</td>
					<td class="chess droppable"  id="f6">
					</td>
					<td class="chess1 droppable"  id="f7">
					</td>
					<td class="chess droppable"  id="f8">
					</td>
				</tr>
				<tr class="chess">
						<td class="chess droppable" id="g1">
							<img  class="ChessPieces draggable black pawn" id="pawn_black1" src="img/pawn_black.gif" />
						</td>
						<td class="chess1 droppable " id="g2">
							<img  class="ChessPieces draggable black pawn" id="pawn_black2" src="img/pawn_black.gif" />
						</td>
						<td class="chess droppable" id="g3">
							<img  class="ChessPieces draggable black pawn" id="pawn_black3" src="img/pawn_black.gif" />
						</td>
						<td class="chess1 droppable " id="g4">
							<img  class="ChessPieces draggable black pawn"  id="pawn_black4" src="img/pawn_black.gif" />
						</td>
						<td class="chess droppable " id="g5">
							<img  class="ChessPieces draggable black pawn" id="pawn_black5" src="img/pawn_black.gif" />
						</td>
						<td  class="chess1 droppable" id="g6">
							<img  class="ChessPieces draggable black pawn" id="pawn_black6" src="img/pawn_black.gif" />
						</td>
						<td class="chess droppable"  id="g7">
							<img  class="ChessPieces draggable black pawn" id="pawn_black7" src="img/pawn_black.gif" />
						</td>
						<td class="chess1 droppable" id="g8">
							<img  class="ChessPieces draggable black pawn" id="pawn_black8" src="img/pawn_black.gif" />
						</td>
				</tr>
				<tr class="chess" >
						<td class="chess1 droppable" id="h1">
							<img  class="ChessPieces draggable black rook" id="rook_black1" src="img/rook_black.gif" />
						</td>
						<td class="chess droppable " id="h2">
							<img  class="ChessPieces draggable black knight" id="knight_black1" src="img/knight_black.gif" />
						</td>
						<td class="chess1 droppable" id="h3">
							<img  class="ChessPieces draggable black bishop" id="bishop_black1" src="img/bishop_black.gif" />
						</td>
						<td class="chess droppable " id="h4">
							<img  class="ChessPieces draggable black king" id="king_black" src="img/king_black.gif" />
						</td>
						<td  class="chess1 droppable" id="h5">
							<img  class="ChessPieces draggable black queen" id="queen_black" src="img/queen_black.gif" />
						</td>
						<td class="chess droppable"  id="h6">
							<img  class="ChessPieces draggable black bishop" id="bishop_black2" src="img/bishop_black.gif" />
						</td>
						<td class="chess1 droppable" id="h7">
							<img  class="ChessPieces draggable black knight" id="knight_black2" src="img/knight_black.gif" />
						</td>
						<td class="chess droppable"  id="h8">
							<img  class="ChessPieces draggable black rook" id="rook_black2" src="img/rook_black.gif" />
						</td>
				</tr>

		</table>

		<div id="gameinfo" style="margin-top:1em;float:left;width:17em;height:100%"/>
			<c:set var="gameUsers" value="${requestScope.gameUsers}" />

				<div  style="height:8em">
					<c:out value="${gameUsers[0]}"></c:out>
	    	  		<div id="lastWhiteMove">
					</div>
				</div>
				<div  style="color:black;height:8em">
					<c:out value="${gameUsers[1]}"></c:out>
					<div id="lastBlackMove">
					</div>
				</div>

		</div>
		<div style="float:right;width:15em">
			<div id="turnIndicator" style="font-size:2em">
			</div>
			<div id="removedPiecesWhite" style="width:15em;height:8em">
			</div>
			<div id="removedPiecesBlack" style="width:15em;height:8em">
			</div>


			<br/>
			<img src="img/previous.PNG" style="height:2em;width:4em;cursor:pointer" onclick="previousMove()">
			<img src="img/next.png" style="height:2em;width:4em;cursor:pointer" onclick="nextMove()">
			<input type="button" style="margin-top:4em" value="Quit Playback" onclick="QuitPlayBackDialog()"/>
		</div>


	</div>


		<c:set var="gameMovesJSONArray" value="${requestScope.gameMovesJSONArray}" />

		<div id="MovesJsonData" style="display:none"><c:out value="${gameMovesJSONArray}"></c:out></div>

</body>
</html>