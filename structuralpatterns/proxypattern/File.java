package proxypattern;

public class File
{

	String name;
	String content;
	public File(String name)
	{
		this.name = name;
		this.content = null;
	}


	public void loadContent(String content) {
		this.content = content;
	}


	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "File{" + "content='" + content + '\'' + ", name='" + name + '\'' + '}';
	}
}
