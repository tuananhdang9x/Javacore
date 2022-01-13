package controller;

import model.Movie;
import service.MovieService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    MovieService service = new MovieService();
    ArrayList<Movie> list = service.getAllMovie();

    public void menu(){
        System.out.println("---------------------------");
        System.out.println("1 - Xem toàn bộ danh sách phim");
        System.out.println("2 - Sắp xếp phim theo năm xuất bản");
        System.out.println("3 - Sắp xếp phim theo tên");
        System.out.println("4 - Tìm phim theo tên");
        System.out.println("5 - Lấy ra 3 phim có lượt xem cao nhất");
        System.out.println("6 - Tìm phim theo thể loại");
        System.out.println("7 - Thoát khỏi chương trình");
    }

    public void controlMenu(){
        boolean isContinue = true;
        while (isContinue){
        menu();
        Scanner sc = new Scanner(System.in);
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1:
                System.out.println("Danh sách phim:");
                service.show(list);
                break;
            case 2:
                System.out.println("Danh sách phim sau khi sắp xếp theo năm:");
                service.sortByYear(list);
                service.show(list);
                break;
            case 3:
                System.out.println("Danh sách phim sau khi sắp xếp theo tên");
                service.sortByTitle(list);
                service.show(list);
                break;
            case 4:
                System.out.println("Nhập tên phim bạn cần tìm:");
                String searchTitle = sc.nextLine();
                service.searchByTitle(list,searchTitle);
                break;
            case 5:
                System.out.println("Danh sách 3 phim có lượt xem cao nhất:");
                service.topView(list);
                break;
            case 6:
                System.out.println("Nhập thể loại phim bạn cần tìm:");
                String searchCategory = sc.nextLine();
                service.searchByCategory(list,searchCategory);
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
    }

}
}
