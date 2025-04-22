package FactoryPattern.documentprocessors;

import FactoryPattern.Document;
import FactoryPattern.DocumentProcessor;

public class WordProcessor implements DocumentProcessor
{

	private WordProcessor() {

	}

	static DocumentProcessor createInstance() {
		return new WordProcessor();
	}

	@Override
	public void process(Document document)
	{
		System.out.println("Processing the word document");
	}

}
