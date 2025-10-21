public class ArattaiGrowthTracker {

    // Fabricio Henrique Alves da Silva 32520994


    public static void main(String[] args) {
      
        int[] downloadsDiarios = {850000, 1050000, 1100000, 950000, 1200000, 1000000, 850000};

       
        String[] diasDaSemana = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sáb"};

        System.out.println("--- Arattai Growth Tracker - Análise Semanal ---");
        System.out.println("Dados iniciais (Downloads Diários): [850000, 1050000, 1100000, 950000, 1200000, 1000000, 850000]");
        System.out.println("----------------------------------------------");

   
        long totalDownloads = 0; 
        
        
        for (int downloads : downloadsDiarios) {
            totalDownloads += downloads;
        }

   
        String totalFormatado = String.format("%,d", totalDownloads).replace(",", ".");
        
        System.out.println("Total de Downloads na Semana: " + totalFormatado);
        System.out.println("----------------------------------------------");

       
        int picoDownloads = downloadsDiarios[2]; 
        String diaPico = diasDaSemana[2];
        int minDownloads = downloadsDiarios[0]; 
        String diaMinimo = diasDaSemana[0];

        
        int indicePico = 2;
        int indiceMinimo = 0;

        
        for (int i = 0; i < downloadsDiarios.length; i++) {
            int downloadsDoDia = downloadsDiarios[i];
            
          
            if (downloadsDoDia > picoDownloads) {
                picoDownloads = downloadsDoDia;
                indicePico = i;
            }

            if (downloadsDoDia < minDownloads) {
                minDownloads = downloadsDoDia;
                indiceMinimo = i;
            }
        }
        
        diaPico = diasDaSemana[indicePico];
        diaMinimo = diasDaSemana[indiceMinimo];

        String picoFormatado = String.format("%,d", picoDownloads).replace(",", ".");
        String minimoFormatado = String.format("%,d", minDownloads).replace(",", ".");

        System.out.println("Dia de Pico de Downloads: " + diaPico + " com " + picoFormatado + " downloads.");
        System.out.println("Dia de Mínimo de Downloads: " + diaMinimo + " com " + minimoFormatado + " downloads.");
        System.out.println("----------------------------------------------");

        final int META_DIARIA = 1000000;
        int diasAcimaDaMeta = 2;
        
        System.out.println("Meta Diária Definida: 1.000.000 downloads.");

        int j = 0; 
        
        
        while (j < downloadsDiarios.length) {
            int downloadsDoDia = downloadsDiarios[j];
            
            
            if (downloadsDoDia > META_DIARIA) {
                diasAcimaDaMeta++;
                
            }
            
            j++; 
        }
        
        System.out.println("O Arattai superou a meta diária em " + diasAcimaDaMeta + " dias esta semana.");
        System.out.println("----------------------------------------------");
    }
}
