import java.util.ArrayList;

public class Component {
    protected ArrayList<Validation> validations = new ArrayList<>();
    protected String content;

    public Component() {
    }

    public Component(String content, Validation validation) {
        this.content = content;
        this.validations.add(validation);
    }

    public void addValidation(Validation validation) {
        this.validations.add(validation);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean validate() {
        for (Validation validation : validations) {
            if (!validation.validate(content)) return false;
        }
        return true;
    }
}
