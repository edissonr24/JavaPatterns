package co.com.implementacion;

class WinFactory implements GUIFactory {
    public Button createButton() {
        return new WinButton();
    }
}

