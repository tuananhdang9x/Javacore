package controller;

import model.Product;
import service.ProductService;
import util.Menu;

import java.util.*;

public class Controller {

    static Scanner sc = new Scanner(System.in);

    static ProductService service = new ProductService();

    static ArrayList<Product> products = service.getAllProduct();


    public void controlMenu(){
        boolean isContinue = true;
        while (isContinue){
            Menu.menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Danh sách toàn bộ sản phẩm");
                    ProductService.show(products);
                    break;
                case 2:
                    searchByCategory(products);
                    break;
                case 3:
                    searchByBrand(products);
                    break;
                case 4:
                    searchByPrice(products);
                    break;
                case 5:
                    searchByName(products);
                    break;
                case 6:
                    countByCategory(products);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }

    }

    public void searchByCategory(ArrayList<Product> products){
        System.out.println("1 - Điện thoại");
        System.out.println("2 - Laptop");
        System.out.println("3 - Apple");
        System.out.println("4 - Phụ kiện");
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1:
                for (Product p: products){
                    if(Arrays.toString(p.getCategory()).contains("Điện thoại")){
                        System.out.println(p);
                    }
                }
                break;
            case 2:
                for (Product p: products){
                    if(Arrays.toString(p.getCategory()).contains("Laptop")){
                        System.out.println(p);
                    }
                }
                break;
            case 3:
                for (Product p: products){
                    if(Arrays.toString(p.getCategory()).contains("Apple")){
                        System.out.println(p);
                    }
                }
                break;
            case 4:
                for (Product p: products){
                    if(Arrays.toString(p.getCategory()).contains("Phụ kiện")){
                        System.out.println(p);
                    }
                }
                break;
            default:
                System.out.println("Không có lựa chọn này!");
        }
    }

    public void searchByBrand(ArrayList<Product> products){
        System.out.println("1 - Apple");
        System.out.println("2 - Samsung");
        System.out.println("3 - Xiaomi");
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1:
                for (Product p: products){
                    if(p.getBrand().contains("Apple")){
                        System.out.println(p);
                    }
                }
                break;
            case 2:
                for (Product p: products){
                    if(p.getBrand().contains("Samsung")){
                        System.out.println(p);
                    }
                }
                break;
            case 3:
                for (Product p: products){
                    if(p.getBrand().contains("Xiaomi")){
                        System.out.println(p);
                    }
                }
                break;
            default:
                System.out.println("Không có lựa chọn này!");
        }
    }

    public static void searchByPrice(ArrayList<Product> products){
        System.out.println("1 - Dưới 2 triệu");
        System.out.println("2 - Từ 2-4 triệu");
        System.out.println("3 - Từ 4-7 triệu");
        System.out.println("4 - Từ 7-13 triệu");
        System.out.println("5 - Trên 13 triệu");
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                for (Product p:products){
                    if(p.getPrice()<2000000){
                        System.out.println(p);
                    }
                }
                break;
            case 2:
                for (Product p:products){
                    if(p.getPrice()>=2000000&& p.getPrice()<=4000000){
                        System.out.println(p);
                    }
                }
                break;
            case 3:
                for (Product p:products){
                    if(p.getPrice()>=4000000&& p.getPrice()<=7000000){
                        System.out.println(p);
                    }
                }
                break;
            case 4:
                for (Product p:products){
                    if(p.getPrice()>=7000000&& p.getPrice()<=13000000){
                        System.out.println(p);
                    }
                }
                break;
            case 5:
                for (Product p:products){
                    if(p.getPrice()>=13000000){
                        System.out.println(p);
                    }
                }
                break;
            default:
                System.out.println("Không có lựa chọn này!");
        }
    }

    public static void searchByName(ArrayList<Product>products){
        boolean isContinue = true;
        while (isContinue){
            System.out.println("Nhập tên sản phẩm bạn muốn tìm:");
            String inputName = sc.nextLine();
            for (Product p:products){
                if(p.getName().contains(inputName)){
                    System.out.println(p);
                    isContinue = false;
                } else {
                    System.out.println("Không có tên sản phẩm này, xin mời nhập lại:");
                }
            }
        }
    }

    public void countByCategory(ArrayList<Product> products){
        Map<String,Integer> list = new HashMap<>();
        for (Product p:products){
            String[] category = p.getCategory();
            for (String str: category){
                if(list.get(str)==null){
                    list.put(str,1);
                } else {
                    list.put(str,list.get(str)+1);
                }
            }
        }
        System.out.println(list);
    }




}
