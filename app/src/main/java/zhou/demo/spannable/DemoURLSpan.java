package zhou.demo.spannable;

import android.text.Spannable;
import android.text.style.URLSpan;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoURLSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "URLSpan ";
    }

    @Override
    protected String getInfo() {
        return "URLSpan : 可以打开一个链接\n" +
                "URLSpan(String url)\n";
    }

    @Override
    protected Spannable getSpannable() {
        tv_test.setTextSize(32);
        return SpannableBuilder.from("你可以去这里得到你想要的答案！")
                .on("这里", new URLSpan("http://www.baidu.com"))
                .build();
    }
}
