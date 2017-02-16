package zhou.demo;

import org.ayo.lang.Strings;

public class TestMarkdownActivity2 extends BaseMarkdownPage {

    @Override
    protected String getText() {
        return Strings.fromStream(getResources().openRawResource(R.raw.dy));
    }
}
