package zhou.demo.markdown;

import org.ayo.file.Files;

/**
 * Created by zhou on 16-10-22.
 */

public class TestMarkDownActivity extends BaseMarkdownPage {

    @Override
    protected String getText() {
        String test = Files.file.getContentFromAssets("hello.md");
        return test;
    }
}
