package nyc.esteban.buttley.controller;

import java.util.Map;

import nyc.esteban.buttley.model.Sequence;

/**
 * Created by Spoooon on 11/23/2014.
 */
public class MemoryGame {

    private static Map<Integer, Sequence> sequenceMap;
    private static int lastSequenceID;
    private SoundPlayer soundPlayer;
    private Sequence currentSequence;
    private boolean isNewGame = true;

    public MemoryGame(SoundPlayer soundPlayer) {
        this.soundPlayer = soundPlayer;

        if(isNewGame == true) {
            Sequence sequence = new Sequence();
            sequenceMap.put(sequence.getId(),sequence);
            currentSequence = sequence;
            lastSequenceID = sequence.getId();
        }
        else{
            loadSequence(lastSequenceID);
        }


    }

    public void saveSequence(Sequence sequence){
        sequenceMap.put(sequence.getId(), sequence);
    }

    public void loadSequence(int id){
        currentSequence = sequenceMap.get(id);
    }



}
