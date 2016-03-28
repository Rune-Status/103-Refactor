public class Class102 {

   Class96 aClass96_756;
   Class96 aClass96_757 = new Class96();

   public Class96 method416() {
      Class96 var1 = this.aClass96_757.aClass96_743;
      if(this.aClass96_757 == var1) {
         this.aClass96_756 = null;
         return null;
      } else {
         this.aClass96_756 = var1.aClass96_743;
         return var1;
      }
   }

   public void method417(Class96 var1) {
      if(var1.aClass96_742 != null) {
         var1.method411();
      }

      var1.aClass96_742 = this.aClass96_757.aClass96_742;
      var1.aClass96_743 = this.aClass96_757;
      var1.aClass96_742.aClass96_743 = var1;
      var1.aClass96_743.aClass96_742 = var1;
   }

   public Class102() {
      this.aClass96_757.aClass96_743 = this.aClass96_757;
      this.aClass96_757.aClass96_742 = this.aClass96_757;
   }

   public Class96 method418() {
      Class96 var1 = this.aClass96_756;
      if(this.aClass96_757 == var1) {
         this.aClass96_756 = null;
         return null;
      } else {
         this.aClass96_756 = var1.aClass96_743;
         return var1;
      }
   }

}
