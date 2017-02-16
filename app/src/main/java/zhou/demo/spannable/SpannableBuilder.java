package zhou.demo.spannable;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.BulletSpan;
import android.text.style.DrawableMarginSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.IconMarginSpan;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class SpannableBuilder {

    private String src;
    //private TextView textView;

    private SpannableBuilder(){

    }

    public static SpannableBuilder from(String src){
        SpannableBuilder sb = new SpannableBuilder();
        sb.src = src;
        return sb;
    }

    public Spannable build(){
        Spannable spn = new SpannableString(src);

        for(StyleInfo styleInfo: spans){
            int start = src.indexOf(styleInfo.dest);
            if(start == -1){

            }else{
                int end = start + styleInfo.dest.length();
                spn.setSpan(styleInfo.style, start, end, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
            }
        }

        return spn;
    }



    ///-----------
    private static class StyleInfo{
        String dest;
        Object style;
        StyleInfo(String dest, Object style){
            this.dest = dest;
            this.style = style;
        }
    }
    private List<StyleInfo> spans = new ArrayList<>();

    public SpannableBuilder on(String dest, Object style){
        spans.add(new StyleInfo(dest, style));
        return this;
    }
    ////////////////////

    public SpannableBuilder textSize(String dest, int size, boolean isDip){
        AbsoluteSizeSpan ass = new AbsoluteSizeSpan(size, isDip);
        return on(dest, ass);
    }

    public SpannableBuilder textAlign(String dest, Layout.Alignment alignment){
        AlignmentSpan.Standard s = new AlignmentSpan.Standard(alignment);
        return on(dest, s);
    }

    public SpannableBuilder background(String dest, int color) {
        BackgroundColorSpan s = new BackgroundColorSpan(color);
        return on(dest, s);
    }

    public SpannableBuilder textColor(String dest, int color) {
        ForegroundColorSpan s = new ForegroundColorSpan(color);
        return on(dest, s);
    }

    public SpannableBuilder bullet(String dest, int  gapWidth, int color) {
        BulletSpan s = new BulletSpan(gapWidth, color);
        return on(dest, s);
    }

    public SpannableBuilder drawable(String dest, Drawable drawable, int size) {
        DrawableMarginSpan s = new DrawableMarginSpan(drawable, size);
        return on(dest, s);
    }
    public SpannableBuilder icon(String dest, Bitmap drawable, int size) {
        IconMarginSpan s = new IconMarginSpan(drawable, size);
        return on(dest, s);
    }
    public SpannableBuilder leading(String dest, int lenFirstLine, int lenRemainLines) {
        LeadingMarginSpan.Standard s = new LeadingMarginSpan.Standard(lenFirstLine, lenRemainLines);
        return on(dest, s);
    }
    public SpannableBuilder firstLineLeading(String dest, TextView tv, int countOfa) {
        LeadingMarginSpan.Standard s = new LeadingMarginSpan.Standard(Math.round(getTextViewLength(tv, getRepeatString("a", countOfa))), 0);
        return on(dest, s);
    }
    // 计算出该TextView中文字的长度(像素)
    public static float getTextViewLength(TextView textView, String text){
        TextPaint paint = textView.getPaint();
        // 得到使用该paint写上text的时候,像素为多少
        float textLength = paint.measureText(text);
        return textLength;
    }

    private static String getRepeatString(String s, int repeatCount){
        if(repeatCount == 0)  return "";
        if(repeatCount == 1) return s;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < repeatCount; i++){
            sb.append(s);
        }
        return sb.toString();
    }
}
