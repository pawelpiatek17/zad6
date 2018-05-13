package mazeElements;

import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Key extends Rectangle implements RoomPart{
	static int counter = 0;
	private int id;
	private String type;
	public Key(double x, double y) {
		super(x,y,10,10);
		this.id = counter;
		counter++;
		setFill(Color.GOLD);
		type = RoomPart.KEY;
	}

	public int getKeyId() {
		return id;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void draw(Pane pane) {
		if(!pane.getChildren().contains(this)){
			pane.getChildren().add(this);
		}
	}
	public int getXCoordinate(){
		return (int) getX();
	}
	public int getYCoordinate(){
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
	public Bounds getBoundsInP() {
		return getBoundsInParent();
	}
}
