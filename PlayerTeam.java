package LepinskiEngine;
import java.util.List;

//startGame is called once at the very start of the game

//requestCommands is called each turn
//This functino should return one Command for each robot awaiting command

public interface PlayerTeam{
    public void startGame(List<Robot> bots, GameState state); 
    public List<Command> requestCommands(List<Location> information, List<Robot> robotsAwaitingCommand, GameState state);
}
