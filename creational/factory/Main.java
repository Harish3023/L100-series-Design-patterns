package creational.factory;
public class Main {
    public static void main(String[] args) {
        // PDF Section 
        System.out.println(" Creating a PDF document...");
        DocumentCreator pdfCreator = new PDFDocumentCreator();
        Document pdf = pdfCreator.createDocument();
        handleDocument(pdf);

        System.out.println("\n--------------------------\n");

        //  Word Section
        System.out.println(" Creating a Word document...");
        DocumentCreator wordCreator = new WordDocumentCreator();
        Document word = wordCreator.createDocument();
        handleDocument(word);
    }

    // Common workflow
    private static void handleDocument(Document doc) {
        System.out.println("Document Type: " + doc.getName());
        doc.open();
        doc.save();
        doc.close();
    }
}
