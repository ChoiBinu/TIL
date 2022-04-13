public class Main {
	public static void main(String args[]) {
	
		TV controller = new TV();				// controller 라는 인스턴스를 생성 후 TV 객체를 넣어
		controller.power = true;
		controller.power();
		System.out.println(controller.power);
	
	}
	
}

class TV {
	String color;						// 색
	boolean power;						// 전원(on/off)
	int channel;						// 채
	
	void power() {power = !power;}		// 티비전원 기
	void channelUp() {++channel;}		// 티비 채널 높이
	void channelDown() {--channel;}		// 티비 채널 낮추기
}