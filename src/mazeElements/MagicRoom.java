package mazeElements;

import java.util.ArrayList;

import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;

public class MagicRoom implements Room{
	ArrayList<RoomPart> parts;
	public MagicRoom(double x, double y, double width, double heigth) {
		parts = new ArrayList<>();
		RoomPart w = new MagicWall(x, y, width, heigth);
		parts.add(w);
	}


	@Override
	public void draw(Pane pane) {
		for (RoomPart roomPart : parts) {
			if(roomPart.getType().equals(RoomPart.WALL)){
				((Shape)roomPart).toBack();
			}else{
				((Shape)roomPart).toFront();
			}
			roomPart.draw(pane);
		}
		
	}

	@Override
	public ArrayList<RoomPart> getParts() {
		return parts;
	}

	@Override
	public void addDoor(Door door) {
		door.addRoom((Room)this);
		parts.add(door);
	}


	@Override
	public Key addKey(Key key) {
		parts.add(0,key);
		return key;
	}
	
	private Wall getWalls() {
		for (RoomPart roomPart : parts) {
			if(roomPart.getType().equals(RoomPart.WALL)){
				return (Wall) roomPart;
			}
		}
		return null;
	}
	
	@Override
	public int getXCoordinate(){
		return getWalls().getXCoordinate();
	}
	
	@Override
	public int getYCoordinate(){
		return getWalls().getYCoordinate();
	}
	@Override
	public int getW() {
		return (int) getWalls().getW();
	}

	@Override
	public int getH() {
		return (int) getWalls().getH();
	}


	@Override
	public boolean intersects(Bounds b) {
		if(getWalls().intersects(b)){
			return true;
		}
		return false;
	}
}
