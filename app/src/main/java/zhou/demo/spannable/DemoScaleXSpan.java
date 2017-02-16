package zhou.demo.spannable;

import android.text.Spannable;
import android.text.style.ScaleXSpan;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoScaleXSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "ScaleXSpan";
    }

    @Override
    protected String getInfo() {
        return "ScaleXSpan\n横向缩放样式\n" +
                "ScaleXSpan(float proportion)：参数proportion，缩放比例\n";
    }

    @Override
    protected Spannable getSpannable() {
        tv_test.setTextSize(32);
        return SpannableBuilder.from("text size：20sp\ntext size: 30sp\ntext size: 16sp")
                .on("text size: 20sp", new ScaleXSpan(1.0f))
                .on("text size: 30sp", new ScaleXSpan(1.5f))
                .on("text size: 16sp", new ScaleXSpan(0.8f))
                .build();
    }
}
