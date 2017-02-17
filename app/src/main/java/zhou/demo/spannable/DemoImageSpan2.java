package zhou.demo.spannable;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Spannable;

import com.zzhoujay.richtext.EmojiSpan;

import zhou.demo.R;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoImageSpan2 extends BaseSpannablePage {
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
                "\n";
    }

    @Override
    protected Spannable getSpannable() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test);
        return SpannableBuilder.from("abcdefghij1234567899999999999ABCDEFGHIJ")
                .on("12345678", new EmojiSpan(getActivity(), bitmap))
                .build();
    }
}
