package FactoryPattern.documentprocessors;

import FactoryPattern.Document;
import FactoryPattern.DocumentProcessor;

public class PDFProcessor implements DocumentProcessor
{

	private PDFProcessor() {

	}

	static DocumentProcessor createInstance() {
		return new PDFProcessor();
	}

	@Override
	public void process(Document document)
	{
		System.out.println("Processing PDF");
	}
}
