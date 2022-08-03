public class Droid {

    String name;
    int batteryLevel;

    public Droid(String droidName){
        name =  droidName;
        batteryLevel = 100;
    }

    public void performTask(String task){
        batteryLevel = batteryLevel - 10;
        System.out.println(name + " is performing task: " + task);
    }

    public void energyReport(){
        System.out.println(batteryLevel);
    }

    public String toString(){
        return "Hello, I'm the droid " + name;
    }

    public static void main(String[] args){
        Droid bot = new Droid("Tilin");
        System.out.println(bot);
        bot.performTask("dancing");
        bot.performTask("coding");
        bot.performTask("singing");
        bot.energyReport();
    }
}