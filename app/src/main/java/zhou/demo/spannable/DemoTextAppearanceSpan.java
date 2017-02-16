package zhou.demo.spannable;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.TextAppearanceSpan;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoTextAppearanceSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "TextAppearanceSpan";
    }

    @Override
    protected String getInfo() {
        return "TextAppearanceSpan: 文本样式\n" +
                "- TextAppearanceSpan(Context context, int appearance)：引用的样式表，如R.style.my_style\n" +
                "- TextAppearanceSpan(Context context, int appearance, int colorList)：  colorList，使用方式未知，如果设置为小于0，则参数将不产生效果\n" +
                "- TextAppearanceSpan(String family, int style, int size,ColorStateList color, ColorStateList linkColor):\n" +
                "    - family，字体，仅支持系统自带的三种字体，MONOSPACE、SERIF和SANS\n" +
                "    - style，TypeFace中定义的字体样式，BOLD、ITALIC\n" +
                "    - size，字体大小\n" +
                "    - color，字体颜色\n" +
                "    - linkColor，使用方式未知";
    }

    @Override
    protected Spannable getSpannable() {
        tv_test.setTextSize(32);
        return SpannableBuilder.from("床前明月光，\n疑是地上霜，\n举头望明月，\n低头思故乡, \n低头思故乡aabccd, \n低头思故乡3")
                .on("疑是地上霜，", new TextAppearanceSpan("MONOSPACE", Typeface.NORMAL, 32, null, null))
                .on("举头望明月，", new TextAppearanceSpan("SANS_SERIF", Typeface.NORMAL, 32, null, null))
                .on("低头思故乡", new TextAppearanceSpan("SANS_SERIF", Typeface.BOLD, 32, null, null))
                .on("低头思故乡aabccd", new TextAppearanceSpan("SANS_SERIF", Typeface.ITALIC, 32, null, null))
                .on("低头思故乡3", new TextAppearanceSpan("SERIF", Typeface.NORMAL, 32, null, null))
                .build();
    }
}
