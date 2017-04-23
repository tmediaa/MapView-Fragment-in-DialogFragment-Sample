package app.tmediaa.gmap2;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button openMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openMap = (Button) findViewById(R.id.openMap);

        openMap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                AreaSelector myDialogFragment = new AreaSelector();
                myDialogFragment.setCancelable(true);
                myDialogFragment.setStyle(DialogFragment.STYLE_NORMAL, android.R.style.Theme_Light_Panel);
                myDialogFragment.show(fm, "dialog_fragment");

            }
        });
    }
}
