package webCrawler;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Task3 {

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
	     
	     Document doc1 =  Jsoup.connect("https://www.gov.br/ans/pt-br/assuntos/prestadores/padrao-para-troca-de-informacao-de-saude-suplementar-2013-tiss/padrao-tiss-tabelas-relacionadas").get();
	     Element table1 = (Element) doc1.getElementsByClass("callout").set(0, doc1);
	     List<Element> ans1 = table1.getElementsByTag("a");
	     ans1.toString();
	     System.out.println(ans1.toString());
	}

}
