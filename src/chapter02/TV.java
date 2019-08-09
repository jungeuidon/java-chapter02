package chapter02;

public class TV {
	private int channel;
	private int volume;
	private boolean status;
	private boolean power;
	
	public TV() {
		
	}
	
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isStatus() {
		return status;
	}

	public boolean isPower() {
		return power;
	}

	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power= power;
	}
	
	
	public void power(boolean power) {
		if(power) {
			this.channel = getChannel();
			this.volume = getVolume();
			this.power = power;
		}else {
			this.power = power;
		}
	}
	
	public void channel(int channel) {
		this.channel = channel;
	}
	public void channel(boolean up) {
		if(up) {
			channel=getChannel()+1;
		}else {
			channel=getChannel()-1;
		}
		if(channel<1) {
			channel=1;
		}else if(255<channel){
			channel=255;
		}
	}
	public void volume(int volume) {
		this.volume=volume;
	}
	public void volume(boolean up) {
		if(up) {
			volume=getChannel()+1;
		}else {
			volume=getChannel()-1;
		}
		if(volume<1) {
			volume=1;
		}else if(100<volume){
			volume=100;
		}
	}
	public void status() {
		if(!isPower()) {
			System.out.println("채널은 " + getChannel() + "볼륨은 " + getVolume() + "켜져있습니다");
		}else {
			System.out.println("채널은 " + getChannel() + "볼륨은 " + getVolume() + "꺼져있습니다");
		}
	}
	
	
	
}
