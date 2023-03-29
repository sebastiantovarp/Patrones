package hmtlTagFinder;

public class Tag {

    private String tag;
    private int start;
    private int end;

    public Tag(String tag, int start, int end){
        this.tag = tag;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tag='" + tag + '\'' +
                ", Start Index=" + start +
                ", End Index=" + end +
                '}';
    }

    public String getTag() {
        return tag;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
