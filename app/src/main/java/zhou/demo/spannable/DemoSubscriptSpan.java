package zhou.demo.spannable;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;
import android.text.style.SubscriptSpan;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoSubscriptSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "SubscriptSpan";
    }

    @Override
    protected String getInfo() {
        return "SubscriptSpan: 下标\n" +
                "SubscriptSpan()\n" +
                "注意这里对下标还添加了文字大小缩小一半的效果";
    }

    @Override
    protected Spannable getSpannable() {
        tv_test.setTextSize(32);
        return SpannableBuilder.from("H2O")
                .on("2", new SubscriptSpan())
                .on("2", new RelativeSizeSpan(0.5f))
                .build();
    }
}
