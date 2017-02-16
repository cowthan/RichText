package zhou.demo.spannable;

import android.os.Parcel;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoAbsoluteSizeSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "AbsoluteSizeSpan";
    }

    @Override
    protected String getInfo() {
        return "AbsoluteSizeSpan是指绝对尺寸\n通过指定绝对尺寸来改变文本的字体大小\n" +
                "AbsoluteSizeSpan(int size)\n" +
                "AbsoluteSizeSpan(int size, boolean dip)： 参数2是true，则size就是dip大小\n" +
                "AbsoluteSizeSpan(Parcel src)";
    }

    @Override
    protected Spannable getSpannable() {
        Parcel p = Parcel.obtain();
        p.writeInt(29);//字体大小
        p.writeInt(8);//是否是dip单位
        p.setDataPosition(0);
        AbsoluteSizeSpan ass = new AbsoluteSizeSpan(p);

        ass = new AbsoluteSizeSpan(36, false);

        return SpannableBuilder.from("text size：13sp\ntext size: 36px\ntext size: 20dp")
                .on("text size: 36px", ass)
                .textSize("text size: 20dp", 20, true)
                .build();
    }
}
