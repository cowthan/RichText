package zhou.demo.spannable;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.style.IconMarginSpan;
import android.view.View;

import zhou.demo.R;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoIconMarginSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "IconMarginSpan ";
    }

    @Override
    protected String getInfo() {
        return "IconMarginSpan \n" +
                "图片+文字效果\n" +
                "\n" +
                "因为图片和文字是整体作为一个spannable，所以调节TextView的gravity没用....";
    }

    @Override
    protected Spannable getSpannable() {

        return SpannableBuilder.from("abcdefghij\n12345678\nABCDEFGHIJ")
                .on("abcdefghij", new IconMarginSpan(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher), 20))
                .on("12345678", new IconMarginSpan(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher)))
                .icon("ABCDEFGHIJ", BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher), 40)
                .build();
    }

    @Override
    protected void onCreate2(View view, @Nullable Bundle bundle) {
        super.onCreate2(view, bundle);
        showTest2(SpannableBuilder.from("1122334")
                .icon("1122334", BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher), 40)
                .build()
                );
    }
}
