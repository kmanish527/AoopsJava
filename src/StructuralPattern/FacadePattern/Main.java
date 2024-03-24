package StructuralPattern.FacadePattern;

public class Main {
    public static void main(String[] args) {
        HomeTheatreFacade htf = new HomeTheatreFacade(new Television(),new SoundSystem(),new Lights());
        htf.TurnOnHomeTheatre();//to turn on home theatre
        htf.TurnOffHomeTheatre();//to turn off home theatre
    }
}
