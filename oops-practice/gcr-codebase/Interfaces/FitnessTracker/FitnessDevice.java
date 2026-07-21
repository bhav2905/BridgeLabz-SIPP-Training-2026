public class FitnessDevice implements ITrackable,IReotable,INotification{
    int steps;
    int calories;

    public FitnessDevice(int steps,int calories){
        this.steps=steps;
        this.calories=calories();
    }

    @Override
    public void logActivity(){
        System.out.println("-----------------------------------");
        System.out.println("Activity is logged");
        System.out.println("-----------------------------------");
        System.out.println("Steps"+steps);
        System.out.println("Calories Burned"+calories);
        System.out.println("-----------------------------------");
    }

    public void generateReport(){
        System.out.println("-----------------------------------");
        System.out.println("Firness Report");
        System.out.println("-----------------------------------");
        System.out.println("Total Steps"+steps);
        System.out.println("Calories Burned"+calories);
        System.out.println("-----------------------------------");
    }

    @Override
    public void sendAlert(){
        int reaminingSteps=5000-steps;
        if(steps<5000){
            System.out.println("Ypu need to walk more "+reaminingSteps+"steps");
        }else{

        }
    }
}