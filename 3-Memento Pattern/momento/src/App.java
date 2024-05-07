import memento.Editor;

public class App {
    public static void main(String[] args) throws Exception {
        Editor editor = new Editor();
        editor.setContent("this is a first content");
        editor.setContent("this is a second content");
        editor.setContent("this is a third content");
        editor.setContent("this is a fourth content");
        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());
    }
}
