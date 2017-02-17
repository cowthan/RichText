package zhou.demo.spannable;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.view.View;

import zhou.demo.R;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoImageSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "ImageSpan";
    }

    @Override
    protected String getInfo() {
        return "ImageSpan\n" +
                "mageSpan(Context context, Bitmap b, ImageSpan.ALIGN_BOTTOM)\n" +
                "- 参数2还可以是：Drawable, String uri, Uri, resouceId\n" +
                "- 参数3的值好像只有ALIGN_BOTTOM, ALIGN_BASELINE\n" +
                "\n" +
                "问题：图片和同一行的文字不对齐，下一个demo会解决这个问题";
    }

    @Override
    protected Spannable getSpannable() {


        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test);
        return SpannableBuilder.from("abcdefghij\n1234567899999999999\nABCDEFGHIJ")
                .on("12345678", new ImageSpan(getActivity(), bitmap, ImageSpan.ALIGN_BOTTOM))
                .build();
    }

    @Override
    protected void onCreate2(View view, @Nullable Bundle bundle) {
        super.onCreate2(view, bundle);
    }
}
