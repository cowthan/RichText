package zhou.demo.spannable;

import android.graphics.Color;
import android.text.Spannable;
import android.text.style.BulletSpan;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoBulletSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "BulletSpan";
    }

    @Override
    protected String getInfo() {
        return "BulletSpan\n类似于HTML中的<li>标签的圆点效果\n" +
                "- BulletSpan()：仅提供一个与文本颜色一致的符号\n" +
                "- BulletSpan(int gapWidth)：指定符号与文字的距离\n" +
                "- BulletSpan(int gapWidth,int color)\n" +
                "- BulletSpan(Parcel src)\n" +
                "\n" +
                "如果设置TextView的lineSpaceExtra，符号和文字可能会水平不对齐...";
    }

    @Override
    protected Spannable getSpannable() {

        return SpannableBuilder.from("abcdefghij\n12345678\nABCDEFGHIJ")
                .on("abcdefghij", new BulletSpan(20, Color.BLUE))
                .on("12345678", new BulletSpan())
                .bullet("ABCDEFGHIJ", 40, Color.MAGENTA)
                .build();
    }
}
