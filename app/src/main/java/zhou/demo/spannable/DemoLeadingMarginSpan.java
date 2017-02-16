package zhou.demo.spannable;

import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class DemoLeadingMarginSpan extends BaseSpannablePage {
    @Override
    protected String getTitle() {
        return "LeadingMarginSpan ";
    }

    @Override
    protected String getInfo() {
        return "LeadingMarginSpan.Standard：缩进效果 \n" +
                "LeadingMarginSpan.Standard(int arg0, int arg1)\n" +
                "- 参数1：首行缩进，px\n" +
                "- 参数2：其余行缩进，px" +
                "问题就是怎么计算两个文字的宽度px";
    }

    @Override
    protected Spannable getSpannable() {
        String s = "在中国经济进入新常态后，外贸出口已经基本饱和，拉动经济增长的主要动力来自投资和扩大内需，尤其是消费已成为目前我国经济稳增长的重要一环。国家统计局的数据显示，2016年，最终消费支出对经济增长的贡献率为64.6%，高于2015年4.9个百分点，高于2014年15.8个百分点。消费对经济增长的贡献率不断提高。";
          String s2 = "1234在中国经济进入新常态后，外贸出口2234已经基本饱和，拉动经济增长的主要动力来自投资和扩大内需，尤其是消费已成为目前我国经济稳增长的重要一环。国家统计局的数据显示，2016年，最终消费支出对经济增长的贡献率为64.6%，高于2015年4.9个百分点，高于2014年15.8个百分点。消费对经济增长的贡献率不断提高。";
        float lenOfTwoWord = getTextViewLength(tv_test, "俩字");
        return SpannableBuilder.from(s + "\n" + s2)
                .on(s, new LeadingMarginSpan.Standard(Math.round(lenOfTwoWord), 0))
                .firstLineLeading(s2, tv_test, 4)  ///参数3表示：a的个数，4个a就是aaaa，相当于汉字的缩进两个字
                .build();
    }

    public static float getTextViewLength(TextView textView, String text){
        TextPaint paint = textView.getPaint();
        // 得到使用该paint写上text的时候,像素为多少
        float textLength = paint.measureText(text);
        return textLength;
    }

}
