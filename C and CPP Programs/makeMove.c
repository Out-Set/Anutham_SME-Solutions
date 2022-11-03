void makeMove(char playerName[NAME], int playerNum, char board[ROW][COL])
{
    char move[TWO];  // error corrected
    int valid = FALSE;

    // loop until the player enters a valid move
    while(!valid)
    {
        printf("%s, enter your move location (e.g. B6)\n", playerName);
        scanf("%s", &move);  // error corrected

        printf("%s, you entered %s\n", playerName, move);

        int length = strlen(move);  // error corrected

        if(length == TWO){
            valid = TRUE;
        }
        // error corrected
        else{                      
            valid = FALSE;
            printf("Invalid move, try again\n\n");  
        }
    }         
}
