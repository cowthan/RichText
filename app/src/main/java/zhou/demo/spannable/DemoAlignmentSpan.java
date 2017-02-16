package zhou.demo.spannable;

import android.text.Layout;
import android.text.Spannable;
import android.text.style.AlignmentSpan;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoAlignmentSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "AlignmentSpan.Standard";
    }

    @Override
    protected String getInfo() {
        return "AlignmentSpan.Standard(Layout.Alignment align)\n" +
                "标准文本对齐样式" +
                "Layout.Alignment\n" +
                "- ALIGN_CENTER：居中\n" +
                "- ALIGN_NORMAL：正常\n" +
                "- ALIGN_OPPOSITE：相反\n";
    }

    @Override
    protected Spannable getSpannable() {

        return SpannableBuilder.from("居中\n正常\n相反")
                .on("居中", new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER))
                .on("正常", new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL))
                .textAlign("相反", Layout.Alignment.ALIGN_OPPOSITE)
                .build();
    }
}
