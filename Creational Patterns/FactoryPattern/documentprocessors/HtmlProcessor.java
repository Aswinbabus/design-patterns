package FactoryPattern.documentprocessors;

import FactoryPattern.Document;
import FactoryPattern.DocumentProcessor;

public class HtmlProcessor implements DocumentProcessor
{

	private HtmlProcessor() {

	}

	static DocumentProcessor createInstance() {
		return new HtmlProcessor();
	}
	@Override
	public void process(Document document)
	{
		System.out.println("Processing Html Document");
	}
}
