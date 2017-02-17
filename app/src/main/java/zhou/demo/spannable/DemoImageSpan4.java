package zhou.demo.spannable;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ImageSpan;

import java.util.HashMap;
import java.util.Map;

import zhou.demo.R;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoImageSpan4 extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "ImageSpan";
    }

    @Override
    protected String getInfo() {
        return "ImageSpan\n" +
                "mageSpan(Context context, Bitmap b, ImageSpan.ALIGN_BOTTOM)\n" +
                "- 参数2还可以是：Drawable, String uri, Uri, resouceId\n" +
                "- 参数3的值好像只有ALIGN_BOTTOM, ALIGN_BASELINE\n";
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
        tv_test.setTextSize(26);
        return SpannableBuilder.from("生气生气[angry]，又伤心伤心[sad]，但要微笑微笑[smile]，[love]")
                .on("[angry]", new ImageSpan(getEmojiDrawable("[angry]"))) //
                .on("[love]", new ImageSpan(getEmojiDrawable("[love]"))) //new EmojiSpan(getActivity(), emojiMap.get("[love]")))
                .on("[sad]", new ImageSpan(getEmojiDrawable("[sad]"))) //new EmojiSpan(getActivity(), emojiMap.get("[sad]")))
                .on("[smile]", new ImageSpan(getEmojiDrawable("[smile]"))) //new EmojiSpan(getActivity(), emojiMap.get("[smile]")))
                .build();
    }

    private Drawable getEmojiDrawable(String key){
        Drawable d = getResources().getDrawable(emojiMap.get(key));
        int textSize = (int)tv_test.getTextSize() + 2;
        d.setBounds(0, 0, textSize, textSize);
        return d;
    }

}
