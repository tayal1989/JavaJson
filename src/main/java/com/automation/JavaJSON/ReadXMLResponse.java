package com.automation.JavaJSON;

import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

public class ReadXMLResponse {
	
	public static void main(String[] args) {
		ReadXMLResponse xml = new ReadXMLResponse();
		String response = "<response><lst name=\"responseHeader\"><bool name=\"zkConnected\">true</bool><int name=\"status\">0</int><int name=\"QTime\">136</int></lst><result name=\"response\" numFound=\"67655\" start=\"0\" maxScore=\"1.0\"/><lst name=\"facet_counts\"><lst name=\"facet_queries\"/><lst name=\"facet_fields\"><lst name=\"Price\"><int name=\"80.0\">1</int><int name=\"100.0\">9</int><int name=\"111.0\">1</int><int name=\"200.0\">20</int><int name=\"266000.0\">1</int><int name=\"350000.0\">1</int></lst><lst name=\"PriceFacet\"><int name=\"0\">11</int><int name=\"200\">39</int><int name=\"500\">12</int><int name=\"1000\">11</int><int name=\"1500\">11</int><int name=\"2000\">13</int><int name=\"2500\">10</int><int name=\"3000\">9</int><int name=\"4000\">10</int><int name=\"5000\">14</int><int name=\"6000\">13</int><int name=\"8000\">165</int><int name=\"10000\">1059</int><int name=\"12000\">293</int><int name=\"14000\">851</int><int name=\"15000\">6613</int><int name=\"20000\">4419</int><int name=\"25000\">35241</int><int name=\"30000\">18016</int><int name=\"40000\">757</int><int name=\"50000\">47</int><int name=\"75000\">29</int><int name=\"100000\">12</int></lst><lst name=\"Brand\"><int name=\"2\">1</int><int name=\"ASUS\">1</int><int name=\"Adidas-123\">17</int><int name=\"Adolfo\">39</int><int name=\"Airtel New\">12</int><int name=\"Alpine Star\">9</int><int name=\"American Dream\">40</int><int name=\"Amzer\">1</int><int name=\"Antonio\">1</int><int name=\"Apple\">314</int><int name=\"Apple1\">2</int><int name=\"Apple10\">1</int><int name=\"Apple11\">1</int><int name=\"Apple15\">1</int><int name=\"Apple16\">1</int><int name=\"Apple18\">1</int><int name=\"Apple2\">1</int><int name=\"Apple24\">1</int><int name=\"Apple26\">1</int><int name=\"Apple27\">1</int><int name=\"Apple28\">1</int><int name=\"Apple29\">1</int><int name=\"Apple3\">1</int><int name=\"Apple30\">1</int><int name=\"Apple5\">1</int><int name=\"Apple6\">1</int><int name=\"Apple7\">1</int><int name=\"Apple8\">1</int><int name=\"Apple9\">1</int><int name=\"Aura\">4</int><int name=\"Bajaj\">1</int><int name=\"Battlefield\">13</int><int name=\"Bottles\">5</int><int name=\"Cannon Publishing Group\">2</int><int name=\"Canon.canon\">26331</int><int name=\"Dell\">16</int><int name=\"Est1Brand\">8</int><int name=\"EstBrand2\">9</int><int name=\"HP\">16282</int><int name=\"HP Books\">13028</int><int name=\"HTC\">3</int><int name=\"INTEX\">332</int><int name=\"Klaxcar\">8</int><int name=\"LG\">78</int><int name=\"Liboni\">11</int><int name=\"MSI\">1</int><int name=\"Microsoft\">1</int><int name=\"New Brand on Staging_edited\">1</int><int name=\"Nikon\">592</int><int name=\"Nikon Salsa\">1</int><int name=\"Nippon\">1</int><int name=\"Nokia\">54</int><int name=\"Orion\">1</int><int name=\"PC-50X Family\">14</int><int name=\"Perfume Shop\">2</int><int name=\"Philips\">1</int><int name=\"Philips Odyssey\">23</int><int name=\"Pioneer\">8</int><int name=\"REDEX\">13</int><int name=\"Reebok\">4</int><int name=\"Reedy Press\">3</int><int name=\"Remanika\">22</int><int name=\"Sonic\">1</int><int name=\"Sony\">97</int><int name=\"Sony Ericsson\">1</int><int name=\"Telstar\">20</int><int name=\"Textar\">19</int><int name=\"Xbox\">8</int><int name=\"djbrand\">1</int><int name=\"regressionPhaseV\">6</int><int name=\"samsung\">10134</int><int name=\"sunny179\">1</int><int name=\"sunny180\">1</int><int name=\"sunny181\">24</int><int name=\"sunny187\">1</int><int name=\"sunny196\">2</int><int name=\"sunny373\">2</int><int name=\"sunny374\">1</int><int name=\"sunny375\">1</int><int name=\"sunny376\">2</int><int name=\"sunny377\">3</int><int name=\"sunny380\">2</int></lst></lst><lst name=\"facet_ranges\"><lst name=\"discount\"><lst name=\"counts\"><int name=\"0.0\">22397</int><int name=\"10.0\">8916</int><int name=\"20.0\">25491</int><int name=\"30.0\">3880</int><int name=\"40.0\">5641</int><int name=\"50.0\">1030</int><int name=\"60.0\">71</int><int name=\"70.0\">4</int><int name=\"90.0\">1</int></lst><double name=\"gap\">10.0</double><double name=\"start\">0.0</double><double name=\"end\">100.0</double></lst></lst><lst name=\"facet_intervals\"/><lst name=\"facet_heatmaps\"/></lst></response>";
		xml.readDOMParser(response);
	}

	public void readDOMParser(String response) {
		try {
			// Get Document Builder
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			// Build Document
			Document document = builder.parse(new InputSource(new StringReader(response.toString())));

			// Normalize the XML Structure
			document.getDocumentElement().normalize();

			// Get all docs
			NodeList nList = document.getElementsByTagName("lst");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				// System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println(eElement.getAttribute("name"));
					int filterLength = eElement.getChildNodes().getLength();
					if(eElement.getAttribute("name").equalsIgnoreCase("Brand")) {
						for(int i = 0 ; i < filterLength ; i++) {
							// System.out.println(eElement.getChildNodes().item(i).getTextContent());
							// System.out.println(eElement.getChildNodes().item(i).getAttributes().getNamedItem("name"));
							System.out.println(eElement.getChildNodes().item(i).getAttributes().getNamedItem("name").getTextContent());
						}
					}
				}
			}			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

