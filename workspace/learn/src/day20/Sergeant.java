package day20;

public class Sergeant extends Army{
	@Override
	public void eat() {
		System.out.println("하루종일 먹는다");
	}
	
	@Override
	public void sleep() {
		System.out.println("하루종일 잔다");
	}
	
	@Override
	public void play() {
		System.out.println("하루종일 논다");
	}
	
}
