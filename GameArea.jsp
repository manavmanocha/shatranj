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
	<script type="text/javascript" src="js/ui.core.js"></script>
	<script type="text/javascript" src="js/ui.draggable.js"></script>
  	<script type="text/javascript" src="js/ui.droppable.js"></script>
  	<script type="text/javascript" src="js/chess-moves.js"></script>
  	<script type="text/javascript" src="js/chess-functions.js"></script>
  	<script type="text/javascript" src="js/jquery.blockUI.js" ></script>
  	<script type="text/javascript">

  			 var userColor=null;
  			 var gameId=null;
  			 var whiteUser=null;
  			 var blackUser=null;
  			 var inCheck = null;
  			 var gameOver=null;

 $(document).ready(function(){



	    	<c:if test="${invited != null}">
	    		<c:set var="userColor" value="white"/>
				<c:set var="blackUser" value="${invited}" />
	    		<c:set var="whiteUser" value="${sessionScope.userName}" />

			</c:if>

			<c:if test="${invitedBy != null}">
				<c:set var="userColor" value="black" />
	    		<c:set var="blackUser" value="${sessionScope.userName}" />
	    		<c:set var="whiteUser" value="${invitedBy}" />
			</c:if>



 			<c:set var="gameId" value="${requestScope.gameId}" />
 			gameId="<c:out value="${gameId}"/>";

			userColor="<c:out  value="${userColor}" />";
			whiteUser="<c:out  value="${whiteUser}" />";
			blackUser="<c:out  value="${blackUser}" />";




	  		document.getElementById('turnIndicator').innerHTML=whiteUser+"'s turn";
	  		if(userColor == "white")
	  		{
	  			$('.white').draggable({ containment: [42, 149, 390, 475],revert: true });
	  		}

			    $('.droppable').droppable({
					drop: function(event, ui) {
					var endSquare = event.target || event.srcElement;
					var endSquareId=endSquare.id;
					var startImage = $(ui.draggable);
  					var startImageDOM = $(ui.draggable)[0];
  					var startSquare=startImageDOM.parentNode;
  					var startSquareId=startSquare.id;
					var startImageId=startImageDOM.id;
					var startImageDOMClassArray=startImageDOM.className.split(' ');
					var startImageDOMColor=startImageDOMClassArray[2];



					var DroppedPiece=getPieceType(startImageDOM);

					var isMoveValid = checkMoves(DroppedPiece,endSquareId,startSquareId,userColor,startImageId);

					if( isMoveValid == "invalid" )
						{
						}

					if( isMoveValid == "valid" )
						{

							var booleanOccupiedSquare=checkIfOccupiedSquare(endSquare);

							if(booleanOccupiedSquare == "yes")
							{

								var PieceColor = getSquarePieceColor(endSquare);

								if(PieceColor == startImageDOMColor)
								{

								}
								else
								{

									var attackedPiece=null;
									for(d=0;d<endSquare.childNodes.length;d++)
			  						{

				  						if(endSquare.childNodes[d].nodeName == "IMG")
								  			{
								  				attackedPiece = endSquare.childNodes[d];
								  			}
								  	}


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


									var opponentColor;
									if(startImageDOMColor=="white")
									{
										opponentUser=blackUser;
									}
									if(startImageDOMColor=="black")
									{
										opponentUser=whiteUser;
									}

									startSquare.removeChild(startImageDOM);

								    startImageDOM.style.position="relative";
								    startImageDOM.style.left="0px";
								    startImageDOM.style.top="0px";
								    endSquare.appendChild(startImageDOM);

								    $('.black').draggable('destroy');
									$('.white').draggable('destroy');

									var attackedPieceType= getPieceType(attackedPiece);
								    if(attackedPieceType == "king")
								    {
								    	alert("Hey U won The game");
								    	gameOver = "yes" ;
								    	 xmlhttp=GetXmlHttpObject();
									    xmlhttp.onreadystatechange=function()
									    {
											 if(xmlhttp.readyState==4)
											 {

											 }
										}
										xmlhttp.open("GET","sendMoves.do?startSquare="+startSquare.id+"&endSquare="+endSquare.id+"&startImageId="+startImageId+"&userColor="+userColor+"&gameId="+gameId+"&gameOver="+gameOver,true);
										xmlhttp.send(null);
										window.location="endGameAction.do?gameId="+gameId;

								    }
								    else
								    {

										    if(userColor == "black")
										    {
										    	document.getElementById("lastWhiteMove").innerHTML="";
										    	document.getElementById("lastBlackMove").innerHTML="Last Move : "+DroppedPiece+" : "+startSquareId+" - "+endSquareId;
										    	var isCheckTrue = isKingInCheck(userColor);
										    	if(isCheckTrue == "yes")
										    	{
										    		inCheck = "yes";
										    	}
										    	else
										    	{
										    		inCheck = "no";
										    	}

										    }
										    if(userColor == "white")
										    {
										    	document.getElementById("lastBlackMove").innerHTML="";
										    	document.getElementById("lastWhiteMove").innerHTML="Last Move : "+DroppedPiece+" : "+startSquareId+" - "+endSquareId;
										    	var isCheckTrue = isKingInCheck(userColor);
										    	if(isCheckTrue == "yes")
										    	{
										    		inCheck = "yes";
										    	}
										    	else
										    	{
										    		inCheck = "no";
										    	}

										    }
										    document.getElementById('turnIndicator').innerHTML=opponentUser+"'s turn";
										    xmlhttp=GetXmlHttpObject();
										    xmlhttp.onreadystatechange=function()
										    {
												 if(xmlhttp.readyState==4)
												 {

												 }
											}
											xmlhttp.open("GET","sendMoves.do?startSquare="+startSquare.id+"&endSquare="+endSquare.id+"&startImageId="+startImageId+"&userColor="+userColor+"&gameId="+gameId+"&gameOver="+gameOver,true);
											xmlhttp.send(null);
										}




								}
							}

		  					if(booleanOccupiedSquare == "no")
							{

								var opponentColor;
								if(startImageDOMColor=="white")
								{
									opponentUser=blackUser;
								}
								if(startImageDOMColor=="black")
								{
									opponentUser=whiteUser;
								}

								startSquare.removeChild(startImageDOM);

							    startImageDOM.style.position="relative";
							    startImageDOM.style.left="0px";
							    startImageDOM.style.top="0px";
							    endSquare.appendChild(startImageDOM);

							    $('.black').draggable('destroy');
								$('.white').draggable('destroy');

							    document.getElementById('turnIndicator').innerHTML=opponentUser+"'s turn";
							    if(userColor == "black")
							    {
							    	document.getElementById("lastWhiteMove").innerHTML="";
							    	document.getElementById("lastBlackMove").innerHTML="Last Move : "+DroppedPiece+" : "+startSquareId+" - "+endSquareId;
							    	var isCheckTrue = isKingInCheck(userColor);
								    	if(isCheckTrue == "yes")
								    	{
								    		inCheck = "yes";
								    	}
								    	else
								    	{
								    		inCheck = "no";
								    	}

							    }
							    if(userColor == "white")
							    {
							    	document.getElementById("lastBlackMove").innerHTML="";
							    	document.getElementById("lastWhiteMove").innerHTML="Last Move : "+DroppedPiece+" : "+startSquareId+" - "+endSquareId;
							    	var isCheckTrue = isKingInCheck(userColor);
								    	if(isCheckTrue == "yes")
								    	{
								    		inCheck = "yes";
								    	}
								    	else
								    	{
								    		inCheck = "no";
								    	}
							    }
							    xmlhttp=GetXmlHttpObject();
							    xmlhttp.onreadystatechange=function()
							    {
									 if(xmlhttp.readyState==4)
									 {

									 }
								}
								xmlhttp.open("GET","sendMoves.do?startSquare="+startSquare.id+"&endSquare="+endSquare.id+"&startImageId="+startImageId+"&userColor="+userColor+"&gameId="+gameId+"&inCheck="+inCheck+"&gameOver="+gameOver,true);
								xmlhttp.send(null);
							}

						}
					}
				});

			  });



			  function getMovesData()
			  {
			   xmlhttp=GetXmlHttpObject();
			   xmlhttp.onreadystatechange=function()
			    {
					 if(xmlhttp.readyState==4)
					 {
					 	var movesJsonData=xmlhttp.responseText;


					 	var movesJsonObject = eval('(' + movesJsonData + ')');

					 	if(userColor == "black")
					 	{

					 		var pieceId=movesJsonObject.white[0].pieceId;
					 		var startSquareId=movesJsonObject.white[0].startSquare;
					 		var endSquareId=movesJsonObject.white[0].endSquare;
					 		var inCheck = movesJsonObject.white[0].inCheck;
					 		var gameOver = movesJsonObject.white[0].gameOver;
					 		var quitGame = movesJsonObject.white[0].quitGame;
					 		if(quitGame == "yes")
					 		{
					 			$.blockUI.defaults.css = {};
			   					$.blockUI({ message: whiteUser+ 'has chosen to end the game<br/><br/><input type="button" value="Ok" onclick="EndGameOtherUser();"/> '  });
					 		}

					 		var pieceToMove=document.getElementById(pieceId);
					 		var startSquare=document.getElementById(startSquareId);
					 		var endSquare=document.getElementById(endSquareId);






					 		var booleanOccupiedSquare=checkIfOccupiedSquare(endSquare);
							if(booleanOccupiedSquare == "yes")
							{
								var attackedPiece=null;
									for(i=0;i<endSquare.childNodes.length;i++)
			  						{
				  						if(endSquare.childNodes[i] == "[object HTMLImageElement]")
								  			{
								  				attackedPiece = endSquare.childNodes[i];
								  			}
								  	}
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

						   	var DroppedPiece=getPieceType(pieceToMove);

					    	document.getElementById("lastBlackMove").innerHTML="";
					    	document.getElementById("lastWhiteMove").innerHTML="Last Move : "+DroppedPiece+" : "+startSquareId+" - "+endSquareId;

							if(gameOver == "yes")
					 		{
					 			alert("Buddy you Lost the Game");
					 			window.location="GamePage.jsp";
					 		}

						    else
						    {
							    $('.black').draggable({ containment: [42, 149, 390, 475],revert: true });
						 		document.getElementById('turnIndicator').innerHTML=blackUser+"'s turn";

						 		if(inCheck =="yes")
						 		{
						 			alert("Buddy You are in Check + '\n' + Save Your King");
						 		}
						 	}

					 		xmlhttp=GetXmlHttpObject();
					    	xmlhttp.onreadystatechange=function()
					    	{
							 if(xmlhttp.readyState==4)
							 	{

							 	}
							}
							xmlhttp.open("GET","sendMoves.do?startSquare=null&endSquare=null&startImageId=null&userColor=white&gameId="+gameId,true);
							xmlhttp.send(null);


					 	}
					 	if(userColor == "white")
					 	{

					 		var pieceId=movesJsonObject.black[0].pieceId;

					 		var startSquareId=movesJsonObject.black[0].startSquare;

					 		var endSquareId=movesJsonObject.black[0].endSquare;
					 		var inCheck = movesJsonObject.black[0].inCheck;
					 		var gameOver = movesJsonObject.black[0].gameOver;
					 		var quitGame = movesJsonObject.black[0].quitGame;
					 		if(quitGame == "yes")
					 		{
					 			$.blockUI.defaults.css = {};
			   					$.blockUI({ message: blackUser+ 'has chosen to end the game<br/><br/><input type="button" value="Ok" onclick="EndGameOtherUser();"/> '  });
					 		}
					 		var pieceToMove=document.getElementById(pieceId);
					 		var startSquare=document.getElementById(startSquareId);
					 		var endSquare=document.getElementById(endSquareId);

					 		var booleanOccupiedSquare=checkIfOccupiedSquare(endSquare);
							if(booleanOccupiedSquare == "yes")
							{
								var attackedPiece=null;
									for(i=0;i<endSquare.childNodes.length;i++)
			  						{
				  						if(endSquare.childNodes[i] == "[object HTMLImageElement]")
								  			{
								  				attackedPiece = endSquare.childNodes[i];
								  			}
								  	}
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

						    var DroppedPiece=getPieceType(pieceToMove);

					    	document.getElementById("lastWhiteMove").innerHTML="";
					    	document.getElementById("lastBlackMove").innerHTML="Last Move : "+DroppedPiece+" : "+startSquareId+" - "+endSquareId;
							if(gameOver =="yes")
					 		{
					 			alert("Buddy you Lost the Game");
					 			window.location="GamePage.jsp";
					 		}

					 		else
					 		{

							    $('.white').draggable({ containment: [42, 149, 390, 475],revert: true });
							   	document.getElementById('turnIndicator').innerHTML=whiteUser+"'s turn";
							   	if(inCheck =="yes")
						 		{
						 			alert("Buddy You are in Check+'\n'+Save Your King");
						 		}
						 	}

						   	xmlhttp=GetXmlHttpObject();
					    	xmlhttp.onreadystatechange=function()
					    	{
							 if(xmlhttp.readyState==4)
							 	{

							 	}
							}
							xmlhttp.open("GET","sendMoves.do?startSquare=null&endSquare=null&startImageId=null&userColor=black&gameId="+gameId,true);
							xmlhttp.send(null);
					 	}

					 }
				}
				xmlhttp.open("GET","getMovesJSON.do?gameId="+gameId,true);
				xmlhttp.send(null);
				setTimeout("getMovesData()",5000);
			  }

			  function GetXmlHttpObject()
				{
					if (window.XMLHttpRequest)
					  {
					  return new XMLHttpRequest();
					  }
					if (window.ActiveXObject)
					  {
					  return new ActiveXObject("Microsoft.XMLHTTP");
					  }
					return null;
				}




			  function QuitDialog()
			  {
			   $.blockUI.defaults.css = {};
			   $.blockUI({ message: 'This will end the game<br/>Are You sure want to quit ?<br/><br/><input type="button" value="Yes" onclick="EndGame();"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="No" onclick="HideQuitDialog();"/> '  });
			  }

			  function HideQuitDialog()
			  {
			   $.unblockUI();
			  }

              function EndGame()
              {
              	xmlhttp=GetXmlHttpObject();
		    	xmlhttp.onreadystatechange=function()
		    	{
				 if(xmlhttp.readyState==4)
				 	{

				 	}
				}
				xmlhttp.open("GET","sendMoves.do?startSquare=null&endSquare=null&startImageId=null&userColor=black&gameId="+gameId+"&quitGame=yes",true);
				xmlhttp.send(null);

              	$.unblockUI();
                window.location="quitGame.do?gameId="+gameId;
              }

              function EndGameOtherUser()
              {
              window.location = "GamePage.jsp";
              }
    </script>

</head>
<body onload="getMovesData()">
	<div id="header">
		<img src="img/title1.png" style="float:left;margin-right:30em"/>
		<div style="margin-top:2.5em;color:yellow">
		Welcome
	    <span style="font-size:1.2em">
	    	<c:set var="name" value="${sessionScope.userName}" />
	    	  <c:out   value="${name}" />,
	    	<c:if test="${name == null}">
				<jsp:forward page="showerror.jsp" />
			</c:if>
	    </span>
	   <span style="color:yellow;text-decoration:underline;cursor:pointer" onclick="alert('You can not LOG OUT while the game is going on. '+'\n'+'Please Click on QUIT GAME to quit');">Log out</span>

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

		<div id="gameinfo" style="margin-top:1em;float:left;width:15em;height:100%"/>

			<c:set var="invited" value="${requestScope.invited}" />
			<c:set var="invitedBy" value="${requestScope.invitedBy}" />



	    	<c:if test="${invited != null}">


	    		<c:set var="whiteUser" value="${sessionScope.userName}" />
	    		<c:set var="blackUser" value="${invited}" />

				<div  style="height:10em">
					<c:set var="name" value="${sessionScope.userName}" />
	    	  		<c:out   value="${name}" />
	    	  		<div id="lastWhiteMove">
					</div>
				</div>
				<div  style="color:black;height:10em">
					<c:out  value="${invited}" />
					<div id="lastBlackMove">
					</div>
				</div>



			</c:if>

			<c:if test="${invitedBy != null}">


				<c:set var="whiteUser" value="${invitedBy}" />
	    		<c:set var="blackUser" value="${sessionScope.userName}" />



				<div  style="height:10em">
					<c:out   value="${invitedBy}" />
					<div id="lastWhiteMove">
					</div>
				</div>
				<div  style="color:black;height:10em">
					<c:set var="name" value="${sessionScope.userName}" />
	    	  		<c:out   value="${name}" />
	    	  		<div id="lastBlackMove">
					</div>
				</div>




			</c:if>

		</div>
		<div style="float:right;width:15em">
			<div id="turnIndicator" style="font-size:2em">
			</div>
			<div id="removedPiecesWhite" style="width:15em;height:8em">
			</div>
			<div id="removedPiecesBlack" style="width:15em;height:8em">
			</div>
			<input type="button" style="margin-top:4em" value="Quit Game" onclick="QuitDialog()"/>
		</div>


	</div>





</body>
</html>