package activitytest.yerx.com.activitylifecycletest;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by yefei on 15-12-12.
 */
public class DialogActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_layout);
    }
}
