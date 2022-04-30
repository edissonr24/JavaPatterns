package co.com.implementacion;

public class OSXFactory implements GUIFactory {
    public Button createButton() {
        return new OSXButton();
    }
}

