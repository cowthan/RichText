package zhou.demo.spannable;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoRelativeSizeSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "RelativeSizeSpan";
    }

    @Override
    protected String getInfo() {
        return "RelativeSizeSpan\n相对尺寸，textSize是几，如16sp，1f就是16sp\n" +
                "RelativeSizeSpan(float proportion)：这个参数是倍数，如果是2，则显示32sp\n";
    }

    @Override
    protected Spannable getSpannable() {

        return SpannableBuilder.from("text size：13sp\ntext size: 26sp\ntext size: 39sp")
                .on("text size: 13sp", new RelativeSizeSpan(1.0f))
                .on("text size: 26sp", new RelativeSizeSpan(2.0f))
                .on("text size: 39sp", new RelativeSizeSpan(3.0f))
                .build();
    }
}
