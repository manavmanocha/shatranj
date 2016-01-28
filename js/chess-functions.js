	function isKingInCheck(color)
	{
		var endSquareToCheckId = null;
		var piecesArray = null;
		
		if(color == "black" )
		{
			endSquareToCheckId=getKingSquare("white");
			piecesArray = getPiecesArray("black");								    	
		}
		
		if(color == "white" )
		{
			endSquareToCheckId=getKingSquare("black");
			piecesArray = getPiecesArray("white");								    	
		}
		
		for(b=0;b<piecesArray.length;b++)
		{
				var pieceToCheck = document.getElementById(piecesArray[b]);								    		
				var pieceToCheckType=getPieceType(pieceToCheck);
				var startSquareToCheck=pieceToCheck.parentNode;
				var startSquareToCheckId=startSquareToCheck.id;
				var isCheck = checkMoves(pieceToCheckType,endSquareToCheckId,startSquareToCheckId,"black",piecesArray[b]);
				if(isCheck == "valid")
				{
					return("yes");
				}
		}
	}	
	
	
	function getKingSquare(color)
		 {
			if(color == "white")
			{
				var kingPiece = document.getElementById("king_white");
				var kingSquare = kingPiece.parentNode;
				return(kingSquare.id);
			}
			if(color == "black")
			{
				var kingPiece = document.getElementById("king_black");
				var kingSquare = kingPiece.parentNode;
				return(kingSquare.id);
			}
		 }
		 
	function getPiecesArray(color)
		{
			var pieces=null;
			if(color == "white")
			{
				pieces =["rook_white1","knight_white1","bishop_white1","king_white","queen_white","bishop_white2","knight_white2","rook_white2","pawn_white1","pawn_white2","pawn_white3","pawn_white4","pawn_white5","pawn_white6","pawn_white7","pawn_white8"];
			}
			
			if(color == "black")
			{
				pieces=["rook_black1","knight_black1","bishop_black1","king_black","queen_black","bishop_black2","knight_black2","rook_black2","pawn_black1","pawn_black2","pawn_black3","pawn_black4","pawn_black5","pawn_black6","pawn_black7","pawn_black8"];
			}
				var existingPiecesArray=new Array();

				for (a=0;a<pieces.length;a++)
				{
					
					var existingPiece = document.getElementById(pieces[a]);
					
					if(existingPiece.parentNode.id != ("removedPiecesWhite" || "removedPiecesBlack"))
					{
						existingPiecesArray.push(pieces[a]);
					}
				}
				return(existingPiecesArray);		
			
		}
		
	function checkIfOccupiedSquare(Square)
		  {			  	
		  	for(i=0 ; i<Square.childNodes.length ; i++)	
		  	{	 	
			  	if(Square.childNodes[i].nodeName == "IMG")
					{
		  				return("yes");
		  			}
		  	}			  	
			return("no");				
		  }
			  
	  function getSquarePieceColor(Square)
	  {
	  	var SquareImageClassNameArray = null;
	  	for(e=0 ; e<Square.childNodes.length ; e++)	
		{
			  	if(Square.childNodes[e].nodeName == "IMG")
				{
	  				SquareImageClassNameArray = Square.childNodes[e].className.split(' ');		
	  				
	  			}
	  	}			  	
		
	  	var SquareImageColor=SquareImageClassNameArray[2];			  
	  	return(SquareImageColor);
	  }