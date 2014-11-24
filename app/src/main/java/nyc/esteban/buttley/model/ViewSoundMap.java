package nyc.esteban.buttley.model;

import java.util.HashMap;
import java.util.Map;

import nyc.esteban.buttley.R;

/**
 * Created by Spoooon on 11/22/2014.
 */
public class ViewSoundMap {

    private final Integer SOUND1 = R.raw.sound1;
    private final Integer SOUND2 = R.raw.sound2;
    private final Integer SOUND3 = R.raw.sound3;
    private final Integer SOUND4 = R.raw.sound4;

    private final Integer VIEW_RIGHT1 = R.id.right1;
    private final Integer VIEW_RIGHT2 = R.id.right2;
    private final Integer VIEW_RIGHT3 = R.id.right3;
    private final Integer VIEW_RIGHT4 = R.id.right4;
    private final Integer VIEW_RIGHT5 = R.id.right5;

    private final Integer VIEW_MID1 = R.id.mid1;
    private final Integer VIEW_MID2 = R.id.mid2;
    private final Integer VIEW_MID3 = R.id.mid3;
    private final Integer VIEW_MID4 = R.id.mid4;
    private final Integer VIEW_MID5 = R.id.mid5;

    private final Integer VIEW_LEFT1 = R.id.left1;
    private final Integer VIEW_LEFT2 = R.id.left2;
    private final Integer VIEW_LEFT3 = R.id.left3;
    private final Integer VIEW_LEFT4 = R.id.left4;
    private final Integer VIEW_LEFT5 = R.id.left5;

    public Map<Integer, Integer> map;

    public void setMap() {
        map = new HashMap<Integer, Integer>();
        map.put(VIEW_LEFT1, SOUND1);
        map.put(VIEW_MID1, SOUND2);
        map.put(VIEW_RIGHT1, SOUND3);
        map.put(VIEW_LEFT2, SOUND4);
    }

    public Integer getSoundID(Integer viewID){
        return map.get(viewID);
    }



}
