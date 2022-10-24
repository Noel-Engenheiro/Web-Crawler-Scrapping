package webCrawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

import java.util.List;

//Gustavo Fernandes dos Santos

public class WebCrawler {

	public static void main(String[] args) throws IOException {
		
		     Document doc =  Jsoup.connect("https://www.gov.br/ans/pt-br").get();
		     Element table = (Element) doc.getElementsByClass("cover-banner-tile tile-content").set(2, doc);
		     List<Element> ans = table.getElementsByTag("a");
		     ans.toString();
		     System.out.println(ans.toString());

		     Document docTiss =  Jsoup.connect("https://www.gov.br/ans/pt-br/assuntos/prestadores").get();
		     Element tableTiss = (Element) docTiss.getElementsByClass("titulo").set(3, docTiss);
		     List<Element> ansTiss = tableTiss.getElementsByTag("span");
		     ansTiss.toString();
		     System.out.println(ansTiss.toString());
		     
		     Document docMesAno =  Jsoup.connect("https://www.gov.br/ans/pt-br/assuntos/prestadores/padrao-para-troca-de-informacao-de-saude-suplementar-2013-tiss").get();
		     Element tableTissMesAno = (Element) docMesAno.getElementsByClass("callout").first();
		     List<Element> ansTissMesAno = tableTissMesAno.getElementsByTag("a");
		     ansTissMesAno.toString();
		     System.out.println(ansTissMesAno.toString());	
		     
				
		     String url = "https://www.gov.br/ans/pt-br/assuntos/prestadores/padrao-para-troca-de-informacao-de-saude-suplementar-2013-tiss/padrao-tiss-2013-setembro-2022";
		     Document doc1 = Jsoup.connect(url).get();
		     Element table1 = doc1.getElementsByClass("table table-bordered").first();
		     Element tbody = table1.getElementsByTag("tbody").first();
		     List<Element> documents = tbody.getElementsByTag("a");
		     documents.toString();
			 System.out.println(documents.toString());
			 
			
			    }
		    
}
