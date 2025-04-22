package FactoryPattern;

import FactoryPattern.documentprocessors.CustomDocumentProcessor;
import FactoryPattern.documentprocessors.DocumentProcesserFactory;


public class Client
{

	public static void main(String[] args)
	{

		DocumentProcessor wordProcessor = DocumentProcesserFactory.getDocumentProcessor("WORD");

		System.out.println(wordProcessor.hashCode());

		DocumentProcessor wordProcessor2 = DocumentProcesserFactory.getDocumentProcessor("WORD");

		System.out.println(wordProcessor2.hashCode());


		DocumentProcesserFactory.register("custom",CustomDocumentProcessor::new);

		System.out.println(DocumentProcesserFactory.getDocumentProcessor("custom").hashCode());
        System.out.println(DocumentProcesserFactory.getDocumentProcessor("custom").hashCode());


	}
}
