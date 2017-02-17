package zhou.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

import org.ayo.component.MasterFragment;
import org.ayo.richtext.htmlhandler.HtmlTagHandler;
import org.ayo.richtext.htmlhandler.SpanTagHandler;

/**
 * Created by Administrator on 2016/3/29.
 */
public class HtmlHandlerActivity extends MasterFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.ac_demo_html_tag;
    }

    @Override
    protected void onCreate2(View view, @Nullable Bundle bundle) {
        TextView tv_1 = (TextView) findViewById(R.id.tv_1);
        TextView tv_2 = (TextView) findViewById(R.id.tv_2);

        String content = "呵呵呵<span style=\"{color:#e60012}\">哈哈哈</span>嘿嘿嘿";

        //普通TextView
        tv_1.setText(Html.fromHtml(content));

        //使用自定义标签
        Spanned s = HtmlTagHandler.fromHtml(content, null, new SpanTagHandler());
        tv_2.setText(s);
    }

    @Override
    protected void onDestroy2() {

    }

    @Override
    protected void onPageVisibleChanged(boolean b, boolean b1, @Nullable Bundle bundle) {

    }
}

