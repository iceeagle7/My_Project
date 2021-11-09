package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient patient[] = new Patient[5];
        patient[0] = new Patient(11, "Kairat M", "Almaty", "87024671673", "bruised knee", "544-422");
        patient[1] = new Patient(15,"Ulan L","Shymkent","87084632562","bruised finger","124-567");
        patient[2] = new Patient(21,"Rustem S","Karaganda","87084645782","angina","789-741");
        patient[3] = new Patient(25,"Temirkhan Q","Aktau","87085682316","knee inflammation","755-722");
        patient[4] = new Patient(26,"Rahat E","Astana","87084425486","flu","222-111");

        System.out.println("Enter patient diagnosis: ");
        String a = sc.nextLine();
        for(int i=0;i< patient.length;i++){
            if(patient[i].getDiagnosis().equalsIgnoreCase(a)){
                System.out.println(patient[i].toString());
            }
        }
        System.out.println("Enter patient address: ");
        String b = sc.nextLine();
        for(int j=0;j< patient.length;j++){
            if(patient[j].getAddress().equalsIgnoreCase(b)){
                System.out.println(patient[j].toString());
            }
        }
    }
}