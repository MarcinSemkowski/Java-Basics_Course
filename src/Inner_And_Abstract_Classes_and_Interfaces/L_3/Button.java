package Inner_And_Abstract_Classes_and_Interfaces.L_3;

public class Button {
private String title;
private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
    public void onClick(){
        this.onClickListener.onClick(this.title);
    }
    public interface OnClickListener{
        public void onClick(String title);
    }
}
