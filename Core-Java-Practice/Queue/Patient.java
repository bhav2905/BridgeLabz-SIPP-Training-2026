import java.util.PriorityQueue;

class Patient {

    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public String toString() {

        return name + " Priority : " + priority;
    }
}

public class HospitalTriage {

    PriorityQueue<Patient> queue =
            new PriorityQueue<>((a, b) -> a.priority - b.priority);

    public void admitPatient(Patient patient) {

        queue.offer(patient);
    }

    public Patient callNextPatient() {

        return queue.poll();
    }

    public static void main(String[] args) {

        HospitalTriage hospital = new HospitalTriage();

        hospital.admitPatient(new Patient(3, "Rahul"));
        hospital.admitPatient(new Patient(1, "Shivam"));
        hospital.admitPatient(new Patient(2, "Aman"));

        while (!hospital.queue.isEmpty()) {

            System.out.println(hospital.callNextPatient());
        }
    }
}