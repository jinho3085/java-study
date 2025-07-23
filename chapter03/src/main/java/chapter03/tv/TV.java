package chapter03.tv;

public class TV {
	private static final int MAX_VOLUME = 100;
	private static final int MIX_VOLUME = 0;
	
	private int channel; // 1 ~ 255,
	private int volume; // 0 ~ 100
	private boolean power; 
	
	public TV() {
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void show() {
		System.out.println("TV[channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	} 
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getChannel() {
		return channel;
	}
	
	// 채널범위 (1~255)
	public void channel(int channel) {
		if (!power) return;
		
		if (channel < 1) {
			this.channel = 255;
		} else if (channel > 255) {
			this.channel = 1;
		} else {
			this.channel = channel;
		}
	}
	
	// 저장,읽기
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
	
	public boolean getPower() {
		return power;
	}
	
	public void power(boolean on) {
		this.power = on;
	}

	// 볼륨
	public void status() {
		int i = 0;
		if(volume > 10) {
			i = 10;
		} else {
			i = 20;
		}
		
		int j = (volume > 10) ? 10 : 20;
//		String status = ;
		
	System.out.println("TV[channel=" + channel + ", volume=" + volume + ", power=" + (power ? "on" : "off") + "]");
	}
	
	public void Power(boolean on) {
		power = on;
	}
	
	public void volume(boolean up) {
		if(!power) {
			return;
		}
		
		volume += (up ? 1 : -1);
		
		if(volume < MIX_VOLUME) {
			volume = MIX_VOLUME;
		} else if(volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		}
	}
	
	public void channel1(int channel) {
		if(!power) {
			return;
		}
		if(channel < 1) {
			channel = 255;
		} else if(channel > 255) {
			channel = 1;
		}
		this.channel = channel;
	}

	public void channel(boolean up) {
		channel(channel + (up ? 1 : -1));
	}
	
}
