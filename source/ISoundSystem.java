import java.awt.Component;

public interface ISoundSystem {

   void create(int var1, int var2) throws Exception;

   int size(int var1);

   void write(int var1, int[] var2);

   void close(int var1);

   void create(Component var1, int var2, boolean var3) throws Exception;

   void flush(int var1);

}
