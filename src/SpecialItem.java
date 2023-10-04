public class SpecialItem {

    private String item;

    private String textColor;

    private int delay;

    public SpecialItem(String item, String textColor, int delay){
this.item = item;
this.delay = Math.max(1,delay);
 setTextColor(textColor);
    }

    public String getItem() {
        return item;
    }

    public String getTextColor() {
        return textColor;
    }

    public int getDelay() {
        return delay;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }
}
