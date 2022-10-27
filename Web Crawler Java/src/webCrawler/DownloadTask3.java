import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class DownloadTask3 {

        public static void main(String[] args) throws IOException {

            URL url = new URL("https://www.gov.br/ans/pt-br/arquivos/assuntos/prestadores/padrao-para-troca-de-informacao-de-saude-suplementar-tiss/padrao-tiss-tabelas-relacionadas/padrao-tiss-tabela-erros-envio-para-ans-padrao-tiss-08022019.xlsx");
            File file = new File("Tabela de Erros.csv");

            InputStream is = url.openStream();
            FileOutputStream fos = new FileOutputStream(file);

            int bytes = 0;

            while ((bytes = is.read()) != -1) {
                fos.write(bytes);
            }

            is.close();

            fos.close();
        }


    }


