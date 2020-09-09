package com.blazedemo.readxlsxfileutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXMLTestData {

	public ReadXMLTestData() throws FileNotFoundException, SAXException, IOException {

	}

	public NodeList getNodes(String ScnName)
			throws XPathExpressionException, SAXException, IOException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		
		String xmlPath = System.getProperty("user.dir")+ "\\src\\test\\resources\\XMLData\\TestData.xml";
		Document document = builder.parse(new FileInputStream(xmlPath));
		document.normalize();
		
		//Document xmlDocument = builder.parse(new ByteArrayInputStream(xml.getBytes()));
		XPath xPath = XPathFactory.newInstance().newXPath();
		String expression = "/Project/Test_Suite/Test_Case[@id='" + ScnName + "']";

		Node node = (Node) xPath.compile(expression).evaluate(document, XPathConstants.NODE);
		NodeList nodeList = null;
		if (null != node) {
			nodeList = node.getChildNodes();
			
		}
		return nodeList;
	}


}
