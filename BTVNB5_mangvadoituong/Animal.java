package BTVN_B5.BTVNB5_mangvadoituong;

public class Animal {
    // Tạo thuộc tính cho đối tuợng Animal
    private String name;
    private int id;
    private String description;
    private boolean gender;

    // Tạo contructor

    public Animal(int id, String name, String description, boolean gender) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.gender = gender;
    }

    // Phương thức gọi ra thông tin đối tượng Animal
    public void printAnimal() {
        if (gender==true) {
            System.out.println("ID: " + id + "---" + "Name: " + name +"---"+ " Description: " + description + "---"+ " Gender: male");
        } else {
            System.out.println("ID: " + id + "---" + "Name: " + name +"---"+ " Description: " + description + "---"+ " Gender: female");
        }
    }
    //Getter
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isGender() {
        return gender;
    }

    // toString
    @Override
    public String toString() {
        return id + " " + name + " " + description + " " + gender;
    }
}
