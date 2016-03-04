package com.jse.fundamentals.introduction;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePDFWithDeckOfCards {
    private static final String OUTPUT_FILE_PATH = "bin/com/jse/deck.pdf";
    private static final String FONT_FILE_PATH = "resources/arial.ttf";
    
    public static void main(String[] args) {
        Document document = new Document();
        
        try {
            PdfWriter.getInstance(document, new FileOutputStream(
                    OUTPUT_FILE_PATH));
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (DocumentException de) {
            de.printStackTrace();
        }
        
        document.open();
        
        try {
            BaseFont baseFont = BaseFont.createFont(FONT_FILE_PATH,
                    BaseFont.IDENTITY_H, true);
            Paragraph header = new Paragraph("Standard Deck: 52 cards");
            header.setAlignment(Element.ALIGN_CENTER);
            document.add(header);
            document.add(Chunk.NEWLINE);
            PdfPTable table = new PdfPTable(4);
            Font black = new Font(baseFont, 40f, 0, BaseColor.BLACK);
            Font red = new Font(baseFont, 40f, 0, BaseColor.RED);
            
            String[] colors = {"\u2660", "\u2665", "\u2666", "\u2663"};
            String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                    "J", "Q", "K", "A"};
            
            for (int value = 0; value < 13; value++) {
                for (int color = 0; color < 4; color++) {
                    Paragraph card = new Paragraph();
    
                    if (color == 0 || color == 3) {
                        card = new Paragraph(values[value] + colors[color],
                                black);
                    } else if (color == 1 || color == 2) {
                        card = new Paragraph(values[value] + colors[color],
                                red);
                    }
    
                    PdfPCell cell = new PdfPCell(card);
                    cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell.setFixedHeight(150f);
                    table.addCell(cell);
                }
            }
            
            document.add(table);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (DocumentException de) {
            de.printStackTrace();
        }
        
        document.close();
    }
}
