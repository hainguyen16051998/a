package animal;

public class Animal {
    public static int autoID = 0;
    private int id;
    private String name;
    private String species;
    private int age;
    private String sex;
    private String description;
    private String type;
    private String images;

    public Animal(String name, String species, int age, String sex, String description, String type, String images) {
        this.id = ++autoID;
        this.name = name;
        this.species = species;
        this.age = age;
        this.sex = sex;
        this.description = description;
        this.type = type;
        this.images = images;
    }

    public Animal() {

    }

    public static int getAutoID() {
        return autoID;
    }

    public static void setAutoID(int autoID) {
        Animal.autoID = autoID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", images='" + images + '\'' +
                '}';
    }

//    public void displayMenu(Scanner scanner, ArrayList<Animal> animals) {
//        System.out.print("Nh???p s??? l?????ng Pet mu???n th??m m???i: ");
//        int num;
//        try {
//            do {
//                num = Integer.parseInt(scanner.nextLine());
//                if (num > 0)
//                    break;
//                System.out.print("S??? l?????ng th?? c??ng ph???i l?? s??? d????ng, m???i nh???p l???i: ");
//            } while (true);
//        } catch (Exception e) {
//            System.out.println("L???i, nh???p l???i: ");
//            displayMenu(scanner, animals);
//            return;
//        }
//        for (int i = 0; i < num; i++) {
//            System.out.println("M???i nh???p t??n: ");
//            String name = scanner.nextLine();
//            System.out.println("M???i nh???p gi???ng: ");
//            String species = scanner.nextLine();
//            System.out.println("M???i nh???p  tu???i: ");
//            Integer age = Integer.parseInt(scanner.nextLine());
//            System.out.println("M???i nh???p gi???i t??nh: ");
//            String sex = scanner.nextLine();
//            System.out.println("M???i nh???p m?? t???: ");
//            String description = scanner.nextLine();
//            System.out.println("M???i nh???p TYPE: ");
//            System.out.println("1. Ch??");
//            System.out.println("2. M??o");
//            System.out.print("M???i ch???n: ");
//            int choice;
////            try {
//            do {
//                choice = Integer.parseInt(scanner.nextLine());
//                if (choice == 1 || choice == 2)
//                    break;
//                System.out.println("Ch???n sai, m???i ch???n l???i: ");
//            } while (true);
//            switch (choice) {
//                case 1:
//                    this.type = Type.DOG.value;
//                    break;
//                case 2:
//                    this.type = Type.CAT.value;
//                    break;
//            }
////
////            } catch (Exception e) {
////                System.out.println("Nh???p sai, nh???p l???i: ");
////
////            }
//            System.out.println("M???i nh???p ???nh: ");
//            String images = scanner.nextLine();
//            Animal animal = new Animal(name, species, age, sex, description, type, images);
//            animals.add(animal);
//        }
//        System.out.println(animals);
//
//    }
}

