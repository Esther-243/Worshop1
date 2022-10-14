package jpu2016.dogfight.model;

public interface IDogfightModel {
	public IArea getArea() {
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
