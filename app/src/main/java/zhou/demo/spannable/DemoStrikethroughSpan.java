package zhou.demo.spannable;

import android.text.Spannable;
import android.text.style.StrikethroughSpan;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoStrikethroughSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "StrikethroughSpan ";
    }

    @Override
    protected String getInfo() {
        return "StrikethroughSpan : 删除线\n" +
                "StrikethroughSpan()\n";
    }

    @Override
    protected Spannable getSpannable() {
        tv_test.setTextSize(32);
        return SpannableBuilder.from("本段文字要被删除了！")
                .on("本段文字", new StrikethroughSpan())
                .build();
    }
}
