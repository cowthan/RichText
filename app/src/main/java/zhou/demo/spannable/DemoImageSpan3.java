package zhou.demo.spannable;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.view.View;

import com.zzhoujay.richtext.EmojiSpan;

import java.util.HashMap;
import java.util.Map;

import zhou.demo.R;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoImageSpan3 extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "ImageSpan";
    }

    @Override
    protected String getInfo() {
        return "ImageSpan\n" +
                "mageSpan(Context context, Bitmap b, ImageSpan.ALIGN_BOTTOM)\n" +
                "- 参数2还可以是：Drawable, String uri, Uri, resouceId\n" +
                "- 参数3的值好像只有ALIGN_BOTTOM, ALIGN_BASELINE\n" +
                "\n" +
                "问题：为什么顶部会空出一大块，这他娘的什么方案";
    }


    public static final Map<String, Integer> emojiMap = new HashMap<>();
    static{
        emojiMap.put("[angry]", R.drawable.emoji_angry);
        emojiMap.put("[love]", R.drawable.emoji_love_pink);
        emojiMap.put("[sad]", R.drawable.emoji_sad);
        emojiMap.put("[smile]", R.drawable.emoji_smile_yellow);
    }

    @Override
    protected Spannable getSpannable() {
        return SpannableBuilder.from("生气生气[angry]，又伤心伤心[sad]，但要微笑微笑[smile]，[love]")
                .on("[angry]", new EmojiSpan(getActivity(), emojiMap.get("[angry]")))
                .on("[love]", new EmojiSpan(getActivity(), emojiMap.get("[love]")))
                .on("[sad]", new EmojiSpan(getActivity(), emojiMap.get("[sad]")))
                .on("[smile]", new EmojiSpan(getActivity(), emojiMap.get("[smile]")))
                .build();
    }

    @Override
    protected void onCreate2(View view, @Nullable Bundle bundle) {
        super.onCreate2(view, bundle);
        showTest2(SpannableBuilder.from("伤心伤心[sad]")
                .on("[sad]", new EmojiSpan(getActivity(), emojiMap.get("[sad]")))
                .build());
    }
}
