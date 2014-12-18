package nyc.esteban.buttley.model.game.sounds;

/**
 * Created by Spoooon on 12/6/2014.
 */
public class Sound {

    private String soundName;
    private int soundID;

    public Sound(String soundName, int resourceID) {
        this.soundName = soundName;
        this.soundID = resourceID;
    }

    public String getSoundName() {
        return soundName;
    }

    public void setSoundName(String soundName) {
        this.soundName = soundName;
    }

    public int getSoundID() {
        return soundID;
    }

    public void setSoundID(int resourceID) {
        this.soundID = resourceID;
    }
}
