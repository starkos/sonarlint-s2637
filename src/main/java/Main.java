public class Main
{
	public static void main(String[] args)
	{
		var job = Job.builder()
			.name(null)
			.build();
		System.out.println(String.format("Built job \"%s\"", job.name()));
	}
}