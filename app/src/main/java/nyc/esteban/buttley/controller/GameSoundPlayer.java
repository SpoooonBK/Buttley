package nyc.esteban.buttley.controller;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.util.Log;

import nyc.esteban.buttley.R;
import nyc.esteban.buttley.model.ViewSoundMap;
import nyc.esteban.buttley.view.MainActivity;

/**
 * Created by Spoooon on 11/22/2014.
 */
public class GameSoundPlayer {

    private SoundPool soundPool;
    private Activity activity;
    private ViewSoundMap map;


    private static boolean hasPlayer = false;

    public GameSoundPlayer(Activity activity){
        if(hasPlayer == false){
            soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC,0);
            this.activity = activity;
            map = new ViewSoundMap();
            map.setMap();
            loadSounds();
            hasPlayer = true;
        }
    }

    private void loadSounds(){
        soundPool.load(activity, R.raw.sound1,1);
        soundPool.load(activity, R.raw.sound2,1);
        soundPool.load(activity, R.raw.sound3,1);
        soundPool.load(activity, R.raw.sound4,1);
    }

    public void playSound(int viewId) {
        soundPool.play(map.getSoundID(viewId),1.0F,1.0F,1,0,1.0F);
        Log.d(MainActivity.TAG,"Sound Playing: "+ map.getSoundID(viewId));
    }

}
