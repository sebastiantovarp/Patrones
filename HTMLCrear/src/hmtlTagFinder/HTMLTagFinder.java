package hmtlTagFinder;

import org.w3c.dom.html.HTMLLabelElement;

import java.util.ArrayList;

public class HTMLTagFinder implements TagFinder{

    private ArrayList<Tag> tagsList;

    public HTMLTagFinder(){
    }

    @Override
    public ArrayList<Tag> findTags(String text, String tag) {
        this.tagsList = new ArrayList<Tag>();
        int tagStartIndex = 0;
        int tagEndIndex = 0;
        int startIndex = 0;

        while ((tagStartIndex = text.indexOf("<" + tag, startIndex)) != -1) {
            tagEndIndex = text.indexOf("</" + tag + ">", tagStartIndex);
            this.tagsList.add(new Tag(tag, tagStartIndex+ tag.length() + 2, tagEndIndex));
            startIndex = tagEndIndex + tag.length() + 3;
        }

        return this.tagsList;
    }
}
