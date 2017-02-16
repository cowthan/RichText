package zhou.demo.spannable;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.style.DrawableMarginSpan;
import android.view.View;

import zhou.demo.R;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoDrawableMarginSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "DrawableMarginSpan";
    }

    @Override
    protected String getInfo() {
        return "DrawableMarginSpan\n" +
                "图片+文字效果\n" +
                "\n" +
                "因为图片和文字是整体作为一个spannable，所以调节TextView的gravity没用....";
    }

    @Override
    protected Spannable getSpannable() {

        return SpannableBuilder.from("abcdefghij\n12345678\nABCDEFGHIJ")
                .on("abcdefghij", new DrawableMarginSpan(getResources().getDrawable(R.mipmap.ic_launcher), 20))
                .on("12345678", new DrawableMarginSpan(getResources().getDrawable(R.mipmap.ic_launcher)))
                .drawable("ABCDEFGHIJ", getResources().getDrawable(R.mipmap.ic_launcher), 40)
                .build();
    }

    @Override
    protected void onCreate2(View view, @Nullable Bundle bundle) {
        super.onCreate2(view, bundle);
        showTest2(SpannableBuilder.from("1122334")
                .drawable("1122334", getResources().getDrawable(R.mipmap.ic_launcher), 40)
                .build()
                );
    }
}
