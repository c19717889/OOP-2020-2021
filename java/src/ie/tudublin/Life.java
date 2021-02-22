package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet {

    int size = 100;
    float cellSize;
    //2d arrays use rows and columbs
    boolean[][] board = new boolean[size][size];

    public int countCellsAround(int row, int col)
    {
        int count = 0;

        /*if (getCell(board, row - 1, col + 1))
        {
            count++;
        }
        if (getCell(board, row - 1, col))
        {
            count++;
        }
        if (getCell(board, row - 1, col + 1))
        {
            count++;
        }
        if (getCell(board, row - 1, col + 1))
        {
            count++;
        }
        if (getCell(board, row - 1, col + 1))
        {
            count++;
        }
        if (getCell(board, row - 1, col + 1))
        {
            count++;
        }
        if (getCell(board, row - 1, col + 1))
        {
            count++;
        }
        if (getCell(board, row - 1, col + 1))
        {
            count++;
        }
        
        return count;*/
        


        for(int r = row -1 ; r <= row + 1 ; r ++)
        {
            for (int c = col - 1; c <= col + 1 ; c ++)
            {
                if(r != row && c != col)
                {
                    if(getCell(board, r, c))
                    {
                        count ++;
                    }
                }
            }
        }

        return count;
    }

    //accessor methods to check bounds
    public void setCell(boolean[][] board, int row, int col, boolean b)
    {
        if(row > 0 && row < size -1 && col > 0 && col < size -1)
        {
            board[row][col] = b;
        }
    }

    public boolean getCell(boolean[][] board,int row, int col)
    {
        if(row > 0 && row < size -1 && col > 0 && col < size -1)
        {
            return board[row][col];
        }
        else
        {
            return false;
        }
        
    }


    public void drawBoard(boolean[][] board)
    {
        for(int row = 0 ; row < size ; row ++)
        {
            for (int col = 0 ; col < size ; col ++)
            {
                float x = map(col, 0, size, 0, width);
                // or use this.... float x = col * cellSize;
                float y = map(row, 0, size, 0, height);
                //or use this.... float y = row * cellSize;
                if(board[row][col])
                {
                    rect(x, y, cellSize, cellSize);
                }


            }
        }
        

    }

    private void printBoard(boolean[][] board)
    {
        for(int row = 0 ; row < size ; row ++)
        {
            for(int col = 0; col < size ; col ++)
            {
                print(board[row][col] ? 1 : 0);
            }
            println();
        }

    }

    public void randomize()
    {
        for(int row = 0 ; row < size ; row ++)
        {
            for(int col = 0; col < size ; col ++)
            {
                float dice = random(0.0f, 1.0f);
                if (dice < 0.5)
                {
                    board[row][col] = true;
                }
                else
                {
                    board[row][col] = false;
                }

                //board[row][col] = (dice < 0.5f) ? true : false;
            }
        }
    }


    public void settings()
    {
        size(500, 500);
    }
    
    int mode = 0;
    public void keyPressed() {
        // the value of mode will be the number of the
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(RGB);
        //randomize();
        board[0][1] = true;
        board[1][2] = true;
        board[3][2] = true;
        //printBoard(board);

        println(countCellsAround(0,2));

        cellSize = width / (size);
        
    }


    public void draw() {
        background(0);
        drawBoard(board);
    }
}
