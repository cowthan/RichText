package zhou.demo.spannable;

import android.graphics.Color;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoBackgroundColorSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "BackgroundColorSpan";
    }

    @Override
    protected String getInfo() {
        return "BackgroundColorSpan，背景色样式\n";
    }

    @Override
    protected Spannable getSpannable() {

        return SpannableBuilder.from("蓝色背景\n红色背景\n黄色背景")
                .on("蓝色背景", new BackgroundColorSpan(Color.BLUE))
                .on("红色背景", new BackgroundColorSpan(Color.RED))
                .background("黄色背景", Color.YELLOW)
                .build();
    }
}
