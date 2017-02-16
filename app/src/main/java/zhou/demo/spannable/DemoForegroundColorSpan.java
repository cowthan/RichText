package zhou.demo.spannable;

import android.graphics.Color;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoForegroundColorSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "ForegroundColorSpan";
    }

    @Override
    protected String getInfo() {
        return "ForegroundColorSpan，文字颜色\n";
    }

    @Override
    protected Spannable getSpannable() {

        return SpannableBuilder.from("蓝色字体\n红色字体\n黄色字体")
                .on("蓝色字体", new ForegroundColorSpan(Color.BLUE))
                .on("红色字体", new ForegroundColorSpan(Color.RED))
                .textColor("黄色字体", Color.YELLOW)
                .build();
    }
}
