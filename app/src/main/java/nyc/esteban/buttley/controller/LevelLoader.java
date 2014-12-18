package nyc.esteban.buttley.controller;

import android.util.Log;

import java.util.List;

import nyc.esteban.buttley.model.game.levels.GameLevel;
import nyc.esteban.buttley.model.game.levels.LevelBuilder;
import nyc.esteban.buttley.model.game.levels.LevelIDEnum;
import nyc.esteban.buttley.model.game.sounds.Sound;
import nyc.esteban.buttley.model.game.views.LevelView;

/**
 * Created by Spoooon on 12/6/2014.
 */
public class LevelLoader {

    private static boolean isInitialized = false;
    private GameLevel gameLevel;
    private List<Sound> soundList;
    private List<LevelView> levelViewList;

    private LevelLoader() {
    }

    public static LevelLoader initializeLevelLoader(){
       LevelLoader levelLoader;
        if(isInitialized == false){
           isInitialized = true;
           return new LevelLoader();
       }
        else return null;
    }

    public void loadLevel(LevelIDEnum levelID){
        LevelBuilder levelBuilder = new LevelBuilder();
        gameLevel = levelBuilder.buildGameLevel(levelID);
        Log.d("Butt", "GameLevel built");
        soundList = gameLevel.getSoundList();
        SoundPlayer soundPlayer= new SoundPlayer(soundList);
    }


}
