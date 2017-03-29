package javaschool.app;

/**
 * Created by JavaCourses on 29.03.2017..
 */
public class Note extends Record{
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + text  ;
    }
}
