/*
 * Copyright (C) 2015 José Manuel Pereira García.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package zhou.demo.awesome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import org.ayo.richtext.AwesomeTextHandler;

import zhou.demo.R;

public class AwesomeTextDemo extends AppCompatActivity {
    private static final String HASHTAG_PATTERN = "(#[\\p{L}0-9-_]+)";
    private static final String MENTION_PATTERN = "(@[\\p{L}0-9-_]+)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awesome_activity_main);

        TextView textView = (TextView) findViewById(R.id.textview);
        EditText editText = (EditText) findViewById(R.id.editText);

        AwesomeTextHandler awesomeTextViewHandler = new AwesomeTextHandler();
        awesomeTextViewHandler
                .addViewSpanRenderer(HASHTAG_PATTERN, new HashtagsSpanRenderer())
                .addViewSpanRenderer(MENTION_PATTERN, new MentionSpanRenderer())
                .setView(textView);

        AwesomeTextHandler awesomeEditTextHandler = new AwesomeTextHandler();
        awesomeEditTextHandler
                .addViewSpanRenderer(HASHTAG_PATTERN, new HashtagsSpanRenderer())
                .addViewSpanRenderer(MENTION_PATTERN, new MentionSpanRenderer())
                .setView(editText);
    }
}
