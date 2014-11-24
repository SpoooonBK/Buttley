package nyc.esteban.buttley.view;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import nyc.esteban.buttley.R;
import nyc.esteban.buttley.controller.GameSoundPlayer;


public class MainActivity extends Activity {

    GameSoundPlayer player;
    public static final String TAG = "Buttley";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_main);
        player = new GameSoundPlayer(this);
    }

    public void playSoundOnClick(View view){
        Log.d(TAG,"Clicked: "+ view.toString());
        player.playSound(view.getId());

    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.view_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
