package webCrawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
			
			String competencia;
			String publicacao;
			String vigencia;
	
			private static Element[] document;

			public Task2(String competencia, String publicacao, String vigencia) {
				
			this.competencia = competencia;
			this.publicacao = publicacao;
			this.vigencia = vigencia;
	}

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
				     Element tableTissMesAno = (Element) docMesAno.getElementsByClass("callout").set(1, docMesAno);
				     List<Element> ansTissMesAno = tableTissMesAno.getElementsByTag("a");
				     ansTissMesAno.toString();
				     System.out.println(ansTissMesAno.toString());			
				     
				     String url = "https://www.gov.br/ans/pt-br/assuntos/prestadores/padrao-para-troca-de-informacao-de-saude-suplementar-2013-tiss/padrao-tiss-historico-das-versoes-dos-componentes-do-padrao-tiss";
				     Document doc1 = Jsoup.connect(url).get();
				     Element table1 = doc1.getElementById("content-core");
				     Element tbody = table1.getElementsByTag("tbody").first();
				     List<Element> document = tbody.getElementsByTag("tr");
				     
				     List<Task2> tiss = new ArrayList<>();
				     
				     for (Element document1 : document) {
				    	 List<Element> atributes = document1.getElementsByTag("td");
				    	
				    	 Task2 task = new Task2(
				    		atributes.get(0).toString(),
				    		atributes.get(1).toString(),
				    		atributes.get(2).toString()
				    		
				    			 );
				    	 tiss.add(task);
				    	 
				    	 System.out.println(task.toString());
				    	 System.out.println(document.toString());
				    	 
				    	 
				     }
			 

	}

			public static Element[] getDocument() {
				return document;
			}

			public String getCompetencia() {
				return competencia;
			}

			public void setCompetencia(String competencia) {
				this.competencia = competencia;
			}

			public String getPublicacao() {
				return publicacao;
			}

			public void setPublicacao(String publicacao) {
				this.publicacao = publicacao;
			}

			public String getVigencia() {
				return vigencia;
			}

			public void setVigencia(String vigencia) {
				this.vigencia = vigencia;
			}

			public static void setDocument(Element[] document) {
				Task2.document = document;
			}
}

