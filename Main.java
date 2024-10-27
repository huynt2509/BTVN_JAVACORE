package BTVN_B9_Techmaster;

import BTVN_B9_Techmaster.entities.Techmaster;
import BTVN_B9_Techmaster.service.TechmasterService;
import BTVN_B9_Techmaster.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tạo ra trung tâm --> nhập dữ liệu đầu vào
        Scanner scanner = new Scanner(System.in);
        TechmasterService techmasterService = new TechmasterService();
        Techmaster techmaster = techmasterService.inputInfor(scanner);
        Menu menu = new Menu();
        while (true) {
            menu.displayMenu(scanner, techmaster);
        }

    }
}
