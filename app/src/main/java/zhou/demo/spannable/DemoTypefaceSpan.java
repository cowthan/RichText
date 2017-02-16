package zhou.demo.spannable;

import android.text.Spannable;
import android.text.style.TypefaceSpan;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoTypefaceSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "TypefaceSpan";
    }

    @Override
    protected String getInfo() {
        return "TypefaceSpan: 字体\n" +
                "- TypefaceSpan(String family)\n系统自带的SANS_SERIF、MONOSPACE和SERIF";
    }

    @Override
    protected Spannable getSpannable() {
        tv_test.setTextSize(32);
        return SpannableBuilder.from("abcd 默认字体\nMONOSPACE 中文\nSERIF 中文\nSANS_SERIF 中文\nSANS 中文")
                .on("MONOSPACE 中文",  new TypefaceSpan("MONOSPACE"))
                .on("SERIF 中文", new TypefaceSpan("SERIF"))
                .on("SANS_SERIF 中文", new TypefaceSpan("SANS_SERIF"))
                .on("SANS 中文", new TypefaceSpan("SANS"))
                .on("SANS 中文", new TypefaceSpan("SANS"))
                .build();
    }
}
