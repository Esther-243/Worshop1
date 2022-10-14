package jpu2016.dogfight.model;

import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {
	private Sky sky;
	
	public DogfightModel() {
		this.sky= new Sky(null);
	}
	
	public IArea getArea() {
		IArea area;;
		return area;
	}
	
	public void builArea(Dimension dimension) {
	}
	
	public void addMobile(IMobile mobile) {
	}
	
	public void removeMobile(IMobile mobile) {
	}
	
	public ArrayList<IMobile> getMobiles() {
	}
	
	public IMobile getMobileByPlayer(int player) {
	}
	
	public void setMobilesHavesMoved() {
	}
}
