package controller;

import model.Character;
import model.*;
import model.Package;
import service.PersonService;
import service.ProductService;
import util.Menu;
import util.Validate;

import java.time.LocalDate;
import java.util.*;

public class Controller {
    static Scanner sc = new Scanner(System.in);

    static ProductService service = new ProductService();
    static ArrayList<Product> products = service.getAllProduct();

    static PersonService personService = new PersonService();
    static ArrayList<Person> people = personService.getAllPerson();

    static ArrayList<Package> packages = new ArrayList<>();


    public static void controlMenu(){
        while(true){
            Menu.mainMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    login();
                    break;
                case 2:
                    register(people);
                    break;
                case 3:
                    service.show(products);
                    break;
                case 4:
                    availableProduct();
                    break;
                case 5:
                    oldProduct();
                    break;
                case 6:
                    searchByName(products);
                    break;
                case 7:
                    showNitendo(products);
                    break;
                case 8:
                    showGame(products);
                    break;
                case 9:
                    showFigure(products);
                    break;
                case 10:
                    showBackpack(products);
                    break;
                case 11:
                    sortByPrice(products);
                    break;
                case 12:
                    sortIncrease(products);
                    break;
                case 13:
                    sortAZ(products);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Kh??ng c?? l???a ch???n n??y!");
            }
        }
    }

    public static void login(){
        while (true){
            Menu.loginMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    signIn();
                    break;
                case 2:
                    forgetPassword();
                    break;
                case 0:
                    controlMenu();
                    break;
                default:
                    System.out.println("Kh??ng c?? l???a ch???n n??y");
                    break;
            }
        }
    }

    public static void forgetPassword(){
        System.out.println("T??i kho???n:");
        String account = sc.nextLine();
        for (Person p : people) {
            if (p.getAccount().contains(account)) {
                boolean getTrue = true;
                while (getTrue) {
                    System.out.println("Nh???p Email:");
                    String email = sc.nextLine();
                    if (p.getEmail().equals(email)) {
                        System.out.printf("M???t kh???u c?? c???a b???n l??:%s", p.getPassword());
                        controlMenu();
                        getTrue = false;
                    } else {
                        System.out.println("Email kh??ng ????ng");
                    }
                }
            }
        }
    }

    public static void signIn(){
        while (true){
            System.out.println("Nh???p t??i kho???n");
            String account = sc.nextLine();

            for (Person p:people){
                if(p.getAccount().contains(account)){
                    System.out.println("Nh???p m???t kh???u:");
                    String password = sc.nextLine();
                    if (p.getPassword().equals(password)){
                        if(Arrays.equals(p.getRole(), new int[]{1})){
                            System.out.printf("\nXin ch??o,%s", p.getName());
                            userLogin();
                        }

                        if (Arrays.equals(p.getRole(), new int[]{2})){
                            System.out.printf("\nXin ch??o Admin,%s", p.getName());
                            adminLogin();
                        }

                        if (Arrays.equals(p.getRole(), new int[]{1,2})){
                            System.out.printf("\nXin ch??o,%s", p.getName());
                            directorLogin();
                        }
                    }else {
                        System.out.println("M???t kh???u kh??ng ????ng!");
                    }
                }
            }
        }
    }

    public static void userLogin(){
        while (true){
            Menu.userLoginMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    infoUser();
                    break;
                case 2:
                    changePasswordUser();
                    break;
                case 3:
                    buyProduct(packages);
                    break;
                case 4:
                    showPackage(packages);
                    break;
                case 5:
                    service.show(products);
                    break;
                case 6:
                    availableProduct();
                    break;
                case 7:
                    oldProduct();
                    break;
                case 8:
                    searchByName(products);
                    break;
                case 9:
                    showNitendo(products);
                    break;
                case 10:
                    showGame(products);
                    break;
                case 11:
                    showFigure(products);
                    break;
                case 12:
                    showBackpack(products);
                    break;
                case 13:
                    sortByPrice(products);
                    break;
                case 14:
                    sortIncrease(products);
                    break;
                case 15:
                    sortAZ(products);
                    break;
                case 0:
                    controlMenu();
                    break;
                default:
                    System.out.println("Kh??ng c?? l???a ch???n n??y");
            }
        }
    }

    public static void adminLogin(){
        while (true){
            Menu.adminLoginMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    infoAdmin();
                    break;
                case 2:
                    changePasswordAdmin();
                    break;
                case 3:
                    addProductAdmin();
                    break;
                case 4:
                    removeProduct(products);
                    break;
                case 5:
                    showPackage(packages);
                    break;
                case 6:
                    service.show(products);
                    break;
                case 7:
                    searchByName(products);
                    break;
                case 8:
                    availableProduct();
                    break;
                case 9:
                    oldProduct();
                    break;
                case 10:
                    showNitendo(products);
                    break;
                case 11:
                    showGame(products);
                    break;
                case 12:
                    showFigure(products);
                    break;
                case 13:
                    showBackpack(products);
                    break;
                case 14:
                    sortByPrice(products);
                    break;
                case 15:
                    sortIncrease(products);
                    break;
                case 16:
                    sortAZ(products);
                    break;
                case 0:
                    controlMenu();
                    break;
                default:
                    System.out.println("Kh??ng c?? l???a ch???n n??y");
            }
        }
    }

    public static void directorLogin(){
        while (true){
            Menu.directorLoginMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    addAdmin(people);
                    break;
                case 2:
                    removeAdmin(people);
                    break;
                case 3:
                    showAdminAccount();
                    break;
                case 4:
                    changePasswordDirector();
                    break;
                case 5:
                    showPackage(packages);
                    break;
                case 6:
                    addProductDirector();
                    break;
                case 7:
                    removeProduct(products);
                    break;
                case 8:
                    service.show(products);
                    break;
                case 9:
                    searchByName(products);
                    break;
                case 10:
                    availableProduct();
                    break;
                case 11:
                    oldProduct();
                    break;
                case 12:
                    showNitendo(products);
                    break;
                case 13:
                    showGame(products);
                    break;
                case 14:
                    showFigure(products);
                    break;
                case 15:
                    showBackpack(products);
                    break;
                case 16:
                    sortByPrice(products);
                    break;
                case 17:
                    sortIncrease(products);
                    break;
                case 18:
                    sortAZ(products);
                    break;
                case 0:
                    controlMenu();
                    break;
                default:
                    System.out.println("Kh??ng c?? l???a ch???n n??y");
            }
        }
    }

    public static void infoUser(){
        Menu.menuInfoAccount();
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                for (Person p: people){
                    if (Arrays.equals(p.getRole(), new int[]{1})){
                        System.out.println("Th??ng tin t??i kho???n:");
                        System.out.println(p);
                    }
                }
                break;
            case 2:
                for (Person p:people){
                    if (Arrays.equals(p.getRole(), new int[]{1})){
                        System.out.println("Th??ng tin t??i kho???n:");
                        System.out.println(p);

                        System.out.println("C???p nh???t gi???i t??nh:");
                        String newGender = sc.nextLine();
                        p.setGender(Gender.valueOf(newGender));

                        System.out.println("C???p nh???t ng??y sinh:");
                        LocalDate newDate = LocalDate.parse(sc.nextLine());
                        p.setDate(newDate);

                        System.out.println("C???p nh???t s??? ??i???n tho???i:");
                        String newPhone = sc.nextLine();
                        p.setPhoneNumber(newPhone);

                        System.out.println("Th??ng tin t??i kho???n sau khi c???p nh???t:");
                        System.out.println(p);
                    }
                }
                break;
            case 3:
                userLogin();
                break;
            default:
                System.out.println("Kh??ng c?? l???a ch???n n??y");
        }
    }

    public static void infoAdmin(){
        Menu.menuInfoAccount();
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                for (Person p: people){
                    if (Arrays.equals(p.getRole(), new int[]{2})){
                        System.out.println("Th??ng tin t??i kho???n:");
                        System.out.println(p);
                    }
                }
                break;
            case 2:
                for (Person p:people){
                    if (Arrays.equals(p.getRole(), new int[]{1})){
                        System.out.println("Th??ng tin t??i kho???n:");
                        System.out.println(p);

                        System.out.println("C???p nh???t gi???i t??nh:");
                        String newGender = sc.nextLine();
                        p.setGender(Gender.valueOf(newGender));

                        System.out.println("C???p nh???t ng??y sinh:");
                        LocalDate newDate = LocalDate.parse(sc.nextLine());
                        p.setDate(newDate);

                        System.out.println("C???p nh???t s??? ??i???n tho???i:");
                        String newPhone = sc.nextLine();
                        p.setPhoneNumber(newPhone);

                        System.out.println("Th??ng tin t??i kho???n sau khi c???p nh???t:");
                        System.out.println(p);
                    }
                }
                break;
            case 3:
                adminLogin();
                break;
            default:
                System.out.println("Kh??ng c?? l???a ch???n n??y");
        }
    }

    public static void changePasswordUser(){
        boolean isCheck = true;
        while (isCheck) {
            for (Person p: people){
                if (Arrays.equals(p.getRole(), new int[]{1})){
                    System.out.println("Nh???p m???t kh???u c??:");
                    String oldPassword = sc.nextLine();
                    if (p.getPassword().equals(oldPassword)) {
                        System.out.println("M???t kh???u m???i:");
                        String newPassword = sc.nextLine();
                        System.out.println("X??c nh???n m???t kh???u:");
                        String repeatPassword = sc.nextLine();
                        if (repeatPassword.equals(newPassword)) {
                            System.out.println("M???t kh???u ???? ???????c ?????i. Vui l??ng d??ng m???t kh???u m???i trong l???n ????ng nh???p k??? ti???p!");
                            p.setPassword(newPassword);
                            isCheck = false;
                        } else {
                            System.out.println("?????i m???t kh???u th???t b???i. M???t kh???u x??c nh???n kh??ng tr??ng kh???p!");
                        }
                    } else {
                        System.out.println("M???t kh???u kh??ng ????ng!");
                    }
                }
            }
        }
    }

    public static void changePasswordAdmin(){
        boolean isCheck = true;
        while (isCheck) {
            for (Person p: people){
                if (Arrays.equals(p.getRole(),new int[]{2})){
                    System.out.println("Nh???p m???t kh???u c??:");
                    String oldPassword = sc.nextLine();
                    if (p.getPassword().equals(oldPassword)) {
                        System.out.println("M???t kh???u m???i:");
                        String newPassword = sc.nextLine();
                        System.out.println("X??c nh???n m???t kh???u:");
                        String repeatPassword = sc.nextLine();
                        if (repeatPassword.equals(newPassword)) {
                            System.out.println("M???t kh???u ???? ???????c ?????i. Vui l??ng d??ng m???t kh???u m???i trong l???n ????ng nh???p k??? ti???p!");
                            isCheck = false;
                        } else {
                            System.out.println("?????i m???t kh???u th???t b???i. M???t kh???u x??c nh???n kh??ng tr??ng kh???p!");
                        }
                    } else {
                        System.out.println("M???t kh???u kh??ng ????ng!");
                    }
                }
            }
        }
    }

    public static void changePasswordDirector(){
        boolean isCheck = true;
        while (isCheck) {
            for (Person p: people){
                if (Arrays.equals(p.getRole(), new int[]{1,2})){
                    System.out.println("Nh???p m???t kh???u c??:");
                    String oldPassword = sc.nextLine();
                    if (p.getPassword().equals(oldPassword)) {
                        System.out.println("M???t kh???u m???i:");
                        String newPassword = sc.nextLine();
                        System.out.println("X??c nh???n m???t kh???u:");
                        String repeatPassword = sc.nextLine();
                        if (repeatPassword.equals(newPassword)) {
                            System.out.println("M???t kh???u ???? ???????c ?????i. Vui l??ng d??ng m???t kh???u m???i trong l???n ????ng nh???p k??? ti???p!");
                            isCheck = false;
                        } else {
                            System.out.println("?????i m???t kh???u th???t b???i. M???t kh???u x??c nh???n kh??ng tr??ng kh???p!");
                        }
                    } else {
                        System.out.println("M???t kh???u kh??ng ????ng!");
                    }
                }
            }
        }
    }

    public static ArrayList<Person> register(ArrayList<Person> newUser) {
            System.out.println("T??i kho???n:");
            String account = sc.nextLine();

//            if (!Validate.validateAccount(account)){
//                System.out.println("T??i kho???n g???m 6-12 k?? t???!");
//                boolean isContinue = true;
//                while (isContinue){
//                    System.out.println("Nh???p l???i t??i kho???n:");
//                    String repeatAccount = sc.nextLine();
//                    if (Validate.validateAccount(repeatAccount)){
//                        account.equals(repeatAccount);
//                        isContinue=false;
//                    }
//                }
//            }

            System.out.println("Email:");
            String email = sc.nextLine();

//        if (!Validate.validateEmail(email)){
//            System.out.println("Email kh??ng h???p l???!");
//            boolean isContinue1 = true;
//            while (isContinue1){
//                System.out.println("Nh???p l???i Email:");
//                String repeatEmail = sc.nextLine();
//                if (Validate.validateEmail(repeatEmail)){
//                    email.equals(repeatEmail);
//                    isContinue1=false;
//                }
//            }
//        }

            System.out.println("H??? v?? t??n");
            String name = sc.nextLine();
            System.out.println("M???t kh???u:");
            String password = sc.nextLine();

            int id = 1;
            for (Person p: people){
                if (p.getId()!=0){
                    id++;
                }
            }

            boolean isContinue3 = true;
            while (isContinue3){
            System.out.println("X??c nh???n m???t kh???u:");
            String newPassword = sc.nextLine();
            if(newPassword.equals(password)){
                isContinue3=false;
            } else {
                System.out.println("M???t kh???u x??c nh???n ch??a tr??ng kh???p!");
                }
            }
            newUser.add(new Person(id,new int[]{1},account,password,name,null,null,email,null,0));
            return newUser;
    }

    public static void showNitendo(ArrayList<Product> products){
        for (Product p:products){
            if (p.getCharacter().toString().contains("NitendoSwitch")){
                System.out.println(p);
            }
        }
    }

    public static void showGame(ArrayList<Product> products){
        for (Product p:products){
            if (p.getCharacter().toString().contains("Game")){
                System.out.println(p);
            }
        }
    }

    public static void showFigure(ArrayList<Product> products){
        for (Product p:products){
            if (p.getCharacter().toString().contains("Figure")){
                System.out.println(p);
            }
        }
    }

    public static void showBackpack(ArrayList<Product> products){
        for (Product p:products){
            if (p.getCharacter().toString().contains("Backpack")){
                System.out.println(p);
            }
        }
    }

    public static void sortByPrice(ArrayList<Product> products){
        System.out.println("1 - T??? 0-500.000??");
        System.out.println("2 - T??? 500.000-1.000.000??");
        System.out.println("3 - T??? 1.000.000??-5.000.000??");
        System.out.println("4 - L???n h??n 5.000.000??");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                for (Product p:products){
                    if(p.getPriceSale()<=500000){
                        System.out.println(p);
                    }
                }
                break;
            case 2:
                for (Product p:products){
                    if(p.getPriceSale()>=500000&&p.getPriceSale()<=1000000){
                        System.out.println(p);
                    }
                }
                break;
            case 3:
                for (Product p:products){
                    if(p.getPriceSale()>=1000000&&p.getPriceSale()<=5000000){
                        System.out.println(p);
                    }
                }
                break;
            case 4:
                for (Product p:products){
                    if(p.getPriceSale()>=5000000){
                        System.out.println(p);
                    }
                }
                break;
            default:
                System.out.println("Kh??ng c?? l???a ch???n n??y!");

        }
    }

    public static void searchByName(ArrayList<Product> products){
        boolean isContinue = true;
        while (isContinue){
            System.out.println("Nh???p t??n s???n ph???m b???n mu???n t??m:");
            String inputName = sc.nextLine();
            for (Product p:products){
                if(p.getName().contains(inputName)){
                    System.out.println(p);
                    isContinue=false;
                }
            }
        }

    }

    public static void sortIncrease(ArrayList<Product> products){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPriceSale()-o2.getPriceSale()>0?1:-1;
            }
        });
        for (Product p:products){
            System.out.println(p);
        }
    }

    public static void sortAZ(ArrayList<Product> products){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Product p:products){
            System.out.println(p);
        }
    }

    public static void addProductAdmin(){
        while (true){
            Menu.menuAddProduct();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    increaseProduct();
                    adminLogin();
                    break;
                case 2:
                    newProduct(products);
                    adminLogin();
                    break;
                case 3:
                    adminLogin();
                    break;
                default:
                    System.out.println("Kh??ng c?? l???a ch???n  n??y");
                    break;
            }
        }
    }

    public static void addProductDirector(){
        while (true){
            Menu.menuAddProduct();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    increaseProduct();
                    directorLogin();
                    break;
                case 2:
                    newProduct(products);
                    directorLogin();
                    break;
                case 3:
                    directorLogin();
                    break;
                default:
                    System.out.println("Kh??ng c?? l???a ch???n  n??y");
                    break;
            }
        }
    }

    public static ArrayList<Product> newProduct(ArrayList<Product> newProduct){
        System.out.println("Nh???p ID:");
        int inputID = Integer.parseInt(sc.nextLine());

        if(inputID<=products.size()){
            boolean isContinue = true;
            while (isContinue){
                System.out.println("ID ???? t???n t???i, h??y nh???p ID m???i:");
                int newID = Integer.parseInt(sc.nextLine());
                if (newID>products.size()){
                    inputID=newID;
                    isContinue=false;
                } else {
                    System.out.println("ID m???i c???n l???n h??n:"+products.size());
                }
            }
        }

        System.out.println("Ch???n lo???i h??ng:");
        System.out.println("1 - NitendoSwitch");
        System.out.println("2 - Game");
        System.out.println("3 - Figure");
        System.out.println("4 - Backpack");
        int choice = Integer.parseInt(sc.nextLine());
        Character character = null;
        switch (choice){
            case 1:
                character=Character.NitendoSwitch;
                break;
            case 2:
                character=Character.Game;
                break;
            case 3:
                character=Character.Figure;
                break;
            case 4:
                character=Character.Backpack;
                break;
            default:
                System.out.println("Kh??ng c?? l???a ch???n n??y");
        }
        System.out.println("T??nh tr???ng:");
        System.out.println("1 - M???i");
        System.out.println("2 - C??");
        int pick =Integer.parseInt(sc.nextLine());
        Condition condition = null;
        switch (pick){
            case 1:
                condition=Condition.NEW;
                break;
            case 2:
                condition=Condition.OLD;
                break;
            default:
                System.out.println("Kh??ng c?? l???a ch???n n??y");
                break;
        }

        System.out.println("T??n s???n ph???m:");
        String inputName = sc.nextLine();
        System.out.println("H??nh ???nh:");
        String inputPicture = sc.nextLine();
        System.out.println("Kho h??ng:");
        System.out.println("1 - C?? s???n");
        System.out.println("2 - H???t h??ng");
        System.out.println("3 - H??ng Oder");
        int pickNumber = Integer.parseInt(sc.nextLine());
        Storage storage = null;
        switch (pickNumber){
            case 1:
                storage=Storage.AVAILABLE;
                break;
            case 2:
                storage=Storage.SOLDOUT;
                break;
            case 3:
                storage=Storage.PREORDER;
                break;
            default:
                System.out.println("Kh??ng c?? l???a ch???n n??y");
                break;
        }

        System.out.println("Nh???p gi?? c??:");
        long oldPrice = Long.parseLong(sc.nextLine());
        System.out.println("Nh???p gi?? sale:");
        long salePrice = Long.parseLong(sc.nextLine());
        System.out.println("M??u s???c:");
        System.out.println("1 - White");
        System.out.println("2 - Black");
        System.out.println("3 - Blue");
        System.out.println("4 - Yellow");
        System.out.println("5 - Neon");
        System.out.println("6 - Red");
        System.out.println("7 - Custom");
        int pick1 = Integer.parseInt(sc.nextLine());
        Color color = null;
        switch (pick1){
            case 1:
                color=Color.WHITE;
                break;
            case 2:
                color=Color.BLACK;
                break;
            case 3:
                color=Color.BLUE;
                break;
            case 4:
                color=Color.YELLOW;
                break;
            case 5:
                color=Color.NEON;
                break;
            case 6:
                color=Color.RED;
                break;
            case 7:
                color=Color.CUSTOM;
                break;
            default:
                System.out.println("Kh??ng c?? l???a ch???n  n??y");
        }
        System.out.println("S??? l?????ng:");
        int inputCollection = Integer.parseInt(sc.nextLine());

        newProduct.add(new Product(inputID,character,condition,inputName,inputPicture,storage,oldPrice,salePrice,null,color,inputCollection));
        return newProduct;
    }

    public static void increaseProduct(){
        System.out.println("Nh???p id s???n ph???m:");
        int inputID = Integer.parseInt(sc.nextLine());
        if(inputID>products.size()){
            boolean isContinue = true;
            while (isContinue){
                System.out.println("ID kh??ng t???n t???i, h??y nh???p ID kh??c:");
                int newID = Integer.parseInt(sc.nextLine());
                if (newID<=products.size()){
                    inputID=newID;
                    isContinue=false;
                } else {
                    System.out.println("ID m???i c???n nh??? h??n:"+products.size());
                }
            }
        }

        for (Product p:products){
            if(p.getId()==inputID){
                System.out.println("Nh???p s??? l?????ng s???n ph???m mu???n th??m:");
                int addNumberProduct = Integer.parseInt(sc.nextLine());
                p.setCollection(p.getCollection()+addNumberProduct);
            }
        }
    }

    public static void availableProduct(){
        for (Product p: products){
            if (p.getStorage().equals(Storage.AVAILABLE)){
                System.out.println(p);
            }
        }
    }

    public static void oldProduct(){
        for (Product p: products){
            if (p.getCondition().equals(Condition.OLD)){
                System.out.println(p);
            }
        }
    }

    public static void removeProduct(ArrayList<Product> products){
        System.out.println("Nh???p id s???n ph???m mu???n x??a:");
        int inputID = Integer.parseInt(sc.nextLine());

        if(inputID>=products.size()){
            boolean isContinue = true;
            while (isContinue){
                System.out.println("ID kh??ng t???n t???i, h??y nh???p ID kh??c:");
                int newID = Integer.parseInt(sc.nextLine());
                if (newID<products.size()){
                    inputID=newID;
                    isContinue=false;
                } else {
                    System.out.println("ID m???i c???n nh??? h??n:"+products.size());
                }
            }
        }

        boolean isContinue = true;
        while (isContinue){
            for (Product p:products){
                if (p.getId()==inputID){
                    products.remove(p);
                    isContinue=false;
                }
            }
        }
    }

    public static ArrayList<Package> buyProduct(ArrayList<Package> newPackage){
                System.out.println("Nh???p id c???a b???n:");
                int inputID = Integer.parseInt(sc.nextLine());
                System.out.println("Nh???p id s???n ph???m:");
                int inputIDProduct = Integer.parseInt(sc.nextLine());
                System.out.println("Nh???p s??? l?????ng mu???n mua:");
                int inputBuyNumber = Integer.parseInt(sc.nextLine());
                for (Product q:products){
                    if(q.getId()==inputIDProduct){
                        if (q.getCollection() < inputBuyNumber) {
                            System.out.println("S??? l?????ng s???n ph???m c??n l???i kh??ng ?????!");
                            return null;
                        } else {
                            newPackage.add(new Package(inputID, inputIDProduct, inputBuyNumber));
                            q.setCollection(q.getCollection()-inputBuyNumber);
                        }
                    }
                }
                return newPackage;
    }

    public static void showPackage(ArrayList<Package> packages){
        for (Package p:packages){
            System.out.println(p);
        }
    }

    public static ArrayList<Person> addAdmin(ArrayList<Person> newPerson){
        System.out.println("Nh???p id:");
        int inputID = Integer.parseInt(sc.nextLine());

        if(inputID<=people.size()){
            boolean isContinue = true;
            while (isContinue){
                System.out.println("ID ???? t???n t???i, h??y nh???p ID m???i:");
                int newID = Integer.parseInt(sc.nextLine());
                if (newID>people.size()){
                    inputID=newID;
                    isContinue=false;
                } else {
                    System.out.println("ID m???i c???n l???n h??n:"+people.size());
                }
            }
        }

        System.out.println("Nh???p t??n t??i  kho???n:");
        String inputAccount = sc.nextLine();

        System.out.println("Nh???p m???t kh???u");
        String inputPassword = sc.nextLine();

        System.out.println("Nh???p email:");
        String inputEmail = sc.nextLine();

        System.out.println("Nh???p t??n:");
        String inputName = sc.nextLine();
        newPerson.add(new Person(inputID,new int[]{2},inputAccount,inputPassword,inputName,null,null,inputEmail,null,0));

        return newPerson;
    }

    public static void removeAdmin(ArrayList<Person> people){
        System.out.println("Nh???p id admin b???n mu???n x??a:");
        int inputID = Integer.parseInt(sc.nextLine());

        boolean continuous = true;
        while (continuous){
            System.out.println("Nh???p l???i id admin b???n mu???n x??a");
            int repeatID = Integer.parseInt(sc.nextLine());
               for (Person p: people){
                   if(p.getId()==inputID){
                       continuous=false;
                   }else {
                       System.out.println("ID kh??ng t???n t???i, nh???p l???i id kh??c:");
                   }
               }
        }

        boolean isContinue = true;
        while (isContinue){
            for (Person p:people){
                if(Arrays.equals(p.getRole(), new int[]{2})){
                    if(p.getId()==inputID){
                        people.remove(p);
                        isContinue=false;
                        directorLogin();
                    }
                }
            }
        }
    }

    public static void showAdminAccount(){
        for (Person p: people){
            if (Arrays.equals(p.getRole(), new int[]{2})){
                System.out.println(p);
            }
        }
    }
}
