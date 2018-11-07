package co.edu.usc.interacciones.dao.custom.model;

public class FlexDataList {

    private boolean contain;

    private String selected;

    private String original;

    private String keyword;


    public boolean isContain() {
        return contain;
    }

    public void setContain(boolean contain) {
        this.contain = contain;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "FlexDataList{" +
                "contain=" + contain +
                ", selected='" + selected + '\'' +
                ", original='" + original + '\'' +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
