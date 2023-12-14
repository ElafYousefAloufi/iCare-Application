package DesignPattern;
import CPIT252Project.Classes.User;
public class BMIFeature {
    User user;
    private double height;
    private double weight;
    private double BMI;
    private String BMIStatus;
    public BMIFeature(User user) {
        this.user = user;
    }
     public BMIFeature() { 
    }
    public void calculateBMI(double height, double weight) {
        this.weight = weight;
        this.height = height;
        this.BMI = (weight / (height * height));
    }
    public String BMI_Status() {
        if (BMI < 18.5) {
            BMIStatus = "Underweight";
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            BMIStatus = "Normal weight";
        } else if (BMI >= 25 && BMI <= 29.9) {
            BMIStatus = "Overweight";
        } else {
            BMIStatus = "Obesity";
        }
        return BMIStatus;
    }

    public String healthcare(String BMI_Status) {
        if (BMIStatus.equalsIgnoreCase("Underweight")) {
            return "Your BMI and body weight are low,\n you should consider gaining weight through\n"
                    + "\ngood diet and exercise habits, to increase your muscle mass";

        } else if (BMIStatus.equalsIgnoreCase("Normal weight")) {
            return "Your BMI considered an acceptable range, and is associated with good health.\n";
        } else if (BMIStatus.equalsIgnoreCase("Overweight")) {
            return "You are considered overweight and should finds ways to lower your weight,\n through diet and exercise.\n You are at increased risk for a variety of illnesses at your present weight.\n"
                    + " You should lose weight by changing your diet and exercising more.";
        } else {
            return "You are in a dangourse level!\n"
                    + " This indicates an unhealthy condition!\n your excess mass is putting you at risk for\n heart disease, diabetes, high blood pressure, gall bladder disease, circulation problems, and some cancers.\n"
                    + " \nYou should lose weight by changing your diet and exercising more.";
        }
    }

}
