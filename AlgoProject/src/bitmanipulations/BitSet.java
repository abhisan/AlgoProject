package bitmanipulations;

public class BitSet {

	public static Boolean get(int flags, int flagMask) {
		return flagMask == (flags & flagMask);
	}

	public static int update(int flags, int flagMask, Boolean value) {
		if (value) {
			if ((flags & flagMask) == flagMask)
				return flags; // Nothing to change
			// Don't use ^ since flagMask could be a combination of multiple
			// flags?????
			flags |= flagMask;
		} else {
			if ((flags & flagMask) == 0)
				return flags; // Nothing to change
			// Don't use ^ since flagMask could be a combination of multiple
			// flags????
			flags &= ~flagMask;
		}
		return flags;
	}

	public static void main(String s[]) {
		int i = 0;
		i = update(i, 4, true);
		System.out.println(i);

	}
}
