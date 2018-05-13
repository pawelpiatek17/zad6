package mazeElements;

import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;

public interface RoomPart {
	public static final String WALL = "wall";
	public static final String DOOR = "door";
	public static final String KEY = "key";
	public String getType();
	public void draw(Pane pane);
	public int getXCoordinate();
	public int getYCoordinate();
	public int getW();
	public int getH();
	public Bounds getBoundsInP();
	public boolean intersects(Bounds localBounds);
}
