package zhou.demo.spannable;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoSuperscriptSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "SuperscriptSpan";
    }

    @Override
    protected String getInfo() {
        return "SuperscriptSpan: 上标\n" +
                "SuperscriptSpan()\n" +
                "注意这里对上标还添加了文字大小缩小一半的效果";
    }

    @Override
    protected Spannable getSpannable() {
        tv_test.setTextSize(32);
        return SpannableBuilder.from("1002 = 10000")
                .on("2", new SuperscriptSpan())
                .on("2", new RelativeSizeSpan(0.5f))
                .build();
    }
}
