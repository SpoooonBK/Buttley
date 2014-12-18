package nyc.esteban.buttley.model.game.views;

/**
 * Created by Spoooon on 12/14/2014.
 */
public class LevelView {
    private int viewID;
    private int graphicID;

    public LevelView(int viewID, int graphicID) {
        this.viewID = viewID;
        this.graphicID = graphicID;
    }

    public int getViewID() {
        return viewID;
    }

    public void setViewID(int viewID) {
        this.viewID = viewID;
    }

    public int getGraphicID() {
        return graphicID;
    }

    public void setGraphicID(int graphicID) {
        this.graphicID = graphicID;
    }
}
