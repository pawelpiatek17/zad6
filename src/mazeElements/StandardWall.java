package mazeElements;

import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;

public class StandardWall extends Rectangle implements Wall {
	private String type;
	public StandardWall(double x, double y, double width, double height) {
		super(x, y, width, height);
		type = RoomPart.WALL;
		setFill(Color.DIMGREY);
		setStroke(Color.FIREBRICK);
		toBack();
		setStrokeWidth(10);
		setStrokeType(StrokeType.OUTSIDE);
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void draw(Pane pane) {
		pane.getChildren().add(this);
		toBack();
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
	public Bounds getBoundsInP() {
		return getBoundsInParent();
	}

	public boolean intersects(Bounds localBounds) {
		return getBoundsInParent().intersects(localBounds);
	}
}
