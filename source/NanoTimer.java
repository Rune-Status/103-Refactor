public class NanoTimer extends Timer {

   long nanoTime = System.nanoTime();

   void method321() {
      this.nanoTime = System.nanoTime();
   }

   int method322(int var1, int millis) {
      long nano = (long)millis * 1000000L;
      long elapsed = this.nanoTime - System.nanoTime();
      if(elapsed < nano) {
         elapsed = nano;
      }

      Class96_Sub1.sleep(elapsed / 1000000L);
      long current = System.nanoTime();

      int index;
      for(index = 0; index < 10 && (index < 1 || this.nanoTime < current); this.nanoTime += (long)var1 * 1000000L) {
         ++index;
      }

      if(this.nanoTime < current) {
         this.nanoTime = current;
      }

      return index;
   }

}
