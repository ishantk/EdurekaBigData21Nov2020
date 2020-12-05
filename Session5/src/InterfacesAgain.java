import java.util.Date;

interface Notification{
	void notify(String message);
}

class YouTubeChannel{
	
	String channelName = "edureka";
	Notification notification;
	
	void subcribe(YouTubeUser user) {
		notification = user; // Reference Variable of Interface can refer to the Object of class which implements it
	}
	
	void postVideo(String videoTitle) {
		System.out.println("Video Uploaded on "+new Date());
		notification.notify(videoTitle);
	}
	
}

class YouTubeUser implements Notification{
	
	public void notify(String message) {
		System.out.println("YouTubeApp Notification");
		System.out.println("A new Notification "+message);
		System.out.println("-----------------------");
	}
	
}

public class InterfacesAgain {

	public static void main(String[] args) {
		
		YouTubeUser user = new YouTubeUser();
		
		YouTubeChannel channel = new YouTubeChannel();
		channel.subcribe(user);
		
		channel.postVideo("Trending Technologies in IT");
		

	}

}
