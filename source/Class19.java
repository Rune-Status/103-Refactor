public class Class19 implements Runnable {

   TaskManager aClass63_263;
   volatile AbstractSoundSystem[] aClass8Array264 = new AbstractSoundSystem[2];
   volatile boolean aBool265 = false;
   volatile boolean aBool266 = false;

   public void run() {
      this.aBool266 = true;

      try {
         try {
            while(!this.aBool265) {
               for(int var6 = 0; var6 < 2; var6++) {
                  AbstractSoundSystem var2 = this.aClass8Array264[var6];
                  if(var2 != null) {
                     var2.method82();
                  }
               }

               Class96_Sub1.sleep(10L);
               GraphicsStub.method935(this.aClass63_263, (Object)null);
            }
         } catch (Exception var61) {
            Class79.error((String)null, var61);
            this.aBool266 = false;
            return;
         }

         this.aBool266 = false;
      } finally {
         this.aBool266 = false;
      }
   }

}
