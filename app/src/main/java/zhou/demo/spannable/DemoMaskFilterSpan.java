package zhou.demo.spannable;

import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.style.MaskFilterSpan;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoMaskFilterSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "MaskFilterSpan ";
    }

    @Override
    protected String getInfo() {
        return "LMaskFilterSpan：滤镜 \n" +
                "- BlurMaskFilter：模糊效果\n" +
                "- EmbossMaskFilter：浮雕效果，好像已废弃\n" +
                "\n" +
                "问题：不支持硬件加速，得view.setLayerType(View.LAYER_TYPE_SOFTWARE, null)";
    }



    @Override
    protected Spannable getSpannable() {
        return SpannableBuilder.from("radius = " + blurRadius + "\n" + "blur = " + blur.name())
                //.on("1122334", new MaskFilterSpan(new BlurMaskFilter(10, BlurMaskFilter.Blur.SOLID)))
                .build();
    }

    float lastX, lastY;

    @Override
    protected void onCreate2(View view, @Nullable Bundle bundle) {
        super.onCreate2(view, bundle);
        tv_test2.setTextSize(36);
        tv_test2.setTextColor(Color.GREEN);
        tv_test2.setBackgroundColor(Color.BLACK);
        tv_test2.setVisibility(View.VISIBLE);
        tv_test2.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        refresh();

        tv_test.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    lastX = event.getX();
                    lastY = event.getY();
                }else if(event.getAction() == MotionEvent.ACTION_MOVE){
                    float dx = event.getX() - lastX;
                    blurRadius += dx/50;
                    if(blurRadius <= 5){
                        blurRadius = 5;
                    }
                    refresh();
                }else{
                    lastX = 0;
                    lastY = 0;
                }
                return true;
            }
        });

        tv_test2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                currentBlurPos++;
                if(currentBlurPos == 4) currentBlurPos = 0;
                blur = blurs[currentBlurPos];
                refresh();
            }
        });
    }


    int blurRadius = 30;
    BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
    int currentBlurPos = 0;
    BlurMaskFilter.Blur[] blurs = new BlurMaskFilter.Blur[]{
            BlurMaskFilter.Blur.NORMAL,
            BlurMaskFilter.Blur.INNER,
            BlurMaskFilter.Blur.OUTER,
            BlurMaskFilter.Blur.SOLID
    };

//    String[] blursStr = new String[]{
//            "NORMAL",
//            "INNER",
//            "OUTER",
//            "SOLID"
//    };


    private void refresh(){
        tv_test2.setText("");
        Spannable s = SpannableBuilder.from("11aaaa11")
                .on("11aaaa11", new MaskFilterSpan(new BlurMaskFilter(blurRadius, blur)))
                .build();
        tv_test2.setText(s);

        tv_test.setText("radius = " + blurRadius + "\n" + "blur = " + blur.name());
    }
}
