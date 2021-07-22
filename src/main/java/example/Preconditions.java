package example;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public class Preconditions
{
	private Preconditions()
	{ }


	public static <T> @NonNull T checkNotNull(@Nullable T value, String message)
	{
		if (value == null)
			throw new NullPointerException(message);
		return (value);
	}
}
