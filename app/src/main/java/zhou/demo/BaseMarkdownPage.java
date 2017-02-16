package zhou.demo;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.zzhoujay.markdown.MarkDown;

import org.ayo.component.MasterFragment;

import java.io.InputStream;

public abstract class BaseMarkdownPage extends MasterFragment {

    protected abstract String getText();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_markdown_2;
    }

    @Override
    protected void onCreate2(View view, @Nullable Bundle bundle) {

        final TextView textView = (TextView) findViewById(R.id.textView);
        assert textView != null;
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        final InputStream stream = getResources().openRawResource(R.raw.hello);

        textView.post(new Runnable() {
            @Override
            public void run() {
                long time = System.nanoTime();
                Spanned spanned = MarkDown.fromMarkdown(getText(), new Html.ImageGetter() {
                    @Override
                    public Drawable getDrawable(String source) {
                        Drawable drawable = new ColorDrawable(Color.LTGRAY);
                        drawable.setBounds(0, 0, textView.getWidth() - textView.getPaddingLeft() - textView.getPaddingRight(), 400);
                        return drawable;
                    }
                }, textView);
                long useTime = System.nanoTime() - time;
                Toast.makeText(getContext().getApplicationContext(), "use time:" + useTime, Toast.LENGTH_LONG).show();
                textView.setText(spanned);
            }
        });
    }

    @Override
    protected void onDestroy2() {

    }

    @Override
    protected void onPageVisibleChanged(boolean b, boolean b1, @Nullable Bundle bundle) {

    }
}
