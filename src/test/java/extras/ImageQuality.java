package extras;

import com.spire.doc.*;


public class ImageQuality { 
    public static void main(String[] args) throws Exception {

        //Create Word document.
        Document document = new Document();

        //Load the file from disk.
        document.loadFromFile("d:/output.docx");

        //Set the output image quality to be 40% of the original image. The default set of the output image quality is 80% of the original.
        document.setJPEGQuality(20);

        ToPdfParameterList pdf = new ToPdfParameterList();
        pdf.setDisableLink(true);

        //Save to file.
        document.saveToFile("d:/ImageQuality.pdf", FileFormat.PDF);
        System.out.println("Done");
    }
}