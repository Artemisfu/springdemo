package pojo;

public class JuiceMaker {
    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    private Source source;

    public String makeJuice() {
        return "Daisy ordered a " + source.getFruit() + source.getSize();
    }

}
