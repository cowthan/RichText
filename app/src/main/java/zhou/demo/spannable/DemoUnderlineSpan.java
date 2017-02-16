package zhou.demo.spannable;

import android.text.Spannable;
import android.text.style.UnderlineSpan;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoUnderlineSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "UnderlineSpan ";
    }

    @Override
    protected String getInfo() {
        return "UnderlineSpan : 下划线\n" +
                "UnderlineSpan()\n";
    }

    @Override
    protected Spannable getSpannable() {
        tv_test.setTextSize(32);
        return SpannableBuilder.from("本段文字是重点了！")
                .on("重点", new UnderlineSpan())
                .build();
    }
}
