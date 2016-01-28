function getPieceType(piece)
{
	var pieceClassArray=piece.className.split(' ');
	var pieceType=pieceClassArray[3];
	return(pieceType); 
}
	
function checkMoves(piece,endSquare,startSquare,userColor,startImageId)
{
	var endSquareArray=endSquare.split('');
	var startSquareArray=startSquare.split('');
	
	var startXString=(startSquareArray[0].charCodeAt(0));
	var startX = parseFloat(startXString);
	var startY=  parseFloat(startSquareArray[1]);
	
	var endXString=(endSquareArray[0].charCodeAt(0));
	var endX = parseFloat(endXString);
	var endY=  parseFloat(endSquareArray[1]);
	
	
	
		
	if(piece == "king")
		{
			if( (((endX == (startX+1)) || (endX == (startX-1)) ) && ( (endY == startY) || (endY == startY-1) || (endY == startY+1) ) ) || ((endY == (startY+1)) && (endX == startX)) || ((endY == (startY-1)) && (endX == startX)) )
			{
				return("valid");
			}
			else
			{
				return("invalid");
			}
		}
		
		
	
		
	if(piece == "knight")
		{
			if(  ((endX ==  startX+2) && (endY ==  startY+1)) || ((endX ==  startX-2) && (endY ==  startY+1)) || ((endX ==  startX+2) && (endY ==  startY-1)) || ((endX ==  startX-2) && (endY ==  startY-1)) || ((endX ==  startX+1) && (endY ==  startY+2)) || ((endX ==  startX+1) && (endY ==  startY-2)) || ((endX ==  startX-1) && (endY ==  startY+2)) || ((endX ==  startX-1) && (endY ==  startY-2)) )
			{
				return("valid");
			}
			else
			{
				return("invalid");
			}
		}
		
	if(piece == "bishop")
		{
			differenceX = endX-startX;
			differenceY = endY-startY;
			absoluteDifferenceX = Math.abs(differenceX);
			absoluteDifferenceY = Math.abs(differenceY);
			
			
			if( absoluteDifferenceX == absoluteDifferenceY )
			{
				if( (differenceX > 0) && (differenceY > 0) )
					{
						for(j=1;j<absoluteDifferenceX;j++)
						{
							var nextSquareY = startY+j;
							var nextSquareXAscii = startX+j;
							var nextSquareX = String.fromCharCode(nextSquareXAscii);
							var nextSquareId = nextSquareX+nextSquareY;
					
							var nextSquareElement = document.getElementById(nextSquareId);
							
							var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);

							if(booleanOccupiedSquare == "yes")
							{
								return("invalid");
							}

						}
					return("valid");
						
					}
				
				if( (differenceX > 0) && (differenceY < 0) )
					{
						for(j=1;j<absoluteDifferenceX;j++)
						{
							var nextSquareY = startY-j;
							var nextSquareXAscii = startX+j;
							var nextSquareX = String.fromCharCode(nextSquareXAscii);
							var nextSquareId = nextSquareX+nextSquareY;
							
							var nextSquareElement = document.getElementById(nextSquareId);

							var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);

							if(booleanOccupiedSquare == "yes")
							{
								return("invalid");
							}

						}
					return("valid");
										
					}
					
				if( (differenceX < 0) && (differenceY > 0) )
					{
						for(j=1;j<absoluteDifferenceX;j++)
						{
							var nextSquareY = startY+j;
							var nextSquareXAscii = startX-j;
							var nextSquareX = String.fromCharCode(nextSquareXAscii);
							var nextSquareId = nextSquareX+nextSquareY;
							
							var nextSquareElement = document.getElementById(nextSquareId);
	
							var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);

							if(booleanOccupiedSquare == "yes")
							{
								return("invalid");
							}

						}
					return("valid");

					}
				
				if( (differenceX < 0) && (differenceY < 0) )
					{
						for(j=1;j<absoluteDifferenceX;j++)
						{
							var nextSquareY = startY-j;
							var nextSquareXAscii = startX-j;
							var nextSquareX = String.fromCharCode(nextSquareXAscii);
							var nextSquareId = nextSquareX+nextSquareY;
								
							var nextSquareElement = document.getElementById(nextSquareId);
							
							var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);

							if(booleanOccupiedSquare == "yes")
							{
								return("invalid");
							}

						}
					return("valid");

					}
				
				
			}
			
			else
			{
				return("invalid");
			}
			
		}
	
	if(piece == "rook")
		{
			
			if(endX == startX)
			{
				var n=endY-startY;
				
				if(n > 0)
				{
					for(j=1;j<n;j++)
					{
						var nextSquareY = startY+j;
						var nextSquareX = String.fromCharCode(startX);
						var nextSquareId = nextSquareX+nextSquareY;
						
						var nextSquareElement = document.getElementById(nextSquareId);
						
						var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);
						
						if(booleanOccupiedSquare == "yes")
						{
							return("invalid");
						}
						
					}
					return("valid");
				}
				
				if(n < 0)
				{
					
					for(j=1 ; j<Math.abs(n) ; j++)
					{
						var nextSquareY = startY-j;						
						var nextSquareX = String.fromCharCode(startX);						
						var nextSquareId = nextSquareX+nextSquareY;
						
						var nextSquareElement = document.getElementById(nextSquareId);						

						var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);
						
						if(booleanOccupiedSquare == "yes")
						{
							return("invalid");
						}

					}
					return("valid");
				}
			}
			
			if(endY == startY)
			{
				var n=endX-startX;

				if(n > 0)
				{
					for(j=1;j<n;j++)
					{
						var nextSquareXAscii = startX+j;
						var nextSquareX = String.fromCharCode(nextSquareXAscii);						
						var nextSquareId = nextSquareX+startY;
						
						var nextSquareElement = document.getElementById(nextSquareId);

						var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);
						
						if(booleanOccupiedSquare == "yes")
						{
							return("invalid");
						}

					}
					return("valid");
				}

				if(n < 0)
				{
					
					for(j=1;j<Math.abs(n);j++)
					{
						var nextSquareXAscii = startX-j;						
						var nextSquareX = String.fromCharCode(nextSquareXAscii);						
						var nextSquareId = nextSquareX+startY;						
						var nextSquareElement = document.getElementById(nextSquareId);

						var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);
						
						if(booleanOccupiedSquare == "yes")
						{
							return("invalid");
						}

					}
					return("valid");
				}
			}
			
			
			
			
			else
			{
				return("invalid");
			}
		}
	
	if(piece == "pawn")
		{
			
			var endSquareElement = document.getElementById(endSquare);
			
			
			if(userColor == "white" )
			{
				
				
				if( ( (endX == startX + 1) && (endY == startY +1)  ) ||  ((endX == startX + 1) && (endY == startY -1)  ) )
					{
						var booleanOccupiedSquare = checkIfOccupiedSquare (endSquareElement);
						if(booleanOccupiedSquare == "yes" )
						{
							return("valid");
						}
						else
						{
							return("invalid");
						}
					}
					
					
				
				
				if( (endX == (startX+1)) && (endY == startY) )
					{
						if(endSquareElement.childNodes.length ==1 )
						{						
							return("valid");
						}
						else
						{
							return("invalid");
						}
						
					}
				if( (endX == (startX+2)) && (endY == startY) && (startX == 98))
				{
					var nextSquareId = "c"+startY;
					var nextSquareElement = document.getElementById(nextSquareId);
					var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);											
					if(booleanOccupiedSquare == "yes")
					{
						return("invalid");
					}
					else
					{
						return("valid");
					}
				}
				
				else
					{
						return("invalid");
					}
			}	
			
			if(userColor == "black" )
			{
				
				if( ((endX == startX - 1) && (endY == startY +1)  ) ||  ((endX == startX - 1) && (endY == startY -1) ) )
					{
						var booleanOccupiedSquare = checkIfOccupiedSquare (endSquareElement);
						if(booleanOccupiedSquare == "yes" )
						{
							return("valid");
						}
						else
						{
							return("invalid");
						}
					}
				
				if( (endX == (startX-1)) && (endY == startY) )
					{
						if(endSquareElement.childNodes.length ==1 )
						{						
							return("valid");
						}
						else
						{
							return("invalid");
						}
					}
					
				if( (endX == (startX-2)) && (endY == startY) && startX == 103)
					{
						var nextSquareId = "f"+startY;
						var nextSquareElement = document.getElementById(nextSquareId);
						var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);											
						if(booleanOccupiedSquare == "yes")
						{
							return("invalid");
						}
						else
						{
							return("valid");
						}
					}
				else
					{
						return("invalid");
					}
			}	
			
		}
		
	if(piece == "queen")
		{
			differenceX = endX-startX;
			differenceY = endY-startY;
			absoluteDifferenceX = Math.abs(differenceX);
			absoluteDifferenceY = Math.abs(differenceY);

			if( absoluteDifferenceX == absoluteDifferenceY )
			{
				if( (differenceX > 0) && (differenceY > 0) )
					{
						for(j=1;j<absoluteDifferenceX;j++)
						{
							var nextSquareY = startY+j;
							var nextSquareXAscii = startX+j;
							var nextSquareX = String.fromCharCode(nextSquareXAscii);
							var nextSquareId = nextSquareX+nextSquareY;

							var nextSquareElement = document.getElementById(nextSquareId);

							var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);

							if(booleanOccupiedSquare == "yes")
							{
								return("invalid");
							}

						}
					return("valid");

					}

				if( (differenceX > 0) && (differenceY < 0) )
					{
						for(j=1;j<absoluteDifferenceX;j++)
						{
							var nextSquareY = startY-j;
							var nextSquareXAscii = startX+j;
							var nextSquareX = String.fromCharCode(nextSquareXAscii);
							var nextSquareId = nextSquareX+nextSquareY;

							var nextSquareElement = document.getElementById(nextSquareId);

							var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);

							if(booleanOccupiedSquare == "yes")
							{
								return("invalid");
							}

						}
					return("valid");

					}

				if( (differenceX < 0) && (differenceY > 0) )
					{
						for(j=1;j<absoluteDifferenceX;j++)
						{
							var nextSquareY = startY+j;
							var nextSquareXAscii = startX-j;
							var nextSquareX = String.fromCharCode(nextSquareXAscii);
							var nextSquareId = nextSquareX+nextSquareY;

							var nextSquareElement = document.getElementById(nextSquareId);

							var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);

							if(booleanOccupiedSquare == "yes")
							{
								return("invalid");
							}

						}
					return("valid");

					}

				if( (differenceX < 0) && (differenceY < 0) )
					{
						for(j=1;j<absoluteDifferenceX;j++)
						{
							var nextSquareY = startY-j;
							var nextSquareXAscii = startX-j;
							var nextSquareX = String.fromCharCode(nextSquareXAscii);
							var nextSquareId = nextSquareX+nextSquareY;

							var nextSquareElement = document.getElementById(nextSquareId);

							var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);

							if(booleanOccupiedSquare == "yes")
							{
								return("invalid");
							}

						}
					return("valid");

					}


			}
			
			
			
			
			
			
			if(endX == startX)
			{
				var n=differenceY;

				if(n > 0)
				{
					for(j=1;j<n;j++)
					{
						var nextSquareY = startY+j;
						var nextSquareX = String.fromCharCode(startX);
						var nextSquareId = nextSquareX+nextSquareY;

						var nextSquareElement = document.getElementById(nextSquareId);

						var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);

						if(booleanOccupiedSquare == "yes")
						{
							return("invalid");
						}

					}
					return("valid");
				}

				if(n < 0)
				{

					for(j=1 ; j<Math.abs(n) ; j++)
					{
						var nextSquareY = startY-j;						
						var nextSquareX = String.fromCharCode(startX);						
						var nextSquareId = nextSquareX+nextSquareY;

						var nextSquareElement = document.getElementById(nextSquareId);						

						var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);

						if(booleanOccupiedSquare == "yes")
						{
							return("invalid");
						}

					}
					return("valid");
				}
			}

			if(endY == startY)
			{
				var n=differenceX;

				if(n > 0)
				{
					for(j=1;j<n;j++)
					{
						var nextSquareXAscii = startX+j;
						var nextSquareX = String.fromCharCode(nextSquareXAscii);						
						var nextSquareId = nextSquareX+startY;

						var nextSquareElement = document.getElementById(nextSquareId);

						var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);

						if(booleanOccupiedSquare == "yes")
						{
							return("invalid");
						}

					}
					return("valid");
				}

				if(n < 0)
				{

					for(j=1;j<Math.abs(n);j++)
					{
						var nextSquareXAscii = startX-j;						
						var nextSquareX = String.fromCharCode(nextSquareXAscii);						
						var nextSquareId = nextSquareX+startY;						
						var nextSquareElement = document.getElementById(nextSquareId);

						var booleanOccupiedSquare=checkIfOccupiedSquare(nextSquareElement);

						if(booleanOccupiedSquare == "yes")
						{
							return("invalid");
						}

					}
					return("valid");
				}
			}

			else
			{
				return("invalid");
			}
			
			
		}	


}


	