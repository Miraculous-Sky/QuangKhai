public class TextComponent extends Component {
    public TextComponent() {
        super();
        addValidation(new TextValidation());
    }

    public TextComponent(String content) {
        super(content, new TextValidation());
    }

}
