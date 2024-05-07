package memento;

import java.util.ArrayList;

public class Editor {
    private String content;
    private ArrayList<String> history = new ArrayList<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        history.add(this.content);
        this.content = content;
    }

    public void undo() {
        if (history.size() > 0) {
            this.content = history.get(history.size() - 1);
            history.remove(history.size() - 1);
        }
    }

}
