public class NumberComponent extends Component {
    public NumberComponent() {
        super();
        addValidation(new NumberValidation());
    }

    public NumberComponent(String content) {
        super(content, new NumberValidation());
    }
}
