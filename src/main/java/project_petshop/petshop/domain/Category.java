package project_petshop.petshop.domain;

public class Category {

    private int category_id;
    private String category_name;
    private boolean category_active;

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public boolean isCategory_active() {
        return category_active;
    }

    public void setCategory_active(boolean category_active) {
        this.category_active = category_active;
    }
}
