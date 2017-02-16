package zhou.demo.spannable;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;

import org.ayo.component.MasterFragment;

import zhou.demo.R;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public abstract class BaseSpannablePage extends MasterFragment {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_spannable_base;
    }

    public static final String TEST_TEXT = "0123456789\nabcdefghij\nABCDEFGHIJ";

    protected abstract String getTitle();
    protected abstract String getInfo();
    protected abstract Spannable getSpannable();
    protected String getText(){
        return TEST_TEXT;
    }

    private TextView tv_title;
    private TextView tv_info;
    protected TextView tv_test;
    protected TextView tv_test2;

    @Override
    protected void onCreate2(View view, @Nullable Bundle bundle) {
        tv_title = id(R.id.tv_title);
        tv_info = id(R.id.tv_info);
        tv_test = id(R.id.tv_test);
        tv_test2 = id(R.id.tv_test2);

        tv_test2.setVisibility(View.GONE);
        tv_title.setText(getTitle());
        tv_info.setText(getInfo());
        tv_test.setText(getSpannable());
    }

    protected void showTest2(Spannable s){
        tv_test2.setVisibility(View.VISIBLE);
        tv_test2.setText(s);
    }

    @Override
    protected void onDestroy2() {

    }

    @Override
    protected void onPageVisibleChanged(boolean b, boolean b1, @Nullable Bundle bundle) {

    }
}
