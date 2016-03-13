import java.nio.ByteBuffer;

public class DirectByteBuffer extends AbstractByteBuffer {

	ByteBuffer buffer;

	byte[] get() {
		byte[] bytes = new byte[this.buffer.capacity()];
		this.buffer.position(0);
		this.buffer.get(bytes);
		return bytes;
	}

	void put(byte[] bytes) {
		this.buffer = ByteBuffer.allocateDirect(bytes.length);
		this.buffer.position(0);
		this.buffer.put(bytes);
	}

}
