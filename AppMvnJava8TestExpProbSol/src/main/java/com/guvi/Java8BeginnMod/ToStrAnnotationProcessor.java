//package com.guvi.Java8BeginnMod;
//import static javax.lang.model.SourceVersion.RELEASE_8;
//import java.lang.annotation.Annotation;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//import javax.annotation.processing.AbstractProcessor;
//import javax.annotation.processing.RoundEnvironment;
//import javax.annotation.processing.SupportedAnnotationTypes;
//import javax.annotation.processing.SupportedSourceVersion;
//import javax.lang.model.element.Element;
//import javax.lang.model.element.ElementKind;
//import javax.lang.model.element.TypeElement;
//import javax.tools.Diagnostic;
//
//@SupportedAnnotationTypes("TestToStrData")
//@SupportedSourceVersion(RELEASE_8)
//public class ToStrAnnotationProcessor extends AbstractProcessor {
//	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
//		if (!roundEnv.processingOver()) {
//			Set<? extends Element> elements = roundEnv
//					.getElementsAnnotatedWith((Class<? extends Annotation>) ToStrAnnotationProcessor.class);
//
//			Iterator<? extends Element> iter = elements.iterator();
//			while (iter.hasNext()) {
//				Element element = iter.next();
//
//				if (element.getKind() != ElementKind.CLASS) {
//					error("@TestToStrData must prefix a class -- " + element + " is not a class");
//					continue;
//				}
//
//				List<? extends Element> subElements;
//				subElements = element.getEnclosedElements();
//				Iterator<? extends Element> iterChild = subElements.iterator();
//
//				boolean found = false;
//				while (iterChild.hasNext()) {
//					Element subElement = iterChild.next();
//
//					if (subElement.toString().equals("toStrData()")) {
//						found = true;
//						break;
//					}
//				}
//
//				if (!found)
//					error("toString() not overridden in class " + element);
//			}
//		}
//
//		return true;
//	}
//
//	void error(String msg) {
//		processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, msg);
//	}
//}