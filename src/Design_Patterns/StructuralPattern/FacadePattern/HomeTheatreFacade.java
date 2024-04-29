package Design_Patterns.StructuralPattern.FacadePattern;

/*we are assuming to turn on Home Theatre we need to follow the steps below
1-Turn on Television
2-Turn on Sound System
3-Turn off Lights

and to turn off Home Theatre
1-Turn on lights
2-turn off Television
3-turn off sound system*/

public class HomeTheatreFacade {
    private Television television;
    private SoundSystem soundSystem;
    private Lights lights;

    HomeTheatreFacade(Television television,SoundSystem soundSystem,Lights lights){
        this.television=television;
        this.soundSystem=soundSystem;
        this.lights=lights;
    }

    void TurnOnHomeTheatre(){
        television.TurnOnTelevision();
        soundSystem.TurnOnSoundSystem();
        lights.TurnOffLights();
    }

    void TurnOffHomeTheatre(){
        lights.TurnOnLights();
        television.TurnOffTelevision();
        soundSystem.TurnOffSoundSystem();
    }

}
