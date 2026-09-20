package app;

import abstractfactory.GUIFactory;
import abstractfactory.MacOSFactory;
import abstractfactory.WindowsFactory;
import factorymethod.Logistics;
import factorymethod.RoadLogistics;
import factorymethod.SeaLogistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter delivery mode (ROAD or SEA): ");
        String deliveryMode = scanner.nextLine().trim().toUpperCase();

        System.out.print("Enter UI platform (WINDOWS or MACOS): ");
        String uiPlatform = scanner.nextLine().trim().toUpperCase();

        Logistics logistics;

        switch (deliveryMode) {
            case "ROAD":
                logistics = new RoadLogistics();
                break;
            case "SEA":
                logistics = new SeaLogistics();
                break;
            default:
                System.out.println("Unsupported delivery mode.");
                return;
        }

        GUIFactory guiFactory;

        switch (uiPlatform) {
            case "WINDOWS":
                guiFactory = new WindowsFactory();
                break;
            case "MACOS":
                guiFactory = new MacOSFactory();
                break;
            default:
                System.out.println("Unsupported UI platform.");
                return;
        }

        DeliveryApplication application =
                new DeliveryApplication(guiFactory, logistics);

        application.run(
                "laboratory equipment",
                "Aktau warehouse"
        );
    }
}