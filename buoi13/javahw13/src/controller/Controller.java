package controller;

import model.Ebook;
import model.Newspaper;
import model.TextBook;

import service.EbookService;
import service.NewspaperService;
import service.TextbookService;
import util.Menu;
import java.util.*;

import java.util.Scanner;

public class Controller {

    ArrayList<Ebook> getAllEbook = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    NewspaperService serviceNpp = new NewspaperService();
    ArrayList<Newspaper> newspapers = serviceNpp.getAllNewspaper();

    TextbookService serviceTextbook = new TextbookService();
    ArrayList<TextBook> textBooks = serviceTextbook.getAllTextBook();

    EbookService serviceEbook = new EbookService();
    ArrayList<Ebook> ebooks = serviceEbook.getAllEbook();



    public void controlMenu(){
        boolean isCheck = true;
        while (isCheck){
            Menu.menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Danh sách sách giáo khoa là:");
                    serviceTextbook.showTextBook(textBooks);
                    break;
                case 2:
                    System.out.println("Danh sách báo là:");
                    serviceNpp.showNewspaper(newspapers);
                    break;
                case 3:
                    System.out.println("Danh sách tài liệu điện tử là:");
                    serviceEbook.showEbook(ebooks);
                    break;
                case 4:
                    searchByName(ebooks,textBooks,newspapers);
                    break;
                case 5:
                    searchByCategory(ebooks,textBooks,newspapers);
                    break;
                case 6:
                    mostDownloadEbook(ebooks);
                    break;
                case 7:
                    currentNewspaper(newspapers);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void searchByName(ArrayList<Ebook> ebooks, ArrayList<TextBook> textBooks,ArrayList<Newspaper> newspapers){
            boolean isContinue = true;
            while (isContinue){
                isContinue = true;
                System.out.println("Nhập tên sách bạn muốn tìm:");
                String inputName = sc.nextLine();
            for (Ebook p:ebooks){
                if (p.getName().equalsIgnoreCase(inputName)){
                    System.out.println(p);
                    isContinue = false;
                }
            }

            for (Newspaper q:newspapers) {
                    if(q.getName().equalsIgnoreCase(inputName)){
                        System.out.println(q);
                        isContinue =false;
                    }
            }
            for (TextBook m:textBooks) {
                if (m.getName().equalsIgnoreCase(inputName)) {
                    System.out.println(m);
                    isContinue = false;
                }
            }
            }
}

    public static void searchByCategory(ArrayList<Ebook> ebooks, ArrayList<TextBook> textBooks,ArrayList<Newspaper> newspapers){
        boolean isContinue = true;
        while (isContinue){
            isContinue = true;
            System.out.println("Nhập thể loại bạn muốn tìm:");
            String inputCategory = sc.nextLine();
            for (Ebook p:ebooks){
                if (Arrays.toString(p.getCategory()).contains(inputCategory)){
                    System.out.println(p);
                    isContinue = false;
                }
            }

            for (Newspaper q:newspapers) {
                if(Arrays.toString(q.getCategory()).contains(inputCategory)){
                    System.out.println(q);
                    isContinue =false;
                }
            }
            for (TextBook m:textBooks) {
                if (Arrays.toString(m.getCategory()).contains(inputCategory)) {
                    System.out.println(m);
                    isContinue = false;
                }
            }
        }
    }

    public static void mostDownloadEbook(ArrayList<Ebook> ebooks){
        Collections.sort(ebooks, new Comparator<Ebook>() {
            @Override
            public int compare(Ebook o1, Ebook o2) {
                return o1.getDownload() - o2.getDownload()>0?1:-1;
            }
        });

        for (int i=1; i<=ebooks.size();i++){
            if(i== ebooks.size()){
                System.out.println(ebooks.get(i-1));
            }
        }
    }

    public static void currentNewspaper(ArrayList<Newspaper> newspapers){
        boolean isContinue = true;
        while (isContinue){
            System.out.println("Nhập vào năm hiện tại:");
            int inputYear = Integer.parseInt(sc.nextLine());
            for (Newspaper p:newspapers){
                if(inputYear==p.getYearPublish().getYear()){
                    System.out.println(p);
                    isContinue=false;
                } else {
                    isContinue=true;
                }
            }
        }
    }

}


