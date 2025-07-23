package chapter03.tv;

public class WatchTV {
	public static void main(String[] args) {
        TV tv = new TV(7, 20, false);
        
        tv.status();

        tv.power(true);
        tv.status();

        tv.volume(false);
        tv.status();

        tv.channel(0);
        tv.status();

        tv.channel(false);
        tv.channel(false);
        tv.channel(false);
        tv.status();

        tv.power(false);
        tv.status();
    }
}
