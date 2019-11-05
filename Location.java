package LepinskiEngine;
import java.util.List;

//getDirections returns the directions one can move from this location
//... That is, the directions that are not blocked by a wall

//isScanned returns true if the location is within scanner range
//... If this function returns true then all information will be present 
//... If this function is false then some information may be missing
//... If information is missing because the location is not scanned
//    then the corresponding function will return null

//isTeamStart returns true if the location is the starting point for Team 1

//getX and getY return the coordinates of the location
//... (0,0) is the north-west corner of the maze

public interface Location{
    public List<CoinType> getCoins();
    public List<Robot> getRobots();
    public List<DirType> getDirections();
    public int getX();
    public int getY();
    public boolean isScanned();
    public boolean isTeamStart();
}