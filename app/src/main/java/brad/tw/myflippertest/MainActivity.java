package brad.tw.myflippertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    private ViewFlipper vf;
    private Animation animInLeftRight, animInRightLeft, animOutLeftRight, animOutRightLeft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animInLeftRight = AnimationUtils.loadAnimation(this, R.anim.in_leftright);
        animOutLeftRight = AnimationUtils.loadAnimation(this, R.anim.out_leftright);


        vf = (ViewFlipper)findViewById(R.id.activity_main);

        vf.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                vf.setInAnimation(animInLeftRight);
                vf.setOutAnimation(animOutLeftRight);
                vf.showNext();
                return false;
            }
        });

    }
}
