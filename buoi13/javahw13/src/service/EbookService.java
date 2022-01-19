package service;

import model.Ebook;

import java.time.LocalDate;
import java.util.ArrayList;

public class EbookService {
public ArrayList<Ebook> getAllEbook(){
        ArrayList<Ebook> ebooks = new ArrayList<>();
        ebooks.add(new Ebook(1, "Mắt biếc", new String[]{"Tình cảm","Gia đình"}, "Kim Đồng", LocalDate.of(1997, 7, 25), 8, "Đồng quê", 70000));
        ebooks.add(new Ebook(2, "Đừng lựa chọn an nhàn khi còn trẻ", new String[]{"Phát triển","Kỹ năng"}, "Fahasha", LocalDate.of(2018, 6, 25), 12, "Học sinh", 50000));
        ebooks.add(new Ebook(3, "7 thói quen hiệu quả", new String[]{"Phát triển","Kỹ năng"}, "Nhà xuất bản tổng hợp", LocalDate.of(2019, 10, 25), 12, "Word", 90000));
        return ebooks;
}
public void showEbook(ArrayList<Ebook> ebooks){
    for (Ebook p:ebooks){
        System.out.println(p);
    }
}

}
