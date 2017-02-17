package org.ayo.richtext.htmlhandler;

import android.graphics.Color;
import android.text.Editable;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;

import org.xml.sax.Attributes;

/**
 * 自定义标签解析类，处理：呵呵呵<span style="{color:#e60012}">哈哈哈</span>嘿嘿嘿
 * Created by Administrator on 2016/3/29.
 */
public class SpanStyleHandler extends HtmlTagHandler.AbstractTagHandler {

    private String fontColor = "";

    @Override
    protected Object parseAttrtoSpan(String tag, Attributes attrs) {
        for(int i = 0; i < attrs.getLength(); i++){
            if(attrs.getLocalName(i).equals("style")){
                //style={color:red}
                String style = attrs.getValue(i); //{color:#e60012}
                fontColor = style.replace("{", "").replace("}", "").replace("color", "").replace(":", "");
                return new ForegroundColorSpan(Color.parseColor(fontColor));
            }
        }
        return null;
    }

    @Override
    protected boolean isForTag(String tag) {
        return tag.equalsIgnoreCase("span");
    }
}