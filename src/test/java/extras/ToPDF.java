package extras;

import com.spire.doc.*;
public class ToPDF {
    public static void main(String[] args) {
        //String inputFile="data/Sample.docx";
       // String outputFile="output/toPDF.pdf";
    	String inputFile="d:/output.docx";
    	String outputFile="d:/output_toPDF.pdf";//create word document
        Document document = new Document();
        document.loadFromFile(inputFile);

        //save the document to a PDF file.
        document.saveToFile(outputFile, FileFormat.PDF);
        System.out.println("Done!!!!");
    }
}