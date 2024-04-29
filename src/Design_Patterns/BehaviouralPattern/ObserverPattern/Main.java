package Design_Patterns.BehaviouralPattern.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel1 yc1 = new YouTubeChannel1();
        YouTubeChannel2 yc2 = new YouTubeChannel2();

        User1 u1 = new User1();
        User2 u2 = new User2();
        User3 u3 = new User3();

        yc1.RegisterObserver(u1);
        yc1.RegisterObserver(u2);

        yc2.RegisterObserver(u1);
        yc2.RegisterObserver(u2);
        yc2.RegisterObserver(u3);

        yc1.NotifyObserver(" new video is added in Youtube channel 1");
        yc2.NotifyObserver("new video is added in youtube channel 2");

        yc1.UnRegisterobserver(u2);
        yc1.NotifyObserver("new video added in Youtube channel 1");

        yc2.UnRegisterobserver(u2);
        yc2.NotifyObserver("new video is added in youtube channel 2");
    }
}
