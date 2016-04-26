import java.math.BigInteger;

public class Class40 {

	static int selectedItemIndex;
	static CacheIndex binaryIndex;
	static BigInteger loginExponent;
	static BigInteger loginModulus;

	static final void method222(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (IdentKitType.loadWidget(var0)) {
			Class96_Sub1.method505(Widget.interfaces[var0], -1, var1, var2, var3, var4, var5, var6);
		}

	}

	Class40() throws Throwable {
		throw new Error();
	}

	static {
		loginExponent = GameClient.rsps ? new BigInteger("2001", 32) : new BigInteger("10001", 16);
		loginModulus = GameClient.rsps
				? new BigInteger(
						"173aqofpkbrm59lk37l7bm3i1pn9ejcus2rps66eqdae1g2c45q2o0d6u7frcdvgck4cc9qercrld7mlahosqrbadd5dofe2mf1eh9l2od6c75h3fsv9pqa7ojh9i2hju9j5e684g9rad1d2kih6p2i4nttufnnod2ilf4q0tfgcenthld0lmra6g9bi5jpbef496ge9aivea87bv28q6dak2v5lfo783chjn0ipd1vh61f52maj8m6hj14fqrr23gsc9h33rfvug071cdupbuio5ef4hr8nhh8l1fvcb09nrijkbht2e5kjvbn2b6348pfvgihsogp50nrce8og25023554kk9kdph96jon2sias2phmifj8s7q79sh8p6iog220vf11l6gcbfd815r9bj9picdmif112od1d44cod4ptltap1gpgskj5ubf37igceubqfcfvcbntnmqdndfrhllj9kinn30sba5nhsvq1bofdgm462d8dpo17db7h0n6gl8tuf4vo9vga2jmi5ojorv9b2enubt51q91ebb8rhgkks63nlcn004qvsd6bekd1d88jpg870v475idctsn3ch1ee985b4cp0i4dc9gag5c2k4v79vldkdtdv5asut67tmgcmqi7lb6gu1vspe7u780balnpjj69m06bkshoivahj8ind3oounoni6cg8unmr1keud92v4d03p37u7imvdf1mkkn6ahc835fib4l7sjafv1jflvlagmmdt7ceibs70l8kvge5frkm00ccg27glbluo086ibmi8vibmjcn22ab73qd",
						32)
				: new BigInteger(
						"94408bc4ba7d5949a45a86bf2af7beaec3f1cb800afe35ed481a5b4b4ad62f5668e216e0fc6f1a6ec15faef4856a6dd57732e484ce97a1d65b5d9ad1da851a3e4424a07d5af14cfe33a0e444427c440f102b3faff492b5ac3972fa4c27461399fa5e53fd3787f3dfd3f4a91d4d9fd3a8bbeb908ddcccea2a3188e8eaaec639e9",
						16);
	}

}
