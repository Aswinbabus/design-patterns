package FactoryPattern.documentprocessors;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

import FactoryPattern.DocumentProcessor;

public class DocumentProcesserFactory
{


	private static final Map<String, DocumentProcessor> processorMap = new ConcurrentHashMap<>();

	private static final Map<String, Supplier<DocumentProcessor>> processorRegister = new ConcurrentHashMap<>();


	static {

		processorRegister.put("WORD",WordProcessor::createInstance);
		processorRegister.put("HTML",HtmlProcessor::createInstance);
		processorRegister.put("PDF",PDFProcessor::createInstance);
	}



	public static DocumentProcessor getDocumentProcessor(String documentProcessorType) {

		return processorMap.computeIfAbsent(documentProcessorType,DocumentProcesserFactory::createInstance);

	}

	public static void register(String type,Supplier<DocumentProcessor> documentProcessorSupplier) {

		processorRegister.putIfAbsent(type,documentProcessorSupplier);

	}

	public static DocumentProcessor createInstance(String documentProcessorType) {

		return processorRegister.get(documentProcessorType).get();

	}


}
