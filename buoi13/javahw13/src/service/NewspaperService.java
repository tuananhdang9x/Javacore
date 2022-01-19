package service;

import model.Newspaper;

import java.time.LocalDate;
import java.util.ArrayList;

public class NewspaperService {
    public ArrayList<Newspaper> getAllNewspaper(){
        ArrayList<Newspaper> newspapers = new ArrayList<>();
        newspapers.add(new Newspaper(7,"Tuổi trẻ",new String[]{"Giáo dục","Đời sống","Thể thao"},"Tuổi trẻ mới", LocalDate.of(2008,7,9),12500,12));
        newspapers.add(new Newspaper(8,"Vnexpress",new String[]{"Giáo dục","Đời sống","Thể thao"},"Báo mới",LocalDate.of(2021,8,25),30000,15));
        newspapers.add(new Newspaper(9,"Kênh 14",new String[]{"Giới trẻ","Fashion","Thể thao"},"Fahasha",LocalDate.of(2022,8,25),30000,15));
        return newspapers;
    }

    public void showNewspaper(ArrayList<Newspaper> newspapers){
        for (Newspaper p:newspapers){
            System.out.println(p);
        }
    }
}
