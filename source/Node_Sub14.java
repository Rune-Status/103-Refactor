
public class Node_Sub14 extends Node {

	int anInt1376;
	int anInt1377;
	Node_Sub2_Sub1 aNode_Sub2_Sub1_1378;
	int anInt1379;
	int anInt1380;
	Class109 aClass109_1381;
	int anInt1382;
	int anInt1383;
	int anInt1384;
	int anInt1385;
	int anInt1386;
	Node_Sub12 aNode_Sub12_1387;
	int anInt1388;
	int anInt1389;
	int anInt1390;
	int anInt1391;
	int anInt1392;
	int anInt1393;
	Node_Sub4_Sub2 aNode_Sub4_Sub2_1394;
	int anInt1395;
	int anInt1396;

	void method575() {
		this.aNode_Sub12_1387 = null;
		this.aNode_Sub2_Sub1_1378 = null;
		this.aClass109_1381 = null;
		this.aNode_Sub4_Sub2_1394 = null;
	}

	public static int method576(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

}
