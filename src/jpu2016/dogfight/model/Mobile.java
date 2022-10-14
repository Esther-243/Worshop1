package jpu2016.dogfight.model;

public class Mobile implements IMobile {
	private int speed;
	private Direction direction;
	private Position position;
	private Dimension dimension;
	private String image;
	
	
	public Mobile (Direction direction,Position position , Dimension dimension , int speed, String image) {
		this.direction=direction;
		this.position=position;
		this.dimension=dimension;
		this.image=image;
	}
	
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction=direction;
	}
	
	public Point getPosition() {
		return point;
	}

}
