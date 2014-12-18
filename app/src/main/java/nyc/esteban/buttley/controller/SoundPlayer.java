package nyc.esteban.buttley.controller;

import android.content.res.Resources;
import android.media.AudioManager;
import android.media.SoundPool;

import java.util.Iterator;
import java.util.List;

import nyc.esteban.buttley.model.game.sounds.Sound;

/**
 * Created by Spoooon on 11/22/2014.
 */
public class SoundPlayer {

    private SoundPool soundPool;
    private List<Sound> soundList;

    public SoundPlayer(List<Sound> soundList) {



        soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        loadSounds();

    }

    public void loadSounds() {
        Resources resources = new Resources(null, null, null);
        Iterator<Sound> soundIterator = soundList.iterator();

        while(soundIterator.hasNext()){
            soundPool.load(resources.openRawResourceFd(soundIterator.next().getSoundID()),1);
        }
    }

    public void playSound(int viewId) {

    }


}
