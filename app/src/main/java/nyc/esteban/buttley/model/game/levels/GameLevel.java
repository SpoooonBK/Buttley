package nyc.esteban.buttley.model.game.levels;

import java.util.List;

import nyc.esteban.buttley.model.game.sounds.Sound;
import nyc.esteban.buttley.model.game.views.LevelView;

/**
 * Created by Spoooon on 11/30/2014.
 */
public class GameLevel {

    List<LevelView> levelViewList;
    List<Sound> soundList;

    public GameLevel(List<LevelView> levelViewList, List<Sound> soundList) {
        this.levelViewList = levelViewList;
        this.soundList = soundList;
    }

    public List<LevelView> getLevelViewList() {
        return levelViewList;
    }

    public List<Sound> getSoundList() {
        return soundList;
    }

}
