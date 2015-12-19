import java.nio.ByteBuffer;

public class Class52_Sub1 extends Class52 {

	ByteBuffer aByteBuffer1315;

	byte[] method258(int var1) {
		byte[] var2 = new byte[this.aByteBuffer1315.capacity()];
		this.aByteBuffer1315.position(0);
		this.aByteBuffer1315.get(var2);
		return var2;
	}

	void method259(byte[] var1, int var2) {
		this.aByteBuffer1315 = ByteBuffer.allocateDirect(var1.length);
		this.aByteBuffer1315.position(0);
		this.aByteBuffer1315.put(var1);
	}

}
