package OOP.Mission_2.Application;

import OOP.Mission_2.Account.ShowAccount;
import OOP.Mission_2.AirlineCompany.AirCompanyShow;
import OOP.Mission_2.CampingTours.CampingTourShow;
import OOP.Mission_2.Flora.FlowerShop;
import OOP.Mission_2.GameRoom.GameRoomShow;
import OOP.Mission_2.HomeDevice.HomeDeviceShow;
import OOP.Mission_2.Insurance.InsuranceShow;
import OOP.Mission_2.MobileCommunication.MobileCommunicationShow;
import OOP.Mission_2.Motocyclist.MotocyclistShow;
import OOP.Mission_2.NewYearGift.NewYearGiftShow;
import OOP.Mission_2.RecordingStudio.RecordingStudioShow;
import OOP.Mission_2.Scale.ScaleShow;
import OOP.Mission_2.Taxes.TaxesShow;
import OOP.Mission_2.TaxiStation.TaxiStationShow;
import OOP.Mission_2.Transport.TransportShow;
import OOP.Mission_2.Сhief.ChiefShow;
import OOP.Mission_2.СoffeeVan.CoffeeVanShow;
import OOP.Mission_2.Сredit.CreditShow;

import java.util.Scanner;

public class ConsolMenu {
    public  void Initialisation(){
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {

            System.out.println("Enter number: ");
            System.out.println("1-Flora ");
            System.out.println("2-NewYearGift ");
            System.out.println("3-HomeDevice ");
            System.out.println("4-Chief ");
            System.out.println("5-RecordingStudio ");
            System.out.println("6-Scale ");
            System.out.println("7-Motocyclist ");
            System.out.println("8-Transport ");
            System.out.println("9-AirlineCompany ");
            System.out.println("10-TaxiStation ");
            System.out.println("11-Insurance ");
            System.out.println("12-MobileCommunication ");
            System.out.println("13-CoffeeVan ");
            System.out.println("14-GameRoom ");
            System.out.println("15-Taxes ");
            System.out.println("16-Account ");
            System.out.println("17-CampingTour ");
            System.out.println("18-Credit ");
            try {
                int result = Integer.parseInt(sc.next());
                selectInit(result);
            }catch (Exception e) {
                end = true;
            }
        }    end = true;
    }
    public static void selectInit(int result){
        switch (result) {
            case 1: {
                FlowerShop flowerShop = new FlowerShop();
                flowerShop.FlowerShopInit();
            }  break;
            case 2: {
                NewYearGiftShow newYearGiftShow = new NewYearGiftShow();
                newYearGiftShow.NewYearPresentInit();
            }  break;
            case 3: {
                HomeDeviceShow homeDeviceShow = new HomeDeviceShow();
                homeDeviceShow.HomeDeviceInit();
            }  break;
            case 4: {
                ChiefShow chiefShow = new ChiefShow();
                chiefShow.ChiefInit();
            }  break;
            case 5: {
                RecordingStudioShow recordingStudioShow = new RecordingStudioShow();
                recordingStudioShow.RecordingStudioInit();
            }  break;
            case 6: {
                ScaleShow scaleShow = new ScaleShow();
                scaleShow.ScaleInit();
            }  break;
            case 7: {
                MotocyclistShow motocyclistShow = new MotocyclistShow();
                motocyclistShow.MotocyclistInit();
            }  break;
            case 8: {
                TransportShow transportShow = new TransportShow();
                transportShow.TransportInit();
            }  break;
            case 9: {
                AirCompanyShow airCompanyShow = new AirCompanyShow();
                airCompanyShow.AirCompantInit();
            }  break;
            case 10: {
                TaxiStationShow taxiStationShow = new TaxiStationShow();
                taxiStationShow.TaxiStationInit();
            }  break;
            case 11: {
                InsuranceShow insuranceShow = new InsuranceShow();
                insuranceShow.InsuranceInit();
            }  break;
            case 12 : {
                MobileCommunicationShow mobileCommunicationShow = new MobileCommunicationShow();
               mobileCommunicationShow.MobileCommunicationInit();
            }  break;
            case 13: {
                CoffeeVanShow coffeeVanShow = new CoffeeVanShow();
               coffeeVanShow.CoffeeVanInit();
            }  break;
            case 14: {
                GameRoomShow gameRoomShow = new GameRoomShow();
                gameRoomShow.GameRoomInit();
            }  break;
            case 15 : {
                TaxesShow taxesShow = new TaxesShow();
                taxesShow.TaxesInit();
            }  break;
            case 16: {
                ShowAccount showAccount = new ShowAccount();
                showAccount.AccountInit();
            }  break;
            case 17 : {
                CampingTourShow campingTourShow = new CampingTourShow();
                campingTourShow.CampingTourInit();
            }  break;
            case 18: {
                CreditShow creditShow = new CreditShow();
                creditShow.CreditInit();
            }  break;
            default: {
                System.out.println("Enter right number ");
            }
        }

    }
}
