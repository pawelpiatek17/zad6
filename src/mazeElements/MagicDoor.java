package mazeElements;

import java.util.ArrayList;

import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class MagicDoor extends Rectangle implements Door{
	private int keyId;
	private String type;
	private String status;
	private ArrayList<Room> rooms;
	private Paint mainColor = Color.DEEPPINK;
	private Paint secondaryColor = Color.PINK;
	public MagicDoor(double x, double y) {
		super(x, y, 10,10);
		type = RoomPart.DOOR;
		status = Door.OPEN;
		rooms = new ArrayList<>(2);
		setFill(mainColor);
		toFront();
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public Room enter(Room currentRoom) {
		for (Room room : rooms) {
			if (room != currentRoom) {
				status = OPEN;
				return room;
			}
		}
		return null;
	}

	@Override
	public boolean isOpen() {
		if(status.equals(OPEN)){
			return true;
		}
		return false;
	}

	@Override
	public void addRoom(Room room) {
		rooms.add(room);
		
	}

	@Override
	public void draw(Pane pane) {
		if(!pane.getChildren().contains(this)){
			pane.getChildren().add(this);
		}
		toFront();
	}

	@Override
	public int getKeyId() {
		return keyId;
	}

	@Override
	public void swapColor() {
		setFill(secondaryColor);
	}

	@Override
	public int getXCoordinate() {
		return (int) getX();
	}

	@Override
	public int getYCoordinate() {
		return (int) getY();
	}

	@Override
	public int getW() {
		return (int) getWidth();
	}

	@Override
	public int getH() {
		return (int) getHeight();
	}

	@Override
	public void setKeyId(int id) {
		keyId = id;
	}
	@Override
	public Bounds getBoundsInP() {
		return getBoundsInParent();
	}
}
