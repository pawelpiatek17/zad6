package factories;

import mazeElements.Door;
import mazeElements.Key;
import mazeElements.Room;

public abstract class MazeElementsFactory {
	public abstract Room createRoom(double d , double e, double f, double g);
	public abstract Door createDoor(double d , double e);
	public abstract Key createKey(double d , double e);
}
