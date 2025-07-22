package enums;

public enum TopMenuEnum {
    D_B("דמי ביטוח"),
    M_Z("מיצוי זכויות"),

    K_V("קצבאות והטבות"),
    Y_K("יצירת קשר");

    private String TopMenu;
    TopMenuEnum(String topMenu) {
        this.TopMenu=topMenu;
    }

    public String getTopMenu() {
        return this.TopMenu;
    }
}
