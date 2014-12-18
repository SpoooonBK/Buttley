package nyc.esteban.buttley.model.game.levels;

import java.util.List;
import java.util.Map;

import nyc.esteban.buttley.model.game.sounds.Sound;
import nyc.esteban.buttley.model.game.sounds.SoundListBuilder;
import nyc.esteban.buttley.model.game.sounds.SoundListIDEnum;
import nyc.esteban.buttley.model.game.views.LevelView;
import nyc.esteban.buttley.model.game.views.LevelViewListBuilder;
import nyc.esteban.buttley.model.game.views.LevelViewListIDEnum;

/**
 * Created by Spoooon on 11/30/2014.
 */
public class LevelBuilder {

    LevelIDEnum moduleID;
    private SoundListBuilder soundListBuilder;
    List<Sound> soundList;
    List<LevelView> levelViewList;
    Map<LevelView, Sound> viewSoundMap;

    public GameLevel buildGameLevel(LevelIDEnum levelID){

       switch (levelID){

           case LEVEL_1:
               soundList = SoundListBuilder.buildSoundList(SoundListIDEnum.SOUND_LIST_1) ;
               levelViewList = LevelViewListBuilder.buildViewList(LevelViewListIDEnum.VIEW_LIST_ID_1);
               break;

       }

//     Iterator<Sound> soundIterator =soundList.iterator();
//     Iterator<LevelView> levelViewIterator = levelViewList.iterator();
//     Integer viewID;
//     Integer soundID;
////     if (soundList.size() == levelViewList.size()){
//           while(levelViewIterator.hasNext()){
//             viewSoundMap.put(levelViewIterator.next(), soundIterator.next());
//           }
//        };

        return new GameLevel(levelViewList, soundList);
    }

}
