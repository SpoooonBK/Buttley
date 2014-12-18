package nyc.esteban.buttley.model.game.sounds;

import java.util.ArrayList;
import java.util.List;

import nyc.esteban.buttley.R;

/**
 * Created by Spoooon on 12/6/2014.
 */
public class SoundListBuilder {



    private static List<Sound> soundList = new ArrayList<Sound>();

    SoundListBuilder(){
    }

    public static List<Sound> buildSoundList(SoundListIDEnum soundListIDEnum){
        soundList.clear();
        switch(soundListIDEnum){
            case SOUND_LIST_1:{
                soundList.add(new Sound("Sound 1", R.raw.sound1));
                soundList.add(new Sound("Sound 2", R.raw.sound2));
                soundList.add(new Sound("Sound 3", R.raw.sound3));
                soundList.add(new Sound("Sound 4", R.raw.sound4));
            }
            break;
        }
        return soundList;
    }




    public List<Sound> getSoundList() {
        return soundList;
    }

}
