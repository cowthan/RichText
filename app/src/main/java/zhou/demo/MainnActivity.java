package zhou.demo;

import android.os.Bundle;

import org.ayo.sample.menu.Leaf;
import org.ayo.sample.menu.MainPagerActivity;
import org.ayo.sample.menu.Menu;
import org.ayo.sample.menu.MenuItem;

import java.util.ArrayList;
import java.util.List;

import zhou.demo.awesome.AwesomeTextDemo;
import zhou.demo.markdown.TestMarkDownActivity;
import zhou.demo.markdown.TestMarkdownActivity2;
import zhou.demo.markdown.TestMarkdownActivity3;
import zhou.demo.markdown.TestMarkdownActivity4;
import zhou.demo.markdown.TestMarkdownActivity5;
import zhou.demo.markdown.TestMarkdownActivity6;
import zhou.demo.markdown.TestMarkdownActivity7;
import zhou.demo.spannable.DemoAbsoluteSizeSpan;
import zhou.demo.spannable.DemoAlignmentSpan;
import zhou.demo.spannable.DemoBackgroundColorSpan;
import zhou.demo.spannable.DemoBulletSpan;
import zhou.demo.spannable.DemoDrawableMarginSpan;
import zhou.demo.spannable.DemoForegroundColorSpan;
import zhou.demo.spannable.DemoIconMarginSpan;
import zhou.demo.spannable.DemoImageSpan;
import zhou.demo.spannable.DemoImageSpan2;
import zhou.demo.spannable.DemoImageSpan3;
import zhou.demo.spannable.DemoImageSpan4;
import zhou.demo.spannable.DemoLeadingMarginSpan;
import zhou.demo.spannable.DemoMaskFilterSpan;
import zhou.demo.spannable.DemoQuoteSpan;
import zhou.demo.spannable.DemoRelativeSizeSpan;
import zhou.demo.spannable.DemoScaleXSpan;
import zhou.demo.spannable.DemoStrikethroughSpan;
import zhou.demo.spannable.DemoSubscriptSpan;
import zhou.demo.spannable.DemoSuperscriptSpan;
import zhou.demo.spannable.DemoTextAppearanceSpan;
import zhou.demo.spannable.DemoTypefaceSpan;
import zhou.demo.spannable.DemoURLSpan;
import zhou.demo.spannable.DemoUnderlineSpan;
import zhou.demo.spannable2.SpannableTestActivity;

public class MainnActivity extends MainPagerActivity {

    private List<Menu> menus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        init();
        super.onCreate(savedInstanceState);
    }

    private void init(){
        menus = new ArrayList<>();

        ///--------------------------菜单
        Menu m = new Menu("Markdown", R.drawable.weixin_normal, R.drawable.weixin_pressed);
        menus.add(m);
        {
            MenuItem menuItem = new MenuItem("demo", R.drawable.weixin_normal, R.drawable.weixin_pressed);
            m.addMenuItem(menuItem);
            {
                menuItem.addLeaf(new Leaf("MarkDown", "", RichMarkDownActivity.class, 1));
                menuItem.addLeaf(new Leaf("MarkDown--from assets", "", TestMarkDownActivity.class));
                menuItem.addLeaf(new Leaf("MarkDown--R.raw.dy", "", TestMarkdownActivity2.class));
                menuItem.addLeaf(new Leaf("MarkDown--R.raw.hello", "", TestMarkdownActivity3.class));
                menuItem.addLeaf(new Leaf("MarkDown--R.raw.mark", "", TestMarkdownActivity4.class));
                menuItem.addLeaf(new Leaf("MarkDown--R.raw.sof", "", TestMarkdownActivity5.class));
                menuItem.addLeaf(new Leaf("MarkDown--R.raw.test", "", TestMarkdownActivity6.class));
                menuItem.addLeaf(new Leaf("MarkDown--R.raw.tt", "", TestMarkdownActivity7.class));
            }

        }

        m = new Menu("RichText", R.drawable.weixin_normal, R.drawable.weixin_pressed);
        menus.add(m);
        {
            MenuItem menuItem = new MenuItem("demo", R.drawable.weixin_normal, R.drawable.weixin_pressed);
            m.addMenuItem(menuItem);
            {
                menuItem.addLeaf(new Leaf("Html", "", RichHtmlActivity.class, 1));
                menuItem.addLeaf(new Leaf("gif", "", GifActivity.class, 1));
                menuItem.addLeaf(new Leaf("ListView", "", ListViewActivity.class, 1));
                menuItem.addLeaf(new Leaf("RecyclerView", "", RecyclerViewActivity.class, 1));
                menuItem.addLeaf(new Leaf("Test", "", TestActivity.class, 1));
            }

        }

        m = new Menu("Spannable", R.drawable.weixin_normal, R.drawable.weixin_pressed);
        menus.add(m);
        {
            MenuItem menuItem = new MenuItem("demo", R.drawable.weixin_normal, R.drawable.weixin_pressed);
            m.addMenuItem(menuItem);
            {
                menuItem.addLeaf(new Leaf("AbsoluteSizeSpan：字体大小", "", DemoAbsoluteSizeSpan.class));
                menuItem.addLeaf(new Leaf("RelativeSizeSpan：字体大小", "", DemoRelativeSizeSpan.class));
                menuItem.addLeaf(new Leaf("ScaleXSpan：字体大小,横向缩放样式", "", DemoScaleXSpan.class));
                menuItem.addLeaf(new Leaf("ForegroundColorSpan：字体颜色", "", DemoForegroundColorSpan.class));
                menuItem.addLeaf(new Leaf("BackgroundColorSpan：背景颜色", "", DemoBackgroundColorSpan.class));
                menuItem.addLeaf(new Leaf("AlignmentSpan.Standard：控制文本对齐样式", "", DemoAlignmentSpan.class));
                menuItem.addLeaf(new Leaf("BulletSpan：列表符号", "", DemoBulletSpan.class));
                menuItem.addLeaf(new Leaf("LeadingMarginSpan.Standard：文本缩进", "", DemoLeadingMarginSpan.class));
                menuItem.addLeaf(new Leaf("QuoteSpan：引用样式", "", DemoQuoteSpan.class));
                menuItem.addLeaf(new Leaf("StrikethroughSpan：删除线", "", DemoStrikethroughSpan.class));
                menuItem.addLeaf(new Leaf("UnderlineSpan：下划线", "", DemoUnderlineSpan.class));
                menuItem.addLeaf(new Leaf("SubscriptSpan：下标", "", DemoSubscriptSpan.class));
                menuItem.addLeaf(new Leaf("SuperscriptSpan：上标", "", DemoSuperscriptSpan.class));
                menuItem.addLeaf(new Leaf("TextAppearanceSpan：文本样式", "", DemoTextAppearanceSpan.class));
                menuItem.addLeaf(new Leaf("TypefaceSpan：字体", "", DemoTypefaceSpan.class));
                menuItem.addLeaf(new Leaf("DrawableMarginSpan：图片 + 文字", "", DemoDrawableMarginSpan.class));
                menuItem.addLeaf(new Leaf("IconMarginSpan：图片 + 文字", "", DemoIconMarginSpan.class));
                menuItem.addLeaf(new Leaf("MaskFilterSpan：滤镜（BlurMaskFilter：模糊），不支持硬件加速", "", DemoMaskFilterSpan.class));
                menuItem.addLeaf(new Leaf("URLSpan：超链接", "", DemoURLSpan.class));
                menuItem.addLeaf(new Leaf("ImageSpan：文本中插入图片", "", DemoImageSpan.class));
                menuItem.addLeaf(new Leaf("ImageSpan：文字 + 表情，图文混排居中", "", DemoImageSpan2.class));
                menuItem.addLeaf(new Leaf("ImageSpan：文字 + 表情，图文混排居中", "", DemoImageSpan3.class));
                menuItem.addLeaf(new Leaf("ImageSpan：文字 + 表情，这才对", "", DemoImageSpan4.class));
                menuItem.addLeaf(new Leaf("进阶demo，拷别人的", "", SpannableTestActivity.class, 1));
            }

            menuItem = new MenuItem("AwesomeText", R.drawable.weixin_normal, R.drawable.weixin_pressed);
            m.addMenuItem(menuItem);
            {
                menuItem.addLeaf(new Leaf("demo", "", AwesomeTextDemo.class, 1));
            }

            menuItem = new MenuItem("HtmlTagHandler", R.drawable.weixin_normal, R.drawable.weixin_pressed);
            m.addMenuItem(menuItem);
            {
                menuItem.addLeaf(new Leaf("demo", "", HtmlHandlerActivity.class));
            }

        }
        /////menu finished
    }

    @Override
    public List<Menu> getMenus() {
        return menus;
    }
}
