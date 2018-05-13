package mazeElements;

import java.util.ArrayList;

import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;

public interface Room {
	public static final String ROOM = "room";
	void draw(Pane pane);
	ArrayList<RoomPart> getParts();
	Key addKey(Key key);
	void addDoor(Door door);
	int getXCoordinate();
	int getYCoordinate();
	int getH();
	int getW();
	boolean intersects(Bounds b);
}
