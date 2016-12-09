/**
 * Created by nasirmac on 09/12/2016.
 */
public abstract class Player
{
    private char playerSing = Game.CROSS_CHAR;

    public static final String WRONG_MOVE_MESSAGE =
            "\nWrong move. Please check your input and try again!\n";

    protected abstract void makeMove();

    public char getPlayerSing()
    {
        return playerSing;
    }

    public void setPlayerSing(char playerSing)
    {
        this.playerSing = playerSing;
    }
}

