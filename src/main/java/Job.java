import static example.Preconditions.checkNotNull;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;


public class Job
{
	private final @NonNull String name;


	private Job(Builder builder)
	{
		this.name = builder.name;  //checkNotNull(builder.name, "Name must not be null");
	}


	public static class Builder
	{
		private @Nullable String name;


		public Job build()
		{
			return (new Job(this));
		}


		public Builder name(String name)
		{
			this.name = name;
			return (this);
		}
	}


	public static Builder builder()
	{
		return (new Builder());
	}


	public String name()
	{
		return (this.name);
	}
}
