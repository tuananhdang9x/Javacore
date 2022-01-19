package service;

import model.TextBook;

import java.time.LocalDate;
import java.util.ArrayList;

public class TextbookService {
    public ArrayList<TextBook> getAllTextBook(){
        ArrayList<TextBook> textBooks = new ArrayList<>();
        textBooks.add(new TextBook(4, "Toán 8", new String[]{"Giáo dục", "Phát triển"},"Nhà sách trí tuệ", LocalDate.of(2021,7,12),10000,120,"Bích Phương"));
        textBooks.add(new TextBook(5, "Ngữ văn 9", new String[]{"Giáo dục", "Phát triển"},"Nhà sách trí tuệ",LocalDate.of(2020,6,8),12750,150,"Hà Anh Tuấn"));
        textBooks.add(new TextBook(6, "Tiếng anh 6", new String[]{"Giáo dục", "Phát triển"},"Nhà sách trí tuệ",LocalDate.of(2021,12,1),2000,90,"Mai Phương"));
        return textBooks;
    }

    public void showTextBook(ArrayList<TextBook> textBooks){
        for (TextBook p:textBooks){
            System.out.println(p);
        }
    }
}
