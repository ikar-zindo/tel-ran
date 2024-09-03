package SS_16_06_23;

public class TextBox extends UIControl{
   private String text;


   public TextBox(String text) {
      super(false);
      this.text = text;
   }

   public String getText() {
      return text;
   }

   public void setText(String text) {
      this.text = text;
   }

   public void clear() {
      text = "";
   }
}
