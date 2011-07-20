package ualex.wordpress.com.tetris;

import android.app.Activity;
import android.os.Bundle;

public class TetrisAndroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Grid(this));
    }

}