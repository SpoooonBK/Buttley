package nyc.esteban.buttley.model.game.views;

import java.util.ArrayList;
import java.util.List;

import nyc.esteban.buttley.R;

/**
 * Created by Spoooon on 12/14/2014.
 */
public class LevelViewListBuilder {

    private static List<LevelView> levelViewList = new ArrayList<LevelView>();

    public LevelViewListBuilder() {
    }

    public static List<LevelView> buildViewList(LevelViewListIDEnum levelViewListIDEnum) {
        levelViewList.clear();
        switch (levelViewListIDEnum) {
            case VIEW_LIST_ID_1:{
                levelViewList.add(new LevelView(R.id.level_1_left1, R.drawable.blue_bean));
                levelViewList.add(new LevelView(R.id.level_1_mid1, R.drawable.blue_bean));
                levelViewList.add(new LevelView(R.id.level_1_right1, R.drawable.blue_bean));
                levelViewList.add(new LevelView(R.id.level_1_mid2, R.drawable.blue_bean));
            }

            case VIEW_LIST_ID_2: {

//                levelViewList.add(R.id.level_1_right1);
//                levelViewList.add(R.id.level_1_right2);
//                levelViewList.add(R.id.level_1_right3);
//                levelViewList.add(R.id.level_1_right4);
//                levelViewList.add(R.id.level_1_right5);
//
//                levelViewList.add(R.id.level_1_mid1);
//                levelViewList.add(R.id.level_1_mid2);
//                levelViewList.add(R.id.level_1_mid3);
//                levelViewList.add(R.id.level_1_mid4);
//                levelViewList.add(R.id.level_1_mid5);
//
//                levelViewList.add(R.id.level_1_left1);
//                levelViewList.add(R.id.level_1_left2);
//                levelViewList.add(R.id.level_1_left3);
//                levelViewList.add(R.id.level_1_left4);
//                levelViewList.add(R.id.level_1_left5);
            }
            break;
        }
        return levelViewList;
    }
}
