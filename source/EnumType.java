public class EnumType extends DualNode {

   static AbstractIndex enum_ref;
   public int size = 0;
   public String defaultString = "null";
   public char keyType;
   public char valType;
   public int defaultInt;
   public int[] keys;
   public String[] stringVals;
   public int[] intVals;
   static NodeMap enums = new NodeMap(64);

   void decode(ByteBuf var1) {
      while(true) {
         int var2 = var1.getUByte();
         if(var2 == 0) {
            return;
         }

         this.method687(var1, var2);
      }
   }

   void method687(ByteBuf buffer, int opcode) {
      if(opcode == 1) {
         this.keyType = (char)buffer.getUByte();
      } else if(opcode == 2) {
         this.valType = (char)buffer.getUByte();
      } else if(opcode == 3) {
         this.defaultString = buffer.getString();
      } else if(opcode == 4) {
         this.defaultInt = buffer.getInt();
      } else {
         int index;
         if(opcode == 5) {
            this.size = buffer.getUShort();
            this.keys = new int[this.size];
            this.stringVals = new String[this.size];

            for(index = 0; index < this.size; index++) {
               this.keys[index] = buffer.getInt();
               this.stringVals[index] = buffer.getString();
            }
         } else if(opcode == 6) {
            this.size = buffer.getUShort();
            this.keys = new int[this.size];
            this.intVals = new int[this.size];

            for(index = 0; index < this.size; index++) {
               this.keys[index] = buffer.getInt();
               this.intVals[index] = buffer.getInt();
            }
         }
      }

   }

   static final boolean method688(char var0) {
      return var0 == 160 || var0 == 32 || var0 == 95 || var0 == 45;
   }

   public static void method689() {
      SpotAnimType.spotanims.method429();
      SpotAnimType.aClass106_1442.method429();
   }

   static final String method690(int var0) {
      String var1 = Integer.toString(var0);

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + Class35.aString387 + var1.substring(var2);
      }

      return var1.length() > 9 ? " " + Class48_Sub1.method545('\uff80') + var1.substring(0, var1.length() - 8) + "M" + " " + Class35.aString389 + var1 + Class35.aString392 + Class35.aString393 : (var1.length() > 6 ? " " + Class48_Sub1.method545(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + Class35.aString389 + var1 + Class35.aString392 + Class35.aString393 : " " + Class48_Sub1.method545(16776960) + var1 + Class35.aString393);
   }

   static final void method691(InterfaceNode var0, boolean var1) {
      int var2 = var0.type;
      int var3 = (int)var0.key;
      var0.unlink();
      if(var1) {
         Class53.method275(var2);
      }

      for(WidgetConfig var5 = (WidgetConfig)Client.widgetConfigs.method150(); var5 != null; var5 = (WidgetConfig)Client.widgetConfigs.method151()) {
         if((var5.key >> 48 & 0xffff) == (long)var2) {
            var5.unlink();
         }
      }

      Widget var51 = Class94.getWidget(var3);
      if(var51 != null) {
         Class68.method326(var51);
      }

      UnderlayType.method705();
      if(Client.anInt2226 != -1) {
         Class65.method319(Client.anInt2226, 1);
      }

   }

}
