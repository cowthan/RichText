package zhou.demo.spannable;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.style.QuoteSpan;
import android.view.View;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoQuoteSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "DrawableMarginSpan";
    }

    @Override
    protected String getInfo() {
        return "QuoteSpan\n" +
                "引用样式，在文本左侧添加一条表示引用的竖线\n" +
                "- QuoteSpan()：无参构造，默认颜色为蓝色\n" +
                "- QuoteSpan(int color)：参数color，颜色值\n" +
                "- QuoteSpan(Parcel src)：包含颜色值信息的包装类";
    }

    @Override
    protected Spannable getSpannable() {

        return SpannableBuilder.from("abcdefghij\n12345678\nABCDEFGHIJ")
                .on("abcdefghij", new QuoteSpan(Color.MAGENTA))
                .build();
    }

    @Override
    protected void onCreate2(View view, @Nullable Bundle bundle) {
        super.onCreate2(view, bundle);
    }
}
