package week1.day1;

public class Mobile {
	public void makeCall(){
		String mobileModel = "samsung";
		Float mobileWeight = 5.0f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 15000;
		System.out.println(isFullCharged);
		System.out.println(mobileCost);
	}
	public static void main(String[] args) {
		Mobile Mob = new Mobile();
		System.out.println("This is my mobile");
		Mob.makeCall();
		Mob.sendMsg();
	}
}