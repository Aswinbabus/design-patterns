package CommandPattern;


public interface Command
{
	void execute();
	default boolean isAsync() {
		return false;
	}
}
