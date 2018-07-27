package lateBindingParamsFails;

public abstract class Monster {

//	public void collide(Monster m) {
//		if (m instanceof Mushroom) {
//			this.collide((Mushroom)m);
//			return;
//		}
//		if (m instanceof Centipede) {
//			this.collide((Centipede)m);
//			return;
//		}
//		if (m instanceof Scorpion) {
//			this.collide((Scorpion)m);
//			return;
//		}
//		//Starting to see where this could get a little ugly?
//		
//	}
	
	public abstract void collide(Mushroom m);

	public abstract void collide(Centipede m);
	
	public abstract void collide(Scorpion m);
}
