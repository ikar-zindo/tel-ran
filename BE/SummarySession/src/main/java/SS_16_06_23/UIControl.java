package SS_16_06_23;

public class UIControl {
   private boolean isEnabled = false;

   public UIControl(boolean isEnabled) {
      this.isEnabled = isEnabled;
   }

   public void change() {
      isEnabled = !isEnabled;
   }

   public boolean isEnabled(){
      return isEnabled;
   }
}
